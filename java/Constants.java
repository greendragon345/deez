public final class Constants {

    public static final double g=9.81;
    public static double hieght =0;
    private static final double H = 4;
    public static double mass =0.27;
    public statoc double airdensoty = 1.185;
    public static double aerodynmiccoef=0.47;
    public static double ballarea = 0.0144*3.14;
    public static final double K=airdensoty*aerodynmiccoef*ballarea
    /2*g*mass;
    public static final double minspeed = Math.sqrt(H*g*2/
    Utils.todegsin(0.001)*(Utils.todegsin(0.001)-g*K));
    public static double hoodratio =0;
    public static double shootratio =0;
    
    public static final double maxH = 4;
}
