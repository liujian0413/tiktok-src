package com.bytedance.opensdk.core.base.config;

import com.bytedance.opensdk.core.base.p627c.C12308a;
import com.bytedance.opensdk.core.p624b.C12302a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.config.a */
public final class C12310a {

    /* renamed from: f */
    public static boolean f32676f;

    /* renamed from: g */
    public static final C12311a f32677g = new C12311a(null);

    /* renamed from: a */
    public final String f32678a;

    /* renamed from: b */
    public final String f32679b;

    /* renamed from: c */
    public AppConfig f32680c;

    /* renamed from: d */
    public final C12308a f32681d;

    /* renamed from: e */
    public C12302a f32682e;

    /* renamed from: com.bytedance.opensdk.core.base.config.a$a */
    public static final class C12311a {
        private C12311a() {
        }

        /* renamed from: a */
        public static boolean m35749a() {
            return C12310a.f32676f;
        }

        public /* synthetic */ C12311a(C7571f fVar) {
            this();
        }
    }

    public C12310a(String str, String str2, AppConfig appConfig, C12308a aVar, C12302a aVar2) {
        C7573i.m23587b(str, "heloClientKey");
        C7573i.m23587b(str2, "hostClientKey");
        C7573i.m23587b(appConfig, "appConfig");
        C7573i.m23587b(aVar, "networkClient");
        C7573i.m23587b(aVar2, "eventTracker");
        this.f32678a = str;
        this.f32679b = str2;
        this.f32680c = appConfig;
        this.f32681d = aVar;
        this.f32682e = aVar2;
    }
}
