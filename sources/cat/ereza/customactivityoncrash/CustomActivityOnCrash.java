package cat.ereza.customactivityoncrash;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;

public final class CustomActivityOnCrash {

    /* renamed from: a */
    public static Application f6012a;

    /* renamed from: b */
    public static WeakReference<Activity> f6013b = new WeakReference<>(null);

    /* renamed from: c */
    public static boolean f6014c = false;

    /* renamed from: d */
    public static boolean f6015d = true;

    /* renamed from: e */
    public static boolean f6016e = true;

    /* renamed from: f */
    public static boolean f6017f = true;

    /* renamed from: g */
    public static int f6018g = R.drawable.yu;

    /* renamed from: h */
    public static Class<? extends Activity> f6019h = null;

    /* renamed from: i */
    public static Class<? extends Activity> f6020i = null;

    /* renamed from: j */
    public static EventListener f6021j = null;

    public interface EventListener extends Serializable {
        void onCloseAppFromErrorActivity();

        void onLaunchErrorActivity();

        void onRestartAppFromErrorActivity();
    }

    /* renamed from: a */
    public static boolean m7912a(Intent intent) {
        return intent.getBooleanExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", true);
    }

    /* renamed from: a */
    public static boolean m7913a(Throwable th, Class<? extends Activity> cls) {
        StackTraceElement[] stackTrace;
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ((stackTraceElement.getClassName().equals("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("handleBindApplication")) || stackTraceElement.getClassName().equals(cls.getName())) {
                    return true;
                }
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    /* renamed from: a */
    public static void m7910a(Context context, long j) {
        C7285c.m22838a(context, "custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", j).commit();
    }

    /* renamed from: a */
    public static void m7904a() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* renamed from: b */
    private static String m7916b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m7903a(str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m7903a(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m7911a(Class<? extends Activity> cls) {
        f6019h = cls;
    }

    /* renamed from: a */
    public static void m7905a(Activity activity) {
        m7908a(activity, (EventListener) null);
    }

    /* renamed from: c */
    public static String m7918c(Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
    }

    /* renamed from: b */
    public static int m7914b(Intent intent) {
        return intent.getIntExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", R.drawable.yu);
    }

    /* renamed from: c */
    public static Class<? extends Activity> m7917c(Context context) {
        Class<? extends Activity> h = m7925h(context);
        if (h == null) {
            return DefaultErrorActivity.class;
        }
        return h;
    }

    /* renamed from: i */
    private static long m7926i(Context context) {
        return C7285c.m22838a(context, "custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1);
    }

    /* renamed from: b */
    public static Class<? extends Activity> m7915b(Context context) {
        Class<? extends Activity> f = m7923f(context);
        if (f == null) {
            return m7924g(context);
        }
        return f;
    }

    /* renamed from: d */
    public static Class<? extends Activity> m7919d(Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS");
        if (serializableExtra == null || !(serializableExtra instanceof Class)) {
            return null;
        }
        return (Class) serializableExtra;
    }

    /* renamed from: e */
    public static EventListener m7921e(Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER");
        if (serializableExtra == null || !(serializableExtra instanceof EventListener)) {
            return null;
        }
        return (EventListener) serializableExtra;
    }

    /* renamed from: g */
    private static Class<? extends Activity> m7924g(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            try {
                return Class.forName(launchIntentForPackage.getComponent().getClassName());
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m7920d(Context context) {
        long i = m7926i(context);
        long time = new Date().getTime();
        if (i > time || time - i >= 2000) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m7922e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: f */
    private static Class<? extends Activity> m7923f(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    private static Class<? extends Activity> m7925h(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m7903a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(charAt));
        sb.append(str.substring(1));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m7909a(Context context) {
        if (context != null) {
            try {
                final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                    if (defaultUncaughtExceptionHandler != null) {
                        defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os");
                    }
                    f6012a = (Application) context.getApplicationContext();
                    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                        public final void uncaughtException(Thread thread, Throwable th) {
                            C1610a.m7928a(this, thread, th);
                        }

                        /* renamed from: a */
                        public final void mo6956a(Thread thread, Throwable th) {
                            if (!CustomActivityOnCrash.m7920d((Context) CustomActivityOnCrash.f6012a)) {
                                CustomActivityOnCrash.m7910a((Context) CustomActivityOnCrash.f6012a, new Date().getTime());
                                if (CustomActivityOnCrash.f6019h == null) {
                                    CustomActivityOnCrash.f6019h = CustomActivityOnCrash.m7917c((Context) CustomActivityOnCrash.f6012a);
                                }
                                if (CustomActivityOnCrash.m7913a(th, CustomActivityOnCrash.f6019h)) {
                                    if (defaultUncaughtExceptionHandler != null) {
                                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                        return;
                                    }
                                } else if (CustomActivityOnCrash.f6015d || !CustomActivityOnCrash.f6014c) {
                                    Intent intent = new Intent(CustomActivityOnCrash.f6012a, CustomActivityOnCrash.f6019h);
                                    StringWriter stringWriter = new StringWriter();
                                    C6497a.m20180a(th, new PrintWriter(stringWriter));
                                    String stringWriter2 = stringWriter.toString();
                                    if (stringWriter2.length() > 131071) {
                                        String str = " [stack trace too large]";
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(stringWriter2.substring(0, 131071 - str.length()));
                                        sb.append(str);
                                        stringWriter2 = sb.toString();
                                    }
                                    if (CustomActivityOnCrash.f6017f && CustomActivityOnCrash.f6020i == null) {
                                        CustomActivityOnCrash.f6020i = CustomActivityOnCrash.m7915b((Context) CustomActivityOnCrash.f6012a);
                                    } else if (!CustomActivityOnCrash.f6017f) {
                                        CustomActivityOnCrash.f6020i = null;
                                    }
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", stringWriter2);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS", CustomActivityOnCrash.f6020i);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", CustomActivityOnCrash.f6016e);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER", CustomActivityOnCrash.f6021j);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", CustomActivityOnCrash.f6018g);
                                    intent.setFlags(268468224);
                                    if (CustomActivityOnCrash.f6021j != null) {
                                        CustomActivityOnCrash.f6021j.onLaunchErrorActivity();
                                    }
                                    CustomActivityOnCrash.f6012a.startActivity(intent);
                                }
                            } else if (defaultUncaughtExceptionHandler != null) {
                                defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                return;
                            }
                            Activity activity = (Activity) CustomActivityOnCrash.f6013b.get();
                            if (activity != null) {
                                activity.finish();
                                CustomActivityOnCrash.f6013b.clear();
                            }
                            CustomActivityOnCrash.m7904a();
                        }
                    });
                    if (VERSION.SDK_INT >= 14) {
                        f6012a.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {

                            /* renamed from: a */
                            int f6023a;

                            public final void onActivityDestroyed(Activity activity) {
                            }

                            public final void onActivityPaused(Activity activity) {
                            }

                            public final void onActivityResumed(Activity activity) {
                            }

                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public final void onActivityStarted(Activity activity) {
                                boolean z = true;
                                this.f6023a++;
                                if (this.f6023a != 0) {
                                    z = false;
                                }
                                CustomActivityOnCrash.f6014c = z;
                            }

                            public final void onActivityStopped(Activity activity) {
                                boolean z = true;
                                this.f6023a--;
                                if (this.f6023a != 0) {
                                    z = false;
                                }
                                CustomActivityOnCrash.f6014c = z;
                            }

                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                                if (activity.getClass() != CustomActivityOnCrash.f6019h) {
                                    CustomActivityOnCrash.f6013b = new WeakReference<>(activity);
                                }
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7906a(Activity activity, Intent intent) {
        m7907a(activity, intent, null);
    }

    /* renamed from: a */
    private static String m7902a(Context context, DateFormat dateFormat) {
        try {
            ZipFile zipFile = new ZipFile(C1616b.m7931a(context.getPackageManager(), context.getPackageName(), 0).sourceDir);
            String format = dateFormat.format(new Date(zipFile.getEntry("classes.dex").getTime()));
            zipFile.close();
            return format;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: a */
    public static String m7901a(Context context, Intent intent) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String a = m7902a(context, (DateFormat) simpleDateFormat);
        String e = m7922e(context);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("Build version: ");
        sb.append(e);
        sb.append(" \n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("Build date: ");
        sb3.append(a);
        sb3.append(" \n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("Current date: ");
        sb5.append(simpleDateFormat.format(date));
        sb5.append(" \n");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        sb7.append("Device: ");
        sb7.append(m7916b());
        sb7.append(" \n \n");
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(sb8);
        sb9.append("Stack trace:  \n");
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb10);
        sb11.append(m7918c(intent));
        return sb11.toString();
    }

    /* renamed from: a */
    public static void m7908a(Activity activity, EventListener eventListener) {
        if (eventListener != null) {
            eventListener.onCloseAppFromErrorActivity();
        }
        activity.finish();
        m7904a();
    }

    /* renamed from: a */
    public static void m7907a(Activity activity, Intent intent, EventListener eventListener) {
        intent.addFlags(268468224);
        if (eventListener != null) {
            eventListener.onRestartAppFromErrorActivity();
        }
        activity.finish();
        activity.startActivity(intent);
        m7904a();
    }
}
