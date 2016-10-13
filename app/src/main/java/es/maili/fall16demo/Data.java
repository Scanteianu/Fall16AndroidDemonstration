package es.maili.fall16demo;

import java.util.ArrayList;

/**
 * Created by Dan on 13-Oct-16.
 */
public class Data {
    public static ArrayList<String> people = new ArrayList<String>();
    public static String getAll(){
        String s="";
        for(String p : people){
            s+=p+'\n';
        }
        return s;
    }
}
