import java.util.ArrayList;

public class output {
    public static void main(String[] args) {
        Utils u1 = new Utils();
        ArrayList<Double> posblsoultion = new ArrayList<Double>(u1.calcanglNLT(9));//made the arraylist a singel dimesion one
        System.out.println(posblsoultion.size());
        
        for (int j = 0; j < posblsoultion.size(); j+=2) {
            System.out.println("");
            Float speed = posblsoultion.get(j).floatValue();
            System.out.print(" ball speed: "+speed);
            Float double1 = posblsoultion.get(j+1).floatValue();
            System.out.print(" shooter angle: "+double1);
            }
        // System.out.println(d1);
        // double shootertinetireach=0.0666;
        // double shooterdistancereaches=0.5;
        // System.out.println((Math.pow(shootertinetireach,2)*Constants.g/2+shooterdistancereaches)/shootertinetireach);
   
    }
}