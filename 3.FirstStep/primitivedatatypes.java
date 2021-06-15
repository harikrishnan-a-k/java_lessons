public class primitivedatatypes {
    public static void main(String[] args) {
        int minIntVal= Integer.MIN_VALUE;
        int maxIntVal= Integer.MAX_VALUE;
        
        // System.out.println(sizeOfInt);
        System.out.println("minIntVal:"+minIntVal+"   , maxIntVal:"+maxIntVal);

        // type casting - without vcasting java assumen  the result to be int
        short myShortMaxValue = Short.MAX_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;

        short halfShortVAlue= (short)(myShortMaxValue/2);
        System.out.println("type cated short: "+halfShortVAlue);

        byte halfByteShortValue =(byte)(myByteMaxValue/2);
        System.out.println("type casted byte :"+halfByteShortValue);
    }
}
