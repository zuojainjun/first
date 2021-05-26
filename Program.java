    public class Program {
        public static void main(String[] args)
        {
            Person p1;
            p1 = new Person();
            TravelStrategy ts1;
            ts1 = new AirplaneStrategy();
            p1.setStrategy(ts1);
            p1.toTravel();

        }

    }
