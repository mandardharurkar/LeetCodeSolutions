public class StrStr {
    public static void main(String[] args) {
        System.out.println(strstr("hello","ll"));
    }

    private static int strstr(String haycast, String needle) {
        if (needle == null){
            return 0;
        }
        int l1 = haycast.length();
        int l2=needle.length();

        if (l1 < l2 ) return -1;

        int threshold = l1 -l2;

        for (int i=0;i <= threshold ;i++){
            if (haycast.substring(i,i+l2).equals(needle)){
                return i;
            }
        }

      return -1;
    }


}
