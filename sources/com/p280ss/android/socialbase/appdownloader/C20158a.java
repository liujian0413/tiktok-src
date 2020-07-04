package com.p280ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.res.Resources;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20353a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.socialbase.appdownloader.a */
public final class C20158a extends C20353a {

    /* renamed from: f */
    private Context f54558f;

    /* renamed from: g */
    private Resources f54559g = this.f54558f.getResources();

    /* renamed from: h */
    private String f54560h;

    /* renamed from: i */
    private String f54561i;

    /* renamed from: j */
    private String f54562j;

    /* JADX WARNING: Removed duplicated region for block: B:232:0x05ac  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Notification m66417b(com.p280ss.android.socialbase.downloader.exception.BaseException r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            com.ss.android.socialbase.appdownloader.AppDownloader r2 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            java.lang.String r2 = r2.notificationChannelId
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L_0x0016
            android.support.v4.app.NotificationCompat$b r2 = new android.support.v4.app.NotificationCompat$b
            android.content.Context r3 = r0.f54558f
            r2.<init>(r3)
            goto L_0x0047
        L_0x0016:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0022
            android.content.Context r2 = r0.f54558f
            java.lang.String r2 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.getNotificationChannelId(r2)
        L_0x0022:
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ NoSuchMethodError -> 0x0040 }
            com.ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder r3 = r3.appDownloadNotificationBuilder     // Catch:{ NoSuchMethodError -> 0x0040 }
            if (r3 == 0) goto L_0x0037
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ NoSuchMethodError -> 0x0040 }
            com.ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder r3 = r3.appDownloadNotificationBuilder     // Catch:{ NoSuchMethodError -> 0x0040 }
            android.content.Context r4 = r0.f54558f     // Catch:{ NoSuchMethodError -> 0x0040 }
            android.support.v4.app.NotificationCompat$b r2 = r3.createNotification(r4, r2)     // Catch:{ NoSuchMethodError -> 0x0040 }
            goto L_0x0047
        L_0x0037:
            android.support.v4.app.NotificationCompat$b r3 = new android.support.v4.app.NotificationCompat$b     // Catch:{ NoSuchMethodError -> 0x0040 }
            android.content.Context r4 = r0.f54558f     // Catch:{ NoSuchMethodError -> 0x0040 }
            r3.<init>(r4, r2)     // Catch:{ NoSuchMethodError -> 0x0040 }
            r2 = r3
            goto L_0x0047
        L_0x0040:
            android.support.v4.app.NotificationCompat$b r2 = new android.support.v4.app.NotificationCompat$b
            android.content.Context r3 = r0.f54558f
            r2.<init>(r3)
        L_0x0047:
            long r3 = r18.mo54914a()
            r2.mo2523a(r3)
            int r3 = r0.f55022e
            int r4 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.getNotificationType(r3)
            r5 = 0
            if (r4 != 0) goto L_0x0058
            return r5
        L_0x0058:
            int r6 = r0.f55018a
            r7 = 3
            r8 = 2
            r9 = 4
            r10 = 1
            r11 = 0
            if (r4 == r10) goto L_0x0096
            if (r4 != r9) goto L_0x0064
            goto L_0x0096
        L_0x0064:
            if (r4 != r8) goto L_0x007c
            r12 = 17301642(0x108008a, float:2.4979642E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r13 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r13 = r13.useReflectParseRes
            if (r13 == 0) goto L_0x00ab
            android.content.Context r12 = r0.f54558f
            java.lang.String r13 = "stat_sys_warning"
            java.lang.String r14 = "android"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66431a(r12, r13, r14)
            goto L_0x00ab
        L_0x007c:
            if (r4 != r7) goto L_0x0094
            r12 = 17301634(0x1080082, float:2.497962E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r13 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r13 = r13.useReflectParseRes
            if (r13 == 0) goto L_0x00ab
            android.content.Context r12 = r0.f54558f
            java.lang.String r13 = "stat_sys_download_done"
            java.lang.String r14 = "android"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66431a(r12, r13, r14)
            goto L_0x00ab
        L_0x0094:
            r12 = 0
            goto L_0x00ab
        L_0x0096:
            r12 = 17301633(0x1080081, float:2.4979616E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r13 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r13 = r13.useReflectParseRes
            if (r13 == 0) goto L_0x00ab
            android.content.Context r12 = r0.f54558f
            java.lang.String r13 = "stat_sys_download"
            java.lang.String r14 = "android"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66431a(r12, r13, r14)
        L_0x00ab:
            if (r12 != 0) goto L_0x00ae
            return r5
        L_0x00ae:
            r2.mo2519a(r12)
            r13 = -4
            r14 = -1
            r15 = 134217728(0x8000000, float:3.85186E-34)
            if (r4 == r10) goto L_0x0114
            if (r4 == r9) goto L_0x0114
            if (r4 != r8) goto L_0x00bc
            goto L_0x0114
        L_0x00bc:
            if (r4 != r7) goto L_0x0148
            r2.mo2532a(r11)
            r2.mo2539b(r10)
            if (r3 == r14) goto L_0x00cc
            if (r3 != r13) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            java.lang.String r3 = "android.ss.intent.action.DOWNLOAD_OPEN"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r3 = "android.ss.intent.action.DOWNLOAD_DELETE"
        L_0x00ce:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r13 = r0.f54558f
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r14 = com.p280ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r5.<init>(r13, r14)
            r5.setAction(r3)
            java.lang.String r3 = "extra_click_download_ids"
            r5.putExtra(r3, r6)
            java.lang.String r3 = "extra_click_download_type"
            r5.putExtra(r3, r4)
            java.lang.String r3 = "extra_from_notification"
            r5.putExtra(r3, r10)
            android.content.Context r3 = r0.f54558f
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r3, r6, r5, r15)
            r2.mo2524a(r3)
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r5 = r0.f54558f
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r13 = com.p280ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r5, r13)
            java.lang.String r5 = "android.ss.intent.action.DOWNLOAD_HIDE"
            r3.setAction(r5)
            java.lang.String r5 = "extra_click_download_ids"
            r3.putExtra(r5, r6)
            java.lang.String r5 = "extra_click_download_type"
            r3.putExtra(r5, r4)
            android.content.Context r5 = r0.f54558f
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r5, r6, r3, r15)
            r2.mo2536b(r3)
            goto L_0x0148
        L_0x0114:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r5 = r0.f54558f
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r13 = com.p280ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r5, r13)
            java.lang.String r5 = "android.ss.intent.action.DOWNLOAD_DELETE"
            r3.setAction(r5)
            java.lang.String r5 = "extra_click_download_ids"
            r3.putExtra(r5, r6)
            java.lang.String r5 = "extra_click_download_type"
            r3.putExtra(r5, r4)
            java.lang.String r5 = "extra_from_notification"
            r3.putExtra(r5, r10)
            android.content.Context r5 = r0.f54558f
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r5, r6, r3, r15)
            r2.mo2524a(r3)
            if (r4 == r10) goto L_0x0141
            if (r4 != r9) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r3 = 0
            goto L_0x0142
        L_0x0141:
            r3 = 1
        L_0x0142:
            r2.mo2532a(r3)
            r2.mo2539b(r11)
        L_0x0148:
            long r13 = r0.f55019b
            long r7 = r0.f55020c
            if (r4 == r10) goto L_0x0154
            if (r4 != r9) goto L_0x0151
            goto L_0x0154
        L_0x0151:
            r3 = 0
            r5 = 0
            goto L_0x0181
        L_0x0154:
            r16 = 0
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0151
            r16 = 100
            long r13 = r13 * r16
            long r13 = r13 / r7
            int r3 = (int) r13
            r5 = 2131820928(0x7f110180, float:1.9274585E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r7 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r7 = r7.useReflectParseRes
            if (r7 == 0) goto L_0x0173
            android.content.Context r5 = r0.f54558f
            java.lang.String r7 = "appdownloader_download_percent"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r5, r7)
        L_0x0173:
            android.content.res.Resources r7 = r0.f54559g
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r8[r11] = r13
            java.lang.String r5 = r7.getString(r5, r8)
        L_0x0181:
            java.lang.String r7 = r0.f55021d
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x01a2
            r7 = 2131820930(0x7f110182, float:1.9274589E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r8 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r8 = r8.useReflectParseRes
            if (r8 == 0) goto L_0x019c
            android.content.Context r7 = r0.f54558f
            java.lang.String r8 = "appdownloader_download_unknown_title"
            int r7 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r7, r8)
        L_0x019c:
            android.content.res.Resources r8 = r0.f54559g
            java.lang.String r7 = r8.getString(r7)
        L_0x01a2:
            int r8 = android.os.Build.VERSION.SDK_INT
            r14 = 8
            if (r8 > r14) goto L_0x0326
            r2.mo2530a(r7)
            r2.mo2537b(r5)
            if (r4 == r10) goto L_0x031b
            if (r4 != r9) goto L_0x01b4
            goto L_0x031b
        L_0x01b4:
            r5 = 2
            if (r4 != r5) goto L_0x01d5
            r1 = 2131820951(0x7f110197, float:1.9274631E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x01ca
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_paused_in_background"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x01ca:
            android.content.res.Resources r3 = r0.f54559g
            java.lang.String r1 = r3.getString(r1)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x01d5:
            r3 = 3
            if (r4 != r3) goto L_0x0318
            android.content.Context r3 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()
            com.ss.android.socialbase.downloader.downloader.Downloader r3 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3)
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r3.getDownloadInfo(r6)
            int r4 = r0.f55022e
            r5 = -1
            if (r4 == r5) goto L_0x02a0
            int r4 = r0.f55022e
            r5 = -4
            if (r4 != r5) goto L_0x01f0
            goto L_0x02a0
        L_0x01f0:
            int r1 = r0.f55022e
            r3 = -3
            if (r1 != r3) goto L_0x0318
            android.content.Context r1 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r1.getDownloadInfo(r6)
            if (r1 == 0) goto L_0x0262
            java.lang.String r3 = r1.getMimeType()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0262
            java.lang.String r1 = r1.getMimeType()
            java.lang.String r3 = "application/vnd.android.package-archive"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0262
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = r0.f54561i
            java.lang.String r4 = r0.f54560h
            boolean r1 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isApkInstalled(r1, r3, r4)
            if (r1 == 0) goto L_0x0244
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0236
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_complete_open"
            int r13 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
            goto L_0x0239
        L_0x0236:
            r13 = 2131820937(0x7f110189, float:1.9274603E38)
        L_0x0239:
            android.content.res.Resources r1 = r0.f54559g
            java.lang.String r1 = r1.getString(r13)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x0244:
            r1 = 2131820938(0x7f11018a, float:1.9274605E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x0257
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_complete_with_install"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x0257:
            android.content.res.Resources r3 = r0.f54559g
            java.lang.String r1 = r3.getString(r1)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x0262:
            r1 = 2131820939(0x7f11018b, float:1.9274607E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x0275
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_complete_without_install"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x0275:
            com.ss.android.socialbase.downloader.downloader.c r3 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()
            com.ss.android.socialbase.downloader.depend.y r3 = r3.mo54312n(r6)
            if (r3 == 0) goto L_0x0294
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0290
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_complete_open"
            int r13 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
            goto L_0x0295
        L_0x0290:
            r13 = 2131820937(0x7f110189, float:1.9274603E38)
            goto L_0x0295
        L_0x0294:
            r13 = r1
        L_0x0295:
            android.content.res.Resources r1 = r0.f54559g
            java.lang.String r1 = r1.getString(r13)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x02a0:
            if (r19 == 0) goto L_0x02c7
            int r4 = r19.getErrorCode()
            r5 = 1006(0x3ee, float:1.41E-42)
            if (r4 != r5) goto L_0x02c7
            r1 = 2131820947(0x7f110193, float:1.9274623E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x02bd
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_space_failed"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x02bd:
            android.content.res.Resources r3 = r0.f54559g
            java.lang.String r1 = r3.getString(r1)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x02c7:
            if (r19 == 0) goto L_0x02fc
            int r1 = r19.getErrorCode()
            r4 = 1013(0x3f5, float:1.42E-42)
            if (r1 != r4) goto L_0x02fc
            if (r3 == 0) goto L_0x02fc
            java.lang.String r1 = "application/vnd.android.package-archive"
            java.lang.String r3 = r3.getMimeType()
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x02fc
            r1 = 2131820948(0x7f110194, float:1.9274625E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x02f2
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_waiting_wifi"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x02f2:
            android.content.res.Resources r3 = r0.f54559g
            java.lang.String r1 = r3.getString(r1)
            r2.mo2537b(r1)
            goto L_0x0318
        L_0x02fc:
            r1 = 2131820941(0x7f11018d, float:1.9274611E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x030f
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_notification_download_failed"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r3)
        L_0x030f:
            android.content.res.Resources r3 = r0.f54559g
            java.lang.String r1 = r3.getString(r1)
            r2.mo2537b(r1)
        L_0x0318:
            r1 = 0
            goto L_0x0814
        L_0x031b:
            r1 = 0
            r2.mo2542c(r1)
            r4 = 100
            r2.mo2521a(r4, r3, r11)
            goto L_0x0814
        L_0x0326:
            r5 = 2131493107(0x7f0c00f3, float:1.8609685E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r8 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r8 = r8.useReflectParseRes
            if (r8 == 0) goto L_0x0339
            android.content.Context r5 = r0.f54558f
            java.lang.String r8 = "appdownloader_notification_layout"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66430a(r5, r8)
        L_0x0339:
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            android.content.Context r13 = r0.f54558f
            java.lang.String r13 = r13.getPackageName()
            r8.<init>(r13, r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r13 = 20
            if (r5 <= r13) goto L_0x038a
            android.content.Context r5 = r0.f54558f     // Catch:{ Throwable -> 0x0389 }
            boolean r5 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isMaterialNotification(r5)     // Catch:{ Throwable -> 0x0389 }
            if (r5 == 0) goto L_0x038a
            r5 = 2131296538(0x7f09011a, float:1.8210996E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r13 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0389 }
            boolean r13 = r13.useReflectParseRes     // Catch:{ Throwable -> 0x0389 }
            if (r13 == 0) goto L_0x0365
            android.content.Context r5 = r0.f54558f     // Catch:{ Throwable -> 0x0389 }
            java.lang.String r13 = "appdownloader_root"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r5, r13)     // Catch:{ Throwable -> 0x0389 }
        L_0x0365:
            com.ss.android.socialbase.appdownloader.AppDownloader r13 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0389 }
            boolean r13 = r13.useReflectParseRes     // Catch:{ Throwable -> 0x0389 }
            if (r13 == 0) goto L_0x0376
            android.content.Context r13 = r0.f54558f     // Catch:{ Throwable -> 0x0389 }
            java.lang.String r11 = "appdownloader_notification_material_background_color"
            int r13 = com.p280ss.android.socialbase.appdownloader.C20170d.m66436e(r13, r11)     // Catch:{ Throwable -> 0x0389 }
            goto L_0x0379
        L_0x0376:
            r13 = 2131099796(0x7f060094, float:1.7811955E38)
        L_0x0379:
            java.lang.String r11 = "setBackgroundColor"
            android.content.Context r14 = r0.f54558f     // Catch:{ Throwable -> 0x0389 }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ Throwable -> 0x0389 }
            int r13 = r14.getColor(r13)     // Catch:{ Throwable -> 0x0389 }
            r8.setInt(r5, r11, r13)     // Catch:{ Throwable -> 0x0389 }
            goto L_0x038a
        L_0x0389:
        L_0x038a:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r11 = r0.f54558f
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r13 = com.p280ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r5.<init>(r11, r13)
            java.lang.String r11 = "android.ss.intent.action.DOWNLOAD_CLICK"
            r5.setAction(r11)
            java.lang.String r11 = "notification_name"
            java.lang.String r13 = r0.f55021d
            r5.putExtra(r11, r13)
            java.lang.String r11 = "extra_click_download_ids"
            r5.putExtra(r11, r6)
            java.lang.String r11 = "extra_click_download_type"
            r5.putExtra(r11, r4)
            com.ss.android.socialbase.appdownloader.AppDownloader r11 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r11 = r11.useReflectParseRes
            r13 = 2131296528(0x7f090110, float:1.8210975E38)
            if (r11 == 0) goto L_0x03bd
            android.content.Context r11 = r0.f54558f
            java.lang.String r14 = "appdownloader_action"
            int r11 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r11, r14)
            goto L_0x03c0
        L_0x03bd:
            r11 = 2131296528(0x7f090110, float:1.8210975E38)
        L_0x03c0:
            android.content.Context r14 = r0.f54558f
            android.app.PendingIntent r5 = android.app.PendingIntent.getService(r14, r6, r5, r15)
            r8.setOnClickPendingIntent(r11, r5)
            r5 = 2131296529(0x7f090111, float:1.8210977E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r11 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r11 = r11.useReflectParseRes
            if (r11 == 0) goto L_0x03dc
            android.content.Context r5 = r0.f54558f
            java.lang.String r11 = "appdownloader_desc"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r5, r11)
        L_0x03dc:
            r8.setTextViewText(r5, r7)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes
            r7 = 2131296530(0x7f090112, float:1.821098E38)
            if (r5 == 0) goto L_0x03f3
            android.content.Context r5 = r0.f54558f
            java.lang.String r11 = "appdownloader_download_progress"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r5, r11)
            goto L_0x03f6
        L_0x03f3:
            r5 = 2131296530(0x7f090112, float:1.821098E38)
        L_0x03f6:
            r11 = 100
            r14 = r20
            r8.setProgressBar(r5, r11, r3, r14)
            r3 = 2131296537(0x7f090119, float:1.8210993E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes
            if (r5 == 0) goto L_0x0410
            android.content.Context r3 = r0.f54558f
            java.lang.String r5 = "appdownloader_icon"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r3, r5)
        L_0x0410:
            r8.setImageViewResource(r3, r12)
            java.lang.String r3 = ""
            java.lang.String r5 = ""
            java.lang.String r11 = ""
            r12 = 2131296536(0x7f090118, float:1.8210991E38)
            r14 = 2131296533(0x7f090115, float:1.8210985E38)
            if (r4 == r10) goto L_0x06ce
            if (r4 != r9) goto L_0x0425
            goto L_0x06ce
        L_0x0425:
            r9 = 2
            if (r4 != r9) goto L_0x04ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r3 = r0.f55019b
            java.lang.String r3 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r3)
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            long r3 = r0.f55020c
            java.lang.String r3 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 2131820944(0x7f110190, float:1.9274617E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x045b
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_pause"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x045b:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = r4.getString(r1)
            r1 = 2131820946(0x7f110192, float:1.9274621E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0478
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_resume"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x0478:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r11 = r4.getString(r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0492
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_progress"
            int r7 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x0492:
            r1 = 8
            r8.setViewVisibility(r7, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x04a7
            android.content.Context r4 = r0.f54558f
            java.lang.String r6 = "appdownloader_download_success"
            int r14 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r4, r6)
        L_0x04a7:
            r8.setViewVisibility(r14, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x04ba
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_text"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x04ba:
            r1 = 0
            r8.setViewVisibility(r12, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x04cf
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_action"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
            goto L_0x04d2
        L_0x04cf:
            r1 = 2131296528(0x7f090110, float:1.8210975E38)
        L_0x04d2:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r4 < r6) goto L_0x04e7
            java.lang.String r4 = r0.f54562j
            boolean r4 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isBindApp(r4)
            if (r4 == 0) goto L_0x04e1
            goto L_0x04e7
        L_0x04e1:
            r4 = 0
            r8.setViewVisibility(r1, r4)
            goto L_0x07a8
        L_0x04e7:
            r4 = 8
            r8.setViewVisibility(r1, r4)
            goto L_0x07a8
        L_0x04ee:
            r9 = 3
            if (r4 != r9) goto L_0x07a8
            android.content.Context r4 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66765x()
            com.ss.android.socialbase.downloader.downloader.Downloader r4 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r4.getDownloadInfo(r6)
            int r9 = r0.f55022e
            r10 = -1
            if (r9 == r10) goto L_0x05c3
            int r9 = r0.f55022e
            r10 = -4
            if (r9 != r10) goto L_0x0509
            goto L_0x05c3
        L_0x0509:
            int r1 = r0.f55022e
            r9 = -3
            if (r1 != r9) goto L_0x0677
            long r9 = r0.f55020c
            java.lang.String r1 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r9)
            if (r4 == 0) goto L_0x0566
            java.lang.String r3 = r4.getMimeType()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0566
            java.lang.String r3 = r4.getMimeType()
            java.lang.String r4 = "application/vnd.android.package-archive"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0566
            android.content.Context r3 = r0.f54558f
            java.lang.String r4 = r0.f54561i
            java.lang.String r5 = r0.f54560h
            boolean r3 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isApkInstalled(r3, r4, r5)
            if (r3 == 0) goto L_0x0549
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x0594
            android.content.Context r3 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_complete_open"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r3, r4)
            goto L_0x0597
        L_0x0549:
            r3 = 2131820938(0x7f11018a, float:1.9274605E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x055c
            android.content.Context r3 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_complete_with_install"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r3, r4)
        L_0x055c:
            android.content.res.Resources r4 = r0.f54559g
            java.lang.String r4 = r4.getString(r3)
            r2.mo2537b(r4)
            goto L_0x0597
        L_0x0566:
            r3 = 2131820939(0x7f11018b, float:1.9274607E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0579
            android.content.Context r3 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_complete_without_install"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r3, r4)
        L_0x0579:
            com.ss.android.socialbase.downloader.downloader.c r4 = com.p280ss.android.socialbase.downloader.downloader.C20271c.m66769a()
            com.ss.android.socialbase.downloader.depend.y r4 = r4.mo54312n(r6)
            if (r4 == 0) goto L_0x0597
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x0594
            android.content.Context r3 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_complete_open"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r3, r4)
            goto L_0x0597
        L_0x0594:
            r3 = 2131820937(0x7f110189, float:1.9274603E38)
        L_0x0597:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getString(r3)
            r4 = 2131820942(0x7f11018e, float:1.9274613E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes
            if (r5 == 0) goto L_0x05b4
            android.content.Context r4 = r0.f54558f
            java.lang.String r5 = "appdownloader_notification_download_install"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r4, r5)
        L_0x05b4:
            android.content.Context r5 = r0.f54558f
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r4 = r5.getString(r4)
            r5 = r3
            r11 = r4
            r3 = r1
            goto L_0x0677
        L_0x05c3:
            java.lang.String r3 = ""
            r5 = 2131296534(0x7f090116, float:1.8210987E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r6 = r6.useReflectParseRes
            if (r6 == 0) goto L_0x05d8
            android.content.Context r5 = r0.f54558f
            java.lang.String r6 = "appdownloader_download_success_size"
            int r5 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r5, r6)
        L_0x05d8:
            r6 = 8
            r8.setViewVisibility(r5, r6)
            if (r19 == 0) goto L_0x0605
            int r5 = r19.getErrorCode()
            r6 = 1006(0x3ee, float:1.41E-42)
            if (r5 != r6) goto L_0x0605
            r1 = 2131820947(0x7f110193, float:1.9274623E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x05fa
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_space_failed"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x05fa:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            goto L_0x0658
        L_0x0605:
            if (r19 == 0) goto L_0x063b
            int r1 = r19.getErrorCode()
            r5 = 1013(0x3f5, float:1.42E-42)
            if (r1 != r5) goto L_0x063b
            if (r4 == 0) goto L_0x063b
            java.lang.String r1 = "application/vnd.android.package-archive"
            java.lang.String r4 = r4.getMimeType()
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x063b
            r1 = 2131820948(0x7f110194, float:1.9274625E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0630
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_waiting_wifi"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x0630:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            goto L_0x0658
        L_0x063b:
            r1 = 2131820941(0x7f11018d, float:1.9274611E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x064e
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_failed"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x064e:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
        L_0x0658:
            r4 = 2131820945(0x7f110191, float:1.927462E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r5 = r5.useReflectParseRes
            if (r5 == 0) goto L_0x066b
            android.content.Context r4 = r0.f54558f
            java.lang.String r5 = "appdownloader_notification_download_restart"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r4, r5)
        L_0x066b:
            android.content.Context r5 = r0.f54558f
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r4 = r5.getString(r4)
            r5 = r1
            r11 = r4
        L_0x0677:
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0687
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_progress"
            int r7 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x0687:
            r1 = 8
            r8.setViewVisibility(r7, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x069c
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_success"
            int r14 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x069c:
            r1 = 0
            r8.setViewVisibility(r14, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x06b0
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_text"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x06b0:
            r1 = 8
            r8.setViewVisibility(r12, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x06c6
            android.content.Context r4 = r0.f54558f
            java.lang.String r6 = "appdownloader_action"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r4, r6)
            goto L_0x06c9
        L_0x06c6:
            r4 = 2131296528(0x7f090110, float:1.8210975E38)
        L_0x06c9:
            r8.setViewVisibility(r4, r1)
            goto L_0x07a8
        L_0x06ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = r0.f55019b
            java.lang.String r3 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r5)
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            long r5 = r0.f55020c
            java.lang.String r3 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.bytesToHuman(r5)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 2131820949(0x7f110195, float:1.9274627E38)
            if (r4 != r10) goto L_0x0704
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0717
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_downloading"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
            goto L_0x0717
        L_0x0704:
            r1 = 2131820952(0x7f110198, float:1.9274633E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0717
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_prepare"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x0717:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = r4.getString(r1)
            r1 = 2131820944(0x7f110190, float:1.9274617E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x0734
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_notification_download_pause"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66432b(r1, r4)
        L_0x0734:
            android.content.Context r4 = r0.f54558f
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r11 = r4.getString(r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x074e
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_progress"
            int r7 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x074e:
            r1 = 0
            r8.setViewVisibility(r7, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0762
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_success"
            int r14 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x0762:
            r1 = 8
            r8.setViewVisibility(r14, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0777
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_text"
            int r12 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x0777:
            r1 = 0
            r8.setViewVisibility(r12, r1)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x078c
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_action"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
            goto L_0x078f
        L_0x078c:
            r1 = 2131296528(0x7f090110, float:1.8210975E38)
        L_0x078f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r4 < r6) goto L_0x07a3
            java.lang.String r4 = r0.f54562j
            boolean r4 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isBindApp(r4)
            if (r4 == 0) goto L_0x079e
            goto L_0x07a3
        L_0x079e:
            r4 = 0
            r8.setViewVisibility(r1, r4)
            goto L_0x07a8
        L_0x07a3:
            r4 = 8
            r8.setViewVisibility(r1, r4)
        L_0x07a8:
            r1 = 2131296531(0x7f090113, float:1.8210981E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x07bb
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_size"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x07bb:
            r8.setTextViewText(r1, r3)
            r1 = 2131296532(0x7f090114, float:1.8210983E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x07d1
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_status"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x07d1:
            r8.setTextViewText(r1, r5)
            r1 = 2131296534(0x7f090116, float:1.8210987E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r4 = r4.useReflectParseRes
            if (r4 == 0) goto L_0x07e7
            android.content.Context r1 = r0.f54558f
            java.lang.String r4 = "appdownloader_download_success_size"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r4)
        L_0x07e7:
            r8.setTextViewText(r1, r3)
            r1 = 2131296535(0x7f090117, float:1.821099E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r3 = r3.useReflectParseRes
            if (r3 == 0) goto L_0x07fd
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_download_success_status"
            int r1 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r3)
        L_0x07fd:
            r8.setTextViewText(r1, r5)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            boolean r1 = r1.useReflectParseRes
            if (r1 == 0) goto L_0x0810
            android.content.Context r1 = r0.f54558f
            java.lang.String r3 = "appdownloader_action"
            int r13 = com.p280ss.android.socialbase.appdownloader.C20170d.m66435d(r1, r3)
        L_0x0810:
            r8.setTextViewText(r13, r11)
            r1 = r8
        L_0x0814:
            android.app.Notification r2 = r2.mo2534b()
            int r3 = r2.flags
            r4 = 2
            r3 = r3 | r4
            r2.flags = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 8
            if (r3 <= r4) goto L_0x0828
            if (r1 == 0) goto L_0x0828
            r2.contentView = r1
        L_0x0828:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.C20158a.m66417b(com.ss.android.socialbase.downloader.exception.BaseException, boolean):android.app.Notification");
    }

    /* renamed from: a */
    public final void mo54004a(DownloadInfo downloadInfo) {
        super.mo54004a(downloadInfo);
        this.f54561i = downloadInfo.getSavePath();
        this.f54560h = downloadInfo.getName();
        this.f54562j = downloadInfo.getExtra();
    }

