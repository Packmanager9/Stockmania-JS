package ditzler.cole.stableapp;

//import android.media.tv.TvContract;
//import android.print.PrinterId;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

//import android.util.Log;
//import android.view.View;

// implements Runnable
public class StockManiaActivityPowerfulAutoplayerVersionTwo extends AppCompatActivity{

    DataPoint[] DiceGrapher = new DataPoint[99999];
    String GrapherString = "";
   // Point[] DiceGrapher = new Point[99999];
    Timer timer;
    private Thread thread;
    private boolean running = false;
    long LastTime = System.nanoTime();
    final double amountOfTicks = 0.5;
    double ns = 1000000000 / amountOfTicks;
    double countdown = 1000000000;

    double Realdown = 999990000;
    double TotalValueCombined = 100;
    int Manipulated = 0 ;
    int  timercounter;
    int timercountercounter;

    double delta = 0;

    double SINEaverage = 1;
    double TRTLaverage = 1;
    double BTCaverage = 1;
    double DICEaverage = 1;
    double PLNTaverage = 1;
    double LOSSaverage = 1;
    double HAREaverage = 1;

    double logincrement = 10;
    double logtobetested = 100;

    double SINEaveragesell = 1;
    double TRTLaveragesell = 1;
    double BTCaveragesell = 1;
    double DICEaveragesell = 1;
    double PLNTaveragesell = 1;
    double LOSSaveragesell = 1;
    double HAREaveragesell = 1;

    int loopStart = 0;


    public void EscapeStockMania() {
        Intent intentDice = new Intent(this, DiceGame.class);
        startActivity(intentDice);
    }

    public void GumbleStockMania() {
        Intent intentGumble = new Intent(this, gumbler.class);
        intentGumble.putExtra("Money", Money);
        int RequestCode = 12345;
        startActivityForResult(intentGumble, RequestCode);
    }

    protected void onPause(){
        super.onPause();
        StockMarketTrackPlayer.pause();
        //  VictoryMusic.pause();
    }

    protected void onResume(){
        if ((sound%2) == 1) {
            // if (Victory > 0){
            //  super.onResume();
            //  VictoryMusic.setLooping(true);
            //  VictoryMusic.start();
            //  }else {
            super.onResume();
            StockMarketTrackPlayer.setLooping(true);
            StockMarketTrackPlayer.start();


        }else {
            super.onResume();
            // VictoryMusic.pause();
            StockMarketTrackPlayer.pause();
        }
    }

    protected DataPoint[] data(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[Day];
        for( int i = 0; i < Day; i++){
            DataPoint V = new DataPoint(Day, Math.abs(logtobetested));
            values[i] = V;




        }
        return values;
    }
    protected DataPoint[] datatwo(){

        //double TotalBuyChecker = SINEBuyChecker + TRTLBuyChecker + DICEBuyChecker + BTCBuyChecker + PLNTBuyChecker + LOSSBuyChecker + HAREBuyChecker;
        
        DataPoint[] values = new DataPoint[Day];
        for( int i = 0; i < Day; i++){
            DataPoint V = new DataPoint(Day, Math.abs(logincrement));
            values[i] = V;



        }
        return values;
    }
    protected DataPoint[] datathree(){

        
        DataPoint[] values = new DataPoint[Day];
        for( int i = 0; i < Day; i++){
            DataPoint V = new DataPoint(Day, Math.abs(NewStockPrice));
            values[i] = V;



        }
        return values;
    }



    private  Integer Demagos[] = {R.drawable.uparrow, R.drawable.downarrow, R.drawable.sidewaysarrow};
    double whatamimeasuring;
    double DiceChange;
    double BitcoinChange;
    double PlantChange;
    double LossChange;
    double SineChange;
    double HairChange;
    double TurtleChange;



    /*
    double DICEBuyChecker = 100;
    double TRTLBuyChecker = 100;
    double SINEBuyChecker = 100;
    double HAREBuyChecker = 100;
    double PLNTBuyChecker = 100;
    double BTCBuyChecker = 100;
    double LOSSBuyChecker = 100;
    double DICESellChecker = 7;
    double TRTLSellChecker = 7;
    double SINESellChecker = 7;
    double HARESellChecker = 7;
    double PLNTSellChecker = 7;
    double BTCSellChecker = 7;
    double LOSSSellChecker = 7;
    */
    int thishasnthappenedyet = 0;


    MediaPlayer VictoryMusic;
    MediaPlayer StockMarketTrackPlayer;
    int BankMode = 0;
    int loopAI = 0;
    TextView ColorCircle, PortfolioValueViewNoName;
    TextView SmallCircle;
    TextView BigCircle;
    int Cheated;
    String PassColor = "%s%s%s%s%s%s";
    String TestPort = "Portfolio:";
    String TestPortNoName = "$%s";
    private TextView TextBox;
    private final String BankOutputs = "Balance:              $%s";
    private final String BankOutput = "Balance:              $%s \n \n \n \n \n \nDebt:                    $%s";

    private final String TESTING = "%s";
    private final String Tester = "The game begins!";
    private final String TestTwo = "%s";
    private final String TestThree = "%s %s %s";
    private final String TestFree = "%s %s %s %s %s %s %s %s %s %s %s %s";
    private final String TestFour = "%s %s %s %s %s %s";
    private final String TestSix = "%s %s %s %s %s %s";
    private final String Test5 = "%s %s %s %s %s";
    private final String TestOne = "%s";
    private final String TestFive = "";
    private int I = -10;
    private int a = 38;
    //  private double FREEDOM = 0;
    private final String CANDY = "Candy";
    private final String APPLE = "Apple";
    private final String GUN = "Gun";
    private final String HAT = "HAT";
    private final String MAYO = "Mayo";
    private final String GHOST = "Ghost";
    private final String INSIDE = "Inside";
    private final String STICK = "Stick";
    private final String HORSE = "Horse";
    int Victory = 0;
    int VictoryCounter = 0;
    private String TRTL = "TRTL";
    private String PLNT = "PLNT";
    private String LUZE = "LUZE";

    private final String TUTL = "TUTL";
    private final String TORT = "TORT";
    private final String TUTR = "TUTR";
    private final String TURT = "TURT";
    private final String SHEL = "SHEL";
    private final String SLOW = "SLOW";
    private final String GREN = "GREN";
    private final String TSTU = "TSTU";

    double Cyclops = (new Random().nextInt(50)+40);
    double NewCycle = (Cyclops/60);
    double HighCosSwitch = (new Random().nextInt(50)+130);

    private String DICE = "DICE";
    private final String DUCE = "DUCE";
    private final String DOCE = "DOCE";
    private final String DYCE = "DYCE";
    private final String CUBE = "CUBE";
    private final String CYUB = "CYUB";
    private final String SIXS = "SIXS";
    private final String DIIC = "DIIC";
    private final String ROLL = "ROLL";

    private final String Money$ = "Money $";
    private final String NotEnoughMoney = "Not Enough Money";
    private final String TheGameHasntStarted = "The Game Hasn't Started!";
    private final String HardModeActivated = "Hard Mode Activated!";
    private final String NotEnoughShares = "Not Enough Shares";
    private final String Bought = "Bought ";
    private final String Sold = "Sold ";









    private String BTC = "BTC";
    private final String BYC = "BYC";
    private final String BTT = "BTT";
    private final String BIC = "BIC";
    private final String BIP = "BIP";
    private final String SWC = "SWC";
    private final String BC = "BC";
    private final String BULL = "BULL";
    private final String DIGT = "DIGT";
    String HAIR = "HAIR";
    int BuyAmount = 1;

    public int TurtSwitch = new Random().nextInt(2)+1;
    public int Car = new Random().nextInt(2);
    public int car = new Random().nextInt(6);
    public int Par = new Random().nextInt(2);
    public int par = new Random().nextInt(7);
    public int Jar = new Random().nextInt(2);
    public int jar = new Random().nextInt(6);
    public int Yar = new Random().nextInt(2);
    public int yar = new Random().nextInt(6);
    public int tar = new Random().nextInt(6);
    public int Tar = new Random().nextInt(2);
    public int rar = new Random().nextInt(6);
    public int Rar = new Random().nextInt(2);
    public int zar = new Random().nextInt(6);
    public int Zar = new Random().nextInt(2);
    public int COSSINSwitch = new Random().nextInt(3)+1;
    public int GameMode = new Random().nextInt(2)+1;

    public double LossLimiterGenx = ((new Random().nextInt(349)+150));
    public double LossLimiterGeny = Math.round(LossLimiterGenx);
    public double LossLimiter = LossLimiterGeny/100;

    TextView BankView;
    TextView TestBox;

    TextView Q1;
    TextView Q2;
    TextView Q3;
    TextView Q4;
    TextView Q5;
    TextView TW;
    TextView QSine;
    Button Bank;
    Button Take;
    Button Fill;
    Button Loan;
    Button Pay;
    Button BuyTRTLStock;
    Button SellTRTLStock;
    Button BuySINEStock;
    Button SellSINEStock;
    Button BuyDICEStock;
    Button SellDICEStock;
    Button BuyBTCStock;
    Button SellBTCStock;
    Button BuyPLNTStock;
    Button SellPLNTStock;
    Button BuyLUZEStock;
    Button SellLUZEStock;
    Button SellHAREStock;
    Button BuyHAREStock;
    Button ResetGame;
    Button NextGame;
    Button Mute;
    Button Gumble;
    TextView DailyPapers;
    Button Go;
    Button beg;
    final String NEWSLETTER_C = "%s";
    final String NEWSLETTER_B = "DICE";
    final String NEWSLETTER_A = "A";
    private int b = 19;
    private int c = 11;
    private int d = 28;

    private int dayskipmode = 28;

    private double skipcounter = 1;




    public double TurtCeilingGenx = ((new Random().nextInt(2123)+1500));
    public double TurtCeilingGeny = Math.round(TurtCeilingGenx);
    public double TurtCeiling = TurtCeilingGeny/100;


    public double TurtDivGenx = ((new Random().nextInt(301)+200));
    public double TurtDivGeny = Math.round(TurtDivGenx);
    public double TurtDiv = TurtDivGeny/100;

    public int TurtDivLegacy = new Random().nextInt(3)+2;


    int TrueRangeLossMax = new Random().nextInt(69)+621;

    final int FirstTRTLPrice = new Random().nextInt(3) + 1;
    final int FirstDICEPrice = new Random().nextInt(1) + 36;
    final int FirstBTCPrice = new Random().nextInt(200) + 20;
    final int FirstPLNTPrice = new Random().nextInt(10) + 45;
    final int FirstLUZEPrice = new Random().nextInt(61) + 360;
    final int Seed = new Random().nextInt(9) + 1;
    int Day = 0;
    int p = 0;
    int Rx = 0;
    private ImageView NewStockArrowImageView;
    private ImageView TurtleArrowImageView;
    private ImageView DiceArrowImageView;
    private ImageView BitcoinArrowImageView;
    private ImageView PlantArrowImageView;
    private ImageView LossArrowImageView;
    private ImageView HairArrowImageView;

    double DICENum = 0;
    double TRTLNum = 0;
    double LUZENum = 0;
    double PLNTNum = 0;
    double BTCNum = 0;
    double HAIRNum = 0;
    double SINENum = 0;
    int Fandom = new Random().nextInt(5) + 1;
    int Gandom = new Random().nextInt(5) + 1;
    int Nandom = new Random().nextInt(5) + 1;
    int Wandom = new Random().nextInt(5) + 1;
    int gandom = new Random().nextInt(3) + 1;
    int nandom = new Random().nextInt(3) + 1;
    int wandom = new Random().nextInt(3) + 1;
    int PDT = nandom*wandom*gandom;
    int pdt = PDT;
    int LossMinModeSetter = new Random().nextInt(4) + 1;

    int losslimiterdaycapper = new Random().nextInt(4000) + (pdt*750);


    int resetCounter = 0;
    int WonThisGameCounter = 0;
    int SexCheatCounter = 0;
    int SexCheatCounterD = 0;
    int SexCheatCounterZ = 0;
    int  NextGameCounter = 0;
    double Monee;
    int sound = 1;
    String SINE =  "SIGN";

    double bankbalance = 0;
    double debts = 0;

    double Money = 10000;
    //double Money = 100000000;
    double LossLeaderPrice = 0;
    double BitcoinPrice = new Random().nextInt(60)+1;
    double DicePrice = new Random().nextInt(6) + 25;
    double PlantPrice = new Random().nextInt(10) + 45;

    double NewStockPrice = Math.floor((49 + Math.abs((100*(((Math.sin(Day*0.0174533*NewCycle))))))+2));
    double PortfolioValue;

    TextView pen7;
    TextView pen8;
    TextView pen9;
    TextView penSINE;

    TextView PortfolioValueView;;


    TextView day;
    TextView TPV1;
    TextView TPV2;
    TextView TPV3;
    TextView TPV4;
    TextView TPV5;
    TextView TPV6;
    TextView TPV7;
    TextView PV0;
    TextView PV1;
    TextView PV2;
    TextView PV3;
    TextView PV4;
    TextView PV5;
    TextView Increased;
    TextView Tisl;
    double TurtlePrice = new Random().nextInt(5) + 5;
    double HARE = new Random().nextInt(11) + 8;




    double DICEBuyChecker = DicePrice + 1;
    double TRTLBuyChecker = TurtlePrice + 3;
    double SINEBuyChecker = NewStockPrice + 3;
    double HAREBuyChecker = HARE + 3;
    double PLNTBuyChecker = PlantPrice + 3;
    double BTCBuyChecker = BitcoinPrice + 3;
    double LOSSBuyChecker = LossLeaderPrice + 3;

    double DICESellChecker = DicePrice - 1;
    double TRTLSellChecker = TurtlePrice - 3;
    double SINESellChecker = NewStockPrice - 3;
    double HARESellChecker = HARE - 3;
    double PLNTSellChecker = PlantPrice - 3;
    double BTCSellChecker = BitcoinPrice - 3;
    double LOSSSellChecker = LossLeaderPrice - 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DecimalFormat df = new DecimalFormat("#.00");







        StockMarketTrackPlayer = MediaPlayer.create(this, R.raw.xylostocks);
        StockMarketTrackPlayer.setLooping(true);
        StockMarketTrackPlayer.start();

        /*VictoryMusic = MediaPlayer.create(this, R.raw.biggersecrettrack);
        VictoryMusic.setLooping(true);*/


