package Year1.exam.midterm;

public class MQ1_6410381{
    public static void main(String args[]) {
        System.out.println(countRepeatN("hello",2));
        System.out.println(countRepeatN("123456",1));
        System.out.println(countRepeatN("xxxabyyyycd",2));
        System.out.println(countRepeatN("xxxabyyyycd",3));
        System.out.println(countRepeatN("191233333315aabb",5));
        System.out.println(countRepeatN("hhjjyyee",3));
        System.out.println(countRepeatN("ddddd",6));
        System.out.println(countRepeatN("87654",2));
        System.out.println(countRepeatN("ttttttttt",2));
        System.out.println(countRepeatN("2222",2));
    }

    public static int countRepeatN(String inStr,int n){
        int index_cur = 0;
        int set = 0;
        int count = 0,result = 0;

        while( index_cur<inStr.length()){

            for (int i=index_cur;i<inStr.length();i++){
                if (inStr.charAt(i)==inStr.charAt(index_cur)){
                    count++;
                    if (count==n){
                        result++;
                    }
                }
            }

            index_cur++;
            count=0;
        }

        return result;
    }

}