package com.bytedance.opensdk.core.p629c.p630a;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.c.a.d */
public final class C12322d {
    @C6593c(mo15949a = "app_id")

    /* renamed from: a */
    public final String f32700a;
    @C6593c(mo15949a = "app_name")

    /* renamed from: b */
    public final String f32701b;
    @C6593c(mo15949a = "app_icon")

    /* renamed from: c */
    public final String f32702c;
    @C6593c(mo15949a = "code")

    /* renamed from: d */
    public final String f32703d;
    @C6593c(mo15949a = "platform_app_id")

    /* renamed from: e */
    public final String f32704e;
    @C6593c(mo15949a = "platform")

    /* renamed from: f */
    public final String f32705f;
    @C6593c(mo15949a = "sync_history")

    /* renamed from: g */
    public final boolean f32706g;

    public C12322d() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public C12322d(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C7573i.m23587b(str, "appId");
        C7573i.m23587b(str2, "appName");
        C7573i.m23587b(str3, "appIcon");
        C7573i.m23587b(str4, "code");
        C7573i.m23587b(str5, "platformAppId");
        C7573i.m23587b(str6, "platform");
        this.f32700a = str;
        this.f32701b = str2;
        this.f32702c = str3;
        this.f32703d = str4;
        this.f32704e = str5;
        this.f32705f = str6;
        this.f32706g = z;
    }

    private /* synthetic */ C12322d(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, C7571f fVar) {
        this("", "", "", "", "", "", false);
    }
}
