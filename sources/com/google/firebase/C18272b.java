package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.internal.C15076b;
import com.google.android.gms.common.api.internal.C15076b.C15077a;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15335r;
import com.google.firebase.components.C18279a;
import com.google.firebase.components.C18279a.C182801;
import com.google.firebase.components.C18290j;
import com.google.firebase.internal.C18358a;
import com.google.firebase.p785a.C18264c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.b */
public class C18272b {

    /* renamed from: a */
    static final Map<String, C18272b> f49661a = new ArrayMap();

    /* renamed from: b */
    private static final List<String> f49662b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: c */
    private static final List<String> f49663c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: d */
    private static final List<String> f49664d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: e */
    private static final List<String> f49665e = Arrays.asList(new String[0]);

    /* renamed from: f */
    private static final Set<String> f49666f = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f49667g = new Object();

    /* renamed from: h */
    private static final Executor f49668h = new C18275c(0);

    /* renamed from: i */
    private final Context f49669i;

    /* renamed from: j */
    private final String f49670j;

    /* renamed from: k */
    private final C18298d f49671k;

    /* renamed from: l */
    private final C18290j f49672l;

    /* renamed from: m */
    private final SharedPreferences f49673m;

    /* renamed from: n */
    private final C18264c f49674n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f49675o = new AtomicBoolean(false);

    /* renamed from: p */
    private final AtomicBoolean f49676p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f49677q;

    /* renamed from: r */
    private final List<Object> f49678r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final List<Object> f49679s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final List<Object> f49680t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private C18273a f49681u;

    /* renamed from: com.google.firebase.b$a */
    public interface C18273a {
    }

    /* renamed from: com.google.firebase.b$b */
    static class C18274b implements C15077a {

        /* renamed from: a */
        private static AtomicReference<C18274b> f49682a = new AtomicReference<>();

        private C18274b() {
        }

        /* renamed from: a */
        static /* synthetic */ void m60261a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (f49682a.get() == null) {
                    C18274b bVar = new C18274b();
                    if (f49682a.compareAndSet(null, bVar)) {
                        C15076b.m43754a(application);
                        C15076b.m43753a().mo38328a((C15077a) bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo38327a(boolean z) {
            synchronized (C18272b.f49667g) {
                Iterator it = new ArrayList(C18272b.f49661a.values()).iterator();
                while (it.hasNext()) {
                    C18272b bVar = (C18272b) it.next();
                    if (bVar.f49675o.get()) {
                        bVar.m60248a(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$c */
    static class C18275c implements Executor {

        /* renamed from: a */
        private static final Handler f49683a = new Handler(Looper.getMainLooper());

        private C18275c() {
        }

        /* synthetic */ C18275c(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f49683a.post(runnable);
        }
    }

    /* renamed from: com.google.firebase.b$d */
    static class C18276d extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C18276d> f49684a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f49685b;

        private C18276d(Context context) {
            this.f49685b = context;
        }

        /* renamed from: a */
        static /* synthetic */ void m60263a(Context context) {
            if (f49684a.get() == null) {
                C18276d dVar = new C18276d(context);
                if (f49684a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C18272b.f49667g) {
                for (C18272b a : C18272b.f49661a.values()) {
                    a.m60255j();
                }
            }
            this.f49685b.unregisterReceiver(this);
        }
    }

    /* renamed from: g */
    private String m60252g() {
        m60254i();
        return this.f49670j;
    }

    /* renamed from: b */
    public final C18298d mo47142b() {
        m60254i();
        return this.f49671k;
    }

    public int hashCode() {
        return this.f49670j.hashCode();
    }

    /* renamed from: i */
    private void m60254i() {
        C15267r.m44391a(!this.f49676p.get(), (Object) "FirebaseApp was deleted");
    }

    /* renamed from: d */
    public final boolean mo47143d() {
        m60254i();
        return this.f49677q.get();
    }

    /* renamed from: e */
    public final boolean mo47144e() {
        return "[DEFAULT]".equals(m60252g());
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("name", this.f49670j).mo38611a("options", this.f49671k).toString();
    }

    /* renamed from: c */
    public static C18272b m60250c() {
        C18272b bVar;
        synchronized (f49667g) {
            bVar = (C18272b) f49661a.get("[DEFAULT]");
            if (bVar == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(C15335r.m44607a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m60255j() {
        boolean d = C0683b.m2914d(this.f49669i);
        if (d) {
            C18276d.m60263a(this.f49669i);
        } else {
            this.f49672l.mo47170a(mo47144e());
        }
        m60247a(C18272b.class, this, f49662b, d);
        if (mo47144e()) {
            m60247a(C18272b.class, this, f49663c, d);
            m60247a(Context.class, this.f49669i, f49664d, d);
        }
    }

    /* renamed from: h */
    private boolean m60253h() {
        if (this.f49673m.contains("firebase_data_collection_default_enabled")) {
            return this.f49673m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f49669i.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo a = C18278c.m60265a(packageManager, this.f49669i.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (!(a == null || a.metaData == null || !a.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return a.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public final Context mo47140a() {
        m60254i();
        return this.f49669i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m60248a(boolean z) {
        Iterator it = this.f49679s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18272b)) {
            return false;
        }
        return this.f49670j.equals(((C18272b) obj).m60252g());
    }

    /* renamed from: a */
    public static C18272b m60242a(Context context) {
        synchronized (f49667g) {
            if (f49661a.containsKey("[DEFAULT]")) {
                C18272b c = m60250c();
                return c;
            }
            C18298d a = C18298d.m60318a(context);
            if (a == null) {
                return null;
            }
            C18272b a2 = m60243a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public final <T> T mo47141a(Class<T> cls) {
        m60254i();
        return this.f49672l.mo47162a((Class) cls);
    }

    /* renamed from: a */
    private static C18272b m60243a(Context context, C18298d dVar) {
        return m60244a(context, dVar, "[DEFAULT]");
    }

    /* renamed from: a */
    private static C18272b m60244a(Context context, C18298d dVar, String str) {
        C18272b bVar;
        C18274b.m60261a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f49667g) {
            boolean z = !f49661a.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C15267r.m44391a(z, (Object) sb.toString());
            C15267r.m44385a(context, (Object) "Application context cannot be null.");
            bVar = new C18272b(context, trim, dVar);
            f49661a.put(trim, bVar);
        }
        bVar.m60255j();
        return bVar;
    }

    private C18272b(Context context, String str, C18298d dVar) {
        this.f49669i = (Context) C15267r.m44384a(context);
        this.f49670j = C15267r.m44386a(str);
        this.f49671k = (C18298d) C15267r.m44384a(dVar);
        this.f49681u = new C18358a();
        this.f49673m = C7285c.m22838a(context, "com.google.firebase.common.prefs", 0);
        this.f49677q = new AtomicBoolean(m60253h());
        List a = C182801.m60272a(context).mo47156a();
        this.f49672l = new C18290j(f49668h, a, C18279a.m60268a(context, Context.class, new Class[0]), C18279a.m60268a(this, C18272b.class, new Class[0]), C18279a.m60268a(dVar, C18298d.class, new Class[0]));
        this.f49674n = (C18264c) this.f49672l.mo47162a(C18264c.class);
    }

    /* renamed from: a */
    private static <T> void m60247a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (f49665e.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (f49666f.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb2.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    Log.wtf("FirebaseApp", "Failed to initialize ".concat(String.valueOf(str)), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}
