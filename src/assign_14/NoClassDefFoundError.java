package assign_14;

public class NoClassDefFoundError {
    static class knolls
    {
        void java()
        {
            System.out.println( "It is java section" );
        }
    }
    static class DevOps extends knolls
    {
        void showDevops()
        {
            System.out.println( "It is DevOps section" );
        }
    }
    static class NoClassDefFoundErrorExample
    {
        public static void main(String[] args)
        {
            DevOps data = new DevOps();
            data.showDevops();
            data.java();
        }
    }
}

