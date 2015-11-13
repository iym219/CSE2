import java.util.Scanner;
public class MineSweeper{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
        System.out.println("Enter the size for the minesweeper board: ");
        int N=myScanner.nextInt();
        if(N<2|| N>30){
            System.exit(-1);
        }//This is to exit the program if the size of the board is greater than 30 or less than 2
        char[] [] board = new char[N][N];//Creates an nSizexnSize of characters
        System.out.println("Enter the number of mines for the minesweeper: ");
        int nMines=myScanner.nextInt();
        if(nMines<1||nMines>(N*N)){
            System.exit(-1);
        }//For in case the number of mines is not between 1 and size of the board
        int printMines=0;
        for(int a=0; a<board.length;a++){
            for(int b=0; b<board[a].length;b++){
                board[a][b] = '0';
            }
        }//Creates the null values for the board before the mines
        while(printMines<nMines){
            int xSpot=(int)(Math.random()*N);
            int ySpot=(int)(Math.random()*N);
            if(board[xSpot][ySpot] != 'M'){
                board[xSpot] [ySpot] = 'M';
                printMines++;
            }
        }//This while statement prints the mines
        xAdjacent(board);
        for(int c=0; c<board.length; c++){
            for(int d=0; d<board[c].length; d++){
               System.out.print(board[c][d]+ " ");
            }
            System.out.println();
        }//Prints the board
    }
    public static void xAdjacent(char xPoints[] []){
        //This method is solely increment the values adjacent the mines
        for(int e=0;e<xPoints.length;e++){
            for(int f=0;f<xPoints[e].length;f++){
                if(xPoints[e][f]=='M'){
                    if(e-1>=0){
                        if(xPoints[e-1][f]!='M'){
                            xPoints[e-1][f]++;
                        }
                        if(f-1>=0&&xPoints[e-1][f-1]!='M'){
                            xPoints[e-1][f-1]++;
                        }
                        if(f+1<xPoints[e].length&&xPoints[e-1][f+1]!='M'){
                            xPoints[e-1][f+1]++;
                        }
                    }
                    if(e+1<xPoints.length){
                        if(xPoints[e+1][f] != 'M'){
                            xPoints[e+1][f]++;
                        }
                        if(f-1>=0&&xPoints[e+1][f-1]!='M'){
                            xPoints[e+1][f-1]++;
                        }
                        if(f+1<xPoints[e].length&&xPoints[e+1][f+1]!='M'){
                            xPoints[e+1][f+1]++;
                        }
                    }
                    if(f+1<xPoints[e].length&&xPoints[e][f+1]!='M'){
                        xPoints[e][f+1]++;
                    }
                    if(f-1>=0&&xPoints[e][f-1]!='M'){
                        xPoints[e][f-1]++;
                    }
                }
            }
        }
    }
}