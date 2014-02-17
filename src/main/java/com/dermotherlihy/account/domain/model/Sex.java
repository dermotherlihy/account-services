package com.dermotherlihy.account.domain.model;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public enum Sex {

    MALE('M',"MALE"),FEMALE('F',"FEMALE");

    private char code;
    private String description;

    private Sex(char code, String description) {
        this.code = code;
        this.description=description;
    }

    public static Sex valueOf(char letter){
        switch(letter){

            case 'm':
            case 'M':{
                return MALE;
            }
            case 'f':
            case 'F':{
                return FEMALE;
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

    public char getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
