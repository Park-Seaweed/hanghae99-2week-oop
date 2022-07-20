
public class Main {
    public static void main(String[] args) {
        PublicTraffic bus = new BUS(1234,2,3);
        PublicTraffic[] publicTraffics = {bus};
        for (PublicTraffic publicTraffic:publicTraffics){
            if (publicTraffic instanceof Fee){
                ((Fee)publicTraffic).rateCheck(2);
                System.out.println("-------------");
            }
        }

//        System.out.println(bus.riding());


    }
}
