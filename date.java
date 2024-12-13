
public class date {
    private int year;
    private int month;
    private int day;
    public date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int daysInBetween(date start, date end) {
        int yearsInBetween=end.year-start.year;
        int monthsInBetween=end.month-start.month;
        int daysInBetween=end.day-start.day;
        return daysInBetween+monthsInBetween*30+yearsInBetween*360;
    }
}
