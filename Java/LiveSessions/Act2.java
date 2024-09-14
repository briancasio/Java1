//Your name and ID:
// - 
// - 

/*
    Player(Act2) Object

Fields:
- name: String
- number: int

Constructors:
+ Act2()
+ Act2(String)

Methods:
+ getName(): String
+ getNumber(): int
+ setName(): void
+ setNumber(): void
+ generateNumber(): int
+ introducePlayer(): void

 */

import java.util.*;

public class Act2{
//Fields (variables)
private String name;
private int number;

//Constructor method

public Act2(){

    this.name = "";
    this.number = 0;

}

public Act2(String name){

    this.name = name;
    this.number = generateNumber();

}

//methods
public String getName(String name){

    return name;

}


public int getNumber(int number){

    return number;
}
public void setName(String name){

    this.name = name;

}

public void setNumber(int number){

    this.number=number;

}

    public int generateNumber(){
        Random randGen = new Random();
        int ranNumber = randGen.nextInt(100);
        return ranNumber;
    }

public void introducePlayer(){

String msg = "My player's name is: " + name + 
" and his number is: " + number;

System.out.println(msg);

}

}




 
 