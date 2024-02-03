//3.Write a program to find the simple interest based on the following data: P = Rs 6000, R = 10%, T = 1.5 years.
    class SimpleInterest {
        public static void main(String[] args) {
            double P = 6000;
            double R = 0.10;
            double T = 1.5;
            double simpleInterest = (P * R * T);
            System.out.println("Principal : Rs " + P);
            System.out.println("Rate of Interest " + (R * 100) + "%");
            System.out.println("Time : " + T + " years");
            System.out.println("Simple Interest: Rs " + simpleInterest);
        }
    }
