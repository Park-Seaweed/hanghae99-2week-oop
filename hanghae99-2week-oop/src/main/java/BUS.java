 public class BUS extends PublicTraffic implements Fee{

     public BUS(int num, int speed) {
         super(num, speed, 30);
     }

     @Override
     public void rateCheck(int currentPassenger) {
         this.currentPassenger = currentPassenger;
         if (currentPassenger < peopleMax){
             printWhoAmI();
             System.out.println("****버스****");
             System.out.println("탑승 승객 수=" + currentPassenger);
             System.out.println("잔여 승객 수=" + (peopleMax - currentPassenger));
             System.out.println("요금 확인=" + currentPassenger*1000);
         }else {
             System.out.println("최대 승객 수 초과");
         }


     }

     @Override
     public void oilCheck(int currentOilCondition, String status) {
         this.currentOilCondition = currentOilCondition;
         this.status = status;
         printWhoAmI();
         if (status.equals("차고지행")){
             System.out.println("상태=" + status);
             System.out.println("주유량=" + currentOilCondition);
         }else {
             System.out.println("주유량=" + (fuelVolume-currentOilCondition));

         }
         if ((fuelVolume-currentOilCondition) < 10){
             System.out.println("주유량=" + (fuelVolume-currentOilCondition));
         }


     }
 }
