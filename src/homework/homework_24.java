package homework;

public class homework_24 {
    public static void main(String[] args) {

    }
}
//        Person_123 kate = new Person_123("Kate");
//        System.out.println(kate.getName());//Kate
////        changeName(kate);
//        changePerson(kate);
//        System.out.println(kate.getName());//Kate изменение не произошло
//        // kate хранит ссылку на старый объект
//
//
//        changeName(kate);
//
//    }
//    static void changePerson(Person_123 p){
//        p = new Person_123("Alice"); //p указывает на новый объект
//        p.setName("Ann");
//
//    }
//    static void changeName(Person_123 p){
//        p.setName("Alice");
//    }
//
//
//}
//class Person_123 {
//    private String name;
//
//    Person_123(String name){
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public static void main(String[] args) {
//        Person123 tom = new Person123("Tom","qwerty");
//        tom.displayPerson123();
//        tom.account.displayAccount();
//
//    }
//}
class Person123 {
    private String name;
    Account account;

    Person123(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson123() {
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account {
        private String password;

        Account(String pass) {
            this.password = pass;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", Person123.this.name, password);
        }
    }
}
