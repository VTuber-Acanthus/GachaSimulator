package logic;

/**
*
* @author アカンサス
* @version 1.0
*
*/

public class DerumadeGacha {
	public static void main(String[] args) {
		//最高レアリティの呼称を指定する。
		String aName = "SSR";
		//SSR当選確率3％、SR当選確率12％
		double aKakuritsu = 3.0;
		double bKakuritsu = 12.0;
		//1回のガチャで消費する石の数を格納する。デレステの場合は1回あたり250個。
		int stone = 250;
		//石1個当たりの価格を格納する。デレステの場合は1個当たり1.2円。
		double kakaku = 1.2;
		//カードのレアリティを格納する。これはGachaメソッドから戻される値。
		String value = "syokichi";
		//ガチャを回した回数を格納する。
		int tanpatsuKaisuu;

		for(tanpatsuKaisuu = 0; !(value.equals("A")); tanpatsuKaisuu++) {
			Gacha gacha = new Gacha();
			value = gacha.gacha(aKakuritsu, bKakuritsu);
		}

		OutputLogic.output(tanpatsuKaisuu, stone, kakaku, aName);
	}
}
