package com.kk.solution.dev.androideatmaster.Common;

import com.kk.solution.dev.androideatmaster.Model.Request;
import com.kk.solution.dev.androideatmaster.Model.User;

/**
 * Created by kundan on 12/15/2017.
 */

public class Common {

    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)  {
        if (code.equals("0"))   {
            return "Placed.";
        }
        else if (code.equals("1"))   {
            return "On The Way.";
        }
        else    {
            return "Shipped.";
        }
    }
}