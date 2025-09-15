public class Fundamentos {
   // tipos : boolean/byte/short/char/int/long/float/double
   /*
   boolean bln = true;	// booleanos só podem ser 'verdadeiros' ou 'falsos'
    byte b = 0x20;    	// usando notação hexadecimal
    short s = 500;      	// pequeno inteiro
    char c = 'A';       	// deve usar aspas simples para denotar caracteres
    char tab = '\t';    	// outros especiais: \ n, \ r, \ f, \ b, \\, \ ', \ "
    int i = 1000000;    	// notação decimal
    int j = 0x3FA0B3;   	// notação hexadecimal
    int k = 0777;      	// notação octal
    float f = 1.5f;     	// o 'f' final distingue-se do double
    long l = 2000000L; 	// o 'L' final distingue-se do int
    double pi = 3.141592653589793;  // doubles are higher precision
    double large = 1.3e100;     // using the exponent notation
   */ 

   // String são objetos, imutáveis
   //métodos de string: length, replace, substring, indexOf, equals, trim, split, toUpperCase, endsWith, etc.

   // Arrays são uma estrutura de dados simples para conter uma série de elementos de dados do mesmo tipo.
 public static void main(String[] args) {

        int nota = 80;

        char conceito;

        if (nota >= 90) {

            conceito = 'A';

        } else if (nota >= 80) {

            conceito = 'B';

        } else if (nota >= 70) {

            conceito = 'C';

        } else if (nota >= 60) {

            conceito = 'D';

        } else {

            conceito = 'F';

        }

        System.out.println("Conceito = " + conceito);

    }
}
