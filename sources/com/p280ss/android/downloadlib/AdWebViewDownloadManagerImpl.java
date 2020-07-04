package com.p280ss.android.downloadlib;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19394c.C19396a;
import com.p280ss.android.download.api.model.C19394c.C19397b;
import com.p280ss.android.download.api.p857a.C19379h;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.downloadlib.addownload.C19456a;
import com.p280ss.android.downloadlib.addownload.C19484h;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.exception.OpenAppException;
import com.p280ss.android.downloadlib.p868c.C19517c;
import com.p280ss.android.downloadlib.p868c.C19519e;
import com.p280ss.android.downloadlib.p868c.C19519e.C19520a;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.p848c.p849a.C19235b;
import com.p280ss.android.p848c.p849a.p850a.C19226a.C19228a;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.AdWebViewDownloadManagerImpl */
public class AdWebViewDownloadManagerImpl implements C19235b, C19385a {

    /* renamed from: a */
    private static String f52626a = "AdWebViewDownloadManagerImpl";

    /* renamed from: b */
    private static volatile AdWebViewDownloadManagerImpl f52627b;

    /* renamed from: c */
    private SharedPreferences f52628c = C7285c.m22838a(C19491j.m64206a(), "sp_webview_ad_download_info", 0);

    /* renamed from: d */
    private C19443a<Long, WebViewDownloadInfo> f52629d = m63939b();

    /* renamed from: e */
    private C19535g f52630e = C19535g.m64381a(C19491j.m64206a());

    /* renamed from: f */
    private final Map<String, JSONObject> f52631f;

    /* renamed from: com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$WebViewDownloadInfo */
    static class WebViewDownloadInfo {
        long mAdId;
        String mAppName;
        String mDownloadUrl;
        long mExtValue;
        String mMimeType;
        String mPackageName;
        String mUserAgent;

        static C19384a createDownloadController() {
            boolean z = true;
            C19228a a = new C19228a().mo50938a(0).mo50942b(0).mo50940a(true);
            if (C19491j.m64228i().optInt("download_manage_enable") != 1) {
                z = false;
            }
            return a.mo50943b(z).mo50944c(false).mo50945d(false).mo50941a();
        }

        static C19386b createDownloadEventConfigure() {
            return new C19231a().mo50975a("landing_h5_download_ad_button").mo50978b("landing_h5_download_ad_button").mo50986h("click_start_detail").mo50987i("click_pause_detail").mo50988j("click_continue_detail").mo50989k("click_install_detail").mo50990l("click_open_detail").mo50991m("storage_deny_detail").mo50973a(1).mo50976a(false).mo50979b(true).mo50981c(false).mo50977a();
        }

