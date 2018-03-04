package com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GoodClass {
    static Logger logger = Logger.getLogger(GoodClass.class.getName());

    public static void main(String [] args){
        String str = "good string";

        int i = 100/2;

        logger.log(Level.INFO, "I am a good class: {0} ", i+", "+ str);
    }

}