        if (Car == 1) {
            if (car == 1) {
                TRTL = "TRTL";
                LossLeaderPrice = new Random().nextInt(61) + 360;
            } else if (car == 2) {
                TRTL = "TUTL";
                LossLeaderPrice = new Random().nextInt(21) + 90;
            } else if (car == 3) {
                TRTL = "TTLE";
                LossLeaderPrice = new Random().nextInt(61) - 110;
            } else if (car == 4) {
                TRTL = "TORT";
                LossLeaderPrice = new Random().nextInt(61) - 420;
            } else if (car == 5) {
                TRTL = "TURT";
                LossLeaderPrice = new Random().nextInt(31) - 60;
            } else {
                TRTL = "TRAT";
                LossLeaderPrice = new Random().nextInt(1000)+17;
            }
        } else {
            if (car == 1) {
                TRTL = "TOTL";
            } else if (car == 2) {
                TRTL = "TUTE";
            } else if (car == 3) {
                TRTL = "TILE";
            } else if (car == 4) {
                TRTL = "TOUT";
            } else if (car == 5) {
                TRTL = "TRNT";
            } else {
                TRTL = "TRUT";
            }
        }      if (Par == 1) {
            if (par == 1) {
                SINE = "SINE";
            } else if (par == 2) {
                SINE = "SYGN";
            } else if (par == 3) {
                SINE = "SIHN";
            } else if (par == 4) {
                SINE = "SOCN";
            } else if (par == 5) {
                SINE = "SEIN";
            } else if (par == 6) {
                SINE = "SEIN";
            } else {
                SINE = "SYHN";
            }
        } else {
            if (par == 1) {
                SINE = "SOIN";
            } else if (par == 2) {
                SINE = "SOYN";
            } else if (par == 3) {
                SINE = "SYYN";
            } else if (par == 4) {
                SINE = "SGGN";
            } else if (par == 5) {
                int AorÅ = new Random().nextInt(7);
                if (AorÅ != 0) {
                    SINE = "SOCA";
                }else {
                    SINE = "SOCÅ";
                }
            }  else if (par == 6) {
                int threeorfour = new Random().nextInt(2)+3;
                if (threeorfour == 3){
                    SINE = String.format(displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()) + displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()) + displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()));
                }else {
                    SINE = String.format(displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()) + displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()) + displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod())+ displayRandomStockNamesPartTwoMethod(displayRandomStockNamesPartOneMethod()));
                }
            } else {
                int AorÅ = new Random().nextInt(7);
                if (AorÅ != 0) {
                    SINE = "TOHA";
                }else {
                    SINE = "TOHÅ";
                }
            }
        }
        if (Jar == 1) {
            if (jar == 1) {
                PLNT = "PLNT";
                BitcoinPrice = new Random().nextInt(20) + 20;
            } else if (jar == 2) {
                PLNT = "GROW";
                BitcoinPrice = new Random().nextInt(2) + 5;
            } else if (jar == 3) {
                PLNT = "SEED";
                BitcoinPrice = new Random().nextInt(15) + 15;
            } else if (jar == 4) {
                PLNT = "SPRT";
                BitcoinPrice = new Random().nextInt(100) + 20;
            } else if (jar == 5) {
                PLNT = "GREN";
                BitcoinPrice = new Random().nextInt(125) + 20;
            } else {
                PLNT = "TREE";
                BitcoinPrice = new Random().nextInt(45) + 45;
            }
        } else {
            if (jar == 1) {
                PLNT = "HEGE";
            } else if (jar == 2) {
                PLNT = "CROP";
            } else if (jar == 3) {
                PLNT = "CHOP";
            } else if (jar == 4) {
                PLNT = "HEAL";
            } else if (jar == 5) {
                PLNT = "SAW";
            } else {
                PLNT = "TETH";
            }
        }
        if (Yar == 1) {
            if (yar == 1) {
                DICE = "DICE";
            } else if (yar == 2) {
                DICE = "DYCE";
            } else if (yar == 3) {
                DICE = "DIXE";
            } else if (yar == 4) {
                DICE = "DIZE";
            } else if (yar == 5) {
                DICE = "DIIC";
            } else {
                DICE = "CUBE";
            }
        } else {
            if (yar == 1) {
                DICE = "BLOK";
            } else if (yar == 2) {
                DICE = "FLUC";
            } else if (yar == 3) {
                DICE = "ROLL";
            } else if (yar == 4) {
                DICE = "ROLE";
            } else if (yar == 5) {
                DICE = "CUVE";
            } else {
                DICE = "TOSS";
            }
        }

        if (Tar == 1) {
            if (tar == 1) {
                LUZE = "LUZE";
            } else if (tar == 2) {
                LUZE = "LOSS";
            } else if (tar == 3) {
                LUZE = "LUSE";
            } else if (tar == 4) {
                LUZE = "LOSE";
            } else if (tar == 5) {
                LUZE = "DIAS";
            } else {
                int RorRx = new Random().nextInt(10);
                if (RorRx != 0) {
                    LUZE = "CRAS";
                }else {
                    LUZE = "C℞AS";
                }
            }
        } else {
            if (tar == 1) {
                int FoℲ = new Random().nextInt(10);
                if (FoℲ != 0) {
                    LUZE = "FALL";
                }else {
                    LUZE = "ℲALL";
                }
            } else if (tar == 2) {

                int GorGdown = new Random().nextInt(10);
                if (GorGdown != 0) {
                    LUZE = "HANG";
                }else {
                    LUZE = "HAN⅁";
                }

            } else if (tar == 3) {
                LUZE = "BOUN";
            } else if (tar == 4) {
                LUZE = "CHEK";
            } else if (tar == 5) {
                int RorRx = new Random().nextInt(7);
                if (RorRx != 0) {
                    LUZE = "REBN";
                }else {
                    LUZE = "℞EBN";
                }
            } else {
                LUZE = "SPIN";
            }
        }
        if (Rar == 1) {
            if (rar == 1) {
                BTC = "BTC";
            } else if (rar == 2) {
                BTC = "BICE";
            } else if (rar == 3) {
                BTC = "BIS";
            } else if (rar == 4) {
                BTC = "BIG";
            } else if (rar == 5) {
                BTC = "CRYP";
            } else {
                BTC = "COIN";
            }
        } else {
            if (rar == 1) {
                BTC = "BTCC";
            } else if (rar == 2) {
                BTC = "BYYC";
            } else if (rar == 3) {
                BTC = "BUTC";
            } else if (rar == 4) {
                BTC = "BTTC";
            } else if (rar == 5) {
                BTC = "BIC";
            } else {
                BTC = "BYC";
            }
        }
        if (Zar == 1) {
            if (zar == 1) {
                HAIR = "HAIR";
            } else if (zar == 2) {
                HAIR = "BUNI";
            } else if (zar == 3) {
                HAIR = "HOP";
            } else if (zar == 4) {
                HAIR = "RBIT";
            } else if (zar == 5) {
                HAIR = "RABT";
            } else {
                HAIR = "RBBT";
            }
        } else {
            if (zar == 1) {
                HAIR = "HAIRZ";
            } else if (zar == 2) {
                HAIR = "HARE";
            } else if (zar == 3) {
                HAIR = "HERE";
            } else if (zar == 4) {
                HAIR = "HERA";
            } else if (zar == 5) {
                HAIR = "BND";
            } else {
                HAIR = "BNY";
            }
        }
        setContentView(R.layout.activity_stock_mania_with_power);

        GraphView graph =(GraphView) findViewById(R.id.graph);

        NewStockArrowImageView = (ImageView) findViewById(R.id.SineArrow);
        TurtleArrowImageView = (ImageView) findViewById(R.id.TurtleArrow);
        DiceArrowImageView = (ImageView) findViewById(R.id.DiceArrow);

        BitcoinArrowImageView = (ImageView) findViewById(R.id.BitcoinArrow);
        PlantArrowImageView = findViewById(R.id.PlantArrow);
        LossArrowImageView = (ImageView) findViewById(R.id.LossArrow);
        HairArrowImageView = findViewById(R.id.HairArrow);


        Q1 = (TextView) findViewById(R.id.Q1);
        Q2 = (TextView) findViewById(R.id.Q2);
        Q3  = (TextView) findViewById(R.id.Q3);
        Q4 = (TextView) findViewById(R.id.Q4);
        Q5 = (TextView) findViewById(R.id.Q5);
        pen7 = (TextView) findViewById(R.id.pen7);
        pen8 = (TextView) findViewById(R.id.pen8);
        pen9  = (TextView) findViewById(R.id.pen9);
        penSINE = (TextView) findViewById(R.id.penSINE);
        TW = (TextView) findViewById(R.id.TW);
        QSine = (TextView) findViewById(R.id.QSINE);
        TestBox = (TextView) findViewById(R.id.Text);
        BankView = (TextView) findViewById(R.id.BankView);
        BuyTRTLStock = (Button) findViewById((R.id.buyTRTL));
        BuySINEStock = (Button) findViewById((R.id.buySINE));
        BuyDICEStock = (Button) findViewById((R.id.buyDICE));
        BuyBTCStock = (Button) findViewById((R.id.buyBTC));
        BuyPLNTStock = (Button) findViewById((R.id.buyPLNT));
        BuyLUZEStock = (Button) findViewById((R.id.buyLUZE));
        BuyHAREStock = (Button) findViewById((R.id.buyHARE));
        ResetGame = (Button) findViewById ((R.id.Reset));
        NextGame = (Button) findViewById(R.id.NextGame);
        Gumble = (Button) findViewById(R.id.Gamble);
        Mute = (Button) findViewById((R.id.Mute));
        beg = (Button) findViewById((R.id.Beg));
        Bank = (Button) findViewById((R.id.bank));
        Take = (Button) findViewById((R.id.Take));
        Fill = (Button) findViewById((R.id.Fill));
        Loan = (Button) findViewById((R.id.Loan));
        Pay = (Button) findViewById((R.id.Pay));
        DailyPapers = (TextView) findViewById(R.id.DailyPaper);
        TPV1 = (TextView) findViewById(R.id.Stock1);
        TPV2 = (TextView) findViewById(R.id.Stock2);
        TPV3 = (TextView) findViewById(R.id.Stock3);
        TPV4 = (TextView) findViewById(R.id.Stock4);
        TPV5 = (TextView) findViewById(R.id.Stock5);
        TPV6 = (TextView) findViewById(R.id.Stock6);
        TPV7 = (TextView) findViewById(R.id.StockSINE);
        PV0 = (TextView) findViewById(R.id.pen);
        PV1 = (TextView) findViewById(R.id.pen2);
        PV2 = (TextView) findViewById(R.id.pen3);
        PV3 = (TextView) findViewById(R.id.pen4);
        PV4 = (TextView) findViewById(R.id.pen5);
        PV5 = (TextView) findViewById(R.id.pen6);
        Tisl = (TextView) findViewById(R.id.List);
        PortfolioValueView = (TextView) findViewById(R.id.PortView);
        Increased = (TextView) findViewById(R.id.Increaser);

        ResetGame.setVisibility(View.INVISIBLE);
        NextGame.setVisibility(View.INVISIBLE);
        Take.setVisibility(View.INVISIBLE);
        Fill.setVisibility(View.INVISIBLE);
        Pay.setVisibility(View.INVISIBLE);
        Loan.setVisibility(View.INVISIBLE);
        BankView.setVisibility(View.INVISIBLE);
        Bank.setVisibility(View.INVISIBLE);
        Gumble.setVisibility(View.VISIBLE);
        beg.setVisibility(View.INVISIBLE);



        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                DiceChange = DicePrice;
                BitcoinChange = BitcoinPrice;
                PlantChange = PlantPrice;
                LossChange = LossLeaderPrice;
                SineChange = NewStockPrice;
                HairChange = HARE;
                TurtleChange = TurtlePrice;


                if (Day == 0 || Day == 1) {
                    logincrement = (Math.log(Money + PortfolioValue)/Math.log(1.618)) + 1;
                }


                if (Day == 0 || Day == 1){
                    DicePrice = (Math.ceil((DicePrice*100) + (new Random().nextInt(63)-31))/100);
                    BitcoinPrice = (Math.ceil((BitcoinPrice*100) + (new Random().nextInt(13)-5))/100);
                    PlantPrice = (Math.ceil((PlantPrice*100) + (new Random().nextInt(43)-21))/100);
                    LossLeaderPrice = (Math.ceil((LossLeaderPrice*100) + (new Random().nextInt(163)-71))/100);
                    NewStockPrice = (Math.ceil((NewStockPrice*100) + (new Random().nextInt(83)-41))/100);
                    HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                    TurtlePrice = (Math.ceil((TurtlePrice*100) + (new Random().nextInt(23)-11))/100);

                }


                // NextGameCounter = 0;
                //  resetCounter = 0;
                Day = Day + 1;


                TextView displayIntegerSay = (TextView) findViewById(R.id.Day);
                //  displayIntegerSay.setText("Day " + Day);


                if (BitcoinPrice <= 2){
                    BitcoinPrice = 3;
                }

                if (PlantPrice <= 19  || (PlantPrice >= -19 && PlantPrice <= 19)) {
                    PlantPrice = (new Random().nextInt(10) + 19);
                }
                if (LossLeaderPrice == 0) {
                    LossLeaderPrice = (-17 + (new Random().nextInt(101)-50)/100);
                }

                if (DicePrice < 10 && DicePrice > -10) {
                    DicePrice = (13 + (new Random().nextInt(101))/100);
                }


                switch(GameMode) {
                    case 1:


                        if (NewStockPrice < 21) {
                            NewStockPrice = 22;
                        }
                        if (new Random().nextInt(7) >= 1) {

                            if (COSSINSwitch == 3) {
                                if (50 < (((Math.floor(100 * (Math.abs((100 * (((Math.cos(Day * 0.0174533 * NewCycle)))))) + 2))) / 100))) {
                                    NewStockPrice = ((Math.floor(100 * (Math.abs((100 * (((Math.cos(Day * 0.0174533 * NewCycle)))))) + 2))) / 100);
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            } else if (COSSINSwitch == 2) {
                                if (50 < ((Math.floor(100 * ((Math.abs((100 * (((Math.sin(Day * 0.0174533 * NewCycle)))))) + 2)))) / 100)) {
                                    NewStockPrice = (Math.floor(100 * ((Math.abs((100 * (((Math.sin(Day * 0.0174533 * NewCycle)))))) + 2)))) / 100;
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            }
                            else if (COSSINSwitch == 1) {
                                if (61 < (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.sin(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2)) && HighCosSwitch > (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.sin(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2))) {
                                    NewStockPrice = (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.sin(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2));
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            }else {
                                if (50 < ((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2) {
                                    NewStockPrice = ((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2;
                                } else {
                                    NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                                }
                            }
                        }


                        if (TurtlePrice >= (new Random().nextInt(5) - 10) && TurtlePrice <= (new Random().nextInt(5) + 5)) {
                            TurtlePrice = (new Random().nextInt(6) + 6);
                        }
                        if (HARE >= (new Random().nextInt(5) - 10) && HARE <= (new Random().nextInt(3) + 4)) {
                            HARE = (new Random().nextInt(6) + 6);
                            HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);

                        }


                        int BreakingPoint = new Random().nextInt(10);

                        if ((new Random().nextInt(11) < 7)) {
                            switch (Fandom) {
                                case 1:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(900) - 400)))) / 100);
                                    if (DicePrice <= 19) {
                                        DicePrice = (new Random().nextInt(5) + 20);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);

                                    } else {
                                        if (DicePrice >= 62) {
                                            DicePrice = (new Random().nextInt(4) + 55);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 2:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1700) - 800)))) / 100);
                                    if (DicePrice <= 25) {
                                        DicePrice = (new Random().nextInt(6) + 36);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 110) {
                                            DicePrice = (new Random().nextInt(4) + 95);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 3:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1900) - 900)))) / 100);
                                    if (DicePrice <= 19) {
                                        DicePrice = (new Random().nextInt(7) + 19);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 43) {
                                            DicePrice = (new Random().nextInt(4) + 27);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 4:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1500) - 700)))) / 100);
                                    if (DicePrice <= 18) {
                                        DicePrice = (new Random().nextInt(7) + 19);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 38) {
                                            DicePrice = (new Random().nextInt(4) + 23);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);

                                        }
                                    }
                                    break;
                                case 5:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1100) - 500)))) / 100);
                                    if (DicePrice <= 16) {
                                        DicePrice = (new Random().nextInt(3) + 17);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 42) {
                                            DicePrice = (new Random().nextInt(4) + 27);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                default:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1700) - 800)))) / 100);
                                    if (DicePrice <= 32) {
                                        DicePrice = (new Random().nextInt(4) + 33);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 120) {
                                            DicePrice = (new Random().nextInt(4) + 112);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                            }
                        }
                        if (new Random().nextInt(5)==0) {
                            switch (Wandom) {
                                case 1:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 5;
                                    } else if (BitcoinPrice < 12) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 12 && BitcoinPrice <= 310) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((301) - 100)/100);
                                    } else if (BitcoinPrice > 310 && BitcoinPrice <= 1000) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((2002) - 201)/100);
                                    } else if (BitcoinPrice > 1000 && BitcoinPrice <= 2660) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((2900) - 950)/100);
                                    } else if (BitcoinPrice > 2660 && BitcoinPrice <= 12500) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((6001) - 2900)/100);
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher >= 57){
                                            BitcoinPrice = (BitcoinPrice / (5 + (new Random().nextInt(5)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 12501 / 12500);
                                        }

                                    }
                                    break;
                                case 2:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 4;
                                    } else if (BitcoinPrice < 12) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((201) + 1)/100);
                                    } else if (BitcoinPrice >= 12 && BitcoinPrice <= 68) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((401) - 110)/100);
                                    } else if (BitcoinPrice > 68 && BitcoinPrice <= 97) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((701) - 250)/100);
                                    } else if (BitcoinPrice > 97 && BitcoinPrice <= 101) {
                                        if (BreakingPoint == 9) {
                                            BitcoinPrice = BitcoinPrice + (new Random().nextInt((301) - 149)/100);
                                        }
                                    } else if (BitcoinPrice > 101 && BitcoinPrice <= 375) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((6001) - 1950)/100);
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (2 + (new Random().nextInt(4)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 376 / 375);
                                        }
                                    }
                                    break;
                                case 3:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 3;
                                    } else if (BitcoinPrice < 9) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((200) + 250)/100);
                                    } else if (BitcoinPrice >= 9 && BitcoinPrice <= 18) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((501) - 150)/100);
                                    } else if (BitcoinPrice > 18 && BitcoinPrice <= 21) {
                                        if (BreakingPoint == 9) {
                                            BitcoinPrice = BitcoinPrice + (new Random().nextInt((301) - 120)/100);
                                        }
                                    } else if (BitcoinPrice > 21 && BitcoinPrice <= 266) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((1901) - 950)/100);
                                    } else if (BitcoinPrice > 266 && BitcoinPrice <= 566) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((6001) - 2101)/100);
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(4)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 567 / 566);
                                        }
                                    }
                                    break;
                                case 4:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 20;
                                    } else if (BitcoinPrice < 129) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((201))/100);
                                    } else if (BitcoinPrice >= 129 && BitcoinPrice <= 159) {
                                        if (BreakingPoint == 9) {
                                            BitcoinPrice = BitcoinPrice + (new Random().nextInt((401) - 145)/100);
                                        }
                                    } else if (BitcoinPrice > 159 && BitcoinPrice <= 386) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((701) - 250)/100);
                                    } else if (BitcoinPrice > 386 && BitcoinPrice <= 1250) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((2101) - 950)/100);
                                    } else if (BitcoinPrice > 1250 && BitcoinPrice <= 1750) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((6001) - 3150)/100);
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher >= 58){
                                            BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(5)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 1751 / 1750);
                                        }
                                    }
                                    break;
                                case 5:
                                    if (BitcoinPrice < 2) {
                                        BitcoinPrice = 3;
                                    } else if (BitcoinPrice < 5) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((251) - 140)/100);
                                    } else if (BitcoinPrice >= 5 && BitcoinPrice <= 21) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((401) - 150)/100);
                                    } else if (BitcoinPrice > 21 && BitcoinPrice <= 65) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((701) - 250)/100);
                                    } else if (BitcoinPrice > 65 && BitcoinPrice <= 180) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((2950) - 999)/100);
                                    } else if (BitcoinPrice > 180 && BitcoinPrice <= 750) {
                                        BitcoinPrice = BitcoinPrice + (new Random().nextInt((6101) - 1650)/100);
                                    } else {
                                        if (BreakingPoint == 9) {
                                            int Crasher = new Random().nextInt(60);
                                            if (Crasher >= 52){
                                                BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(5)-1)));
                                            }else {
                                                BitcoinPrice = (BitcoinPrice * 751 / 750);
                                            }
                                        } else {
                                            BitcoinPrice = BitcoinPrice + (new Random().nextInt((501) - 250)/100);
                                        }
                                    }
                                    break;
                            }
                        }else{
                            BitcoinPrice = BitcoinPrice + (new Random().nextInt((321) - 111)/100);
                        }
                        if (new Random().nextInt(4) == 1) {
                            switch (Nandom) {
                                case 1:

                                    if (PlantPrice <= ((new Random().nextInt(50) + 650))) {
                                        PlantPrice = ((PlantPrice * (new Random().nextInt(13) + 97) / 100) + (PlantPrice/((new Random().nextInt(TurtDivLegacy)+9))));
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(5) + 6);
                                    }
                                    break;
                                case 2:
                                    if (PlantPrice <= ((new Random().nextInt(60) + 510))) {
                                        PlantPrice = ((PlantPrice * (new Random().nextInt(14) + 96) / 100) + (PlantPrice/((new Random().nextInt(TurtDivLegacy)+8))));
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(4) + 5);
                                    }
                                    break;
                                case 3:
                                    if (PlantPrice <= ((new Random().nextInt(70) + 440))) {
                                        PlantPrice = ((PlantPrice * (new Random().nextInt(15) + 95) / 100) + (PlantPrice/((new Random().nextInt(TurtDivLegacy)+7))));
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(4) + 4);
                                    }
                                    break;
                                case 4:
                                    if (PlantPrice <= ((new Random().nextInt(80) + 310))) {
                                        PlantPrice = ((PlantPrice * (new Random().nextInt(16) + 95) / 100) + (PlantPrice/((new Random().nextInt(TurtDivLegacy)+6))));
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(4) + 3);
                                    }
                                    break;
                                case 5:
                                    if (PlantPrice <= ((new Random().nextInt(90) + 740))) {
                                        PlantPrice = ((PlantPrice * (new Random().nextInt(17) + 94) / 100) + (PlantPrice/((new Random().nextInt(TurtDivLegacy)+10))));

                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(3) + 3);
                                    }
                                    break;
                            }
                        }


                        if (LossLeaderPrice == 0) {
                            LossLeaderPrice = -18;
                        }

                        switch (LossMinModeSetter) {
                            case 1:
                                if (LossLeaderPrice < 18 && LossLeaderPrice > -17) {
                                    LossLeaderPrice = -18;
                                }
                                if (new Random().nextInt(3) == 0) {

                                    if (LossLeaderPrice <= 60 && LossLeaderPrice >= 1) {

                                        LossLeaderPrice = LossLeaderPrice + new Random().nextInt(4) - 3;
                                        if (LossLeaderPrice < 18 && LossLeaderPrice > -17) {
                                            LossLeaderPrice = -18;
                                        }
                                    } else {
                                        whatamimeasuring =  ((((Day * ((2 * LossLimiter) / 3)) * -1)) + (new Random().nextInt(61) - Day));

                                        if (LossLeaderPrice <= whatamimeasuring || LossLeaderPrice <= (-1*(new Random().nextInt(17123) + 10000 + Day) )) {
                                            double Days = Day;
                                            double DayLoser = Math.floor(Days / 20);
                                            int RandaLoss = new Random().nextInt(8);
                                            LossLeaderPrice = (Math.abs(LossLeaderPrice + (RandaLoss - (15 + DayLoser)))) + ((new Random().nextInt(101) - 50) / 100);
                                        } else {
                                            LossLeaderPrice = (LossLeaderPrice + (((new Random().nextInt(101) - 50) / 100) + new Random().nextInt(5) - (15 + (((2 * LossLimiter) / 3) * (new Random().nextInt(5))) + ((new Random().nextInt(101) - 50) / 100))));
                                        }
                                    }
                                } else {
                                    LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                }
                                break;
                            case 2:
                                if (LossLeaderPrice < 25 && LossLeaderPrice > -24) {
                                    LossLeaderPrice = -25;
                                }
                                if (new Random().nextInt(3) == 0) {

                                    if (LossLeaderPrice <= 75 && LossLeaderPrice >= 1) {

                                        LossLeaderPrice = LossLeaderPrice + new Random().nextInt(4) - 3;
                                        if (LossLeaderPrice < 25 && LossLeaderPrice > -24) {
                                            LossLeaderPrice = -25;
                                        }
                                    } else {

                                        whatamimeasuring = (((((Day * ((2 * LossLimiter) / 3)) * -1)) + (new Random().nextInt(61) - Day))*.86);


                                        if (LossLeaderPrice <= whatamimeasuring || LossLeaderPrice <= (-1*(new Random().nextInt(18123) + 9000 + (Day%losslimiterdaycapper)))) {
                                            double Days = Day;
                                            double DayLoser = Math.floor(Days / 14);
                                            int RandaLoss = new Random().nextInt(8);
                                            LossLeaderPrice = (Math.abs(LossLeaderPrice + (RandaLoss - (15 + DayLoser)))) + ((new Random().nextInt(101) - 50) / 100);
                                        } else {
                                            LossLeaderPrice = (LossLeaderPrice + (((new Random().nextInt(101) - 50) / 100) + new Random().nextInt(5) - (15 + (((2 * LossLimiter) / 3) * (new Random().nextInt(5))) + ((new Random().nextInt(101) - 50) / 100))));
                                        }
                                    }
                                } else {
                                    LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                }
                                break;
                            case 3:
                                if (LossLeaderPrice < (25 + (Math.floor(Day/81))) && LossLeaderPrice > (-24 - (Math.floor(Day/81)))) {
                                    LossLeaderPrice = (-25 - (Math.floor(Day/81)));
                                }
                                if (new Random().nextInt(3) == 0) {

                                    if (LossLeaderPrice <= (75 + (Math.floor(Day/31))) && LossLeaderPrice >= 1) {

                                        LossLeaderPrice = LossLeaderPrice + new Random().nextInt(4) - 3;
                                        if (LossLeaderPrice < (15 + (Math.floor(Day/81))) && LossLeaderPrice > (-24 - (Math.floor(Day/81)))) {
                                            LossLeaderPrice = (-25 - (Math.floor(Day/81)));
                                        }
                                    } else {
                                        whatamimeasuring =((((Day * ((2 * LossLimiter) / 3)) * -1)) + (new Random().nextInt(61) - Day));


                                        if (LossLeaderPrice <= whatamimeasuring || LossLeaderPrice <= (-1*(new Random().nextInt(7123) + 5000 + (Day%losslimiterdaycapper)))) {
                                            double Days = Day;
                                            double DayLoser = Math.floor(Days / 15);
                                            int RandaLoss = new Random().nextInt(10);
                                            LossLeaderPrice = (Math.abs(LossLeaderPrice + (RandaLoss - (15 + DayLoser)))) + ((new Random().nextInt(101) - 50) / 100);
                                        } else {
                                            LossLeaderPrice = (LossLeaderPrice + (((new Random().nextInt(101) - 50) / 100) + new Random().nextInt(5) - (15 + (((2 * LossLimiter) / 3) * (new Random().nextInt(5))) + ((new Random().nextInt(101) - 50) / 100))));
                                        }
                                    }
                                } else {
                                    LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                }
                                break;
                            case 4:
                                if (LossLeaderPrice < (35 + (Math.floor(Day/61))) && LossLeaderPrice > (-34 - (Math.floor(Day/61)))) {
                                    LossLeaderPrice = (-35 - (Math.floor(Day/61)));
                                }
                                if (new Random().nextInt(3) == 0) {

                                    if (LossLeaderPrice <= (75 + (Math.floor(Day/31))) && LossLeaderPrice >= 1) {

                                        LossLeaderPrice = LossLeaderPrice + new Random().nextInt(4) - 3;
                                        if (LossLeaderPrice < (35 + (Math.floor(Day/61))) && LossLeaderPrice > (-34 - (Math.floor(Day/61)))) {
                                            LossLeaderPrice = (-35 - (Math.floor(Day/61)));
                                        }
                                    } else {

                                        whatamimeasuring = ((((Day * ((((61 + Cyclops) * 0.8) * LossLimiter) / ((Cyclops + 79) * 1.2))) * -1)) + (new Random().nextInt(61) - Day));


                                        if (LossLeaderPrice <= whatamimeasuring || LossLeaderPrice <= (-1*(new Random().nextInt(27123) + 13000 + (Day%losslimiterdaycapper)))) {
                                            double Days = Day;
                                            double DayLoser = Math.floor(Days / ((((1+nandom)*(1+wandom)*(1+gandom))+3)));
                                            int RandaLoss = new Random().nextInt(10);
                                            LossLeaderPrice = (Math.abs(LossLeaderPrice + (RandaLoss - (15 + DayLoser)))) + ((new Random().nextInt(101) - 50) / 100);
                                        } else {
                                            LossLeaderPrice = (LossLeaderPrice + (((new Random().nextInt(101) - 50) / 100) + new Random().nextInt(5) - (15 + (((2 * LossLimiter) / 3) * (new Random().nextInt(5))) + ((new Random().nextInt(101) - 50) / 100))));
                                        }
                                    }
                                } else {
                                    if (BreakingPoint == 5 || (new Random().nextInt(7)) <=2 )
                                        LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                }
                                break;
                        }




                        int X = (new Random().nextInt(5) - 4);

                        if (TurtSwitch == 1) {

                            //      if (TurtlePrice >= ((((((((Day / TurtDiv) + TurtCeiling))/2)) + ((Day / TurtDiv))))+35) || TurtlePrice >= ((new Random().nextInt(50)+450))) {
                            //                                TurtlePrice = Math.abs(TurtlePrice) * -1; // cant remember if this is supposed to have a Math.abs or not, originally did not
                            //                            }


                            if ((new Random().nextInt(11) < 9)) {
                                if (TurtlePrice >= ((((((((Day / TurtDiv) + TurtCeiling)) / 2)) + ((Day / TurtDiv)))) + 15) || TurtlePrice >= (new Random().nextInt(50) + 289)) {
                                    TurtlePrice = Math.abs(TurtlePrice) * -1;
                                }
                                if (TurtlePrice < 1 && HARE >= 1) {
                                    HARE = Math.abs(HARE) * -1;
                                }
                                if (X == 0) {
                                    if (((Math.abs(HARE) - Math.abs(TurtlePrice)) >= 1)) {
                                        int TurtelyEnough = new Random().nextInt(25);
                                        if (TurtelyEnough <= 0) {
                                            TurtlePrice = (Math.ceil((((TurtlePrice * 100) * (new Random().nextInt(125000001) + 999999999) / 1000000000) + 1)) + 1) / 100;
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 4;
                                            } else {
                                                HARE = ((Math.ceil(HARE * 100) + new Random().nextInt(700) - 345) / 100);
                                            }
                                        } else {
                                            TurtlePrice = ((Math.ceil(TurtlePrice * 100) + new Random().nextInt(500) - 231) / 100);
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 4;
                                                HARE = ((Math.ceil(HARE * 100) + new Random().nextInt(700) - 345) / 100);
                                            } else {

                                                HARE = ((Math.ceil(HARE * 100) + new Random().nextInt(300) - 125) / 100);
                                            }
                                        }
                                    } else {

                                        if (HARE > 0) {
                                            HARE = HARE + (Math.floor((((TurtlePrice - HARE) % 8)) * (((Math.abs(TurtlePrice) - Math.abs(HARE))) / 7)));
                                            HARE = (Math.ceil((HARE * 100) + (new Random().nextInt(33) - 21)) / 100);
                                            TurtlePrice = (TurtlePrice + (new Random().nextInt(5) - 3));
                                        } else {
                                            HARE = TurtlePrice;
                                            TurtlePrice = (TurtlePrice + (new Random().nextInt(5) - 3));
                                        }
                                    }

                                } else {
                                    int TurtelyEnough = new Random().nextInt(10);

                                    if (TurtlePrice == 0) {
                                        TurtlePrice = 1;
                                        if (HARE >= TurtlePrice) {
                                            if (TurtelyEnough == 0) {
                                                TurtlePrice = Math.abs(Math.floor(((TurtlePrice * (new Random().nextInt(120000001) + 1000000001) / 1000000000) + 1) + 1));
                                                if (TurtlePrice == 0) {
                                                    TurtlePrice = 1;
                                                }
                                            } else {
                                                TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                                if (TurtlePrice == 0) {
                                                    TurtlePrice = 1;
                                                }
                                            }
                                        } else {
                                            TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 1;
                                            }
                                        }
                                    } else {
                                        if (HARE >= TurtlePrice) {
                                            if (TurtelyEnough == 0) {
                                                TurtlePrice = ((Math.floor((((TurtlePrice * 100) * (new Random().nextInt(135000001) + 1000000001) / 1000000000) + 1) + 1)) / 100);
                                                if (TurtlePrice == 0) {
                                                    TurtlePrice = 1;
                                                    TurtlePrice = TurtlePrice + 1.01;
                                                } else {
                                                    TurtlePrice = TurtlePrice + 1.01;
                                                }
                                            } else {
                                                TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                                if (TurtlePrice == 0) {
                                                    TurtlePrice = 6;
                                                    TurtlePrice = TurtlePrice + 1;
                                                } else {
                                                    TurtlePrice = TurtlePrice + 1;
                                                }
                                                TurtlePrice = TurtlePrice + 1;
                                            }
                                        } else {
                                            TurtlePrice = (TurtlePrice + (new Random().nextInt(4) - 3));
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 7;
                                                TurtlePrice = TurtlePrice + 1;
                                            } else {
                                                TurtlePrice = TurtlePrice + 1;
                                            }
                                            TurtlePrice = TurtlePrice + 1;
                                        }
                                    }
                                }
                            }
                        }

                        else if (TurtSwitch == 2) {
                            if ((new Random().nextInt(11) < 9)) {
                                if (HARE >= ((((((((Day / TurtDiv) + TurtCeiling)) / 2)) + ((Day / TurtDiv)))) + 15) || HARE >= (new Random().nextInt(50) + 289)) {
                                    HARE = Math.abs(HARE) * -1;
                                }
                                if (HARE < 1 && TurtlePrice >= 1) {
                                    TurtlePrice = Math.abs(TurtlePrice) * -1;
                                }
                                if (X == 0) {
                                    if (((Math.abs(TurtlePrice) - Math.abs(HARE)) >= 1)) {
                                        int TurtelyEnough = new Random().nextInt(25);
                                        if (TurtelyEnough <= 0) {
                                            HARE = (Math.ceil((((HARE * 100) * (new Random().nextInt(125000001) + 999999999) / 1000000000) + 1)) + 1) / 100;
                                            if (HARE == 0) {
                                                HARE = 4;
                                            } else {
                                                TurtlePrice = ((Math.ceil(TurtlePrice * 100) + new Random().nextInt(700) - 345) / 100);
                                            }
                                        } else {
                                            HARE = ((Math.ceil(HARE * 100) + new Random().nextInt(500) - 231) / 100);
                                            if (HARE == 0) {
                                                HARE = 4;
                                                TurtlePrice = ((Math.ceil(TurtlePrice * 100) + new Random().nextInt(700) - 345) / 100);
                                            } else {

                                                TurtlePrice = ((Math.ceil(TurtlePrice * 100) + new Random().nextInt(300) - 125) / 100);
                                            }
                                        }
                                    } else {

                                        if (TurtlePrice > 0) {
                                            TurtlePrice = TurtlePrice + (Math.floor((((HARE - TurtlePrice) % 8)) * (((Math.abs(HARE) - Math.abs(TurtlePrice))) / 7)));
                                            TurtlePrice = (Math.ceil((TurtlePrice * 100) + (new Random().nextInt(33) - 21)) / 100);
                                            HARE = (HARE + (new Random().nextInt(5) - 3));
                                        } else {
                                            TurtlePrice = HARE;
                                            HARE = (HARE + (new Random().nextInt(5) - 3));
                                        }
                                    }

                                } else {
                                    int TurtelyEnough = new Random().nextInt(10);

                                    if (HARE == 0) {
                                        HARE = 1;
                                        if (TurtlePrice >= HARE) {
                                            if (TurtelyEnough == 0) {
                                                HARE = Math.abs(Math.floor(((HARE * (new Random().nextInt(120000001) + 1000000001) / 1000000000) + 1) + 1));
                                                if (HARE == 0) {
                                                    HARE = 1;
                                                }
                                            } else {
                                                HARE = HARE + (new Random().nextInt(4) - 1);
                                                if (HARE == 0) {
                                                    HARE = 1;
                                                }
                                            }
                                        } else {
                                            HARE = HARE + (new Random().nextInt(4) - 1);
                                            if (HARE == 0) {
                                                HARE = 1;
                                            }
                                        }
                                    } else {
                                        if (TurtlePrice >= HARE) {
                                            if (TurtelyEnough == 0) {
                                                HARE = ((Math.floor((((HARE * 100) * (new Random().nextInt(135000001) + 1000000001) / 1000000000) + 1) + 1)) / 100);
                                                if (HARE == 0) {
                                                    HARE = 1;
                                                    HARE = HARE + 1.01;
                                                } else {
                                                    HARE = HARE + 1.01;
                                                }
                                            } else {
                                                HARE = HARE + (new Random().nextInt(4) - 1);
                                                if (HARE == 0) {
                                                    HARE = 6;
                                                    HARE = HARE + 1;
                                                } else {
                                                    HARE = HARE + 1;
                                                }
                                                HARE = HARE + 1;
                                            }
                                        } else {
                                            HARE = (HARE + (new Random().nextInt(4) - 3));
                                            if (HARE == 0) {
                                                HARE = 7;
                                                HARE = HARE + 1;
                                            } else {
                                                HARE = HARE + 1;
                                            }
                                            HARE = HARE + 1;
                                        }
                                    }
                                }
                            }
                        }

                        break;

                    case 2:

                        if (NewStockPrice < 21){
                            NewStockPrice = 22;
                        }



                        if (new Random().nextInt(7) >= 2) {
                            if (COSSINSwitch == 3) {
                                if (50 < ((Math.floor(100 * (Math.abs((100 * (((Math.cos(Day * 0.0174533 * NewCycle)))))) + 2))) / 100)) {
                                    NewStockPrice = ((Math.floor(100 * (Math.abs((100 * (((Math.cos(Day * 0.0174533 * NewCycle)))))) + 2))) / 100);
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            } else if (COSSINSwitch == 2) {
                                if (50 < ((Math.floor(100 * ((Math.abs((100 * (((Math.sin(Day * 0.0174533 * NewCycle)))))) + 2)))) / 100)) {
                                    NewStockPrice = (Math.floor(100 * ((Math.abs((100 * (((Math.sin(Day * 0.0174533 * NewCycle)))))) + 2)))) / 100;
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            }  else if (COSSINSwitch == 1) {
                                if (61 < (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2)) && HighCosSwitch > (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2))) {
                                    NewStockPrice = (2*(((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2));
                                } else {
                                    NewStockPrice = NewStockPrice + (new Random().nextInt(3) - 1);
                                }
                                NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                            } else {
                                if (50 < (((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2)) {
                                    NewStockPrice = ((Math.floor(((Math.abs((100 * (Math.sqrt(Math.cos(Day * 0.0174533 * NewCycle))))))) * 100)) / 100) + 2;
                                } else {
                                    NewStockPrice = ((NewStockPrice * 100) + (new Random().nextInt(301) - 150)) / 100;
                                }
                            }
                        }


                        if (TurtlePrice >= (new Random().nextInt(5)-10) && TurtlePrice <= (new Random().nextInt(5) + 5)){
                            TurtlePrice = (new Random().nextInt(6) + 6);
                        }
                        if (HARE >= (new Random().nextInt(5)-10) && HARE <= (new Random().nextInt(5) + 5)){
                            HARE = (new Random().nextInt(6) + 6);
                        }
/*
                            double TurtleRacer = ((((((((Day / TurtDiv) + TurtCeiling))/2)) + ((Day / TurtDiv)))) + 35);
                            if (TurtlePrice >= TurtleRacer || TurtlePrice >= (new Random().nextInt(50) + 450)) {
                                TurtlePrice = Math.abs(TurtlePrice) * -1; // cant remember if this is supposed to have a Math.abs or not, originally did not
                            }
                            if (TurtlePrice < 1 && HARE >= 1){
                                HARE = Math.abs(HARE) * -1;
                            } */



                        if ((new Random().nextInt(11) < 7)) {
                            switch (Fandom) {
                                case 1:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(700) - 300)))) / 100);
                                    if (DicePrice <= 18) {
                                        DicePrice = (new Random().nextInt(4) + 9);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 54) {
                                            DicePrice = (new Random().nextInt(4) + 49);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 2:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(2100) - 1000)))) / 100);
                                    if (DicePrice <= 25) {
                                        DicePrice = (new Random().nextInt(4) + 26);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 79) {
                                            DicePrice = (new Random().nextInt(4) + 74);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 3:

                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1900) - 900)))) / 100);
                                    if (DicePrice <= 28) {
                                        DicePrice = (new Random().nextInt(4) + 19);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 58) {
                                            DicePrice = (new Random().nextInt(4) + 53);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 4:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1500) - 700)))) / 100);
                                    if (DicePrice <= 13) {
                                        DicePrice = (new Random().nextInt(4) + 14);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 32) {
                                            DicePrice = (new Random().nextInt(4) + 27);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                case 5:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1700) - 800)))) / 100);
                                    if (DicePrice <= 30) {
                                        DicePrice = (new Random().nextInt(4) + 33);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 150) {
                                            DicePrice = (new Random().nextInt(4) + 142);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                                default:
                                    DicePrice = ((Math.ceil((DicePrice * 100) + ((new Random().nextInt(1700) - 800)))) / 100);
                                    if (DicePrice <= 30) {
                                        DicePrice = (new Random().nextInt(4) + 33);
                                        DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                    } else {
                                        if (DicePrice >= 120) {
                                            DicePrice = (new Random().nextInt(4) + 112);
                                            DicePrice = (Math.ceil((DicePrice * 100) + (new Random().nextInt(63) - 31)) / 100);
                                        }
                                    }
                                    break;
                            }
                        }
                        if (new Random().nextInt(3)==0) {
                            switch (Wandom) {
                                case 1:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 5;
                                    } else if (BitcoinPrice < 12) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 12 && BitcoinPrice <= 310) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(4) - 1;
                                    } else if (BitcoinPrice > 310 && BitcoinPrice <= 1000) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(7) - 2;
                                    } else if (BitcoinPrice > 1000 && BitcoinPrice <= 2660) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(21) - 9;
                                    } else if (BitcoinPrice > 2660 && BitcoinPrice <= 12500) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(60) - 28;
                                    } else { int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (5 + (new Random().nextInt(6)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 12501 / 12500);
                                        }


                                    }
                                    break;
                                case 2:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 4;
                                    } else if (BitcoinPrice < 12) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 12 && BitcoinPrice <= 68) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(4) - 1;
                                    } else if (BitcoinPrice > 68 && BitcoinPrice <= 177) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(7) - 2;
                                    } else if (BitcoinPrice > 177 && BitcoinPrice <= 566) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(21) - 9;
                                    } else if (BitcoinPrice > 566 && BitcoinPrice <= 3250) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(60) - 19;
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(5)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 3251 / 3250);
                                        }


                                    }
                                    break;
                                case 3:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 3;
                                    } else if (BitcoinPrice < 9) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 9 && BitcoinPrice <= 18) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(5) - 2;
                                    } else if (BitcoinPrice > 18 && BitcoinPrice <= 100) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(21) + 5;
                                    } else if (BitcoinPrice > 100 && BitcoinPrice <= 266) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(19) - 9;
                                    } else if (BitcoinPrice > 266 && BitcoinPrice <= 1250) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(60) - 21;
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(5)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 1251 / 1250);
                                        }


                                    }
                                    break;
                                case 4:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 20;
                                    } else if (BitcoinPrice < 120) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 120 && BitcoinPrice <= 159) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(4) - 1;
                                    } else if (BitcoinPrice > 159 && BitcoinPrice <= 386) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(7) - 2;
                                    } else if (BitcoinPrice > 386 && BitcoinPrice <= 1250) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(21) - 9;
                                    } else if (BitcoinPrice > 1250 && BitcoinPrice <= 2000) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(60) - 26;
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher == 59){
                                            BitcoinPrice = (BitcoinPrice / (4 + (new Random().nextInt(5)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 2001 / 2000);
                                        }

                                    }
                                    break;
                                case 5:
                                    if (BitcoinPrice == 0) {
                                        BitcoinPrice = 2;
                                    } else if (BitcoinPrice < 3) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(2);
                                    } else if (BitcoinPrice >= 3 && BitcoinPrice <= 21) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(4) - 1;
                                    } else if (BitcoinPrice > 21 && BitcoinPrice <= 65) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(7) - 2;
                                    } else if (BitcoinPrice > 65 && BitcoinPrice <= 180) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(21) - 9;
                                    } else if (BitcoinPrice > 180 && BitcoinPrice <= 3560) {
                                        BitcoinPrice = BitcoinPrice + new Random().nextInt(60) - 15;
                                    } else {
                                        int Crasher = new Random().nextInt(60);
                                        if (Crasher >= 58){
                                            BitcoinPrice = (BitcoinPrice / (3 + (new Random().nextInt(4)-1)));
                                        }else {
                                            BitcoinPrice = (BitcoinPrice * 3561 / 3560);
                                        }

                                    }
                                    break;
                            }
                        }else {
                            BitcoinPrice = BitcoinPrice + new Random().nextInt(3) - 1;

                        }
                        if (new Random().nextInt(5) == 1) {
                            switch (Nandom) {
                                case 1:
                                    if (PlantPrice <= (new Random().nextInt(50) + 450)) {
                                        PlantPrice = (PlantPrice * (new Random().nextInt(15) + 95) / 99);
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(5) + 5);
                                    }
                                    break;
                                case 2:
                                    if (PlantPrice <= (new Random().nextInt(60) + 410)) {
                                        PlantPrice = (PlantPrice * (new Random().nextInt(17) + 94) / 99);
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(6) + 6);
                                    }
                                    break;
                                case 3:
                                    if (PlantPrice <= (new Random().nextInt(70) + 340)) {
                                        PlantPrice = (PlantPrice * (new Random().nextInt(18) + 93) / 99);
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(7) + 7);
                                    }
                                    break;
                                case 4:
                                    if (PlantPrice <= (new Random().nextInt(80) + 210)) {
                                        PlantPrice = (PlantPrice * (new Random().nextInt(19) + 92) / 99);
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(9) + 9);
                                    }
                                    break;
                                case 5:
                                    if (PlantPrice <= (new Random().nextInt(90) + 140)) {
                                        PlantPrice = (PlantPrice * (new Random().nextInt(22) + 91) / 100);
                                    } else {
                                        PlantPrice = PlantPrice / (new Random().nextInt(15) + 5);
                                    }
                                    break;
                            }
                        }


                        switch (LossMinModeSetter) {
                            case 1:

                                if (LossLeaderPrice < 13 && LossLeaderPrice > -13) {
                                    LossLeaderPrice = (-14 + (new Random().nextInt(101) - 50) / 100);
                                }
                                if (new Random().nextInt(3) == 0) {
                                    if (LossLeaderPrice == 0) {
                                        LossLeaderPrice = (-17 + (new Random().nextInt(101) - 50) / 100);
                                    } else {
                                        if (LossLeaderPrice <= 40 && LossLeaderPrice >= 1) {

                                            LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(4) - 3) + ((new Random().nextInt(101) - 50) / 100);
                                            if (LossLeaderPrice < 13 && LossLeaderPrice > -13) {
                                                LossLeaderPrice = -14;
                                            }
                                        } else {
                                            if (LossLeaderPrice <= ((((Day * ((2 * LossLimiter) / 3)) * -1)) + (new Random().nextInt(61) - Day)) || LossLeaderPrice <= (-1*(new Random().nextInt(27123) + 8000 + (Day%losslimiterdaycapper)))) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - 15)) + ((new Random().nextInt(101) - 50) / 100);
                                            } else if (LossLeaderPrice <= ((Day % TrueRangeLossMax) + 101) * -1) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * (new Random().nextInt(4) + 3)))) + ((new Random().nextInt(101) - 50) / 100);
                                            } else {
                                                LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * ((new Random().nextInt(4) + 3))) + ((new Random().nextInt(101) - 50) / 100));
                                            }
                                        }
                                    }
                                } else {
                                    LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                }
                                break;

                            case 2:

                                if (LossLeaderPrice < 21 && LossLeaderPrice > -21) {
                                    LossLeaderPrice = (-22 + (new Random().nextInt(101) - 50) / 100);
                                }
                                if (new Random().nextInt(3) == 0) {
                                    if (LossLeaderPrice != 0) {
                                        if (LossLeaderPrice <= 66 && LossLeaderPrice >= 1) {

                                            LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(4) - 3) + ((new Random().nextInt(101) - 50) / 100);
                                            if (LossLeaderPrice < 21 && LossLeaderPrice > -21) {
                                                LossLeaderPrice = (-22 + (new Random().nextInt(101) - 50) / 100);
                                            }
                                        } else {
                                            if (LossLeaderPrice <= ((((Day * ((5 * LossLimiter) / 7)) * -1)) + (new Random().nextInt(61) - Day)) || LossLeaderPrice <= (-1*(new Random().nextInt(7123) + 7123 + (Day%losslimiterdaycapper)))) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - 15)) + ((new Random().nextInt(101) - 50) / 100);
                                            } else if (LossLeaderPrice <= ((Day % TrueRangeLossMax) + 101) * -1) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * (new Random().nextInt(4) + 3)))) + ((new Random().nextInt(101) - 50) / 100);
                                            } else {
                                                LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * ((new Random().nextInt(4) + 3))) + ((new Random().nextInt(101) - 50) / 100));
                                            }
                                        }
                                    }
                                } else {
                                    if (new Random().nextInt(5) <= 1) {
                                        LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(3) - 1) + ((new Random().nextInt(101) - 50) / 100);
                                    }
                                }
                                break;

                            case 3:

                                if (LossLeaderPrice < 31 && LossLeaderPrice > -30) {
                                    LossLeaderPrice = (-31 + (new Random().nextInt(101) - 50) / 100);
                                }
                                if (new Random().nextInt(3) == 0) {
                                    if (LossLeaderPrice == 0) {
                                        LossLeaderPrice = (-32 + (new Random().nextInt(101) - 50) / 100);
                                    } else {
                                        if (LossLeaderPrice <= 40 && LossLeaderPrice >= 1) {

                                            LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(4) - 3) + ((new Random().nextInt(101) - 50) / 100);
                                            if (LossLeaderPrice < 31 && LossLeaderPrice > -30) {
                                                LossLeaderPrice = (-31 + (new Random().nextInt(101) - 50) / 100);
                                            }
                                        } else {
                                            if (LossLeaderPrice <= ((((Day * ((3 * LossLimiter) / 4)) * -1)) + (new Random().nextInt(61) - Day)) || LossLeaderPrice <= (-1*(new Random().nextInt(9123) + 6000 + (Day%losslimiterdaycapper))) ) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(10) - 26)) + ((new Random().nextInt(101) - 52) / 100);
                                            } else if (LossLeaderPrice <= ((Day % TrueRangeLossMax) + 101) * -1) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * (new Random().nextInt(4) + 3)))) + ((new Random().nextInt(101) - 50) / 100);
                                            } else {
                                                LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * ((new Random().nextInt(4) + 3))) + ((new Random().nextInt(101) - 50) / 100));
                                            }
                                        }
                                    }
                                } else {
                                    if (new Random().nextInt(7) <= 2) {
                                        LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(5) - 2) + ((new Random().nextInt(101) - 50) / 100);
                                    }
                                }
                                break;
                            case 4:

                                if (LossLeaderPrice < (31 + (Math.floor(Day/(Cyclops*2)))) && LossLeaderPrice > (-30 - (Math.floor(Day/(Cyclops*2))))) {
                                    LossLeaderPrice = (-31 - (Math.floor(Day/(Cyclops*2))));
                                }
                                if (new Random().nextInt(3) == 0) {
                                    if (LossLeaderPrice < (31 + (Math.floor(Day/(Cyclops*2)))) && LossLeaderPrice > (-30 - (Math.floor(Day/(Cyclops*2))))) {
                                        LossLeaderPrice = (-31 - (Math.floor(Day/(Cyclops*2))));
                                    }else {
                                        if (LossLeaderPrice <= (40 + (Math.floor(Day/(Cyclops*2)))) && LossLeaderPrice >= 1) {
                                            LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(4) - 3) + ((new Random().nextInt(101) - 50) / 100);

                                            if (LossLeaderPrice < (31 + (Math.floor(Day/(Cyclops*2)))) && LossLeaderPrice > (-30 - (Math.floor(Day/(Cyclops*2))))) {
                                                LossLeaderPrice = (-31 - (Math.floor(Day / (Cyclops * 2))));
                                            }
                                        } else {
                                            if (LossLeaderPrice <= ((((Day * ((3 * LossLimiter) / 4)) * -1)) + (new Random().nextInt(61) - Day)) || LossLeaderPrice <= (-1*(new Random().nextInt(21123) + 7000 + (Day%losslimiterdaycapper)))) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(10) - 26)) + ((new Random().nextInt(101) - 52) / 100);
                                            } else if (LossLeaderPrice <= ((Day % TrueRangeLossMax) + (Cyclops*2)) * -1) {
                                                LossLeaderPrice = (Math.abs(LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * (new Random().nextInt(4) + 3)))) + ((new Random().nextInt(101) - 50) / 100);
                                            } else {
                                                LossLeaderPrice = (LossLeaderPrice + new Random().nextInt(5) - ((LossLimiter + 1) * ((new Random().nextInt(4) + 3))) + ((new Random().nextInt(101) - 50) / 100));
                                            }
                                        }
                                    }
                                } else {
                                    if (new Random().nextInt(18) <= 4) {
                                        LossLeaderPrice = LossLeaderPrice + (new Random().nextInt(5) - 2) + ((new Random().nextInt(101) - 50) / 100);
                                    }
                                }
                                break;

                        }

                        double TurtleRacer = ((((((((Day / TurtDiv) + TurtCeiling)) / 2)) + ((Day / TurtDiv)))) + 15);
                        if (TurtlePrice >= (new Random().nextInt(50) + 549) || TurtlePrice >= TurtleRacer) {
                            TurtlePrice = Math.abs(TurtlePrice) * -1;
                        }
                        if (TurtlePrice < 1 && HARE >= 1) {
                            HARE = Math.abs(HARE) * -1;
                        }


                        int Y = (new Random().nextInt(5) - 4);
                        if (Y == 0) {
                            if ((Math.abs(HARE) - Math.abs(TurtlePrice)) >= 1) {
                                int TurtelyEnough = new Random().nextInt(25);
                                if (TurtelyEnough <= 1) {
                                    TurtlePrice = Math.round((((TurtlePrice) * (new Random().nextInt(125000001) + 999999999) / 1000000000) + 1)) + 1;
                                    if (TurtlePrice == 0) {
                                        TurtlePrice = 1;
                                    } else {
                                        HARE = HARE + new Random().nextInt(4) - 2;
                                        HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                                    }
                                } else {
                                    TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                    if (TurtlePrice == 0) {
                                        TurtlePrice = 1;
                                        HARE = HARE + (new Random().nextInt((5) - 2));
                                        HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                                    } else {

                                        HARE = HARE + (new Random().nextInt((5) - 2));
                                        HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                                    }
                                }
                            } else {
                                if (HARE > 0) {
                                    HARE = HARE + (Math.floor((((TurtlePrice - HARE) % 10)) * (((Math.abs(TurtlePrice) - Math.abs(HARE))) / 9)));
                                    HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                                    TurtlePrice = (TurtlePrice + (new Random().nextInt(5) - 3));
                                }else{
                                    HARE = TurtlePrice;
                                    TurtlePrice = (TurtlePrice + (new Random().nextInt(5) - 3));
                                }
                            }

                        } else {
                            int TurtelyEnough = new Random().nextInt(10);
                            if ((new Random().nextInt(11) < 9)) {
                                if (TurtlePrice == 0) {
                                    TurtlePrice = 1;
                                    if (((Math.abs(HARE) - Math.abs(TurtlePrice))) >= 1) {
                                        if (TurtelyEnough == 0) {
                                            if (TurtlePrice > 0 ) {
                                                if (TurtlePrice > 0 ) {
                                                    TurtlePrice = (Math.floor(((TurtlePrice * (new Random().nextInt(125000001) + 1000000001) / 1000000000) + 1) + 1));
                                                } else if (TurtlePrice < 0 ) {
                                                    TurtlePrice = TurtlePrice / (Math.floor((((new Random().nextInt(125000001) + 1000000001) / 1000000000))));
                                                }else{
                                                    TurtlePrice = TurtleChange;
                                                }
                                            } else if (TurtlePrice < 0 ) {
                                                TurtlePrice = TurtlePrice / (Math.floor((((new Random().nextInt(125000001) + 1000000001) / 1000000000))));
                                            }else{
                                                TurtlePrice = TurtleChange;
                                            }
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 1;
                                            }
                                        } else {
                                            TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 1;
                                            }
                                        }
                                    } else {
                                        TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                        if (TurtlePrice == 0) {
                                            TurtlePrice = 1;
                                        }
                                    }
                                } else {
                                    if ((Math.abs(HARE) - Math.abs(TurtlePrice)) >= 1) {
                                        if (TurtelyEnough == 0) {
                                            if (TurtlePrice > 0 ) {
                                                TurtlePrice = (Math.floor(((TurtlePrice * (new Random().nextInt(125000001) + 1000000001) / 1000000000) + 1) + 1));
                                            } else if (TurtlePrice < 0 ) {
                                                TurtlePrice = TurtlePrice / (Math.floor((((new Random().nextInt(125000001) + 1000000001) / 1000000000))));
                                            }else{
                                                TurtlePrice = TurtleChange;
                                            }
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 1;
                                                TurtlePrice = TurtlePrice + 1;
                                            } else {
                                                TurtlePrice = TurtlePrice + 1;
                                            }
                                        } else {
                                            TurtlePrice = TurtlePrice + (new Random().nextInt(4) - 1);
                                            if (TurtlePrice == 0) {
                                                TurtlePrice = 1;
                                                TurtlePrice = TurtlePrice + 1;
                                            } else {
                                                TurtlePrice = TurtlePrice + 1;
                                            }
                                            TurtlePrice = TurtlePrice + 1;
                                        }
                                    } else {
                                        TurtlePrice = (TurtlePrice + (new Random().nextInt(4) - 3));
                                        if (TurtlePrice == 0) {
                                            TurtlePrice = 1;
                                            TurtlePrice = TurtlePrice + 1;
                                        } else {
                                            TurtlePrice = TurtlePrice + 1;
                                        }
                                        TurtlePrice = TurtlePrice + 1;
                                    }
                                }
                            }
                        }
                        break;
                }
                if (new Random().nextInt(7) >= 3) {
                    LossLeaderPrice = (Math.ceil((LossLeaderPrice * 100) + (new Random().nextInt(100) - 51))) / 100;
                }
                if (new Random().nextInt(7) >= 5) {
                    BitcoinPrice = (Math.ceil((BitcoinPrice * 100) + (new Random().nextInt(75) - 34))) / 100;
                }
                if (new Random().nextInt(7) == 6) {
                    TurtlePrice = (Math.ceil((TurtlePrice * 100) + (new Random().nextInt(35) - 17))) / 100;
                }
                if (new Random().nextInt(7) == 6) {
                    HARE = (Math.ceil((HARE * 100) + (new Random().nextInt(35) - 18))) / 100;
                }

                if (GameMode == 1) {
                    if (TurtSwitch == 1) {
                        TurtlePrice = (Math.ceil((TurtlePrice * 100) + (new Random().nextInt(23) - 11)) / 100);
                    }
                    if (TurtSwitch == 2) {
                        HARE = (Math.ceil((HARE * 100) + (new Random().nextInt(23) - 11)) / 100);
                    }
                }
                if (GameMode == 2) {
                    TurtlePrice = (Math.ceil((TurtlePrice * 100) + (new Random().nextInt(23) - 11)) / 100);
                }


                PlantPrice = ((Math.ceil(100*PlantPrice))/100);
                NewStockPrice = ((Math.ceil(100*NewStockPrice))/100);
                DicePrice = ((Math.ceil(100*DicePrice))/100);
                BitcoinPrice = ((Math.ceil(100*BitcoinPrice))/100);
                HARE = ((Math.ceil(100*HARE))/100);
                LossLeaderPrice = ((Math.ceil(100*LossLeaderPrice))/100);
                TurtlePrice = ((Math.ceil(100*TurtlePrice))/100);




