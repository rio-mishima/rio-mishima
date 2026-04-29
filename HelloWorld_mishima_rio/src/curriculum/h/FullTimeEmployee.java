package curriculum.h;

public class FullTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {

        int wage;

        if (hoursWorked <= 8) {
            wage = hoursWorked * HOURLY_RATE;
        } else {
            int normalPay = 8 * HOURLY_RATE;
            int overtimePay = (int)((hoursWorked - 8) * HOURLY_RATE * 1.25);
            wage = normalPay + overtimePay;
        }

        return wage;
    }
}