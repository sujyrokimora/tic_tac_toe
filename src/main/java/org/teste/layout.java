import java.util.*;

/** Este template foi criado na
 * Escola Superior de Tecnologia e Gestão do
 * Instituto Politécnico de Beja
 * em 2021/09/20
 * -----------------------------------------------------
 * Adicione aqui uma descrição da classe, o seu nome e a data
 * @author (o seu nome)
 * @version (número de versão ou data)
 *
 * O programa deve ser escrito em inglês.
 */
public class layout
{

    // as duas linhas seguintes não devem ser apagadas
    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','

    public static void main(String[] args)
    {
        System.out.println("1 - NOVO JOGO");
        System.out.println("0 - SAIR");
        int a = scanner.nextInt();
        String p1 = "1";
        String p2 = "2";
        String p3 = "3";
        String p4 = "4";
        String p5 = "5";
        String p6 = "6";
        String p7 = "7";
        String p8 = "8";
        String p9 = "9";
        if (a==1){
            System.out.print("             |");
            System.out.println("             |");
            System.out.print("      " + p1 + "      |");
            System.out.println("      " + p2 + "      |      " + p3);
            System.out.print("             |");
            System.out.println("             |");
            System.out.println("╳");
          /*  System.out.println("-----------------------------------------");
            System.out.print("             |");
            System.out.println("             |");
            System.out.print("      " + p4 + "      |");
            System.out.println("      " + p5 +"      |      " + p6);
            System.out.print("             |");
            System.out.println("             |");
            System.out.println("-----------------------------------------");
            System.out.print("             |");
            System.out.println("             |");
            System.out.print("      " + p7 + "      |");
            System.out.println("      " + p8 + "      |      " + p9);
            System.out.print("             |");
            System.out.println("             |");*/
            System.out.println("jogador 1 escolha uma posição");
            int m1 = scanner.nextInt();
            if (m1==1){
                p1 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==2){
                p2 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==3){
                p3 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==4){
                p4 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==5){
                p5 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==6){
                p6 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==7){
                p7 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==8){
                p8 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
            if (m1==9){
                p9 = "X";
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p1 + "      |");
                System.out.println("      " + p2 + "      |      " + p3);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p4 + "      |");
                System.out.println("      " + p5 +"      |      " + p6);
                System.out.print("             |");
                System.out.println("             |");
                System.out.println("-----------------------------------------");
                System.out.print("             |");
                System.out.println("             |");
                System.out.print("      " + p7 + "      |");
                System.out.println("      " + p8 + "      |      " + p9);
                System.out.print("             |");
                System.out.println("             |");
            }
        }

        if (a==0){

        }
    }
} // END layout