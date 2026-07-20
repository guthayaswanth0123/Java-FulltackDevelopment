// public class JaggedArray {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2},
//             {3,4,5},
//             {6},
//             {7,8,9,10}
//         };
//         for(int[] row : arr)
//         {
//             for(int value : row)
//             {
//                 System.out.print(value+" ");
//             }
//             System.out.println();
//         }
//     }
// }



public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][];

        arr[0] = new int[]{1,2};
        arr[1] = new int[]{3,4,5,6};
        arr[2] = new int[]{7};
        arr[3] = new int[]{8,9,10};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}