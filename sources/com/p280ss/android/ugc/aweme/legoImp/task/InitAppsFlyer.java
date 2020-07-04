package com.p280ss.android.ugc.aweme.legoImp.task;

import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer */
public class InitAppsFlyer implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0045 A[SYNTHETIC, Splitter:B:7:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ab.a r0 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r1 = "method_app_flyer_duration"
            r2 = 0
            r0.mo16822a(r1, r2)
            long r0 = android.os.SystemClock.uptimeMillis()
            com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$1 r3 = new com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$1
            r3.<init>(r0)
            java.lang.String r0 = "preinsatll_appflyer"
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r8, r0, r2)
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "preinsatll_channel"
            java.lang.String r4 = ""
            java.lang.String r1 = r0.getString(r1, r4)
            java.lang.String r4 = "preinsatll_campaign"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.getString(r4, r5)
            java.lang.String r5 = "preinsatll_site_id"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0042
            com.appsflyer.AppsFlyerLib r5 = com.appsflyer.AppsFlyerLib.getInstance()
            r5.setPreinstallAttribution(r1, r4, r0)
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 != 0) goto L_0x009e
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x009e }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = com.p280ss.android.ugc.aweme.legoImp.task.C32401f.m104969a(r0, r1, r4)     // Catch:{ NameNotFoundException -> 0x009e }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.String r4 = "AF_PRE_INSTALL_NAME"
            java.lang.String r1 = r1.getString(r4)     // Catch:{ NameNotFoundException -> 0x009e }
            android.os.Bundle r4 = r0.metaData     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.String r5 = "AF_PRE_INSTALL_CAMPAIGN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)     // Catch:{ NameNotFoundException -> 0x009e }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.String r5 = "AF_PRE_INSTALL_SITE_ID"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)     // Catch:{ NameNotFoundException -> 0x009e }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x009e }
            if (r5 != 0) goto L_0x0089
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x009e }
            if (r5 == 0) goto L_0x0081
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NameNotFoundException -> 0x009e }
            if (r5 != 0) goto L_0x0089
        L_0x0081:
            com.appsflyer.AppsFlyerLib r5 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ NameNotFoundException -> 0x009e }
            r5.setPreinstallAttribution(r1, r4, r0)     // Catch:{ NameNotFoundException -> 0x009e }
            goto L_0x009e
        L_0x0089:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x009e }
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "googleplay"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ NameNotFoundException -> 0x009e }
            if (r0 != 0) goto L_0x009e
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ NameNotFoundException -> 0x009e }
            r0.setOutOfStore(r1)     // Catch:{ NameNotFoundException -> 0x009e }
        L_0x009e:
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r1 = "XY8Lpakui8g4kBcposRgxA"
            r0.init(r1, r3, r8)
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00c9 }
            r0.setCollectIMEI(r2)     // Catch:{ Exception -> 0x00c9 }
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r1 = "android_id"
            java.lang.String r0 = com.p280ss.android.ugc.aweme.legoImp.task.C32401f.m104970a(r0, r1)     // Catch:{ Exception -> 0x00c9 }
            com.appsflyer.AppsFlyerLib r1 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00c9 }
            r1.setAndroidIdData(r0)     // Catch:{ Exception -> 0x00c9 }
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00c9 }
            android.app.Application r8 = (android.app.Application) r8     // Catch:{ Exception -> 0x00c9 }
            r0.startTracking(r8)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d0
        L_0x00c9:
            r8 = move-exception
            boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r0 != 0) goto L_0x00da
        L_0x00d0:
            com.ss.android.ugc.aweme.ab.a r8 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r0 = "method_app_flyer_duration"
            r8.mo16827b(r0, r2)
            return
        L_0x00da:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.run(android.content.Context):void");
    }
}
