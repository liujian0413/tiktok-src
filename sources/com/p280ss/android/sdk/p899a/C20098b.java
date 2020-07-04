package com.p280ss.android.sdk.p899a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.account.C18892b;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.a.b */
public final class C20098b {

    /* renamed from: b */
    private static volatile C20098b f54360b = new C20098b();

    /* renamed from: a */
    public final C20099c[] f54361a = C20099c.f54365b;

    /* renamed from: c */
    private final C20099c[] f54362c = C20099c.f54364a;

    /* renamed from: d */
    private boolean f54363d;

    /* renamed from: a */
    public static C20098b m66270a() {
        return f54360b;
    }

    private C20098b() {
    }

    /* renamed from: b */
    public final boolean mo53820b() {
        m66272c(C21084a.f56601a);
        for (C20099c cVar : this.f54361a) {
            if (cVar.f54379p) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53817a(Context context) {
        for (C20099c cVar : this.f54361a) {
            cVar.f54379p = false;
        }
        m66271b(context);
    }

    /* renamed from: b */
    private void m66271b(Context context) {
        C20099c[] cVarArr;
        C20099c[] cVarArr2;
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            for (C20099c cVar : this.f54361a) {
                if (cVar.f54385v > 0) {
                    try {
                        jSONObject.put(cVar.f54376m, cVar.f54385v);
                    } catch (JSONException unused) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C20099c cVar2 : this.f54361a) {
                if (cVar2.f54379p) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(cVar2.f54376m);
                    z = false;
                }
            }
            String sb2 = sb.toString();
            Editor edit = C7285c.m22838a(context, "com.ss.spipe_setting", 0).edit();
            edit.putString("expire_platforms", jSONObject.toString());
            edit.putString("bind_platforms", sb2);
            C9721b.m28656a(edit);
        }
    }

    /* renamed from: c */
    private void m66272c(Context context) {
        JSONObject jSONObject;
        C20099c[] cVarArr;
        C20099c[] cVarArr2;
        if (!this.f54363d && context != null) {
            this.f54363d = true;
            SharedPreferences a = C7285c.m22838a(context, "com.ss.spipe_setting", 0);
            try {
                HashMap hashMap = new HashMap();
                String string = a.getString("expire_platforms", null);
                String string2 = a.getString("bind_platforms", "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(string);
                }
                for (C20099c cVar : this.f54361a) {
                    if (!jSONObject.isNull(cVar.f54376m)) {
                        cVar.f54385v = jSONObject.optLong(cVar.f54376m, -1);
                    }
                }
                hashMap.clear();
                if (!TextUtils.isEmpty(string2)) {
                    String[] split = string2.split(",");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            hashMap.put(str, str);
                        }
                        for (C20099c cVar2 : this.f54361a) {
                            if (hashMap.containsKey(cVar2.f54376m)) {
                                cVar2.f54379p = true;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53819a(String str) {
        C20099c[] cVarArr;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m66272c(C21084a.f56601a);
        for (C20099c cVar : this.f54362c) {
            if (cVar.f54379p && !TextUtils.isEmpty(cVar.f54376m) && cVar.f54376m.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C18894a m66269a(C18892b bVar, C20099c cVar) {
        if (bVar == null || cVar == null) {
            return null;
        }
        if (cVar.f54377n == null || cVar.f54377n.length == 0) {
            return (C18894a) bVar.mo31366b().get(cVar.f54376m);
        }
        for (String str : cVar.f54377n) {
            C18894a aVar = (C18894a) bVar.mo31366b().get(str);
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo53818a(C18892b bVar, Context context) {
        C20099c[] cVarArr;
        for (C20099c cVar : this.f54362c) {
            cVar.f54379p = false;
            C18894a a = m66269a(bVar, cVar);
            if (a != null) {
                cVar.f54379p = true;
                cVar.f54383t = a.f50933i;
                cVar.f54384u = a.f50934j;
                cVar.f54380q = a.f50929e;
                cVar.f54381r = a.f50930f;
                cVar.f54382s = a.f50931g;
                cVar.f54385v = -1;
            }
        }
        m66271b(context);
    }
}
