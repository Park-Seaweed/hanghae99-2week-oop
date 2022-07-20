 public class PublicTraffic {
    int num;
    boolean status;
    int x;
    int peopleMax;
    int currentPassenger;
    int fuelVolume;
    int speed;

    public PublicTraffic(int num, boolean status, int peopleMax, int currentPassenger, int fuelVolume, int speed) {
        this.num = num;
        this.status = status;
        this.peopleMax = peopleMax;
        this.currentPassenger = currentPassenger;
        this.fuelVolume = fuelVolume;
        this.speed = speed;
    }

    public PublicTraffic(int num, boolean status, int peopleMax, int currentPassenger, int speed) {
        this(num, status, peopleMax, currentPassenger,100, 0);
    }
    public int number(){
        return currentPassenger;
    }
    

 }
