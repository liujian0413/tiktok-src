package com.p280ss.android.ugc.aweme.share;

import com.bytedance.ies.NullValueException;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.a */
public final class C37954a {

    /* renamed from: a */
    public static int f98831a;

    /* renamed from: b */
    public static final C37955a f98832b = new C37955a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.a$a */
    public static final class C37955a {
        private C37955a() {
        }

        /* renamed from: b */
        private static boolean m121246b() {
            if (C37954a.f98831a != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo95565a() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                bool = a.getSilentShareConfigurable();
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(true);
            }
            C7573i.m23582a((Object) bool, "abValue");
            if (!bool.booleanValue() || m121246b()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C37955a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo95564a(C6711m mVar) {
            C7573i.m23587b(mVar, "json");
            C6711m e = mVar.mo16152e("data");
            if (e != null) {
                C37954a.f98831a = m121245a(e, "tt_publish_enhancement", 0);
            }
        }

        /* renamed from: a */
        private static int m121245a(C6711m mVar, String str, int i) {
            try {
                C6712o c = mVar.mo16150c(str);
                if (c == null) {
                    return 0;
                }
                if (!c.mo16156a()) {
                    return c.mo16003g();
                }
                if (c.mo16004h()) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static final void m121243a(C6711m mVar) {
        f98832b.mo95564a(mVar);
    }

    /* renamed from: a */
    public static final boolean m121244a() {
        return f98832b.mo95565a();
    }
}
