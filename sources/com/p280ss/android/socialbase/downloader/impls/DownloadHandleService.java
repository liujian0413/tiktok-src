package com.p280ss.android.socialbase.downloader.impls;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;

/* renamed from: com.ss.android.socialbase.downloader.impls.DownloadHandleService */
public class DownloadHandleService extends Service {

    /* renamed from: a */
    private static final String f54835a = "DownloadHandleService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
    }

    /* renamed from: a */
    private void m67068a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                final int intExtra = intent.getIntExtra("extra_download_id", 0);
                if (intExtra != 0) {
                    if (action.equals("com.ss.android.downloader.action.DOWNLOAD_WAKEUP")) {
                        C20269b.m66749h().execute(new Runnable() {
                            public final void run() {
                                try {
                                    C20271c.m66769a().mo54315q(intExtra);
                                } catch (Exception unused) {
                                }
                            }
                        });
                    } else if (action.equals("com.ss.android.downloader.action.PROCESS_NOTIFY")) {
                        C20271c.m66769a().mo54316s(intExtra);
                    } else {
                        if (action.equals("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY")) {
                            C20269b.m66739b();
                        }
                    }
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m67068a(intent);
        return 2;
    }
}
