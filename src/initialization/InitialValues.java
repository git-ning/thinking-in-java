package initialization;

//Show default initial values.
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("Data Type    Initial value");
        System.out.println("boolean      " + t);
        System.out.println("char         [" + c + "]");
        System.out.println("byte         " + b);
        System.out.println("short        " + s);
        System.out.println("int          " + i);
        System.out.println("long         " + l);
        System.out.println("float        " + f);
        System.out.println("ddouble      " + d);
        System.out.println("refrence     " + reference);
    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.printInitialValues();
    }
}
/* output
 Data Type    Initial value
 boolean      false
 char         [ ]
 byte         0
 short        0
 int          0
 long         0
 float        0.0
 ddouble      0.0
 refrence     null
 */
