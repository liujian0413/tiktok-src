package com.p280ss.android.ugc.aweme.account.p941d;

import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.d.b */
public final class C21167b {

    /* renamed from: e */
    public static final C21168a f56899e = new C21168a(null);

    /* renamed from: a */
    public C12898b f56900a;

    /* renamed from: b */
    public String f56901b;

    /* renamed from: c */
    public boolean f56902c = true;

    /* renamed from: d */
    public JSONObject f56903d;

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$a */
    public static final class C21168a {
        private C21168a() {
        }

        public /* synthetic */ C21168a(C7571f fVar) {
            this();
        }
    }

    public C21167b(String str, boolean z, JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "userData");
        this.f56901b = str;
        this.f56903d = jSONObject;
        new C18893a();
        this.f56900a = C18893a.m61663b(this.f56903d);
    }
}