        static WebViewDownloadInfo fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                WebViewDownloadInfo webViewDownloadInfo = new WebViewDownloadInfo(C19523h.m64304a(jSONObject, "adId"), C19523h.m64304a(jSONObject, "adId"), jSONObject.optString("appName"), jSONObject.optString("downloadUrl"), jSONObject.optString("packageName"), jSONObject.optString("mimeType"), jSONObject.optString("userAgent"));
                return webViewDownloadInfo;
            } catch (Exception unused) {
                return null;
            }
        }

        static JSONObject toJson(WebViewDownloadInfo webViewDownloadInfo) {
            if (webViewDownloadInfo == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("adId", webViewDownloadInfo.mAdId);
                jSONObject.put("extValue", webViewDownloadInfo.mExtValue);
                jSONObject.put("appName", webViewDownloadInfo.mAppName);
                jSONObject.put("downloadUrl", webViewDownloadInfo.mDownloadUrl);
                jSONObject.put("packageName", webViewDownloadInfo.mPackageName);
                jSONObject.put("mimeType", webViewDownloadInfo.mMimeType);
                jSONObject.put("userAgent", webViewDownloadInfo.mUserAgent);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        static C19387c createDownloadModel(String str, WebViewDownloadInfo webViewDownloadInfo) {
            HashMap hashMap;
            if (!TextUtils.isEmpty(webViewDownloadInfo.mUserAgent)) {
                hashMap = new HashMap();
                hashMap.put("User-Agent", webViewDownloadInfo.mUserAgent);
            } else {
                hashMap = null;
            }
            return new C19234a().mo51019a(webViewDownloadInfo.mAdId).mo51027b(webViewDownloadInfo.mExtValue).mo51021a(str).mo51030d(webViewDownloadInfo.mDownloadUrl).mo51028b(webViewDownloadInfo.mPackageName).mo51031e(webViewDownloadInfo.mAppName).mo51032f(webViewDownloadInfo.mMimeType).mo51023a((Map<String, String>) hashMap).mo51026a();
        }

        WebViewDownloadInfo(long j, long j2, String str, String str2, String str3, String str4, String str5) {
            this.mAdId = j;
            this.mExtValue = j2;
            this.mAppName = str;
            this.mDownloadUrl = str2;
            this.mPackageName = str3;
            this.mMimeType = str4;
            this.mUserAgent = str5;
        }
    }

    /* renamed from: com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$a */
    static class C19443a<K, T> extends LinkedHashMap<K, T> {
        private static final long serialVersionUID = 6166255753998387313L;

        /* renamed from: a */
        final int f52645a = 8;

        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry<K, T> entry) {
            if (size() > this.f52645a) {
                return true;
            }
            return false;
        }

        public C19443a(int i, int i2) {
            super(8, 0.75f, true);
        }
    }

    /* renamed from: a */
    public final void mo51370a(DownloadInfo downloadInfo) {
    }

    /* renamed from: a */
    public final void mo51371a(DownloadInfo downloadInfo, BaseException baseException, String str) {
    }

    /* renamed from: a */
    public final void mo51483a(Context context, String str, WebViewDownloadInfo webViewDownloadInfo, C19388d dVar, int i) {
        if (C19519e.m64291b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            mo51484b(context, str, webViewDownloadInfo, dVar, i);
            return;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        final Context context2 = context;
        final String str2 = str;
        final WebViewDownloadInfo webViewDownloadInfo2 = webViewDownloadInfo;
        final C19388d dVar2 = dVar;
        final int i2 = i;
        C194412 r3 = new C19520a() {
            /* renamed from: a */
            public final void mo51486a(String str) {
            }

            /* renamed from: a */
            public final void mo51485a() {
                AdWebViewDownloadManagerImpl.this.mo51484b(context2, str2, webViewDownloadInfo2, dVar2, i2);
            }
        };
        C19519e.m64290a(strArr, (C19520a) r3);
    }

    /* renamed from: a */
    public final boolean mo51037a(Context context, long j, String str, C19388d dVar, int i) {
        if (!mo51039b(j)) {
            return false;
        }
        WebViewDownloadInfo webViewDownloadInfo = (WebViewDownloadInfo) this.f52629d.get(Long.valueOf(j));
        if (webViewDownloadInfo == null || TextUtils.isEmpty(webViewDownloadInfo.mDownloadUrl)) {
            return false;
        }
        this.f52630e.mo51666a(context, i, dVar, WebViewDownloadInfo.createDownloadModel(str, webViewDownloadInfo));
        return true;
    }

    /* renamed from: a */
    public final boolean mo51036a(long j, int i) {
        if (!mo51039b(j)) {
            return false;
        }
        WebViewDownloadInfo webViewDownloadInfo = (WebViewDownloadInfo) this.f52629d.get(Long.valueOf(j));
        if (webViewDownloadInfo != null) {
            this.f52630e.mo51669a(webViewDownloadInfo.mDownloadUrl, i);
            this.f52631f.remove(webViewDownloadInfo.mDownloadUrl);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51035a(long j) {
        WebViewDownloadInfo webViewDownloadInfo = (WebViewDownloadInfo) this.f52629d.get(Long.valueOf(j));
        if (webViewDownloadInfo != null) {
            this.f52630e.mo51670a(webViewDownloadInfo.mDownloadUrl, j, 2, WebViewDownloadInfo.createDownloadEventConfigure(), WebViewDownloadInfo.createDownloadController());
        }
    }

    /* renamed from: a */
    public final boolean mo51038a(Context context, Uri uri, C19387c cVar) {
        C19387c cVar2 = cVar;
        if (C19491j.m64228i().optInt("disable_market") == 1) {
            return false;
        }
        try {
            C19523h.m64313a(context == null ? C19491j.m64206a() : context, uri);
        } catch (OpenAppException e) {
            OpenAppException openAppException = e;
            if (cVar2 == null) {
                return openAppException.getFinalStatus() == 3;
            }
            WebViewDownloadInfo.createDownloadController();
            C19386b createDownloadEventConfigure = WebViewDownloadInfo.createDownloadEventConfigure();
            C19484h hVar = new C19484h();
            hVar.mo51576a(cVar2);
            hVar.f52755b = WebViewDownloadInfo.createDownloadEventConfigure();
            hVar.mo51575a(WebViewDownloadInfo.createDownloadController());
            switch (openAppException.getFinalStatus()) {
                case 3:
                    hVar.mo51581a(true, (long) openAppException.getExtStatus(), cVar.mo50996e(), cVar.mo51010s());
                    C19491j.m64222c();
                    C19456a.m63995a().mo51510a(cVar.mo50995d(), cVar.mo50996e(), cVar.mo51009r(), cVar.mo50997f(), cVar.mo51010s());
                    if (createDownloadEventConfigure.mo50971y()) {
                        C19236a aVar = new C19236a(cVar2, createDownloadEventConfigure.mo50972z(), 0);
                        aVar.f52025d = 2;
                        aVar.f52030i = System.currentTimeMillis();
                        aVar.f52034m = 4;
                        C19444a.m63957a().mo51493a(aVar);
                    }
                    return true;
                case 4:
                    hVar.mo51581a(false, (long) openAppException.getExtStatus(), cVar.mo50996e(), cVar.mo51010s());
                    return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo51372a(DownloadInfo downloadInfo, String str) {
        long j;
        String extra = downloadInfo.getExtra();
        if (!TextUtils.isEmpty(extra)) {
            try {
                j = C19523h.m64304a(new JSONObject(extra), "extra");
            } catch (JSONException unused) {
                j = 0;
            }
            if (this.f52629d.containsKey(Long.valueOf(j))) {
                m63935a(j, str);
            }
        }
    }

    /* renamed from: a */
    public static AdWebViewDownloadManagerImpl m63933a() {
        if (f52627b == null) {
            synchronized (AdWebViewDownloadManagerImpl.class) {
                if (f52627b == null) {
                    f52627b = new AdWebViewDownloadManagerImpl();
                }
            }
        }
        return f52627b;
    }

    private AdWebViewDownloadManagerImpl() {
        this.f52630e.mo51667a((C19385a) this);
        this.f52631f = new HashMap();
    }

    /* renamed from: b */
    private C19443a<Long, WebViewDownloadInfo> m63939b() {
        C19443a<Long, WebViewDownloadInfo> aVar = new C19443a<>(8, 8);
        try {
            JSONObject jSONObject = new JSONObject(this.f52628c.getString("key_download_info_list", ""));
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                WebViewDownloadInfo fromJson = WebViewDownloadInfo.fromJson(jSONObject.optJSONObject(str));
                if (fromJson != null) {
                    aVar.put(Long.valueOf(str), fromJson);
                }
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    /* renamed from: b */
    public final boolean mo51039b(long j) {
        return this.f52629d.containsKey(Long.valueOf(j));
    }

    /* renamed from: a */
    private void m63936a(WebViewDownloadInfo webViewDownloadInfo) {
        if (this.f52629d.containsKey(Long.valueOf(webViewDownloadInfo.mAdId))) {
            WebViewDownloadInfo webViewDownloadInfo2 = (WebViewDownloadInfo) this.f52629d.get(Long.valueOf(webViewDownloadInfo.mAdId));
            if (webViewDownloadInfo2 != null && TextUtils.equals(webViewDownloadInfo.mDownloadUrl, webViewDownloadInfo2.mDownloadUrl)) {
                return;
            }
        }
        this.f52629d.put(Long.valueOf(webViewDownloadInfo.mAdId), webViewDownloadInfo);
        m63937a((Map<Long, WebViewDownloadInfo>) this.f52629d);
    }

    /* renamed from: a */
    private void m63937a(Map<Long, WebViewDownloadInfo> map) {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put(String.valueOf(entry.getKey()), WebViewDownloadInfo.toJson((WebViewDownloadInfo) entry.getValue()));
                }
            } catch (JSONException unused) {
            }
            this.f52628c.edit().putString("key_download_info_list", jSONObject.toString()).apply();
        }
    }

    /* renamed from: a */
    private boolean m63938a(C19387c cVar) {
        if (!mo51039b(cVar.mo50995d()) || !this.f52630e.mo51673b(cVar.mo50992a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m63935a(long j, String str) {
        if (this.f52629d.containsKey(Long.valueOf(j))) {
            WebViewDownloadInfo webViewDownloadInfo = (WebViewDownloadInfo) this.f52629d.get(Long.valueOf(j));
            if (webViewDownloadInfo != null) {
                webViewDownloadInfo.mPackageName = str;
            }
            this.f52629d.put(Long.valueOf(j), webViewDownloadInfo);
            m63937a((Map<Long, WebViewDownloadInfo>) this.f52629d);
        }
    }

    /* renamed from: a */
    private static void m63934a(long j, long j2, String str, JSONObject jSONObject) {
        C19490i.m64199a("landing_h5_download_ad", "download_start", true, j, str, j2, jSONObject, 1, false);
        C19490i.m64199a("landing_h5_download_ad", "click_start_detail", true, j, str, j2, jSONObject, 1, false);
    }

    /* renamed from: b */
    public final void mo51484b(Context context, String str, WebViewDownloadInfo webViewDownloadInfo, C19388d dVar, int i) {
        String str2;
        WebViewDownloadInfo webViewDownloadInfo2 = webViewDownloadInfo;
        C19388d dVar2 = dVar;
        boolean z = true;
        if (webViewDownloadInfo2.mAdId <= 0 || TextUtils.isEmpty(webViewDownloadInfo2.mAppName) || TextUtils.isEmpty(webViewDownloadInfo2.mDownloadUrl) || C19491j.m64228i().optInt("download_manage_enable") != 1) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("User-Agent", webViewDownloadInfo2.mUserAgent));
        AppTaskBuilder extra = new AppTaskBuilder(C19491j.m64206a(), webViewDownloadInfo2.mDownloadUrl).name(webViewDownloadInfo2.mAppName).extra(C19517c.m64285a(String.valueOf(webViewDownloadInfo2.mAdId), webViewDownloadInfo2.mExtValue, 0, str, true, null, null, null));
        if (webViewDownloadInfo2.mAdId > 0) {
            str2 = "application/vnd.android.package-archive";
        } else {
            str2 = null;
        }
        AppTaskBuilder chunkStrategy = extra.mimeType(str2).headers(arrayList).packageName(webViewDownloadInfo2.mPackageName).chunkStrategy(new C20281h() {
            /* renamed from: a */
            public final int mo51487a(long j) {
                return 1;
            }
        });
        JSONObject jSONObject = (JSONObject) this.f52631f.remove(webViewDownloadInfo2.mDownloadUrl);
        int a = C19490i.m64190a(false, z, jSONObject, chunkStrategy);
        if (a != 0) {
            C19387c createDownloadModel = WebViewDownloadInfo.createDownloadModel(str, webViewDownloadInfo);
            if (webViewDownloadInfo2.mAdId > 0) {
                m63934a(webViewDownloadInfo2.mAdId, webViewDownloadInfo2.mExtValue, str, jSONObject);
                C19236a aVar = new C19236a(webViewDownloadInfo2.mAdId, webViewDownloadInfo2.mExtValue, str, false, (long) a);
                aVar.f52031j = jSONObject;
                C19444a.m63957a().mo51493a(aVar);
                if (z && dVar2 != null) {
                    dVar2.mo51374a(createDownloadModel, WebViewDownloadInfo.createDownloadController());
                    C19529f.m64362a().mo51653a(createDownloadModel, WebViewDownloadInfo.createDownloadController(), (C19386b) null);
                }
            }
            this.f52630e.mo51665a(i, dVar2, createDownloadModel);
        }
    }

    /* renamed from: a */
    public final Dialog mo51034a(Context context, String str, boolean z, C19387c cVar, C19388d dVar, int i) {
        Context context2 = context;
        C19387c cVar2 = cVar;
        if (context2 == null || TextUtils.isEmpty(cVar.mo50992a())) {
            return null;
        }
        if (m63938a(cVar2)) {
            mo51035a(cVar.mo50995d());
            return null;
        }
        this.f52631f.put(cVar.mo50992a(), cVar.mo51013v());
        final WebViewDownloadInfo webViewDownloadInfo = new WebViewDownloadInfo(cVar.mo50995d(), cVar.mo50996e(), cVar.mo50997f(), cVar.mo50992a(), "", cVar.mo50998g(), str);
        m63936a(webViewDownloadInfo);
        this.f52630e.mo51666a(context2, i, dVar, cVar2);
        if (z) {
            mo51483a(context, cVar.mo51009r(), webViewDownloadInfo, dVar, i);
            return null;
        }
        new StringBuilder("tryStartDownload show dialog appName:").append(cVar.mo50992a());
        C19379h d = C19491j.m64223d();
        C19396a d2 = new C19396a(context2).mo51392a(cVar.mo50997f()).mo51395b("确认要下载此应用吗？").mo51396c("确认").mo51397d("取消");
        final Context context3 = context;
        final C19387c cVar3 = cVar;
        final C19388d dVar2 = dVar;
        final int i2 = i;
        C194401 r0 = new C19397b() {
            /* renamed from: c */
            public final void mo51400c(DialogInterface dialogInterface) {
            }

            /* renamed from: b */
            public final void mo51399b(DialogInterface dialogInterface) {
                dialogInterface.dismiss();
            }

            /* renamed from: a */
            public final void mo51398a(DialogInterface dialogInterface) {
                AdWebViewDownloadManagerImpl.this.mo51483a(context3, cVar3.mo51009r(), webViewDownloadInfo, dVar2, i2);
                dialogInterface.dismiss();
            }
        };
        return d.mo51364a(d2.mo51391a((C19397b) r0).mo51389a(0).mo51394a());
    }
}
