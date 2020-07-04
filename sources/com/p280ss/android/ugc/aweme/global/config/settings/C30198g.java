package com.p280ss.android.ugc.aweme.global.config.settings;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.C10294b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.g */
final class C30198g implements C10294b {

    /* renamed from: a */
    private boolean f79458a;

    /* renamed from: b */
    private boolean f79459b = false;

    /* renamed from: c */
    private Map<String, Object> f79460c = new HashMap();

    /* renamed from: d */
    private SharedPreferences f79461d;

    /* renamed from: e */
    private C30195c f79462e;

    C30198g() {
        m98855b();
        this.f79462e = new C30195c();
    }

    /* renamed from: a */
    private SharedPreferences m98854a() {
        if (this.f79461d == null) {
            this.f79461d = C7285c.m22838a(AwemeApplication.m21341a(), "settings-mock", 0);
        }
        return this.f79461d;
    }

    /* renamed from: b */
    private void m98855b() {
        if (!this.f79458a && this.f79459b) {
            this.f79458a = true;
            this.f79460c.putAll(m98854a().getAll());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo76687a(boolean z) {
        this.f79459b = z;
        m98855b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final <T> void mo76688b(String str, Class<T> cls, T t) {
        this.f79460c.put(str, t);
        m98856c(str, cls, t);
    }

    /* renamed from: a */
    public final <T> T mo25017a(String str, Class<T> cls, T t) {
        if (!this.f79459b) {
            return this.f79462e.mo25017a(str, cls, t);
        }
        T t2 = this.f79460c.get(str);
        if (t2 == null) {
            return this.f79462e.mo25017a(str, cls, t);
        }
        return t2;
    }

    /* renamed from: c */
    private <T> void m98856c(String str, Class<T> cls, T t) {
        Editor edit = m98854a().edit();
        if (t instanceof String) {
            edit.putString(str, (String) t);
        } else if (t instanceof Integer) {
            edit.putInt(str, ((Integer) t).intValue());
        } else if (t instanceof Float) {
            edit.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Long) {
            edit.putLong(str, ((Long) t).longValue());
        } else if (t instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Set) {
            edit.putStringSet(str, (Set) t);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final <T> List<T> mo25018a(String str, Class<T> cls, List<T> list) {
        if (!this.f79459b) {
            return this.f79462e.mo25018a(str, cls, list);
        }
        Object obj = this.f79460c.get(str);
        if (obj == null) {
            return this.f79462e.mo25018a(str, cls, list);
        }
        return (List) obj;
    }
}
