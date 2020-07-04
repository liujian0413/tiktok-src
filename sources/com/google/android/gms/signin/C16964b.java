package com.google.android.gms.signin;

import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15029g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C16968a;

/* renamed from: com.google.android.gms.signin.b */
public final class C16964b {

    /* renamed from: a */
    public static final C15018a<C16968a, C16962a> f47568a = new C16965c();

    /* renamed from: b */
    public static final C15017a<C16962a> f47569b = new C15017a<>("SignIn.API", f47568a, f47570c);

    /* renamed from: c */
    private static final C15029g<C16968a> f47570c = new C15029g<>();

    /* renamed from: d */
    private static final C15029g<C16968a> f47571d = new C15029g<>();

    /* renamed from: e */
    private static final C15018a<C16968a, Object> f47572e = new C16966d();

    /* renamed from: f */
    private static final Scope f47573f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f47574g = new Scope("email");

    /* renamed from: h */
    private static final C15017a<Object> f47575h = new C15017a<>("SignIn.INTERNAL_API", f47572e, f47571d);
}
