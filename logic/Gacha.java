package logic;

/**
*
* @author アカンサス
* @version 1.0
* @return ガチャを回した結果
*
*/

//ガチャを回すロジック
public class Gacha {

	//ガチャ（レアリティ：2種類）
		public String gacha(double aKakuritsu) {
			//ガチャの確率はパーセント表記だが、本プログラムではパーミルでシミュレートするため、
			//つじつまを合わせるために10倍する。
			int i = 10;
			aKakuritsu = aKakuritsu * i;
			//手に入れたカードのレアリティを格納するための変数
			String rarity = null;
			//乱数生成
			int random = (int)(Math.random() * 1000);

			//レアリティ判定
			//乱数の値がSSRで定義された値以下ならSSR当選と判定する。
			if (random <= aKakuritsu) {
					rarity = "A";
				//どちらにも当てはまらなかった場合、R当選と判定する。
				}else{
					rarity = "B";
				}
				return(rarity);
		}

	//ガチャ（レアリティ：3種類）
	public String gacha(double aKakuritsu, double bKakuritsu) {
		//ガチャの確率はパーセント表記だが、本プログラムではパーミルでシミュレートするため、
		//つじつまを合わせるために10倍する。
		int i = 10;
		aKakuritsu = aKakuritsu * i;
		bKakuritsu = bKakuritsu * i;
		//手に入れたカードのレアリティを格納するための変数
		String rarity = null;
		//乱数生成
		int random = (int)(Math.random() * 1000);
		//レアリティ判定
		if (random <= aKakuritsu) {
				rarity = "A";
			}else if(random <= (aKakuritsu+bKakuritsu)) {
				rarity = "B";
			//どちらにも当てはまらなかった場合、R当選と判定する。
			}else{
				rarity = "C";
			}
			return(rarity);
	}

	//ガチャ（レアリティ：4種類）
	public String gacha(double aKakuritsu, double bKakuritsu, double cKakuritsu) {
		//ガチャの確率はパーセント表記だが、本プログラムではパーミルでシミュレートするため、
		//つじつまを合わせるために10倍する。
		int i = 10;
		aKakuritsu = aKakuritsu * i;
		bKakuritsu = bKakuritsu * i;
		cKakuritsu = cKakuritsu * i;
		//手に入れたカードのレアリティを格納するための変数
		String rarity = null;
		//乱数生成
		int random = (int)(Math.random() * 1000);
		if (random <= aKakuritsu) {
			rarity = "A";
		}else if(random <= (aKakuritsu + bKakuritsu)) {
			rarity = "B";
		}else if(random <= (aKakuritsu + bKakuritsu + cKakuritsu)) {
			rarity = "C";
		}else{
			rarity = "D";
		}
		return(rarity);
	}
}
