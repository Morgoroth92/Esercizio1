package Esercizi;
/*
Scrivere una funzione che controlli se un numero int è in un determinato range
Se lo è ritorna true se non lo è lancia un'eccezione
*/

public class Main {
    public static void main(String[] args) throws Exception {

        int number = 29;
        checkNumber(number);

    }
    public static boolean checkNumber(int number) throws Exception {
        if (number < 10 || number > 20) {
            throw new Exception("The number is not in the range");
        }
        return true;
    }

 }




