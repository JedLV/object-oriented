//今日重点：二分法查找

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,333};

        int dest = -34;
        //dest =35;

        int head = 0;
        int end = arr.length - 1;

        boolean isFlag = true;
        while (head <= end){
            int middle = (head + end) / 2;

            if (dest == arr[middle]){
                System.out.println(middle);
                isFlag = false;
                break;
            }else if (arr[middle] > dest){
                end = middle -1;
            }else {
                head = middle +1;
            }
        }
        if (isFlag) {
            System.out.println("亚锡勒雷！");
        }
    }
}