package com.p280ss.android.ugc.aweme.feed.p1229e;

import android.content.SharedPreferences;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.p854d.C19294c;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.e.a */
public class C28300a {

    /* renamed from: a */
    private static final String f74596a = "a";

    /* renamed from: b */
    private static final Comparator<C28303a> f74597b = new Comparator<C28303a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m93100a((C28303a) obj, (C28303a) obj2);
        }

        /* renamed from: a */
        private static int m93100a(C28303a aVar, C28303a aVar2) {
            if (aVar.f74604b == aVar2.f74604b) {
                return 0;
            }
            if (aVar.f74604b > aVar2.f74604b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: c */
    private static C19294c<C28300a> f74598c = new C19294c<C28300a>() {
        /* renamed from: c */
        private static C28300a m93101c() {
            return new C28300a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo29755a() {
            return m93101c();
        }
    };

    /* renamed from: d */
    private final SharedPreferences f74599d;

    /* renamed from: e */
    private List<C28303a> f74600e;

    /* renamed from: f */
    private long f74601f;

    /* renamed from: g */
    private long f74602g;

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$a */
    static class C28303a {

        /* renamed from: a */
        String f74603a;

        /* renamed from: b */
        long f74604b;

        private C28303a() {
        }

        public final int hashCode() {
            return super.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final JSONObject mo71996a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", this.f74603a);
                jSONObject.put("time", this.f74604b);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* renamed from: a */
        static C28303a m93103a(JSONObject jSONObject) {
            C28303a aVar = new C28303a();
            aVar.f74603a = jSONObject.optString("aid", "");
            aVar.f74604b = jSONObject.optLong("time", 0);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C28303a) || !C6319n.m19594a(((C28303a) obj).f74603a, this.f74603a)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C28300a m93094a() {
        return (C28300a) f74598c.mo51193b();
    }

    /* renamed from: c */
    private void m93097c() {
        JSONArray jSONArray = new JSONArray();
        for (C28303a a : this.f74600e) {
            jSONArray.put(a.mo71996a());
        }
        this.f74599d.edit().putString("push_list", jSONArray.toString()).apply();
    }

    private C28300a() {
        this.f74600e = new ArrayList();
        this.f74601f = 604800000;
        this.f74599d = C7285c.m22838a(C29960a.m98230a(), "app_push_info", 0);
        String string = this.f74599d.getString("push_list", "[]");
        this.f74600e.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        C28303a a = C28303a.m93103a(optJSONObject);
                        if (!this.f74600e.contains(a)) {
                            this.f74600e.add(a);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: b */
    private boolean m93096b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis - this.f74602g <= DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            return false;
        }
        this.f74602g = currentTimeMillis;
        Collections.sort(this.f74600e, f74597b);
        int size = this.f74600e.size() - 1;
        while (size >= 0) {
            C28303a aVar = (C28303a) this.f74600e.get(size);
            if (aVar != null) {
                if (currentTimeMillis <= this.f74601f + aVar.f74604b) {
                    break;
                }
                this.f74600e.remove(size);
                size--;
                z = true;
            }
        }
        if (z) {
            m93097c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo71993a(String str) {
        m93095a(str, System.currentTimeMillis());
    }

    /* renamed from: a */
    private void m93095a(String str, long j) {
        if (!C6319n.m19593a(str)) {
            C28303a aVar = new C28303a();
            aVar.f74604b = j;
            aVar.f74603a = str;
            synchronized (this) {
                if (!this.f74600e.contains(aVar)) {
                    this.f74600e.add(aVar);
                }
                if (!m93096b()) {
                    m93097c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71994a(List<Aweme> list, String str) {
        if (list != null) {
            synchronized (this) {
                m93096b();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    if (aweme != null && !C6319n.m19594a(str, aweme.getAid())) {
                        for (C28303a aVar : this.f74600e) {
                            if (aVar != null && C6319n.m19594a(aVar.f74603a, aweme.getAid())) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
    }
}