    /* renamed from: a */
    public final void mo54003a(BaseException baseException, boolean z) {
        if (this.f54558f != null) {
            try {
                mo54917a(m66417b(baseException, z));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private CharSequence m66416a(Resources resources, long j) {
        if (j >= 3600000) {
            int i = (int) ((j + 1800000) / 3600000);
            int i2 = R.string.js;
            if (AppDownloader.getInstance().useReflectParseRes) {
                i2 = C20170d.m66432b(this.f54558f, "appdownloader_duration_hours");
            }
            return resources.getString(i2, new Object[]{Integer.valueOf(i)});
        } else if (j >= 60000) {
            int i3 = (int) ((j + 30000) / 60000);
            int i4 = R.string.jt;
            if (AppDownloader.getInstance().useReflectParseRes) {
                i4 = C20170d.m66432b(this.f54558f, "appdownloader_duration_minutes");
            }
            return resources.getString(i4, new Object[]{Integer.valueOf(i3)});
        } else {
            int i5 = (int) ((j + 500) / 1000);
            int i6 = R.string.ju;
            if (AppDownloader.getInstance().useReflectParseRes) {
                i6 = C20170d.m66432b(this.f54558f, "appdownloader_duration_seconds");
            }
            return resources.getString(i6, new Object[]{Integer.valueOf(i5)});
        }
    }

    public C20158a(Context context, int i, String str, String str2, String str3, String str4) {
        super(i, str);
        this.f54561i = str2;
        this.f54560h = str3;
        this.f54562j = str4;
        this.f54558f = context.getApplicationContext();
    }
}
