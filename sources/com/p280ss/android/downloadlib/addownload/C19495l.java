package com.p280ss.android.downloadlib.addownload;

import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.l */
public final class C19495l {

    /* renamed from: a */
    private static final C19496a<Integer, C19495l> f52783a = new C19496a<>(4, 4);

    /* renamed from: b */
    private static final C19495l f52784b = new C19495l(null);

    /* renamed from: c */
    private final JSONObject f52785c;

    /* renamed from: d */
    private final JSONObject f52786d = C19491j.m64228i();

    /* renamed from: e */
    private final JSONObject f52787e;

    /* renamed from: com.ss.android.downloadlib.addownload.l$a */
    static class C19496a<K, T> extends LinkedHashMap<K, T> {

        /* renamed from: a */
        private final int f52788a = 4;

        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry<K, T> entry) {
            if (size() > this.f52788a) {
                return true;
            }
            return false;
        }

        C19496a(int i, int i2) {
            super(4, 0.75f, true);
        }
    }

    /* renamed from: a */
    public static C19495l m64242a() {
        return f52784b;
    }

    /* renamed from: b */
    public final C20280g mo51599b() {
        if (this.f52785c == null || !this.f52785c.has("download_chunk_config") || m64248e("download_chunk_config")) {
            return null;
        }
        return C19475e.m64075c(this);
    }

    /* renamed from: a */
    public final String mo51598a(String str) {
        return m64245a(str, "");
    }

    /* renamed from: e */
    private boolean m64248e(String str) {
        if (this.f52787e == null || this.f52787e.optInt(str, 0) == 0) {
            return false;
        }
        return true;
    }

    private C19495l(JSONObject jSONObject) {
        this.f52785c = jSONObject;
        if (jSONObject != null) {
            this.f52787e = this.f52786d.optJSONObject("disable_task_keys");
        } else {
            this.f52787e = null;
        }
    }

    /* renamed from: c */
    public final boolean mo51601c(String str) {
        if (this.f52785c == null || m64248e(str)) {
            return this.f52786d.has(str);
        }
        return this.f52785c.has(str);
    }

    /* renamed from: d */
    public final C20281h mo51602d(String str) {
        if (this.f52785c == null || !this.f52785c.has("download_chunk_config") || m64248e("download_chunk_config")) {
            return C19475e.m64073a(str);
        }
        return C19475e.m64074b(this);
    }

    /* renamed from: a */
    public static C19495l m64243a(int i) {
        if (C19491j.m64238s()) {
            return f52784b;
        }
        C19495l lVar = (C19495l) f52783a.get(Integer.valueOf(i));
        if (lVar != null) {
            return lVar;
        }
        C19495l b = m64247b(i);
        synchronized (f52783a) {
            f52783a.put(Integer.valueOf(i), b);
        }
        return b;
    }

    /* renamed from: b */
    public final Object mo51600b(String str) {
        if (this.f52785c == null || !this.f52785c.has(str) || m64248e(str)) {
            return this.f52786d.opt(str);
        }
        return this.f52785c.opt(str);
    }

    /* renamed from: a */
    static C19495l m64244a(JSONObject jSONObject) {
        if (jSONObject == null || C19491j.m64238s()) {
            return f52784b;
        }
        synchronized (f52783a) {
            for (C19495l lVar : f52783a.values()) {
                if (lVar.f52785c == jSONObject) {
                    return lVar;
                }
            }
            return new C19495l(jSONObject);
        }
    }

    /* renamed from: b */
    private static C19495l m64247b(int i) {
        if (C19491j.m64238s()) {
            return f52784b;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(C19491j.m64206a()).getDownloadInfo(i);
        if (downloadInfo != null) {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                JSONObject jSONObject = null;
                try {
                    String optString = new JSONObject(extra).optString("download_settings_json", "");
                    if (!TextUtils.isEmpty(optString)) {
                        jSONObject = new JSONObject(optString);
                    }
                } catch (Exception unused) {
                }
                if (jSONObject != null) {
                    return new C19495l(jSONObject);
                }
            }
        }
        return f52784b;
    }

    /* renamed from: a */
    private String m64245a(String str, String str2) {
        if (this.f52785c == null || !this.f52785c.has(str) || m64248e(str)) {
            return this.f52786d.optString(str, str2);
        }
        return this.f52785c.optString(str, str2);
    }

    /* renamed from: a */
    static void m64246a(int i, C19495l lVar) {
        if (!C19491j.m64238s()) {
            synchronized (f52783a) {
                f52783a.put(Integer.valueOf(i), lVar);
            }
        }
    }

    /* renamed from: a */
    public final int mo51596a(String str, int i) {
        if (this.f52785c == null || !this.f52785c.has(str) || m64248e(str)) {
            return this.f52786d.optInt(str, i);
        }
        return this.f52785c.optInt(str, i);
    }

    /* renamed from: a */
    public final long mo51597a(String str, long j) {
        if (this.f52785c == null || !this.f52785c.has(str) || m64248e(str)) {
            return this.f52786d.optLong(str, j);
        }
        return this.f52785c.optLong(str, j);
    }
}
