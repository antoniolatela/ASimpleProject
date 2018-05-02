import java.util.stream.IntStream;

/**
 * Created by alatel01 on 02/05/2018.
 */
public abstract class Date {
    private int day;
    private int month;
    private int year;

    private int MAX_DAY = 30;
    private int MAX_MONTH = 12;

    public Date () {
        new Integer(1).hashCode();

        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getDay() + "-" + getMonth() + "-" + getYear();
    }

    @Override
    public int hashCode() {
        return (31 * getDay()) + (31 * getMonth()) + (31 * getYear());
    }

    public void advance() {
        if ((getDay()+1)%MAX_DAY == 0) { setDay(1); }
        else {
            setDay((getDay()+1)%MAX_DAY);
        }
        if ((getMonth()+1)%MAX_MONTH == 0) setMonth(1);

    }

}
