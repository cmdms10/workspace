public class InstanceofExample {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Student();
        persons[2] = new Teacher();

        for(int i = 0; i < persons.length; i++) {
            if(persons[i] instanceof Person) {
                System.out.println("persons["+i+"]はPersonクラスのインスタンスです。");
            }
            if(persons[i] instanceof Student) {
                System.out.println("person["+i+"]はStudentクラスのインスタンスです。");
            }
            if(persons[i] instanceof Teacher) {
                System.out.println("person["+i+"]はTeacherクラスのインスタンスです。");
            }
        }

        System.out.println("\n");

        Person t = new Teacher();
//        t.makeTest();
        t.work();

        Person s = new Student();
        s.work();

        System.out.println("\n");


        for(int i = 0; i < persons.length; i++) {
            persons[i].work();
        }

        System.out.println("\n");

//        通常の３倍働いてもらう
        /*void workThreeTimes(person p) {
            p.work();
            p.work();
            p.work();
        }*/




    }
}
