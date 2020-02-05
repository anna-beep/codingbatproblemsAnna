public class Runner {
    public static void main(String[] args) {
        int[] y = {1,2};
        int[] x = {3,4};
        int[] z = {2, 1, 2, 3, 4};

        System.out.println(icyHot(20, 120));
        System.out.println(stringX("xxHxix"));
        System.out.println(helloName("Jim"));
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(plusTwo(y, x));
        System.out.println(countEvens(z));
        System.out.println(cigarParty(50, false));
        System.out.println(luckySum(1, 2, 13));
    }
//warm up 1
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 && temp2<0) || (temp1 <0 && temp2>100)){
            return true;
        }else{
            return false;
        }

    }
//Warm up 2
    public static String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
//string 1
    public static String helloName(String name) {
        return "Hello "+ name +"!";
    }

//string 2
    public static String repeatEnd(String str, int n) {
        String repeat="";
        int resultN = str.length()-n;
        for(int i=0; i<n; i++){
            repeat += str.substring(resultN, str.length());
        }
        return repeat;
    }

//array 1
    public static int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[4];
        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];
        return arr;
    }

//array 2
    public static int countEvens(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]%2 != 1){
                count +=1;
            }
        }
        return count;
    }

//array 3


//logic 1
public static boolean cigarParty(int cigars, boolean isWeekend) {
    boolean good = false;
    if(cigars>=40 && isWeekend == true || cigars>=40 && cigars <= 60 ){
        good = true;
    }
    return good;
}

//logic 2
public static int luckySum(int a, int b, int c) {
    int aa = a;
    int bb = b;
    int cc = c;
    if (a==13){
        aa= 0;
        bb= 0;
        cc= 0;
    }
    if (b==13){
        bb=0;
        cc=0;
    }
    if (c==13){
        cc=0;
    }
    int sum = aa+bb+cc;
    return (sum);
}



}
