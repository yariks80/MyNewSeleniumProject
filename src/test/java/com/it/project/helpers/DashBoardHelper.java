package com.it.project.helpers;

import com.it.project.pages.DashBoardPage;
import com.it.project.users.User;

public class DashBoardHelper  extends DashBoardPage {
     public  boolean userIsLogined(User user) {
       return   getLbEmail().equals(user.email);
     }

}
