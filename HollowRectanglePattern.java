//hollow rectangle
import java.util.*;
public class javacodes{
public static void hollowRectangle(int trows,int tcols){
    for(int i=1;i<=trows;i++){
        for(int j=1;j<=tcols;j++){
            if(i==1||i==trows||j==1||j==tcols){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void main(String args[]){
    hollowRectangle(4, 5);
}
}
