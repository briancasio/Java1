public class StudentTester{
    public static void main(String[] args) {
        Student s1 = new Student("Mike", 22222);
        Student s2 = new Student();
        System.out.println(s2.getName());
        s2.setId(77777);
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1);
    }


}