package differentSort;

public class guibing {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        new guibing().Sort(arr,0,arr.length-1,tmp);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void merge(int[] arr,int low,int high,int[] tmp){
        int i = 0;
        int mid = (low+high)/2;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        //左右都是顺序排列的
        while(j <= mid && k <= high){
            if(arr[j] < arr[k]){
                tmp[i++] = arr[j++];//i++是用加之前的值
            }else{
                tmp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = arr[j++];
        }

        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }

    public static void Sort(int[] arr,int low,int high,int[] tmp) {
        if (low < high) {
            int mid = (low + high) / 2;
            Sort(arr, low, (low + high) / 2, tmp); //对左边序列进行归并排序
            Sort(arr, (low + high) / 2 + 1, high, tmp);  //对右边序列进行归并排序
            merge(arr, low, high, tmp);    //合并两个有序序列
        }
    }
}
