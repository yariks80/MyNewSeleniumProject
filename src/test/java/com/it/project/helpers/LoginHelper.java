package com.it.project.helpers;

import com.it.project.pages.LoginPage;
import com.it.project.users.User;

public class LoginHelper extends LoginPage {

    public void login(User user) {
        login(user.userName,user.password);

    }
}
