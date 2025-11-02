import java.util.Arrays;

public class DecimalToDual {
    int num = 0;

    /* public DecimalToDual(int[] InitialRemainder, int arrayIndex  ){
        this.num = arrayIndex;
        this.binary = InitialRemainder;

    }
    public DecimalToDual(){
        this.num = 0;
        this.binary= null;
    }*/

    // DecimalToDual FirstObj = new DecimalToDual( );

    public static String transformDual(int dec) {
        int[] binary = new int[30];
        int count = 0;
        String Bit = "";
        if (dec == 0)
            return "0";

        for (int i = dec; i != 0; ) {
            //  this.binary[this.num] = dec%2;
            binary[count] = dec % 2;
            dec = dec / 2;

            i = dec;
            // this.num = this.num + 1;
            count = count + 1;

        }
        int[] result = new int[count];
        for (int j = count; j > 0; j--) {
            // i need result to run from 0 to count -1 but binary to run backwards
            // i am using J - 1 for binary "which means it will run from 0 to count -1" so
            // i have decided to make count - j the index of result (count will be the length of the
            // binary which will remain constant but J isn't constant )
            result[count - j] = binary[j - 1];
            Bit = Bit + result[count - j] ;
        }
        return Bit;


    }

    void main(String[] args) {
        int Input = 47;
        System.out.println("The Binary of " + Input + " is " + transformDual(Input));

    }
}
