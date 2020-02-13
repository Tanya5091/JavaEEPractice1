public class PersonPresentation{
    private String name;
    private String lastname;
    private int age;

    public PersonPresentation(String nam, String last) {
        name=nam;
        lastname=last;
    }

    public void present() {
        System.out.println("Hello, my name is "+name+", my last name is "+lastname+", I`m "+age+" years old");
    }

    public void setAge(int ag) {
        this.age = ag;
    }
    public int getAge() {
        return age;
    }

}
