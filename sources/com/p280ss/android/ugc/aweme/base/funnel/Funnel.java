package com.p280ss.android.ugc.aweme.base.funnel;

import android.content.Context;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.funnel.Funnel */
public final class Funnel {

    /* renamed from: e */
    private static final C6600e f61415e = new C6600e();

    /* renamed from: f */
    private static final Type f61416f = new C6597a<Map<String, Map<String, Long>>>() {
    }.type;

    /* renamed from: a */
    private final String f61417a;

    /* renamed from: b */
    private Context f61418b;

    /* renamed from: c */
    private Lifetime f61419c;

    /* renamed from: d */
    private final String f61420d;

    /* renamed from: g */
    private Map<String, Long> f61421g;

    /* renamed from: h */
    private Map<String, Long> f61422h;

    /* renamed from: i */
    private Map<String, Long> f61423i;

    /* renamed from: j */
    private Map<String, Map<String, Long>> f61424j;

    /* renamed from: com.ss.android.ugc.aweme.base.funnel.Funnel$Lifetime */
    public enum Lifetime {
        PERSISTENT,
        APP_ALIVE
    }

    /* renamed from: b */
    public final synchronized JSONObject mo60637b() throws JSONException {
        return new JSONObject(mo60636a());
    }

    /* renamed from: a */
    public final synchronized String mo60636a() {
        return f61415e.mo15979b((Object) this.f61424j);
    }

    /* renamed from: b */
    private C23339g m76589b(String str) {
        return C23337e.m76561a(this.f61418b, str);
    }

    /* renamed from: a */
    public final synchronized Funnel mo60635a(String str) {
        return m76588a(str, 1);
    }

    public Funnel(Context context, String str) {
        this(context, str, Lifetime.PERSISTENT);
    }

    /* renamed from: a */
    private synchronized Funnel m76588a(String str, long j) {
        Long l;
        Long l2 = (Long) this.f61421g.get(str);
        if (l2 == null) {
            l = Long.valueOf(1);
        } else {
            l = Long.valueOf(l2.longValue() + 1);
        }
        this.f61421g.put(str, l);
        if (this.f61419c == Lifetime.PERSISTENT) {
            m76589b(this.f61420d).mo60632b("raw", mo60636a());
        }
        return this;
    }

    private Funnel(Context context, String str, Lifetime lifetime) {
        this.f61421g = new LinkedHashMap();
        this.f61422h = new ArrayMap();
        this.f61423i = new LinkedHashMap();
        this.f61424j = new ArrayMap();
        this.f61424j.put("events", this.f61421g);
        this.f61424j.put("durations", this.f61423i);
        this.f61418b = context.getApplicationContext();
        this.f61417a = str;
        this.f61419c = lifetime;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_funnel");
            this.f61420d = sb.toString();
            switch (lifetime) {
                case PERSISTENT:
                    Map map = (Map) f61415e.mo15975a(m76589b(this.f61420d).mo60623a("raw", ""), f61416f);
                    if (map != null) {
                        for (Entry entry : map.entrySet()) {
                            Map map2 = (Map) this.f61424j.get(entry.getKey());
                            if (!(map2 == null || entry.getValue() == null)) {
                                map2.putAll((Map) entry.getValue());
                            }
                        }
                        return;
                    }
                    break;
                case APP_ALIVE:
                    m76589b(this.f61420d).mo60625a();
                    break;
            }
            return;
        }
        throw new IllegalArgumentException("name is null");
    }
}
