

public class Poo {

    public static void main(String[] args){
        Brand appleBrand = new Brand("Apple");
        // System.out.println(apple.name);

        Mobile appleMobile = new Mobile(18,"applex11", appleBrand);
           System.out.println(appleMobile.name);
        System.out.println(appleMobile.pixels);
        System.out.println(appleMobile.brand.name);


        Car car = new Car();
        car.start("car : ");


    }



  


}



    class Mobile {
        int pixels;
        String name;
        Brand brand;


        public Mobile(int pixels, String name, Brand brand) {
            this.pixels = pixels;
            this.name = name;
            this.brand = brand;
        }
    }


    class Brand {
        String name;

        public Brand(String name) {
            this.name = name;
        }
    }

    class Vehicule {
        void start(String args) {
            System.out.println(args + "sound of the vehicule");
        }

    }

    //Inheritance && polymorphism  

    class Car extends Vehicule {

        @Override
        void start(String args) {
            super.start(args);
            workEngines();

        }

        void workEngines() {
            System.out.println("engines are working now");
        }

    }
    class Bus extends Vehicule {

    }






    

