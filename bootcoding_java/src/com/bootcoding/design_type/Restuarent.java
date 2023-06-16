package com.bootcoding.design_type;

public interface Restuarent {
    void order();

}
 class vegRestuarent implements Restuarent{

     @Override
    public void order() {

         System.out.println("please order veg food");
    }
}
class NonvegRestuarent implements Restuarent{

    @Override
    public void order() {

        System.out.println("please order Nonveg food");
    }
}
class SeeFoodRestuarent implements Restuarent{

    @Override
    public void order() {

        System.out.println("please order see food");
    }
}
class RestuarentFactory{
    public Restuarent getRestuarent(String restuarentType) {
        if (restuarentType == null)

            return null;

        if (restuarentType.equalsIgnoreCase("veg")){
            return new vegRestuarent();
        }
        if (restuarentType.equalsIgnoreCase("Nonveg")){
            return new NonvegRestuarent();
        }
        if (restuarentType.equalsIgnoreCase("Seafood")){
            return new SeeFoodRestuarent();
        }
        return null;


        }

    }


 class FactoryPatternClass{
    public static void main(String[] args) {
        RestuarentFactory rf=new RestuarentFactory();
        Restuarent rs=rf.getRestuarent("veg");
        rs.order();
        Restuarent rs1=rf.getRestuarent("Nonveg");


    }
}



