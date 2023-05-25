package Example;

public class Hellowork {
    public static void main(String[] args) {
        Student s = new Student();
       s.name = "phạm văn trường ";
        s.setname("phạm văn trường");
        s.setAge(18);

        s.age = 18;
        System.out.println("name :"+ s.getName());
        System.out.println("age :" + s.getAge());
        String name = "trịnh hữu ngọc anh";
        int age = 18 ;
        Student s1 = new Student(name , age);
        System.out.println("name :"+s1.getName());
        System.out.println("age :"+s1.getAge());
    }
}