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
 * @version 1.7
 * <p>
 * O programa deve ser escrito em inglês.
 */


public class Main {
    public static int round_count = 0;
    public static int round_count_2 = 0;
    public static boolean is_hard = false;
    public static boolean cpu_play = false;
    public static String[] game = new String[9];
    final static Scanner scanner = new Scanner(System.in); // defines the scanner so the program can read user inputs

    static {
        scanner.useLocale(Locale.ROOT);//sets the language to the system root
    }

    public static void main(String[] args) {
        menu();
    }//starts the game

    public static void menu() {
        clear_game();
        System.out.println("1 - NOVO JOGO");
        System.out.println("2 - HARD MODE");
        System.out.println("3 - Man vs Machine");
        System.out.println("0 - SAIR");
        int option = scanner.nextInt();
        switch (option) {
            case 0:
                System.exit(1);
                break;
            case 1:
                load_round();
                break;
            case 2:
                is_hard = true;
                load_round();
                break;
            case 3:
                cpu_play = true;
                load_round();
                break;
            default:
                System.out.println("Valor invalido");
                menu();
                break;
        }
    }

    public static boolean is_this_free(int move) {
        boolean answer = true;
        if (game[move - 1] == "❌" || game[move - 1] == "🅾") {
            answer = false;
        }
        return answer;
    }

    public static void cpu() {
        //sei que o cpu é sempre o segundo a playar por isso não importa ele saber se ja jogaram

        cpu_read_game();

    }

    public static void cpu_read_game() {//this function will study the game table and base from that will make a decision
        /* in order for the program to choose to "block"
     the other player will search for a combination 2/3 of a row
     if he doesn't see anything to block the cpu will try to make a move on his advantage*/
        boolean optimal = false;
        for (int a = 0; a < game.length; a += 3) {//horizontal
            if ((game[a] == game[a + 1]) && (!optimal)) {
                if (is_this_free(a + 3)) {
                    optimal = true;
                    register_move(a + 3, 2);
                }
            } else if ((game[a] == game[a + 2]) && (!optimal)) {
                if (is_this_free(a + 2)) {
                    optimal = true;
                    register_move(a + 2, 2);
                }
            } else if ((game[a + 2] == game[a + 1]) && (!optimal)) {
                if (is_this_free(a + 1)) {
                    optimal = true;
                    register_move(a + 1, 2);
                }
            }
        }
        for (int a = 0; a <= 3; a++) {//vertical check

            if ((a + 6 <= 8) && (!optimal)) {
                if ((game[a] == game[a + 3])) {
                    if (is_this_free(a + 7)) {
                        optimal = true;
                        register_move(a + 7, 2);
                    }
                }
                if ((game[a] == game[a + 6])) {
                    if (is_this_free(a + 4)) {
                        optimal = true;
                        register_move(a + 4, 2);
                    }
                }
                if ((game[a + 6] == game[a + 3])) {
                    if (is_this_free(a + 1)) {
                        optimal = true;
                        register_move(a + 1, 2);
                    }
                }
            }
        }

        if ((game[0] == game[4]) && (!optimal)) {
            if (is_this_free(9)) {
                optimal = true;
                register_move(9, 2);
            }
        }
        if ((game[4] == game[8]) && (!optimal)) {
            if (is_this_free(1)) {
                optimal = true;
                register_move(1, 2);
            }
        }
        if ((game[8] == game[0]) && (!optimal)) {
            if (is_this_free(5)) {
                optimal = true;
                register_move(5, 2);
            }
        }


        if ((game[2] == game[4]) && (!optimal)) {
            if (is_this_free(7)) {
                optimal = true;
                register_move(7, 2);
            }
        }
        if ((game[4] == game[6]) && (!optimal)) {
            if (is_this_free(3)) {
                optimal = true;
                register_move(3, 2);
            }
        }
        if ((game[6] == game[2]) && (!optimal)) {
            if (is_this_free(5)) {
                optimal = true;
                register_move(5, 2);
            }
        }

        if (is_this_free(5)) {
            register_move(5, 2);
        } else {
            int tenta = 0;
            while (!optimal && tenta < 9) {
                tenta++;

                Random rand = new Random();
                int tr = rand.nextInt(1, 10);
                if (is_this_free(tr)) {
                    register_move(tr, 2);
                    optimal = true;
                }
            }
        }
    }

