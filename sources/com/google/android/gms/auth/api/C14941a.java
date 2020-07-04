package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.C14956a;
import com.google.android.gms.auth.api.proxy.C14967a;
import com.google.android.gms.auth.api.signin.C14974b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C14987e;
import com.google.android.gms.auth.api.signin.internal.C14988f;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15021d.C15026e;
import com.google.android.gms.common.api.C15017a.C15029g;
import com.google.android.gms.internal.auth-api.C16323d;
import com.google.android.gms.internal.auth-api.C16325f;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C14941a {

    /* renamed from: a */
    public static final C15029g<C16325f> f38647a = new C15029g<>();

    /* renamed from: b */
    public static final C15029g<C14988f> f38648b = new C15029g<>();

    /* renamed from: c */
    public static final C15017a<C14953c> f38649c = C14952b.f38695a;

    /* renamed from: d */
    public static final C15017a<C14942a> f38650d = new C15017a<>("Auth.CREDENTIALS_API", f38655i, f38647a);

    /* renamed from: e */
    public static final C15017a<GoogleSignInOptions> f38651e = new C15017a<>("Auth.GOOGLE_SIGN_IN_API", f38656j, f38648b);

    /* renamed from: f */
    public static final C14967a f38652f = C14952b.f38696b;

    /* renamed from: g */
    public static final C14956a f38653g = new C16323d();

    /* renamed from: h */
    public static final C14974b f38654h = new C14987e();

    /* renamed from: i */
    private static final C15018a<C16325f, C14942a> f38655i = new C14965e();

    /* renamed from: j */
    private static final C15018a<C14988f, GoogleSignInOptions> f38656j = new C14966f();

    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C14942a implements C15026e {

        /* renamed from: a */
        private static final C14942a f38657a = new C14943a().mo38024a();

        /* renamed from: b */
        private final boolean f38658b;

        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C14943a {

            /* renamed from: a */
            protected Boolean f38659a = Boolean.valueOf(false);

            /* renamed from: a */
            public final C14942a mo38024a() {
                return new C14942a(this);
            }
        }

        public C14942a(C14943a aVar) {
            this.f38658b = aVar.f38659a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo38023a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f38658b);
            return bundle;
        }
    }
}
