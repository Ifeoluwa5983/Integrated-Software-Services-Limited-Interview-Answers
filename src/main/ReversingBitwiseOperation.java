package main;

public class ReversingBitwiseOperation {

     public int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));

        x = x | n;

        return x;
    }

    public int decodeInteger(int x){

        return x>>(1>>(1>>(1>>1)));
    }

    public void encodeArray(int [] A, int [] B, int n){
        for(int i=0;i<n;i++) {
            A[i] = encodeInteger(A[i], B[i]);

            System.out.println(A[i]);
        }
    }

}
