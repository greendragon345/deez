import java.util.ArrayList;

public class output {
    public static void main(String[] args) {
        Utils u1 = new Utils();
        ArrayList<Double> posblsoultion = new ArrayList<Double>(u1.calcanglNLT(12.1));//made the arraylist a singel dimesion one
        for (int j = 0; j < posblsoultion.size(); j+=2) {
            System.out.println("shooter speed: "+posblsoultion.get(j));
            System.out.println("shooter angle: "+posblsoultion.get(j+1));}
        System.out.println(u1.calcdist(Math.toRadians(43.4), 17.7));
        // System.out.println(u1.calcdist(Math.toRadians(43.4), 17.7)[1]);
        //  double speed = 17.7;
        //  double angle = Math.toRadians(43.4);
        // System.out.println(angle);
        // System.out.println(Constants.K);
        // double H = u1.calcH(speed, angle);
        // System.out.println(H);
        // double T = 2 * Math.sqrt(2 * H / Constants.g);
        // System.out.println(T);
        // double angl1 = angle / 2 + Math.PI / 4;
        // double Va = speed * Math.cos(angle) / Math.sqrt(1 + Constants.K * Math.pow(speed, 2) *
        //         (Math.sin(angle) + Math.pow(Math.cos(angle), 2) * Math.log(Math.sin(angl1) / Math.cos(angl1))));
        // System.out.println(Va);
        // double L = Va * T;
        // System.out.println(L);
        // double Xa = Math.sqrt(L * H * (Math.cos(angle) / Math.sin(angle)));
        // System.out.println(Xa);
        // double H = 
        // (Math.pow(speed, 2) * Math.pow(Math.sin(angle), 2)) / ((Constants.g
        //         * (2 + ((Constants.K * Math.pow(speed, 2)) * (Math.sin(angle))))));
        //              System.out.println(H);
   
    }
}