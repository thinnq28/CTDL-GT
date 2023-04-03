package GT;

public class Recursion {
    //tinh n!, return n!
    private static int giaiThua(int n){
        //bai toan co so
        if(n == 0) return 1;
        //cong thuc quy nap
        int t = n * giaiThua(n - 1);
        return t;
    }

    //tim finonacci thu n
    private static int fibonacci(int n){
        //bai toan co so
        if(n <= 2) return 1;
        //cong thuc quy nap
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    private static void printElement(int[] arr, int index){
        //bai toan co so
        if(index < 0 || index >= arr.length) return;

        //cong thuc quy nap: in phan tu index, print index + 1
        System.out.println(arr[index]);
        printElement(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};

//        currentMax = -1;
//        System.out.println(findMax2(arr, 0, -1));

        System.out.println(10 % 5);
    }

    //phân loại đệ quy (dựa vào thứ tự thực hiện logic và lời gọi hàm)
    /*
    * Đệ quy thực hiện công việc trước
    * Đệ quy thực hiện công việc sau
    * */

    //ưu điểm và nhược điểm của đệ quy
    /*
    * Ưu diểm: ngắn gọn, dễ hình dung, dễ implement(triển khai)
    * Nhược điểm: nếu không xừ lý đúng dễ gây stackOverFlow
    *             tốn hiệu năng về mặt thời gian và không gian bộ nhớ
    * */

    //tối ưu đệ quy

    /* đệ quy có nhớ */
    static int[] F = new int[1000];
    private static int fibonacci2(int n){
        if(F[n] != 0) return F[n];

        System.out.println("Can tinh F[" + n + "]");
        //bai toan co so
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        //cong thuc quy nap
        F[n] = fibonacci2(n - 1) + fibonacci2(n - 2);
        return F[n];
    }

    //khử đệ quy

    //khi nào sử dụng đệ quy
    /*
    * khi chúng ta cần implement một chức năng nào đó để test hoặc kiểm thử 1 giải pháp (solution) nào đó
    * mà chưa cần quan tâm đến hiệu năng
    * khi tài nguyên để sử dụng đệ quy gần tương đương với không sử dụng đệ quy
    * khi đệ quy là cách làm duy nhất mà bạn biết
    * */

    //phân loại cài đặt đệ quy
    //not return result
    //sử dụng cho hầu hết các bài toán (nếu có sử dụng đệ quy)
    //những bài toán hay lưu kết quả
    private static int currentMax = -1;
    private static void findMax1(int[] arr, int i){
        //bai toan co so
        if(i < arr.length) {
            if (arr[i] > currentMax) currentMax = arr[i];
            //cong thuc quy nap
            findMax1(arr, i + 1);
        }
    }

    //return result
    //áp dụng cho những CTDL có tính đệ quy(linkedlist, tree, ...)
    private static int findMax2(int[] arr, int i, int prevMax){
        if(i < arr.length){
            int curMax = Math.max(prevMax, arr[i]);

            return findMax2(arr, i + 1, curMax);
        }
        return prevMax;
    }
}
