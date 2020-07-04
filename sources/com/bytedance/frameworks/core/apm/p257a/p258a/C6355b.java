package com.bytedance.frameworks.core.apm.p257a.p258a;

import android.content.ContentValues;
import com.bytedance.apm.p245h.C6212a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6353b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.b */
public final class C6355b extends C6354a<C6212a> {
    /* renamed from: d */
    public final String mo15247d() {
        return "t_apiall";
    }

    /* renamed from: e */
    public final String[] mo15248e() {
        return new String[]{"_id", "type", "version_id", "data", "hit_rules"};
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo15239a(Object obj) {
        return m19729a((C6212a) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15249a(C6353b bVar) {
        return m19730b(bVar);
    }

    /* renamed from: b */
    private static C6212a m19730b(C6353b bVar) {
        long a = bVar.mo15250a("_id");
        String c = bVar.mo15252c("type");
        long a2 = bVar.mo15250a("version_id");
        String c2 = bVar.mo15252c("data");
        int b = bVar.mo15251b("hit_rules");
        try {
            JSONObject jSONObject = new JSONObject(c2);
            jSONObject.put("hit_rules", b);
            C6212a aVar = new C6212a(a, c, a2, jSONObject);
            return aVar;
        } catch (JSONException unused) {
            C6212a aVar2 = new C6212a(a, c, a2, c2);
            return aVar2;
        }
    }

    /* renamed from: a */
    private static ContentValues m19729a(C6212a aVar) {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", aVar.f18294g);
        contentValues.put("type2", aVar.f18295h);
        contentValues.put("timestamp", Long.valueOf(aVar.f18298k));
        contentValues.put("version_id", Long.valueOf(aVar.f18297j));
        String str2 = "data";
        if (aVar.f18296i == null) {
            str = "";
        } else {
            str = aVar.f18296i.toString();
        }
        contentValues.put(str2, str);
        contentValues.put("is_sampled", Integer.valueOf(aVar.f18299l ? 1 : 0));
        contentValues.put("hit_rules", Integer.valueOf(aVar.f18291d));
        contentValues.put("front", Integer.valueOf(aVar.f18288a));
        contentValues.put("sid", Long.valueOf(aVar.f18290c));
        contentValues.put("network_type", Integer.valueOf(aVar.f18289b));
        contentValues.put("traffic_value", Long.valueOf(aVar.f18292e));
        return contentValues;
    }
}
