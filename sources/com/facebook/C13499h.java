package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.C1642a;
import com.facebook.GraphRequest.C13090b;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.appevents.internal.C13165a;
import com.facebook.appevents.internal.C13182g;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13892b;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13947s;
import com.facebook.internal.C13953v;
import com.facebook.internal.C13966y;
import com.facebook.internal.C13967z;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.C13860a;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.p729a.C13862a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: com.facebook.h */
public final class C13499h {

    /* renamed from: a */
    public static volatile String f35790a;

    /* renamed from: b */
    public static Context f35791b;

    /* renamed from: c */
    private static final String f35792c = C13499h.class.getCanonicalName();

    /* renamed from: d */
    private static final HashSet<LoggingBehavior> f35793d = new HashSet<>(Arrays.asList(new LoggingBehavior[]{LoggingBehavior.DEVELOPER_ERRORS}));

    /* renamed from: e */
    private static Executor f35794e;

    /* renamed from: f */
    private static volatile String f35795f;

    /* renamed from: g */
    private static volatile String f35796g;

    /* renamed from: h */
    private static volatile Boolean f35797h;

    /* renamed from: i */
    private static volatile String f35798i = "facebook.com";

    /* renamed from: j */
    private static AtomicLong f35799j = new AtomicLong(65536);

    /* renamed from: k */
    private static volatile boolean f35800k = false;

    /* renamed from: l */
    private static boolean f35801l = false;

    /* renamed from: m */
    private static C13947s<File> f35802m;

    /* renamed from: n */
    private static int f35803n = 64206;

    /* renamed from: o */
    private static final Object f35804o = new Object();

    /* renamed from: p */
    private static String f35805p = C13966y.m41211d();

    /* renamed from: q */
    private static Boolean f35806q = Boolean.valueOf(false);

    /* renamed from: r */
    private static Boolean f35807r = Boolean.valueOf(false);

    /* renamed from: com.facebook.h$a */
    public interface C13505a {
    }

    /* renamed from: b */
    private static synchronized void m39711b(Context context, C13505a aVar) {
        synchronized (C13499h.class) {
            C13506i.m39741a(context, null);
        }
    }

    /* renamed from: c */
    public static boolean m39717c() {
        return f35800k;
    }

    /* renamed from: d */
    public static boolean m39718d() {
        return f35801l;
    }

    /* renamed from: f */
    public static String m39720f() {
        return f35798i;
    }

    /* renamed from: i */
    public static String m39723i() {
        return "5.5.2";
    }

    /* renamed from: g */
    public static Context m39721g() {
        C13876aa.m40975a();
        return f35791b;
    }

    /* renamed from: k */
    public static String m39725k() {
        C13876aa.m40975a();
        return f35790a;
    }

    /* renamed from: l */
    public static String m39726l() {
        C13876aa.m40975a();
        return f35795f;
    }

    /* renamed from: m */
    public static String m39727m() {
        C13876aa.m40975a();
        return f35796g;
    }

    /* renamed from: n */
    public static boolean m39728n() {
        return C14637u.m42332b();
    }

    /* renamed from: o */
    public static boolean m39729o() {
        return C14637u.m42335d();
    }

    /* renamed from: p */
    public static boolean m39730p() {
        return C14637u.m42334c();
    }

    /* renamed from: r */
    public static int m39732r() {
        C13876aa.m40975a();
        return f35803n;
    }

    /* renamed from: s */
    private static void m39733s() {
        f35807r = Boolean.valueOf(true);
    }

    /* renamed from: u */
    private static boolean m39735u() {
        return C14637u.m42330a();
    }

    /* renamed from: h */
    public static String m39722h() {
        C1642a.m8034a("getGraphApiVersion: %s", new Object[]{f35805p});
        return f35805p;
    }

    /* renamed from: j */
    public static long m39724j() {
        C13876aa.m40975a();
        return f35799j.get();
    }

    /* renamed from: q */
    public static File m39731q() {
        C13876aa.m40975a();
        return (File) f35802m.mo33600a();
    }

