public class MedianOfThree {

    public int median(int a, int b, int c) {
        int[] FirstArray = {a, b, c};
        int[] SecArray = new int[]{FirstArray.length};
        int temp;
        int Mid;
        for (int i = 0; i < FirstArray.length - 1; i++) {
            for (int j = 0; j < FirstArray.length - 1; j++) {
                if (FirstArray[j] > FirstArray[j + 1]) {
                    temp = FirstArray[j];
                    FirstArray[j] = FirstArray[j + 1];
                    FirstArray[j + 1] = temp;
                }
            }
        }

        if (!(FirstArray.length % 2 == 0)) {
            Mid = FirstArray[FirstArray.length / 2];
        } else {
            Mid = FirstArray[(FirstArray.length + 1) / 2];
        }


        return Mid;
    }

    void main(String[] args) {
        System.out.println("The Median number is " + (median(25, 11, 33)));
    }

}
