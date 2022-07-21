 public abstract class PublicTraffic {
    int num;
    int speed;
    String status = "운행";
    int peopleMax;
    int currentPassenger;
    int fuelVolume = 100;
    int currentOilCondition;
    int distance;
    String place;


    public PublicTraffic(int num,int speed, int peopleMax, int currentPassenger,
                          int currentOilCondition,int distance) {
        this.num = num;
        this.speed = speed;
        this.peopleMax = peopleMax;
        this.currentPassenger = currentPassenger;
        this.currentOilCondition = currentOilCondition;
        this.distance = distance;

    }

    public PublicTraffic(int num, int speed , int peopleMax) {
        this(num, speed, peopleMax, 0,0,0);
    }

 }
