package com.bytedance.ies.ugc.statisticlogger;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import com.p280ss.android.statistic.C20413c;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.c */
public final class C10985c {

    /* renamed from: a */
    public static final C10985c f29712a = new C10985c();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C7489f<C10984b> f29713b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile String f29714c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile long f29715d;

    /* renamed from: e */
    private static final C10986a f29716e = new C10986a();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.c$a */
    public static final class C10986a implements ILogSessionHook {
        C10986a() {
        }

        public final void onLogSessionStart(long j) {
            C7489f a = C10985c.f29713b;
            C10984b bVar = new C10984b(SessionChangeType.Start, j, null, null, 12, null);
            a.onNext(bVar);
            C10985c.f29715d = j;
        }

        public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
            C10985c.f29714c = str;
            C7489f a = C10985c.f29713b;
            C10984b bVar = new C10984b(SessionChangeType.LogSessionBatch, j, str, jSONObject);
            a.onNext(bVar);
        }

        public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
            C7489f a = C10985c.f29713b;
            C10984b bVar = new C10984b(SessionChangeType.End, j, str, jSONObject);
            a.onNext(bVar);
        }
    }

    private C10985c() {
    }

    /* renamed from: c */
    public static String m32187c() {
        return f29714c;
    }

    /* renamed from: a */
    public static void m32181a() {
        AppLog.addSessionHook(f29716e);
    }

    /* renamed from: b */
    public static C7492s<C10984b> m32185b() {
        C7492s<C10984b> i = f29713b.mo19330i();
        C7573i.m23582a((Object) i, "sessionChangeSubject.share()");
        return i;
    }

    static {
        C7489f<C10984b> n = C7486b.m23223a().mo19260n();
        C7573i.m23582a((Object) n, "PublishSubject.create<Se…geEvent>().toSerialized()");
        f29713b = n;
    }

    /* renamed from: a */
    public static void m32182a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C20413c.m67737a().mo54956a((Context) activity);
    }

    /* renamed from: b */
    public static void m32186b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C20413c.m67737a().mo54962b(activity);
    }
}
