package com.p280ss.android.socialbase.downloader.downloader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService */
public class IndependentProcessDownloadService extends DownloadService {

    /* renamed from: b */
    public static final String f54715b = "IndependentProcessDownloadService";

    /* renamed from: c */
    public static boolean f54716c;

    /* renamed from: d */
    private static int f54717d;

    /* renamed from: e */
    private static long f54718e;

    /* renamed from: f */
    private Handler f54719f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private ServiceConnection f54720g = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            IndependentProcessDownloadService.f54716c = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IndependentProcessDownloadService.f54716c = true;
            try {
                iBinder.linkToDeath(new DeathRecipient() {
                    public final void binderDied() {
                        IndependentProcessDownloadService.f54716c = false;
                        C20190a.m66502b(IndependentProcessDownloadService.f54715b, "binderDied:");
                        IndependentProcessDownloadService.this.mo54260a();
                    }
                }, 0);
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: b */
    public final void mo54261b() {
        Intent intent = new Intent(this, DownloadService.class);
        try {
            bindService(intent, this.f54720g, 1);
            startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
        this.f54710a = C20269b.m66756o();
        this.f54710a.mo54273a(new WeakReference<>(this));
        mo54260a();
    }

    /* renamed from: a */
    public final void mo54260a() {
        if (VERSION.SDK_INT >= 26 || !C20356b.m67535a(512) || f54716c) {
            return;
        }
        if (f54717d > 5) {
            C20190a.m66502b(f54715b, "bindMainProcess: bind too many times!!! ");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f54718e < C40413c.f105051b) {
            C20190a.m66502b(f54715b, "bindMainProcess: time too short since last bind!!! ");
            return;
        }
        f54717d++;
        f54718e = currentTimeMillis;
        this.f54719f.postDelayed(new Runnable() {
            public final void run() {
                IndependentProcessDownloadService.this.mo54261b();
            }
        }, 1000);
    }
}
