import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercicio01.executar();
        //Exercicio02.executar();
        //Exercicio03.executar();
        //Exercicio04.executar();
        Exercicio05.executar();
    }
}

class Exercicio05{
    public static void executar(){
        int ordemMatriz, i, j, a=0, b=0, c=0, d=0;;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        ordemMatriz = scanner.nextInt();

        //declaro matrizA com a ordem digitada pelo usuario
        int matrizA[][] = new int[ordemMatriz][ordemMatriz];
        //percorre e insere na matiz
        for (i=0;i< matrizA.length;i++){
            for (j=0;j< matrizA[i].length;j++){
                //System.out.printf("Digite o valor que deseja inserir na coluna %d da linha %d da matrizA: ",j+1,i+1);
                //matrizA[i][j] = scanner.nextInt();
                matrizA[i][j] = i+j;
            }
        }
        //mostra a matriz preenchida
        System.out.println("MAtriz A:");
        for (i=0;i< matrizA.length;i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j]+"\t");
            }
            System.out.println();
        }
        //percorrendo matriz e realizando logica e resultados
        System.out.println("Resultados:");
        for (i=0;i< matrizA.length;i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                //soma dos elementros da linha 3
                 if(i==2){
                     a += matrizA[i][j];
                 }
                //soma dos elementos da coluna 3
                 if(j==2){
                     b += matrizA[i][j];
                 }
                //soma dos elementos da diagonal principal
                if(i==j){
                    c += matrizA[i][j];
                }
                //a soma dos elementos da diagonal secundária
                if(i+j == 4-1){
                    d += matrizA[i][j];
                }
            }
        }
        //mostrando os resultados
        System.out.printf("A soma dos elementos da linha 3 é: %d \n",a);
        System.out.printf("A soma dos elementos da coluna 3 é: %d \n",b);
        System.out.printf("A soma dos elementos da diagonal principal da matriz é: %d \n",c);
        System.out.printf("A soma dos elementos da diagonal secundária da matriz é: %d \n",d);
        scanner.close();
    }
}

class Exercicio04{
    public static void executar(){
        int quantidadeLinhas, quantidadeColunas, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        quantidadeLinhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        quantidadeColunas = scanner.nextInt();
        //declaro matrizA com a quantidade digitada pelo usuario
        int matrizA[][] = new int[quantidadeLinhas][quantidadeColunas];
        //declaro linhas e colunas conforme a matriz A
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        //declaro matrizB informando colunas antes de linhas, ao contrario da matriz A
        int matrizB[][] = new int[colunas][linhas];

        //Percorre e insere valor digitado pelo usuario na matriz A
        for (i=0;i<matrizA.length;i++){
            for (j=0;j<matrizA[i].length;j++){
                System.out.printf("Digite o valor que deseja adicionar na coluna %d da linha %d. \n",j+1,i+1);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        //Percorre matrizB realizando a transposição
        for(i=0;i< matrizB.length;i++){
            for(j=0;j< matrizB[i].length;j++){
                matrizB[i][j] = matrizA[j][i]; //transposição
            }
        }

        //Mostra MatrizB transposta
        for(i=0;i< matrizB.length;i++){
            for(j=0;j< matrizB[i].length;j++){
                System.out.print(matrizB[i][j]+"\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

class Exercicio03 {
    public static void executar() {
        int quantidadeLinhas, quantidadeColunas, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        quantidadeLinhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        quantidadeColunas = scanner.nextInt();

        int matrizA[][] = new int[quantidadeLinhas][quantidadeColunas];
        int matrizB[][] = new int[quantidadeLinhas][quantidadeColunas];
        int matrizC[][] = new int[quantidadeLinhas][quantidadeColunas];

        //MATRIZ A
        System.out.println("Matriz A");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = i + j;
            }
        }
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        //MATRIZ B
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = i + j;
            }
        }
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz C");
        //MATRIZ C
        for (i = 0; i < matrizC.length; i++) {
            for (j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        for (i = 0; i < matrizC.length; i++) {
            for (j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

class Exercicio02 {
    public static void executar() {
        int quantidadeLinhas, quantidadeColunas, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        quantidadeLinhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        quantidadeColunas = scanner.nextInt();

        int matrizA[][] = new int[quantidadeLinhas][quantidadeColunas];
        int matrizB[][] = new int[quantidadeLinhas][quantidadeColunas];
        int matrizC[][] = new int[quantidadeLinhas][quantidadeColunas];

        //MATRIZ A
        System.out.println("Matriz A");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = i + j;
            }
        }
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        //MATRIZ B
        System.out.println("Matriz B");
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = i + j;
            }
        }
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        //MATRIZ C
        System.out.println("Matriz C");
        for (i = 0; i < matrizC.length; i++) {
            for (j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        for (i = 0; i < matrizC.length; i++) {
            for (j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

class Exercicio01 {
    public static void executar() {
        int quantidadeLinhas, quantidadeColunas, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        quantidadeLinhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        quantidadeColunas = scanner.nextInt();

        int matrizA[][] = new int[quantidadeLinhas][quantidadeColunas];


        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = i + j;
            }
        }
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}