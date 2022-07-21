public class Taxi extends PublicTraffic implements Fee,Position {


    public Taxi(int num, int speed) {
        super(num, speed, 4);

    }
    int basic = 3000;
    @Override
    public void rateCheck(int currentPassenger) {
        this.currentPassenger = currentPassenger;
        if (currentPassenger < peopleMax){
            System.out.println("****택시****");
            System.out.println("탑승 승객 수=" + currentPassenger);
            System.out.println("잔여 승객 수=" + (peopleMax - currentPassenger));
            System.out.println("지불할 요금=" + (basic+(currentPassenger*1000)));
        }else {
            System.out.println("최대 승객 수 초과");
        }
    }

    @Override
    public void oilCheck(int currentOilCondition, String status) {
        this.currentOilCondition = currentOilCondition;
        this.status = status;
        if (status.equals("운행중")){
            System.out.println("상태=" + status);
            System.out.println("주유량=" + currentOilCondition);
        }else {
            System.out.println("주유량=" + (fuelVolume-currentOilCondition));

        }
        if ((fuelVolume-currentOilCondition) < 10){
            System.out.println("주유량=" + (fuelVolume-currentOilCondition));
        }
    }



    @Override
    public void placeCheck(String place,int distance) {
        this.distance = distance;
        this.place = place;
        System.out.println("목적지까지의 거리=" + distance + "km");
        System.out.println("기본 요금 확인=" +basic);
        System.out.println("목적지까지 거리=" +place);
        System.out.println("지불할 요금=" + (basic+(distance-1)*1000));
    }


}

