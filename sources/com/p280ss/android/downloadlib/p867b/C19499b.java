package com.p280ss.android.downloadlib.p867b;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.p864b.C19464c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.b.b */
public class C19499b {

    /* renamed from: a */
    private static volatile C19499b f52790a;

    /* renamed from: b */
    private SharedPreferences f52791b = C7285c.m22838a(C19491j.m64206a(), "sp_download_finish_cache", 0);

    /* renamed from: c */
    private final Map<Long, C19464c> f52792c = new ConcurrentHashMap();

    private C19499b() {
        m64259b();
    }

    /* renamed from: a */
    public static C19499b m64258a() {
        if (f52790a == null) {
            synchronized (C19499b.class) {
                if (f52790a == null) {
                    f52790a = new C19499b();
                }
            }
        }
        return f52790a;
    }

    /* renamed from: b */
    private void m64259b() {
        String string = this.f52791b.getString("key_download_finish", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        C19464c cVar = new C19464c();
                        cVar.mo51534a(jSONObject);
                        this.f52792c.put(cVar.f52704a, cVar);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m64260c() {
        if (this.f52792c != null) {
            JSONArray jSONArray = new JSONArray();
            for (Entry value : this.f52792c.entrySet()) {
                try {
                    jSONArray.put(((C19464c) value.getValue()).mo51533a());
                } catch (Exception unused) {
                    return;
                }
            }
            this.f52791b.edit().putString("key_download_finish", jSONArray.toString()).apply();
        }
    }

    /* renamed from: a */
    public final void mo51607a(Long l) {
        if (this.f52792c != null) {
            this.f52792c.remove(l);
        }
    }

    /* renamed from: b */
    public final boolean mo51609b(Long l, String str) {
        C19464c cVar = (C19464c) this.f52792c.get(l);
        if (cVar == null || !TextUtils.equals(str, cVar.f52705b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51608a(Long l, String str) {
        C19464c cVar = (C19464c) this.f52792c.get(l);
        if (cVar == null) {
            cVar = new C19464c(l, str);
        } else {
            cVar.f52705b = str;
        }
        this.f52792c.put(l, cVar);
        m64260c();
    }
}
