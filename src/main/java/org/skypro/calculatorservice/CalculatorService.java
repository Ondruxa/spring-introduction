package org.skypro.calculatorservice;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        } else {
            int num3 = num1 + num2;
            return num1 + " + " + num2 + " = " + num3;
        }
    }


    String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }

    String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }

//    String divide(Integer num1, Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "один (оба) из параметров не определён(ы)";
//        } else if (num2 != 0) {
//            int num3 = num1 / num2;
//            return num1 + " / " + num2 + " = " + num3;
//        } else
//            return "Ошибка! Деление на ноль.";
//    }


}
