package ru.vienoulis.logic;

public class Access {
    private String login = "user";
    private String pass = "user";

    public boolean isStat() {
        return stat;
    }

    private boolean stat;

    public Access(Admin admin){

    }

    /*
     * Логин и пароль находяться в БД
     * Значение по умолчанию user.
     * Privet пока нет БД
     */
    public String getLogin() {

        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }
}
