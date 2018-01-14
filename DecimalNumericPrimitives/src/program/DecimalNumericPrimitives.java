package program;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {
        float myFloat = 25.4f;

//        double before = 10_.25; // does not compile
//        double after = 10._25; // does not compile
//        double first = _10.25; // does not compile
//        double last = 10.25_; // does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54f;
        double anotherDouble = 2.45d;
        double scientific = 5.000125E03;
        double myDouble3 = 5000.125;

        double hexPi = 0x1.91eb851eb851fp1; // p is hexadecimal floating point number
    }
}
