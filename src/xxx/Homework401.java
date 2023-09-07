package xxx;

public class Homework401 {
	
	/*
	 * 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	 * (提示：陣列，length屬性)
	 */
	
	public static void main(String[] args) {
		int [] arr={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        double sum =0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg =  sum / arr.length;
        System.out.println("此陣列所有元素的平均值:" + avg);
        System.out.print("陣列內元素大於平均值的元素:");
        for(int i = 0; i < arr.length;i++){
            if (arr[i] > avg){
                System.out.print(arr[i] + " ");
            }
        }
    }
	
}
