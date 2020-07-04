package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C15267r;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public final class C14984b {

    /* renamed from: a */
    private static final Lock f38830a = new ReentrantLock();

    /* renamed from: b */
    private static C14984b f38831b;

    /* renamed from: c */
    private final Lock f38832c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f38833d;

    /* renamed from: a */
    public static C14984b m43475a(Context context) {
        C15267r.m44384a(context);
        f38830a.lock();
        try {
            if (f38831b == null) {
                f38831b = new C14984b(context.getApplicationContext());
            }
            return f38831b;
        } finally {
            f38830a.unlock();
        }
    }

    private C14984b(Context context) {
        this.f38833d = C7285c.m22838a(context, "com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final void mo38119a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C15267r.m44384a(googleSignInAccount);
        C15267r.m44384a(googleSignInOptions);
        m43476a("defaultGoogleSignInAccount", googleSignInAccount.f38769g);
        C15267r.m44384a(googleSignInAccount);
        C15267r.m44384a(googleSignInOptions);
        String str = googleSignInAccount.f38769g;
        m43476a(m43478b("googleSignInAccount", str), googleSignInAccount.mo38079c());
        m43476a(m43478b("googleSignInOptions", str), googleSignInOptions.mo38084b());
    }

    /* renamed from: a */
    private final void m43476a(String str, String str2) {
        this.f38832c.lock();
        try {
            this.f38833d.edit().putString(str, str2).apply();
        } finally {
            this.f38832c.unlock();
        }
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo38118a() {
        return m43474a(m43479c("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    private final GoogleSignInAccount m43474a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m43479c(m43478b("googleSignInAccount", str));
        if (c == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m43429a(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final GoogleSignInOptions mo38120b() {
        return m43477b(m43479c("defaultGoogleSignInAccount"));
    }

    /* renamed from: b */
    private final GoogleSignInOptions m43477b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m43479c(m43478b("googleSignInOptions", str));
        if (c == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m43436a(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String mo38121c() {
        return m43479c("refreshToken");
    }

    /* renamed from: c */
    private final String m43479c(String str) {
        this.f38832c.lock();
        try {
            return this.f38833d.getString(str, null);
        } finally {
            this.f38832c.unlock();
        }
    }

    /* renamed from: d */
    public final void mo38122d() {
        String c = m43479c("defaultGoogleSignInAccount");
        m43480d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m43480d(m43478b("googleSignInAccount", c));
            m43480d(m43478b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m43480d(String str) {
        this.f38832c.lock();
        try {
            this.f38833d.edit().remove(str).apply();
        } finally {
            this.f38832c.unlock();
        }
    }

    /* renamed from: e */
    public final void mo38123e() {
        this.f38832c.lock();
        try {
            this.f38833d.edit().clear().apply();
        } finally {
            this.f38832c.unlock();
        }
    }

    /* renamed from: b */
    private static String m43478b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
