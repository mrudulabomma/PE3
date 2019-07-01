public class ChessBoardPattern {
    public static String[][] createChessBoardPattern() {
        String arr[][] = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if(j%2==0)
                    arr[i][j] ="WW|";
                    else
                    arr[i][j]="BB|";
                }
                else {
                    if (j % 2 == 0)
                        arr[i][j] = "BB|";
                    else
                        arr[i][j] = "WW|";
                }


            }
        }
        return arr;
    }

}
