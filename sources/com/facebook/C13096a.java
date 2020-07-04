package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C13876aa;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
final class C13096a {

    /* renamed from: a */
    private final SharedPreferences f34714a;

    /* renamed from: b */
    private final C13097a f34715b;

    /* renamed from: c */
    private C14121n f34716c;

    /* renamed from: com.facebook.a$a */
    static class C13097a {
        C13097a() {
        }

        /* renamed from: a */
        public static C14121n m38335a() {
            return new C14121n(C13499h.m39721g());
        }
    }

    /* renamed from: e */
    private static boolean m38329e() {
        return C13499h.m39718d();
    }

    /* renamed from: c */
    private boolean m38327c() {
        return this.f34714a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    public C13096a() {
        this(C7285c.m22838a(C13499h.m39721g(), "com.facebook.AccessTokenManager.SharedPreferences", 0), new C13097a());
    }

    /* renamed from: d */
    private AccessToken m38328d() {
        String string = this.f34714a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.m38227a(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private AccessToken m38330f() {
        Bundle a = m38331g().mo33879a();
        if (a == null || !C14121n.m41697a(a)) {
            return null;
        }
        return AccessToken.m38226a(a);
    }

    /* renamed from: g */
    private C14121n m38331g() {
        if (this.f34716c == null) {
            synchronized (this) {
                if (this.f34716c == null) {
                    this.f34716c = C13097a.m38335a();
                }
            }
        }
        return this.f34716c;
    }

    /* renamed from: b */
    public final void mo31813b() {
        this.f34714a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m38329e()) {
            m38331g().mo33880b();
        }
    }

    /* renamed from: a */
    public final AccessToken mo31811a() {
        if (m38327c()) {
            return m38328d();
        }
        if (!m38329e()) {
            return null;
        }
        AccessToken f = m38330f();
        if (f == null) {
            return f;
        }
        mo31812a(f);
        m38331g().mo33880b();
        return f;
    }

    /* renamed from: a */
    public final void mo31812a(AccessToken accessToken) {
        C13876aa.m40978a((Object) accessToken, "accessToken");
        try {
            this.f34714a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo31750e().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    private C13096a(SharedPreferences sharedPreferences, C13097a aVar) {
        this.f34714a = sharedPreferences;
        this.f34715b = aVar;
    }
}
