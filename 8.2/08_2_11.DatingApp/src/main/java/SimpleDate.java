
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (day < 30) {
            day = day + 1;
        } else if (day == 30 && month < 12) {
            day = 1;
            month = month + 1;
        } else if (day == 30 && month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
        }
    }

    public void advance(int howManyDays) {
        for(int i = 0; i < howManyDays; i++)
            advance();
    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate newDate = new SimpleDate(day, month, year);

        for(int i = 0; i < days; i++)
            newDate.advance();

        return newDate;
    }


    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
