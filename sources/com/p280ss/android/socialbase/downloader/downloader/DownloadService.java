package com.p280ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.DownloadService */
public class DownloadService extends Service {

    /* renamed from: b */
    private static final String f54709b = "DownloadService";

    /* renamed from: a */
    protected C20290o f54710a;

    public void onDestroy() {
        if (this.f54710a != null) {
            this.f54710a.mo54278c();
            this.f54710a = null;
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
        this.f54710a = C20269b.m66755n();
        this.f54710a.mo54273a(new WeakReference<>(this));
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        if (this.f54710a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f54710a != null) {
            return this.f54710a.mo54266a(intent);
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        this.f54710a.mo54276b();
        ExecutorService g = C20269b.m66748g();
        if (g != null) {
            g.execute(new Runnable() {
                public final void run() {
                    if (DownloadService.this.f54710a != null) {
                        DownloadService.this.f54710a.mo54270a(intent, i, i2);
                    }
                }
            });
        }
        return 3;
    }
}
