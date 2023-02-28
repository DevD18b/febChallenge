public class AddBinaryString{




    public static int decimal(String str){
        int temp = Integer.parseInt(str);

        int decimalValue = 0;
        int index  = 0;
        int baseValue = 1;
        int num = temp;
        while(num!=0){
          int lastDigit = num%10;
          num/=10;
          decimalValue+=lastDigit*baseValue;
          baseValue*=2;
        }
        return decimalValue;
    }
    public static String binary(int num){
        
        String str = String.valueOf(num);
     
        int [] binaryString = new int[1000];

        int index  = 0;
        while(num>0)
        {
            int rem = num%2;
            num/=2;
            binaryString[index++]  = rem;
        }
         
        StringBuilder sb =  new StringBuilder();
        for(int j = index-1; j>=0; j--){
            sb.append(binaryString[j]);
        }
        return  sb.toString();
    }
   

    
}
