//分析内存案例
class BirthData {
    private int day;
    private int month;
    private int year;

    //构造方法
    public BirthData(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int d) {
        day = d;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int m) {
        month = m;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        System.out.println(day + "-" + month + "-" + year);
    }
}

public class TestBirthday {
    public static void main(String[] args) {
        TestBirthday testBirthday= new TestBirthday();
        int date = 9;
        BirthData d1 = new BirthData(7, 7, 1970);
        BirthData d2 = new BirthData(1, 1, 2000);
        testBirthday.change1(date);
        testBirthday.change2(d1);
        testBirthday.change3(d2);
        System.out.println("date = " + date);
        d1.display();
        d2.display();
    }

    public void change1(int i) {
        i = 1234;
    }

    public void change2(BirthData b) {
        b = new BirthData(22, 2, 2004);
    }

    public void change3(BirthData b) {
        b.setDay(22);
    }
}
