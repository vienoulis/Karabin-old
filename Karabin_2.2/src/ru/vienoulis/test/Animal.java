package ru.vienoulis.test;



public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;

     Animal(String translation){
        this.translation = translation;
    }
    Animal() {

    }
    public String getTranslation (){
        return this.translation;
    }


    @Override
    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