/*
                if (Day == 100){
                    int boogle;
                    for (boogle = 1; boogle < Day; boogle++) {

                LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                        DiceGrapher[boogle],

                });graph.addSeries(series);
                    }
                }


/*

                        GrapherString = String.format(GrapherString + "(" + DiceGrapher[boogle].x + "," + DiceGrapher[boogle].y + ")");



*/

                bankbalance = (bankbalance * 1.005999); bankbalance = (bankbalance *100); bankbalance = Math.ceil(bankbalance); bankbalance = bankbalance/100;
                debts =(debts * 1.0149999); debts = (debts *100); debts = Math.ceil(debts); debts = debts/100;


                TextView A = (TextView) findViewById(R.id.Q1);
                String W = String.format("%.0f", TRTLNum);
                A.setText( W);
                TextView S = (TextView) findViewById(R.id.QSINE);
                String SX = String.format("%.0f", SINENum);
                S.setText(SX);
                TextView C = (TextView) findViewById(R.id.Q2);
                String CX = String.format("%.0f", DICENum);
                C.setText( CX);
                TextView V = (TextView) findViewById(R.id.Q3);
                String VX = String.format("%.0f", BTCNum);
                V.setText( VX);

                TextView KX = (TextView) findViewById(R.id.Q4);
                String KiX = String.format("%.0f", PLNTNum);
                KX.setText(KiX);
                TextView VB = (TextView) findViewById(R.id.Q5);
                String XB = String.format("%.0f", LUZENum);
                VB.setText( XB);
                TextView AX = (TextView) findViewById(R.id.TW);
                String XA = String.format("%.0f", HAIRNum);
                AX.setText( XA);

                TextView displayIntegera = (TextView) findViewById(R.id.penSINE);
                String price = String.format("%.2f", Math.abs(NewStockPrice));
                displayIntegera.setText("$" + price);
                TextView displayIntegert = (TextView) findViewById(R.id.pen);
                String pricet = String.format("%.2f", Math.abs(TurtlePrice));
                displayIntegert.setText("$" + pricet);
                TextView displayIntegerf = (TextView) findViewById(R.id.pen9);
                String pricef = String.format("%.2f", Math.abs(DicePrice));
                displayIntegerf.setText("$" + pricef);
                TextView displayIntegerB = (TextView) findViewById(R.id.pen8);
                String priceB = String.format("%.2f", Math.abs(BitcoinPrice));
                displayIntegerB.setText("$" + priceB);
                TextView displayIntegerP = (TextView) findViewById(R.id.pen7);
                String priceP = String.format("%.2f", Math.abs(PlantPrice));
                displayIntegerP.setText("$" + priceP);
                TextView displayIntegerL = (TextView) findViewById(R.id.pen5);
                String priceL = String.format("%.2f", Math.abs(LossLeaderPrice));
                displayIntegerL.setText("$" + priceL);
                TextView displayIntegerH = (TextView) findViewById(R.id.pen6);
                String priceH = String.format("%.2f", Math.abs(HARE));
                displayIntegerH.setText("$" + priceH);


                //  DisplayPortValue(TRTLNum, TurtlePrice, DICENum, DicePrice, BTCNum, BitcoinPrice, PLNTNum, PlantPrice, LUZENum, LossLeaderPrice, HAIRNum, HARE);







                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

