 public class BUS extends PublicTraffic implements Fee{

    public BUS(int num, int fuelVolume, int speed) {
        super(num, true, 30, fuelVolume, speed);
    }

     @Override
     public void rateCheck(int currentPassenger) {
         System.out.println("탑승 승객 수=" + number());
         this.currentPassenger = currentPassenger;
         System.out.println("잔여 승객 수=" + (peopleMax - currentPassenger));
         System.out.println("요금 확인=" + currentPassenger*1000);

     }

//     public void fuelFlow() {
//        System.out.println(fuelVolume);
//    }

}
