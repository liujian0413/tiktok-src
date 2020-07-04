package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.tasks.C17052a;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;
import com.google.android.gms.tasks.C17061i;
import com.google.firebase.C18272b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.au */
final class C18323au implements C18333c {

    /* renamed from: a */
    private final C18272b f49804a;

    /* renamed from: b */
    private final C18348r f49805b;

    /* renamed from: c */
    private final C18354x f49806c;

    /* renamed from: d */
    private final Executor f49807d;

    C18323au(C18272b bVar, C18348r rVar, Executor executor) {
        this(bVar, rVar, executor, new C18354x(bVar.mo47140a(), rVar));
    }

    private C18323au(C18272b bVar, C18348r rVar, Executor executor, C18354x xVar) {
        this.f49804a = bVar;
        this.f49805b = rVar;
        this.f49806c = xVar;
        this.f49807d = executor;
    }

    /* renamed from: a */
    public final boolean mo47237a() {
        return this.f49805b.mo47267a() != 0;
    }

    /* renamed from: a */
    public final C17057f<Void> mo47233a(String str, String str2) {
        return C17061i.m56597a(null);
    }

    /* renamed from: a */
    public final C17057f<String> mo47235a(String str, String str2, String str3, String str4) {
        return m60401b(m60398a(str, str3, str4, new Bundle()));
    }

    /* renamed from: a */
    public final C17057f<Void> mo47234a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m60397a(m60401b(m60398a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: b */
    public final C17057f<Void> mo47238b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m60397a(m60401b(m60398a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: a */
    private final C17057f<Bundle> m60398a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f49804a.mo47142b().f49725b);
        bundle.putString("gmsv", Integer.toString(this.f49805b.mo47270d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f49805b.mo47268b());
        bundle.putString("app_ver_name", this.f49805b.mo47269c());
        bundle.putString("cliv", "fiid-12451000");
        C17058g gVar = new C17058g();
        this.f49807d.execute(new C18324av(this, bundle, gVar));
        return gVar.f47728a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m60399a(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    private final <T> C17057f<Void> m60397a(C17057f<T> fVar) {
        return fVar.mo44286a(C18315am.m60391a(), (C17052a<TResult, TContinuationResult>) new C18325aw<TResult,TContinuationResult>(this));
    }

    /* renamed from: b */
    private final C17057f<String> m60401b(C17057f<Bundle> fVar) {
        return fVar.mo44286a(this.f49807d, (C17052a<TResult, TContinuationResult>) new C18326ax<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47236a(Bundle bundle, C17058g gVar) {
        try {
            gVar.mo44299a(this.f49806c.mo47273a(bundle));
        } catch (IOException e) {
            gVar.mo44298a((Exception) e);
        }
    }
}
