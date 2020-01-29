package logic;

public class Hostel {

    private int costForOneDay = 500;
    private int costForThreeDays = 300;
    private int costForFourteenDays = 270;
    private Access access;
    private String name;
    private int countOfDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public void setCostForOneDay(int costForOneDay) {
        this.costForOneDay = costForOneDay;
    }

    public void setCostForThreeDays(int costForThreeDays) {
        this.costForThreeDays = costForThreeDays;
    }

    public void setCostForFourteenDays(int costForFourteenDays) {
        this.costForFourteenDays = costForFourteenDays;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private Admin admin;

    public int getCostForOneDay() {
        return costForOneDay;
    }

    public int getCostForThreeDays() {
        return costForThreeDays;
    }

    public int getCostForFourteenDays() {
        return costForFourteenDays;
    }
}
