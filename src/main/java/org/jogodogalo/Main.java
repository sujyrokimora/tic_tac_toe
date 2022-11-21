package org.jogodogalo;

import java.util.*;

/**
 * Este template foi criado na
 * Escola Superior de Tecnologia e Gestão do
 * Instituto Politécnico de Beja
 * em 2021/09/20
 * -----------------------------------------------------
 * Adicione aqui uma descrição da classe, o seu nome e a data
 *
 * @author Rodrigo Inácio, Xavier Cruz
 * @version 0.1
 * <p>
 * O programa deve ser escrito em inglês.
 */


public class Main {

    public static String[] game = new String[9];
    final static Scanner scanner = new Scanner(System.in); // defines the scanner so the program can read user inputs

    static {
        scanner.useLocale(Locale.ROOT);
    }

    public static void main(String[] args) {
        for (int a = 0; a < game.length; a++) {
            game[a] = Integer.toString(a + 1);
        }
        menu();
    }

    public static void menu() {
        System.out.println("1 - NOVO JOGO");
        System.out.println("0 - SAIR");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                load_round();
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Valor invalido");
                menu();
                break;
        }
    }

    public static void load_round() {
        draw();
        System.out.println("Jogador 1 escolha uma posição:");
        register_move(scanner.nextInt(), 1);
        draw();
        System.out.println("Jogador 2 escolha uma posição:");
        register_move(scanner.nextInt(), 2);
        load_round();
    }

    public static void register_move(int move, int player) {
        if (move <= 9) {
            if ((game[move - 1] == "❌") || ((game[move - 1] == "🅾"))) {
                System.out.println("Esta posição ja se encontra ocupada");
                System.out.println("Jogador " + player + " escolha uma posição:");
                register_move(scanner.nextInt(), player);
            } else {
                switch (player) {
                    case 1:
                        game[move - 1] = "❌";
                        break;
                    case 2:
                        game[move - 1] = "🅾";
                        break;
                    default:
                        System.out.println("Jogador invalido");
                        load_round();
                        break;
                }
                check_win();
            }
        } else {
            System.out.println("Posição invalida");
            System.out.println("Jogador " + player + " escolha uma posição:");
            register_move(scanner.nextInt(), player);
        }
    }

    public static void check_win() {

    }

    public static void draw() {
        int count = 0;
        for (int control = 0; control != 3; control++) {
            System.out.print("             |");
            System.out.println("             |");
            System.out.print("      " + game[count] + "      |");
            System.out.println("      " + game[count + 1] + "      |      " + game[count + 2]);
            System.out.print("             |");
            System.out.println("             |");
            if (control != 2) {
                System.out.println("-----------------------------------------");
            }
            count += 3;
        }
    }
}
