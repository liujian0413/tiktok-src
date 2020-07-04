package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.internal.C15049a;
import com.google.android.gms.common.api.internal.C15084bg;
import com.google.android.gms.common.api.internal.C15093bp;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.api.internal.C15110cd;
import com.google.android.gms.common.api.internal.C15133d;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.common.api.internal.C15145l;
import com.google.android.gms.common.api.internal.C15147n;
import com.google.android.gms.common.api.internal.C15153t;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.common.api.c */
public class C15034c<O extends C15021d> {

    /* renamed from: a */
    public final Context f38883a;

    /* renamed from: b */
    public final C15017a<O> f38884b;

    /* renamed from: c */
    public final O f38885c;

    /* renamed from: d */
    public final C15110cd<O> f38886d;

    /* renamed from: e */
    public final Looper f38887e;

    /* renamed from: f */
    public final int f38888f;

    /* renamed from: g */
    public final C15037d f38889g;

    /* renamed from: h */
    protected final C15133d f38890h;

    /* renamed from: i */
    private final C15145l f38891i;

    /* renamed from: com.google.android.gms.common.api.c$a */
    public static class C15035a {

        /* renamed from: a */
        public static final C15035a f38892a = new C15036a().mo38230a();

        /* renamed from: b */
        public final C15145l f38893b;

        /* renamed from: c */
        public final Looper f38894c;

        /* renamed from: com.google.android.gms.common.api.c$a$a */
        public static class C15036a {

            /* renamed from: a */
            private C15145l f38895a;

            /* renamed from: b */
            private Looper f38896b;

            /* renamed from: a */
            public final C15036a mo38229a(C15145l lVar) {
                C15267r.m44385a(lVar, (Object) "StatusExceptionMapper must not be null.");
                this.f38895a = lVar;
                return this;
            }

            /* renamed from: a */
            public final C15036a mo38228a(Looper looper) {
                C15267r.m44385a(looper, (Object) "Looper must not be null.");
                this.f38896b = looper;
                return this;
            }

            /* renamed from: a */
            public final C15035a mo38230a() {
                if (this.f38895a == null) {
                    this.f38895a = new C15049a();
                }
                if (this.f38896b == null) {
                    this.f38896b = Looper.getMainLooper();
                }
                return new C15035a(this.f38895a, this.f38896b);
            }
        }

        private C15035a(C15145l lVar, Account account, Looper looper) {
            this.f38893b = lVar;
            this.f38894c = looper;
        }
    }

    protected C15034c(Context context, C15017a<O> aVar, Looper looper) {
        C15267r.m44385a(context, (Object) "Null context is not permitted.");
        C15267r.m44385a(aVar, (Object) "Api must not be null.");
        C15267r.m44385a(looper, (Object) "Looper must not be null.");
        this.f38883a = context.getApplicationContext();
        this.f38884b = aVar;
        this.f38885c = null;
        this.f38887e = looper;
        this.f38886d = C15110cd.m43845a(aVar);
        this.f38889g = new C15084bg(this);
        this.f38890h = C15133d.m43962a(this.f38883a);
        this.f38888f = this.f38890h.mo38404c();
        this.f38891i = new C15049a();
    }

    public C15034c(Context context, C15017a<O> aVar, O o, Looper looper, C15145l lVar) {
        this(context, aVar, o, new C15036a().mo38228a(looper).mo38229a(lVar).mo38230a());
    }

    public C15034c(Activity activity, C15017a<O> aVar, O o, C15035a aVar2) {
        C15267r.m44385a(activity, (Object) "Null activity is not permitted.");
        C15267r.m44385a(aVar, (Object) "Api must not be null.");
        C15267r.m44385a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f38883a = activity.getApplicationContext();
        this.f38884b = aVar;
        this.f38885c = o;
        this.f38887e = aVar2.f38894c;
        this.f38886d = C15110cd.m43846a(this.f38884b, this.f38885c);
        this.f38889g = new C15084bg(this);
        this.f38890h = C15133d.m43962a(this.f38883a);
        this.f38888f = this.f38890h.mo38404c();
        this.f38891i = aVar2.f38893b;
        if (!(activity instanceof GoogleApiActivity)) {
            C15153t.m44067a(activity, this.f38890h, this.f38886d);
        }
        this.f38890h.mo38397a(this);
    }

