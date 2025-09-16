package Day42;

public class PrintElementsOf_TwoDArray {
    public static void main(String[] args) {
        int [] [] matrix= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for(int i=0;i<matrix.length;i++)
        {
            int []row=matrix[i];
            for(int j=0;j<row.length;j++)
            {
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }



    }
}
