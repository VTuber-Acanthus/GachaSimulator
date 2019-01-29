package logic;

import java.util.ArrayList;

/**
*
* @author アカンサス
* @version 1.0
*
*/

public class OutputLogic {
	//単発ガチャ用
	static void output(String result) {
		System.out.println("単発ガチャモード");
		System.out.println("結果 : " + result);
	}

	//回数指定ガチャ用
	static void output(int kaisuu, int stone, double kakaku, ArrayList<String> resultList,
			String aName, String bName, String cName) {
		String rarity = null;
		for(int i = 0; i < resultList.size(); i++) {
			switch(resultList.get(i)){
			case "A":
				rarity = aName;
				break;
			case "B":
				rarity = bName;
				break;
			case "C":
				rarity = cName;
				break;
			}
			System.out.println(rarity);
		}
		System.out.println("抽選回数       : " + kaisuu + "回");
		System.out.println("消費した石の数 : " + (kaisuu * stone) + "個");
		System.out.println("金額           : " + (int)(kaisuu * stone * kakaku) + "円");
	}

	//SSR出るまでガチャ用
	static void output(int kaisuu, int stone, double kakaku, String aName){
		System.out.println(kaisuu + "回目で" + aName + "当選！");
		System.out.println("消費した石の数 : " + (kaisuu * stone) + "個");
		System.out.println("金額           : " + (int)(kaisuu * stone * kakaku) + "円");
	}

	//SSR出るまで10連ガチャ用
	static void output(String syurui, int kaisuu, int stone, double kakaku, String aName){
		//10連ガチャのため、消費する石の数と金額を10倍してつじつまを合わせる。
		int i = 10;
		System.out.println(syurui + " " + kaisuu + "回目で" + aName + "当選！");
		System.out.println("消費した石の数 : " + (kaisuu * i * stone) + "個");
		System.out.println("金額           : " + (int)(kaisuu * i * stone * kakaku) + "円");
	}

	//DCGガチャ用
	static void output(int kaisuu, int stone, double kakaku, String aName, int a, String bName, int b,
			String cName, int c, String dName, int d) {
		System.out.println("パックを開けた回数 : " + kaisuu + "回");
		System.out.println("合計取得枚数       : " + (a + b + c + d) + "枚");
		System.out.println("  内訳");
		System.out.println("    " + aName + " : " + a + "枚");
		System.out.println("    " + bName + " : " + b + "枚");
		System.out.println("    " + cName + " : " + c + "枚");
		System.out.println("    " + dName + " : " + d + "枚");
		System.out.println("消費した石の数     : " + kaisuu * stone + "個");
		System.out.println("金額               : " + (int)(kaisuu * stone * kakaku) + "円");
	}


}
