public class solution {


    public static int first(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        } else if (a == b && b == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        }
        return 1;
    }
    
    public static String second(double x, double y, double z) {
        if (x + y + z < 1) {
            //find the smallest
            if (x < y && x < z) {
                return "Result is: " + (z + y) / 2;
            } 
            else if (y < z && y < x) {
                return "Result is: " + (x + z) / 2;
            }
            else if (z < y && z < x) {
                return "Result is: " + (x + y) / 2;
            }
        }

        if (x < y) {
            return "Result is: " + (z + y) / 2;
        } else {
            return "Result is: " + (x + z) / 2;
        }
    }

    
    public static double third(double x, double y, double z, String type) {
        if (type == "a") {
            return (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        } else if (type == "b") {
            return ((x > y) ? x : y) + ((y < z) ? y : z);
        } else if (type == "d") {
            return (x + y + z > x * y * z) ? x + y + z : x * y * z;
        } else if (type == "e") {
            return ((x + y + z) / 2 < x * z + 1) ? (x + y + z) / 2 : x * z + 1;
        }
        return 0;
    }
    
    public static String fourth(double a, double b, double c) {

        double d = Math.pow(b, 2) - 4 * a * c, x1, x2;
        String result = "";

        if (d < 0) {
            result = "Tenglama yechimga ega emas";
        } else if (d == 0) {
            result = "x = " + (-b / (2 * a));
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            if (x1 > 0) {
                result += "x1_2 = " + Math.sqrt(x1);
            }
            if (x2 > 0) {
                result += "\nx3_4 = " + Math.sqrt(x2);
            }

            if (x1 < 0 && x2 < 0) {
                result = "tenglama yechimga ega emas";
            }

        }

        return result;
    }
    
    public static int fifth(int k) {
        int copyofk = k, result = 10;
        for (int i = 10; i < 100; i++) {
            copyofk -= 2;
            if (copyofk <= 0) {
                result = i;
                break;
            }
        }
        return k % 2 == 1 ? result / 10 << 0 : result % 10;
    }
    
    public static String sixth(int day) {
        switch (day) {
            case 1:
                return "Dushanba";
            case 2:
                return "Seshanba";
            case 3:
                return "Chorshanba";
            case 4:
                return "Payshanba";
            case 5:
                return "Juma";
            case 6:
                return "Shanba";
            case 7:
                return "Yakshanba";
        }
        return null;
    }

    public static String seventh(int numberOfMonth) {
        if ((numberOfMonth >= 1 && numberOfMonth <= 2) || numberOfMonth == 12) {
            return "Qish";
        }
        else if (numberOfMonth >= 3 && numberOfMonth <= 5) {
            return "Bahor";
        }
        else if (numberOfMonth >= 6 && numberOfMonth <= 8) {
            return "yoz";
        }
        else {
            return "Kuz";
        }
    }
    public static void main(String[] args) {
        // Birinchi masala
        System.out.println(first(12, 5, 8));


        // Ikkinchi masala
        System.out.println(second(0.2, 0.5, 0.07));

        // uchinchi masala
        System.out.println(third(1.2, 5, 6, "a"));

        // to'rtinchi masala
        System.out.println(fourth(2, -10, 12));

        // beshinchi masala
        System.out.println(fifth(14));

        // oltinchi masala
        System.out.println(sixth(5));

        // yettinchi masala
        System.out.println(seventh(11));
    }
}
