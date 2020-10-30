import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String[] s = new String[]{"1","4","3","6"};
        System.out.println("请输入数据：");
        String str = scanner.nextLine();  //获取所在行的内容
        //str = str.substring(1,str.length()-1);
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        int[] arr1 = new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        for(int i=0;i<s.length;i++){
            arr1[i] = Integer.parseInt(s[i]);
        }
        long startTimes = System.currentTimeMillis();
        int[] ints = Heap.maxHeap(arr);
        long endTimes = System.currentTimeMillis();
        System.out.println(endTimes-startTimes+"ms");
        System.out.println(Arrays.toString(ints));
        System.out.println(selectOne(arr1));
    }

    static int[] bubble(int[] arr){

        int n = arr.length;
        if(n<2){
            return arr;
        }
        boolean flag = true;
        for(int i = 0;i < n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    flag = false;
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
            if (flag){break;}
        }
        return arr;
    }

    static int[] insertSort(int[] arr){

        int n = arr.length;
        if(n<2){
            return arr;
        }

        for(int i =1;i<n;i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tem = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tem;
                }else
                {
                    break;
                }
            }
        }
        return arr;
    }

    static Integer selectOne(int[] arr1){

        int n = arr1.length-1;
        for(int i =0;i<=n;i++){
            for (int j =0;j<=n;j++){
                if(i==j)
                    continue;
                if(arr1[i]==arr1[j])
                    break;
                if (i == n && j == n-1)
                    return arr1[i];
                else if (j == n)
                    return arr1[i];
            }
        }
        return null;
    }

    static int[] selectOneArr(int[] arr3){

        int n = arr3.length-1;
        int[] arr0 = new int[n];
        int a = 0;
        for(int i =0;i<n;i++){
            for (int j =0;j<=n;j++){
                if(i==j)
                    continue;
                if(arr3[i]==arr3[j])
                    break;
                if (j == n)
                    a++;
                    arr0[a] = arr3[i];
            }
        }
        return arr0;
    }

    static int[] quickSort(int[] arr4){

        int len = arr4.length;
        int mid = arr4[0];
        for(int i =1; i<len;i++){
            if (arr4[i]<mid && i>1){
                break;
            }
        }
        return arr4;
    }
}