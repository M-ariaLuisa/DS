package Atividade;

public class Atividade3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 51; i++) {
            if(i % 2 != 0) {
                System.out.println("Os números ímpares são: " + i);
            }
        }
        for(int i = 52; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println("Os números pares são: " + i);
            }
        }
    }
}
