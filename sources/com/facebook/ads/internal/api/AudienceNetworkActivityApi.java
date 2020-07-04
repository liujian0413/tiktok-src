package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;

public interface AudienceNetworkActivityApi {
    void finish();

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    boolean onTouchEvent(MotionEvent motionEvent);
}
