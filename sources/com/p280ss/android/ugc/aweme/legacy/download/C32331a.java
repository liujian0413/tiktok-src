package com.p280ss.android.ugc.aweme.legacy.download;

import android.content.Context;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.IesDownLoadConfigProvider;
import com.p280ss.android.ugc.iesdownload.p1745b.C44847b;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.legacy.download.a */
public class C32331a {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f84438a;

    /* renamed from: b */
    private static final AtomicReference<Context> f84439b = new AtomicReference<>(null);

    /* renamed from: c */
    private static final AtomicReference<C32332a<OkHttpClient>> f84440c = new AtomicReference<>(null);

    /* renamed from: d */
    private static final AtomicReference<C32332a<C44847b>> f84441d = new AtomicReference<>(null);

    /* renamed from: com.ss.android.ugc.aweme.legacy.download.a$a */
    public interface C32332a<T> {
        /* renamed from: a */
        T mo83541a();
    }

    /* renamed from: a */
    private static void m104888a() {
        if (f84438a == null) {
            synchronized (C32331a.class) {
                if (f84438a == null) {
                    f84438a = (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18994a("iesDownloadManagerHolder").mo18996a());
                }
            }
        }
    }

    /* renamed from: b */
    private static void m104892b() {
        Context context = (Context) f84439b.getAndSet(null);
        C32332a aVar = (C32332a) f84440c.getAndSet(null);
        C32332a aVar2 = (C32332a) f84441d.getAndSet(null);
        IesDownLoadConfigProvider instance = IesDownLoadConfigProvider.getInstance();
        if (context != null) {
            instance.setContext(context);
        }
        if (aVar != null) {
            instance.setOkHttpClient((OkHttpClient) aVar.mo83541a());
        }
        if (aVar2 != null) {
            instance.setDownloadClient((C44847b) aVar2.mo83541a());
        }
    }

    /* renamed from: a */
    public static void m104889a(Context context) {
        f84439b.set(context);
    }

    /* renamed from: b */
    public static void m104893b(C32332a<C44847b> aVar) {
        f84441d.set(aVar);
    }

    /* renamed from: a */
    public static void m104890a(C32332a<OkHttpClient> aVar) {
        f84440c.set(aVar);
    }

    /* renamed from: b */
    static final /* synthetic */ void m104894b(C44854e eVar, C44849d dVar) {
        m104892b();
        C44851d.m141532a().mo107292a(eVar, dVar);
    }

    /* renamed from: a */
    public static void m104891a(C44854e eVar, C44849d dVar) {
        m104888a();
        f84438a.execute(new C32333b(eVar, dVar));
    }
}
