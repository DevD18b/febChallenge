public class gcdInString {

    public static String gcdString(String str1 , String str2){
        if((str1+str2).equals(str2+str1)) return " ";
        int n1 = str1.length();
        int n2 = str2.length();
        int possibleGcd = gcd(n1,n2);
        return str1.substring(0,possibleGcd);
    }
    
    public static int gcd(int a , int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b){
            return gcd(a-b,b);
        }
        else{
            return gcd(a,b-a);
        }
    }
}