    /* renamed from: b */
    public static synchronized boolean m39713b() {
        boolean booleanValue;
        synchronized (C13499h.class) {
            booleanValue = f35807r.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: e */
    public static Executor m39719e() {
        synchronized (f35804o) {
            if (f35794e == null) {
                f35794e = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f35794e;
    }

    /* renamed from: t */
    private static void m39734t() {
        if (f35793d.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !f35793d.contains(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            f35793d.add(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m39710a() {
        boolean booleanValue;
        synchronized (C13499h.class) {
            booleanValue = f35806q.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static void m39707a(String str) {
        f35790a = str;
    }

    /* renamed from: a */
    public static void m39709a(boolean z) {
        f35800k = true;
    }

    /* renamed from: a */
    public static synchronized void m39703a(Context context) {
        synchronized (C13499h.class) {
            m39711b(context, (C13505a) null);
        }
    }

    /* renamed from: a */
    public static void m39706a(LoggingBehavior loggingBehavior) {
        synchronized (f35793d) {
            f35793d.add(loggingBehavior);
            m39734t();
        }
    }

    /* renamed from: b */
    public static boolean m39714b(Context context) {
        C13876aa.m40975a();
        return C7285c.m22838a(context, "com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: a */
    public static void m39708a(Executor executor) {
        C13876aa.m40978a((Object) executor, "executor");
        synchronized (f35804o) {
            f35794e = executor;
        }
    }

    /* renamed from: b */
    public static boolean m39715b(LoggingBehavior loggingBehavior) {
        boolean z;
        synchronized (f35793d) {
            if (!m39717c() || !f35793d.contains(loggingBehavior)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    private static void m39716c(Context context) {
        if (context != null) {
            try {
                ApplicationInfo a = C13506i.m39740a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (a != null && a.metaData != null) {
                    if (f35790a == null) {
                        Object obj = a.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                f35790a = str.substring(2);
                            } else {
                                f35790a = str;
                            }
                        } else if (obj instanceof Integer) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f35795f == null) {
                        f35795f = a.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f35796g == null) {
                        f35796g = a.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f35803n == 64206) {
                        f35803n = a.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f35797h == null) {
                        f35797h = Boolean.valueOf(a.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m39705a(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        m39719e().execute(new Runnable() {
            public final void run() {
                C13499h.m39712b(applicationContext, str);
            }
        });
    }

    /* renamed from: b */
    static void m39712b(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C13892b a = C13892b.m41018a(context);
            SharedPreferences a2 = C7285c.m22838a(context, "com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j = a2.getLong(sb2, 0);
            GraphRequest a3 = GraphRequest.m38253a((AccessToken) null, C1642a.m8034a("%s/activities", new Object[]{str}), AppEventsLoggerUtility.m38480a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, a, AppEventsLogger.m38360b(context), m39714b(context), context), (C13090b) null);
            if (j == 0 && a3.mo31788a().f34704d == null) {
                Editor edit = a2.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while publishing install.", (Throwable) e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static synchronized void m39704a(final Context context, final C13505a aVar) {
        synchronized (C13499h.class) {
            if (!f35806q.booleanValue()) {
                C13876aa.m40978a((Object) context, "applicationContext");
                C13876aa.m40983b(context, false);
                C13876aa.m40977a(context, false);
                f35791b = context.getApplicationContext();
                AppEventsLogger.m38360b(context);
                m39716c(f35791b);
                if (!C13967z.m41249a(f35790a)) {
                    f35806q = Boolean.valueOf(true);
                    if (m39735u()) {
                        m39733s();
                    }
                    if ((f35791b instanceof Application) && C14637u.m42332b()) {
                        C13165a.m38482a((Application) f35791b, f35790a);
                    }
                    C13926o.m41101a();
                    C13953v.m41174b();
                    BoltsMeasurementEventListener.m40917a(f35791b);
                    f35802m = new C13947s<>(new Callable<File>() {
                        /* renamed from: a */
                        private static File m39736a() throws Exception {
                            return C13499h.f35791b.getCacheDir();
                        }

                        public final /* synthetic */ Object call() throws Exception {
                            return m39736a();
                        }
                    });
                    FeatureManager.m40932a(Feature.Instrument, new C13860a() {
                        /* renamed from: a */
                        public final void mo31778a(boolean z) {
                            if (z) {
                                C13862a.m40942a();
                            }
                        }
                    });
                    FeatureManager.m40932a(Feature.RestrictiveDataFiltering, new C13860a() {
                        /* renamed from: a */
                        public final void mo31778a(boolean z) {
                            if (z) {
                                C13182g.m38524a();
                            }
                        }
                    });
                    m39719e().execute(new FutureTask(new Callable<Void>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void call() throws Exception {
                            C13196b.m38575a().mo32385b();
                            C14155p.m41775a().mo33916b();
                            if (AccessToken.m38232b() && Profile.m38319a() == null) {
                                Profile.m38321b();
                            }
                            AppEventsLogger.m38358a(C13499h.f35791b, C13499h.f35790a);
                            AppEventsLogger.m38356a(context.getApplicationContext()).mo32285b();
                            return null;
                        }
                    }));
                    return;
                }
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
        }
    }
}
