package com.p280ss.android.ugc.aweme.i18n.language.p1303a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.i18n.p1300b.C30436a;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.login.LoginType;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.d */
public final class C30467d implements C7120e {

    /* renamed from: a */
    public String f80046a;

    /* renamed from: b */
    private String f80047b;

    /* renamed from: c */
    private String f80048c;

    /* renamed from: d */
    private Locale f80049d;

    /* renamed from: e */
    private String[] f80050e;

    /* renamed from: f */
    private LoginType[] f80051f;

    /* renamed from: g */
    private String f80052g;

    /* renamed from: h */
    private String f80053h;

    /* renamed from: a */
    public final String mo18530a() {
        return this.f80048c;
    }

    /* renamed from: b */
    public final String mo18531b() {
        return this.f80047b;
    }

    /* renamed from: f */
    public final String mo18535f() {
        return this.f80052g;
    }

    /* renamed from: g */
    public final String mo18536g() {
        return this.f80053h;
    }

    /* renamed from: d */
    public final String[] mo18533d() {
        if (this.f80050e == null) {
            this.f80050e = C30436a.m99419a();
        }
        return this.f80050e;
    }

    /* renamed from: c */
    public final Locale mo18532c() {
        if (this.f80049d == null) {
            this.f80049d = new Locale(this.f80047b, this.f80046a);
        }
        return this.f80049d;
    }

    /* renamed from: e */
    public final LoginType[] mo18534e() {
        if (this.f80051f == null) {
            this.f80051f = C30436a.m99420b();
            if (TextUtils.equals("ru", this.f80047b)) {
                this.f80051f = C30436a.m99421c();
            }
        }
        return this.f80051f;
    }

    public C30467d(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C30467d(String str, String str2, String str3, String str4, String str5) {
        this.f80048c = str;
        this.f80047b = str2;
        this.f80046a = str3;
        this.f80052g = str4;
        this.f80053h = str5;
    }
}
