package class_work;

public class lesson_6 {
    public static void main(String[] args) {
//        byte b = 7;//00000111
//        short s = 7;//0000 0000 0000 0111
//        byte d = 2;//00000010
        int a1 = 2;//010
        int b1 = 5;//101
        System.out.println(a1&b1);//0*1=0; 1*0=0; 0*1=0;000
        System.out.println(a1|b1);//0+1=1; 1+0=1; 0+1=1; 111
        int number = 45;//значение которое надо зашифровать в двоичной форме 45 = 010 1101
        int key = 102;//ключ шифрования 110 0110
        int encrypt = number^key;
        System.out.println(encrypt);
        byte a = 12;//0000 1100 = 1111 0011
        System.out.println(~a);

    }
}
