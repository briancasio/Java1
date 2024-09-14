public class DepOfTreasury {
    public static void main(String[] args){
        Dollar d1 = new Dollar();
        Dollar d2 = new Dollar(5, "Jefferson", "A248634648J", 2001);
        Dollar d3 = new Dollar(10, "A246734248J", 2003);
        Dollar d4 = new Dollar(20, 2004);

        d1.showBill();
        d2.showBill();
        d3.showBill();
        d4.showBill();
    }
}
