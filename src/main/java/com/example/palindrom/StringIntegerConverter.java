package com.example.palindrom;

public class StringIntegerConverter {
    public static void main(String[] args) {
        String str = "47";
        //System.out.println(BinaryReversal(str));
        BinaryReversal(str);
    }
     static int BinaryReversal(String str){
        if(str.length() == 0 || str == null){
            return 0;
        }
        //parse string integer to int
        int convert = Integer.parseInt(str);
        //get the binary value of int
        String binary = Integer.toBinaryString(convert);
        String tempBinary = toBinary(binary);
        String reverseBinary = reverse(tempBinary);
        return getDecimal(reverseBinary);

    }
    //reverse 8 bit padded binary
    static String  reverse(String s){
        String result = "";
       char [] arr = s.toCharArray();
       for(int i = arr.length -1; i>= 0; i--){
           result = result + arr[i];
       }
       return result;
    }
    //get decimal value of reversed binary String
    public static int getDecimal(String binary){
        int decimal = 0;
        int n = 0;
        int len = Integer.parseInt(binary);
        while(true){
            if(len == 0){
                break;
            } else {
                int temp = len%10;
                decimal += temp*Math.pow(2, n);
                len = len/10;
                n++;
            }
        }
        System.out.println(decimal);
        return decimal;

    }
    //if the binary value length is less than 8 add 0 upfront
    public static String toBinary(String binary){
        while(binary.length() != 8){
            binary = "0" + binary;
        }
        return binary;
    }
}
