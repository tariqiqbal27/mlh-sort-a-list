public class SortingList {

    public static void main(String[] a) {
        String text = "hackathons";
        text = text.toLowerCase();

        char[] tmpArr = text.toCharArray();

        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = i + 1; j < tmpArr.length; j++) {
                if (tmpArr[j] < tmpArr[i]) {
                    char temp = tmpArr[i];
                    tmpArr[i] = tmpArr[j];
                    tmpArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < tmpArr.length; i++) {
            System.out.print(tmpArr[i]);
        }

    }

}