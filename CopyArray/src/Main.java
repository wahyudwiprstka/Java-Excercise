public class Main {
    public static String[] copyArr(String[] arr){
        String[] resultArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            resultArr[i] = arr[i];
        }
        return resultArr;
    }
    public static void main(String[] args) {
        String arr[] = {"Wahyu", "Dwi", "Prastika"};
        String arrCopy[] = copyArr(arr);
        System.out.println("Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Copied Array");
        for(int i = 0; i < arrCopy.length; i++){
            System.out.print(arrCopy[i] + " ");
        }
        System.out.println();
    }
}
