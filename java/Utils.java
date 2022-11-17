import java.util.ArrayList;

public class Utils {

    public static double todegsin(double degr) {
        return Math.toDegrees(Math.sin(Math.toRadians(degr)));
    }

    public static double toDegCos(double degr) {
        return Math.toDegrees(Math.cos(Math.toRadians(degr)));

    }

    public double[] decider(double disitan) {
        ArrayList<Double> posblsoultion = new ArrayList<Double>(calcanglNLT(disitan));//made the arraylist a singel dimesion one

        int i = 0;
        int maxi = 0;
        double sum = posblsoultion.get(0)* Constants.shootratio
                + posblsoultion.get(1) * Constants.hoodratio;
        for (int j = 0; j < posblsoultion.size(); j+=2) {
            System.out.println("shooter speed: "+posblsoultion.get(j));
            System.out.println("shooter angle: "+posblsoultion.get(j+1));
        
        // double sum2 =
        // +posblsoultion.get(j)*Constants.shootratio+posblsoultion.get(j+1)*Constants.hoodratio;
        // if(sum>sum2){
        // maxi =i;
        // }
        }
        double[] velang = { posblsoultion.get(maxi), posblsoultion.get(maxi+1)};
        return velang;

    }

    public ArrayList<Double> calcanglNLT(double dist) {
        ArrayList<Double> d1 = new ArrayList<Double>();
       
        for (double i = 10; i <50; i += 0.01) {
            double speed = calcvelNLT(Math.sqrt(Constants.maxH * Constants.g * 2 /(
            Math.pow(Math.sin(Math.toRadians(89.999)),2) - Constants.maxH*Constants.g * Constants.K*Math.sin(Math.toRadians(89.999)))), Math.toRadians(i), dist);
            switch ((int) speed) {
                case 0:

                    break;

                default:
                    d1.add(speed);
                    d1.add(i);
                    break;
            }
        }
        return d1;
    }

    public double calcvelNLT(double maxspeed, double deg, double dist) {

        for (double i = 2; i < 52; i += 0.01) { // kinda think we should change the max min speed
                                                                       // to just speeds we know the robot can reach.
                                                                       //jhony:the maximmup speed of the falcon is very high 
                                                                       //BTW the fulcon is accelratin isnt it , does he have a maximum speed?
            double distV = calcdist(deg, i);
            if (Math.abs(distV - dist) <= 0.1 && calcH(i, deg) < Constants.maxH) { // added the H thing to the if
                return i;
            }

        }
        return 0;

    }

    public double calcH(double speed, double angle) { // wrote H as a function
        double H = 
        (Math.pow(speed, 2) * Math.pow(Math.sin(angle), 2)) / ((Constants.g
                * (2 + ((Constants.K * Math.pow(speed, 2)) * (Math.sin(angle))))));
        return H;
    }

    public double calcdist(double angle, double speed) {
        double H = calcH(speed, angle);
        double T = 2 * Math.sqrt(2 * H / Constants.g);
        double angl1 = angle / 2 + Math.PI / 4;
        double Va = speed * Math.cos(angle) / Math.sqrt(1 + Constants.K * Math.pow(speed, 2) *
                (Math.sin(angle) + Math.pow(Math.cos(angle), 2) * Math.log(Math.sin(angl1) / Math.cos(angl1))));
        double L = Va * T;
        double Xa = Math.sqrt(L * H * (Math.cos(angle) / Math.sin(angle)));
        return quadeq(-H, H * L - ((L - 2 * Xa) * Constants.hieght), -1*Constants.hieght * (Math.pow(Xa, 2)));

    }

    public double quadeq(double a, double b, double c) {
        double firstroot, secondroot;

        double det = b * b - 4 * a * c;

        if (det > 0) {

            // two real and distinct roots
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);
           
            return Math.max(firstroot, secondroot);
        } else {
            return 0;
        }

    }


    
}