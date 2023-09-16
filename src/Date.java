public class Date {
    private int date;
    private int month;
    private int year;

    Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;

    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        String mfgdate = String.format("%d-%d-%d", date, month, year);
        return mfgdate;
    }

    public Date isrecentdate(Date d1, Date d2) {
        if (d1.getMonth() > d2.getMonth() || d1.getDate() > d2.getDate() || d1.getYear() > d2.getYear())
            return d1;
        else return d2;
    }
}

