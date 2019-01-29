package logic;

import java.util.ArrayList;

/**
*
* @author アカンサス
* @version 1.0
*
*/

public class Zyuren {
	public static void main(String[] args) {
		//それぞれのレアリティの呼称を指定する。
		String aName = "SSR";
		String bName = "SR";
		String cName = "R";
		//SSR当選確率3％、SR当選確率12％
		double aKakuritsu = 3.0;
		double bKakuritsu = 12.0;
		//1回のガチャで消費する石の数を格納する。デレステの場合は1回あたり250個。
		int stone = 250;
		//石1個当たりの価格を格納する。デレステの場合は1個当たり1.2円。
		double kakaku = 1.2;
		//カードのレアリティを格納する。これはGachaメソッドから戻される値。
		String value;
		//SR以上確定枠の数を格納する。デレステの場合は10連につき1枠。
		int kakuteiwaku = 1;
		//〇連ガチャの〇に当てはまる数字を格納する。今回は10連なので10を格納している。
		int kaisuu = 10;
		//実際に回した回数を格納する。
		int genzaiKaisuu = 0;
		//ガチャ結果を格納するリスト
		ArrayList<String> resultList = new ArrayList<>();

		for(genzaiKaisuu = 0; genzaiKaisuu < kaisuu - kakuteiwaku; genzaiKaisuu++) {
			Gacha gacha = new Gacha();
			value = gacha.gacha(aKakuritsu, bKakuritsu);
			resultList.add(value);
		}

		//確定枠の抽選
		for(genzaiKaisuu = kaisuu - kakuteiwaku; genzaiKaisuu < kaisuu; genzaiKaisuu++) {
			Gacha gacha = new Gacha();
			value = gacha.gacha(aKakuritsu);
			resultList.add(value);
		}

		OutputLogic.output(kaisuu, stone, kakaku, resultList, aName, bName, cName);
	}
}
