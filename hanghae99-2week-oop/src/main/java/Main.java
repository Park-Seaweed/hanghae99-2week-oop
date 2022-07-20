
public class Main {
    public static void main(String[] args) {
        PublicTraffic bus = new BUS(1234,1);
        PublicTraffic taxi = new Taxi(2323,3);
        PublicTraffic[] publicTraffics = {bus,taxi};
        for (PublicTraffic publicTraffic:publicTraffics){
            if (publicTraffic instanceof Fee){
                ((Fee)publicTraffic).rateCheck(1);
                System.out.println("-------------");
            }
        }
        for (PublicTraffic publicTraffic:publicTraffics){
            if (publicTraffic instanceof Fee){
                ((Fee) publicTraffic).oilCheck(67, "차고지행");
                System.out.println("-------------");
            }
        }
        for (PublicTraffic publicTraffic:publicTraffics){
            if (publicTraffic instanceof Fee){
                ((Fee) publicTraffic).oilCheck(21, "운행중");
                System.out.println("-------------");
            }
        }
        for (PublicTraffic publicTraffic:publicTraffics){
            if (publicTraffic instanceof Position) {
                ((Position) publicTraffic).distanceCheck(3);
                System.out.println("-------------");
            }
        }




    }
}
