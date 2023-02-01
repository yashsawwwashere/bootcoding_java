package com.bootcoding.Exception;

public class UserService {
    public void  test() throws Exception{
        UserHelper userhelper=new UserHelper();
        try{
            userhelper.test();
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            MyException exm=new MyException(ex.getMessage());
            throw exm;

        }finally{
            System.out.println("i finally excecuted");
        }

    }
}
