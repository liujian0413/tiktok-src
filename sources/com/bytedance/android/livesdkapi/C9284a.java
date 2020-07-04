package com.bytedance.android.livesdkapi;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;

/* renamed from: com.bytedance.android.livesdkapi.a */
public abstract class C9284a extends Binder {

    /* renamed from: com.bytedance.android.livesdkapi.a$a */
    public interface C9285a {
        /* renamed from: a */
        void mo9070a();
    }

    public abstract void bindService(Service service);

    public abstract boolean isLiveFinished();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate();

    public abstract void onDestroy();

    public void setData(Intent intent, boolean z) {
    }

    public abstract void setLiveStatusListener(C9285a aVar);

    public abstract void startAudio();

    public abstract void startBgActivity();

    public abstract boolean startStream(boolean z);

    public abstract void stopAudio();

    public abstract void stopService();

    public abstract void stopStream(int i);

    public abstract void unBindService(Service service);
}
