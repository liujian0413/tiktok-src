package com.p280ss.android.common.applog;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.ss.android.common.applog.Anticheat */
public class Anticheat implements IAnticheat {
    private static Anticheat inst;
    public IClient iClient;
    private boolean inUpdateProgress;
    private boolean isInit;
    private String mEstr;
    private Handler mHandler;
    private int mRetryDelay = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
    private int mUpdateduration;

    private Anticheat() {
    }

    private void checkInit() {
        if (!this.isInit) {
            throw new IllegalStateException("init() method should be called first.");
        }
    }

    public static Anticheat inst() {
        if (inst == null) {
            synchronized (Anticheat.class) {
                if (inst == null) {
                    inst = new Anticheat();
                }
            }
        }
        return inst;
    }

    private void updateEstrWithDelay(int i) {
        this.mHandler.postDelayed(new Runnable() {
            public void run() {
                Anticheat.this.updateEstrFromAPI();
            }
        }, (long) i);
    }

    public void init(IClient iClient2) {
        if (!this.isInit) {
            this.isInit = true;
            updateEstr(iClient2.readEstrFromSharedPreference());
            this.iClient = iClient2;
            this.mHandler = new Handler(Looper.getMainLooper());
            updateEstrWithDelay(0);
        }
    }

    public void onUpdateEstrFromApiFail(Exception exc) {
        this.mHandler.postDelayed(new Runnable() {
            public void run() {
                Anticheat.this.iClient.getEstrFromAPI();
            }
        }, (long) this.mRetryDelay);
        if (this.mRetryDelay <= 32000) {
            this.mRetryDelay *= 2;
        }
    }

    public void onUpdateEstrFromApiSuccess(EstrBean estrBean) {
        String estr = estrBean.getEstr();
        this.mUpdateduration = estrBean.getNext_heartbeat() * 1000;
        if (!TextUtils.equals(this.mEstr, estr)) {
            this.iClient.writeEstrToSharedPreference(estr);
            updateEstr(estr);
        }
        this.inUpdateProgress = false;
        this.mRetryDelay = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        updateEstrWithDelay(this.mUpdateduration);
    }

    public void updateEstr(String str) {
        checkInit();
        if (!TextUtils.isEmpty(str) && str.length() > 8) {
            try {
                UserInfo.initUser(str);
            } catch (Throwable unused) {
            }
            this.mEstr = str;
        }
    }

    public void updateEstrFromAPI() {
        if (!this.inUpdateProgress) {
            this.inUpdateProgress = true;
            this.iClient.getEstrFromAPI();
        }
    }
}
