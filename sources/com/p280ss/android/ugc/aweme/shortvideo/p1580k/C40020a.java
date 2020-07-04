package com.p280ss.android.ugc.aweme.shortvideo.p1580k;

import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42131a;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.a */
public final class C40020a {

    /* renamed from: a */
    public static final C40020a f103922a = new C40020a();

    /* renamed from: b */
    private static boolean f103923b;

    /* renamed from: c */
    private static boolean f103924c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.a$a */
    static final class C40021a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C40021a f103925a = new C40021a();

        C40021a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m127934a());
        }

        /* renamed from: a */
        public static boolean m127934a() {
            boolean z;
            int[] j = C36964i.m118934j();
            if (j != null) {
                if (j.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    j = null;
                }
                if (j == null || j[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.a$b */
    static final class C40022b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C40022b f103926a = new C40022b();

        C40022b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m127935a());
        }

        /* renamed from: a */
        public static boolean m127935a() {
            boolean z;
            int[] k = C36964i.m118935k();
            if (k != null) {
                if (k.length >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    k = null;
                }
                if (k == null || k[0] != 720) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    private C40020a() {
    }

    /* renamed from: a */
    public final void mo99458a(String str, int i) {
        m127929a(str, i, "");
    }

    /* renamed from: b */
    public final void mo99459b() {
        f103924c = true;
        m127930c();
    }

    /* renamed from: a */
    public final void mo99457a() {
        f103923b = true;
        m127930c();
    }

    /* renamed from: c */
    private final void m127930c() {
        synchronized (this) {
            if (f103924c && f103923b) {
                boolean a = C40021a.m127934a();
                m127929a("resolution", a ? 1 : 0, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("resolution_default", C35563c.f93230L.mo93346e(Property.VideoSize)), C7579l.m23633a("resolution_category", C35563c.f93230L.mo93346e(Property.VideoSizeCategory)), C7579l.m23633a("resolution_real", C36964i.m118932h())}).toString());
                boolean a2 = C40022b.m127935a();
                m127929a("resolution", a2 ? 1 : 0, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("resolution_default", C35563c.f93230L.mo93346e(Property.VideoSize)), C7579l.m23633a("resolution_category_upload", C35563c.f93230L.mo93346e(Property.ImportVideoSizeCategory)), C7579l.m23633a("resolution_real_upload", C36964i.m118933i())}).toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m127929a(String str, int i, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "extra");
        C6893q.m21447a("aweme_android_white_list", C42131a.m134091a(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("white_list_type", str), C7579l.m23633a("white_list_value", String.valueOf(i)), C7579l.m23633a("extra", str2)})));
    }
}
