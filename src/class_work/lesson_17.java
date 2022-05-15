package class_work;

public class lesson_17 {
    public static void main(String[] args) {
//        Person11 person11 = new Person11();
//        person11.name="tom";
//        Person11.name = "tom";
//        Person11.display();
//        Person11 tom = new Person11();
//        Person11 bob = new Person11();
//        set_count(bob);
//        Person12 tom = new Person12();
//        tom.c.setCountry("America");
        Person12.Country.setCountry("America");
    }

    static void set_count(Person11 p){
        p.setBank_count(230);
    }

}

class Person11{
    static String name;
    static int counter;
    private int bank_count;
    static{
        counter = 105;
    }
    static void display(){
        counter++;
    }

    public void setBank_count(int bank_count) {
        this.bank_count = bank_count;
    }

    public int getBank_count() {
        return bank_count;
    }
}
class Person12{
    private int bank_count;
//    Country c = new Country();



    public void setBank_count(int bank_count) {
        this.bank_count = bank_count;
    }

    public int getBank_count() {
        return bank_count;
    }


    public static class Country{
//        private String country;

        public static void setCountry(String country) {
            System.out.println(country);
        }
    }
}
