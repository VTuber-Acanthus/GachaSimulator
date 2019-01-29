package logic;

/**
*
* @author アカンサス
* @version 1.0
*
*/

public class Tanpatsu {
	public static void main(String[]args) {

		//それぞれのレアリティの呼称を指定する。
		String aName = "SSR";
		String bName = "SR";
		String cName = "R";
		double aKakuritsu = 3.0;
		double bKakuritsu = 12.0;

		Gacha gacha = new Gacha();
		String result = gacha.gacha(aKakuritsu,bKakuritsu);
		switch(result) {
		case "A":
			result = aName;
			break;
		case "B":
			result = bName;
			break;
		case "C":
			result = cName;
			break;
		}
		OutputLogic.output(result);
	}
}
