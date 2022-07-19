public class PublicTraffic {
    int num;
    int speedChange;
    int peopleMax;
    int fuelVolume;
    int speed;

    public PublicTraffic(int num, int speedChange, int peopleMax, int fuelVolume, int speed) {
        this.num = num;
        this.speedChange = speedChange;
        this.peopleMax = peopleMax;
        this.fuelVolume = fuelVolume;
        this.speed = speed;
    }

    public PublicTraffic(int num, int speedChange, int peopleMax) {
        this(num, speedChange, peopleMax, 100,0);
    }
    
}
