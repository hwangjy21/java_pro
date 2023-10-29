package IdolTrainning;

import java.lang.reflect.Array;
import java.util.Scanner;

public class IdolTrainningManager {
	Scanner scan = new Scanner(System.in);
	Human hu = new Human();
	music ms = new music();
	int cnt = 0;
	int cnt2 = 0;
	int eventcnt = 0;
	int vcnt = 0;
	int dcnt = 0;
	int dDay = 10;
	Hp hp = new Hp();
	String titles;
	String arr[] = { "솔로", "아이돌", "보컬트레이너", "댄스트레이너", "백수" };

	public void start() throws Exception {
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("연습생 키우기를 시작합니다 ~!");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("당신의 이름을 입력해주세요");
		String n = scan.next();
		hu.setName(n);
		int a = 18;
		hu.setAge(a);
		hu.height = (int) ((Math.random() * 30) + 160);
		hu.vocalStat = (int) ((Math.random() * 30) + 1);
//		hu.danceStat = (int) ((Math.random() * 30) + 1);
		hu.danceStat = 30;

		System.out.println("연습생 생성 중");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("연습생 이름 : " + hu.getName());
		System.out.println("연습생 나이 : " + hu.getAge());
		System.out.println("연습생 키 : " + hu.getHeight());
		System.out.println("연습생 노래스탯 : " + hu.getVocalStat());
		System.out.println("연습생 춤스탯" + hu.getDanceStat());
		System.out.println();
		if (hu.vocalStat >= 28) {
			if (hu.vocalStat >= 28 && hu.danceStat >= 28) {
				print();
				System.out.println();
				System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

				System.out.println("축하합니다. 당신은 보컬 춤 천재입니다.");
				System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

				hu.title.add("다재다능");
				System.out.println("업적 다재다능을 획득하셨습니다.");
			} else {
				print();
				System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
				System.out.println("축하합니다 .당신은 보컬 천재입니다.");
				System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

				hu.title.add("보컬 천재");
				System.out.println("");
			}
		} else if (hu.danceStat >= 28) {
			print();
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("축하합니다. 당신은 댄싱 천재 입니다.");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");

			hu.title.add("댄싱 천재");
			System.out.println();
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void vocalTrinning() {
		int vstat = (int) (Math.random() * 3);
		int vstat1 = (int) (Math.random() * 3);
		if (hp.getHp() >= 2) {
			System.out.println("노래 연습~!~!!");
			System.out.println(
					"\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⣠⠔⠒⠢⣀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀ ⠀⢰⠙⢋⠒⣙⠋⡆⠀⠀ ⠀\n" + "⠀⠀   ⣸⣈⣑⣉⣚⣁⣇⠀⠀\n"
							+ "⠀⠀  ⢶⡇⠀⠀⠀⠀⠀⢸⡶⠀\n" + "⠀⠀  ⢸⢱⠒⠒⠒⠒⠒⡎⡇  ⠀\n" + "⠀⠀⠀ ⢸⢸⠀⠀⠀⠀⢀⢇⠇⠀⠀⠀\n" + "⠀⠀⠀⠀ ⠳⣕⠦⠤⢔⣪⠞⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠈⠉⣿⠉⠁⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢀⣶⣶⣶⣿⣶⣶⣦⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⣠⢴⠒⠦⣄⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⡀⠀⠀⢰⠙⢯⠖⣽⡛⡆⠀⠀⡀⠀⠀\n"
					+ "⠀⠀⣼⢣⡄⠀⣸⣉⣓⣋⣚⣃⣇⠀⣤⢹⡄⠀\n" + "⠀⠀⣿⢸⠠⢶⡇⠀⠀⠀⠀⠀⢸⡶⢸⠎⡇⠀\n" + "⠀⠀⢻⡘⠇⢸⢹⠛⠛⠛⠛⠛⡏⡇⠾⣸⠇⠀\n" + "⠀⠀⠀⠁⠀⢸⣸⡀⠀⠀⠀⢀⣷⡇⠀⠉⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠈⠳⣕⡦⠤⢴⣫⠞⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠈⠉⣿⠉⠁⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⢀⣶⣶⣶⣿⣶⣶⣶⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀\n"
					+ "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(
					"\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⣠⠔⠒⠢⣀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀ ⠀⢰⠙⢋⠒⣙⠋⡆⠀⠀ ⠀\n" + "⠀⠀   ⣸⣈⣑⣉⣚⣁⣇⠀⠀\n"
							+ "⠀⠀  ⢶⡇⠀⠀⠀⠀⠀⢸⡶⠀\n" + "⠀⠀  ⢸⢱⠒⠒⠒⠒⠒⡎⡇  ⠀\n" + "⠀⠀⠀ ⢸⢸⠀⠀⠀⠀⢀⢇⠇⠀⠀⠀\n" + "⠀⠀⠀⠀ ⠳⣕⠦⠤⢔⣪⠞⠀⠀⠀⠀⠀\n"
							+ "⠀⠀⠀⠀⠀⠀⠈⠉⣿⠉⠁⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢀⣶⣶⣶⣿⣶⣶⣦⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⣠⢴⠒⠦⣄⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⡀⠀⠀⢰⠙⢯⠖⣽⡛⡆⠀⠀⡀⠀⠀\n"
					+ "⠀⠀⣼⢣⡄⠀⣸⣉⣓⣋⣚⣃⣇⠀⣤⢹⡄⠀\n" + "⠀⠀⣿⢸⠠⢶⡇⠀⠀⠀⠀⠀⢸⡶⢸⠎⡇⠀\n" + "⠀⠀⢻⡘⠇⢸⢹⠛⠛⠛⠛⠛⡏⡇⠾⣸⠇⠀\n" + "⠀⠀⠀⠁⠀⢸⣸⡀⠀⠀⠀⢀⣷⡇⠀⠉⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠈⠳⣕⡦⠤⢴⣫⠞⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠈⠉⣿⠉⠁⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⢀⣶⣶⣶⣿⣶⣶⣶⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀\n"
					+ "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (int i = 0; i < hu.title.size(); i++) {
				if (hu.title.get(i).equals("다재다능") || hu.title.get(i).equals("보컬 천재")) {
					hu.vocalStat += vstat + vstat1;
					System.out.println("노래실력이" + (vstat + vstat1) + "증가했다!");
				} else {
					hu.vocalStat += vstat;
					System.out.println("노래실력이" + vstat + "증가했다!");
				}
			}

			hp.hhp--;
		} else {

			hp.myHp();
			dDay -= 1;
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		vcnt++;
	}

	public void danceTrinning() {
		int dstat = (int) (Math.random() * 3);
		int dstat1 = (int) (Math.random() * 3);
		System.out.println("춤 연습~!~!!");
		if (hp.getHp() >= 2) {
			System.out.println("\n" + "⠀⠀⠀⢠⣄⠀⠀⣠⣤⡀⠀⠀⢀⣀⣀⡀⠀⠀\n" + "⠀⠀⠀⠈⢿⣆⢺⣿⣿⠇⠀⢀⣸⠏⣹⡿⠀⠀\n" + "⠀⠀⠀⠀⠀⠹⣷⣾⣶⣄⠀⠈⠋⠀⠙⠁⠀⠀\n"
					+ "⠀⣀⣤⡀⠀⠀⣿⣿⣿⡿⣷⡄⠀⠀⠀⠀⠀⠀\n" + "⠈⣯⢠⣷⠀⠀⣿⣿⣿⣇⠙⣿⡆⠀⠀⠀⠀⠀\n" + "⠘⠿⠈⠁⠀⢠⣿⠋⠉⢻⣦⡉⠁⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠸⣿⡄⠀⠀⢻⣷⡀⠀⠀⠀⠀⠀\n"
					+ "⣴⣶⣶⣶⣶⣶⣿⣿⣶⣶⣶⣿⣷⣶⣶⣶⣶⣦\n" + "⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⢀⣀⣀⡀⠀⠀⢀⣤⣄⠀⠀⣠⡄⠀⠀⠀\n" + "⠀⠀⢿⣏⠹⣇⡀⠀⠸⣿⣿⡗⣰⡿⠁⠀⠀⠀\n" + "⠀⠀⠈⠋⠀⠙⠁⠀⣠⣶⣷⣾⠏⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⢠⣾⢿⣿⣿⣿⠀⠀⢀⣤⣀⠀\n" + "⠀⠀⠀⠀⠀⢰⣿⠋⣸⣿⣿⣿⠀⠀⣾⡄⣽⠁\n" + "⠀⠀⠀⠀⠀⠈⢉⣴⡟⠉⠙⣿⡄⠀⠈⠁⠿⠃\n" + "⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⢠⣿⠇⠀⠀⠀⠀⠀\n"
					+ "⣴⣶⣶⣶⣶⣾⣿⣶⣶⣶⣿⣿⣶⣶⣶⣶⣶⣦\n" + "⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⠀⢠⣄⠀⠀⣠⣤⡀⠀⠀⢀⣀⣀⡀⠀⠀\n" + "⠀⠀⠀⠈⢿⣆⢺⣿⣿⠇⠀⢀⣸⠏⣹⡿⠀⠀\n" + "⠀⠀⠀⠀⠀⠹⣷⣾⣶⣄⠀⠈⠋⠀⠙⠁⠀⠀\n"
					+ "⠀⣀⣤⡀⠀⠀⣿⣿⣿⡿⣷⡄⠀⠀⠀⠀⠀⠀\n" + "⠈⣯⢠⣷⠀⠀⣿⣿⣿⣇⠙⣿⡆⠀⠀⠀⠀⠀\n" + "⠘⠿⠈⠁⠀⢠⣿⠋⠉⢻⣦⡉⠁⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠸⣿⡄⠀⠀⢻⣷⡀⠀⠀⠀⠀⠀\n"
					+ "⣴⣶⣶⣶⣶⣶⣿⣿⣶⣶⣶⣿⣷⣶⣶⣶⣶⣦\n" + "⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⢀⣀⣀⡀⠀⠀⢀⣤⣄⠀⠀⣠⡄⠀⠀⠀\n" + "⠀⠀⢿⣏⠹⣇⡀⠀⠸⣿⣿⡗⣰⡿⠁⠀⠀⠀\n" + "⠀⠀⠈⠋⠀⠙⠁⠀⣠⣶⣷⣾⠏⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⢠⣾⢿⣿⣿⣿⠀⠀⢀⣤⣀⠀\n" + "⠀⠀⠀⠀⠀⢰⣿⠋⣸⣿⣿⣿⠀⠀⣾⡄⣽⠁\n" + "⠀⠀⠀⠀⠀⠈⢉⣴⡟⠉⠙⣿⡄⠀⠈⠁⠿⠃\n" + "⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⢠⣿⠇⠀⠀⠀⠀⠀\n"
					+ "⣴⣶⣶⣶⣶⣾⣿⣶⣶⣶⣿⣿⣶⣶⣶⣶⣶⣦\n" + "⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int i = 0; i < hu.title.size(); i++) {
				if (hu.title.get(i).equals("다재다능") || hu.title.get(i).equals("댄싱 천재")) {
					hu.danceStat += dstat + dstat1;
					System.out.println("춤 실력이" + (dstat + dstat1) + "증가했다!");
				} else {
					hu.danceStat += dstat;
					System.out.println("춤 실력이" + dstat + "증가했다!");
				}
			}

			hp.hhp--;
		} else {

			hp.myHp();

		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			dDay -= 1;
		}
		dcnt++;
	}

	public void helth() {
		if (cnt2 == 0) {
			System.out.println("운동~!~!");

			System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢀⣠⣶⡀⠀⠀⠀⢸⡁⠀⡷⠀⠀⠀⠀⣶⣄⣀\n"
					+ "⣿⣿⣿⣷⣓⣦⡤⠞⠛⠛⠓⢦⣴⣞⣦⣿⣿⣿\n" + "⠿⣿⣿⠇⠙⠢⢴⡆⠀⠀⢰⠦⠔⠋⠀⣿⣿⠿\n" + "⠀⠈⠉⠀⢠⡶⠶⠇⠀⠀⠸⠴⠶⡄⠀⠉⠁⠀\n" + "⠀⠀⠀⠀⠘⡇⠶⢤⣀⣀⡤⢶⢰⡇⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⣧⣰⠀⠀⠀⠀⢈⣸⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⣤⣾⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣤⠀\n" + "⠀⣿⣿⣿⢺⡻⡖⠒⣒⢒⡒⠒⡟⡷⢻⣿⣿⠀\n" + "⠀⠈⠻⠋⠀⢃⠳⣰⣄⣀⣇⡼⢹⠁⠘⠟⠉⠀\n"
					+ "⠀⠀⠀⠀⠀⠈⠳⣌⠉⠉⢩⠖⠁⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⢰⠃⠞⠙⡈⢧⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⣿⢸⠀⠀⣼⢸⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠙⠞⠀⠀⠻⠜⠀⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢀⣠⣶⡀⠀⠀⠀⢸⡁⠀⡷⠀⠀⠀⠀⣶⣄⣀\n"
					+ "⣿⣿⣿⣷⣓⣦⡤⠞⠛⠛⠓⢦⣴⣞⣦⣿⣿⣿\n" + "⠿⣿⣿⠇⠙⠢⢴⡆⠀⠀⢰⠦⠔⠋⠀⣿⣿⠿\n" + "⠀⠈⠉⠀⢠⡶⠶⠇⠀⠀⠸⠴⠶⡄⠀⠉⠁⠀\n" + "⠀⠀⠀⠀⠘⡇⠶⢤⣀⣀⡤⢶⢰⡇⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⣧⣰⠀⠀⠀⠀⢈⣸⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "⠀⣤⣾⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣤⠀\n" + "⠀⣿⣿⣿⢺⡻⡖⠒⣒⢒⡒⠒⡟⡷⢻⣿⣿⠀\n" + "⠀⠈⠻⠋⠀⢃⠳⣰⣄⣀⣇⡼⢹⠁⠘⠟⠉⠀\n"
					+ "⠀⠀⠀⠀⠀⠈⠳⣌⠉⠉⢩⠖⠁⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⢰⠃⠞⠙⡈⢧⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⣿⢸⠀⠀⣼⢸⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠙⠞⠀⠀⠻⠜⠀⠀⠀⠀⠀⠀\n" + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (hp.getHp() >= 2) {
				cnt++;
				cnt2++;
				hp.hhp--;
				System.out.println(hp.hhp);
				if (cnt == 2) {

					hu.hp++;
					cnt = 0;
					System.out.println("최대 체력이 1 증가했다. 최대체력 : " + hu.getHp());

				}
			} else {

				hp.myHp();

			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		} else {
			System.out.println("하루에 운동 두 번은 무리야...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void breaktime() {
		System.out.println("아아 편하다~~");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣀⢀⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡏⣿⣿⣿⣿⣀⡀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⣙⡿⠟⠃⣿⣿⣷⣦⡀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢀⣴⣶⣶⣦⣴⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠈⢿⣿⣭⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⣾⣿⣿⣿⣏⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢸⣿⡇⠈⠻⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠈⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		hu.condition = 3;
		hp.hhp--;
	}

	public void sleep() {
		System.out.println("오늘은 이만 자야지");
		System.out.print("\n" + "⠀⠀⠀⠀⠀⣀⣤⣤⣶⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⢀⣴⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⢠⣾⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" + "⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠘⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠘⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠈⠙⠛⠿⠿⠿⠿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "");
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("⠀⠀⠀⠀⠀⣀⣤⣤⣶⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⢀⣴⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⢠⣾⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠛⣿⠟⠁⠀⠀⠀⠀⠀⠀\n"
				+ "⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠾⠷⠶⠄⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠘⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠘⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠈⠙⠛⠿⠿⠿⠿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.print("\n" + "⠀⠀⠀⠀⠀⣀⣤⣤⣶⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⢀⣴⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⢠⣾⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢛⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣁⣀⠀⠀⠀\n" + "⢸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠛⣿⠟⠁⠀⠙⠛⠛⠛⠀⠀⠀⠀⠀\n"
				+ "⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠾⠷⠶⠄⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠘⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠘⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠈⠙⠛⠿⠿⠿⠿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "");
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n" + "⠀⠀⠀⠀⠀⣀⣤⣤⣶⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⢀⣴⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⢠⣾⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢛⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣁⣀⠀⣤⣤⣤⣤⣤⠀⠀⠀\n"
				+ "⢸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠛⣿⠟⠁⠀⠙⠛⠛⠛⠀⠀⢠⣾⠟⠁⠀⠀⠀\n" + "⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠾⠷⠶⠄⠀⠀⠀⠀⠀⠀⣰⣿⣃⣀⣀⠀⠀⠀\n"
				+ "⠘⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀\n" + "⠀⠘⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠈⠙⠛⠿⠿⠿⠿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "");
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		hp.hhp = hu.getHp();
		dDay--;
		eventcnt = 0;
		cnt2 = 0;

	}

	public void printInfo() {
		System.out.println("키 : " + hu.getHeight());
		System.out.println("노래 실력 : " + hu.getVocalStat());
		System.out.println("춤 실력 : " + hu.getDanceStat());
		System.out.println("체력 : " + hu.getHp());
		System.out.println("컨디션 : " + hu.getCondition());
		System.out.println("지금까지 이룬 업적 : " + hu.getTitle());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getTitle() throws Exception {
		int getMaxHeight = 190; // 최대 키
		int getMinHeight = 160; // 최소 키
		int getMaxHp = 10; // 최대 체력
		int getMaxvocalStat = 100; // 최대 노래실력
		int getMaxDanceStat = 100; // 최대 춤실력

		String titles;

		if (hu.getHeight() >= getMaxHeight) {
			print();
			System.out.println("가장 큰 키 달성 , 가수계의 서장훈 획득");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			titles = ("가수계의 서장훈");
			hu.title.add(titles);
		}
		if (hu.getHeight() <= getMinHeight) {
			print();
			System.out.println("가장 작은 키 달성 , 작은거인 골리앗 칭호 획득");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			titles = ("작은거인 골리앗");
			hu.title.add(titles);
		}
		if (hu.getHp() > getMaxHp) {
			print();
			System.out.println("체력 max 달성 , gym종국 칭호 획득");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			titles = ("gym종국");
			hu.title.add(titles);
		}
		if (hu.getVocalStat() >= getMaxvocalStat) {
			print();
			System.out.println("노래실력 max 달성 , 스푼라디오음악대장 칭호 획득");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			titles = ("스푼라디오음악대장");
			Thread.sleep(1000);
			hu.title.add(titles);
		}
		if (hu.getDanceStat() >= getMaxDanceStat) {
			print();
			Thread.sleep(1000);
			System.out.println("춤 실력 max 달성 , 방구석 틱톡커 칭호 획득");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			titles = ("방구석 틱톡커 ");
			hu.title.add(titles);
		}
	}

	public void viewHp() {
		System.out.print("현재체력 : ");
		for (int i = 0; i < hp.hhp; i++) {
			System.out.print("♡");

		}
		System.out.println();
	}

	public void ending() {
		int select = -1;
		if (hu.getVocalStat() >= 60 && hu.getDanceStat() >= 60 && ms.test == true) {
			System.out.println("솔로로 데뷔할 것이면 '0', 아이돌 그룹으로 데뷔할 것이면 '1'을 눌러주세요.");
			select = scan.nextInt();
			if (select > 2) {
				System.out.println("다시 눌러주세요.");
			}
		}

		else if (hu.getVocalStat() >= 60 && ms.test == true) {
			System.out.println(arr[0] + "로 데뷔했습니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (hu.getVocalStat() >= 100) {
				System.out.println(hu.getName() + "은 신인 아이돌로 데뷔한 후 지속적인 업적과 장인 정신으로 폭발적 인기를 얻었다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그의 음악은 대중들의 마음을 사로잡아 전설적인 가수로 기리는 이름이 되었다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("주인공은 시대를 초월한 명곡을 발표하고 다양한 음악 장르를 소화하며 음악계의 아이콘으로 자리매김했다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그는 매 퍼포먼스마다 관객들을 감동시키고, 감정을 전하는 예술가로서의 면모를 발휘하여 전 세계의 사람들에게 영감을 주었다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(" 주인공은 다른 세대에도 인정받는 전설급 가수로서 자리를 굳혔다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("안녕하세요. " + hu.getName() + "입니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Ending5 전설속의 가수");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (hu.getVocalStat() >= 90) {
				System.out.println("최고의 노래와 안무를 갖춘 데뷔 앨범을 발매했다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "은 신인가수로 데뷔한 후 세계적인 인기를 얻으며 성공적인 활동을 이어갔다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "은 해외 투어를 통해 세계 각지에서 팬들과 만나고, 주요 음악 시상식에서 수상하며 주목받았다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + " 은 자신만의 독특한 음악 스타일과 감각적인 퍼포먼스로 인류가 인정하는 월드클래스 가수로서의 지위를 굳건히 다져갔다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "은 음원 차트에서 상위권을 지키며 수많은 음반 판매량 기록을 세우며 글로벌한 스타로서의 성공을 이루었다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("안녕하세요. 가수" + hu.getName() + "입니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Ending4 월드클래스 가수");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (hu.getVocalStat() >= 80) {
				System.out.println("그의 뛰어난 가창력과 퍼포먼스는 대중들에게 큰 인상을 주고, 음악 팬들의 사랑을 받으며 큰 사랑을 얻습니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "은 음악적으로 다양한 장르와 스타일에 도전하며 차별화된 음악적 색깔을 보여줍니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "의 노력과 열정은 결국 음악계에서 높은 위치를 얻게 됩니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그는 많은 음악상에서 수상하며, 가수계에서 점차적으로 자리매김하고 전문성을 인정받게 됩니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(hu.getName() + "의 음악은 많은 사람들에게 큰 사랑을 받게됩니다. ");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("안녕하세요 가수" + hu.getName() + "입니다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Ending3 요즘 대세 가수");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			} else if (hu.getVocalStat() >= 70) {
				System.out.println(hu.getName() + "많은 사람들에게 사랑을 받으며 주인공은 좀 더 유명한 가수로서의 지위를 갖추게 되었다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그는 솔로 활동을 시작하고 히트 곡을 발표하며 음악적으로도 성장을 이루었다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("다양한 예능 프로그램에 출연하며 인기를 얻었다");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(
						"한편으로는 과도한 스케줄과 압박으로 인해 힘들어하기도 했지만, 주인공은 팬들을 위해 더욱 노력하고 자신을 발전시키며 가수로서의 멋진 삶을 살아가고 있었다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("안녕하세요. 가수" + hu.getName() + "입니다.");
				System.out.println();
				System.out.println("Ending2 가수");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (hu.getVocalStat() >= 60) {
			System.out.println();
			System.out.println(hu.getName() + "은 드디어 아이돌 연습생으로서의 꿈을 이루었다.");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("아직 어색하지만 최선을 다하는모습이 아름답다.");
			System.out.println();

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 여러 가지 경쟁과 시험을 거쳐 드디어 데뷔의 순간을 맞았다. ");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("최고의 노래와 안무를 갖춘 데뷔 앨범을 발매했다.");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 인기와 사랑을 받으며 꿈꾸던 가수의 길을 걷기 시작했다.");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 인기와 사랑을 받으며 꿈꾸던 가수의 길을 걷기 시작했다.");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("안녕하세요 신인가수" + hu.getName() + " 입니다!!!");
			System.out.println();

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Ending1 신인가수");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (hu.getDanceStat() >= 60 && ms.test == true) {
			System.out.println(arr[1] + "로 데뷔했습니다.");
			if (hu.getDanceStat() >= 100) {
				System.out.println(hu.getName() + "은 신인 댄서로 데뷔와 동시에 그만의 장신정신과 신인 답지 않은 면모를 보이며 폭발적 인기를 얻었다.");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그의 음악은 대중들의 마음을 사로잡아 전설적인 댄서로 기리는 이름이 되었다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("주인공은 시대를 초월한 퍼포먼스를 선보이며, 다양한 음악 장르를 소화하며 댄스계의 아이콘으로 자리매김했다. ");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("그는 매 퍼포먼스마다 관객들을 감동시키고, 감정을 전하는 예술가로서의 면모를 발휘하여 전 세계의 사람들에게 영감을 주었다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("주인공은 다른 세대에도 인정받는 전설급 댄서로서 자리를 굳혔다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("안녕하세요 아이돌" + hu.getName() + "입니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Ending10 전설속의 아이돌");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (hu.getDanceStat() >= 90) {
			System.out.println("최고의 안무로 대중의 시선을 사로 잡으며 나타난" + hu.getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("유명그룹 A와 협업하여 엄청난 명성을 얻게 되었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 해외 투어를 통해 세계 각지에서 팬들과 만나고, 주요 댄스 시상식에서 수상하며 더 큰 주목을 받았다. ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 자신만의 독특한 안무와 감각적인 퍼포먼스로 인류가 인정하는 월드클래스 댄서로서의 지위를 굳건히 다져갔다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + "은 수많은 가수들에게 러브콜을 받으며, 글로벌한 스타로서의 성공을 이루었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("안녕하세요 아이돌" + hu.getName() + "입니다.");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Ending9 월드클래스 아이돌");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (hu.getDanceStat() >= 80) {
			System.out.println("그의 뛰어난 안무실력과 퍼포먼스는 대중들에게 큰 인상을 주고, 팬들의 사랑을 받으며 큰 사랑을 얻습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + " 은 음악적으로 다양한 장르와 스타일에 도전하며 차별화된 퍼포먼스를 보여줍니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + " 의 노력과 열정은 결국 음악계에서 높은 위치를 얻게 됩니다. 그는 댄스서바이벌프로그램에 출연하여 인지도를 쌓았다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("그 결과 " + hu.getName() + " 은 많은 사람들에게 큰 사랑을 받게 됩니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("안녕하세요.  아이돌" + hu.getName() + "입니다!!");
			System.out.println("Ending8 요즘대세 아이돌");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (hu.getDanceStat() >= 70) {
			System.out.println("많은 사람들에게 사랑을 받으며 주인공은 좀 더 유명한 아이돌로서의 지위를 갖추게 되었다. ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("그는 솔로 활동을 시작하고 자작 안무를 SNS에서 발표하며 아이돌로서의 큰 성장을 이루었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("다양한 예능 프로그램에 출연하며 인기를 얻었다");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out
					.println("한편으로는 과도한 스케줄과 압박으로 인해 힘들어하기도 했지만, 주인공은 팬들을 위해 더욱 노력하고 자신을 발전시키며 아이돌로서의 멋진 삶을 살아가고 있었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("안녕하세요. 아이돌" + hu.getName() + " 입니다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Ending7 아이돌");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (hu.getDanceStat() >= 60) {
			System.out.println(hu.getName() + " 은 드디어 연습생으로서의 꿈을 이루었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("아직 어색하지만 최선을 다하는모습이 아름답다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(hu.getName() + " 은 여러 가지 경쟁과 시험을 거쳐 드디어 데뷔의 순간을 맞았다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("최고의 안무를 갖춘 데뷔 앨범을 발매했다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("신인 아이돌로서의 데뷔는 성공적이었고, " + hu.getName() + " 은 인기와 사랑을 받으며 꿈꾸던 댄서의 길을 걷기 시작했다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("안녕하세요 신인 아이돌 " + hu.getName() + "입니다!!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Ending6 신인 아이돌");
			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (hu.getVocalStat() > 60 && ms.test == false) {
			System.out.println(arr[2] + "로 데뷔했습니다.");
			System.out.println();
			System.out.println("한 때 " + hu.getName() + "은 아이돌이 되기 위해 노력하고 꿈꿨다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("음악에 대한 열정과 노력을 통해 스테이지에서 빛나고 싶었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("하지만 연습생 시절, 여러 차례의 오디션을 보았지만, 연예인의 장벽 너무 높았다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("그래서" + hu.getName() + "는 노래 실력을 더욱 발전시켜 보컬트레이너가 되기로 결심했다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("일일 연습과 전문적인 음악 이론을 공부하여 기본기를 닦는데 집중했다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("결국 " + hu.getName() + "은 여러 아티스트와 협업하고 작업하며 큰 성공을 이루었다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(" \"그런 마음가짐으로 데뷔 할 수있을것같아? 더 열심히 해\" ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("BadEnding 1 보컬트레이너");

			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (hu.getDanceStat() > 60 && ms.test == false) {
			System.out.println(arr[3] + "로 데뷔했습니다.");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("주인공은 오디션에서 떨어지는 불운을 겪었지만, 그를 위로하고 지지해주는 사람들의 도움을 받습니다. ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("그를 위로하고 지지해주는 사람들의 도움을 받습니다. ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("그 중에서그의 잠재력을 발견한 한 사람의 도움으로 댄스 트레이너로서의 길을 걷게 됩니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("주인공은 음악 산업에서 인정받는 댄스트레이너로서의 삶을 살아갑니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(" \"그런 마음가짐으로 데뷔 할 수있을것같아? 더 열심히 춰!\" ");
			System.out.println();
			System.out.println("BadEnding 2 댄스트레이너");

			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(arr[4] + "입니다..");
			System.out.println();
			System.out.println("주인공은 여러 차례 오디션을 떨어지는 불운을 겪게 됩니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("각각의 오디션에서 노력과 열정을 쏟아부였지만, 예상치 못한 결과로 인해 데뷔의 기회를 얻지 못합니다. ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out
					.println("주인공은 큰 실망과 좌절에 휩싸이며 자신을 돌아보고, 꿈을 이루기 위해 더욱 노력해야지 생각하지만, 늘 생각만 하고 현실은 누워서 넷플릭스만 보고있습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("오늘은 진짜 연습할거야");
			System.out.println();
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("GAME OVER");

			System.out.println();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("당신은 보컬트레이닝을 총 " + vcnt + "번 하였습니다. 당신의 노래스탯은 : " + hu.getVocalStat() + " 입니다.");
		System.out.println("당신은 보컬트레이닝을 총 " + dcnt + "번 하였습니다. 당신의 노래스탯은 : " + hu.getDanceStat() + " 입니다.");
		System.out.println("당신의 업적은 ");
		if (hu.title.size() >= 1) {
			for (int i = 0; i < hu.title.size(); i++) {
				System.out.println(hu.title.get(i));
			}
			System.out.println("입니다.");
		} else {
			System.out.println("하나도 없습니다.");
		}
	}

	public void print() throws Exception {
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⢰⡏⠙⣧⣼⡇⠀⠀\n" + "⠈⣽⣚⣁⣸⡃⠀⠀\n" + "⠀⠿⠭⠭⠽⠇⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀\n" + "");
		Thread.sleep(300);
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⢰⡏⠙⣧⣼⡇⠀⠀⠈⢹⣯⢩⣼⡇⠀\n" + "⠈⣽⣚⣁⣸⡃⠀⠀⠐⣋⣈⣓⣘⡃⠀\n"
				+ "⠀⠿⠭⠭⠽⠇⠀⠀ ⠀⠀⠀⠀⠸⠇⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀\n" + "");
		Thread.sleep(300);
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⢰⡏⠙⣧⣼⡇⠀⠀⠈⢹⣯⢩⣼⡇⠀⠀⢸⡏⠉⠁⣿⠄\n" + "⠈⣽⣚⣁⣸⡃⠀⠀⠐⣋⣈⣓⣘⡃⠀⠀⠨⠭⠭⠭⣭⠀\n"
				+ "⠀⠿⠭⠭⠽⠇⠀⠀ ⠀⠀⠀⠀⠸⠇⠀⠀⠘⠿⠭⠭⠭⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀\n" + "");
		Thread.sleep(300);
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⢰⡏⠙⣧⣼⡇⠀⠀⠈⢹⣯⢩⣼⡇⠀⠀⢸⡏⠉⠁⣿⠄⠀⠀⠀⣼⣇⠠⣿⠀\n"
				+ "⠈⣽⣚⣁⣸⡃⠀⠀⠐⣋⣈⣓⣘⡃⠀⠀⠨⠭⠭⠭⣭⠀⠀⠀⠚⣁⣈⣃⡛⠀\n" + "⠀⠿⠭⠭⠽⠇⠀⠀ ⠀⠀⠀⠀⠸⠇⠀⠀⠘⠿⠭⠭⠭⠀⠀⠀⠘⠧⠤⠤⠟⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀\n" + "");
		Thread.sleep(300);
	}

	public void event() {
		if (eventcnt == 0) {
			int per = (int) ((Math.random() * 20) + 1);
			if (per == 10) {
				int per1 = (int) ((Math.random() * 2) + 1);
				if (per1 == 1) {
					System.out.println("보컬 이벤트 발생!!");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("연습을 하러 가는 중 도사와 마주칩니다.");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("도사 : 자네 무슨 고민이 있나 .??");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Y : 네...고민이 있어요 ");
					System.out.println("N : 뭐야 이상한 사람이야; ");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					char anser = scan.next().charAt(0);
					if (anser == 'y' || anser == 'Y') {
						System.out.println("내가 도와주겠네.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						int comrps = (int) (Math.random() * 3);
						System.out.println("※도사의 도움을 받습니다.※.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("별건 없지만 이거라도 받아가게.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("1 : 구릿빗 상자 | 2 : 투명한 부적 | 3 : 영롱한 진주");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						int urps = scan.nextInt();
						if ((comrps == 0 && urps == 1) || (comrps == 1 && urps == 2) || (comrps == 2 && urps == 0)) {
							System.out.println("도사의 행운이 함께합니다.");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
							hu.vocalStat += 10;
							System.out.println("보컬 스탯이 10 올랐다!!!");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else if (comrps == urps) {
							System.out.println("아무일도 일어나지 않았습니다.");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else {
							System.out.println("아무일도 일어나지 않았습니다.");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					} else if (anser == 'n' || anser == 'N') {
						System.out.println("다음에 보지...");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					else {
						System.out.println("뭐라는지 모르겠군...");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("도사가 떠났습니다.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					eventcnt++;
					// 이벤트 조건 넣기
				} else {
					System.out.println("댄스 이벤트 발생!!");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("연습을 하러 가는 중 의문의 남성을 마주칩니다.");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("의문의 남성 : 나랑 춤출래  ??");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Y : 뭐...좋아요 ");
					System.out.println("N : 죄송해요 제가 지금 바빠서 ; ");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					char anser = scan.next().charAt(0);
					if (anser == 'y' || anser == 'Y') {
						int ccc = (int) (Math.random() * 3);
						String ccc1;
						if (ccc == 0) {
							ccc1 = "힙합";
						} else if (ccc == 1) {
							ccc1 = "팝핀";
						} else {
							ccc1 = "재즈";
						}
						System.out.println("당신과 의문의 남성과 댄스배틀을 시작합니다.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("자신있는 댄스를 선택해주세요.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("힙합 | 팝핀 | 재즈");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						String aswccc = scan.next();
						if (aswccc.equals(ccc1)) {
							System.out.println("의문의 아저씨 : 큭...잘하잖아?");

							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
							System.out.println("댄스배틀에서 승리했습니다.");

							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
							hu.danceStat += 10;
							System.out.println("댄스 스탯이 10 증가했습니다.");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else {
							System.out.println("의문의 아저씨 : 좀 더 연습해오라고 친구 ~~");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}

					} else if (anser == 'n' || anser == 'N') {
						System.out.println("다음에 또 보자구 친구~~");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("싫다면 싫다고 말을 하지...");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("의문의 남성이 떠났습니다.");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					eventcnt++;
				}
			}
		}

	}

	public void showMusic() {
		ms.showMusic();

	}
}
