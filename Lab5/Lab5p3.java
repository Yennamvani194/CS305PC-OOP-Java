import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Add{
    String str="";
    int sum=0;
    public void add(int...a){
        String str="";
        int sum=0;
        for(int i : a){
            sum+i;
            System.out.println(i);
            if(i==a[a.length-1]){
                s+=i+"=";
            }
            else{
                s+=i+"+";
                
           }
        }
        s+=sum;
        System.out.println(s);
}
}

