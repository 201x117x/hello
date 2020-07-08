import java.util.NoSuchElementException;
import java.util.Scanner;

class Kazuate{
    public static void main(String[] args) {
        System.out.println("数当てゲームをしましょう.");
        final int C = 57;
        Scanner sc = new Scanner(System.in);
        int i = 5;
        int ip;
        while(i > 0){
            System.out.println("2桁の自然数を入力してください.");
            System.out.println("あと"+i+"回入力できます.");
            try{
                String l = sc.nextLine().strip();
                if(l.isEmpty()){
                    System.out.println("入力がありません.");
                    continue;    
                }
                ip = Integer.parseInt(l);
            }
            catch(NoSuchElementException e){
                System.out.println("入力がありません.");
                continue;
            }
            catch(NumberFormatException e){
                System.out.println("入力が条件に合いません.");
                i--;
                continue;
            }
            if((ip < 10)||(100 <= ip)){
                System.out.println("入力が条件に合いません.");
                i--;
                continue;
            }

            int d = ip - C;
            if(d == 0){
                System.out.println("当たり.");
                break;
            }
            else{
                String s = (Math.abs(d) < 20) ? "" : "20以上";
                if(d < 0){                    
                    System.out.println(s + "小さい.");
                }
                if(d > 0){                    
                    System.out.println(s + "大きい.");
                }
            }
            i--;
        }
        sc.close();
    }
}