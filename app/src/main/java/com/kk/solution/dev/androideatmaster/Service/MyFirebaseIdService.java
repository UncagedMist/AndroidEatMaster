package com.kk.solution.dev.androideatmaster.Service;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.kk.solution.dev.androideatmaster.Common.Common;
import com.kk.solution.dev.androideatmaster.Model.Token;

/**
 * Created by kundan on 12/21/2017.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateToServer(refreshedToken);
    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token token = new Token(refreshedToken,true);  //true bcz : token sent from server side
        tokens.child(Common.currentUser.getPhone()).setValue(token);
    }
}