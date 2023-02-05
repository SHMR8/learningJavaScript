
public class Main {
    public static void main(String[] args) {

    double [][] notasAlunos = new double[2][4];

        notasAlunos[0][0]=1;
        notasAlunos[0][1]=2;
        notasAlunos[0][2]=3;
        notasAlunos[0][3]=4;

        notasAlunos[1][0]=5;
        notasAlunos[1][1]=6;
        notasAlunos[1][2]=7;
        notasAlunos[1][3]=8;

        for(int i=0; i<2; i++){
            for(int j=0; j<4;j++){
                System.out.println(notasAlunos[i][j]);
            }
        }


    }
}