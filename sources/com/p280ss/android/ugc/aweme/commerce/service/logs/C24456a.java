package com.p280ss.android.ugc.aweme.commerce.service.logs;

import android.text.TextUtils;
import android.util.Log;
import bolts.C1592h;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.common.C6906g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a */
public abstract class C24456a {

    /* renamed from: c */
    public static final C24457a f64507c = new C24457a(null);

    /* renamed from: a */
    public final HashMap<String, String> f64508a = new HashMap<>();

    /* renamed from: b */
    public final String f64509b;

    /* renamed from: d */
    private final HashMap<String, String> f64510d = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$a */
    public static final class C24457a {
        private C24457a() {
        }

        public /* synthetic */ C24457a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$b */
    public interface C24458b {

        /* renamed from: a */
        public static final C24459a f64511a = C24459a.f64512a;

        /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$b$a */
        public static final class C24459a {

            /* renamed from: a */
            static final /* synthetic */ C24459a f64512a = new C24459a();

            /* renamed from: b */
            private static final C24458b f64513b = new C24460a();

            /* renamed from: c */
            private static final C24458b f64514c = new C24461b();

            /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$b$a$a */
            public static final class C24460a implements C24458b {
                C24460a() {
                }

                /* renamed from: a */
                public final String mo63540a(String str) {
                    C7573i.m23587b(str, "param");
                    if (TextUtils.isEmpty(str) || C7573i.m23585a((Object) TEVideoRecorder.FACE_BEAUTY_NULL, (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$b$a$b */
            public static final class C24461b implements C24458b {
                C24461b() {
                }

                /* renamed from: a */
                public final String mo63540a(String str) {
                    C7573i.m23587b(str, "param");
                    if (TextUtils.isEmpty(str) || C7573i.m23585a((Object) TEVideoRecorder.FACE_BEAUTY_NULL, (Object) str) || C7573i.m23585a((Object) "0", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            private C24459a() {
            }

            /* renamed from: a */
            public static C24458b m80385a() {
                return f64513b;
            }
        }

        /* renamed from: a */
        String mo63540a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.a$c */
    static final class C24462c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C24456a f64515a;

        C24462c(C24456a aVar) {
            this.f64515a = aVar;
        }

        public final Object call() {
            try {
                C6906g.m21515a(this.f64515a.f64509b, this.f64515a.f64508a);
                return C7581n.f20898a;
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("post event failed: ");
                sb.append(this.f64515a.f64509b);
                return Integer.valueOf(Log.w("MetricsEvent", sb.toString(), th));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo63539b();

    /* renamed from: a */
    public void mo63537a() {
        mo63539b();
        this.f64508a.putAll(this.f64510d);
        C1592h.m7853a((Callable<TResult>) new C24462c<TResult>(this));
    }

    /* renamed from: a */
    public final C24456a mo63536a(Map<String, String> map) {
        C7573i.m23587b(map, "extraParams");
        this.f64510d.putAll(map);
        return this;
    }

    public C24456a(String str) {
        C7573i.m23587b(str, "event");
        this.f64509b = str;
    }

    /* renamed from: a */
    public final void mo63538a(String str, String str2, C24458b bVar) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(bVar, "rule");
        if (str2 != null) {
            this.f64508a.put(str, bVar.mo63540a(str2));
        }
    }
}
