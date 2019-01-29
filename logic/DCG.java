package logic;

/**
*
* @author アカンサス
* @version 1.0
*
*/

/*
 * 参考資料 各DCGの情報
 *
 * -Shadowverse-
 * 1回あたり100クリスタル
 * 1クリスタル≒2.0円
 * LEGEND 1.5%
 * GOLD   6.0%
 * SILVER 25%
 * BRONZE 67.5%
 * SILVER以上確定枠が1枠存在
 *
 * -War Of Brains-
 * パック単位で課金(ガチャ1回につき1クリスタルという扱い)
 * 1パック = 240円
 * 8パック = 1800円
 * 1ボックス(24パック) = 4800円
 * GAME CHANGER 0.5%
 * SUPER RARE   6.0%
 * RARE        26.0%
 * COMMON      67.5%
 * 確定枠は無し
 *
 */



public class DCG {
	public static void main(String[] args) {

		//ガチャを回す任意の回数を格納する。
		int kaisuu = 30;
		//それぞれのレアリティの呼称を指定する。
		String aName = "GAME CHANGER";
		String bName = "SUPER RARE";
		String cName = "RARE";
		String dName = "COMMON";
		//各レアリティの当選確率を格納する。
		double aKakuritsu = 0.5;
		double bKakuritsu = 6;
		double cKakuritsu = 25;
		//Silver以上確定枠の数を格納する。
		int kakuteiwaku = 0;
		//1回のガチャで消費する石の数を格納する。
		int stone = 1;
		//石1個当たりの価格を格納する。
		double kakaku = 240.0;
		//カードのレアリティを格納する。これはGachaメソッドから戻される値。
		String value;
		//1パック当たりの排出枚数を格納する。
		int maisuu = 7;
		//回した回数を格納する。
		int genzaiKaisuu;
		//Aが当たった回数を格納する。
		int a = 0;
		//Bが当たった回数を格納する。
		int b = 0;
		//Cが当たった回数を格納する。
		int c = 0;
		//Dが当たった回数を格納する。
		int d = 0;

		//指定したパック数分繰り返す
		for(genzaiKaisuu = 0; genzaiKaisuu < kaisuu; genzaiKaisuu++) {
			//パックから引いたカードの枚数を格納する。1パック分引き終えるたびにリセット。
			int cardCounter;
			//1パック分-確定枠分のカードを引く
			for(cardCounter = 0; cardCounter < maisuu - kakuteiwaku; cardCounter++) {
				Gacha gacha = new Gacha();
				value = gacha.gacha(aKakuritsu, bKakuritsu, cKakuritsu);
				//引いたカードをレアリティごとに分類し、枚数を数える。
				switch(value) {
				case "A":
					a++;
					break;
				case "B":
					b++;
					break;
				case "C":
					c++;
					break;
				case "D":
					d++;
					break;
				}
			}

			//Silver以上確定枠分のカードを引く
			for(int i = 0; i < kakuteiwaku; i++) {
				Gacha gacha = new Gacha();
				value = gacha.gacha(aKakuritsu, bKakuritsu);

				switch(value) {
				case "A":
					a++;
					break;
				case "B":
					b++;
					break;
				case "C":
					c++;
					break;
				}
			}
		}

		OutputLogic.output(kaisuu, stone, kakaku, aName, a, bName, b, cName, c, dName, d);
	}
}
