package IdolTrainning;

import java.util.Scanner;

public class IdolTrainningMain {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		char menu = 0;
		IdolTrainningManager itm = new IdolTrainningManager();
		Hp hp = new Hp();
		itm.start();
		itm.getTitle();
		do {

			itm.event();
			System.out.print("   D-Day : " + itm.dDay + "     ");
			itm.viewHp();
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║ 1 : 보컬트레이닝    i : 정보       ║");
			System.out.println("║ 2 : 댄스트레이닝    3 : 운동       ║");
			System.out.println("║ 4 : 휴식          5 : 잠자기  ㅤ  ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println();
			menu = scan.next().charAt(0);
			switch (menu) {
			case '1':
				itm.vocalTrinning();
				break;
			case '2':
				itm.danceTrinning();
				break;
			case '3':
				itm.helth();
				break;
			case '4':
				itm.breaktime();
				break;
			case '5':
				itm.sleep();
				break;
			case '6':
				break;
			case 'i':
				itm.printInfo();
			default:
			}
		} while (itm.dDay != 0);
		{
			itm.showMusic();
			itm.ending();
		}
	}

}