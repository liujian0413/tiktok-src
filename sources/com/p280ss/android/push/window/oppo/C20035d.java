package com.p280ss.android.push.window.oppo;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.d */
public class C20035d {

    /* renamed from: a */
    private static C20035d f54218a;

    /* renamed from: b */
    private Context f54219b;

    /* renamed from: c */
    private C20024b<Integer, C20036a> f54220c = new C20024b<>(2);

    /* renamed from: com.ss.android.push.window.oppo.d$a */
    public static class C20036a {

        /* renamed from: a */
        public int f54221a;

        /* renamed from: b */
        public int f54222b;

        /* renamed from: c */
        public String f54223c;

        /* renamed from: d */
        public int f54224d;

        /* renamed from: e */
        public String f54225e;

        /* renamed from: a */
        public final JSONObject mo53637a() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f54221a > 0) {
                    if (!C6319n.m19593a(this.f54223c)) {
                        jSONObject.put("id", this.f54221a);
                        jSONObject.put("type", this.f54222b);
                        jSONObject.put("obj", this.f54223c);
                        jSONObject.put("from", this.f54224d);
                        jSONObject.put("extra", this.f54225e);
                        return jSONObject;
                    }
                }
                return jSONObject;
            } catch (Throwable unused) {
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageObj{id=");
            sb.append(this.f54221a);
            sb.append(", type=");
            sb.append(this.f54222b);
            sb.append(", obj='");
            sb.append(this.f54223c);
            sb.append('\'');
            sb.append(", from=");
            sb.append(this.f54224d);
            sb.append(", extra='");
            sb.append(this.f54225e);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo53638a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    this.f54221a = jSONObject.optInt("id");
                    this.f54222b = jSONObject.optInt("type");
                    this.f54223c = jSONObject.optString("obj");
                    this.f54224d = jSONObject.optInt("from");
                    this.f54225e = jSONObject.optString("extra");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m65986b() {
        try {
            String a = C20025c.m65972e().mo53606a(this.f54219b, "pop_window_message_cache_list", "");
            if (!C6319n.m19593a(a)) {
                JSONArray jSONArray = new JSONArray(a);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    C20036a aVar = new C20036a();
                    aVar.mo53638a(optJSONObject);
                    this.f54220c.mo53610a(Integer.valueOf(aVar.f54221a), aVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m65987c() {
        try {
            JSONArray jSONArray = new JSONArray();
            Map b = this.f54220c.mo53612b();
            if (!b.isEmpty()) {
                for (Entry entry : b.entrySet()) {
                    if (entry != null) {
                        jSONArray.put(((C20036a) entry.getValue()).mo53637a());
                    }
                }
            }
            String jSONArray2 = jSONArray.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("pop_window_message_cache_list", jSONArray2);
            C20025c.m65972e().mo53608a(this.f54219b, hashMap);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final List<C20036a> mo53634a() {
        LinkedList linkedList = new LinkedList();
        if (!C20025c.m65968a(this.f54219b).f54196k) {
            this.f54220c.mo53611a();
            return linkedList;
        }
        Map b = this.f54220c.mo53612b();
        if (b.isEmpty()) {
            return linkedList;
        }
        for (Entry entry : b.entrySet()) {
            if (entry != null) {
                linkedList.add(entry.getValue());
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public static C20035d m65985a(Context context) {
        if (f54218a == null) {
            synchronized (C20035d.class) {
                if (f54218a == null) {
                    f54218a = new C20035d(context);
                }
            }
        }
        return f54218a;
    }

    private C20035d(Context context) {
        this.f54219b = context.getApplicationContext();
        this.f54220c = new C20024b<>(C20025c.m65968a(context).f54195j);
        m65986b();
    }

    /* renamed from: a */
    public final void mo53635a(int i) {
        if (!C20025c.m65968a(this.f54219b).f54196k) {
            this.f54220c.mo53611a();
        } else if (i > 0) {
            this.f54220c.mo53609a(Integer.valueOf(i));
            m65987c();
        }
    }

    /* renamed from: a */
    public final void mo53636a(int i, String str, int i2, String str2) {
        if (!C20025c.m65968a(this.f54219b).f54196k) {
            this.f54220c.mo53611a();
        } else if (!C6319n.m19593a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("id", 0);
                if (optInt > 0 && jSONObject.optInt("pass_through", 1) > 0) {
                    C20036a aVar = new C20036a();
                    aVar.f54221a = optInt;
                    aVar.f54222b = 1;
                    aVar.f54223c = str;
                    aVar.f54224d = i2;
                    aVar.f54225e = str2;
                    this.f54220c.mo53610a(Integer.valueOf(optInt), aVar);
                    m65987c();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