/*
        try{

            synchronized (this){
                wait(12);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
                        TextView PortfolioValueViewNoNames;
                        PortfolioValueViewNoNames = (TextView) findViewById(R.id.PortViewValue);
                        PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                        final String PortText = String.format(TestPort);
                        PortfolioValueView.setText(PortText);
                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                            PortfolioValueViewNoNames.setText(PortTextNoName);}else{
                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                            PortfolioValueViewNoNames.setText(PortTextNoName);}

                        TPV5.setText(LUZE);
                        TPV4.setText(PLNT);
                        TPV3.setText(BTC);
                        TPV2.setText(DICE);
                        TPV1.setText(TRTL);
                        TPV6.setText(HAIR);
                        TPV7.setText(SINE);



                        if ((BankMode%2) != 1) {
                            NewStockArrowImageView.setVisibility(View.VISIBLE);
                            TurtleArrowImageView.setVisibility(View.VISIBLE);
                            DiceArrowImageView.setVisibility(View.VISIBLE);
                            BitcoinArrowImageView.setVisibility(View.VISIBLE);
                            PlantArrowImageView.setVisibility(View.VISIBLE);
                            LossArrowImageView.setVisibility(View.VISIBLE);
                            HairArrowImageView.setVisibility(View.VISIBLE);
                        }else {
                            if (debts == 0) {
                                String gobank = String.format(BankOutputs, bankbalance);
                                BankView.setText(gobank);
                            }else {
                                String gobank = String.format(BankOutput,bankbalance, debts);
                                BankView.setText(gobank);
                            }

                        }

                        if ((DicePrice - DiceChange) > 0){
                            DiceArrowImageView.setImageResource(Demagos[0]);

                        }else if ((DicePrice - DiceChange) < 0){
                            DiceArrowImageView.setImageResource(Demagos[1]);

                        }else {
                            DiceArrowImageView.setImageResource(Demagos[2]);

                        }

                        if ((BitcoinPrice - BitcoinChange) > 0){
                            BitcoinArrowImageView.setImageResource(Demagos[0]);

                        }else if ((BitcoinPrice - BitcoinChange) < 0){

                            BitcoinArrowImageView.setImageResource(Demagos[1]);
                        }else {
                            BitcoinArrowImageView.setImageResource(Demagos[2]);

                        }
                        if ((PlantPrice - PlantChange) > 0){
                            PlantArrowImageView.setImageResource(Demagos[0]);

                        }else if ((PlantPrice - PlantChange) < 0){
                            PlantArrowImageView.setImageResource(Demagos[1]);

                        }else {
                            PlantArrowImageView.setImageResource(Demagos[2]);

                        }

                        if ((Math.abs(LossLeaderPrice) - Math.abs(LossChange)) > 0){
                            LossArrowImageView.setImageResource(Demagos[0]);

                        }else if ((Math.abs(LossLeaderPrice) - Math.abs(LossChange)) < 0){
                            LossArrowImageView.setImageResource(Demagos[1]);

                        }else {
                            LossArrowImageView.setImageResource(Demagos[2]);

                        }

                        if ((NewStockPrice - SineChange) > 0){
                            NewStockArrowImageView.setImageResource(Demagos[0]);

                        }else if ((NewStockPrice - SineChange) < 0){
                            NewStockArrowImageView.setImageResource(Demagos[1]);
                        }else {
                            NewStockArrowImageView.setImageResource(Demagos[2]);

                        }

                        if ((Math.abs(HARE) - Math.abs(HairChange)) > 0){
                            HairArrowImageView.setImageResource(Demagos[0]);

                        }else if ((Math.abs(HARE) - Math.abs(HairChange)) < 0){

                            HairArrowImageView.setImageResource(Demagos[1]);
                        }else {
                            HairArrowImageView.setImageResource(Demagos[2]);

                        }

                        if ((Math.abs(TurtlePrice) - Math.abs(TurtleChange)) > 0){

                            TurtleArrowImageView.setImageResource(Demagos[0]);
                        }else if ((Math.abs(TurtlePrice) - Math.abs(TurtleChange)) < 0){

                            TurtleArrowImageView.setImageResource(Demagos[1]);
                        }else {
                            TurtleArrowImageView.setImageResource(Demagos[2]);

                        }
                        TextView displayInteger = (TextView) findViewById(R.id.Day);
                        displayInteger.setText("Day " + Day);

                        Bank.setVisibility(View.VISIBLE);
                        timercounter = (timercounter + 1)%11;
                        if (timercounter == 10){
                            timercountercounter = timercountercounter +1;
                        }
                        if (timercountercounter > 245){

                            timercountercounter = 245;
                        }

                        int A = ColorSettingMethod();
                        int B = ColorSettingMethod();
                        int C = ColorSettingMethod();
                        int D = ColorSettingMethod();
                        int E = ColorSettingMethod();
                        int F = ColorSettingMethod();

                        int A3 = ColorSettingMethod();
                        int B3 = ColorSettingMethod();
                        int C3 = ColorSettingMethod();
                        int D3 = ColorSettingMethod();
                        int E3 = ColorSettingMethod();
                        int F3 = ColorSettingMethod();

                        int A2 = ColorSettingMethod();
                        int B2 = ColorSettingMethod();
                        int C2 = ColorSettingMethod();
                        int D2 = ColorSettingMethod();
                        int E2 = ColorSettingMethod();
                        int F2 = ColorSettingMethod();

                        String colorsmall = FinalColorMethod(A, B, C, D, E, F);
                        String color = FinalColorMethod(F2,E2,D2,C2,B2,A2);
                        String colorbig = FinalColorMethod(C3,E3,B3,A3,F3,D3);


                        ColorCircle = (TextView) findViewById(R.id.Circle);
                        SmallCircle = (TextView) findViewById(R.id.circleSmall);
                        BigCircle = (TextView) findViewById(R.id.circleBig);
                        SmallCircle.setTextColor(Color.parseColor(colorsmall));
                        ColorCircle.setTextColor(Color.parseColor(color));
                        BigCircle.setTextColor(Color.parseColor(colorbig));
                        ColorCircle.setText("○");
                        SmallCircle.setText("○");
                        BigCircle.setText("○");

                        TextView displayPaper = (TextView) findViewById(R.id.DailyPaper);
                        TextView Tsil = (TextView) findViewById(R.id.List);
                        String money = String.format("%.2f", Money);
                        Tisl.setText(Money$ + money);
                        String Stringer = SINE;

                        if(thishasnthappenedyet == 0) {
                            DICEBuyChecker = DicePrice + 1;
                            TRTLBuyChecker = TurtlePrice + 3;
                            SINEBuyChecker = NewStockPrice + 3;
                            HAREBuyChecker = HARE + 3;
                            PLNTBuyChecker = PlantPrice + 3;
                            BTCBuyChecker = BitcoinPrice + 3;
                            LOSSBuyChecker = LossLeaderPrice + 3;

                            DICESellChecker = DicePrice - 1;
                            TRTLSellChecker = TurtlePrice - 3;
                            SINESellChecker = NewStockPrice - 3;
                            HARESellChecker = HARE - 3;
                            PLNTSellChecker = PlantPrice - 3;
                            BTCSellChecker = BitcoinPrice - 3;
                            LOSSSellChecker = LossLeaderPrice - 3;

                            thishasnthappenedyet = 1;
                        }






                        double price = 0;



                        double total = 0;

                        for (loopAI = loopStart; loopAI < 11; loopAI++) {
                            PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                            TotalValueCombined = Money + PortfolioValue + 1;
                            // double LogOfValue = Math.log(TotalValueCombined);
                            double LogOfValue = Math.log(TotalValueCombined)/Math.log(1.618);
                            int IncreaseBuysAndSellsBy = (int) Math.abs((Math.floor(LogOfValue) - 9));
                            int PassRandomCarrier = 15+(IncreaseBuysAndSellsBy*5);
                            double number = new Random().nextInt(PassRandomCarrier)+1;
                            double SalesPitch = new Random().nextInt(5);
                            int newrandom = new Random().nextInt(7);
                            double showme = number*2;
                            if (SalesPitch == 0) {
                                switch (newrandom) {

                                    case 0:
                                        Stringer = TRTL;
                                        price = Math.abs(TurtlePrice);

                                        if (Day >= 1) {

                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * number);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;

                                            if (Math.abs(TurtlePrice) < (TRTLBuyChecker/1.15)) {
                                                if (Math.abs(total) <= Money) {
                                                    TRTLNum = TRTLNum + number;
                                                    String traded = String.format("%.0f", number);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    TRTLSellChecker = ((TRTLSellChecker*TRTLaverage)/(number+TRTLaverage)) +(Math.abs(TurtlePrice)*number/(TRTLaverage+number));
                                                    TRTLaverage = TRTLaverage + number;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                            double numberone = 1;
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * numberone);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;

                                            int thisjobagain = new Random().nextInt(6);
                                            if (thisjobagain == 2) {
                                                if (Math.abs(total) <= Money) {
                                                    TRTLNum = TRTLNum + numberone;
                                                    String traded = String.format("%.0f", numberone);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    TRTLSellChecker = ((TRTLSellChecker*TRTLaverage)/(numberone+TRTLaverage)) +(Math.abs(TurtlePrice)*numberone/(TRTLaverage+numberone));
                                                    TRTLaverage = TRTLaverage + numberone;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 1:
                                        Stringer = DICE;
                                        price = Math.abs(DicePrice);


                                        if (Day >= 1) {


                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * number);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            if (Math.abs(DicePrice) < (DICEBuyChecker/1.1)) {
                                                if (Math.abs(total) <= Money) {
                                                    DICENum = DICENum + number;
                                                    String traded = String.format("%.0f", number);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    DICESellChecker = ((DICESellChecker*DICEaverage)/(number+DICEaverage)) +(Math.abs(DicePrice)*number/(DICEaverage+number));
                                                    DICEaverage = DICEaverage + number;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }

                                            double numberone = 1;
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * numberone);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            int thisjobagain = new Random().nextInt(3);
                                            if (thisjobagain == 2) {
                                                if (Math.abs(total) <= Money) {
                                                    DICENum = DICENum + numberone;
                                                    String traded = String.format("%.0f", numberone);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    DICESellChecker = ((DICESellChecker*DICEaverage)/(numberone+DICEaverage)) +(Math.abs(DicePrice)*numberone/(DICEaverage+numberone));
                                                    DICEaverage = DICEaverage + numberone;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 2:
                                        Stringer = BTC;
                                        price = Math.abs(BitcoinPrice);

                                        if (Day >= 1) {


                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * number);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            if (Math.abs(BitcoinPrice) < (BTCBuyChecker/1.1)) {
                                                if (Math.abs(total) <= Money) {

                                                    BTCNum = BTCNum + number;

                                                    String traded = String.format("%.0f", number);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    BTCSellChecker = ((BTCSellChecker*BTCaverage)/(number+BTCaverage)) +(Math.abs(BitcoinPrice)*number/(BTCaverage+number));
                                                    BTCaverage = BTCaverage + number;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                            double numberone = 1;

                                            price = Math.abs(BitcoinPrice);
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * numberone);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            int thisjobagain = new Random().nextInt(3);
                                            if (thisjobagain == 2) {
                                                if (Math.abs(total) <= Money) {

                                                    BTCNum = BTCNum + numberone;

                                                    String traded = String.format("%.0f", numberone);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    BTCSellChecker = ((BTCSellChecker*BTCaverage)/(numberone+BTCaverage)) +(Math.abs(BitcoinPrice)*numberone/(BTCaverage+numberone));
                                                    BTCaverage = BTCaverage + numberone;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 3:
                                        Stringer = HAIR;
                                        price = Math.abs(HARE);

                                        if (Day >= 1) {


                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * number);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            if(Math.abs(HARE) < (HAREBuyChecker/1.15)) {
                                                if (Math.abs(total) <= Money) {
                                                    HAIRNum = HAIRNum + number;
                                                    String traded = String.format("%.0f", number);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    HARESellChecker = ((HARESellChecker*HAREaverage)/(number+HAREaverage)) +(Math.abs(HARE)*number/(HAREaverage+number));
                                                    HAREaverage = HAREaverage + number;
                                                }
                                            }

                                            double numberone = 1;

                                            price = Math.abs(HARE);
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * numberone);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            int thisjobagain = new Random().nextInt(6);
                                            if (thisjobagain == 2) {
                                                if (Math.abs(total) <= Money) {
                                                    HAIRNum = HAIRNum + numberone;
                                                    String traded = String.format("%.0f", numberone);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    HARESellChecker = ((HARESellChecker*HAREaverage)/(numberone+HAREaverage)) +(Math.abs(HARE)*numberone/(HAREaverage+numberone));
                                                    HAREaverage = HAREaverage + numberone;
                                                }
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 4:
                                        Stringer = LUZE;
                                        price = Math.abs(LossLeaderPrice);
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price / 100;
                                        price = price / 100;
                                        total = Math.abs(price * number);
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        if (Math.abs(LossLeaderPrice) < (LOSSBuyChecker/1.25)) {
                                            if (Math.abs(total) <= Money) {
                                                LUZENum = LUZENum + number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Bought + traded + " " + Stringer);
                                                Money = ((Money - Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                LOSSSellChecker = ((LOSSSellChecker*LOSSaverage)/(number+LOSSaverage)) +(Math.abs(LossLeaderPrice)*number/(LOSSaverage+number));
                                                LOSSaverage = LOSSaverage + number;
                                            }
                                        }
                                        double numberone = 1;
                                        price = Math.abs(LossLeaderPrice);
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price / 100;
                                        price = price / 100;
                                        total = Math.abs(price * numberone);
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        int thisjobagain = new Random().nextInt(3);
                                        if (thisjobagain == 2) {
                                            if (Math.abs(total) <= Money) {
                                                LUZENum = LUZENum + numberone;
                                                String traded = String.format("%.0f", numberone);
                                                displayPaper.setText(Bought + traded + " " + Stringer);
                                                Money = ((Money - Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                LOSSSellChecker = ((LOSSSellChecker*LOSSaverage)/(numberone+LOSSaverage)) +(Math.abs(LossLeaderPrice)*numberone/(LOSSaverage+numberone));
                                                LOSSaverage = LOSSaverage + numberone;
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 5:
                                        Stringer = PLNT;
                                        price = Math.abs(PlantPrice);
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price / 100;
                                        price = price / 100;
                                        total = Math.abs(price * number);
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        if(Math.abs(PlantPrice) < (PLNTBuyChecker/1.1)) {
                                            if (Math.abs(total) <= Money) {
                                                PLNTNum = PLNTNum + number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Bought + traded + " " + Stringer);
                                                Money = ((Money - Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                PLNTSellChecker = ((PLNTSellChecker*PLNTaverage)/(number+PLNTaverage)) +(Math.abs(PlantPrice)*number/(PLNTaverage+number));
                                                PLNTaverage = PLNTaverage + number;
                                            }
                                        }
                                        double numberwon = 1;
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price * 100;
                                        price = (Math.round(price));
                                        price = price / 100;
                                        price = price / 100;
                                        total = Math.abs(price * numberwon);
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total * 100;
                                        total = (Math.round(total));
                                        total = total / 100;
                                        total = total / 100;
                                        int thisjobagains = new Random().nextInt(3);
                                        if (thisjobagains == 2) {
                                            if (Math.abs(total) <= Money) {
                                                PLNTNum = PLNTNum + numberwon;
                                                String traded = String.format("%.0f", numberwon);
                                                displayPaper.setText(Bought + traded + " " + Stringer);
                                                Money = ((Money - Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                PLNTSellChecker = ((PLNTSellChecker*PLNTaverage)/(numberwon+PLNTaverage)) +(Math.abs(PlantPrice)*numberwon/(PLNTaverage+numberwon));
                                                PLNTaverage = PLNTaverage + numberwon;
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 6:
                                        Stringer = SINE;
                                        price = Math.abs(NewStockPrice);

                                        if (Day >= 1) {

                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * number);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            if (Math.abs(NewStockPrice) < (SINEBuyChecker/1.1)) {
                                                if (Math.abs(total) <= Money) {
                                                    SINENum = SINENum + number;
                                                    String traded = String.format("%.0f", number);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    SINESellChecker = ((SINESellChecker*SINEaverage)/(number+SINEaverage)) +(Math.abs(NewStockPrice)*number/(SINEaverage+number));
                                                    SINEaverage = SINEaverage + number;

                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                            double nvmberone = 1;
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price * 100;
                                            price = (Math.round(price));
                                            price = price / 100;
                                            price = price / 100;
                                            total = Math.abs(price * nvmberone);
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total * 100;
                                            total = (Math.round(total));
                                            total = total / 100;
                                            total = total / 100;
                                            int thisjobagainsa = new Random().nextInt(7);
                                            if (thisjobagainsa == 2) {
                                                if (Math.abs(total) <= Money) {
                                                    SINENum = SINENum + nvmberone;
                                                    String traded = String.format("%.0f", nvmberone);
                                                    displayPaper.setText(Bought + traded + " " + Stringer);
                                                    Money = ((Money - Math.abs(total)) * 100);
                                                    Money = Math.round(Money);
                                                    Money = Money / 100;
                                                    PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                                    SINESellChecker = ((SINESellChecker*SINEaverage)/(nvmberone+SINEaverage)) +(Math.abs(NewStockPrice)*nvmberone/(SINEaverage+nvmberone));
                                                    SINEaverage = SINEaverage + nvmberone;
                                                } else {
                                                    // displayPaper.setText(NotEnoughMoney);
                                                }
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;

                                }
                            }else {

                                number = Math.ceil(number/5);
                                switch (newrandom) {

                                    case 0:
                                        Stringer = TRTL;
                                        price = Math.abs(TurtlePrice);
                                        double floorpass = Math.log(TRTLNum + 1);
                                        number = number + Math.floor(floorpass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (TurtlePrice > (TRTLSellChecker*1)) {

                                            if (TRTLNum >= number && TRTLNum >= 0 && (TRTLNum - number) >= 0) {

                                                TRTLNum = TRTLNum - number;

                                                TRTLBuyChecker = ((TRTLBuyChecker*TRTLaveragesell)/(TRTLaveragesell+number)) +(Math.abs(TurtlePrice)*number/(TRTLaveragesell+number));
                                                TRTLaveragesell = TRTLaveragesell + number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 1:
                                        Stringer = DICE;
                                        price = Math.abs((DicePrice));

                                        double floorpassz = Math.log(DICENum + 1);
                                        number = number + Math.floor(floorpassz);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (DicePrice > (DICESellChecker*1.1)) {

                                            if (DICENum >= number && DICENum >= 0 && (DICENum - number) >= 0) {

                                                DICEBuyChecker = ((DICEBuyChecker*DICEaveragesell)/(DICEaveragesell+number)) +(Math.abs(DicePrice)*number/(DICEaveragesell+number));
                                                DICEaveragesell = DICEaveragesell + number;
                                                DICENum = DICENum - number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 2:
                                        Stringer = BTC;
                                        price = Math.abs(BitcoinPrice);

                                        double floorppass = Math.log(BTCNum + 1);
                                        number = number + Math.floor(floorppass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (BitcoinPrice > (BTCSellChecker*1.1)) {
                                            if (BTCNum >= number && BTCNum >= 0 && (BTCNum - number) >= 0) {

                                                BTCBuyChecker = ((BTCBuyChecker*BTCaveragesell)/(BTCaveragesell+number)) +(Math.abs(BitcoinPrice)*number/(BTCaveragesell+number));
                                                BTCaveragesell = BTCaveragesell + number;
                                                BTCNum = BTCNum - number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;

                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 3:
                                        Stringer = HAIR;
                                        price = Math.abs(HARE);

                                        double floorrpass = Math.log(HAIRNum + 1);
                                        number = number + Math.floor(floorrpass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (HARE > (HARESellChecker*1)) {
                                            if (HAIRNum >= number && HAIRNum >= 0 && (HAIRNum - number) >= 0) {

                                                HAREBuyChecker = ((HAREBuyChecker*HAREaveragesell)/(HAREaveragesell+number)) +(Math.abs(HARE)*number/(HAREaveragesell+number));
                                                HAREaveragesell = HAREaveragesell + number;
                                                HAIRNum = HAIRNum - number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;

                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 4:
                                        Stringer = LUZE;
                                        price = Math.abs(LossLeaderPrice);
                                        double floorzpass = Math.log(LUZENum + 1);
                                        number = number + Math.floor(floorzpass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (Math.abs(LossLeaderPrice) > (LOSSSellChecker*1.25)) {

                                            if (LUZENum >= number && LUZENum >= 0 && (LUZENum - number) >= 0) {



                                                LOSSBuyChecker = ((LOSSBuyChecker*LOSSaveragesell)/(LOSSaveragesell+number)) +(Math.abs(LossLeaderPrice)*number/(LOSSaveragesell+number));
                                                LOSSaveragesell = LOSSaveragesell + number;
                                                LUZENum = LUZENum - number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 5:
                                        Stringer = PLNT;
                                        price = Math.abs(PlantPrice);
                                        double floorepass = Math.log(PLNTNum + 1);
                                        number = number + Math.floor(floorepass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (PlantPrice > (PLNTSellChecker*1.15)) {
                                            if (PLNTNum >= number && PLNTNum >= 0 && (PLNTNum - number) >= 0) {
                                                PLNTNum = PLNTNum - number;

                                                PLNTBuyChecker = ((PLNTBuyChecker*PLNTaveragesell)/(PLNTaveragesell+number)) +(Math.abs(PlantPrice)*number/(PLNTaveragesell+number));
                                                PLNTaveragesell = PLNTaveragesell + number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                            } else {
                                                // displayPaper.setText(NotEnoughShares);
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;
                                    case 6:
                                        Stringer = SINE;
                                        price = Math.abs(NewStockPrice);

                                        double floorapass = Math.log(SINENum + 1);
                                        number = number + Math.floor(floorapass);
                                        price = price * 100; price = (Math.round(price)); price = price/100;
                                        total = Math.abs(price * number);
                                        total = total * 100; total = (Math.round(total)); total = total * 100; total = (Math.round(total)); total = total/100;
                                        total = total/100;
                                        if (NewStockPrice > (SINESellChecker*1.1)) {
                                            if (SINENum >= number && SINENum >= 0 && (SINENum - number) >= 0) {


                                                SINENum = SINENum - number;

                                                SINEBuyChecker = ((SINEBuyChecker*SINEaveragesell)/(SINEaveragesell+number)) +(Math.abs(NewStockPrice)*number/(SINEaveragesell+number));
                                                SINEaveragesell = SINEaveragesell + number;
                                                String traded = String.format("%.0f", number);
                                                displayPaper.setText(Sold + traded + " " + Stringer);
                                                Money = ((Money + Math.abs(total)) * 100);
                                                Money = Math.round(Money);
                                                Money = Money / 100;
                                                PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                                            }
                                        }
                                        if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}else{
                                            final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                            PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                            Tisl.setText(Money$ + money);}
                                        break;

                                }

                            }

                        }

                        if (Money < 1000000000 ||  Manipulated != 1) {
                            loopAI = 0;
                        }else if (Manipulated == 0 && Money >= 1000000000){
                            loopStart = 12;
                            Tisl.setText("I Have Won By Earning $1,000,000,000! My Stack Is Currently $" + Money);
                        }
                        PortfolioValue = (((((Math.abs((TRTLNum * TurtlePrice)) + Math.abs((DICENum * DicePrice)) + Math.abs((BTCNum * BitcoinPrice)) + Math.abs((PLNTNum * PlantPrice)) + Math.abs((LUZENum * LossLeaderPrice)) + Math.abs((HAIRNum * HARE)) + Math.abs(NewStockPrice * SINENum))*100)))); PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;



                        logtobetested = (Money + PortfolioValue);
                        logtobetested = Math.log(logtobetested)/Math.log(1.618);

                        if (logtobetested >= logincrement){
                            Money = (Money + PortfolioValue)*100;Money = Math.round(Money); Money = Money/100;
                            TRTLNum = 0;
                            SINENum = 0;
                            DICENum = 0;
                            BTCNum = 0;
                            PLNTNum = 0;
                            LUZENum = 0;
                            HAIRNum = 0;
                            logincrement = logincrement + 1;
                            displayPaper.setText("Safe Sell!");
                            if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                                final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                                PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                Tisl.setText(Money$ + money);}else{
                                final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                                PortfolioValueViewNoNames.setText(PortTextNoName);money = String.format("%.2f", Money);
                                Tisl.setText(Money$ + money);}

                        }



                        DiceGrapher[Day] = new DataPoint(Day, DicePrice);


                        GraphView graph = (GraphView) findViewById(R.id.graph);

                        double ranger = (Day * 1.1);
                        graph.getViewport().setMinX(1);
                        graph.getViewport().setMaxX(ranger);
                        graph.getViewport().setXAxisBoundsManual(true);
                        PointsGraphSeries<DataPoint> seriez;       //an Object of the PointsGraphSeries for plotting scatter graphs
                        seriez = new PointsGraphSeries<>(data());   //initializing/defining series to get the data from the method 'data()'
                        graph.addSeries(seriez);                   //adding the series to the GraphView
                        //  seriez.setShape(PointsGraphSeries.Shape.POINT);
                        seriez.setSize(3);
                        seriez.setColor(Color.BLUE);

                        PointsGraphSeries<DataPoint> seriew;       //an Object of the PointsGraphSeries for plotting scatter graphs
                        seriew = new PointsGraphSeries<>(datatwo());   //initializing/defining series to get the data from the method 'data()'
                        graph.addSeries(seriew);                   //adding the series to the GraphView
                        //  seriez.setShape(PointsGraphSeries.Shape.POINT);
                        seriew.setSize(3);
                        seriew.setColor(Color.RED);

/*
                        PointsGraphSeries<DataPoint> seriea;       //an Object of the PointsGraphSeries for plotting scatter graphs
                        seriea = new PointsGraphSeries<>(datathree());   //initializing/defining series to get the data from the method 'data()'
                        graph.addSeries(seriea);                   //adding the series to the GraphView
                        //  seriez.setShape(PointsGraphSeries.Shape.POINT);
                        seriea.setSize(3);
                        seriea.setColor(Color.GREEN);*/
                    }


                });





            }


        }, 100, 3000);


        Mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if ((sound%2) == 1) {
                    sound = sound + 1;
                    if (StockMarketTrackPlayer.isPlaying()) {
                        StockMarketTrackPlayer.pause();
                                                /* }else if (VictoryMusic.isPlaying() && (VictoryMusic !=null )){
                                                    VictoryMusic.release();
*/
                    }
                }else {
                    if (!StockMarketTrackPlayer.isPlaying()/* && Victory < 1*/) {
                        sound = sound + 1;
                        StockMarketTrackPlayer.start();
                    }/*else if (!VictoryMusic.isPlaying()&& Victory > 0){
                                                     sound = sound + 1;
                                                     VictoryMusic.start();
                                                 }else {
                                                     sound = sound + 1;
                                                 }*/
                }
            }
        });
        Bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((BankMode%2) == 0) {
                    BankMode = BankMode + 1;
                    Take.setVisibility(View.VISIBLE);
                    Fill.setVisibility(View.VISIBLE);
                    Pay.setVisibility(View.VISIBLE);
                    Loan.setVisibility(View.VISIBLE);
                    BankView.setVisibility(View.VISIBLE);
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TestBox.setVisibility(View.INVISIBLE);
                    BuyTRTLStock.setVisibility(View.INVISIBLE);

                    BuySINEStock.setVisibility(View.INVISIBLE);

                    BuyDICEStock.setVisibility(View.INVISIBLE);

                    BuyBTCStock.setVisibility(View.INVISIBLE);

                    BuyPLNTStock.setVisibility(View.INVISIBLE);

                    BuyLUZEStock.setVisibility(View.INVISIBLE);

                    BuyHAREStock.setVisibility(View.INVISIBLE);


                    beg.setVisibility(View.INVISIBLE);
                    DailyPapers.setVisibility(View.INVISIBLE);
                    TPV1.setVisibility(View.INVISIBLE);
                    TPV2.setVisibility(View.INVISIBLE);
                    TPV3.setVisibility(View.INVISIBLE);
                    TPV4.setVisibility(View.INVISIBLE);
                    TPV5.setVisibility(View.INVISIBLE);
                    TPV6.setVisibility(View.INVISIBLE);
                    TPV7.setVisibility(View.INVISIBLE);
                    PV0.setVisibility(View.INVISIBLE);
                    PV1.setVisibility(View.INVISIBLE);
                    PV2.setVisibility(View.INVISIBLE);
                    PV3.setVisibility(View.INVISIBLE);
                    PV4.setVisibility(View.INVISIBLE);
                    PV5.setVisibility(View.INVISIBLE);
                    Increased.setVisibility(View.INVISIBLE);
                    Q1.setVisibility(View.INVISIBLE);
                    Q2.setVisibility(View.INVISIBLE);
                    Q3.setVisibility(View.INVISIBLE);
                    Q4.setVisibility(View.INVISIBLE);
                    Q5.setVisibility(View.INVISIBLE);
                    TW.setVisibility(View.INVISIBLE);
                    QSine.setVisibility(View.INVISIBLE);

                    pen7.setVisibility(View.INVISIBLE);
                    pen8.setVisibility(View.INVISIBLE);
                    pen9.setVisibility(View.INVISIBLE);
                    penSINE.setVisibility(View.INVISIBLE);

                    NewStockArrowImageView.setVisibility(View.INVISIBLE);
                    TurtleArrowImageView.setVisibility(View.INVISIBLE);
                    DiceArrowImageView.setVisibility(View.INVISIBLE);
                    BitcoinArrowImageView.setVisibility(View.INVISIBLE);
                    PlantArrowImageView.setVisibility(View.INVISIBLE);
                    LossArrowImageView.setVisibility(View.INVISIBLE);
                    HairArrowImageView.setVisibility(View.INVISIBLE);

                }else {
                    BankMode = BankMode + 1;
                    Take.setVisibility(View.INVISIBLE);
                    Fill.setVisibility(View.INVISIBLE);
                    Pay.setVisibility(View.INVISIBLE);
                    Loan.setVisibility(View.INVISIBLE);
                    BankView.setVisibility(View.INVISIBLE);


                    TestBox.setVisibility(View.VISIBLE);
                    BuyTRTLStock.setVisibility(View.VISIBLE);

                    BuySINEStock.setVisibility(View.VISIBLE);

                    BuyDICEStock.setVisibility(View.VISIBLE);

                    BuyBTCStock.setVisibility(View.VISIBLE);

                    BuyPLNTStock.setVisibility(View.VISIBLE);

                    BuyLUZEStock.setVisibility(View.VISIBLE);

                    BuyHAREStock.setVisibility(View.VISIBLE);


                    DailyPapers.setVisibility(View.VISIBLE);
                    TPV1.setVisibility(View.VISIBLE);
                    TPV2.setVisibility(View.VISIBLE);
                    TPV3.setVisibility(View.VISIBLE);
                    TPV4.setVisibility(View.VISIBLE);
                    TPV5.setVisibility(View.VISIBLE);
                    TPV6.setVisibility(View.VISIBLE);
                    TPV7.setVisibility(View.VISIBLE);
                    PV0.setVisibility(View.VISIBLE);
                    PV1.setVisibility(View.VISIBLE);
                    PV2.setVisibility(View.VISIBLE);
                    PV3.setVisibility(View.VISIBLE);
                    PV4.setVisibility(View.VISIBLE);
                    PV5.setVisibility(View.VISIBLE);
                    Increased.setVisibility(View.VISIBLE);
                    Q1.setVisibility(View.VISIBLE);
                    Q2.setVisibility(View.VISIBLE);
                    Q3.setVisibility(View.VISIBLE);
                    Q4.setVisibility(View.VISIBLE);
                    Q5.setVisibility(View.VISIBLE);
                    TW.setVisibility(View.VISIBLE);
                    QSine.setVisibility(View.VISIBLE);

                    pen7.setVisibility(View.VISIBLE);
                    pen8.setVisibility(View.VISIBLE);
                    pen9.setVisibility(View.VISIBLE);
                    penSINE.setVisibility(View.VISIBLE);

                    NewStockArrowImageView.setVisibility(View.VISIBLE);
                    TurtleArrowImageView.setVisibility(View.VISIBLE);
                    DiceArrowImageView.setVisibility(View.VISIBLE);
                    BitcoinArrowImageView.setVisibility(View.VISIBLE);
                    PlantArrowImageView.setVisibility(View.VISIBLE);
                    LossArrowImageView.setVisibility(View.VISIBLE);
                    HairArrowImageView.setVisibility(View.VISIBLE);


                }

            }
        });


        Fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double BuyAmount = Money;


                if (Money >= BuyAmount) {
                    Money = (((Money - BuyAmount)*100)); Money = Math.round(Money); Money = Money/100;
                    bankbalance = (((bankbalance + BuyAmount) * 100)); bankbalance = Math.round(bankbalance); bankbalance = bankbalance/100;

                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);

                        TextView Tsil = (TextView) findViewById(R.id.List);
                        String money = String.format("%.2f", Money);
                        Tisl.setText(Money$ + money);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }



                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else if(BuyAmount > Money){
                    bankbalance = (((Money + bankbalance) * 100));bankbalance = Math.round(bankbalance);bankbalance = bankbalance/100;
                    Money = 0;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput, bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else{
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }
            }
        });

        Take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double BuyAmount = bankbalance;


                if (bankbalance >= BuyAmount) {
                    Money = (((Money + BuyAmount)*100)); Money = Math.round(Money); Money = Money/100;
                    bankbalance = (((bankbalance - BuyAmount) * 100));bankbalance = Math.round(bankbalance); bankbalance = bankbalance/100;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else if(BuyAmount > bankbalance){
                    // Money = (Math.ceil((Money + bankbalance) * 100)) / 100;
                    Money = (((Money + bankbalance) * 100));Money = Math.round(Money);Money = Money/100;
                    bankbalance = 0;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else{
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }
            }
        });

        Loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                double BuyAmount = 1;
                final String BuyAmountS = String.format(TestOne, BuyAmount);


                if (((Money + PortfolioValue + bankbalance) - debts) >= (debts + BuyAmount) && (debts - (Money + PortfolioValue + bankbalance)) <= 0) {
                    Money = (((Money + BuyAmount)*100)); Money = Math.round(Money); Money = Money/100;
                    debts = (Math.ceil((debts + BuyAmount) * 100)) / 100;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    } else {
                        String gobank = String.format(BankOutput, bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else{
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }
            }
        });
        Pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double BuyAmount = debts;
                final String BuyAmountS = String.format(TestOne, BuyAmount);


                if (debts > 0 && Money >= BuyAmount && (debts - BuyAmount) >= 0) {
                    Money = (((Money - BuyAmount)*100)); Money = Math.round(Money); Money = Money/100;
                    debts =  (((debts - BuyAmount)*100)); debts = Math.round(debts); debts = debts/100;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else if(BuyAmount >= debts && Money >= debts){
                    Money = (((Money - debts)*100)); Money = Math.round(Money); Money = Money/100;
                    debts = 0;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else if(BuyAmount <= debts && Money <= BuyAmount){
                    debts = (((debts - Money)*100)); debts = Math.round(debts); debts = debts/100;
                    Money = 0;
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }else{
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    }else {
                        String gobank = String.format(BankOutput,bankbalance, debts);
                        BankView.setText(gobank);
                    }
                    TextView Tsil = (TextView) findViewById(R.id.List);
                    String money = String.format("%.2f", Money);
                    Tisl.setText(Money$ + money);
                }
            }
        });



        ResetGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                resetCounter = 0;
                WonThisGameCounter = 0;
                ResetGame.setVisibility(View.INVISIBLE);
                NextGame.setVisibility(View.INVISIBLE);
                NewStockArrowImageView.setVisibility(View.INVISIBLE);
                TurtleArrowImageView.setVisibility(View.INVISIBLE);
                DiceArrowImageView.setVisibility(View.INVISIBLE);
                BitcoinArrowImageView.setVisibility(View.INVISIBLE);
                PlantArrowImageView.setVisibility(View.INVISIBLE);
                LossArrowImageView.setVisibility(View.INVISIBLE);
                HairArrowImageView.setVisibility(View.INVISIBLE);
                beg.setVisibility(View.INVISIBLE);

                TextView displayPaper = (TextView) findViewById(R.id.DailyPaper);
                displayPaper.setText("");

                TextView NoCheat = (TextView) findViewById(R.id.pen4);
                NoCheat.setText("");

                Money = 100;
                // Money = 1000000000;
                Day = 1;
                Cheated = 0;
                displayMethod(Day);
                NextGameCounter = 0;
                Car = new Random().nextInt(2);
                car = new Random().nextInt(6);
                Par = new Random().nextInt(2);
                par = new Random().nextInt(6);
                Jar = new Random().nextInt(2);
                jar = new Random().nextInt(6);
                Yar = new Random().nextInt(2);
                yar = new Random().nextInt(6);
                tar = new Random().nextInt(6);
                Tar = new Random().nextInt(2);
                rar = new Random().nextInt(6);
                Rar = new Random().nextInt(2);
                zar = new Random().nextInt(6);
                Zar = new Random().nextInt(2);

                NamesMethod();

                DicePrice = (new Random().nextInt(3) + 31);
                PlantPrice = new Random().nextInt(10) + 45;

                NewStockPrice = Math.floor((49 + Math.abs((100*(((Math.sin(Day*0.0174533*NewCycle))))))+2));

                HARE = new Random().nextInt(11) + 8;
                TurtlePrice = new Random().nextInt(5) + 5;

                bankbalance = 0;
                debts = 0;

                if (VictoryCounter != 0) {
                    debts = VictoryCounter;
                    if (VictoryCounter > 80){
                        debts = 80;
                    }
                }
                DicePrice = (Math.ceil((DicePrice*100) + (new Random().nextInt(63)-31))/100);
                BitcoinPrice = (Math.ceil((BitcoinPrice*100) + (new Random().nextInt(13)-5))/100);
                PlantPrice = (Math.ceil((PlantPrice*100) + (new Random().nextInt(43)-21))/100);
                LossLeaderPrice = (Math.ceil((LossLeaderPrice*100) + (new Random().nextInt(163)-71))/100);
                NewStockPrice = (Math.ceil((NewStockPrice*100) + (new Random().nextInt(83)-41))/100);
                HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                TurtlePrice = (Math.ceil((TurtlePrice*100) + (new Random().nextInt(23)-11))/100);

                if ((BankMode%2) == 1) {
                    Take.setVisibility(View.VISIBLE);
                    Fill.setVisibility(View.VISIBLE);
                    Pay.setVisibility(View.VISIBLE);
                    Loan.setVisibility(View.VISIBLE);
                    BankView.setVisibility(View.VISIBLE);
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    } else {
                        String gobank = String.format(BankOutput, bankbalance, debts);
                        BankView.setText(gobank);
                    }
                }

                TRTLNum = 0;
                DICENum = 0;
                SINENum = 0;
                BTCNum = 0;
                PLNTNum = 0;
                LUZENum = 0;
                HAIRNum = 0;

                Cyclops = (new Random().nextInt(50)+40);
                NewCycle = (Cyclops/60);


                DisplayPortValue(TRTLNum, TurtlePrice, DICENum, DicePrice, BTCNum, BitcoinPrice, PLNTNum, PlantPrice, LUZENum, LossLeaderPrice, HAIRNum, HARE);
                BuyBTCzMethod(TRTL, DICE, BTC, PLNT, LUZE, HAIR, SINE);
                displayFactoryMethod();
                displayMoneyMethod(Money);

                GameMode = new Random().nextInt(2)+1;
                Nandom = new Random().nextInt(5)+1;
                Wandom = new Random().nextInt(5)+1;
                Gandom = new Random().nextInt(5)+1;
                Fandom = new Random().nextInt(5)+1;
                LossLimiter = ((new Random().nextInt(349)+150) /100);
                TurtCeilingGenx = ((new Random().nextInt(2123)+1500));
                TurtCeilingGeny = Math.round(TurtCeilingGenx);
                TurtCeiling = TurtCeilingGeny/100;
                // TurtCeiling = new Random().nextInt(20)+15;
                TurtDiv = new Random().nextInt(3)+2;
                TrueRangeLossMax = new Random().nextInt(69)+621;
                COSSINSwitch = new Random().nextInt(3)+1;

                displayDiceMethod(Math.abs(DicePrice));
                double PassPrice = Math.abs(LossLeaderPrice);
                displayLossMethod(PassPrice);
                displayBitcoinMethod(Math.abs(BitcoinPrice));
                displayTurtleMethod(Math.abs(TurtlePrice));
                displayHareMethod(Math.abs(HARE));
                displayPlantMethod(Math.abs(PlantPrice));
                displayNewStockPrice(NewStockPrice);

            }

            private void displayMethod(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.Day);
                displayInteger.setText("Day " + number);

            }
            private void displayMoneyMethod(double MoneyPass) {
                TextView Tsil = (TextView) findViewById(R.id.List);
                double MoneyHand = ((Math.ceil(MoneyPass * 100))/100);

                Tisl.setText(Money$ + MoneyHand);
            }

            private void DisplayPortValue(double NumTRTL, double PriceTRTL, double NumDICE, double PriceDICE, double NumBTC, double PriceBTC, double NumPLNT, double PricePLNT, double NumLUZE, double PriceLUZE, double NumHAIR, double PriceHAIR) {

                TextView PortfolioValueViewNoName;
                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                PortfolioValue = (((((Math.abs((NumTRTL * PriceTRTL)) + Math.abs((NumDICE * PriceDICE)) + Math.abs((NumBTC * PriceBTC)) + Math.abs((NumPLNT * PricePLNT)) + Math.abs((NumLUZE * PriceLUZE)) + Math.abs((NumHAIR * PriceHAIR)) + Math.abs(NewStockPrice * SINENum))*100))));PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                final String PortText = String.format(TestPort);
                PortfolioValueView.setText(PortText);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);}else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);}
            }
            public void BuyBTCzMethod(final String A, final String B, final String C, final String D, final String E, final String F, String G) {
                TPV5.setText(E);
                TPV4.setText(D);
                TPV3.setText(C);
                TPV2.setText(B);
                TPV1.setText(A);
                TPV6.setText(F);
                TPV7.setText(G);
            }
            private void displayFactoryMethod(){
                displayTRTLMethod(TRTLNum);
                displayDICEMethod(DICENum);
                displayBTCMethod(BTCNum);
                displayPLNTMethod(PLNTNum);
                displayHAIRMethod(HAIRNum);
                displayLUZEMethod(LUZENum);
                displaySINEMethod(SINENum);
            }


            private void NamesMethod() {
                if (Car == 1) {
                    if (car == 1) {
                        TRTL = "TRTL";
                        LossLeaderPrice = new Random().nextInt(61) + 360;
                    } else if (car == 2) {
                        TRTL = "TUTL";
                        LossLeaderPrice = new Random().nextInt(21) + 90;
                    } else if (car == 3) {
                        TRTL = "TTLE";
                        LossLeaderPrice = new Random().nextInt(61) - 110;
                    } else if (car == 4) {
                        TRTL = "TORT";
                        LossLeaderPrice = new Random().nextInt(61) - 420;
                    } else if (car == 5) {
                        TRTL = "TURT";
                        LossLeaderPrice = new Random().nextInt(31) - 60;
                    } else {
                        TRTL = "TRAT";
                        LossLeaderPrice = new Random().nextInt(1000)+17;
                    }
                } else {
                    if (car == 1) {
                        TRTL = "TOTL";
                        LossLeaderPrice = new Random().nextInt(1000)+1;
                    } else if (car == 2) {
                        TRTL = "TUTE";
                        LossLeaderPrice = new Random().nextInt(31) - 60;
                    } else if (car == 3) {
                        TRTL = "TILE";
                        LossLeaderPrice = new Random().nextInt(61) - 420;
                    } else if (car == 4) {
                        TRTL = "TOUT";
                        LossLeaderPrice = new Random().nextInt(21) + 90;
                    } else if (car == 5) {
                        TRTL = "TRNT";
                        LossLeaderPrice = new Random().nextInt(61) - 110;
                    } else {
                        TRTL = "TRUT";
                        LossLeaderPrice = new Random().nextInt(61) + 360;
                    }
                }      if (Par == 1) {
                    if (par == 1) {
                        SINE = "SINE";

                    } else if (par == 2) {
                        SINE = "SYGN";
                    } else if (par == 3) {
                        SINE = "SIHN";
                    } else if (par == 4) {
                        SINE = "SOCN";
                    } else if (par == 5) {
                        SINE = "SEIN";
                    } else {
                        SINE = "SYHN";
                    }
                } else {
                    if (par == 1) {
                        SINE = "SOIN";
                    } else if (par == 2) {
                        SINE = "SOYN";
                    } else if (par == 3) {
                        SINE = "SYYN";
                    } else if (par == 4) {
                        SINE = "SGGN";
                    } else if (par == 5) {
                        SINE = "SOCA";
                    } else {
                        SINE = "TOHA";
                    }
                }
                if (Jar == 1) {
                    if (jar == 1) {
                        PLNT = "PLNT";
                        BitcoinPrice = new Random().nextInt(20) + 20;
                    } else if (jar == 2) {
                        PLNT = "GROW";
                        BitcoinPrice = new Random().nextInt(2) + 5;
                    } else if (jar == 3) {
                        PLNT = "SEED";
                        BitcoinPrice = new Random().nextInt(15) + 15;
                    } else if (jar == 4) {
                        PLNT = "SPRT";
                        BitcoinPrice = new Random().nextInt(100) + 20;
                    } else if (jar == 5) {
                        PLNT = "GREN";
                        BitcoinPrice = new Random().nextInt(125) + 20;
                    } else {
                        PLNT = "TREE";
                        BitcoinPrice = new Random().nextInt(45) + 45;
                    }
                } else {
                    if (jar == 1) {
                        PLNT = "HEGE";
                        BitcoinPrice = new Random().nextInt(47) + 42;
                    } else if (jar == 2) {
                        BitcoinPrice = new Random().nextInt(4) + 4;
                        PLNT = "CROP";
                    } else if (jar == 3) {
                        PLNT = "CHOP";
                        BitcoinPrice = new Random().nextInt(15) + 15;
                    } else if (jar == 4) {
                        PLNT = "HEAL";
                        BitcoinPrice = new Random().nextInt(125) + 20;
                    } else if (jar == 5) {
                        PLNT = "SAW";
                        BitcoinPrice = new Random().nextInt(45) + 45;
                    } else {
                        PLNT = "TETH";
                        BitcoinPrice = new Random().nextInt(20) + 20;
                    }
                }
                if (Yar == 1) {
                    if (yar == 1) {
                        DICE = "DICE";
                    } else if (yar == 2) {
                        DICE = "DYCE";
                    } else if (yar == 3) {
                        DICE = "DIXE";
                    } else if (yar == 4) {
                        DICE = "DIZE";
                    } else if (yar == 5) {
                        DICE = "DIIC";
                    } else {
                        DICE = "CUBE";
                    }
                } else {
                    if (yar == 1) {
                        DICE = "BLOK";
                    } else if (yar == 2) {
                        DICE = "FLUC";
                    } else if (yar == 3) {
                        DICE = "ROLL";
                    } else if (yar == 4) {
                        DICE = "ROLE";
                    } else if (yar == 5) {
                        DICE = "CUVE";
                    } else {
                        DICE = "TOSS";
                    }
                }

                if (Tar == 1) {
                    if (tar == 1) {
                        LUZE = "LUZE";
                    } else if (tar == 2) {
                        LUZE = "LOSS";
                    } else if (tar == 3) {
                        LUZE = "LUSE";
                    } else if (tar == 4) {
                        LUZE = "LOSE";
                    } else if (tar == 5) {
                        LUZE = "DIAS";
                    } else {
                        LUZE = "CRAS";
                    }
                } else {
                    if (tar == 1) {
                        LUZE = "FALL";
                    } else if (tar == 2) {
                        LUZE = "HANG";
                    } else if (tar == 3) {
                        LUZE = "BOUN";
                    } else if (tar == 4) {
                        LUZE = "CHEK";
                    } else if (tar == 5) {
                        LUZE = "REBN";
                    } else {
                        LUZE = "SPIN";
                    }
                }
                if (Rar == 1) {
                    if (rar == 1) {
                        BTC = "BTC";
                    } else if (rar == 2) {
                        BTC = "BICE";
                    } else if (rar == 3) {
                        BTC = "BIS";
                    } else if (rar == 4) {
                        BTC = "BIG";
                    } else if (rar == 5) {
                        BTC = "CRYP";
                    } else {
                        BTC = "COIN";
                    }
                } else {
                    if (rar == 1) {
                        BTC = "BTCC";
                    } else if (rar == 2) {
                        BTC = "BYYC";
                    } else if (rar == 3) {
                        BTC = "BUTC";
                    } else if (rar == 4) {
                        BTC = "BTTC";
                    } else if (rar == 5) {
                        BTC = "BIC";
                    } else {
                        BTC = "BYC";
                    }
                }
                if (Zar == 1) {
                    if (zar == 1) {
                        HAIR = "HAIR";
                    } else if (zar == 2) {
                        HAIR = "BUNI";
                    } else if (zar == 3) {
                        HAIR = "HOP";
                    } else if (zar == 4) {
                        HAIR = "RBIT";
                    } else if (zar == 5) {
                        HAIR = "RABT";
                    } else {
                        HAIR = "RBBT";
                    }
                } else {
                    if (zar == 1) {
                        HAIR = "HAIRZ";
                    } else if (zar == 2) {
                        HAIR = "HARE";
                    } else if (zar == 3) {
                        HAIR = "HERE";
                    } else if (zar == 4) {
                        HAIR = "HERA";
                    } else if (zar == 5) {
                        HAIR = "BND";
                    } else {
                        HAIR = "BNY";
                    }
                }
            }
            private void displayTRTLMethod(double T) {
                TextView A = (TextView) findViewById(R.id.Q1);
                String X = String.format("%.0f", T);
                A.setText( X);
            }
            private void displaySINEMethod(double T) {
                TextView S = (TextView) findViewById(R.id.QSINE);
                String X = String.format("%.0f", T);
                S.setText( X);
            }
            private void displayDICEMethod(double T) {
                TextView C = (TextView) findViewById(R.id.Q2);
                String X = String.format("%.0f", T);
                C.setText( X);
            }

            private void displayBTCMethod(double T) {
                TextView V = (TextView) findViewById(R.id.Q3);
                String X = String.format("%.0f", T);
                V.setText( X);
            }

            private void displayPLNTMethod(double T) {
                TextView K = (TextView) findViewById(R.id.Q4);
                String X = String.format("%.0f", T);
                K.setText( X);
            }

            private void displayLUZEMethod(double T) {
                TextView VB = (TextView) findViewById(R.id.Q5);
                String X = String.format("%.0f", T);
                VB.setText( X);
            }

            private void displayHAIRMethod(double H) {
                TextView A = (TextView) findViewById(R.id.TW);
                String X = String.format("%.0f", H);
                A.setText( X);
            }


            private void displayNewStockPrice(double number){
                TextView displayInteger = (TextView) findViewById(R.id.penSINE);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }

            private void displayTurtleMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }
            private void displayDiceMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen9);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }
            private void displayBitcoinMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen8);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayPlantMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen7);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayLossMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen5);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayHareMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen6);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }
        });

        beg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Money = (Money + (new Random().nextInt(45)+5));
                Money = (Money * 100);
                Money = (Money + (new Random().nextInt(99)+1));
                Money = Math.round(Money);
                Money = Money/100;
                beg.setVisibility(View.INVISIBLE);


                displayMoneyMethod(Money);

            }
        });

        BuyTRTLStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Money = ((Money/10)*100); Money = Math.round(Money); Money = Money/100;

                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;
            }
        });

        BuySINEStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Money = (Money * 10)*100;Money = Math.round(Money); Money = Money/100;

                if(Money < 0.01){

                    Money = 0.01;
                }

                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;
            }
        });
        BuyDICEStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                Money = (Money + PortfolioValue)*100;Money = Math.round(Money); Money = Money/100;
                TRTLNum = 0;
                SINENum = 0;
                DICENum = 0;
                BTCNum = 0;
                PLNTNum = 0;
                LUZENum = 0;
                HAIRNum = 0;
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;
            }
        });

        BuyPLNTStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                PLNTNum = PLNTNum*10;
                DICENum = DICENum*10;
                TRTLNum = TRTLNum*10;
                SINENum = SINENum*10;
                BTCNum = BTCNum*10;
                LUZENum = LUZENum*10;
                HAIRNum = HAIRNum*10;


                if (TRTLNum == 0){

                    TRTLNum = 1;

                }
                if (DICENum == 0){

                    DICENum = 1;

                }
                if (SINENum == 0){

                    SINENum = 1;

                }
                if (LUZENum == 0){

                    LUZENum = 1;

                }
                if (PLNTNum == 0){

                    PLNTNum = 1;

                }
                if (HAIRNum == 0){

                    HAIRNum = 1;

                }
                if (BTCNum == 0){

                    BTCNum = 1;

                }
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;

            }
        });
        BuyBTCStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HARE = 10;
                NewStockPrice = 10;
                TurtlePrice = 10;
                PlantPrice = 10;
                LossLeaderPrice = 10;
                BitcoinPrice = 10;
                DicePrice = 10;

                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;
            }
        });
        BuyLUZEStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PLNTNum = PLNTNum/10;PLNTNum = Math.round(PLNTNum);
                DICENum = DICENum/10;DICENum = Math.round(DICENum);
                TRTLNum = TRTLNum/10;TRTLNum = Math.round(TRTLNum);
                SINENum = SINENum/10;SINENum = Math.round(SINENum);
                BTCNum = BTCNum/10;BTCNum = Math.round(BTCNum);
                LUZENum = LUZENum/10;LUZENum = Math.round(LUZENum);
                HAIRNum = HAIRNum/10;HAIRNum = Math.round(HAIRNum);


                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);
                    Tisl.setText(Money$ + Money);
                }
                Manipulated = 1;

            }
        });
        BuyHAREStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(resetCounter == 0) {
                    logincrement = 999999999;
                    resetCounter = 1;
                }else {
                    logincrement = (logtobetested+1);
                    logincrement = Math.round(logincrement);
                    resetCounter = 0;
                }



            }
        });
        NextGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscapeStockMania();
            }
        });

        Gumble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*                NewStockArrowImageView.setVisibility(View.INVISIBLE);
                TurtleArrowImageView.setVisibility(View.INVISIBLE);
                DiceArrowImageView.setVisibility(View.INVISIBLE);
                BitcoinArrowImageView.setVisibility(View.INVISIBLE);
                PlantArrowImageView.setVisibility(View.INVISIBLE);
                LossArrowImageView.setVisibility(View.INVISIBLE);
                HairArrowImageView.setVisibility(View.INVISIBLE);
                beg.setVisibility(View.INVISIBLE);
