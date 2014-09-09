/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.util;

/**
 *
 * @author CodeTribe1
 */
public class DataException extends Exception {
    
    public static final int DUPLICATE = 1;
    public static final int ILLEGAL_STATE = 2;
    public static final int UNKNOWN_ERROR = 3;
    int code;

    public DataException(int code) {
        this.code = code;
    }
    
}
