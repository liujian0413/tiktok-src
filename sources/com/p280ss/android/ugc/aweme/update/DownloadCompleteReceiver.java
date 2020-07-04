package com.p280ss.android.ugc.aweme.update;

import android.content.BroadcastReceiver;

/* renamed from: com.ss.android.ugc.aweme.update.DownloadCompleteReceiver */
public class DownloadCompleteReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x011b
            if (r13 != 0) goto L_0x0006
            goto L_0x011b
        L_0x0006:
            java.lang.String r0 = r14.getAction()
            java.lang.String r1 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r1 = r1.equals(r0)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = "download"
            java.lang.Object r1 = r13.getSystemService(r1)
            android.app.DownloadManager r1 = (android.app.DownloadManager) r1
            java.lang.String r3 = "extra_download_id"
            r4 = -1
            long r3 = r14.getLongExtra(r3, r4)
            r5 = 0
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x002b
            return
        L_0x002b:
            r14 = 0
            android.app.DownloadManager$Query r5 = new android.app.DownloadManager$Query     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            r5.<init>()     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            r6 = 1
            long[] r7 = new long[r6]     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            r8 = 0
            r7[r8] = r3     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            r5.setFilterById(r7)     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            android.database.Cursor r1 = r1.query(r5)     // Catch:{ Exception -> 0x00ff, all -> 0x00f7 }
            boolean r14 = r1.moveToNext()     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            if (r14 == 0) goto L_0x00ed
            java.lang.String r14 = "local_uri"
            int r14 = r1.getColumnIndex(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r14 = r1.getString(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            android.net.Uri r14 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r5 = "media_type"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r7 = com.p280ss.android.newmedia.C19929d.m65756a(r13, r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r9 = "media_type"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            boolean r10 = com.bytedance.common.utility.C6319n.m19593a(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            if (r10 != 0) goto L_0x0078
            java.lang.String r10 = "application/vnd.android.package-archive"
            boolean r9 = r10.equals(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            if (r9 != 0) goto L_0x0086
        L_0x0078:
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            if (r9 != 0) goto L_0x009a
            java.lang.String r9 = ".apk"
            boolean r7 = r7.endsWith(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            if (r7 == 0) goto L_0x009a
        L_0x0086:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r3.addFlags(r2)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r3.addFlags(r6)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r3.setDataAndType(r14, r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r13.startActivity(r3)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            goto L_0x00ed
        L_0x009a:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r9 = 11
            if (r7 >= r9) goto L_0x00ed
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r9 = "android.intent.action.VIEW"
            r7.<init>(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r7.addFlags(r2)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r7.addFlags(r6)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r7.setDataAndType(r14, r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r14 = "title"
            int r14 = r1.getColumnIndex(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r14 = r1.getString(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r5 = 2131822737(0x7f110891, float:1.9278254E38)
            java.lang.String r5 = r13.getString(r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r9 = "notification"
            java.lang.Object r9 = r13.getSystemService(r9)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            android.support.v4.app.NotificationCompat$b r10 = new android.support.v4.app.NotificationCompat$b     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            java.lang.String r11 = "update_notification"
            r10.<init>(r13, r11)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r10.mo2539b(r6)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r10.mo2530a(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r10.mo2537b(r5)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r14 = 2131233873(0x7f080c51, float:1.8083896E38)
            r10.mo2519a(r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            android.app.Notification r14 = r10.mo2534b()     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r13, r8, r7, r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r14.contentIntent = r5     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
            r9.notify(r3, r14)     // Catch:{ Exception -> 0x00f5, all -> 0x00f3 }
        L_0x00ed:
            if (r1 == 0) goto L_0x0104
            r1.close()
            goto L_0x0104
        L_0x00f3:
            r13 = move-exception
            goto L_0x00f9
        L_0x00f5:
            r14 = r1
            goto L_0x00ff
        L_0x00f7:
            r13 = move-exception
            r1 = r14
        L_0x00f9:
            if (r1 == 0) goto L_0x00fe
            r1.close()
        L_0x00fe:
            throw r13
        L_0x00ff:
            if (r14 == 0) goto L_0x0104
            r14.close()
        L_0x0104:
            java.lang.String r14 = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x011a
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW_DOWNLOADS"
            r14.<init>(r0)
            r14.addFlags(r2)     // Catch:{ Exception -> 0x011a }
            r13.startActivity(r14)     // Catch:{ Exception -> 0x011a }
            return
        L_0x011a:
            return
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.DownloadCompleteReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
