package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Collection<String> str = new ArrayList<String>();
        str.add("a");
        str.add("b");
        str.add("a");
        str.add("a");
        str.add("b");
        str.add("c");

        //str = Main.removeDuplicates(str);
        str = Main.clearRepeat(str);

        for (String s: str){
            System.out.println(s);
        }
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<T>(collection); // Вот и всё!
    }

    public static <T> Collection<T> clearRepeat(Collection<T> collection){
        boolean chek = false;
        Collection<T> newCollection = new ArrayList<T>();

        for (T t: collection){
            for (T t2: newCollection){
                if(t.equals(t2)){
                    chek = true;
                }
            }
            if (!chek){
                newCollection.add(t);
            }
            chek = false;
        }
        return newCollection;
    }
}
