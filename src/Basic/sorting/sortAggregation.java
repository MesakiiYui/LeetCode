package Basic.sorting;

/**
 * Created by tiejin on 10/9/2018.
 */
public class sortAggregation {
    private static void swap(int[] arr, int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    // 冒泡排序
    private static void bubble(int[] arr) {
        int len = arr.length;
        for(int i = 0;i < len;i +=1){
            for(int j = len -1; j > i; j -=1){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }

    }
    // 冒泡排序的改进，鸡尾酒排序
    private static void cocktail(int[] arr){
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left<right){
            for(int i =left; i<right; i++){
                if(arr[i] >arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            right--;
            for(int i=right;i>left;i--){
                if(arr[i-1]>arr[i]){
                    swap(arr,i-1, i);
                }
            }
            left++;
        }
    }

    // 选择排序
    private static void selectSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i+=1){
            int max = arr[0];
            int maxIndex = 0;
            for(int j=0;j<len-i;j+=1){
                if(arr[j]>max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            // System.out.println(maxIndex +":"+arr[maxIndex]);
            swap(arr,maxIndex,len-i-1);
        }
    }

    // 插入排序insertSort
    // 需要不断地挪位置
    private static void insertSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i<len;i+=1){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    // 折半插入排序
    // 找到一个合适的位置，整体向后移动
    // http://www.cnblogs.com/eniac12/p/5329396.html


    public static void main(String[] args){
        int[] arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        insertSort(arr);
        for (int x:arr) {
            System.out.print(x);
        }
    }
}