*/
                TextView displayPaper = (TextView) findViewById(R.id.DailyPaper);
                displayPaper.setText("");

                final String SeedPrint = String.format(TestFree,"F" + Fandom, "N" +  Nandom,"W" + Wandom, "L" + LossLimiter, "G" + GameMode, "C" + TurtCeiling, "D" + TurtDiv, "P" + PDT, "S" + COSSINSwitch, "Y" + Cyclops, "M" + LossMinModeSetter, "R" + TurtSwitch);
                TextView A = (TextView) findViewById(R.id.pen4);
                A.setText(SeedPrint);
                //   Money = 100;
                // Money = 1000000000;
                //  Day = 1;
                Cheated = 0;
                //   displayMethod(Day);
                //   NextGameCounter = 0;
                Car = new Random().nextInt(2);
                car = new Random().nextInt(6);
                Par = new Random().nextInt(2);
                par = new Random().nextInt(6);
                Jar = new Random().nextInt(2);
                jar = new Random().nextInt(6);
                Yar = new Random().nextInt(2);
                yar = new Random().nextInt(6);
                tar = new Random().nextInt(6);
                Tar = new Random().nextInt(2);
                rar = new Random().nextInt(6);
                Rar = new Random().nextInt(2);
                zar = new Random().nextInt(6);
                Zar = new Random().nextInt(2);

                NamesMethod();
