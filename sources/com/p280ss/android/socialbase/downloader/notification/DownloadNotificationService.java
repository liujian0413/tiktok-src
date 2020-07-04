package com.p280ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.notification.DownloadNotificationService */
public class DownloadNotificationService extends Service {

    /* renamed from: a */
    private static final String f55007a = "DownloadNotificationService";

    /* renamed from: b */
    private static int f55008b = 0;

    /* renamed from: c */
    private static int f55009c = 0;

    /* renamed from: d */
    private static boolean f55010d = true;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
    }

    /* renamed from: a */
    private void m67511a(final Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                ExecutorService h = C20269b.m66749h();
                if (h != null) {
                    h.execute(new Runnable() {
                        public final void run() {
                            long j;
                            final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService("notification");
                            final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                            if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                                final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                                int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                                if (!(intExtra == 0 || notification == null || notificationManager == null)) {
                                    if (intExtra2 == 4) {
                                        if (Downloader.getInstance(C20269b.m66765x()).isDownloading(intExtra)) {
                                            DownloadInfo downloadInfo = Downloader.getInstance(C20269b.m66765x()).getDownloadInfo(intExtra);
                                            if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                                DownloadNotificationService.m67510a(notificationManager, intExtra, notification);
                                                downloadInfo.setLastNotifyProgressTime();
                                            }
                                        }
                                    } else if (intExtra2 == -2 || intExtra2 == -3) {
                                        Handler handler = new Handler(Looper.getMainLooper());
                                        C203521 r6 = new Runnable() {
                                            public final void run() {
                                                DownloadNotificationService.m67510a(notificationManager, intExtra, notification);
                                            }
                                        };
                                        if (intExtra2 == -2) {
                                            j = 50;
                                        } else {
                                            j = 200;
                                        }
                                        handler.postDelayed(r6, j);
                                    } else {
                                        DownloadNotificationService.m67510a(notificationManager, intExtra, notification);
                                    }
                                }
                            } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                                if (intExtra != 0) {
                                    DownloadNotificationService.this.mo54908a(notificationManager, intExtra);
                                }
                            } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                                try {
                                    if (C20359e.m67563a((Context) DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE")) {
                                        ConnectivityManager connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity");
                                        if (connectivityManager != null) {
                                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                            if (activeNetworkInfo != null) {
                                                if (activeNetworkInfo.isConnected()) {
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add("application/vnd.android.package-archive");
                                                    arrayList.add("mime_type_plugin");
                                                    Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                                    if (applicationContext != null) {
                                                        Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                                try {
                                    Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:47|48|49|50|51|(1:53)|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ Throwable -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[SYNTHETIC, Splitter:B:23:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c A[Catch:{ Throwable -> 0x00b4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54908a(android.app.NotificationManager r9, int r10) {
        /*
            r8 = this;
            int r0 = f55008b
            if (r0 == 0) goto L_0x0008
            int r0 = f55008b
            if (r0 == r10) goto L_0x0010
        L_0x0008:
            int r0 = f55009c
            if (r0 == 0) goto L_0x00b5
            int r0 = f55009c
            if (r0 != r10) goto L_0x00b5
        L_0x0010:
            java.lang.String r0 = f55007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "doCancel, stopForeground id = "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.socialbase.downloader.p904b.C20190a.m66500a(r0, r1)
            int r0 = f55008b
            r1 = 0
            r2 = 1
            if (r0 != r10) goto L_0x002c
            f55008b = r1
            goto L_0x0034
        L_0x002c:
            int r0 = f55009c
            if (r0 != r10) goto L_0x0034
            f55009c = r1
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            com.ss.android.socialbase.downloader.downloader.c r3 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()     // Catch:{ Throwable -> 0x0048 }
            com.ss.android.socialbase.downloader.downloader.m r3 = r3.mo54299c(r10)     // Catch:{ Throwable -> 0x0048 }
            boolean r4 = r3.mo54429b()     // Catch:{ Throwable -> 0x0048 }
            if (r4 == 0) goto L_0x0048
            r3.mo54420a(r1, r2)     // Catch:{ Throwable -> 0x0048 }
            r3 = 0
            goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 == 0) goto L_0x0050
            r9.cancel(r10)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            boolean r10 = f55010d
            if (r10 != 0) goto L_0x0055
            return
        L_0x0055:
            com.ss.android.socialbase.downloader.notification.b r10 = com.p280ss.android.socialbase.downloader.notification.C20354b.m67519a()     // Catch:{ Throwable -> 0x00b4 }
            android.util.SparseArray r10 = r10.mo54920b()     // Catch:{ Throwable -> 0x00b4 }
            r3 = 0
            if (r10 == 0) goto L_0x008a
            int r4 = r10.size()     // Catch:{ Throwable -> 0x00b4 }
            int r4 = r4 - r2
        L_0x0065:
            if (r4 < 0) goto L_0x008a
            java.lang.Object r5 = r10.valueAt(r4)     // Catch:{ Throwable -> 0x00b4 }
            com.ss.android.socialbase.downloader.notification.a r5 = (com.p280ss.android.socialbase.downloader.notification.C20353a) r5     // Catch:{ Throwable -> 0x00b4 }
            if (r5 == 0) goto L_0x0087
            com.ss.android.socialbase.downloader.downloader.c r6 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()     // Catch:{ Throwable -> 0x00b4 }
            int r7 = r5.f55018a     // Catch:{ Throwable -> 0x00b4 }
            int r6 = r6.mo54284a(r7)     // Catch:{ Throwable -> 0x00b4 }
            if (r6 != r2) goto L_0x0083
            boolean r6 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67590c()     // Catch:{ Throwable -> 0x00b4 }
            if (r6 != 0) goto L_0x0083
            r6 = 1
            goto L_0x0084
        L_0x0083:
            r6 = 0
        L_0x0084:
            if (r6 != r0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r4 = r4 + -1
            goto L_0x0065
        L_0x008a:
            r5 = r3
        L_0x008b:
            if (r5 == 0) goto L_0x00b9
            int r10 = r5.f55018a     // Catch:{ Throwable -> 0x00b4 }
            r9.cancel(r10)     // Catch:{ Throwable -> 0x0092 }
        L_0x0092:
            com.ss.android.socialbase.downloader.downloader.Downloader r9 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r8)     // Catch:{ Throwable -> 0x00b4 }
            int r9 = r9.getStatus(r10)     // Catch:{ Throwable -> 0x00b4 }
            if (r9 != r2) goto L_0x009d
            r1 = 1
        L_0x009d:
            java.lang.String r9 = f55007a     // Catch:{ Throwable -> 0x00b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b4 }
            java.lang.String r2 = "doCancel, updateNotification id = "
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00b4 }
            r0.append(r10)     // Catch:{ Throwable -> 0x00b4 }
            java.lang.String r10 = r0.toString()     // Catch:{ Throwable -> 0x00b4 }
            com.p280ss.android.socialbase.downloader.p904b.C20190a.m66500a(r9, r10)     // Catch:{ Throwable -> 0x00b4 }
            r5.mo54003a(r3, r1)     // Catch:{ Throwable -> 0x00b4 }
            goto L_0x00b9
        L_0x00b4:
            return
        L_0x00b5:
            r9.cancel(r10)     // Catch:{ Throwable -> 0x00b9 }
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.notification.DownloadNotificationService.mo54908a(android.app.NotificationManager, int):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m67511a(intent);
        return 2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x009f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m67510a(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            boolean r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66766y()
            if (r0 == 0) goto L_0x009f
            boolean r0 = f55010d
            if (r0 == 0) goto L_0x009f
            int r0 = f55008b
            if (r0 != 0) goto L_0x0012
            int r0 = f55009c
            if (r0 != r7) goto L_0x001a
        L_0x0012:
            int r0 = f55009c
            if (r0 != 0) goto L_0x009f
            int r0 = f55008b
            if (r0 == r7) goto L_0x009f
        L_0x001a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x002a
            java.lang.String r0 = r8.getChannelId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009f
        L_0x002a:
            com.ss.android.socialbase.downloader.downloader.c r0 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()     // Catch:{ Throwable -> 0x009f }
            int r0 = r0.mo54284a(r7)     // Catch:{ Throwable -> 0x009f }
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x003e
            boolean r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67590c()     // Catch:{ Throwable -> 0x009f }
            if (r0 != 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            java.lang.String r3 = f55007a     // Catch:{ Throwable -> 0x009f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009f }
            java.lang.String r5 = "doNotify, check startForeground, isIndependentProcess = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x009f }
            r4.append(r0)     // Catch:{ Throwable -> 0x009f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x009f }
            com.p280ss.android.socialbase.downloader.p904b.C20190a.m66500a(r3, r4)     // Catch:{ Throwable -> 0x009f }
            if (r0 != 0) goto L_0x0059
            int r3 = f55008b     // Catch:{ Throwable -> 0x009f }
            if (r3 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            if (r0 == 0) goto L_0x0060
            int r3 = f55009c     // Catch:{ Throwable -> 0x009f }
            if (r3 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x009f
            com.ss.android.socialbase.downloader.downloader.c r2 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()     // Catch:{ Throwable -> 0x009f }
            com.ss.android.socialbase.downloader.downloader.m r2 = r2.mo54299c(r7)     // Catch:{ Throwable -> 0x009f }
            boolean r3 = r2.mo54429b()     // Catch:{ Throwable -> 0x009f }
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = f55007a     // Catch:{ Throwable -> 0x009f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009f }
            java.lang.String r5 = "doNotify, ============================== startForeground, id = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x009f }
            r4.append(r7)     // Catch:{ Throwable -> 0x009f }
            java.lang.String r5 = ", isIndependentProcess = "
            r4.append(r5)     // Catch:{ Throwable -> 0x009f }
            r4.append(r0)     // Catch:{ Throwable -> 0x009f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x009f }
            com.p280ss.android.socialbase.downloader.p904b.C20190a.m66500a(r3, r4)     // Catch:{ Throwable -> 0x009f }
            r2.mo54412a(r7, r8)     // Catch:{ Throwable -> 0x009f }
            boolean r2 = r2.mo54429b()     // Catch:{ Throwable -> 0x009f }
            if (r2 == 0) goto L_0x009d
            if (r0 == 0) goto L_0x009a
            f55009c = r7     // Catch:{ Throwable -> 0x009f }
            return
        L_0x009a:
            f55008b = r7     // Catch:{ Throwable -> 0x009f }
            return
        L_0x009d:
            f55010d = r1     // Catch:{ Throwable -> 0x009f }
        L_0x009f:
            r6.notify(r7, r8)     // Catch:{ Throwable -> 0x00a3 }
            return
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.notification.DownloadNotificationService.m67510a(android.app.NotificationManager, int, android.app.Notification):void");
    }
}
