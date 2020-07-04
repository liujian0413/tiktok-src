package com.linecorp.linesdk.p801a;

import android.content.Context;
import com.linecorp.p798a.p799a.p800a.C18559b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.linecorp.linesdk.a.a */
public final class C18566a {

    /* renamed from: a */
    private final Context f50190a;

    /* renamed from: b */
    private final String f50191b;

    /* renamed from: c */
    private final C18559b f50192c;

    /* renamed from: a */
    private String m60982a(long j) {
        return this.f50192c.mo48693a(this.f50190a, String.valueOf(j));
    }

    /* renamed from: a */
    private String m60983a(String str) {
        return this.f50192c.mo48693a(this.f50190a, str);
    }

    /* renamed from: a */
    public final void mo48728a(C18586e eVar) {
        C7285c.m22838a(this.f50190a, this.f50191b, 0).edit().putString("accessToken", m60983a(eVar.f50221a)).putString("expiresIn", m60982a(eVar.f50222b)).putString("issuedClientTime", m60982a(eVar.f50223c)).putString("refreshToken", m60983a(eVar.f50224d)).apply();
    }

    public C18566a(Context context, String str) {
        this(context.getApplicationContext(), str, C18583c.m61009a());
    }

    private C18566a(Context context, String str, C18559b bVar) {
        this.f50190a = context;
        this.f50191b = "com.linecorp.linesdk.accesstoken.".concat(String.valueOf(str));
        this.f50192c = bVar;
    }
}
