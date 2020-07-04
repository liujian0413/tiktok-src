package com.p280ss.android.ugc.aweme.bugreport;

import android.util.Log;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.p504l.C9999s;
import com.bytedance.crash.upload.C10016a;
import com.p280ss.android.ugc.aweme.C21645ae;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.feed.experiment.C28345b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.File;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.bugreport.a */
public final class C23551a implements C21645ae {

    /* renamed from: a */
    public static final C23551a f62144a = new C23551a();

    /* renamed from: com.ss.android.ugc.aweme.bugreport.a$a */
    static final class C23552a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C23552a f62145a = new C23552a();

        C23552a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m77345a((String) obj);
        }

        /* renamed from: a */
        private static String m77345a(String str) {
            C7573i.m23587b(str, "realMsg");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            Thread currentThread = Thread.currentThread();
            C7573i.m23582a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bugreport.a$b */
    static final class C23553b<T> implements C7326g<String> {

        /* renamed from: a */
        public static final C23553b f62146a = new C23553b();

        C23553b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m77346a((String) obj);
        }

        /* renamed from: a */
        private static void m77346a(String str) {
            C23551a aVar = C23551a.f62144a;
            C7573i.m23582a((Object) str, "it");
            aVar.mo61473b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bugreport.a$c */
    static final class C23554c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C23554c f62147a = new C23554c();

        C23554c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m77347a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m77347a(Throwable th) {
            C6921a.m21559a(th);
            String message = th.getMessage();
            if (message != null) {
                C23551a.f62144a.mo61473b(message);
            }
        }
    }

    private C23551a() {
    }

    /* renamed from: c */
    private static void m77340c(String str) {
        C6921a.m21552a(6, "BugReportCrashUtil", str);
    }

    /* renamed from: a */
    public final void mo57871a(JSONObject jSONObject) {
        C6893q.m21447a("aweme_error_find_bug", jSONObject);
    }

    /* renamed from: a */
    public final void mo57870a(Throwable th) {
        f62144a.mo57869a(Log.getStackTraceString(new BugReportRuntimeIssue("不是crash 不是crash 不是crash", th)));
    }

    /* renamed from: a */
    public final void mo57869a(String str) {
        if ((!C7163a.m22363a()) && !C28345b.m93125b()) {
            StringBuilder sb = new StringBuilder("can't report:");
            sb.append(str);
            m77340c(sb.toString());
        } else if (str != null) {
            C7492s.m23301b(str).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C23552a.f62145a).mo19280a((C7326g<? super T>) C23553b.f62146a, (C7326g<? super Throwable>) C23554c.f62147a);
        }
    }

    /* renamed from: b */
    public final void mo61473b(String str) {
        try {
            if (!C9912i.m29316a()) {
                StringBuilder sb = new StringBuilder("Npth is not init, report abort:");
                sb.append(str);
                m77340c(sb.toString());
                return;
            }
            C9930f a = C9930f.m29397a();
            CrashType crashType = CrashType.JAVA;
            C9896a aVar = new C9896a(new JSONObject());
            aVar.mo24492a("data", (Object) C9999s.m29644a((Throwable) new BugReportException(str)));
            aVar.mo24492a("isOOM", (Object) Boolean.valueOf(false));
            aVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
            C10016a.m29765a().mo24637a(a.mo24554a(crashType, aVar), (File) null, (String) null, false);
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }
}
