package com.kk.solution.dev.androideatmaster.Common;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

import com.kk.solution.dev.androideatmaster.Model.Request;
import com.kk.solution.dev.androideatmaster.Model.User;
import com.kk.solution.dev.androideatmaster.Remote.FCMRetrofitClient;
import com.kk.solution.dev.androideatmaster.Remote.IGeoCoordinates;
import com.kk.solution.dev.androideatmaster.Remote.RetrofitClient;
import com.kk.solution.dev.androideatmaster.Service.APIService;

import retrofit2.Retrofit;

/**
 * Created by kundan on 12/15/2017.
 */

public class Common {

    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String baseUrl = "https://maps.googleapis.com";

    private static final String BASE_URL = "https://fcm.googleapis.com/";

    public static String PHONE_TEXT = "userPhone";

    public static APIService getFCMService()    {
        return FCMRetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

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

    public static IGeoCoordinates getGeoCodeService()   {
        return RetrofitClient.getClient(baseUrl).create(IGeoCoordinates.class);
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int newWidth, int newHeight)    {

        Bitmap scaleBitmap = Bitmap.createBitmap(newWidth,newHeight,Bitmap.Config.ARGB_8888);

        float scaleX = newWidth / (float)bitmap.getWidth();
        float scaleY = newHeight / (float)bitmap.getWidth();

        float pivotX = 0, pivotY = 0;

        Matrix scaleMatrix = new Matrix();
        scaleMatrix.setScale(scaleX,scaleY,pivotX,pivotY);

        Canvas canvas = new Canvas(scaleBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bitmap,0,0,new Paint(Paint.FILTER_BITMAP_FLAG));

        return scaleBitmap;
    }
}
