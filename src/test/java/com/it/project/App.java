package com.it.project;

import com.it.project.helpers.CommonHelper;
import com.it.project.helpers.DashBoardHelper;
import com.it.project.helpers.LoginHelper;
import com.it.project.users.User;

public class App {
    public CommonHelper common;
    public DashBoardHelper dashBoard;
    public LoginHelper login;

    public App() {
        common = new CommonHelper();
        dashBoard = new DashBoardHelper();
        login = new LoginHelper();
    }

    public boolean login(User user) {
        login.login(user);
        common.takeSnapShot();
        return dashBoard.userIsLogined(user);

    }
}
