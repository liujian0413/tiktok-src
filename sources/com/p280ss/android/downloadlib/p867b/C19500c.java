package com.p280ss.android.downloadlib.p867b;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.C19529f;
import com.p280ss.android.downloadlib.addownload.C19456a;
import com.p280ss.android.downloadlib.addownload.C19459b;
import com.p280ss.android.downloadlib.addownload.C19466c;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.p864b.C19462b;
import com.p280ss.android.downloadlib.addownload.p865c.C19471d;
import com.p280ss.android.downloadlib.p868c.C19513b;
import com.p280ss.android.downloadlib.p868c.C19517c;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20354b;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.b.c */
public final class C19500c implements IAppDownloadEventHandler {

    /* renamed from: a */
    public Context f52793a;

    public final boolean isForbidInvalidatePackageInstall() {
        C19466c.m64039a();
        return C19466c.m64040b();
    }

    public C19500c(Context context) {
        this.f52793a = context.getApplicationContext();
    }

    public final void handleDownloadCancel(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            C19529f.m64362a().mo51654a(downloadInfo);
            try {
                String extra = downloadInfo.getExtra();
                long j = 0;
                if (!TextUtils.isEmpty(extra)) {
                    j = C19523h.m64304a(new JSONObject(extra), "extra");
                }
                C19444a.m63957a().mo51490a(j, 1012, null, downloadInfo.getDownloadTime(), downloadInfo);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m64264a(Context context, String str) {
        C19456a.m63995a().mo51512a(str);
    }

    public final void handleAppInstalled(final Context context, final String str) {
        C19513b.m64281a(new AsyncTask<Void, Void, DownloadInfo>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onPostExecute(DownloadInfo downloadInfo) {
                super.onPostExecute(downloadInfo);
                if (downloadInfo == null) {
                    C19529f.m64362a().mo51657b(null, str);
                } else {
                    C19459b.m64016a().mo51521a(str);
                }
            }

            /* renamed from: b */
            private static void m64269b(DownloadInfo downloadInfo) {
                C19462b a = C19517c.m64284a(downloadInfo);
                if (a != null) {
                    C19499b.m64258a().mo51607a(Long.valueOf(a.f52696a));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public DownloadInfo doInBackground(Void... voidArr) {
                if (context == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                List<DownloadInfo> successedDownloadInfosWithMimeType = Downloader.getInstance(C19500c.this.f52793a).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
                if (successedDownloadInfosWithMimeType == null || successedDownloadInfosWithMimeType.isEmpty()) {
                    return null;
                }
                for (DownloadInfo downloadInfo : successedDownloadInfosWithMimeType) {
                    if (downloadInfo != null && m64268a(downloadInfo, str)) {
                        C19500c.this.handleDownloadEvent(downloadInfo.getId(), 4, str, -3, downloadInfo.getDownloadTime());
                        C20354b.m67519a().mo54918a(downloadInfo.getId());
                        C19529f.m64362a().mo51657b(downloadInfo, str);
                        if (!TextUtils.isEmpty(downloadInfo.getPackageName()) && !str.equals(downloadInfo.getPackageName())) {
                            C19500c.this.mo51610a(downloadInfo.getId(), str, downloadInfo.getPackageName());
                        }
                        m64269b(downloadInfo);
                        C19471d.m64056b(downloadInfo);
                        return downloadInfo;
                    }
                }
                return null;
            }

            /* renamed from: a */
            private boolean m64268a(DownloadInfo downloadInfo, String str) {
                if (str.equals(downloadInfo.getPackageName())) {
                    return true;
                }
                if (!TextUtils.isEmpty(downloadInfo.getName())) {
                    Context context = context;
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadInfo.getSavePath());
                    sb.append(File.separator);
                    sb.append(downloadInfo.getName());
                    if (C19523h.m64321a(context, sb.toString(), str)) {
                        return true;
                    }
                }
                C19462b a = C19517c.m64284a(downloadInfo);
                if (a == null || !C19499b.m64258a().mo51609b(Long.valueOf(a.f52696a), str)) {
                    return false;
                }
                return true;
            }
        }, new Void[0]);
        m64264a(context, str);
    }

    public final boolean installIntercept(int i, boolean z) {
        if (C19491j.m64231l() != null) {
            return C19491j.m64231l().mo51356a(z);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo51610a(int i, String str, String str2) {
        Context context = this.f52793a;
        if (context != null) {
            try {
                DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
                if (downloadInfo != null) {
                    if (downloadInfo.getStatus() != 0) {
                        C19462b a = C19517c.m64284a(downloadInfo);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("package_name", str);
                        jSONObject.put("input_package_name", str2);
                        C19490i.m64199a(C19491j.m64232m(), "deeplink_installed_package_name_match_fail", true, a.f52696a, a.f52698c, a.f52697b, jSONObject, 2, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void handleAppInstallError(int i, int i2, String str, String str2, String str3) {
        if (this.f52793a != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(this.f52793a).getDownloadInfo(i);
            if (downloadInfo != null && downloadInfo.getStatus() == -3) {
                long a = C19490i.m64191a(downloadInfo);
                if (a > 0) {
                    C19444a.m63957a();
                    C19444a.m63959a(a, 1);
                }
                C19466c.m64039a().mo51537a(this.f52793a, downloadInfo);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleDownloadEvent(int r16, int r17, java.lang.String r18, int r19, long r20) {
        /*
            r15 = this;
            r11 = r18
            r12 = r15
            android.content.Context r0 = r12.f52793a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)     // Catch:{ Exception -> 0x015e }
            r2 = r16
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.getDownloadInfo(r2)     // Catch:{ Exception -> 0x015e }
            if (r13 == 0) goto L_0x015d
            int r1 = r13.getStatus()     // Catch:{ Exception -> 0x015e }
            if (r1 != 0) goto L_0x001c
            goto L_0x015d
        L_0x001c:
            com.ss.android.downloadlib.addownload.b.b r14 = com.p280ss.android.downloadlib.p868c.C19517c.m64284a(r13)     // Catch:{ Exception -> 0x015e }
            r1 = 0
            switch(r17) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ab;
                case 3: goto L_0x0088;
                case 4: goto L_0x006f;
                case 5: goto L_0x0057;
                case 6: goto L_0x003f;
                case 7: goto L_0x0027;
                default: goto L_0x0025;
            }     // Catch:{ Exception -> 0x015e }
        L_0x0025:
            goto L_0x015c
        L_0x0027:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_item"
            r3 = 1
            long r4 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            long r7 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            r9 = 1
            r10 = 0
            com.p280ss.android.downloadlib.addownload.C19490i.m64198a(r1, r2, r3, r4, r6, r7, r9, r10)     // Catch:{ Exception -> 0x015e }
            goto L_0x015c
        L_0x003f:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_continue"
            r3 = 1
            long r4 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            long r7 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            r9 = 1
            r10 = 0
            com.p280ss.android.downloadlib.addownload.C19490i.m64198a(r1, r2, r3, r4, r6, r7, r9, r10)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x0057:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_pause"
            r3 = 1
            long r4 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            long r7 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            r9 = 1
            r10 = 0
            com.p280ss.android.downloadlib.addownload.C19490i.m64198a(r1, r2, r3, r4, r6, r7, r9, r10)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x006f:
            com.ss.android.downloadlib.addownload.a r1 = com.p280ss.android.downloadlib.addownload.C19456a.m63995a()     // Catch:{ Exception -> 0x015e }
            long r2 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            r1.mo51513a(r11, r2)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.addownload.a r1 = com.p280ss.android.downloadlib.addownload.C19456a.m63995a()     // Catch:{ Exception -> 0x015e }
            r1.mo51511a(r0, r11)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.addownload.a.a r0 = com.p280ss.android.downloadlib.addownload.p863a.C19457a.m64009a()     // Catch:{ Exception -> 0x015e }
            r0.mo51518b(r11)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x0088:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_install"
            r3 = 1
            long r4 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            long r7 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            r9 = 1
            r10 = 0
            com.p280ss.android.downloadlib.addownload.C19490i.m64198a(r1, r2, r3, r4, r6, r7, r9, r10)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.a r0 = com.p280ss.android.downloadlib.C19444a.m63957a()     // Catch:{ Exception -> 0x015e }
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "install_window_show"
            r0.mo51496a(r14, r1, r2)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x00ab:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_open"
            r3 = 1
            long r4 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            long r7 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            r9 = 1
            r10 = 0
            com.p280ss.android.downloadlib.addownload.C19490i.m64198a(r1, r2, r3, r4, r6, r7, r9, r10)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x00c3:
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0154
            long r0 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            com.p280ss.android.downloadlib.C19444a.m63964a(r13, r0)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.a r0 = com.p280ss.android.downloadlib.C19444a.m63957a()     // Catch:{ Exception -> 0x015e }
            long r1 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            r0.mo51492a(r1, r11)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.a r0 = com.p280ss.android.downloadlib.C19444a.m63957a()     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r1.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r2 = r13.getSavePath()     // Catch:{ Exception -> 0x015e }
            r1.append(r2)     // Catch:{ Exception -> 0x015e }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x015e }
            r1.append(r2)     // Catch:{ Exception -> 0x015e }
            java.lang.String r2 = r13.getName()     // Catch:{ Exception -> 0x015e }
            r1.append(r2)     // Catch:{ Exception -> 0x015e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x015e }
            long r2 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            r0.mo51497a(r1, r2)     // Catch:{ Exception -> 0x015e }
            com.ss.android.downloadlib.b.b r0 = com.p280ss.android.downloadlib.p867b.C19499b.m64258a()     // Catch:{ Exception -> 0x015e }
            long r1 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x015e }
            r0.mo51608a(r1, r11)     // Catch:{ Exception -> 0x015e }
            java.lang.String r0 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x015e }
            if (r0 != 0) goto L_0x0154
            boolean r0 = r14.f52699d     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x0131
            com.ss.android.downloadlib.addownload.a.a r0 = com.p280ss.android.downloadlib.addownload.p863a.C19457a.m64009a()     // Catch:{ Exception -> 0x015e }
            int r1 = r13.getId()     // Catch:{ Exception -> 0x015e }
            long r1 = (long) r1     // Catch:{ Exception -> 0x015e }
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            long r5 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r13.getTitle()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.getTargetFilePath()     // Catch:{ Exception -> 0x015e }
            r7 = r18
            r0.mo51515a(r1, r3, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x015e }
        L_0x0131:
            com.ss.android.downloadlib.addownload.b r0 = com.p280ss.android.downloadlib.addownload.C19459b.m64016a()     // Catch:{ Exception -> 0x015e }
            int r1 = r13.getId()     // Catch:{ Exception -> 0x015e }
            long r1 = (long) r1     // Catch:{ Exception -> 0x015e }
            long r3 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            long r5 = r14.f52697b     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r13.getTitle()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.getTargetFilePath()     // Catch:{ Exception -> 0x015e }
            r7 = r18
            r0.mo51519a(r1, r3, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x015e }
            long r0 = r14.f52696a     // Catch:{ Exception -> 0x015e }
            java.lang.String r2 = r14.f52698c     // Catch:{ Exception -> 0x015e }
            com.p280ss.android.downloadlib.addownload.p866d.C19473a.m64071a(r13, r0, r2, r11)     // Catch:{ Exception -> 0x015e }
        L_0x0154:
            com.ss.android.downloadlib.f r0 = com.p280ss.android.downloadlib.C19529f.m64362a()     // Catch:{ Exception -> 0x015e }
            r0.mo51656a(r13, r11)     // Catch:{ Exception -> 0x015e }
            goto L_0x015e
        L_0x015c:
            return
        L_0x015d:
            return
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.p867b.C19500c.handleDownloadEvent(int, int, java.lang.String, int, long):void");
    }
}
