class Sample10_9 {
    public static void main(String[] args) {
        Car[] Cars;
        Cars = new Car[3];

        for(int i=0; i<Cars.length; i++) {
            Cars[i] = new Car();
        }
            Cars[0].setCar(1234,20.5);
            Cars[1].setCar(2345,30.5);
            Cars[2].setCar(3456,40.5);

            for(int i=0; i<Cars.length; i++) {
                Cars[i].show();
            }
        }
    }