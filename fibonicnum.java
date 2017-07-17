# fibonicnum
mport java.io.*;
import java.util.*;
public class fibonicnum {
public static void main(String args[]){

int k1=0,k2=1,k3,count=10;
System.out.println(k1+" "+k2);
for(int i=2;i<count;++i){
k3=k1+k2;
System.out.println(" "+k3);
k1=k2;
k2=k3;
}
}
}
