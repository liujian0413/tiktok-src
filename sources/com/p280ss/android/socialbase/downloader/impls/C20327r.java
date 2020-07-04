package com.p280ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20287l;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;

/* renamed from: com.ss.android.socialbase.downloader.impls.r */
public class C20327r implements Callback {

    /* renamed from: c */
    private static volatile C20327r f54906c;

    /* renamed from: a */
    public final Context f54907a = C20269b.m66765x();

    /* renamed from: b */
    public final Handler f54908b = new Handler(Looper.getMainLooper(), this);

    /* renamed from: d */
    private final SparseArray<C20331a> f54909d = new SparseArray<>();

    /* renamed from: e */
    private final boolean f54910e;

    /* renamed from: com.ss.android.socialbase.downloader.impls.r$a */
    static class C20331a {

        /* renamed from: a */
        final int f54915a;

        /* renamed from: b */
        int f54916b;

        /* renamed from: c */
        boolean f54917c;

        C20331a(int i) {
            this.f54915a = i;
        }
    }

    /* renamed from: a */
    public static C20327r m67371a() {
        if (f54906c == null) {
            synchronized (C20327r.class) {
                if (f54906c == null) {
                    f54906c = new C20327r();
                }
            }
        }
        return f54906c;
    }

    /* renamed from: b */
    private void m67372b() {
        if (C20356b.m67535a(PreloadTask.BYTE_UNIT_NUMBER)) {
            C20269b.m66749h().execute(new Runnable() {
                public final void run() {
                    try {
                        if (C20327r.this.f54907a != null && VERSION.SDK_INT >= 21) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) C20327r.this.f54907a.getApplicationContext().getSystemService("connectivity");
                            if (connectivityManager != null) {
                                connectivityManager.registerNetworkCallback(new Builder().build(), new NetworkCallback() {
                                    public final void onAvailable(Network network) {
                                        C20327r.this.f54908b.removeMessages(0);
                                        C20327r.this.f54908b.sendEmptyMessageDelayed(0, 2000);
                                    }
                                });
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private C20327r() {
        m67372b();
        this.f54910e = C20359e.m67590c();
    }

    /* renamed from: c */
    private void m67374c() {
        synchronized (this.f54909d) {
            for (int i = 0; i < this.f54909d.size(); i++) {
                C20331a aVar = (C20331a) this.f54909d.valueAt(i);
                if (aVar != null && !aVar.f54917c) {
                    aVar.f54916b = 0;
                    mo54527a(aVar.f54915a);
                }
            }
        }
    }

    /* renamed from: d */
    private void m67375d(int i) {
        synchronized (this.f54909d) {
            this.f54909d.remove(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo54527a(final int i) {
        C20269b.m66749h().execute(new Runnable() {
            public final void run() {
                try {
                    C20327r.this.mo54530b(i);
                } catch (Exception unused) {
                }
            }
        });
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m67374c();
        } else {
            mo54527a(message.what);
        }
        return true;
    }

    /* renamed from: c */
    private C20331a m67373c(int i) {
        C20331a aVar = (C20331a) this.f54909d.get(i);
        if (aVar == null) {
            synchronized (this.f54909d) {
                aVar = (C20331a) this.f54909d.get(i);
                if (aVar == null) {
                    aVar = new C20331a(i);
                }
                this.f54909d.put(i, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo54528a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            mo54529a(downloadInfo, downloadInfo.isOnlyWifi());
        }
    }

    /* renamed from: b */
    public final void mo54530b(int i) {
        long j;
        StringBuilder sb = new StringBuilder("doSchedulerRetryInSubThread: downloadId = ");
        sb.append(i);
        C20190a.m66500a("RetryScheduler", sb.toString());
        Context context = this.f54907a;
        if (context != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
            if (downloadInfo == null) {
                m67375d(i);
                return;
            }
            int realStatus = downloadInfo.getRealStatus();
            if (realStatus == -3 || realStatus == -4) {
                m67375d(i);
            } else if (realStatus == -5) {
                C20287l l = C20269b.m66753l();
                if (l != null) {
                    l.mo54007a(Collections.singletonList(downloadInfo));
                }
                m67375d(i);
            } else if (realStatus == -1) {
                C20331a c = m67373c(i);
                boolean z = true;
                c.f54916b++;
                BaseException failedException = downloadInfo.getFailedException();
                boolean z2 = false;
                if (failedException != null) {
                    if (C20359e.m67591c((Throwable) failedException)) {
                        long j2 = 0;
                        try {
                            j2 = C20359e.m67586c(downloadInfo.getTempPath());
                        } catch (BaseException unused) {
                        }
                        if (failedException instanceof DownloadOutOfSpaceException) {
                            j = ((DownloadOutOfSpaceException) failedException).getRequiredSpaceBytes();
                        } else {
                            j = downloadInfo.getTotalBytes();
                        }
                        if (j2 < j) {
                            z = false;
                        }
                    } else if (!C20359e.m67595d((Throwable) failedException)) {
                        return;
                    }
                }
                if (C20359e.m67579b(context)) {
                    z2 = z;
                } else if (VERSION.SDK_INT < 21 || !C20356b.m67535a(256)) {
                    return;
                }
                if (!z2) {
                    mo54528a(downloadInfo);
                } else if (downloadInfo.getStatus() == -1) {
                    C20190a.m66500a("RetryScheduler", "doSchedulerRetry: restart ");
                    Downloader.getInstance(context).restart(downloadInfo.getId());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54529a(DownloadInfo downloadInfo, boolean z) {
        boolean z2;
        if (downloadInfo != null && downloadInfo.getRetryScheduleMinutes() > 0) {
            Context context = this.f54907a;
            if (context != null) {
                C20331a c = m67373c(downloadInfo.getId());
                c.f54917c = z;
                if (VERSION.SDK_INT >= 21 && C20356b.m67535a(256)) {
                    boolean a = C20359e.m67562a(context);
                    if (a || C20359e.m67579b(context)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        c.f54916b = 0;
                    }
                    RetryJobSchedulerService.m67069a(downloadInfo, downloadInfo.getRetryScheduleMinutes() + (c.f54916b / 2), z2, a, z);
                    if (this.f54910e) {
                        c.f54916b++;
                    }
                } else if (!z) {
                    int retryScheduleMinutes = downloadInfo.getRetryScheduleMinutes() + (c.f54916b / 2);
                    this.f54908b.removeMessages(downloadInfo.getId());
                    this.f54908b.sendEmptyMessageDelayed(downloadInfo.getId(), ((long) (retryScheduleMinutes * 60)) * 1000);
                }
            }
        }
    }
}
