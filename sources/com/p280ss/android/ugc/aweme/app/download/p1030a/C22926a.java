package com.p280ss.android.ugc.aweme.app.download.p1030a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.download.C22933b;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.a.a */
public final class C22926a implements C19385a, C22929c {

    /* renamed from: a */
    public C22932f f60669a;

    /* renamed from: b */
    private Map<String, C19232c> f60670b = new HashMap();

    /* renamed from: c */
    private Map<String, C19388d> f60671c = new HashMap();

    /* renamed from: d */
    private Map<String, JSONObject> f60672d = new HashMap();

    /* renamed from: e */
    private Context f60673e;

    /* renamed from: f */
    private int f60674f = hashCode();

    /* renamed from: com.ss.android.ugc.aweme.app.download.a.a$a */
    class C22927a implements C19388d {

        /* renamed from: b */
        private JSONObject f60676b;

        /* renamed from: c */
        private C19387c f60677c;

        /* renamed from: d */
        private boolean f60678d;

        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
        }

        /* renamed from: b */
        private void m75451b() {
            String a = this.f60677c.mo50992a();
            String p = this.f60677c.mo51007p();
            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(p)) {
                String str = null;
                boolean z = false;
                try {
                    PackageInfo packageInfo = C19491j.m64206a().getPackageManager().getPackageInfo(this.f60677c.mo51010s(), 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionName;
                    }
                } catch (Exception unused) {
                }
                if (C19523h.m64303a(p, str) > 0) {
                    z = true;
                }
                this.f60678d = z;
            }
        }

        /* renamed from: a */
        public final void mo51373a() {
            if (this.f60678d) {
                m75450a("status", "update");
                return;
            }
            m75450a("status", "idle");
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            m75450a("status", "installed");
        }

        /* renamed from: a */
        private void m75450a(String... strArr) {
            if (strArr.length % 2 == 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("message", "success");
                    jSONObject.put("appad", this.f60676b);
                    for (int i = 0; i < strArr.length; i += 2) {
                        jSONObject.put(strArr[i], strArr[i + 1]);
                    }
                    C22926a.this.f60669a.mo59932a("app_ad_event", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            m75450a("status", "download_finished", "total_bytes", String.valueOf(eVar.f52501c), "current_bytes", String.valueOf(eVar.f52502d));
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            m75450a("status", "download_failed", "total_bytes", String.valueOf(eVar.f52501c), "current_bytes", String.valueOf(eVar.f52502d));
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            m75450a("status", "download_paused", "total_bytes", String.valueOf(eVar.f52501c), "current_bytes", String.valueOf(eVar.f52502d));
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            m75450a("status", "download_active", "total_bytes", String.valueOf(eVar.f52501c), "current_bytes", String.valueOf(eVar.f52502d));
        }

        C22927a(C19387c cVar, JSONObject jSONObject) {
            this.f60677c = cVar;
            this.f60676b = jSONObject;
            m75451b();
        }
    }

    /* renamed from: a */
    public final void mo51372a(DownloadInfo downloadInfo, String str) {
    }

    /* renamed from: a */
    public final void mo51371a(DownloadInfo downloadInfo, BaseException baseException, String str) {
        if (baseException != null && this.f60669a != null) {
            try {
                if (this.f60672d.containsKey(downloadInfo.getUrl())) {
                    JSONObject jSONObject = (JSONObject) this.f60672d.get(downloadInfo.getUrl());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", "success");
                    jSONObject2.put("status", "download_failed_reason");
                    jSONObject2.put("appad", jSONObject);
                    jSONObject2.put("error_code", baseException.getErrorCode());
                    jSONObject2.put("error_message", baseException.getErrorMessage());
                    this.f60669a.mo59932a("app_ad_event", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo51370a(DownloadInfo downloadInfo) {
        if (this.f60670b.containsKey(downloadInfo.getUrl())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "success");
                jSONObject.put("appad", this.f60672d.remove(downloadInfo.getUrl()));
                jSONObject.put("status", "cancel_download");
                this.f60669a.mo59932a("app_ad_event", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo59917b() {
        mo59911a();
        C19535g.m64381a(this.f60673e).mo51672b((C19385a) this);
        this.f60670b.clear();
        this.f60671c.clear();
        this.f60672d.clear();
    }

    /* renamed from: c */
    public final void mo59919c() {
        if (this.f60669a != null) {
            try {
                JSONArray a = m75436a(C22933b.m75488a(this.f60673e));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("task_list", a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("method", "get_downloading_task");
                jSONObject2.put("data", jSONObject);
                this.f60669a.mo59932a("app_ad_event", jSONObject2);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    /* renamed from: d */
    public final void mo59920d() {
        if (this.f60669a != null) {
            try {
                JSONArray a = m75436a(C22933b.m75489b(this.f60673e));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("task_list", a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("method", "get_download_pause_task");
                jSONObject2.put("data", jSONObject);
                this.f60669a.mo59932a("app_ad_event", jSONObject2);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo59911a() {
        for (C19232c cVar : this.f60670b.values()) {
            if (cVar != null) {
                C19535g.m64381a(this.f60673e).mo51669a(cVar.mo50992a(), this.f60674f);
            }
        }
    }

    /* renamed from: a */
    public final void mo59916a(JSONArray jSONArray) {
        if (jSONArray != null) {
            new C22928b(this, jSONArray);
        }
    }

    /* renamed from: a */
    private JSONArray m75436a(List<C19387c> list) {
        if (list == null || this.f60672d == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C19387c cVar : list) {
            if (cVar != null && this.f60672d.containsKey(cVar.mo50992a())) {
                jSONArray.put(this.f60672d.get(cVar.mo50992a()));
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final void mo59912a(Context context) {
        for (Entry entry : this.f60670b.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty((CharSequence) entry.getKey()) || entry.getValue() == null)) {
                C19535g.m64381a(this.f60673e).mo51666a(context, this.f60674f, (C19388d) this.f60671c.get(entry.getKey()), (C19387c) entry.getValue());
            }
        }
    }

    public C22926a(Context context, C22932f fVar) {
        this.f60673e = context;
        this.f60669a = fVar;
        DownloaderManagerHolder.m75524a().mo51667a((C19385a) this);
    }

    /* renamed from: b */
    public final void mo59918b(C19232c cVar, JSONObject jSONObject) {
        if (cVar != null && jSONObject != null) {
            C19535g.m64381a(this.f60673e).mo51668a(cVar.mo50992a());
            this.f60672d.put(cVar.mo50992a(), jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo59915a(C19232c cVar, JSONObject jSONObject) {
        if (this.f60669a != null && cVar != null) {
            this.f60670b.remove(cVar.mo50992a());
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                if (this.f60669a != null) {
                    this.f60669a.mo59932a("app_ad_event", jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo59914a(Context context, C19232c cVar, JSONObject jSONObject) {
        if (context != null && this.f60669a != null) {
            C22927a aVar = new C22927a(cVar, jSONObject);
            C19535g.m64381a(this.f60673e).mo51666a(context, this.f60674f, aVar, cVar);
            this.f60670b.put(cVar.mo50992a(), cVar);
            this.f60671c.put(cVar.mo50992a(), aVar);
            this.f60672d.put(cVar.mo50992a(), jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo59913a(Context context, C19232c cVar, C19229b bVar, C19226a aVar, JSONObject jSONObject) {
        if (context != null && cVar != null) {
            if (!this.f60670b.containsKey(cVar.mo50992a())) {
                this.f60670b.put(cVar.mo50992a(), cVar);
                C19535g.m64381a(this.f60673e).mo51666a(context, this.f60674f, null, cVar);
            }
            C19535g.m64381a(this.f60673e).mo51670a(cVar.mo50992a(), cVar.mo50995d(), 2, bVar, aVar);
        }
    }
}
