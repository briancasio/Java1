public class Student{
    private String name;
    private int id;



    public Student(){

        this.name = " ";
        this.id = 0;

    }

    public Student(String name, int id){

        this.name=name;
        this.id=id;

    }

    public String getName(){

        return this.name;

    }

    public int getId(){

        return this.id;

    }

    public void setName(String name){

        this.name=name;

    }

    public void setId(int id){

        this.id=id;

    }

    public String toString(){
    
        return "name: " + getName() + ", " + "id: " + getId();
    
    }
}