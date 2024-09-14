import java.util.*;

public class Dollar {

    // Fields
    private int denomination;
    private String face;
    private String serial;
    private int year;

    // Constructors
    public Dollar() {
        this.denomination = 0;
        this.face = " ";
        this.serial = " ";
        this.year = 0;
    }

    public Dollar(int denomination, String face, String serial, int year) {
        this.denomination = denomination;
        this.face = face;
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, String face, int year) {
        this.denomination = denomination;
        this.face = face;
        this.serial = generateSerial();
        this.year = year;
    }

    // Getters
    public int getDenomination() {
        return denomination;
    }

    public String getFace() {
        return face;
    }

    public String getSerial() {
        return serial;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Methods showBill and getAge
    public void showBill() {
        String msg = "$: " + denomination + " Face: " + face +
                " Serial#: " + serial + " is " + getAge(year) + " years old.";

        System.out.println(msg);
    }

    private int getAge(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;

        return age;
    }

    private String generateSerial(){
    Random rand = new Random();
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String holder = "";

    for (int i = 0; i < 11; i++) {
        if (i == 0 || i == 10) {
        int letter = rand.nextInt(25);
            holder = holder + abc.charAt(letter);
        } else {
            int num = rand.nextInt(10);

            holder = holder + num;
        }

    }
    return holder;
    }
}