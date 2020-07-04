package com.p280ss.android.ugc.aweme.sec.p1509a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.sec.p1511c.C37408a;
import com.p280ss.android.ugc.aweme.sec.p1511c.C37409b;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.sys.p1806ck.SCCheckUtils;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.sec.a.c */
public final class C37400c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f97684a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37400c.class), "ssChecker", "getSsChecker()Lcom/ss/sys/ck/SCCheckUtils;"))};

    /* renamed from: d */
    public static final C37401a f97685d = new C37401a(null);

    /* renamed from: b */
    public final Context f97686b;

    /* renamed from: c */
    public final C37398a f97687c;

    /* renamed from: e */
    private final SoftReference<Context> f97688e = new SoftReference<>(this.f97686b);

    /* renamed from: f */
    private final C7541d f97689f = C7546e.m23569a(new C37403c(this));

    /* renamed from: com.ss.android.ugc.aweme.sec.a.c$a */
    public static final class C37401a {
        private C37401a() {
        }

        public /* synthetic */ C37401a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.a.c$b */
    static final class C37402b<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C37400c f97690a;

        /* renamed from: b */
        final /* synthetic */ int f97691b;

        /* renamed from: c */
        final /* synthetic */ Activity f97692c;

        /* renamed from: d */
        final /* synthetic */ C37399b f97693d;

        C37402b(C37400c cVar, int i, Activity activity, C37399b bVar) {
            this.f97690a = cVar;
            this.f97691b = i;
            this.f97692c = activity;
            this.f97693d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f97690a.f97687c.f97680h = this.f97691b;
            this.f97690a.mo94168a().popupCheckCode(this.f97692c, this.f97690a.f97687c.f97679g, this.f97690a.f97687c.f97680h, this.f97693d);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.a.c$c */
    static final class C37403c extends Lambda implements C7561a<SCCheckUtils> {

        /* renamed from: a */
        final /* synthetic */ C37400c f97694a;

        C37403c(C37400c cVar) {
            this.f97694a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SCCheckUtils invoke() {
            return this.f97694a.mo94171b();
        }
    }

    /* renamed from: a */
    public static boolean m120018a(int i) {
        return i == 3058 || i == 3059 || i == 1104 || i == 1105;
    }

    /* renamed from: a */
    public final SCCheckUtils mo94168a() {
        return (SCCheckUtils) this.f97689f.getValue();
    }

    /* renamed from: b */
    public final SCCheckUtils mo94171b() {
        C37398a aVar = this.f97687c;
        long currentTimeMillis = System.currentTimeMillis();
        SCCheckUtils instance = SCCheckUtils.getInstance((Context) this.f97688e.get(), aVar.f97673a, aVar.f97674b, aVar.f97675c, aVar.f97676d, aVar.f97677e, aVar.f97678f);
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("initSCCheckUtil getInstance = ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        C37409b.m120035a("SecCaptcha", sb.toString());
        C7573i.m23582a((Object) instance, "checker");
        return instance;
    }

    /* renamed from: a */
    public static boolean m120019a(String str) {
        C7573i.m23587b(str, "url");
        return C37408a.m120034a(str);
    }

    public C37400c(Context context, C37398a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "params");
        this.f97686b = context;
        this.f97687c = aVar;
    }

    /* renamed from: a */
    public final void mo94170a(String str, String str2) {
        C7573i.m23587b(str, "deviceId");
        C7573i.m23587b(str2, "iid");
        this.f97687c.mo94160b(str);
        this.f97687c.mo94159a(str2);
        mo94168a().updateHttpParams(this.f97687c.f97673a, this.f97687c.f97674b, this.f97687c.f97675c, this.f97687c.f97676d, this.f97687c.f97677e, this.f97687c.f97678f);
    }

    /* renamed from: a */
    public final void mo94169a(int i, Activity activity, C37420a aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aVar, "listener");
        C37399b a = new C37399b(activity, aVar).mo94164a(mo94168a());
        if (TextUtils.isEmpty(this.f97687c.f97676d) && AppLog.getInstallId() != null) {
            C37398a aVar2 = this.f97687c;
            String installId = AppLog.getInstallId();
            C7573i.m23582a((Object) installId, "AppLog.getInstallId()");
            aVar2.mo94159a(installId);
            mo94170a(this.f97687c.f97677e, this.f97687c.f97676d);
        }
        C1592h.m7855a((Callable<TResult>) new C37402b<TResult>(this, i, activity, a), C1592h.f5958b);
    }
}
