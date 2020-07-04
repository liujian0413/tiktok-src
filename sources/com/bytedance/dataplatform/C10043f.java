package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.dataplatform.p508b.C10038a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.dataplatform.f */
final class C10043f {

    /* renamed from: a */
    private Context f27334a;

    /* renamed from: b */
    private C10044g f27335b;

    /* renamed from: c */
    private Set<String> f27336c;

    /* renamed from: d */
    private Set<String> f27337d = new HashSet();

    /* renamed from: e */
    private String f27338e;

    /* renamed from: f */
    private SharedPreferences f27339f;

    /* renamed from: g */
    private Set<String> f27340g;

    /* renamed from: a */
    public final String mo24687a() {
        StringBuilder sb = new StringBuilder("exposureVids:");
        sb.append(this.f27336c);
        sb.append("  clientExposureVids:");
        sb.append(this.f27337d);
        return sb.toString();
    }

    /* renamed from: b */
    private synchronized void m29842b() {
        String str;
        if (!this.f27336c.isEmpty() || !this.f27337d.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (!this.f27336c.isEmpty()) {
                Iterator it = this.f27336c.iterator();
                sb.append((String) it.next());
                while (it.hasNext()) {
                    sb.append(',');
                    sb.append((String) it.next());
                }
            }
            if (!this.f27337d.isEmpty()) {
                if (!this.f27336c.isEmpty()) {
                    sb.append(',');
                }
                Iterator it2 = this.f27337d.iterator();
                sb.append((String) it2.next());
                while (it2.hasNext()) {
                    sb.append(',');
                    sb.append((String) it2.next());
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, this.f27338e)) {
            this.f27338e = str;
            if (this.f27335b != null) {
                this.f27335b.mo24692a(this.f27338e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo24688a(String str) {
        if (this.f27339f.contains(str)) {
            String string = this.f27339f.getString(str, "");
            if (!this.f27336c.contains(string)) {
                if (!TextUtils.isEmpty(string)) {
                    this.f27336c.add(string);
                    C7285c.m22838a(this.f27334a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f27336c).apply();
                    m29842b();
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized String mo24691b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = this.f27339f.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            for (String str2 : this.f27340g) {
                Context context = this.f27334a;
                StringBuilder sb = new StringBuilder("SP_CLIENT_EXPOSURE_CACHE$$$");
                sb.append(str2);
                SharedPreferences a = C7285c.m22838a(context, sb.toString(), 0);
                Iterator it = a.getAll().keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (TextUtils.equals(str, str3)) {
                            return a.getString(str3, null);
                        }
                    }
                }
            }
            return null;
        } else if (this.f27336c.contains(string)) {
            return string;
        } else {
            return null;
        }
    }

    C10043f(Context context, C10044g gVar) {
        this.f27334a = context;
        this.f27335b = gVar;
        this.f27336c = new HashSet(C7285c.m22838a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", new HashSet()));
        this.f27339f = C7285c.m22838a(context, "SP_EXPERIMENT_EXPOSURE_CACHE", 0);
        this.f27340g = new HashSet(C7285c.m22838a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_CLIENT_EXPOSURE_CACHE", new HashSet()));
        for (String str : this.f27340g) {
            StringBuilder sb = new StringBuilder("SP_CLIENT_EXPOSURE_CACHE$$$");
            sb.append(str);
            for (Object next : C7285c.m22838a(context, sb.toString(), 0).getAll().values()) {
                if (next instanceof String) {
                    String str2 = (String) next;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f27337d.add(str2);
                    }
                }
            }
        }
        m29842b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo24690a(Map<String, String> map, Map<String, Long> map2) {
        Editor edit = this.f27339f.edit();
        edit.clear().apply();
        for (String str : map.keySet()) {
            edit.putString(str, (String) map.get(str));
        }
        edit.apply();
        this.f27336c.retainAll(map.values());
        C7285c.m22838a(this.f27334a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f27336c).apply();
        m29842b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized <T> void mo24689a(String str, C10038a<T> aVar, String str2) {
        if (aVar != null) {
            String str3 = aVar.f27328d;
            if (!this.f27340g.contains(str3)) {
                this.f27340g.add(str3);
                C7285c.m22838a(this.f27334a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_CLIENT_EXPOSURE_CACHE", this.f27340g).apply();
            }
            List asList = Arrays.asList(aVar.f27329e);
            Context context = this.f27334a;
            StringBuilder sb = new StringBuilder("SP_CLIENT_EXPOSURE_CACHE$$$");
            sb.append(str3);
            SharedPreferences a = C7285c.m22838a(context, sb.toString(), 0);
            for (String str4 : a.getAll().keySet()) {
                if (!asList.contains(str4)) {
                    this.f27337d.remove(a.getString(str4, ""));
                    a.edit().remove(str4).apply();
                }
            }
            this.f27337d.add(str2);
            a.edit().putString(str, str2).apply();
            m29842b();
        }
    }
}
