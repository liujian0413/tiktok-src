package android.support.p022v4.app;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils.SimpleStringSplitter;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.a */
public final class C0578a {

    /* renamed from: android.support.v4.app.a$a */
    public interface C0580a {
        /* renamed from: a */
        void mo2559a(View view, C0945c cVar);
    }

    /* renamed from: a */
    public static boolean m2439a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            boolean isEnabled = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
            boolean b = m2441b(context);
            if (!isEnabled || !b) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m2441b(Context context) {
        Intent intent = new Intent("android.accessibilityservice.AccessibilityService");
        intent.addCategory("android.accessibilityservice.category.FEEDBACK_SPOKEN");
        boolean z = false;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        if (VERSION.SDK_INT <= 15) {
            ContentResolver contentResolver = context.getContentResolver();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                StringBuilder sb = new StringBuilder("content://");
                sb.append(resolveInfo.serviceInfo.packageName);
                sb.append(".providers.StatusProvider");
                Cursor query = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    if (i == 1) {
                        return true;
                    }
                }
            }
        } else if (VERSION.SDK_INT >= 26) {
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(resolveInfo2.serviceInfo.packageName);
                sb2.append("/");
                sb2.append(resolveInfo2.serviceInfo.name);
                z |= m2440a(context, sb2.toString());
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
                arrayList.add(runningServiceInfo.service.getPackageName());
            }
            for (ResolveInfo resolveInfo3 : queryIntentServices) {
                if (arrayList.contains(resolveInfo3.serviceInfo.packageName)) {
                    z |= true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m2438a(View view, final C0580a aVar) {
        if (view != null) {
            C0991u.m4187a(view, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    if (aVar != null) {
                        aVar.mo2559a(view, cVar);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m2440a(Context context, String str) {
        SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(':');
        String string = Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
        if (string != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
