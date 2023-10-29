package IdolTrainning;

public class Hp  {
   Human hu = new Human();
   int hhp = hu.hp;
//   int dDay = 3;
   public void myHp() {
         System.out.println("오늘은 무리했나...");
         System.out.println("※체력을 전부 소모해 패널티가 주어집니다※");
         hhp = hu.getHp();
         hhp-=2;
//         dDay--;
         
   }

   public int getHp() {
      return hhp;
   }

   public void setHhp(int hhp) {
      this.hhp = hhp;
   }

}