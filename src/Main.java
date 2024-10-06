import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce una fecha priemro una hora, despues un minuto y despues un segundo (claro cada uno separado por un enter y que tengan los mismos numeros de cifra que su numero por ejemplo que 1 no sea 01 :D)");

        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();

        sc.close();

        if(segundos < 59 && segundos >= 0 && minutos <= 59 && minutos >= 0 && horas <= 23 && horas >= 0) {
            System.out.println(horas + ":" + minutos + ":" + (segundos+1));
        }else if(segundos == 59){
            if(minutos < 59 && horas <= 23 && horas >=0){
                System.out.println(horas + ":" + (minutos+1) + ":" + "00");
            }else if (horas == 23 && minutos == 59){
                System.out.println("00" + ":" + "00" + ":" + "00");
            }else if (horas<23 && horas>0){
                System.out.println((horas+1) + "00" + ":" + "00");
            }else{
                System.out.println("Debes mejorar tus conceptos de fecha");
            }
        }else{
            System.out.println("En serio...fecha invalida :|");
        }
    }
}