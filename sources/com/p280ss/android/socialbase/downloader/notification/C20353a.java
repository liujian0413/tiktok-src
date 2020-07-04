package com.p280ss.android.socialbase.downloader.notification;

import android.app.Notification;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.notification.a */
public abstract class C20353a {

    /* renamed from: a */
    public int f55018a;

    /* renamed from: b */
    public long f55019b;

    /* renamed from: c */
    public long f55020c;

    /* renamed from: d */
    public String f55021d;

    /* renamed from: e */
    public int f55022e;

    /* renamed from: f */
    private long f55023f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54003a(BaseException baseException, boolean z);

    /* renamed from: a */
    public final long mo54914a() {
        if (this.f55023f == 0) {
            this.f55023f = System.currentTimeMillis();
        }
        return this.f55023f;
    }

    /* renamed from: a */
    public final void mo54917a(Notification notification) {
        if (this.f55018a != 0 && notification != null) {
            C20354b.m67519a();
            C20354b.m67520a(this.f55018a, this.f55022e, notification);
        }
    }

    /* renamed from: a */
    public void mo54004a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f55018a = downloadInfo.getId();
            this.f55021d = downloadInfo.getTitle();
        }
    }

    public C20353a(int i, String str) {
        this.f55018a = i;
        this.f55021d = str;
    }

    /* renamed from: a */
    public final void mo54916a(long j, long j2) {
        this.f55019b = j;
        this.f55020c = j2;
        this.f55022e = 4;
        mo54003a((BaseException) null, false);
    }

    /* renamed from: a */
    public final void mo54915a(int i, BaseException baseException, boolean z) {
        if (this.f55022e != i) {
            this.f55022e = i;
            mo54003a(baseException, z);
        }
    }
}
