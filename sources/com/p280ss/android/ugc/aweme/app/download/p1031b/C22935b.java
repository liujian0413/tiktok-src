package com.p280ss.android.ugc.aweme.app.download.p1031b;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.b.b */
public class C22935b implements C19385a {

    /* renamed from: b */
    private static C22935b f60701b;

    /* renamed from: a */
    public volatile boolean f60702a;

    /* renamed from: c */
    private Map<String, Integer> f60703c;

    private C22935b() {
        DownloaderManagerHolder.m75524a().mo51667a((C19385a) this);
    }

    /* renamed from: b */
    private Map<String, Integer> m75498b() {
        if (this.f60703c == null) {
            this.f60703c = new ConcurrentHashMap();
        }
        return this.f60703c;
    }

    /* renamed from: a */
    public static C22935b m75495a() {
        if (f60701b == null) {
            synchronized (C22935b.class) {
                if (f60701b == null) {
                    f60701b = new C22935b();
                }
            }
        }
        return f60701b;
    }

    /* renamed from: a */
    public final void mo51370a(DownloadInfo downloadInfo) {
        m75499b(downloadInfo);
    }

    /* renamed from: b */
    private void m75499b(DownloadInfo downloadInfo) {
        m75498b().remove(downloadInfo.getUrl());
    }

    /* renamed from: a */
    private static JSONObject m75496a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_extra", str);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    private void m75500c(DownloadInfo downloadInfo) {
        if (!m75498b().containsKey(downloadInfo.getUrl())) {
            m75498b().put(downloadInfo.getUrl(), Integer.valueOf(1));
            return;
        }
        m75498b().put(downloadInfo.getUrl(), Integer.valueOf(((Integer) m75498b().get(downloadInfo.getUrl())).intValue() + 1));
    }

    /* renamed from: d */
    private boolean m75501d(DownloadInfo downloadInfo) {
        boolean z;
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                z = new JSONObject(downloadInfo.getExtra()).optBoolean("download_silent");
            } catch (Exception unused) {
            }
            if (C19491j.m64228i().optInt("is_enable_show_retry_download_dialog") == 1 || ((Integer) m75498b().get(downloadInfo.getUrl())).intValue() > 1 || this.f60702a || !C22940c.m75506a(C6399b.m19921a()) || z) {
                return false;
            }
            return true;
        }
        z = false;
        if (C19491j.m64228i().optInt("is_enable_show_retry_download_dialog") == 1) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo51372a(DownloadInfo downloadInfo, String str) {
        m75499b(downloadInfo);
    }

    /* renamed from: a */
    private void m75497a(final DownloadInfo downloadInfo, BaseException baseException) {
        if (baseException != null) {
            int errorCode = baseException.getErrorCode();
            if (errorCode != 1012 && errorCode != 1013) {
                m75500c(downloadInfo);
                if (m75501d(downloadInfo)) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            final Activity g = C6405d.m19984g();
                            if (g != null && !g.isFinishing()) {
                                C22935b.this.f60702a = true;
                                String title = downloadInfo.getTitle();
                                C10741a a = new C10741a(g).mo25653a(title);
                                StringBuilder sb = new StringBuilder();
                                sb.append(title);
                                sb.append(g.getString(R.string.avf));
                                Dialog a2 = a.mo25660b(sb.toString()).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        C22935b.this.f60702a = false;
                                    }
                                }).mo25650a((int) R.string.dzl, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        C22935b.this.mo59934a(downloadInfo, g);
                                        C22935b.this.f60702a = false;
                                    }
                                }).mo25656a().mo25637a();
                                a2.setOnCancelListener(new OnCancelListener() {
                                    public final void onCancel(DialogInterface dialogInterface) {
                                        C22935b.this.f60702a = false;
                                    }
                                });
                                a2.setCancelable(false);
                                a2.show();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v2, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r0v8, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v15
      assigns: []
      uses: []
      mth insns count: 77
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo59934a(com.p280ss.android.socialbase.downloader.model.DownloadInfo r17, android.app.Activity r18) {
        /*
            r16 = this;
            java.lang.String r0 = r17.getExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0034
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r17.getExtra()     // Catch:{ Exception -> 0x002f }
            r0.<init>(r4)     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "extra"
            long r4 = com.p280ss.android.downloadlib.p868c.C19523h.m64304a(r0, r4)     // Catch:{ Exception -> 0x002b }
            java.lang.String r6 = "log_extra"
            java.lang.String r6 = r0.optString(r6)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = "ext_value"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Exception -> 0x002d }
            goto L_0x0036
        L_0x0029:
            r6 = r1
            goto L_0x002d
        L_0x002b:
            r6 = r1
            r4 = r2
        L_0x002d:
            r1 = r0
            goto L_0x0031
        L_0x002f:
            r6 = r1
            r4 = r2
        L_0x0031:
            r0 = r1
            r1 = r6
            goto L_0x0036
        L_0x0034:
            r0 = r1
            r4 = r2
        L_0x0036:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cd
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x0042
            goto L_0x00cd
        L_0x0042:
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = new com.ss.android.socialbase.appdownloader.AppTaskBuilder
            java.lang.String r7 = r17.getUrl()
            r8 = r18
            r6.<init>(r8, r7)
            java.lang.String r7 = r17.getTitle()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.name(r7)
            java.lang.String r7 = r17.getExtra()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.extra(r7)
            java.lang.String r7 = r17.getMimeType()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.mimeType(r7)
            java.util.List r7 = r17.getExtraHeaders()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.headers(r7)
            boolean r7 = r17.canShowNotification()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.showNotification(r7)
            r7 = 0
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.needWifi(r7)
            java.lang.String r8 = r17.getSavePath()
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.savePath(r8)
            java.lang.String r8 = "application/vnd.android.package-archive"
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r6 = r6.mimeType(r8)
            r8 = 1
            int r0 = com.p280ss.android.downloadlib.addownload.C19490i.m64190a(r8, r7, r0, r6)
            long r14 = (long) r0
            com.ss.android.ugc.aweme.app.AwemeApplication r6 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
            java.lang.String r7 = "feed_download_ad"
            java.lang.String r8 = "click"
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r10 = 0
            org.json.JSONObject r12 = m75496a(r1)
            com.p280ss.android.ugc.aweme.common.C6907h.m21519a(r6, r7, r8, r9, r10, r12)
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
            com.ss.android.downloadlib.a r0 = com.p280ss.android.downloadlib.C19444a.m63957a()
            r9 = 0
            r7 = r4
            r11 = r1
            r12 = r14
            com.ss.android.c.a.b.a r2 = com.p280ss.android.ugc.aweme.app.download.C22941c.m75507a(r7, r9, r11, r12)
            r0.mo51493a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r6 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
            java.lang.String r7 = "feed_download_ad"
            java.lang.String r8 = "click_start"
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r10 = 0
            org.json.JSONObject r12 = m75496a(r1)
            com.p280ss.android.ugc.aweme.common.C6907h.m21519a(r6, r7, r8, r9, r10, r12)
        L_0x00cc:
            return r14
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.download.p1031b.C22935b.mo59934a(com.ss.android.socialbase.downloader.model.DownloadInfo, android.app.Activity):long");
    }

    /* renamed from: a */
    public final void mo51371a(DownloadInfo downloadInfo, BaseException baseException, String str) {
        m75497a(downloadInfo, baseException);
    }
}
