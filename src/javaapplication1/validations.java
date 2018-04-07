/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Swamy Naidu
 */
public class validations {
    
    public boolean admin_reg_validations(String admin_reg_user_name, String admin_reg_pwd){
        if (admin_reg_user_name.isEmpty()) {
            System.out.println("invalid user name");
        }
        return true; 
    }
}
