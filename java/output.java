import java.util.ArrayList;

public class output {
    public static void main(String[] args) {
         Utils u1 = new Utils();
        ArrayList<Double> posblsoultion = new ArrayList<Double>(u1.calcanglNLT(9));//made the arraylist a singel dimesion one
        System.out.println(posblsoultion.size());
         
        for (int j = 0; j < posblsoultion.size(); j+=2) {
            System.out.println("");
            Float angle = posblsoultion.get(j+1).floatValue();
            System.out.print(" shooter angle: "+angle);
            Float speed = posblsoultion.get(j).floatValue();
            System.out.print(" ball speed: "+speed);
            }
        // 
        // double movemntrange = 17.669538928;
        // movemntrange = Math.pow(movemntrange,2);
        // double degr =45;
        // double degrinrad = Math.toRadians(degr);
        // double angl1 = degrinrad / 2 + Math.PI / 4;
// 
        // double longeqshort = Math.sin(degrinrad) + Math.pow(Math.cos(degrinrad), 2) * Math.log(Math.sin(angl1) / Math.cos(angl1));
        // double A = 8 * Math.pow(Math.cos(degrinrad), 2) * Math.pow(Math.sin(degrinrad),2)-movemntrange * Math.pow(Constants.K,2) * Math.pow(Constants.g,2)*longeqshort*Math.sin(degrinrad);
// 
        // double B = -Math.pow(Constants.g,2)*Constants.K*Math.sin(degrinrad)*movemntrange -2*movemntrange*Constants.K*longeqshort*Math.pow(Constants.g, 2);
// 
        // double C = -movemntrange * 2 * Math.pow(Constants.g, 2);
// 
        // float a1 = (float)A;
        // float b1 = (float)B;
        // float c1 = (float)C;
        // System.out.println("a: "+a1);
        // System.out.println("b: "+b1);
        // System.out.println("c: "+c1);
        // float velocity = (float)Math.sqrt(u1.quadeq(A, B, C));
        // System.out.println("final velovity! "+velocity);
        // System.out.println(d1);
        // double shootertinetireach=0.0666;
        // double shooterdistancereaches=0.5;
        // System.out.println((Math.pow(shootertinetireach,2)*Constants.g/2+shooterdistancereaches)/shootertinetireach);
   
    }
}