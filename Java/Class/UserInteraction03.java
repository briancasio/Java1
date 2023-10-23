public class UserInteraction3{
    public static void main(String[] args) {
        String name = args[0]; // Argument for user's name
        String food = args[1]; // Argument for user's favorite food
        String  age = args[2]; // Argument for user's age
        
        // Caclculate the year the user was born
        int year = 2022 - Integer.parseInt(age);
        
        // Print a friendly statement with the combination
        // of the two answers.
        String response = "Hi, please to meet you "+name+". I also love "+food+"!!!"+
             " I bet you were born in "+year+"?, eh?";
        System.out.println(response);
        
    }
}