package com.facebook.ads.internal.api;

import android.content.Intent;
import android.os.IBinder;

public interface AdsMessengerServiceApi {
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();
}