    public static void check_win(int player) {

        for (int a = 0; a < game.length; a += 3) {//horizontal check

            if (((game[a] == game[a + 1]) && (game[a] == game[a + 2]))) {
                announce_winner(player);
            }
        }
        for (int a = 0; a <= 3; a++) {//vertical check

            if (a + 6 <= 8) {
                if ((game[a] == game[a + 3]) && (game[a] == game[a + 6])) {
                    announce_winner(player);
                }
            }
        }
        if (round_count + round_count_2 >= 9) {
            announce_winner(3);
        }
        //checks the following positioning
        /*
        1-0-0
        0-1-0
        0-0-1
        1 is equivalent to the moves made by the same player in that order
        */
        if ((game[0] == game[4]) && (game[0] == game[8])) {
            announce_winner(player);
        }
        //checks the following positioning
        /*
        0-0-1
        0-1-0
        1-0-0
        1 is equivalent to the moves made by the same player in that order
        */
        if ((game[2] == game[4]) && (game[2] == game[6])) {
            announce_winner(player);
        }
    }


    public static boolean hardmode(int player) {
        boolean a = false;
        boolean control = true;
        if (is_hard) {
            Random rand = new Random();
            int b = rand.nextInt(2);
            while (control) {
                System.out.println("Jogador " + player + ": Escolha 0 ou 1");
                int user_guess = scanner.nextInt();
                if ((user_guess != 0) && (user_guess != 1)) {
                    System.out.println("Input invalido");
                } else {
                    if (b != user_guess) {
                        System.out.println("Perdeste a tua vez de jogar jogador " + player);
                    } else {
                        System.out.println("Acertaste");
                        a = true;
                    }
                    control = false;
                }
            }
        } else {
            a = true;
        }

        return a;
    }

    public static void load_round() {
        draw();
        System.out.println(round_count + round_count_2);
        if (hardmode(1)) {
            System.out.println("Jogador 1 escolha uma posição:");
            register_move(scanner.nextInt(), 1);
            draw();
        }

        if (hardmode(2)) {
            if (!cpu_play) {
                System.out.println("Jogador 2 escolha uma posição:");
                register_move(scanner.nextInt(), 2);
            } else {
                cpu();

            }
        }
        load_round();
    }

    public static void register_move(int move, int player) {
        if (move <= 9) {
            System.out.println(move);
            if ((game[move - 1] == "❌") || ((game[move - 1] == "🅾"))) {
                System.out.println("Esta posição ja se encontra ocupada");
                System.out.println("Jogador " + player + " escolha uma posição:");
                register_move(scanner.nextInt(), player);
            } else {
                switch (player) {
                    case 1:
                        game[move - 1] = "❌";
                        round_count++;
                        break;
                    case 2:
                        game[move - 1] = "🅾";
                        round_count_2++;
                        break;
                    default:
                        System.out.println("Jogador invalido");
                        load_round();
                        break;
                }
                check_win(player);
            }
        } else {
            System.out.println("Posição invalida");
            System.out.println("Jogador " + player + " escolha uma posição:");
            register_move(scanner.nextInt(), player);
        }
        if (cpu_play) {
            System.out.println("o Cpu jogou no " + move);
        }
    }

    public static void announce_winner(int player) {// function responsible for the end of the game and announces the winner
        draw();
        if (player != 3) {//when player is 3 this means that the game is a draw
            System.out.println("O jogador " + player + " ganhou o jogo!!🎉🎉🎉🎉");
        } else {
            System.out.println("O jogo empatou.🤡💀");
        }

        menu();
    }

    public static void draw() {//function that draws the game table from the game[] array
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

    public static void clear_game() {// this function is responsible for the clearing of the game
        round_count = 0;
        round_count_2 = 0;
        is_hard = false;
        for (int a = 0; a < game.length; a++) {
            game[a] = Integer.toString(a + 1);
        }
    }
}
