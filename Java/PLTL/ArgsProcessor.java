public class ArgsProcessor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nothing to process");
            return;
        }

        int sum = 0;
        for (int i = 0; i < args.length; i++) {

            String[] numbers = args[i].split(" "); 
            System.out.println(numbers[i]);
            for (int j = 0; j < numbers.length; j++) {
        
                    int parsedNum = Integer.parseInt(numbers[j]);
                    sum += parsedNum;

            }
        }

        System.out.println("Addition: " + sum);
    }
}
