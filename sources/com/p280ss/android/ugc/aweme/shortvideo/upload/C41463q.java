package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.shortvideo.upload.C41464r.C41465a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.q */
public final class C41463q {

    /* renamed from: a */
    public static final C41463q f107848a = new C41463q();

    /* renamed from: b */
    private static C41464r f107849b;

    private C41463q() {
    }

    /* renamed from: a */
    private static float m132130a(long j) {
        return (((float) j) / 1024.0f) / 1024.0f;
    }

    /* renamed from: a */
    public static final C41465a m132131a() {
        C41464r rVar = f107849b;
        if (rVar != null) {
            return rVar.mo102131a();
        }
        return null;
    }

    /* renamed from: b */
    private final float m132135b() {
        return m132130a(C7276d.m22827h());
    }

    /* renamed from: a */
    public static final void m132132a(String str) {
        if (str != null) {
            C41464r rVar = new C41464r(str, PublishType.DirectRecord, 0.0f, 0.0f, 0.0f, 0.0f, null, null, false, 508, null);
            f107849b = rVar;
            rVar.f107852c = f107848a.m132135b();
        }
    }

    /* renamed from: b */
    public static final void m132136b(String str) {
        if (str != null) {
            C41464r rVar = new C41464r(str, PublishType.Draft, 0.0f, 0.0f, 0.0f, 0.0f, null, null, false, 508, null);
            f107849b = rVar;
            rVar.f107852c = f107848a.m132135b();
        }
    }

    /* renamed from: a */
    public static final void m132133a(String str, long j) {
        if (str != null && f107849b != null) {
            m132137b(str, "onSyntheticFinish");
            C41464r rVar = f107849b;
            if (rVar != null) {
                rVar.f107854e = f107848a.m132135b();
            }
            C41464r rVar2 = f107849b;
            if (rVar2 != null) {
                rVar2.f107855f = m132130a(j);
            }
        }
    }

    /* renamed from: b */
    private static void m132137b(String str, String str2) {
        Object obj;
        if (f107849b != null) {
            C41464r rVar = f107849b;
            String str3 = null;
            if (rVar != null) {
                obj = rVar.f107850a;
            } else {
                obj = null;
            }
            if (!C7573i.m23585a((Object) str, obj)) {
                C41464r rVar2 = f107849b;
                if (rVar2 == null) {
                    C7573i.m23580a();
                }
                String str4 = rVar2.f107857h;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str2);
                sb.append(" creationId Error, start:");
                C41464r rVar3 = f107849b;
                if (rVar3 != null) {
                    str3 = rVar3.f107850a;
                }
                sb.append(str3);
                sb.append(", now:");
                sb.append(str);
                rVar2.mo102133b(sb.toString());
                C41464r rVar4 = f107849b;
                if (rVar4 != null) {
                    rVar4.f107858i = false;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m132134a(String str, String str2) {
        C7573i.m23587b(str2, "contentType");
        if (str != null && f107849b != null) {
            m132137b(str, "onSyntheticStart");
            C41464r rVar = f107849b;
            if (rVar != null) {
                rVar.f107853d = f107848a.m132135b();
            }
            C41464r rVar2 = f107849b;
            if (rVar2 != null) {
                rVar2.mo102132a(str2);
            }
        }
    }
}
