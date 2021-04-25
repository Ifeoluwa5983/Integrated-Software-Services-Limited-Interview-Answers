package main;

public class ReversingBitwiseOperation {

     public int encodeInteger(int x, int n){
         // Bitwise operation >> means multiplying by 2 raised to the powers of the number
        n = n<<(1<<(1<<(1<<1)));
        // Bitwise operation | OR means after converting to binary either 1 or 0
         // Another simple way for this is adding x and n together
        x = x | n;

        return x;
    }

    //Still trying to decipher the reverse method for the encode integer method
    public int decodeInteger(int x){
        x = x>>(1>>(1>>(1>>1)));
        return x ;
    }

    public void encodeArray(int [] A, int [] B, int n){
        for(int i=0;i<n;i++) {
            A[i] = encodeInteger(A[i], B[i]);

            System.out.println(A[i]);
        }
    }

}
