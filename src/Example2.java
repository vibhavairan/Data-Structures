public class Example2 {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int temp = 0;
        for (int x = 0; x < 3; x++)
        {
           for(int y=0;y<3;y++)
           {
               if(x>y) {
                   temp = a[x][y];
                   a[x][y] = a[y][x];
                   a[y][x] = temp;
               }
           }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++)
                System.out.print(a[x][y]+" ");
            System.out.println("");
        }

    }
}
