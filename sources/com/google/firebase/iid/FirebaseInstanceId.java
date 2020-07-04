package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.util.p751a.C15316b;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;
import com.google.android.gms.tasks.C17061i;
import com.google.firebase.C18261a;
import com.google.firebase.C18272b;
import com.google.firebase.p785a.C18263b;
import com.google.firebase.p785a.C18265d;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {

    /* renamed from: b */
    private static final long f49731b = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: c */
    private static C18303aa f49732c;

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f49733d;

    /* renamed from: a */
    public final C18272b f49734a;

    /* renamed from: e */
    private final Executor f49735e;

    /* renamed from: f */
    private final C18348r f49736f;

    /* renamed from: g */
    private C18333c f49737g;

    /* renamed from: h */
    private final C18351u f49738h;

    /* renamed from: i */
    private final C18308af f49739i;

    /* renamed from: j */
    private boolean f49740j;

    /* renamed from: k */
    private final C18299a f49741k;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    class C18299a {

        /* renamed from: b */
        private final boolean f49743b = m60351c();

        /* renamed from: c */
        private final C18265d f49744c;

        /* renamed from: d */
        private C18263b<C18261a> f49745d;

        /* renamed from: e */
        private Boolean f49746e = m60350b();

        C18299a(C18265d dVar) {
            this.f49744c = dVar;
            if (this.f49746e == null && this.f49743b) {
                this.f49745d = new C18322at(this);
                dVar.mo47128a(C18261a.class, this.f49745d);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo47199a() {
            if (this.f49746e == null) {
                return this.f49743b && FirebaseInstanceId.this.f49734a.mo47143d();
            }
            return this.f49746e.booleanValue();
        }

        /* renamed from: b */
        private final Boolean m60350b() {
            Context a = FirebaseInstanceId.this.f49734a.mo47140a();
            SharedPreferences a2 = C7285c.m22838a(a, "com.google.firebase.messaging", 0);
            if (a2.contains("auto_init")) {
                return Boolean.valueOf(a2.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo a3 = C18301a.m60357a(packageManager, a.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    if (!(a3 == null || a3.metaData == null || !a3.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(a3.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m60351c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f49734a.mo47140a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static FirebaseInstanceId m60321a() {
        return getInstance(C18272b.m60250c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo47196j() {
        return true;
    }

    public static FirebaseInstanceId getInstance(C18272b bVar) {
        return (FirebaseInstanceId) bVar.mo47141a(FirebaseInstanceId.class);
    }

    FirebaseInstanceId(C18272b bVar, C18265d dVar) {
        this(bVar, new C18348r(bVar.mo47140a()), C18315am.m60392b(), C18315am.m60392b(), dVar);
    }

    private FirebaseInstanceId(C18272b bVar, C18348r rVar, Executor executor, Executor executor2, C18265d dVar) {
        if (C18348r.m60467a(bVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f49732c == null) {
                    f49732c = new C18303aa(bVar.mo47140a());
                }
            }
            this.f49734a = bVar;
            this.f49736f = rVar;
            if (this.f49737g == null) {
                C18333c cVar = (C18333c) bVar.mo47141a(C18333c.class);
                if (cVar == null || !cVar.mo47237a()) {
                    this.f49737g = new C18323au(bVar, rVar, executor);
                } else {
                    this.f49737g = cVar;
                }
            }
            this.f49737g = this.f49737g;
            this.f49735e = executor2;
            this.f49739i = new C18308af(f49732c);
            this.f49741k = new C18299a(dVar);
            this.f49738h = new C18351u(executor);
            if (this.f49741k.mo47199a()) {
                m60329m();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m60329m() {
        C18304ab e = mo47192e();
        if (!mo47196j() || e == null || e.mo47210b(this.f49736f.mo47268b()) || this.f49739i.mo47217a()) {
            m60330n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47186a(boolean z) {
        this.f49740j = z;
    }

    /* renamed from: n */
    private final synchronized void m60330n() {
        if (!this.f49740j) {
            mo47183a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47183a(long j) {
        C18305ac acVar = new C18305ac(this, this.f49736f, this.f49739i, Math.min(Math.max(30, j << 1), f49731b));
        m60323a((Runnable) acVar, j);
        this.f49740j = true;
    }

    /* renamed from: a */
    static void m60323a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f49733d == null) {
                f49733d = new ScheduledThreadPoolExecutor(1, new C15316b("FirebaseInstanceId"));
            }
            f49733d.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    public final String mo47187b() {
        m60329m();
        return m60331o();
    }

    /* renamed from: o */
    private static String m60331o() {
        return C18348r.m60468a(f49732c.mo47207b("").f49815a);
    }

    /* renamed from: c */
    public final C17057f<C18329b> mo47189c() {
        return m60319a(C18348r.m60467a(this.f49734a), "*");
    }

    /* renamed from: a */
    private final C17057f<C18329b> m60319a(String str, String str2) {
        String d = m60327d(str2);
        C17058g gVar = new C17058g();
        Executor executor = this.f49735e;
        C18319aq aqVar = new C18319aq(this, str, str2, gVar, d);
        executor.execute(aqVar);
        return gVar.f47728a;
    }

    /* renamed from: d */
    public final String mo47191d() {
        C18304ab e = mo47192e();
        if (e == null || e.mo47210b(this.f49736f.mo47268b())) {
            m60330n();
        }
        if (e != null) {
            return e.f49755a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C18304ab mo47192e() {
        return m60324b(C18348r.m60467a(this.f49734a), "*");
    }

    /* renamed from: b */
    private static C18304ab m60324b(String str, String str2) {
        return f49732c.mo47203a("", str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo47193f() throws IOException {
        return m60326c(C18348r.m60467a(this.f49734a), "*");
    }

    /* renamed from: c */
    private String m60326c(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C18329b) m60322a(m60319a(str, str2))).mo47242a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    private final <T> T m60322a(C17057f<T> fVar) throws IOException {
        try {
            return C17061i.m56599a(fVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo47194h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    public final synchronized C17057f<Void> mo47181a(String str) {
        C17057f<Void> a;
        a = this.f49739i.mo47216a(str);
        m60330n();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo47188b(String str) throws IOException {
        C18304ab e = mo47192e();
        if (e == null || e.mo47210b(this.f49736f.mo47268b())) {
            throw new IOException("token not available");
        }
        m60322a(this.f49737g.mo47234a(m60331o(), e.f49755a, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo47190c(String str) throws IOException {
        C18304ab e = mo47192e();
        if (e == null || e.mo47210b(this.f49736f.mo47268b())) {
            throw new IOException("token not available");
        }
        m60322a(this.f49737g.mo47238b(m60331o(), e.f49755a, str));
    }

    /* renamed from: g */
    static boolean m60328g() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final synchronized void mo47194h() {
        f49732c.mo47208b();
        if (this.f49741k.mo47199a()) {
            m60330n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo47195i() {
        return this.f49737g.mo47237a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo47197k() throws IOException {
        m60322a(this.f49737g.mo47233a(m60331o(), C18304ab.m60369a(mo47192e())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo47198l() {
        f49732c.mo47209c("");
        m60330n();
    }

    /* renamed from: d */
    private static String m60327d(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47184a(String str, String str2, C17058g gVar, String str3) {
        String o = m60331o();
        C18304ab b = m60324b(str, str2);
        if (b == null || b.mo47210b(this.f49736f.mo47268b())) {
            String a = C18304ab.m60369a(b);
            C18351u uVar = this.f49738h;
            C18320ar arVar = new C18320ar(this, o, a, str, str3);
            C17057f a2 = uVar.mo47272a(str, str3, arVar);
            Executor executor = this.f49735e;
            C18321as asVar = new C18321as(this, str, str3, gVar, o);
            a2.mo44288a(executor, (C17054c<TResult>) asVar);
            return;
        }
        gVar.mo44299a(new C18330ba(o, b.f49755a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47185a(String str, String str2, C17058g gVar, String str3, C17057f fVar) {
        if (fVar.mo44294b()) {
            String str4 = (String) fVar.mo44296d();
            f49732c.mo47206a("", str, str2, str4, this.f49736f.mo47268b());
            gVar.mo44299a(new C18330ba(str3, str4));
            return;
        }
        gVar.mo44298a(fVar.mo44297e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C17057f mo47182a(String str, String str2, String str3, String str4) {
        return this.f49737g.mo47235a(str, str2, str3, str4);
    }
}