/*
                DicePrice = (new Random().nextInt(3) + 31);
                PlantPrice = new Random().nextInt(10) + 45;
                NewStockPrice = Math.floor((49 + Math.abs((100*(((Math.sin(Day*0.0174533*NewCycle))))))+2));
                HARE = new Random().nextInt(11) + 8;
                TurtlePrice = new Random().nextInt(5) + 5;
                LossLeaderPrice = new Random().nextInt(2001)-1000;

                DicePrice = (Math.ceil((DicePrice*100) + (new Random().nextInt(63)-31))/100);
                BitcoinPrice = (Math.ceil((BitcoinPrice*100) + (new Random().nextInt(13)-5))/100);
                PlantPrice = (Math.ceil((PlantPrice*100) + (new Random().nextInt(43)-21))/100);
                LossLeaderPrice = (Math.ceil((LossLeaderPrice*100) + (new Random().nextInt(163)-71))/100);
                NewStockPrice = (Math.ceil((NewStockPrice*100) + (new Random().nextInt(83)-41))/100);
                HARE = (Math.ceil((HARE*100) + (new Random().nextInt(33)-21))/100);
                TurtlePrice = (Math.ceil((TurtlePrice*100) + (new Random().nextInt(23)-11))/100);
*/
              /*  if ((BankMode%2) == 1) {
                    Take.setVisibility(View.VISIBLE);
                    Fill.setVisibility(View.VISIBLE);
                    Pay.setVisibility(View.VISIBLE);
                    Loan.setVisibility(View.VISIBLE);
                    BankView.setVisibility(View.VISIBLE);
                    if (debts == 0) {
                        String gobank = String.format(BankOutputs, bankbalance);
                        BankView.setText(gobank);
                    } else {
                        String gobank = String.format(BankOutput, bankbalance, debts);
                        BankView.setText(gobank);
                    }
                }
/*
                TRTLNum = 0;
                DICENum = 0;
                SINENum = 0;
                BTCNum = 0;
                PLNTNum = 0;
                LUZENum = 0;
                HAIRNum = 0;
*/
                Cyclops = (new Random().nextInt(50)+40);
                NewCycle = (Cyclops/60);


                DisplayPortValue(TRTLNum, TurtlePrice, DICENum, DicePrice, BTCNum, BitcoinPrice, PLNTNum, PlantPrice, LUZENum, LossLeaderPrice, HAIRNum, HARE);
                BuyBTCzMethod(TRTL, DICE, BTC, PLNT, LUZE, HAIR, SINE);
                displayFactoryMethod();
                displayMoneyMethod(Money);

                GameMode = new Random().nextInt(2)+1;
                Nandom = new Random().nextInt(5)+1;
                Wandom = new Random().nextInt(5)+1;
                Gandom = new Random().nextInt(5)+1;
                Fandom = new Random().nextInt(5)+1;
                LossLimiter = ((new Random().nextInt(349)+150) /100);
                TurtCeilingGenx = ((new Random().nextInt(2123)+1500));
                TurtCeilingGeny = Math.round(TurtCeilingGenx);
                TurtCeiling = TurtCeilingGeny/100;
                // TurtCeiling = new Random().nextInt(20)+15;
                TurtDiv = new Random().nextInt(3)+2;
                TrueRangeLossMax = new Random().nextInt(69)+621;
                COSSINSwitch = new Random().nextInt(3)+1;

                displayDiceMethod(Math.abs(DicePrice));
                double PassPrice = Math.abs(LossLeaderPrice);
                displayLossMethod(PassPrice);
                displayBitcoinMethod(Math.abs(BitcoinPrice));
                displayTurtleMethod(Math.abs(TurtlePrice));
                displayHareMethod(Math.abs(HARE));
                displayPlantMethod(Math.abs(PlantPrice));
                displayNewStockPrice(NewStockPrice);

            }

            private void displayMethod(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.Day);
                displayInteger.setText("Day " + number);

            }
            private void displayMoneyMethod(double MoneyPass) {
                TextView Tsil = (TextView) findViewById(R.id.List);
                double MoneyHand = ((Math.ceil(MoneyPass * 100))/100);

                Tisl.setText(Money$ + MoneyHand);
            }

            private void DisplayPortValue(double NumTRTL, double PriceTRTL, double NumDICE, double PriceDICE, double NumBTC, double PriceBTC, double NumPLNT, double PricePLNT, double NumLUZE, double PriceLUZE, double NumHAIR, double PriceHAIR) {

                TextView PortfolioValueViewNoName;
                PortfolioValueViewNoName = (TextView) findViewById(R.id.PortViewValue);
                PortfolioValue = (((((Math.abs((NumTRTL * PriceTRTL)) + Math.abs((NumDICE * PriceDICE)) + Math.abs((NumBTC * PriceBTC)) + Math.abs((NumPLNT * PricePLNT)) + Math.abs((NumLUZE * PriceLUZE)) + Math.abs((NumHAIR * PriceHAIR)) + Math.abs(NewStockPrice * SINENum))*100))));PortfolioValue = Math.round(PortfolioValue); PortfolioValue = PortfolioValue/100;
                final String PortText = String.format(TestPort);
                PortfolioValueView.setText(PortText);
                if (PortfolioValue <= 999999999){  String PortfolioValueString = String.format("%.2f", PortfolioValue);
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValueString);
                    PortfolioValueViewNoName.setText(PortTextNoName);}else{
                    final String PortTextNoName = String.format(TestPortNoName, PortfolioValue);
                    PortfolioValueViewNoName.setText(PortTextNoName);}
            }
            public void BuyBTCzMethod(final String A, final String B, final String C, final String D, final String E, final String F, String G) {
                TPV5.setText(E);
                TPV4.setText(D);
                TPV3.setText(C);
                TPV2.setText(B);
                TPV1.setText(A);
                TPV6.setText(F);
                TPV7.setText(G);
            }
            private void displayFactoryMethod(){
                displayTRTLMethod(TRTLNum);
                displayDICEMethod(DICENum);
                displayBTCMethod(BTCNum);
                displayPLNTMethod(PLNTNum);
                displayHAIRMethod(HAIRNum);
                displayLUZEMethod(LUZENum);
                displaySINEMethod(SINENum);
            }


            private void NamesMethod() {
                if (Car == 1) {
                    if (car == 1) {
                        TRTL = "TRTL";
                        //    LossLeaderPrice = new Random().nextInt(61) + 360;
                    } else if (car == 2) {
                        TRTL = "TUTL";
                        //    LossLeaderPrice = new Random().nextInt(21) + 90;
                    } else if (car == 3) {
                        TRTL = "TTLE";
                        //    LossLeaderPrice = new Random().nextInt(61) - 110;
                    } else if (car == 4) {
                        TRTL = "TORT";
                        //    LossLeaderPrice = new Random().nextInt(61) - 420;
                    } else if (car == 5) {
                        TRTL = "TURT";
                        //    LossLeaderPrice = new Random().nextInt(31) - 60;
                    } else {
                        TRTL = "TRAT";
                        //    LossLeaderPrice = new Random().nextInt(1000)+17;
                    }
                } else {
                    if (car == 1) {
                        TRTL = "TOTL";
                        //    LossLeaderPrice = new Random().nextInt(1000)+1;
                    } else if (car == 2) {
                        TRTL = "TUTE";
                        //    LossLeaderPrice = new Random().nextInt(31) - 60;
                    } else if (car == 3) {
                        TRTL = "TILE";
                        //    LossLeaderPrice = new Random().nextInt(61) - 420;
                    } else if (car == 4) {
                        TRTL = "TOUT";
                        //    LossLeaderPrice = new Random().nextInt(21) + 90;
                    } else if (car == 5) {
                        TRTL = "TRNT";
                        //    LossLeaderPrice = new Random().nextInt(61) - 110;
                    } else {
                        TRTL = "TRUT";
                        //    LossLeaderPrice = new Random().nextInt(61) + 360;
                    }
                }      if (Par == 1) {
                    if (par == 1) {
                        SINE = "SINE";

                    } else if (par == 2) {
                        SINE = "SYGN";
                    } else if (par == 3) {
                        SINE = "SIHN";
                    } else if (par == 4) {
                        SINE = "SOCN";
                    } else if (par == 5) {
                        SINE = "SEIN";
                    } else {
                        SINE = "SYHN";
                    }
                } else {
                    if (par == 1) {
                        SINE = "SOIN";
                    } else if (par == 2) {
                        SINE = "SOYN";
                    } else if (par == 3) {
                        SINE = "SYYN";
                    } else if (par == 4) {
                        SINE = "SGGN";
                    } else if (par == 5) {
                        SINE = "SOCA";
                    } else {
                        SINE = "TOHA";
                    }
                }
                if (Jar == 1) {
                    if (jar == 1) {
                        PLNT = "PLNT";
                        //  BitcoinPrice = new Random().nextInt(20) + 20;
                    } else if (jar == 2) {
                        PLNT = "GROW";
                        //  BitcoinPrice = new Random().nextInt(2) + 5;
                    } else if (jar == 3) {
                        PLNT = "SEED";
                        //   BitcoinPrice = new Random().nextInt(15) + 15;
                    } else if (jar == 4) {
                        PLNT = "SPRT";
                        //   BitcoinPrice = new Random().nextInt(100) + 20;
                    } else if (jar == 5) {
                        PLNT = "GREN";
                        //   BitcoinPrice = new Random().nextInt(125) + 20;
                    } else {
                        PLNT = "TREE";
                        //   BitcoinPrice = new Random().nextInt(45) + 45;
                    }
                } else {
                    if (jar == 1) {
                        PLNT = "HEGE";
                        //  BitcoinPrice = new Random().nextInt(47) + 42;
                    } else if (jar == 2) {
                        //   BitcoinPrice = new Random().nextInt(4) + 4;
                        PLNT = "CROP";
                    } else if (jar == 3) {
                        PLNT = "CHOP";
                        //   BitcoinPrice = new Random().nextInt(15) + 15;
                    } else if (jar == 4) {
                        PLNT = "HEAL";
                        //   BitcoinPrice = new Random().nextInt(125) + 20;
                    } else if (jar == 5) {
                        PLNT = "SAW";
                        //   BitcoinPrice = new Random().nextInt(45) + 45;
                    } else {
                        PLNT = "TETH";
                        //   BitcoinPrice = new Random().nextInt(20) + 20;
                    }
                }
                if (Yar == 1) {
                    if (yar == 1) {
                        DICE = "DICE";
                    } else if (yar == 2) {
                        DICE = "DYCE";
                    } else if (yar == 3) {
                        DICE = "DIXE";
                    } else if (yar == 4) {
                        DICE = "DIZE";
                    } else if (yar == 5) {
                        DICE = "DIIC";
                    } else {
                        DICE = "CUBE";
                    }
                } else {
                    if (yar == 1) {
                        DICE = "BLOK";
                    } else if (yar == 2) {
                        DICE = "FLUC";
                    } else if (yar == 3) {
                        DICE = "ROLL";
                    } else if (yar == 4) {
                        DICE = "ROLE";
                    } else if (yar == 5) {
                        DICE = "CUVE";
                    } else {
                        DICE = "TOSS";
                    }
                }

                if (Tar == 1) {
                    if (tar == 1) {
                        LUZE = "LUZE";
                    } else if (tar == 2) {
                        LUZE = "LOSS";
                    } else if (tar == 3) {
                        LUZE = "LUSE";
                    } else if (tar == 4) {
                        LUZE = "LOSE";
                    } else if (tar == 5) {
                        LUZE = "DIAS";
                    } else {
                        LUZE = "CRAS";
                    }
                } else {
                    if (tar == 1) {
                        LUZE = "FALL";
                    } else if (tar == 2) {
                        LUZE = "HANG";
                    } else if (tar == 3) {
                        LUZE = "BOUN";
                    } else if (tar == 4) {
                        LUZE = "CHEK";
                    } else if (tar == 5) {
                        LUZE = "REBN";
                    } else {
                        LUZE = "SPIN";
                    }
                }
                if (Rar == 1) {
                    if (rar == 1) {
                        BTC = "BTC";
                    } else if (rar == 2) {
                        BTC = "BICE";
                    } else if (rar == 3) {
                        BTC = "BIS";
                    } else if (rar == 4) {
                        BTC = "BIG";
                    } else if (rar == 5) {
                        BTC = "CRYP";
                    } else {
                        BTC = "COIN";
                    }
                } else {
                    if (rar == 1) {
                        BTC = "BTCC";
                    } else if (rar == 2) {
                        BTC = "BYYC";
                    } else if (rar == 3) {
                        BTC = "BUTC";
                    } else if (rar == 4) {
                        BTC = "BTTC";
                    } else if (rar == 5) {
                        BTC = "BIC";
                    } else {
                        BTC = "BYC";
                    }
                }
                if (Zar == 1) {
                    if (zar == 1) {
                        HAIR = "HAIR";
                    } else if (zar == 2) {
                        HAIR = "BUNI";
                    } else if (zar == 3) {
                        HAIR = "HOP";
                    } else if (zar == 4) {
                        HAIR = "RBIT";
                    } else if (zar == 5) {
                        HAIR = "RABT";
                    } else {
                        HAIR = "RBBT";
                    }
                } else {
                    if (zar == 1) {
                        HAIR = "HAIRZ";
                    } else if (zar == 2) {
                        HAIR = "HARE";
                    } else if (zar == 3) {
                        HAIR = "HERE";
                    } else if (zar == 4) {
                        HAIR = "HERA";
                    } else if (zar == 5) {
                        HAIR = "BND";
                    } else {
                        HAIR = "BNY";
                    }
                }
            }
            private void displayTRTLMethod(double T) {
                TextView A = (TextView) findViewById(R.id.Q1);
                String X = String.format("%.0f", T);
                A.setText( X);
            }
            private void displaySINEMethod(double T) {
                TextView S = (TextView) findViewById(R.id.QSINE);
                String X = String.format("%.0f", T);
                S.setText( X);
            }
            private void displayDICEMethod(double T) {
                TextView C = (TextView) findViewById(R.id.Q2);
                String X = String.format("%.0f", T);
                C.setText( X);
            }

            private void displayBTCMethod(double T) {
                TextView V = (TextView) findViewById(R.id.Q3);
                String X = String.format("%.0f", T);
                V.setText( X);
            }

            private void displayPLNTMethod(double T) {
                TextView K = (TextView) findViewById(R.id.Q4);
                String X = String.format("%.0f", T);
                K.setText( X);
            }

            private void displayLUZEMethod(double T) {
                TextView VB = (TextView) findViewById(R.id.Q5);
                String X = String.format("%.0f", T);
                VB.setText( X);
            }

            private void displayHAIRMethod(double H) {
                TextView A = (TextView) findViewById(R.id.TW);
                String X = String.format("%.0f", H);
                A.setText( X);
            }


            private void displayNewStockPrice(double number){
                TextView displayInteger = (TextView) findViewById(R.id.penSINE);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }

            private void displayTurtleMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }
            private void displayDiceMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen9);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }
            private void displayBitcoinMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen8);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayPlantMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen7);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayLossMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen5);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);

            }
            private void displayHareMethod(double number) {
                TextView displayInteger = (TextView) findViewById(R.id.pen6);
                String price = String.format("%.2f", number);
                displayInteger.setText("$" + price);
            }


            //  GumbleStockMania();

        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 12345 && resultCode == RESULT_OK) {
            Money = data.getDoubleExtra("Monet", 100);
            displayMoneyMethod(Money);
        }

        if (resultCode == RESULT_CANCELED){
            Money = Money;
            displayMoneyMethod(Money);

        }

    }
    private void displayMoneyMethod(double MoneyPass) {
        TextView Tsil = (TextView) findViewById(R.id.List);
        String money = String.format("%.2f", MoneyPass);
        Tisl.setText(Money$ + money);
    }


    private String displayRandomStockNamesPartTwoMethod(int RandNum) {
        String PassString = "©@$ℋ";

        switch (RandNum){
            case 0:
                PassString = "B";
                break;
            case 1:
                PassString = "C";
                break;
            case 2:
                PassString = "D";
                break;
            case 3:
                PassString = "F";
                break;

            case 4:
                PassString = "G";
                break;
            case 5:
                PassString = "H";
                break;
            case 6:
                PassString = "Z";
                break;
            case 7:
                PassString = "J";
                break;

            case 8:
                PassString = "K";
                break;
            case 9:
                PassString = "L";
                break;
            case 10:
                PassString = "M";
                break;
            case 11:
                PassString = "N";
                break;

            case 12:
                PassString = "P";
                break;
            case 13:
                PassString = "Q";
                break;
            case 14:
                PassString = "R";
                break;
            case 15:
                PassString = "S";
                break;

            case 16:
                PassString = "T";
                break;
            case 17:
                PassString = "V";
                break;
            case 18:
                PassString = "W";
                break;
            case 19:
                PassString = "X";
                break;

            case 20:
                PassString = "Y";
                break;
            case 21:
                PassString = "Z";
                break;
            case 22:
                PassString = "ℕ";
                break;
            case 23:
                PassString = "℗";
                break;
            case 24:
                PassString = "℣";
                break;
            case 25:
                PassString = "Ⅎ";
                break;
            case 26:
                PassString = "ℵ";
                break;
            case 27:
                PassString = "⅁";
                break;

        }
        return PassString;
    }
    private int displayRandomStockNamesPartOneMethod() {
        return new Random().nextInt(22);
    }
    public int ColorSettingMethod(){
        return new Random().nextInt(16);
    }

    public String FinalColorMethod(int A, int B, int C, int D, int E, int F){
        String As = null;
        String Bs = null;
        String Cs = null;
        String Ds = null;
        String Es = null;
        String Fs = null;

        if (A==0){
            As = "0";
        }
        if (A==1){
            As = "1";
        }
        if (A==2){
            As = "2";
        }
        if (A==3){
            As = "3";
        }
        if (A==4){
            As = "4";
        }      if (A==5){
            As = "5";
        }
        if (A==6){
            As = "6";
        }
        if (A==7){
            As = "7";
        }
        if (A==8){
            As = "8";
        }
        if (A==9){
            As = "9";
        } if (A==10){
            As = "A";
        }
        if (A==11){
            As = "B";
        }
        if (A==12){
            As = "C";
        }
        if (A==13){
            As = "D";
        }
        if (A==14){
            As = "E";
        } if (A==15){
            As = "F";
        }



        if (B==0){
            Bs = "0";
        }
        if (B==1){
            Bs = "1";
        }
        if (B==2){
            Bs = "2";
        }
        if (B==3){
            Bs = "3";
        }
        if (B==4){
            Bs = "4";
        }      if (B==5){
            Bs = "5";
        }
        if (B==6){
            Bs = "6";
        }
        if (B==7){
            Bs = "7";
        }
        if (B==8){
            Bs = "8";
        }
        if (B==9){
            Bs = "9";
        } if (B==10){
            Bs = "A";
        }
        if (B==11){
            Bs = "B";
        }
        if (B==12){
            Bs = "C";
        }
        if (B==13){
            Bs = "D";
        }
        if (B==14){
            Bs = "E";
        } if (B==15){
            Bs = "F";
        }
        if (C==0){
            Cs = "0";
        }
        if (C==1){
            Cs = "1";
        }
        if (C==2){
            Cs = "2";
        }
        if (C==3){
            Cs = "3";
        }
        if (C==4){
            Cs = "4";
        }      if (C==5){
            Cs = "5";
        }
        if (C==6){
            Cs = "6";
        }
        if (C==7){
            Cs = "7";
        }
        if (C==8){
            Cs = "8";
        }
        if (C==9){
            Cs = "9";
        } if (C==10){
            Cs = "C";
        }
        if (C==11){
            Cs = "B";
        }
        if (C==12){
            Cs = "C";
        }
        if (C==13){
            Cs = "D";
        }
        if (C==14){
            Cs = "E";
        } if (C==15){
            Cs = "F";
        }if (D==0){
            Ds = "0";
        }
        if (D==1){
            Ds = "1";
        }
        if (D==2){
            Ds = "2";
        }
        if (D==3){
            Ds = "3";
        }
        if (D==4){
            Ds = "4";
        }      if (D==5){
            Ds = "5";
        }
        if (D==6){
            Ds = "6";
        }
        if (D==7){
            Ds = "7";
        }
        if (D==8){
            Ds = "8";
        }
        if (D==9){
            Ds = "9";
        } if (D==10){
            Ds = "D";
        }
        if (D==11){
            Ds = "B";
        }
        if (D==12){
            Ds = "C";
        }
        if (D==13){
            Ds = "D";
        }
        if (D==14){
            Ds = "E";
        } if (D==15){
            Ds = "F";
        }if (E==0){
            Es = "0";
        }
        if (E==1){
            Es = "1";
        }
        if (E==2){
            Es = "2";
        }
        if (E==3){
            Es = "3";
        }
        if (E==4){
            Es = "4";
        }      if (E==5){
            Es = "5";
        }
        if (E==6){
            Es = "6";
        }
        if (E==7){
            Es = "7";
        }
        if (E==8){
            Es = "8";
        }
        if (E==9){
            Es = "9";
        } if (E==10){
            Es = "E";
        }
        if (E==11){
            Es = "B";
        }
        if (E==12){
            Es = "C";
        }
        if (E==13){
            Es = "D";
        }
        if (E==14){
            Es = "E";
        } if (E==15){
            Es = "F";
        }if (F==0){
            Fs = "0";
        }
        if (F==1){
            Fs = "1";
        }
        if (F==2){
            Fs = "2";
        }
        if (F==3){
            Fs = "3";
        }
        if (F==4){
            Fs = "4";
        }      if (F==5){
            Fs = "5";
        }
        if (F==6){
            Fs = "6";
        }
        if (F==7){
            Fs = "7";
        }
        if (F==8){
            Fs = "8";
        }
        if (F==9){
            Fs = "9";
        } if (F==10){
            Fs = "F";
        }
        if (F==11){
            Fs = "B";
        }
        if (F==12){
            Fs = "C";
        }
        if (F==13){
            Fs = "D";
        }
        if (F==14){
            Fs = "E";
        } if (F==15){
            Fs = "F";
        }

        return String.format("#" + PassColor, As, Bs, Cs, Ds, Es ,Fs);
    }

}