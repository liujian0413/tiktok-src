package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.C1642a;
import com.facebook.C13499h;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.aa */
public final class C13876aa {

    /* renamed from: a */
    private static final String f36748a = "com.facebook.internal.aa";

    /* renamed from: a */
    public static void m40975a() {
        if (!C13499h.m39710a()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: b */
    public static String m40981b() {
        String k = C13499h.m39725k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* renamed from: c */
    public static String m40985c() {
        String m = C13499h.m39727m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: a */
    public static void m40976a(Context context) {
        m40977a(context, true);
    }

    /* renamed from: b */
    public static void m40982b(Context context) {
        m40983b(context, true);
    }

    /* renamed from: d */
    public static void m40988d(Context context) {
        m40978a((Object) context, "context");
        String b = m40981b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            StringBuilder sb = new StringBuilder("com.facebook.app.FacebookContentProvider");
            sb.append(b);
            String sb2 = sb.toString();
            if (packageManager.resolveContentProvider(sb2, 0) == null) {
                throw new IllegalStateException(C1642a.m8034a("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{sb2}));
            }
        }
    }

    /* renamed from: c */
    public static boolean m40987c(Context context) {
        List<ResolveInfo> list;
        m40978a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder("fb");
            sb.append(C13499h.m39725k());
            sb.append("://authorize");
            intent.setData(Uri.parse(sb.toString()));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }

    /* renamed from: a */
    public static void m40977a(Context context, boolean z) {
        m40978a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: b */
    private static <T> void m40984b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder sb = new StringBuilder("Container '");
            sb.append(str);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m40978a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m40983b(Context context, boolean z) {
        ActivityInfo activityInfo;
        m40978a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (NameNotFoundException unused) {
            }
            if (activityInfo == null && z) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
        }
        activityInfo = null;
        if (activityInfo == null) {
        }
    }

    /* renamed from: c */
    private static <T> void m40986c(Collection<T> collection, String str) {
        m40978a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder sb = new StringBuilder("Container '");
                sb.append(str);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m40979a(String str, String str2) {
        if (C13967z.m41249a(str)) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> void m40980a(Collection<T> collection, String str) {
        m40986c(collection, str);
        m40984b(collection, str);
    }
}
