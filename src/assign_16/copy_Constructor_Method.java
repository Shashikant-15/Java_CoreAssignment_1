package assign_16;


public class copy_Constructor_Method {


    public static class Capital {
        String capitalName;
        long population;

        public Capital(String name, long population) {
            super();
            this.capitalName = name;
            this.population = population;
        }

        public String getCapitalName() {
            return capitalName;
        }

        public void setCapitalName(String name) {
            this.capitalName = name;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }
    }

    public static class Country {

        String name;
        long population;
        Capital capital;

        public Country(String name, long population, Capital capital) {
            super();
            this.name = name;
            this.population = population;
            this.capital = capital;
        }


        // Copy constructor
        public Country(Country c) {
            super();
            this.name = c.name;
            this.population = c.population;
            this.capital = c.capital;            // Shallow copy
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }

        public Capital getCapital() {
            return capital;
        }

        public void setCapital(Capital capital) {
            this.capital = capital;
        }
    }

    public static class CopyConstructorMain {

        public static void main(String[] args) {

            // Create capital object
            Capital capital = new Capital("Bangkok", 200000);
            // or  capital.setCapitalName(capital.capitalName);


            /************************************************************************************
             * we also use following setter fun... for setting input as capital population
             *************************************************************************************/

//            capital.setPopulation(capital.population);
//            System.out.println("population :" + capital.population);


            // Create country object
            Country countryIndia = new Country("Thailand", 1500000, capital);

            // Use copy constructor to create duplicate object
            Country countryIndiaCopied = new Country(countryIndia);

            System.out.println("Country name of Copied object: " + countryIndiaCopied.getName());
            System.out.println("Country population of Copied object: " + countryIndiaCopied.getPopulation());
            System.out.println("Capital name of Copied object: " + countryIndiaCopied.getCapital().getCapitalName());
            System.out.println("Capital population of Copied object: " + countryIndiaCopied.getCapital().getPopulation());

            System.out.println("============================================");


            // Changing capital name of original object
            countryIndia.getCapital().setCapitalName("thai men");
            System.out.println("Capital name of Original object: " + countryIndia.getCapital().getCapitalName());
            System.out.println("Capital name of Copied object: " + countryIndiaCopied.getCapital().getCapitalName());
        }
    }
}
