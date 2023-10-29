package IdolTrainning;

import java.util.Random;
import java.util.Scanner;

public class music {

	Scanner sc = new Scanner(System.in);
	boolean test = false;



	public void showMusic() {// 소원을말해봐/분홍신// 빨간맛 / 강남스타일/주문/좋은날/행복
		// 랜덤으로 한 문제 뽑기



		for(int i=0 ; i<=4 ; i++) {
		      System.out.println("\n"
		            + "⠀⠀⠀⢀⣀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⢀⣀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⣰⡟⠙⣿⡄⠀⣿⡇⠀⣿⣇⣸⣿⢸⣿⢸⣿⠀⢸⣿⡟⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⣿⡇⠀⢹⣷⠀⣿⡇⠀⣿⡏⢹⣿⢻⣿⢸⣿⠀⢸⣿⡟⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⣿⡇⠀⣼⡿⠀⣿⡇⠀⠙⣛⠛⠛⢸⣿⢸⣿⠀⠀⠙⠛⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⠹⣷⣤⡿⠃⠀⣿⡇⠀⠀⣿⡇⠀⠈⠉⠈⠉⠀⢠⣤⣤⣤⣤⣤⣤⣤⡀⠀\n"
		            + "⠀⠀⠀⠀⠀⠀ ⠀⠀⠛⠃⠀⠀⠙⠛⠛⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⣶⣆⣀⣰⣶⠀⣶⡆⠀⠀⢰⣶⠀⢰⣶⢰⣶⠀⣤⣤ ⣤⣤⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⣿⣏⣉⣹⣿⠀⣿⡷⠆⠀⣾⣿⡀⢸⣿⢾⣿⠀⢻⣿⠀⢻⣿⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⢈⣛⣛⣛⣛⣀⣛⡃⠀⠺⠋⠘⠿⠸⠿⠸⠿⠀⢸⡟⠀⢸⡟⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⢨⣭⣭⣭⣭⣭⣿⡇⠀⠀⣴⡾⠛⠛⠛⢷⣦⠀ ⠀  ⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⠘⠿⠶⠶⠶⠶⠶⠆⠀⠀⠻⠷⣦⣤⣴⠾⠟⠀⠘⠛⠀⠘⠛⠀⠀⠀⠀\n"
		            + "");
		      try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      System.out.println("\n"
		            + "⠀⠀⠀⢀⣀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⢀⣀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⣰⡟⠙⣿⡄⠀⣿⡇⠀⣿⣇⣸⣿⢸⣿⢸⣿⠀⢸⣿⡟⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⣿⡇⠀⢹⣷⠀⣿⡇⠀⣿⡏⢹⣿⢻⣿⢸⣿⠀⢸⣿⡟⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⣿⡇⠀⣼⡿⠀⣿⡇⠀⠙⣛⠛⠛⢸⣿⢸⣿⠀⠀⠙⠛⠛⠛⠛⠛⠛⠀⠀\n"
		            + "⠀⠀⠹⣷⣤⡿⠃⠀⣿⡇⠀⠀⣿⡇⠀⠈⠉⠈⠉⠀⢠⣤⣤⣤⣤⣤⣤⣤⡀⠀\n"
		            + "⠀⠀⠀⠀⠀⠀ ⠀⠀⠛⠃⠀⠀⠙⠛⠛⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⣶⣆⣀⣰⣶⠀⣶⡆⠀⠀⢰⣶⠀⢰⣶⢰⣶⠀⠀ ⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⣿⣏⣉⣹⣿⠀⣿⡷⠆⠀⣾⣿⡀⢸⣿⢾⣿⠀⠀⠀⠀ ⠀\n"
		            + "⠀⠀⠀⠀⠀⢈⣛⣛⣛⣛⣀⣛⡃⠀⠺⠋⠘⠿⠸⠿⠸⠿⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⢨⣭⣭⣭⣭⣭⣿⡇⠀⠀⣴⡾⠛⠛⠛⢷⣦⠀⠀⠀⠀⠀⠀\n"
		            + "⠀⠀⠀⠀⠀⠘⠿⠶⠶⠶⠶⠶⠆⠀⠀⠻⠷⣦⣤⣴⠾⠟⠀⠀⠀⠀⠀⠀\n"
		            + "");
		      try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      }
		
		System.out.println("당신이 꿈꾸는 기획사에서 내방 오디션이 있습니다.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("설레는 당신은 기쁜 마음으로 오디션에 참가합니다.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("기획사 사장은 미니 게임을 통해 당신의 합격 여부를 결정하려고 합니다.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("------ 게임 방법 ------");
		System.out.println("노래에 관련된 가사나 키워드가 뜨면, 노래를 입력해주세요.");
		System.out.println("주의!! 띄어쓰기는 안됩니다.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		int cnt = 0;
		System.out.println("게임 시작 3");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("게임 시작 2");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("게임 시작 1");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("GAME START !!!!");
		
		
	
		

		// 질문
				String[] questions = { "가사를 보고 노래를 맞춰요!!", "키워드 보고 노래를 맞춰요!!" };
				// 가사
				String[] lyrics = { "니 맘속에 있는 작은 꿈을 말해 봐", "길을 잃었다, 어딜 가야 할까", "Red-red-red flavor ", "낮에는 따사로운 인간적인 여자",
						"넌 나를 원해 넌 내게 빠져", "나는요 오빠가 좋은걸 (아이쿠, 하나 둘)", "La La La La La La La La La La Happiness!" };
				// 키워드
				String[] keyword = {
						"‘Gee’신드롬을 이을 미니 앨범 2집 타이틀곡,콘셉트 의상으로 마린룩을 채택했고, 핫팬츠와 각선미를 강조하는 '제기차기춤', '각선미춤' 등으로 기존과 다른 섹시한 이미지를 어필했다.",
						"이민수-김이나 콤비의 새로운 작품으로, 빨간구두를 신으면 자신의 의지와 상관없이 계속해서 춤을 추게 된다는 내용의 안데르센 동화 '빨간구두(The Red Shoes)'에서 영감을 받아 완성된 곡",
						"2017년 7월 9일 발매된 레드벨벳의 첫 번째 여름 미니 앨범. 음원 차트 개혁 이후 레드벨벳이 처음으로 발매한 음반으로, 타이틀 곡은 2017년 여름 최고의 히트곡",
						"대한민국 대중 음악 역사상 최대 히트곡이자 2012년 전 세계 최대 히트곡이며 나아가 2010년대 초 일렉트로팝 시대의 말엽을 대표하는 노래",
						"2008년 9월 26일에 발매된 한국의 남성 아이돌 그룹 동방신기의 4번째 정규 앨범,  대중적으로나 대한민국 음악 시장에 큰 획을 그을 만큼의 엄청난 성공을 거두면서 이후 동방신기가 최고의 아이돌 그룹 이미지를 구축하는 데 크게 기여한 노래",
						"클라이맥스 'I'm in my dream' 부분에 등장하는 3단 고음으로 유명한 곡",
						"Red Velvet의 데뷔곡이며,  강렬한 신스 사운드와 아프리칸 느낌의 트라이벌 비트가 잘 어우러진 생동감 넘치는 어반 유로 팝 장르의 곡으로, 랩과 노래를 넘나드는 보컬과 다양하게 변화하는 곡의 구성이 듣는 재미를 한층 배가시킨다."

				};

				String[] answer = { "소원을말해봐", "분홍신", "빨간맛", "강남스타일", "주문", "좋은날", "행복"

				};

				int num = (int) (Math.random() * 2);
				System.out.println(questions[num]);
				int num1 = (int) (Math.random() * 7);
				if (num == 0) {
					System.out.println(lyrics[num1]);
				} else if (num == 1) {
					System.out.println(keyword[num1]);
				}

				String mName = this.sc.nextLine();
				System.out.println(mName);

				switch (mName) {

				case "소원을말해봐":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				case "분홍신":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}
				case "빨간맛":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				case "강남스타일":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				case "주문":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				case "좋은날":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				case "행복":
					if (mName.equals(answer[num1])) {
						cnt += 1;
						test = true;
					break;}

				default:

					break;
				}

				if (cnt == 1) {
					System.out.println("오디션을 통과했습니다.");
					try{
						Thread.sleep(1000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				

				}
				else
					System.out.println("오디션을 통과하지 못했습니다.");
				try{
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			
			}
	
	   
}
	