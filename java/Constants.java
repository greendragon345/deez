public final class Constants {

    public static final double g=9.81;
    public static double hieght =1.68;
    private static final double H = 3;
    public static double mass =0.27;
    public static double airdensity = 1.185;
    public static double aerodynmiccoef=0.47;
    public static double ballarea = Math.pow((0.24/2),2)*Math.PI;
    public static final double K=airdensity*aerodynmiccoef*ballarea/(2*g*mass);
    // 0.00475626239461;
    public static final double minspeed = Math.sqrt(1*g*2/
    Math.sin(Math.toRadians(90))*(Math.sin(Math.toRadians(90))-g*K));
    public static double hoodratio =0;
    public static double shootratio =0;
    public static double mesurment = 85.9;
    public static final double maxH =4;
}