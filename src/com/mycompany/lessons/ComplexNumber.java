package com.mycompany.lessons;

/**
 * Created by Василий on 21.11.2016.
 */


    public class ComplexNumber { // это название класса!
        private int real;// действительная часть числа
        private int im; // мнимая часть числа

        public int getReal() { // метод, который возвращает, текущее значение поля real
            return real;
        }

        public int getIm() {// метод, который возвращает текущее значение поля im
            return im;
        }

        public ComplexNumber(int real, int im) { // конструктор класса ComplexNumber
            this.real = real;
            this.im = im;
        }

        public void add(ComplexNumber aComplexNumber) {
            this.real = this.getReal() + aComplexNumber.getReal();
            this.im = this.getIm() + aComplexNumber.getIm();
        }

        public void multiply(ComplexNumber aComplexNumber) {
            //TODO
        }

        @Override
        public String toString() {
            if (im == 0) {
                return String.valueOf(real);
            } else if (im < 0) {
                return real + "" + im + "i";
            } else {
                return real + "+" + im + "i";
            }
        }

        public static void main(String[] args) {// точка входа в программу
            ComplexNumber cn = new ComplexNumber(1, -2);// присваиваем переменной cn конструктор с полями 1 и -2
            ComplexNumber number2 = new ComplexNumber(1,3);// присваиваем переменной number 2

            cn.add(number2); // вызываем метод который прибавляет к переменной cn переменную number 2
            System.out.println(cn);
        }

    }
