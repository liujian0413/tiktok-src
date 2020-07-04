package com.p280ss.android.downloadlib;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.p864b.C19462b;
import com.p280ss.android.downloadlib.addownload.p865c.C19471d;
import com.p280ss.android.downloadlib.p868c.C19510a;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.p848c.p849a.C19225a;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.a */
public class C19444a implements C19225a {

    /* renamed from: a */
    public static String f52646a = "a";

    /* renamed from: d */
    private static C19444a f52647d;

    /* renamed from: b */
    public volatile boolean f52648b;

    /* renamed from: c */
    private Set<String> f52649c = new CopyOnWriteArraySet();

    /* renamed from: com.ss.android.downloadlib.a$a */
    class C19447a implements Runnable {

        /* renamed from: b */
        private final int f52657b;

        public final void run() {
            try {
                SharedPreferences a = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0);
                Map all = a.getAll();
                if (all != null && !all.isEmpty()) {
                    Editor edit = a.edit();
                    for (Entry entry : all.entrySet()) {
                        String str = (String) entry.getValue();
                        new StringBuilder("CheckAdEventRunnable value:").append(str);
                        if (TextUtils.isEmpty(str)) {
                            new StringBuilder("CheckAdEventRunnable map return").append(str);
                            return;
                        }
                        C19236a a2 = C19236a.m63065a(new JSONObject(str));
                        if (a2 == null) {
                            edit.remove((String) entry.getKey());
                        } else {
                            C19444a.this.mo51494a(a2, edit, (String) entry.getKey(), this.f52657b);
                        }
                    }
                    edit.apply();
                }
            } catch (Exception e) {
                new StringBuilder("CheckAdEventRunnable exception:").append(e.getMessage());
            }
        }

