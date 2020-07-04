package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.internal.C15049a;
import com.google.android.gms.common.api.internal.C15145l;

public class GoogleSignInClient extends C15034c<GoogleSignInOptions> {

    /* renamed from: i */
    private static final C14970a f38776i = new C14970a(null);

    /* renamed from: j */
    private static int f38777j = C14971b.f38778a;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    static class C14970a {
        private C14970a() {
        }

        /* synthetic */ C14970a(C14980h hVar) {
            this();
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    static final class C14971b {

        /* renamed from: a */
        public static final int f38778a = 1;

        /* renamed from: b */
        public static final int f38779b = 2;

        /* renamed from: c */
        public static final int f38780c = 3;

        /* renamed from: d */
        public static final int f38781d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f38782e = {f38778a, f38779b, f38780c, f38781d};

        /* renamed from: a */
        public static int[] m43435a() {
            return (int[]) f38782e.clone();
        }
    }

    GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C14941a.f38651e, googleSignInOptions, (C15145l) new C15049a());
    }

    GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C14941a.f38651e, googleSignInOptions, (C15145l) new C15049a());
    }
}
