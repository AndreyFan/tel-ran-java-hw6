package org.example.hw_04juni;

import java.util.Scanner;

public class hw04juni {
    public static void main(String[] args) {
        // 1 уровень сложности: №1.
        //
        //Представим, что у нас есть устройство, в котором две колбы.
        //Прибор работает корректно, если температура первой колбы выше 100 градусов,
        // а температура второй колбы меньше 100 градусов.
        //Вы должны написать метод, который проверяет это устройство.
        //Ваша программа должна иметь переменные temperature1 и temperature2.
        //В результате метод возвращает true или false.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature of the first flask ");
        int temperature1 = scanner.nextInt();
        System.out.println("Enter temperature of the second flask ");
        int temperature2 = scanner.nextInt();
        if (checkingT(temperature1, temperature2)) {
            System.out.println("the device works correctly");
        } else {
            System.out.println("the device is not working correctly");
        }
        System.out.println();
        System.out.println("--------------task 2--------------------------------");
        //У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму,
// которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
// чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//Ввод:  N = 21
//Выход:  7
//Объяснение:  N = 21
//Снято 7, осталось = 14
//Снято 7, осталось = 7
//Снято 1, осталось = 6
//Снято 3, осталось = 3
//Снято 1, осталось = 2
//Снято 1, Осталось = 1
//Снято 1, осталось = 0
        System.out.println("enter the amount of funds in the bank account");
        int sumBank = scanner.nextInt();
        int remainder = sumBank;
        int counter = 0;
        while (sumBank > 1) {
            for (int i = remainder-1 ; i >= 1; i--) {
                if ((remainder) % i == 0) {
                    sumBank = sumBank-i;
                    remainder = sumBank;
                    counter += 1;
                    System.out.println("Снято " + i + "," + " " + "осталось = " + sumBank);
                    i=remainder-1;
                }
            }
        }
            sumBank =sumBank- 1;
            counter += 1;
            System.out.println("Снято 1, осталось = 0");
            System.out.println("потребуется " + counter + " дней");
        System.out.println();
        System.out.println("--------------additional task--------------------------------");
        //Дополнительно
//
//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан.
//Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил
// количество этажей, то считается что лифт поднялся на самый верх.
//Найдите количество подъемов, которые понадобятся лифту.
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подъем: 50 - 1 = 49
//Второй подъем: 49 + 50 - 1 = 98
//Третий подъем: 98 + 50 - 1 = 147
//Четвертый подъем: 147 + 50 - 1 = 196
//Пятый подъем: выйти за пределы H.
//
//Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
        System.out.println("Enter number of floors ");
        int Floor = scanner.nextInt();
        System.out.println("lift rise ");
        int stepUp = scanner.nextInt();
        System.out.println("lift lowering ");
        int stepDown = scanner.nextInt();
        System.out.println("потребуется " + numberOfLifts(Floor, stepUp,stepDown)+ " подъёмов");

    }
    public static boolean checkingT(int temperature1, int temperature2){
        boolean checkR=false;
        if (temperature1>100 && temperature2<100) {
            checkR=true;
        }
        return checkR;
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown){
        int upFloor=0;
        int numberOfUp=0;
        while (upFloor < floor){
            upFloor= upFloor +stepUp-stepDown;
            numberOfUp=numberOfUp+1;
        }
        return numberOfUp;
    }
}


