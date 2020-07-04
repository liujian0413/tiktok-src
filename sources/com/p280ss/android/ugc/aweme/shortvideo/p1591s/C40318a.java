package com.p280ss.android.ugc.aweme.shortvideo.p1591s;

import android.content.Context;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.utils.C42971be;
import java.io.File;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.a */
public final class C40318a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f104706a = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23596a(C40318a.class, "tools.dmt-av-impl_musicallyI18nRelease"), "WATER_DIR", "getWATER_DIR()Ljava/lang/String;")), C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23596a(C40318a.class, "tools.dmt-av-impl_musicallyI18nRelease"), "WATER_MASK_LAYER_DIR", "getWATER_MASK_LAYER_DIR()Ljava/lang/String;"))};

    /* renamed from: b */
    private static final C7541d f104707b = C7546e.m23569a(C40319a.f104709a);

    /* renamed from: c */
    private static final C7541d f104708c = C7546e.m23569a(C40320b.f104710a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.a$a */
    static final class C40319a extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C40319a f104709a = new C40319a();

        C40319a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m128779a();
        }

        /* renamed from: a */
        private static String m128779a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C39810eq.f103468d);
            sb.append("water");
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            C38527bf.m123171a(sb2, false);
            return sb2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.a$b */
    static final class C40320b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C40320b f104710a = new C40320b();

        C40320b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m128780a();
        }

        /* renamed from: a */
        private static String m128780a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C40318a.m128776a());
            sb.append("mask");
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            C38527bf.m123171a(sb2, false);
            return sb2;
        }
    }

    /* renamed from: a */
    public static final String m128776a() {
        return (String) f104707b.getValue();
    }

    /* renamed from: b */
    private static String m128778b() {
        return (String) f104708c.getValue();
    }

    /* renamed from: a */
    public static final String m128777a(boolean z) {
        String str;
        if (z) {
            str = "av_ic_water_mark_9_16.png";
        } else {
            str = "av_ic_water_mark_16_9.png";
        }
        return C42971be.m136415a((Context) C35563c.f93238a, str, m128778b());
    }
}
