package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15231d.C15234c;
import com.google.android.gms.common.internal.C15231d.C15236e;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15256m;
import com.google.android.gms.common.internal.C15267r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C15017a<O extends C15021d> {

    /* renamed from: a */
    public final C15018a<?, O> f38878a;

    /* renamed from: b */
    public final String f38879b;

    /* renamed from: c */
    private final C15031i<?, O> f38880c = null;

    /* renamed from: d */
    private final C15029g<?> f38881d;

    /* renamed from: e */
    private final C15032j<?> f38882e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C15018a<T extends C15028f, O> extends C15027e<T, O> {
        /* renamed from: a */
        public abstract T mo38026a(Context context, Looper looper, C15244e eVar, O o, C15039b bVar, C15040c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C15019b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C15020c<C extends C15019b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C15021d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C15022a extends C15024c, C15025d {
            /* renamed from: a */
            Account mo38209a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C15023b extends C15024c {
            /* renamed from: a */
            GoogleSignInAccount mo38210a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C15024c extends C15021d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C15025d extends C15021d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C15026e extends C15024c, C15025d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C15027e<T extends C15019b, O> {
        /* renamed from: a */
        public List<Scope> mo38069a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C15028f extends C15019b {
        /* renamed from: a */
        void mo38211a(C15234c cVar);

        /* renamed from: a */
        void mo38212a(C15236e eVar);

        /* renamed from: a */
        void mo38213a(C15256m mVar, Set<Scope> set);

        /* renamed from: a */
        void mo38214a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo38132c();

        /* renamed from: d */
        Intent mo38133d();

        /* renamed from: e */
        int mo38134e();

        /* renamed from: f */
        void mo38215f();

        /* renamed from: g */
        boolean mo38216g();

        /* renamed from: h */
        boolean mo38217h();

        /* renamed from: i */
        boolean mo38218i();

        /* renamed from: j */
        String mo38219j();

        /* renamed from: k */
        Feature[] mo38220k();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C15029g<C extends C15028f> extends C15020c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C15030h<T extends IInterface> extends C15019b {
        /* renamed from: a */
        T mo38221a(IBinder iBinder);

        /* renamed from: a */
        String mo38222a();

        /* renamed from: b */
        String mo38223b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C15031i<T extends C15030h, O> extends C15027e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C15032j<C extends C15030h> extends C15020c<C> {
    }

    public <C extends C15028f> C15017a(String str, C15018a<C, O> aVar, C15029g<C> gVar) {
        C15267r.m44385a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C15267r.m44385a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f38879b = str;
        this.f38878a = aVar;
        this.f38881d = gVar;
        this.f38882e = null;
    }

    /* renamed from: a */
    public final C15018a<?, O> mo38207a() {
        C15267r.m44391a(this.f38878a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f38878a;
    }

    /* renamed from: b */
    public final C15020c<?> mo38208b() {
        if (this.f38881d != null) {
            return this.f38881d;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
