public class App {
    public static void main(String[] args) {
      int[] array = {1,3,5};
      rev(array);
      System.out.print("数组的反序：");
      printArray(array);
      int[] copy = copy(array);
      array[0] = 9;
      System.out.print("修改原数组：");
      printArray(array);
      System.out.print("复制的数组：");
      printArray(copy);
    }

    public static void rev(int[] pa){
        for(int i = 0, j = pa.length - 1; i < j; i++, j--){
            int temp = pa[i];
            pa[i] = pa[j];
            pa[j] = temp;
        }
    }

    public static int[] copy(int[] pa){
        int[] newarray = new int[pa.length];
        for(int i = 0; i < pa.length; i++){
            newarray[i] = pa[i];
        }
        return newarray;
    }

    public static void printArray(int[] pa){
        for(int i = 0; i < pa.length; i++){
            System.out.print(pa[i] + "\t");
        }
        System.out.println();
    }
}
