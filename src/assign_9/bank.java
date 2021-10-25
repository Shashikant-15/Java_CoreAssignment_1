package assign_9;


public class bank {

    }

    class SBI extends bank {
        int getRateOfInterest() {
            return 8;
            }
        }


    class ICICI extends bank {
        int getRateOfInterest() {
            return 7;
        }
    }

    class AXIS extends bank {
        int getRateOfInterest() {
            return 9;
        }
    }

    class BOI extends bank {
        int getRateOfInterest() {
            return 10;
        }
    }

    class getDetails {
        public static void main(String[] args) {
            SBI s = new SBI();
            ICICI i = new ICICI();
            AXIS a = new AXIS();
            BOI b = new BOI();
            System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
            System.out.println("ICICI Rate of Interest:" + i.getRateOfInterest());
            System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
            System.out.println("BOI Rate of Interest: " + b.getRateOfInterest());
        }
    }



