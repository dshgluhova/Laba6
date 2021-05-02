package bsuir.group922402.var6.gluhova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        /*Общая постановка. Дано: число N и последовательность a1, a2, … aN. Создать шаблон класса,
        порождающий динамические одномерные массивы с элементами различных типов (вещественные,
        целочисленные, символьные). Тип данных и результат являются параметрами по отношению к классу,
        программа должна иметь методы инициализации, конструктор, деструктор.
        6 Вариант: (a1+1),(a2+2), (a3+3), …, (aN+N);*/

public class Main {
    public static void main(String[] args) {
        List<Integer> SubArray2 = new ArrayList<>(); //Конструктор
        List<Double> SubArray3 = new ArrayList<>();
        List<String> SubArray4 = new ArrayList<>();
        int count = 0;
        Scanner input = new Scanner(System.in);
            System.out.println("Choose type of array: Integer(1), Double(2) or String(3)");
            int R = input.nextInt();
            if (R == 1) {
                System.out.println("Enter Integer array length: ");
                int N = input.nextInt();
                System.out.println("Insert Integer array elements:");
                for (int i = 0; i < N; i++) {
                    SubArray2.add(input.nextInt());
                }
                System.out.print("Inserted array elements:");
                System.out.println(SubArray2);
                for (int i = 0; i < N; i++) {
                    count++;
                    System.out.print(SubArray2.get(i) + "+" + count + ", ");
                }
            } else if (R == 2) {
                System.out.println("Enter Double array length: ");
                int S = input.nextInt();
                System.out.println("Insert Double array elements:");
                for (int i = 0; i < S; i++) {
                    SubArray3.add(input.nextDouble());
                }
                System.out.println("Your array:");
                System.out.println(SubArray3);
                for (int i = 0; i < S; i++) {
                    count++;
                    System.out.print(SubArray3.get(i) + "+" + count + ", ");
                }
            } else if (R == 3) {
                System.out.println("Enter String array length: ");
                int T = input.nextInt();
                System.out.println("Insert String array elements:");
                for (int i = 0; i <= T; i++) {
                    SubArray4.add(input.nextLine());

                }
                SubArray4.remove(0);
                System.out.println("Your array:");
                System.out.println(SubArray4);
                for (int i = 0; i < T; i++) {
                    count++;
                    System.out.print(SubArray4.get(i) + "+" + count + ", ");
                }
            }
            else {
                System.out.println("ERROR, try again :)");
            }
        }
    }
