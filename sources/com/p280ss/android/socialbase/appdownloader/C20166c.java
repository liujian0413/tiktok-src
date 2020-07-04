package com.p280ss.android.socialbase.appdownloader;

import android.app.AlertDialog;
import android.support.p022v4.app.C0581aa;
import com.p280ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback;
import com.p280ss.android.socialbase.appdownloader.view.C20174a;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.c */
public class C20166c {

    /* renamed from: a */
    public static AlertDialog f54572a = null;

    /* renamed from: b */
    private static final String f54573b = "c";

    /* renamed from: c */
    private static List<INotificationPermissionRequestCallback> f54574c = new ArrayList();

    /* renamed from: d */
    private static C20174a f54575d;

    /* renamed from: a */
    public static boolean m66428a() {
        try {
            return C0581aa.m2444a(C20269b.m66765x()).mo2561a();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static synchronized void m66427a(boolean z) {
        synchronized (C20166c.class) {
            try {
                if (f54572a != null) {
                    f54572a.cancel();
                    f54572a = null;
                }
                for (INotificationPermissionRequestCallback iNotificationPermissionRequestCallback : f54574c) {
                    if (iNotificationPermissionRequestCallback != null) {
                        if (z) {
                            iNotificationPermissionRequestCallback.onGranted();
                        } else {
                            iNotificationPermissionRequestCallback.onDenied();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.onGranted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66429b(android.app.Activity r3, com.p280ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback r4) {
        /*
            if (r3 == 0) goto L_0x0038
            boolean r0 = r3.isFinishing()     // Catch:{ Throwable -> 0x003c }
            if (r0 == 0) goto L_0x0009
            goto L_0x0038
        L_0x0009:
            android.app.FragmentManager r3 = r3.getFragmentManager()     // Catch:{ Throwable -> 0x003c }
            java.lang.String r0 = f54573b     // Catch:{ Throwable -> 0x003c }
            android.app.Fragment r0 = r3.findFragmentByTag(r0)     // Catch:{ Throwable -> 0x003c }
            com.ss.android.socialbase.appdownloader.view.a r0 = (com.p280ss.android.socialbase.appdownloader.view.C20174a) r0     // Catch:{ Throwable -> 0x003c }
            f54575d = r0     // Catch:{ Throwable -> 0x003c }
            if (r0 != 0) goto L_0x0032
            com.ss.android.socialbase.appdownloader.view.a r0 = new com.ss.android.socialbase.appdownloader.view.a     // Catch:{ Throwable -> 0x003c }
            r0.<init>()     // Catch:{ Throwable -> 0x003c }
            f54575d = r0     // Catch:{ Throwable -> 0x003c }
            android.app.FragmentTransaction r0 = r3.beginTransaction()     // Catch:{ Throwable -> 0x003c }
            com.ss.android.socialbase.appdownloader.view.a r1 = f54575d     // Catch:{ Throwable -> 0x003c }
            java.lang.String r2 = f54573b     // Catch:{ Throwable -> 0x003c }
            android.app.FragmentTransaction r0 = r0.add(r1, r2)     // Catch:{ Throwable -> 0x003c }
            r0.commitAllowingStateLoss()     // Catch:{ Throwable -> 0x003c }
            r3.executePendingTransactions()     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            com.ss.android.socialbase.appdownloader.view.a r3 = f54575d     // Catch:{ Throwable -> 0x003c }
            r3.mo54031a()     // Catch:{ Throwable -> 0x003c }
            return
        L_0x0038:
            r4.onGranted()     // Catch:{ Throwable -> 0x003c }
            return
        L_0x003c:
            r4.onGranted()     // Catch:{ Throwable -> 0x0040 }
            return
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.C20166c.m66429b(android.app.Activity, com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        m66427a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ae */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m66426a(final android.app.Activity r7, final com.p280ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback r8) {
        /*
            java.lang.Class<com.ss.android.socialbase.appdownloader.c> r0 = com.p280ss.android.socialbase.appdownloader.C20166c.class
            monitor-enter(r0)
            r1 = 0
            if (r7 == 0) goto L_0x00a9
            boolean r2 = r7.isFinishing()     // Catch:{ Throwable -> 0x00ae }
            if (r2 == 0) goto L_0x000e
            goto L_0x00a9
        L_0x000e:
            r2 = 2131820956(0x7f11019c, float:1.9274642E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00ae }
            boolean r3 = r3.useReflectParseRes     // Catch:{ Throwable -> 0x00ae }
            if (r3 == 0) goto L_0x0023
            android.content.Context r2 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r3 = "appdownloader_notification_request_title"
            int r2 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r2, r3)     // Catch:{ Throwable -> 0x00ae }
        L_0x0023:
            r3 = 2131820955(0x7f11019b, float:1.927464E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00ae }
            boolean r4 = r4.useReflectParseRes     // Catch:{ Throwable -> 0x00ae }
            if (r4 == 0) goto L_0x0038
            android.content.Context r3 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r4 = "appdownloader_notification_request_message"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r3, r4)     // Catch:{ Throwable -> 0x00ae }
        L_0x0038:
            r4 = 2131820954(0x7f11019a, float:1.9274638E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00ae }
            boolean r5 = r5.useReflectParseRes     // Catch:{ Throwable -> 0x00ae }
            if (r5 == 0) goto L_0x004d
            android.content.Context r4 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r5 = "appdownloader_notification_request_btn_yes"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r4, r5)     // Catch:{ Throwable -> 0x00ae }
        L_0x004d:
            r5 = 2131820953(0x7f110199, float:1.9274635E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00ae }
            boolean r6 = r6.useReflectParseRes     // Catch:{ Throwable -> 0x00ae }
            if (r6 == 0) goto L_0x0062
            android.content.Context r5 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r6 = "appdownloader_notification_request_btn_no"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r5, r6)     // Catch:{ Throwable -> 0x00ae }
        L_0x0062:
            java.util.List<com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback> r6 = f54574c     // Catch:{ Throwable -> 0x00ae }
            r6.add(r8)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog r6 = f54572a     // Catch:{ Throwable -> 0x00ae }
            if (r6 == 0) goto L_0x0073
            android.app.AlertDialog r6 = f54572a     // Catch:{ Throwable -> 0x00ae }
            boolean r6 = r6.isShowing()     // Catch:{ Throwable -> 0x00ae }
            if (r6 != 0) goto L_0x00a5
        L_0x0073:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder     // Catch:{ Throwable -> 0x00ae }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r2 = r6.setTitle(r2)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)     // Catch:{ Throwable -> 0x00ae }
            com.ss.android.socialbase.appdownloader.c$3 r3 = new com.ss.android.socialbase.appdownloader.c$3     // Catch:{ Throwable -> 0x00ae }
            r3.<init>(r7, r8)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r7 = r2.setPositiveButton(r4, r3)     // Catch:{ Throwable -> 0x00ae }
            com.ss.android.socialbase.appdownloader.c$2 r8 = new com.ss.android.socialbase.appdownloader.c$2     // Catch:{ Throwable -> 0x00ae }
            r8.<init>()     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r5, r8)     // Catch:{ Throwable -> 0x00ae }
            com.ss.android.socialbase.appdownloader.c$1 r8 = new com.ss.android.socialbase.appdownloader.c$1     // Catch:{ Throwable -> 0x00ae }
            r8.<init>()     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r7 = r7.setOnKeyListener(r8)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog$Builder r7 = r7.setCancelable(r1)     // Catch:{ Throwable -> 0x00ae }
            android.app.AlertDialog r7 = r7.show()     // Catch:{ Throwable -> 0x00ae }
            f54572a = r7     // Catch:{ Throwable -> 0x00ae }
        L_0x00a5:
            monitor-exit(r0)
            return
        L_0x00a7:
            r7 = move-exception
            goto L_0x00b3
        L_0x00a9:
            r8.onDenied()     // Catch:{ Throwable -> 0x00ae }
            monitor-exit(r0)
            return
        L_0x00ae:
            m66427a(r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            return
        L_0x00b3:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.C20166c.m66426a(android.app.Activity, com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback):void");
    }
}