    public C15034c(Context context, C15017a<O> aVar, O o, C15035a aVar2) {
        C15267r.m44385a(context, (Object) "Null context is not permitted.");
        C15267r.m44385a(aVar, (Object) "Api must not be null.");
        C15267r.m44385a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f38883a = context.getApplicationContext();
        this.f38884b = aVar;
        this.f38885c = o;
        this.f38887e = aVar2.f38894c;
        this.f38886d = C15110cd.m43846a(this.f38884b, this.f38885c);
        this.f38889g = new C15084bg(this);
        this.f38890h = C15133d.m43962a(this.f38883a);
        this.f38888f = this.f38890h.mo38404c();
        this.f38891i = aVar2.f38893b;
        this.f38890h.mo38397a(this);
    }

    public C15034c(Activity activity, C15017a<O> aVar, O o, C15145l lVar) {
        this(activity, aVar, o, new C15036a().mo38229a(lVar).mo38228a(activity.getMainLooper()).mo38230a());
    }

    public C15034c(Context context, C15017a<O> aVar, O o, C15145l lVar) {
        this(context, aVar, o, new C15036a().mo38229a(lVar).mo38230a());
    }

    /* renamed from: a */
    private final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T m43575a(int i, T t) {
        t.mo38272f();
        this.f38890h.mo38398a(this, 1, t);
        return t;
    }

    /* renamed from: a */
    private final <TResult, A extends C15019b> C17057f<TResult> m43577a(int i, C15147n<A, TResult> nVar) {
        C17058g gVar = new C17058g();
        this.f38890h.mo38399a(this, 1, nVar, gVar, this.f38891i);
        return gVar.f47728a;
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38226a(T t) {
        return m43575a(1, t);
    }

    /* renamed from: a */
    public final <TResult, A extends C15019b> C17057f<TResult> mo38227a(C15147n<A, TResult> nVar) {
        return m43577a(1, nVar);
    }

    /* renamed from: a */
    public C15028f mo38224a(Looper looper, C15134a<O> aVar) {
        return this.f38884b.mo38207a().mo38026a(this.f38883a, looper, mo38025a().mo38588a(), this.f38885c, aVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.common.internal.C15244e.C15245a mo38025a() {
        /*
            r2 = this;
            com.google.android.gms.common.internal.e$a r0 = new com.google.android.gms.common.internal.e$a
            r0.<init>()
            O r1 = r2.f38885c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15017a.C15021d.C15023b
            if (r1 == 0) goto L_0x001a
            O r1 = r2.f38885c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C15017a.C15021d.C15023b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo38210a()
            if (r1 == 0) goto L_0x001a
            android.accounts.Account r1 = r1.mo38077a()
            goto L_0x002a
        L_0x001a:
            O r1 = r2.f38885c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15017a.C15021d.C15022a
            if (r1 == 0) goto L_0x0029
            O r1 = r2.f38885c
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C15017a.C15021d.C15022a) r1
            android.accounts.Account r1 = r1.mo38209a()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            com.google.android.gms.common.internal.e$a r0 = r0.mo38585a(r1)
            O r1 = r2.f38885c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15017a.C15021d.C15023b
            if (r1 == 0) goto L_0x0043
            O r1 = r2.f38885c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C15017a.C15021d.C15023b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo38210a()
            if (r1 == 0) goto L_0x0043
            java.util.Set r1 = r1.mo38078b()
            goto L_0x0047
        L_0x0043:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0047:
            com.google.android.gms.common.internal.e$a r0 = r0.mo38587a(r1)
            android.content.Context r1 = r2.f38883a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo38589b(r1)
            android.content.Context r1 = r2.f38883a
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo38586a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C15034c.mo38025a():com.google.android.gms.common.internal.e$a");
    }

    /* renamed from: a */
    public C15093bp mo38225a(Context context, Handler handler) {
        return new C15093bp(context, handler, mo38025a().mo38588a());
    }
}
