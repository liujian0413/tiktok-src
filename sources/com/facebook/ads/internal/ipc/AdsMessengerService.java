package com.facebook.ads.internal.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.ads.internal.api.AdsMessengerServiceApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class AdsMessengerService extends Service {
    private AdsMessengerServiceApi mAdsMessengerServiceApi;

    public void onDestroy() {
        this.mAdsMessengerServiceApi.onDestroy();
    }

    public void onCreate() {
        this.mAdsMessengerServiceApi = DynamicLoaderFactory.makeLoader(this).createAdsMessengerServiceApi(this);
        this.mAdsMessengerServiceApi.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return this.mAdsMessengerServiceApi.onBind(intent);
    }
}
