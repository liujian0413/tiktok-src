package com.facebook.internal.p729a.p730a;

import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.internal.C13967z;
import com.facebook.internal.p729a.C13869b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.a.b */
public final class C13868b {

    /* renamed from: a */
    private String f36739a;

    /* renamed from: b */
    private String f36740b;

    /* renamed from: c */
    private String f36741c;

    /* renamed from: d */
    private String f36742d;

    /* renamed from: e */
    private Long f36743e;

    /* renamed from: c */
    public final void mo33504c() {
        C13869b.m40959a(this.f36739a);
    }

    /* renamed from: a */
    public final boolean mo33502a() {
        if (this.f36742d == null || this.f36743e == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSONObject d = m40950d();
        if (d == null) {
            return null;
        }
        return d.toString();
    }

    /* renamed from: b */
    public final void mo33503b() {
        if (mo33502a()) {
            C13869b.m40957a(this.f36739a, toString());
        }
    }

    /* renamed from: d */
    private JSONObject m40950d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            if (this.f36740b != null) {
                jSONObject.put("app_version", this.f36740b);
            }
            if (this.f36743e != null) {
                jSONObject.put("timestamp", this.f36743e);
            }
            if (this.f36741c != null) {
                jSONObject.put("reason", this.f36741c);
            }
            if (this.f36742d != null) {
                jSONObject.put("callstack", this.f36742d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo33501a(C13868b bVar) {
        if (this.f36743e == null) {
            return -1;
        }
        if (bVar.f36743e == null) {
            return 1;
        }
        return bVar.f36743e.compareTo(this.f36743e);
    }

    public C13868b(File file) {
        this.f36739a = file.getName();
        JSONObject a = C13869b.m40956a(this.f36739a, true);
        if (a != null) {
            this.f36740b = a.optString("app_version", null);
            this.f36741c = a.optString("reason", null);
            this.f36742d = a.optString("callstack", null);
            this.f36743e = Long.valueOf(a.optLong("timestamp", 0));
        }
    }

    public C13868b(Throwable th) {
        this.f36740b = C13967z.m41217a();
        this.f36741c = C13869b.m40955a(th);
        this.f36742d = C13869b.m40962b(th);
        this.f36743e = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer("crash_log_");
        stringBuffer.append(this.f36743e.toString());
        stringBuffer.append(".json");
        this.f36739a = stringBuffer.toString();
    }
}
