import java.util.*;
public class javacodes {
    public static int clearBit(int n,int i){
        int bitMask= ~0<<i;
        return n & bitMask; 
    }
    public static int setBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int updateBit(int n,int i,int newBit){
        n=clearBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static int clearBitsInRange(int n,int i,int j){
        int a= ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return n>0 && (n&(n-1))==0;
    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){ //check the LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//check lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(setBit(15,2));
        System.out.println(clearBit(10,1));
        System.out.println(updateBit(10,2,1));
        System.out.println(clearBitsInRange(10, 2, 7));
        System.out.println(isPowerOfTwo(15));
        System.out.println(countSetBits(10));
        System.out.println(fastExpo(3, 5));
    }
}
