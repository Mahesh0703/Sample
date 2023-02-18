package com.pck.practices;

public class Main {
    public static void main(String[] argv) throws Exception {
//        String[] src = new String[] { "1", "abc", "level", null,
//                "java2s.com", "asdf 123" };
    	
    	String []src=new String[] {"12","abc","123","10"};
        System.out.println(java.util.Arrays
                .toString(copyStringToIntArray(src)));
    }//from   www  . ja va 2s.co  m

    /**
     * <p>Extract integer values from an array of strings into an array of int.</p>
     *
     * <p>Exceptions in the format of the string are trapped and 0 value(s) returned.</p>
     *
     * @param   src   an array of strings, each of which should be an integer numeric value
     * @return      an array of int
     */
    static public int[] copyStringToIntArray(String[] src) {
        if (src == null)
            return null;
        int n = src.length;
        int[] dst = new int[n];
        for (int j = 0; j < n; ++j) {
            int value = 0;
            try {
                value = Integer.valueOf(src[j]).intValue();
            }
            catch (NumberFormatException e) {
            }
            catch (NullPointerException e) {
            }
            dst[j] = value;
        }
        return dst;
    }
}
