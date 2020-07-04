package com.p280ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.DownloadCacheSyncStatus;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.downloader.C20287l;
import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.p903a.C20176b;
import com.p280ss.android.socialbase.downloader.p903a.C20177c;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.p906d.C20204f;
import com.p280ss.android.socialbase.downloader.p906d.C20204f.C20205a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.d */
public final class C20302d implements C20285j {

    /* renamed from: a */
    public final C20314k f54859a;

    /* renamed from: b */
    public final C20177c f54860b;

    /* renamed from: c */
    private volatile boolean f54861c;

    /* renamed from: d */
    private C20205a f54862d;

    /* renamed from: e */
    private C20204f f54863e;

    /* renamed from: d */
    public final boolean mo54066d() {
        return this.f54861c;
    }

    /* renamed from: a */
    public final void mo54049a(DownloadChunk downloadChunk) {
        this.f54859a.mo54049a(downloadChunk);
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54417a(downloadChunk);
            } else {
                this.f54860b.mo54049a(downloadChunk);
            }
        } else {
            this.f54860b.mo54049a(downloadChunk);
        }
    }

    /* renamed from: a */
    public final void mo54046a(int i, int i2, long j) {
        this.f54859a.mo54046a(i, i2, j);
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54410a(i, i2, j);
            } else {
                this.f54860b.mo54046a(i, i2, j);
            }
        } else {
            this.f54860b.mo54046a(i, i2, j);
        }
    }

    /* renamed from: a */
    public final boolean mo54051a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = this.f54859a.mo54051a(downloadInfo);
        m67108b(downloadInfo);
        return a;
    }

    /* renamed from: a */
    public final void mo54047a(int i, List<DownloadChunk> list) {
        if (list != null && list.size() != 0) {
            this.f54859a.mo54047a(i, list);
            if (C20359e.m67590c()) {
                this.f54860b.mo54056b(i, list);
            }
        }
    }

    /* renamed from: g */
    private void m67109g() {
        C20269b.m66726a(DownloadCacheSyncStatus.SYNC_START);
        this.f54860b.mo54048a(this.f54859a.f54877a, this.f54859a.f54878b, (C20176b) new C20176b() {
            /* renamed from: a */
            public final void mo54037a() {
                C20302d.this.mo54514a();
                C20302d.this.mo54515c();
                C20269b.m66726a(DownloadCacheSyncStatus.SYNC_SUCCESS);
            }
        });
    }

    public C20302d() {
        this.f54862d = new C20205a() {
            /* renamed from: a */
            public final void mo54120a(Message message) {
                if (message.what == 1) {
                    C20269b.m66749h().execute(new Runnable() {
                        public final void run() {
                            try {
                                C20302d.this.mo54516f();
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f54863e = null;
        this.f54859a = new C20314k();
        this.f54860b = new C20177c();
        this.f54861c = false;
        this.f54863e = new C20204f(Looper.getMainLooper(), this.f54862d);
        m67109g();
    }

    /* renamed from: c */
    public final void mo54515c() {
        if (VERSION.SDK_INT >= 23) {
            this.f54863e.sendMessageDelayed(this.f54863e.obtainMessage(1), 1000);
            return;
        }
        this.f54863e.sendMessageDelayed(this.f54863e.obtainMessage(1), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: e */
    public final boolean mo54067e() {
        if (this.f54861c) {
            return true;
        }
        synchronized (this) {
            if (!this.f54861c) {
                C20190a.m66502b("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                try {
                    wait(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } catch (InterruptedException unused) {
                }
                C20190a.m66502b("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
            }
        }
        return this.f54861c;
    }

    /* renamed from: b */
    public final void mo54055b() {
        try {
            this.f54859a.mo54055b();
        } catch (SQLiteException unused) {
        }
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54440f();
            } else {
                this.f54860b.mo54055b();
            }
        } else {
            this.f54860b.mo54055b();
        }
    }

    /* renamed from: f */
    public final void mo54516f() {
        if (this.f54861c && C20359e.m67556a()) {
            C20287l l = C20269b.m66753l();
            if (l != null) {
                List a = l.mo54005a();
                if (!a.isEmpty()) {
                    SparseArray<DownloadInfo> sparseArray = this.f54859a.f54877a;
                    if (sparseArray != null) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (sparseArray) {
                            for (int i = 0; i < sparseArray.size(); i++) {
                                int keyAt = sparseArray.keyAt(i);
                                if (keyAt != 0) {
                                    DownloadInfo downloadInfo = (DownloadInfo) sparseArray.get(keyAt);
                                    if (!(downloadInfo == null || !a.contains(downloadInfo.getMimeType()) || downloadInfo.getRealStatus() == -2)) {
                                        arrayList.add(downloadInfo);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            l.mo54007a(arrayList);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54514a() {
        synchronized (this) {
            this.f54861c = true;
            notifyAll();
        }
    }

    /* renamed from: b */
    private void m67108b(DownloadInfo downloadInfo) {
        m67107a(downloadInfo, true);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54042a(String str) {
        return this.f54859a.mo54042a(str);
    }

    /* renamed from: c */
    public final List<DownloadChunk> mo54060c(int i) {
        return this.f54859a.mo54060c(i);
    }

    /* renamed from: a */
    public final DownloadInfo mo54038a(int i) {
        DownloadInfo a = this.f54859a.mo54038a(i);
        m67108b(a);
        return a;
    }

    /* renamed from: b */
    public final DownloadInfo mo54052b(int i) {
        return this.f54859a.mo54052b(i);
    }

    /* renamed from: g */
    public final DownloadInfo mo54070g(int i) {
        DownloadInfo g = this.f54859a.mo54070g(i);
        m67108b(g);
        return g;
    }

    /* renamed from: h */
    public final DownloadInfo mo54071h(int i) {
        DownloadInfo h = this.f54859a.mo54071h(i);
        m67108b(h);
        return h;
    }

    /* renamed from: i */
    public final DownloadInfo mo54072i(int i) {
        DownloadInfo i2 = this.f54859a.mo54072i(i);
        m67108b(i2);
        return i2;
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54061c(String str) {
        return this.f54859a.mo54061c(str);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54054b(String str) {
        return this.f54859a.mo54054b(str);
    }

    /* renamed from: d */
    public final void mo54065d(int i) {
        this.f54859a.mo54065d(i);
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54452q(i);
            } else {
                this.f54860b.mo54065d(i);
            }
        } else {
            this.f54860b.mo54065d(i);
        }
    }

    /* renamed from: f */
    public final boolean mo54069f(int i) {
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54453r(i);
            } else {
                this.f54860b.mo54069f(i);
            }
        } else {
            this.f54860b.mo54069f(i);
        }
        return this.f54859a.mo54069f(i);
    }

    /* renamed from: c */
    public final void mo54063c(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f54859a.mo54051a(downloadInfo);
        }
    }

    /* renamed from: e */
    public final boolean mo54068e(int i) {
        try {
            if (C20359e.m67577b()) {
                C20288m a = C20315l.m67199a(true);
                if (a != null) {
                    a.mo54451p(i);
                } else {
                    this.f54860b.mo54068e(i);
                }
            } else {
                this.f54860b.mo54068e(i);
            }
        } catch (SQLiteException unused) {
        }
        return this.f54859a.mo54068e(i);
    }

    /* renamed from: b */
    public final void mo54057b(DownloadChunk downloadChunk) {
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54417a(downloadChunk);
            } else {
                this.f54860b.mo54049a(downloadChunk);
            }
        } else {
            this.f54860b.mo54049a(downloadChunk);
        }
    }

    /* renamed from: c */
    public final DownloadInfo mo54059c(int i, long j) {
        DownloadInfo c = this.f54859a.mo54059c(i, j);
        mo54056b(i, null);
        return c;
    }

    /* renamed from: d */
    public final DownloadInfo mo54064d(int i, long j) {
        DownloadInfo d = this.f54859a.mo54064d(i, j);
        mo54056b(i, null);
        return d;
    }

    /* renamed from: a */
    public final DownloadInfo mo54039a(int i, int i2) {
        DownloadInfo a = this.f54859a.mo54039a(i, i2);
        m67108b(a);
        return a;
    }

    /* renamed from: b */
    public final DownloadInfo mo54053b(int i, long j) {
        DownloadInfo b = this.f54859a.mo54053b(i, j);
        mo54056b(i, null);
        return b;
    }

    /* renamed from: a */
    private void m67107a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!C20359e.m67577b()) {
                this.f54860b.mo54051a(downloadInfo);
            } else if (z) {
                C20288m a = C20315l.m67199a(true);
                if (a != null) {
                    a.mo54433c(downloadInfo);
                } else {
                    this.f54860b.mo54051a(downloadInfo);
                }
            }
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo54040a(int i, long j) {
        DownloadInfo a = this.f54859a.mo54040a(i, j);
        m67107a(a, false);
        return a;
    }

    /* renamed from: b */
    public final void mo54056b(int i, List<DownloadChunk> list) {
        try {
            mo54051a(this.f54859a.mo54052b(i));
            if (list == null) {
                list = this.f54859a.mo54060c(i);
            }
            if (C20359e.m67577b()) {
                C20288m a = C20315l.m67199a(true);
                if (a != null) {
                    a.mo54426b(i, list);
                } else {
                    this.f54860b.mo54056b(i, list);
                }
            } else {
                this.f54860b.mo54056b(i, list);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo54041a(int i, long j, String str, String str2) {
        DownloadInfo a = this.f54859a.mo54041a(i, j, str, str2);
        m67108b(a);
        return a;
    }

    /* renamed from: a */
    public final void mo54044a(int i, int i2, int i3, int i4) {
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54408a(i, i2, i3, i4);
            } else {
                this.f54860b.mo54044a(i, i2, i3, i4);
            }
        } else {
            this.f54860b.mo54044a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo54045a(int i, int i2, int i3, long j) {
        if (C20359e.m67577b()) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54409a(i, i2, i3, j);
            } else {
                this.f54860b.mo54045a(i, i2, i3, j);
            }
        } else {
            this.f54860b.mo54045a(i, i2, i3, j);
        }
    }
}
