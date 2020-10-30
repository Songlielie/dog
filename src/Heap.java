
public class Heap {

    static int[] maxHeap(int[] heap){
        int n = heap.length;
        //构建大顶堆
        for (int i = (n - 2)/2;i>=0;i--){
            downAdjust(heap,i);
        }
        //构建有序堆
//        for (int i = n-1;i>0;i--){
//            int temp = heap[0];
//            heap[0] = heap[i];
//            heap[i] = temp;
//            downAdjust(heap,i);
//        }
        for (int i = 1;i>0;i--){
            downAdjust(heap,i);
        }

        return heap;
    }
    static void downAdjust(int[] arr4,int parent){

        int len = arr4.length;
        int child = parent * 2 +1;
        int temp = arr4[parent];
        while (child < len){
            if (child +1 < len && arr4[child]< arr4[child+1])
                child++;
            if (arr4[child]<arr4[parent])
                break;
            //父节点下沉
            arr4[parent] = arr4[child];
            parent = child;
            child = 2*parent +1;
        }
        arr4[parent] = temp;
    }
}
