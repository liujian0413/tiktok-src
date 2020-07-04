package com.p280ss.android.socialbase.appdownloader.view;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.C20166c;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;

/* renamed from: com.ss.android.socialbase.appdownloader.view.a */
public final class C20174a extends Fragment {
    /* renamed from: f */
    private static Intent m66443f() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    /* renamed from: c */
    private Context m66440c() {
        Context x = C20269b.m66765x();
        if (x != null || getActivity() == null || getActivity().isFinishing()) {
            return x;
        }
        return getActivity().getApplicationContext();
    }

    /* renamed from: d */
    private Intent m66441d() {
        Context c = m66440c();
        if (c == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("package:");
        sb.append(c.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }

    /* renamed from: e */
    private Intent m66442e() {
        Context c = m66440c();
        if (c == null) {
            return null;
        }
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        String packageName = c.getPackageName();
        intent.putExtra("package", packageName);
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        intent.putExtra("app_package", packageName);
        int i = c.getApplicationInfo().uid;
        intent.putExtra("uid", i);
        intent.putExtra("app_uid", i);
        return intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        startActivityForResult(m66443f(), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        startActivityForResult(m66439b(), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        startActivityForResult(m66441d(), 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54031a() {
        /*
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            android.content.Intent r1 = r2.m66442e()     // Catch:{ Throwable -> 0x000a }
            r2.startActivityForResult(r1, r0)     // Catch:{ Throwable -> 0x000a }
            return
        L_0x000a:
            android.content.Intent r1 = r2.m66439b()     // Catch:{ Throwable -> 0x0012 }
            r2.startActivityForResult(r1, r0)     // Catch:{ Throwable -> 0x0012 }
            return
        L_0x0012:
            android.content.Intent r1 = r2.m66441d()     // Catch:{ Throwable -> 0x001a }
            r2.startActivityForResult(r1, r0)     // Catch:{ Throwable -> 0x001a }
            return
        L_0x001a:
            android.content.Intent r1 = m66443f()
            r2.startActivityForResult(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.view.C20174a.mo54031a():void");
    }

    /* renamed from: b */
    private Intent m66439b() {
        Context c = m66440c();
        if (c == null) {
            return null;
        }
        String packageName = c.getPackageName();
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.contains("oppo")) {
                Intent intent = new Intent();
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
                return intent;
            } else if (lowerCase.contains("vivo")) {
                Intent intent2 = new Intent();
                intent2.putExtra("packagename", packageName);
                if (VERSION.SDK_INT >= 25) {
                    intent2.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
                } else {
                    intent2.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
                }
                return intent2;
            } else if (lowerCase.contains("meizu") && VERSION.SDK_INT < 25) {
                Intent intent3 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent3.putExtra("packageName", packageName);
                intent3.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
                return intent3;
            }
        }
        StringBuilder sb = new StringBuilder("package:");
        sb.append(c.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (C20166c.m66428a()) {
            C20166c.m66427a(true);
        } else {
            C20166c.m66427a(false);
        }
    }
}
