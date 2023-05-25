package Example;

public class Student {
    public String name;
    public int age;
    public Student(){

    }
    public Student( String name , int age) {
        this.name = name ;
        this.age = age ;
    }
    public void setname(String ten) {
        name = ten ;

    }
    public void setAge( int age) {
        this.age = age ;
    }
    public String getName(){
        return name ;
    }
    public int  getAge(){
        return age ;
    }
}