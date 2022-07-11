import java.util.Locale;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String A0 = "empty";
        String A1 = "empty";
        String A2 = "empty";
        String B0 = "empty";
        String B1 = "empty";
        String B2 = "empty";
        String C0 = "empty";
        String C1 = "empty";
        String C2 = "empty";
        int counter = 0;
        String[][] spielfeld = new String[3][3];
        System.out.println("Lass uns TIC-TAC-TOE spielen" + "\n" + "Du kannst in die Felder A0(oben links) bis C3 (unten rechts setzen)" + "\n" + "Es beginnt X dann ist O an der Reihe"
                + "\n" + "Wer 3 Symbole in einer Reihe Horizontal, Diagonal oder Vertikal hat, hat gewonnen!" + "\n" + "X beginnt! Bitte gib dein Feld mit A0,A1,A2,B0 usw an!");
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                spielfeld[i][i1] = " . ";
            }
        }
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                System.out.print(spielfeld
                        [i][i1] + "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }
        while (A0.contains("empty") || A1.contains("empty") || A2.contains("Empty") || B0.contains("Empty") || B1.contains("empty") || B2.contains("empty") || C0.contains("empty")
                || C1.contains("empty") || C2.contains("empty")) {

            counter++;

            Scanner scannerx = new Scanner(System.in);
            if (counter % 2 != 0) {

                System.out.println("X ist an der reihe!");
                String xin = scannerx.next();
                xin.toUpperCase();
                if (xin.equals("A0")) {
                    A0 = "X";
                    spielfeld[0][0] = " X ";

                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }

                }
                if (xin.equals("A1")) {
                    A1 = "X";
                    spielfeld[0][1] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("A2")) {
                    A2 = "X";
                    spielfeld[0][2] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("B0")) {
                    B0 = "X";
                    spielfeld[1][0] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("B1")) {
                    B1 = "X";
                    spielfeld[1][1] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("B2")) {
                    B2 = "X";
                    spielfeld[1][2] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("C0")) {
                    C0 = "X";
                    spielfeld[2][0] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("C1")) {
                    C1 = "X";
                    spielfeld[2][1] = " x ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (xin.equals("C2")) {
                    C2 = "X";
                    spielfeld[2][2] = " X ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }

            }
            Scanner scannero = new Scanner(System.in);
            if (counter % 2 == 0) {
                System.out.println("O ist an der Reihe!");

                String oin = scannero.next();
                oin.toUpperCase();
                if (oin.equals("A0")) {
                    A0 = "O";
                    spielfeld[0][0] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("A1")) {
                    A1 = "O";
                    spielfeld[0][1] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("A2")) {
                    A2 = "O";
                    spielfeld[0][2] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("B0")) {
                    B0 = "O";
                    spielfeld[1][0] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }

                }
                if (oin.equals("B1")) {
                    B1 = "O";
                    spielfeld[1][1] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("B2")) {
                    B2 = "O";
                    spielfeld[1][2] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("C0")) {
                    C0 = "O";
                    spielfeld[2][0] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("C1")) {
                    C1 = "O";
                    spielfeld[2][1] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
                if (oin.equals("C2")) {
                    C2 = "O";
                    spielfeld[2][2] = " O ";
                    for (int i = 0; i < spielfeld.length; i++) {
                        for (int i1 = 0; i1 < spielfeld.length; i1++) {
                            System.out.print(spielfeld
                                    [i][i1] + "\t" + "\t");
                        }
                        System.out.println();
                        System.out.println();
                    }
                }
            }
            if (A0.contains("X") && A1.contains("X") && A2.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A0.contains("X") && B0.contains("X") && C0.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A0.contains("X") && B1.contains("X") && C2.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A2.contains("X") && B1.contains("X") && C0.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A1.contains("X") && B1.contains("X") && C1.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A2.contains("X") && B2.contains("X") && C2.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A1.contains("X") && B1.contains("X") && C1.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            if (A2.contains("X") && B2.contains("X") && C2.contains("X")) {
                System.out.println("X hat gewonnen!!!");
                break;
            }
            //X Beendet!
            if (A0.contains("O") && A1.contains("O") && A2.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A0.contains("O") && B0.contains("O") && C0.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A0.contains("O") && B1.contains("O") && C2.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A2.contains("O") && B1.contains("O") && C0.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A1.contains("O") && B1.contains("O") && C1.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A2.contains("O") && B2.contains("O") && C2.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A1.contains("O") && B1.contains("O") && C1.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (A2.contains("O") && B2.contains("O") && C2.contains("O")) {
                System.out.println("O hat gewonnen!!!");
                break;
            }
            if (!A0.contains("empty") && !A1.contains("empty") && !A2.contains("empty") && !B0.contains("empty") && !B1.contains("empty") && !B2.contains("empty") && !C0.contains("empty")
                    && !C1.contains("empty") && !C2.contains("empty")) {
                System.out.println("Niemand hat gewonnen! Unentschieden!!");
                break;
            }
        }

    }
}