        public C19447a(int i) {
            this.f52657b = i;
        }
    }

    /* renamed from: com.ss.android.downloadlib.a$b */
    class C19448b implements Runnable {

        /* renamed from: b */
        private final String f52659b;

        /* renamed from: c */
        private final String f52660c;

        /* renamed from: d */
        private final SharedPreferences f52661d;

        public final void run() {
            try {
                new StringBuilder("SendAndListenAdEventRunnable start adId:").append(this.f52659b);
                C19444a.this.f52648b = true;
                C19236a aVar = null;
                String string = this.f52661d.getString(this.f52659b, "");
                StringBuilder sb = new StringBuilder("SendAndListenAdEventRunnable value:");
                sb.append(string);
                sb.append(", adId:");
                sb.append(this.f52659b);
                if (TextUtils.isEmpty(string)) {
                    C19444a.this.f52648b = false;
                    return;
                }
                aVar = C19236a.m63065a(new JSONObject(string));
                if (aVar == null) {
                    C19444a.this.f52648b = false;
                    return;
                }
                StringBuilder sb2 = new StringBuilder("SendAndListenAdEventRunnable model getPackageName: ");
                sb2.append(aVar.f52026e);
                sb2.append(", mPackageName:");
                sb2.append(this.f52660c);
                if (TextUtils.isEmpty(aVar.f52026e) && !TextUtils.isEmpty(this.f52660c)) {
                    aVar.f52026e = this.f52660c;
                }
                if (aVar.f52025d == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - aVar.f52030i < 259200000) {
                        C19444a.this.mo51499b(aVar);
                        aVar.f52025d = 2;
                        aVar.f52030i = currentTimeMillis;
                        this.f52661d.edit().putString(String.valueOf(this.f52659b), aVar.mo51040a().toString()).apply();
                        C19444a.this.mo51495a(aVar, this.f52661d);
                    } else {
                        this.f52661d.edit().remove(String.valueOf(this.f52659b)).apply();
                    }
                }
                StringBuilder sb3 = new StringBuilder("SendAndListenAdEventRunnable model getPackageName: ");
                sb3.append(aVar.f52026e);
                sb3.append(", mPackageName:");
                sb3.append(this.f52660c);
                C19444a.this.f52648b = false;
            } catch (JSONException e) {
                new StringBuilder("SendAndListenAdEventRunnable exception:").append(e.getMessage());
            } catch (Throwable th) {
                C19444a.this.f52648b = false;
                throw th;
            }
        }

        public C19448b(String str, String str2, SharedPreferences sharedPreferences) {
            this.f52659b = str;
            this.f52660c = str2;
            this.f52661d = sharedPreferences;
        }
    }

    /* renamed from: a */
    public final void mo51493a(final C19236a aVar) {
        if (aVar != null && aVar.f52022a > 0) {
            final String valueOf = String.valueOf(aVar.f52022a);
            C19507c.m64274a().mo51638a(new Runnable() {
                public final void run() {
                    C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).edit().putString(valueOf, aVar.mo51040a().toString()).apply();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m63964a(DownloadInfo downloadInfo, long j) {
        try {
            ContentValues contentValues = new ContentValues();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("download_url", downloadInfo.getUrl());
            jSONObject.put("app_name", downloadInfo.getTitle());
            jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
            jSONObject.put("chunk_count", downloadInfo.getChunkCount());
            jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
            jSONObject.put("download_time", downloadInfo.getDownloadTime());
            contentValues.put("extra", jSONObject.toString());
            m63965a(String.valueOf(j), contentValues);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m63965a(String str, ContentValues contentValues) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences a = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0);
                String string = a.getString(str, "");
                if (!TextUtils.isEmpty(string)) {
                    C19236a a2 = C19236a.m63065a(new JSONObject(string));
                    if (a2.f52029h) {
                        m63961a(a2, contentValues);
                        a.edit().putString(str, a2.mo51040a().toString()).apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo51492a(long j, String str) {
        if (j > 0) {
            String valueOf = String.valueOf(j);
            SharedPreferences a = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0);
            if (!TextUtils.isEmpty(a.getString(valueOf, ""))) {
                C19507c.m64274a().mo51638a(new C19448b(valueOf, str, a));
            }
        }
    }

    /* renamed from: a */
    public final void mo51498a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!TextUtils.isEmpty(str)) {
            if (!this.f52649c.contains(str4)) {
                SharedPreferences a = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0);
                String string = a.getString(str3, "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        C19236a a2 = C19236a.m63065a(new JSONObject(string));
                        if (a2 != null) {
                            if (TextUtils.equals(a2.f52026e, str4)) {
                                a2.f52023b = 3;
                                C19490i.m64199a(C19491j.m64232m(), "install_finish", a2.f52029h, a2.f52022a, a2.f52024c, a2.f52023b, m63958a(a2, m63967b(str, str2), 3), 2, a2.f52033l);
                                a.edit().remove(str3).apply();
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51490a(long j, int i, String str, long j2, DownloadInfo downloadInfo) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                C19236a a = C19236a.m63065a(new JSONObject(string));
                if (a != null) {
                    JSONObject a2 = C19236a.m63066a(a);
                    a2.putOpt("download_time", Long.valueOf(j2));
                    a2.putOpt("fail_status", Integer.valueOf(i));
                    if (!TextUtils.isEmpty(str)) {
                        a2.putOpt("fail_msg", str);
                    }
                    m63966a(a2, downloadInfo, true);
                    C19490i.m64199a(C19491j.m64232m(), "download_failed", a.f52029h, j, a.f52024c, a.f52023b, a2, 2, a.f52033l);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:6|7|(1:9)(1:10)|11|12|13|14|15|(1:17)|18|19|20|(4:23|24|25|(1:31))|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0116 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x011c A[Catch:{ JSONException -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m63966a(org.json.JSONObject r3, com.p280ss.android.socialbase.downloader.model.DownloadInfo r4, boolean r5) {
        /*
            if (r3 == 0) goto L_0x017d
            if (r4 != 0) goto L_0x0006
            goto L_0x017d
        L_0x0006:
            int r0 = r4.getId()
            com.ss.android.downloadlib.addownload.l r0 = com.p280ss.android.downloadlib.addownload.C19495l.m64243a(r0)
            java.lang.String r1 = "download_event_opt"
            r2 = 0
            int r0 = r0.mo51596a(r1, r2)
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "download_id"
            int r1 = r4.getId()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "name"
            java.lang.String r1 = r4.getName()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "url"
            java.lang.String r1 = r4.getUrl()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "download_time"
            long r1 = r4.getDownloadTime()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "cur_bytes"
            long r1 = r4.getCurBytes()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "total_bytes"
            long r1 = r4.getTotalBytes()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "network_quality"
            java.lang.String r1 = r4.getNetworkQuality()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            com.ss.android.socialbase.downloader.network.g r0 = com.p280ss.android.socialbase.downloader.network.C20348g.m67505a()     // Catch:{ JSONException -> 0x017c }
            com.ss.android.socialbase.downloader.network.NetworkQuality r0 = r0.mo54907b()     // Catch:{ JSONException -> 0x017c }
            java.lang.String r1 = "current_network_quality"
            java.lang.String r0 = r0.name()     // Catch:{ JSONException -> 0x017c }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "only_wifi"
            boolean r1 = r4.isOnlyWifi()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "need_https_degrade"
            boolean r1 = r4.isNeedHttpsToHttpRetry()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "https_degrade_retry_used"
            boolean r1 = r4.isHttpsToHttpRetryUsed()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "chunk_count"
            int r1 = r4.getChunkCount()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "retry_count"
            int r1 = r4.getRetryCount()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "cur_retry_time"
            int r1 = r4.getCurRetryTime()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "need_retry_delay"
            boolean r1 = r4.isNeedRetryDelay()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "backup_url_used"
            boolean r1 = r4.isBackUpUrlUsed()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "head_connection_error_msg"
            java.lang.String r1 = r4.getHeadConnectionException()     // Catch:{ JSONException -> 0x017c }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r4.getHeadConnectionException()     // Catch:{ JSONException -> 0x017c }
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r1 = ""
        L_0x00bf:
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "need_independent_process"
            boolean r1 = r4.isNeedIndependentProcess()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "total_retry_count"
            int r1 = r4.getTotalRetryCount()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "cur_retry_time_in_total"
            int r1 = r4.getCurRetryTimeInTotal()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "real_download_time"
            long r1 = r4.getRealDownloadTime()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "chunk_downgrade_retry_used"
            boolean r1 = r4.isChunkDowngradeRetryUsed()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "need_chunk_downgrade_retry"
            boolean r1 = r4.isNeedChunkDowngradeRetry()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "failed_resume_count"
            int r1 = r4.getFailedResumeCount()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            android.content.Context r0 = com.p280ss.android.downloadlib.addownload.C19491j.m64206a()     // Catch:{ Exception -> 0x0116 }
            com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)     // Catch:{ Exception -> 0x0116 }
            int r1 = r4.getId()     // Catch:{ Exception -> 0x0116 }
            boolean r0 = r0.isDownloadServiceForeground(r1)     // Catch:{ Exception -> 0x0116 }
            java.lang.String r1 = "is_download_service_foreground"
            r3.put(r1, r0)     // Catch:{ Exception -> 0x0116 }
        L_0x0116:
            java.util.List r0 = r4.getBackUpUrls()     // Catch:{ JSONException -> 0x017c }
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "backup_url_count"
            java.util.List r1 = r4.getBackUpUrls()     // Catch:{ JSONException -> 0x017c }
            int r1 = r1.size()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "cur_backup_url_index"
            int r1 = r4.getCurBackUpUrlIndex()     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017c }
        L_0x0132:
            java.lang.String r0 = "clear_space_restart_times"
            com.ss.android.downloadlib.addownload.c.d r1 = com.p280ss.android.downloadlib.addownload.p865c.C19471d.m64054a()     // Catch:{ JSONException -> 0x017c }
            java.lang.String r4 = r4.getUrl()     // Catch:{ JSONException -> 0x017c }
            int r4 = r1.mo51544b(r4)     // Catch:{ JSONException -> 0x017c }
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x017c }
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0154 }
            long r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67586c(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "device_available_space"
            r3.put(r4, r0)     // Catch:{ Exception -> 0x0154 }
        L_0x0154:
            if (r5 == 0) goto L_0x017b
            java.lang.String r4 = "fail_status"
            int r4 = r3.optInt(r4)     // Catch:{ JSONException -> 0x017c }
            r5 = 1055(0x41f, float:1.478E-42)
            if (r4 != r5) goto L_0x017b
            android.content.Context r4 = com.p280ss.android.downloadlib.addownload.C19491j.m64206a()     // Catch:{ JSONException -> 0x017c }
            if (r4 == 0) goto L_0x017b
            android.content.Context r4 = com.p280ss.android.downloadlib.addownload.C19491j.m64206a()     // Catch:{ JSONException -> 0x017c }
            boolean r4 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67579b(r4)     // Catch:{ JSONException -> 0x017c }
            if (r4 != 0) goto L_0x017b
            java.lang.String r4 = "fail_status"
            r5 = 1049(0x419, float:1.47E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x017c }
            r3.putOpt(r4, r5)     // Catch:{ JSONException -> 0x017c }
        L_0x017b:
            return
        L_0x017c:
            return
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.C19444a.m63966a(org.json.JSONObject, com.ss.android.socialbase.downloader.model.DownloadInfo, boolean):void");
    }

    /* renamed from: a */
    public final void mo51489a(long j) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                C19236a a = C19236a.m63065a(new JSONObject(string));
                if (a != null) {
                    mo51499b(a);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo51497a(final String str, final long j) {
        if (C19491j.m64228i().optInt("check_hijack", 0) != 0 && !TextUtils.isEmpty(str) && j > 0) {
            C19507c.m64274a().mo51638a(new Runnable() {
                public final void run() {
                    String a = C19510a.m64276a(str);
                    if (!TextUtils.isEmpty(a)) {
                        C7285c.m22838a(C19491j.m64206a(), "sp_ttdownloader_md5", 0).edit().putString(String.valueOf(j), a).apply();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo51495a(C19236a aVar, SharedPreferences sharedPreferences) {
        String str;
        C19236a aVar2;
        Set<String> set;
        String str2;
        C19236a aVar3 = aVar;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (aVar3 == null || aVar3.f52022a <= 0 || sharedPreferences2 == null) {
            if (aVar3 == null) {
                str = "model is null";
            } else {
                StringBuilder sb = new StringBuilder("id:");
                sb.append(aVar3.f52022a);
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("tryListenInstallFinishEvent value: ");
            sb2.append(str);
            sb2.append(",return ");
            return;
        }
        String valueOf = String.valueOf(aVar3.f52022a);
        if (TextUtils.isEmpty(aVar3.f52026e)) {
            sharedPreferences.edit().remove(valueOf).apply();
            StringBuilder sb3 = new StringBuilder("tryListenInstallFinishEvent adId: ");
            sb3.append(valueOf);
            sb3.append(",packageName is empty ");
            return;
        }
        this.f52649c.add(aVar3.f52026e);
        int i = 15;
        try {
            SystemClock.sleep(20000);
            while (true) {
                if (i <= 0) {
                    break;
                }
                aVar2 = C19236a.m63065a(new JSONObject(sharedPreferences2.getString(valueOf, "")));
                try {
                    if (!C19523h.m64322a(aVar2)) {
                        i--;
                        if (i == 0) {
                            break;
                        }
                        SystemClock.sleep(20000);
                        aVar3 = aVar2;
                    } else {
                        StringBuilder sb4 = new StringBuilder("tryListenInstallFinishEvent isInstalledApp start adId: ");
                        sb4.append(valueOf);
                        sb4.append(", packageName:");
                        sb4.append(aVar2.f52026e);
                        C19490i.m64199a(C19491j.m64232m(), "install_finish", aVar2.f52029h, aVar2.f52022a, aVar2.f52024c, aVar2.f52023b, m63958a(aVar2, m63967b(valueOf, aVar2.f52026e), 0), 2, aVar2.f52033l);
                        sharedPreferences.edit().remove(valueOf).apply();
                        C19471d.m64055a(aVar2, C19491j.m64206a());
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        new StringBuilder("tryListenInstallFinishEvent throwable: ").append(th.getMessage());
                        set = this.f52649c;
                        str2 = aVar2.f52026e;
                        set.remove(str2);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f52649c.remove(aVar2.f52026e);
                        throw th;
                    }
                }
            }
            aVar3 = aVar2;
            set = this.f52649c;
            str2 = aVar3.f52026e;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar3;
            this.f52649c.remove(aVar2.f52026e);
            throw th;
        }
        set.remove(str2);
    }

    /* renamed from: a */
    public final void mo50933a(int i) {
        new StringBuilder("checkEventStatus mIsListeningInstallFinish:").append(this.f52648b);
        if (!this.f52648b) {
            C19507c.m64274a().mo51638a(new C19447a(i));
        }
    }

    /* renamed from: a */
    public final void mo51494a(C19236a aVar, Editor editor, String str, int i) {
        C19236a aVar2 = aVar;
        String str2 = str;
        new StringBuilder("trySendAndRefreshAdEvent start key:").append(str2);
        if (aVar2 == null || editor == null || TextUtils.isEmpty(str)) {
            String str3 = aVar2 == null ? "null == model" : str2;
            StringBuilder sb = new StringBuilder("trySendAndRefreshAdEvent ");
            sb.append(str3);
            sb.append(", return");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("trySendAndRefreshAdEvent now:");
        sb2.append(currentTimeMillis);
        sb2.append(", download status: ");
        sb2.append(aVar2.f52025d);
        sb2.append(", model timestamp:");
        sb2.append(aVar2.f52030i);
        sb2.append(", adid:");
        sb2.append(aVar2.f52022a);
        switch (aVar2.f52025d) {
            case 1:
                if (currentTimeMillis - aVar2.f52030i >= 259200000) {
                    editor.remove(str);
                }
                return;
            case 2:
                if (currentTimeMillis - aVar2.f52030i < 604800000) {
                    String str4 = aVar2.f52026e;
                    new StringBuilder("trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH packageName:").append(str4);
                    if (!TextUtils.isEmpty(str4)) {
                        if (C19523h.m64322a(aVar)) {
                            C19490i.m64199a(C19491j.m64232m(), "install_finish", aVar2.f52029h, aVar2.f52022a, aVar2.f52024c, aVar2.f52023b, m63958a(aVar2, m63967b(String.valueOf(aVar2.f52022a), aVar2.f52026e), aVar2.f52034m == 4 ? aVar2.f52034m : i), 2, aVar2.f52033l);
                            editor.remove(str);
                            C19471d.m64055a(aVar2, C19491j.m64206a());
                            break;
                        }
                    } else {
                        editor.remove(str);
                        return;
                    }
                } else {
                    editor.remove(str);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo51496a(C19462b bVar, String str, String str2) {
        m63963a((C19386b) new C19231a().mo50984f(str).mo50989k(str2).mo50977a(), (C19387c) new C19234a().mo51025a(true).mo51019a(bVar.f52696a).mo51021a(bVar.f52698c).mo51027b(bVar.f52697b).mo51026a());
    }

    /* renamed from: a */
    public final void mo51491a(long j, DownloadInfo downloadInfo, long j2, long j3, long j4, long j5, long j6, boolean z) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                C19236a a = C19236a.m63065a(new JSONObject(string));
                if (a != null) {
                    JSONObject a2 = C19236a.m63066a(a);
                    a2.putOpt("room_before_clean_up", Long.valueOf(j2));
                    a2.putOpt("room_to_clean_up", Long.valueOf(j3 - j2));
                    a2.putOpt("clean_up_time_cost", Long.valueOf(j5));
                    a2.putOpt("is_download_restarted", Integer.valueOf(z ? 1 : 0));
                    a2.put("byte_required", j4);
                    a2.put("clear_sleep_time", j6);
                    DownloadInfo downloadInfo2 = downloadInfo;
                    m63962a(a, downloadInfo, a2);
                    C19490i.m64199a("download_tool", "cleanup", a.f52029h, j, a.f52024c, a.f52023b, a2, 2, a.f52033l);
                }
            }
        } catch (Exception unused) {
        }
    }

    private C19444a() {
    }

    /* renamed from: a */
    public static synchronized C19444a m63957a() {
        C19444a aVar;
        synchronized (C19444a.class) {
            if (f52647d == null) {
                f52647d = new C19444a();
            }
            aVar = f52647d;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo51499b(C19236a aVar) {
        if (aVar != null) {
            m63966a(aVar.f52031j, Downloader.getInstance(C19491j.m64206a()).getDownloadInfo((int) aVar.f52032k), false);
            C19490i.m64199a(C19491j.m64232m(), "download_finish", aVar.f52029h, aVar.f52022a, aVar.f52024c, aVar.f52023b, aVar.f52031j, 2, aVar.f52033l);
        }
    }

    /* renamed from: b */
    private static int m63967b(String str, String str2) {
        if (C19491j.m64228i().optInt("check_hijack", 0) == 0) {
            return 0;
        }
        String string = C7285c.m22838a(C19491j.m64206a(), "sp_ttdownloader_md5", 0).getString(str, null);
        String b = C19510a.m64278b(str2);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(b) || string.equals(b)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static void m63959a(long j, int i) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                C19236a a = C19236a.m63065a(new JSONObject(string));
                if (a != null) {
                    JSONObject a2 = C19236a.m63066a(a);
                    a2.putOpt("fail_security", Integer.valueOf(1));
                    C19490i.m64199a(C19491j.m64232m(), "download_failed", a.f52029h, j, a.f52024c, a.f52023b, a2, 2, a.f52033l);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m63961a(C19236a aVar, ContentValues contentValues) throws JSONException {
        if (aVar != null && contentValues != null) {
            Long asLong = contentValues.getAsLong("ext_value");
            if (!(asLong == null || asLong.longValue() == 0)) {
                aVar.f52023b = asLong.longValue();
            }
            Long asLong2 = contentValues.getAsLong("ad_id");
            if (!(asLong2 == null || asLong2.longValue() == 0)) {
                aVar.f52022a = asLong2.longValue();
            }
            String asString = contentValues.getAsString("log_extra");
            if (!TextUtils.isEmpty(asString)) {
                aVar.f52024c = asString;
            }
            String asString2 = contentValues.getAsString("package_name");
            if (!TextUtils.isEmpty(asString2)) {
                aVar.f52026e = asString2;
            }
            Integer asInteger = contentValues.getAsInteger("force_update");
            boolean z = true;
            if (asInteger == null || asInteger.intValue() != 1) {
                z = false;
            }
            String asString3 = contentValues.getAsString("extra");
            if (!TextUtils.isEmpty(asString3)) {
                if (z) {
                    aVar.f52031j = new JSONObject(asString3);
                    return;
                }
                JSONObject jSONObject = new JSONObject(asString3);
                C19523h.m64316a(aVar.f52031j, jSONObject);
                aVar.f52031j = jSONObject;
            }
        }
    }

    /* renamed from: a */
    public static void m63963a(C19386b bVar, C19387c cVar) {
        C19236a aVar;
        JSONObject jSONObject;
        long j;
        String str;
        long j2;
        boolean z;
        String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(cVar.mo50995d()), "");
        try {
            String h = bVar.mo50954h();
            String str2 = "install_window_show";
            if (!TextUtils.isEmpty(string)) {
                aVar = C19236a.m63065a(new JSONObject(string));
            } else {
                aVar = null;
            }
            String p = bVar.mo50962p();
            if (TextUtils.isEmpty(h)) {
                h = bVar.mo50947a();
            }
            if (TextUtils.isEmpty(p)) {
                p = "click_install";
            }
            if (aVar == null) {
                JSONObject v = cVar.mo51013v();
                if (v == null) {
                    v = new JSONObject();
                }
                long d = cVar.mo50995d();
                boolean q = cVar.mo51008q();
                str = cVar.mo51009r();
                j = cVar.mo50996e();
                jSONObject = v;
                long j3 = d;
                z = q;
                j2 = j3;
            } else {
                JSONObject jSONObject2 = aVar.f52031j;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                j2 = aVar.f52022a;
                boolean z2 = aVar.f52029h;
                jSONObject = jSONObject2;
                z = z2;
                str = aVar.f52024c;
                j = aVar.f52023b;
            }
            jSONObject.put("key_extra_check_install_tag", h);
            jSONObject.put("key_extra_check_install_label", p);
            C19490i.m64199a(h, str2, z, j2, str, j, jSONObject, 1, bVar.mo50972z());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static JSONObject m63958a(C19236a aVar, int i, int i2) {
        JSONObject jSONObject;
        try {
            if (aVar.f52031j == null) {
                jSONObject = new JSONObject();
                if (i2 >= 0) {
                    try {
                        jSONObject.putOpt("scene", Integer.valueOf(i2));
                    } catch (JSONException unused) {
                        return jSONObject;
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject(aVar.f52031j.toString());
                if (i2 >= 0) {
                    try {
                        jSONObject2.putOpt("scene", Integer.valueOf(i2));
                    } catch (JSONException unused2) {
                        return jSONObject2;
                    }
                }
                jSONObject = jSONObject2;
            }
            jSONObject.put("hijack", i);
            return jSONObject;
        } catch (JSONException unused3) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m63962a(C19236a aVar, DownloadInfo downloadInfo, JSONObject jSONObject) {
        if (downloadInfo != null) {
            try {
                if (aVar.f52029h) {
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                    jSONObject.put("download_url", downloadInfo.getUrl());
                    jSONObject.put("app_name", downloadInfo.getTitle());
                    jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m63960a(long j, DownloadInfo downloadInfo, int i, boolean z) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                C19236a a = C19236a.m63065a(new JSONObject(string));
                if (a != null) {
                    JSONObject a2 = C19236a.m63066a(a);
                    try {
                        a2.put("download_id", downloadInfo.getId());
                        a2.put("name", downloadInfo.getName());
                        a2.put("url", downloadInfo.getUrl());
                        a2.put("download_time", downloadInfo.getDownloadTime());
                        int i2 = i;
                        a2.put("download_status", i);
                        a2.put("cur_bytes", downloadInfo.getCurBytes());
                        a2.put("total_bytes", downloadInfo.getTotalBytes());
                        a2.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                        a2.put("chunk_count", downloadInfo.getChunkCount());
                        a2.put("launch_resumed", z ? 1 : 0);
                        a2.put("failed_resume_count", downloadInfo.getFailedResumeCount());
                    } catch (JSONException unused) {
                    }
                    C19490i.m64199a("launch_resume", "download_uncompleted", a.f52029h, j, a.f52024c, a.f52023b, a2, 2, a.f52033l);
                }
            }
        } catch (Exception unused2) {
        }
    }
}
