package ru.vienoulis.logic;


public class User {
    private String name;

    private Access access;
    private Hostel hostel;
    private Admin admin;


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
    /*
     * Логин и пароль которые вводяться с клавы должны быть проверненны по уровню доступа.
     */
    public void authentication (String login, String pass){
        if (login.equals(access.getLogin()) && pass.equals(access.getPass())) System.out.println(" Логин и пароль верны!");
        else System.out.println("Логин и/или пароль не верны!");
    }

    public void showPayment ( int day, Hostel hostel){

        if (day <= 0) System.out.println("За " + day  + " Вы заплатите "
                + getPayment(day, hostel));
        else System.out.println("Введено н верное количествро дней!");
    }

    public int getPayment ( int day, Hostel hostel) {
        if (day > 0 && day < 3) return day * hostel.getCostForOneDay();
        else if (day > 3 && day < 14) return day * hostel.getCostForThreeDays();
        else if (day > 13) return day * hostel.getCostForFourteenDays();
        else return 0;
    }

    public void createVisitor (Visitor visitor, int day){
        System.out.println("Добавить посетителя в таблицу");
    }

    public void extendsVisitor(Visitor visitor){
        System.out.println("Переместить посетителя в таблицу других посетителей");
    }

    public void getStat(Hostel hostel, Admin admin){
        if (hostel.getAccess().isStat()) System.out.println("Если есть доступ к статистике по этой общаге");

    }

    public void recalculationVisitor(Visitor visitor){

    }
}
