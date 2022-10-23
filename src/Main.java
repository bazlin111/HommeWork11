class Homework {


    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

      public static void checkYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d год является високосным\n", year);
        } else {
            System.out.printf("%d  не является високосным\n", year);
        }
    }

    public static void task1() {
        System.out.println();
        System.out.printf(" Укажите   любой год н. э.  - ");
        checkYear(2022);

    }

    public static void operativeSystem(int yourSystem, int phoneYear) {
        if (yourSystem == 0) {
            if (phoneYear >= 2015)
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            else
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        }
        if (yourSystem == 1) {
            if (phoneYear >= 2015)
                System.out.println(" Установите версию приложения для Android по ссылке");
            else
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println(" Укажите вашу операционную систему и год выпуска телефона : ");
        System.out.println();
        operativeSystem(0, 2014);
    }

    public static void deliverDays(int deliverDist) {
        int result = 1;
        if (deliverDist > 20) {
            result++;
        }
        if (deliverDist > 60) {
            result++;
        }
        System.out.println(" Потребуеться дней :" + result);
        }
        public static void task3() {
            System.out.println();
            deliverDays( 95);

      }

    }

   
