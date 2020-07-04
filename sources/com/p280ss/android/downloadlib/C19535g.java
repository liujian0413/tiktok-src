package com.p280ss.android.downloadlib;

import android.content.Context;
import com.p280ss.android.download.api.C19371a;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.p867b.C19498a;
import com.p280ss.android.downloadlib.p867b.C19500c;
import com.p280ss.android.downloadlib.p867b.C19502d;
import com.p280ss.android.p848c.p849a.C19225a;
import com.p280ss.android.p848c.p849a.C19235b;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;

/* renamed from: com.ss.android.downloadlib.g */
public class C19535g {

    /* renamed from: d */
    private static volatile C19535g f52841d;

    /* renamed from: a */
    public C19371a f52842a = new C19526d();

    /* renamed from: b */
    public C19528e f52843b = C19529f.m64362a();

    /* renamed from: c */
    public long f52844c = System.currentTimeMillis();

    /* renamed from: e */
    private C19225a f52845e;

    /* renamed from: f */
    private C19235b f52846f;

    /* renamed from: a */
    public static C19535g m64381a(Context context) {
        return C19536h.m64394a(context);
    }

    /* renamed from: a */
    public final C19225a mo51664a() {
        if (this.f52845e == null) {
            this.f52845e = C19444a.m63957a();
        }
        return this.f52845e;
    }

    /* renamed from: b */
    public final C19235b mo51671b() {
        if (this.f52846f == null) {
            this.f52846f = AdWebViewDownloadManagerImpl.m63933a();
        }
        return this.f52846f;
    }

    /* renamed from: b */
    public final void mo51672b(C19385a aVar) {
        this.f52843b.mo51651b(aVar);
    }

    private C19535g(Context context) {
        m64383c(context);
    }

    /* renamed from: b */
    public static C19535g m64382b(Context context) {
        if (f52841d == null) {
            synchronized (C19535g.class) {
                if (f52841d == null) {
                    f52841d = new C19535g(context);
                }
            }
        }
        return f52841d;
    }

    /* renamed from: c */
    private static void m64383c(Context context) {
        C19491j.m64207a(context);
        Downloader.getInstance(C19491j.m64206a());
        AppDownloader.getInstance().init(C19491j.m64206a(), "misc_config", new C19502d(), new C19500c(context), new C19497b());
        AppDownloader.getInstance().appDownloadLaunchResumeListener = new C19498a();
    }

    /* renamed from: b */
    public final boolean mo51673b(String str) {
        return this.f52843b.mo51652b(str);
    }

    /* renamed from: a */
    public final void mo51667a(C19385a aVar) {
        this.f52843b.mo51647a(aVar);
    }

    /* renamed from: a */
    public final void mo51668a(String str) {
        this.f52843b.mo51648a(str);
    }

    /* renamed from: a */
    public final void mo51669a(String str, int i) {
        this.f52843b.mo51649a(str, i);
    }

    /* renamed from: a */
    public final void mo51665a(int i, C19388d dVar, C19387c cVar) {
        this.f52843b.mo51646a(null, i, dVar, cVar);
    }

    /* renamed from: a */
    public final void mo51666a(Context context, int i, C19388d dVar, C19387c cVar) {
        this.f52843b.mo51646a(context, i, dVar, cVar);
    }

    /* renamed from: a */
    public final void mo51670a(String str, long j, int i, C19386b bVar, C19384a aVar) {
        this.f52843b.mo51650a(str, j, 2, bVar, aVar);
    }
}
