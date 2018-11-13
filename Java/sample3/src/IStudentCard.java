public class IStudentCard extends StudentCard {
    String nationality;

    void printinfo() {
        super.printinfo();
        System.out.println("国籍："+this.nationality+"\n");
    }
}
