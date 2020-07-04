package com.p280ss.android.ugc.aweme.hybrid.monitor;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.a */
public abstract class C30364a implements C30397p {

    /* renamed from: a */
    public String f79798a;

    /* renamed from: b */
    public boolean f79799b;

    /* renamed from: c */
    public boolean f79800c;

    /* renamed from: b */
    public void mo79940b() {
        this.f79800c = false;
    }

    /* renamed from: a */
    public final String mo79938a() {
        String str = this.f79798a;
        if (str == null) {
            C7573i.m23583a("sessionId");
        }
        return str;
    }

    /* renamed from: a */
    public void mo79939a(String str, boolean z) {
        C7573i.m23587b(str, "id");
        this.f79798a = str;
        this.f79799b = z;
        this.f79800c = true;
    }
}
