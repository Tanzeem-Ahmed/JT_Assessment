import java.util.Scanner;

abstract class CarService {
    public static int billAmount = 0;

    public abstract void BS01();

    public abstract void EF01();

    public abstract void CF01();

    public abstract void BF01();

    public abstract void GF01();
}

class HatchBack extends CarService {
    int BS01 = 2000;
    int EF01 = 5000;
    int CF01 = 2000;
    int BF01 = 1000;
    int GF01 = 3000;

    @Override
    public void BS01() {
        System.out.println("Basic Service : " + BS01);
        billAmount += BS01;
    }

    @Override
    public void EF01() {
        System.out.println("Engine Fixing : " + EF01);
        billAmount += EF01;
    }

    @Override
    public void CF01() {
        System.out.println("Clutch Fixing : " + CF01);
        billAmount += CF01;
    }

    @Override
    public void BF01() {
        System.out.println("Brake Fixing : " + BF01);
        billAmount += BF01;
    }

    @Override
    public void GF01() {
        System.out.println("Gear Fixing : " + GF01);
        billAmount += GF01;
    }
}

class Sedan extends CarService {
    int BS01 = 4000;
    int EF01 = 8000;
    int CF01 = 4000;
    int BF01 = 1500;
    int GF01 = 6000;

    @Override
    public void BS01() {
        System.out.println("Basic Service : " + BS01);
        billAmount += BS01;
    }

    @Override
    public void EF01() {
        System.out.println("Engine Fixing : " + EF01);
        billAmount += EF01;
    }

    @Override
    public void CF01() {
        System.out.println("Clutch Fixing : " + CF01);
        billAmount += CF01;
    }

    @Override
    public void BF01() {
        System.out.println("Brake Fixing : " + BF01);
        billAmount += BF01;
    }

    @Override
    public void GF01() {
        System.out.println("Gear Fixing : " + GF01);
        billAmount += GF01;
    }
}

class SUV extends CarService {
    int BS01 = 5000;
    int EF01 = 10000;
    int CF01 = 6000;
    int BF01 = 2500;
    int GF01 = 8000;

    @Override
    public void BS01() {
        System.out.println("Basic Service : " + BS01);
        billAmount += BS01;
    }

    @Override
    public void EF01() {
        System.out.println("Engine Fixing : " + EF01);
        billAmount += EF01;
    }

    @Override
    public void CF01() {
        System.out.println("Clutch Fixing : " + CF01);
        billAmount += CF01;
    }

    @Override
    public void BF01() {
        System.out.println("Brake Fixing : " + BF01);
        billAmount += BF01;
    }

    @Override
    public void GF01() {
        System.out.println("Gear Fixing : " + GF01);
        billAmount += GF01;
    }
}

public class Main {

    public static int getBill(String car, String services[]) {
        CarService bill = null;

        if (car.equals("HatchBack")) {
            bill = new HatchBack();
        } else if (car.equals("Sedan")) {
            bill = new Sedan();
        } else if (car.equals("SUV")) {
            bill = new SUV();
        }

        for (String service : services) {
            if (service.equals("BS01")) {
                bill.BS01();
            } else if (service.equals("EF01")) {
                bill.EF01();
            } else if (service.equals("CF01")) {
                bill.CF01();
            } else if (service.equals("BF01")) {
                bill.BF01();
            } else if (service.equals("GF01")) {
                bill.GF01();
            }
        }

        return CarService.billAmount;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car name : ");
        String car = sc.next();
        System.out.println("Enter the list of services you want for your car : ");
        int n = sc.nextInt();
        String services[] = new String[n];

        for (int i = 0; i < n; i++)
            services[i] = sc.next();

        int billAmount = getBill(car, services);

        System.out.println("Total bill : " + billAmount);

        if (billAmount >= 10000)
            System.out.println("Complimentary cleaning has been provided");

        sc.close();
    }
}
