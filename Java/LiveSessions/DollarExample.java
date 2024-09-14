//Hope this helps:)

public class DollarExample {

    //Fields
    private int denomination;
    private String face;
    private String serial;
    private int year;

    //Constructors
public Dollar(){
        this.denomination = 0;
        this.face = " ";
        this.serial= " ";
        this.year = 0;
    }

    public Dollar(int denomination, String face, String serial, int year){
        this.denomination = denomination;
        this.face = face;
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, String serial, int year){
        this.denomination = denomination;
        this.serial = serial;
        this.year = year;
        switch (denomination) {
            case 1:
                this.face = "George Washington";
                break;
            case 2:
                this.face = "Thomas Jefferson";
                break;
            case 5:
                this.face = "Abraham Lincoln";
                break;
            case 10:
                this.face = "Alexander Hamilton";
                break;
            case 20:
                this.face = "Andrew Jackson";
                break;
            case 50:
                this.face = "Ulysses S. Grant";
                break;
            case 100:
                this.face = "Benjamin Franklin";
                break;
            default:
                break;
        }
    }
    public Dollar(int denomination, int year){
        this.denomination = denomination;
        this.year = year;
        serial = generateSerial();
        switch (denomination) {
            case 1:
                this.face = "George Washington";
                break;
            case 2:
                this.face = "Thomas Jefferson";
                break;
            case 5:
                this.face = "Abraham Lincoln";
                break;
            case 10:
                this.face = "Alexander Hamilton";
                break;
            case 20:
                this.face = "Andrew Jackson";
                break;
            case 50:
                this.face = "Ulysses S. Grant";
                break;
            case 100:
                this.face = "Benjamin Franklin";
                break;
            default:
                break;
        }
    }

public int getDenomination(){
        return denomination;
    }
    
    public String getFace(){
        return face;
    }

    public String getSerial(){
        return serial;
    }

    public int getYear(){
        return year;
    }


    private int getAge(int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;

        return age;
    }

    private String generateSerial(){
        Random randGen = new Random();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String holderSerial= "";
        
        for(int i = 0; i < 11; ++i){
            if((i == 0)|| (i == 10)){
                int letter = randGen.nextInt(25);
                char serialChar = abc.charAt(letter);
                
                holderSerial = holderSerial + serialChar;
            }
            else{
                int num = randGen.nextInt(10);
                holderSerial = holderSerial + num;
            }
        }
        return holderSerial;
    }

}