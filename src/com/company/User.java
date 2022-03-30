package com.company;

public class User {
    public String login, password, confirmPassword;

    public static boolean checkUser(String login, String password, String confirmPassword) {
        if ((login.length() > 20 | login.contains(" ")) == true) {
            try {
                throw new WrongLoginException("Wrong login");
            } catch (WrongLoginException e) {
                return false;
            }
        } else if (password.length() > 20
                | password.contains(" ")
                | (!password.contains("1")
                & !password.contains("2")
                & !password.contains("3")
                & !password.contains("4")
                & !password.contains("5")
                & !password.contains("6")
                & !password.contains("7")
                & !password.contains("8")
                & !password.contains("9")
                & !password.contains("0"))) {
            try {
                throw new PasswordException();
            } catch (PasswordException e) {
                return false;
            }

        } else if (confirmPassword != password) {
            try {
                throw new PasswordException("Wrong password");
            } catch (PasswordException e) {
                return false;
            }

        } else {
            return true;
        }
    }
}
