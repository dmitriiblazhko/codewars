package ru.blazhko.freespace;

/**
 * Simple, remove the spaces from the string, then return the resultant string.
 */

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "sdfs sdf sdf sdfuhiweuiwh ehe 9wf";
        s = s.replaceAll(" ", "");
        System.out.println(s);
    }
}

