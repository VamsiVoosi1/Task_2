package task2;


class PersonTask1 {
    int age=25;
    String name;

    public void displayDetails(){
        System.out.println("Person age is"+" "+this.age);
        System.out.println("Person name is"+" "+name);
    }
    public PersonTask1(int age,String name){
        this.age=age;
        this.name=name;

    }
    public static void main(String[] args) {
        PersonTask1 person=new PersonTask1(25,"Vamsi");
        person.displayDetails();


    }

}
