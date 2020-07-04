package com.bytedance.apm.p240d;

import com.bytedance.apm.core.C6177b;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.apm.p246i.C6215a;
import com.bytedance.apm.p246i.C6216b;
import com.bytedance.apm.p468e.C9596a;
import com.bytedance.apm.util.C6291h;
import com.bytedance.apm.util.C9652p;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d.b */
public final class C6186b {

    /* renamed from: a */
    public List<String> f18195a;

    /* renamed from: b */
    public List<String> f18196b;

    /* renamed from: c */
    public List<String> f18197c;

    /* renamed from: d */
    public final boolean f18198d;

    /* renamed from: e */
    public final boolean f18199e;

    /* renamed from: f */
    public final boolean f18200f;

    /* renamed from: g */
    public final boolean f18201g;

    /* renamed from: h */
    public final long f18202h;

    /* renamed from: i */
    public final boolean f18203i;

    /* renamed from: j */
    public final boolean f18204j;

    /* renamed from: k */
    public final boolean f18205k;

    /* renamed from: l */
    public final JSONObject f18206l;

    /* renamed from: m */
    public final C6177b f18207m;

    /* renamed from: n */
    public final IHttpService f18208n;

    /* renamed from: o */
    public final Set<Object> f18209o;

    /* renamed from: p */
    public final long f18210p;

    /* renamed from: q */
    public final C6216b f18211q;

    /* renamed from: r */
    public final C6215a f18212r;

    /* renamed from: s */
    public final ExecutorService f18213s;

    /* renamed from: com.bytedance.apm.d.b$a */
    public static final class C6187a {

        /* renamed from: a */
        boolean f18214a;

        /* renamed from: b */
        boolean f18215b;

        /* renamed from: c */
        long f18216c;

        /* renamed from: d */
        boolean f18217d;

        /* renamed from: e */
        boolean f18218e;

        /* renamed from: f */
        boolean f18219f;

        /* renamed from: g */
        boolean f18220g;

        /* renamed from: h */
        boolean f18221h;

        /* renamed from: i */
        List<String> f18222i;

        /* renamed from: j */
        List<String> f18223j;

        /* renamed from: k */
        List<String> f18224k;

        /* renamed from: l */
        JSONObject f18225l;

        /* renamed from: m */
        C6177b f18226m;

        /* renamed from: n */
        IHttpService f18227n;

        /* renamed from: o */
        Set<Object> f18228o;

        /* renamed from: p */
        long f18229p;

        /* renamed from: q */
        C6216b f18230q;

        /* renamed from: r */
        C6215a f18231r;

        /* renamed from: s */
        ExecutorService f18232s;

        /* renamed from: a */
        public final C6187a mo14908a(boolean z) {
            this.f18227n = new DefaultTTNetImpl();
            return this;
        }

        /* renamed from: a */
        public final C6186b mo14909a() {
            C9652p.m28544a(this.f18225l.optString("aid"), "aid");
            C9652p.m28545b(this.f18225l.optString("app_version"), "app_version");
            C9652p.m28545b(this.f18225l.optString("update_version_code"), "update_version_code");
            C9652p.m28545b(this.f18225l.optString("device_id"), "device_id");
            return new C6186b(this);
        }

        C6187a() {
            this.f18219f = true;
            this.f18222i = C9596a.f26218a;
            this.f18223j = C9596a.f26221d;
            this.f18224k = C9596a.f26224g;
            this.f18225l = new JSONObject();
            this.f18228o = new HashSet();
            this.f18229p = 20;
            this.f18216c = 2500;
        }

        /* renamed from: a */
        public final C6187a mo14902a(C6177b bVar) {
            this.f18226m = bVar;
            return this;
        }

        /* renamed from: b */
        public final C6187a mo14911b(List<String> list) {
            this.f18224k = list;
            return this;
        }

        /* renamed from: c */
        public final C6187a mo14913c(List<String> list) {
            this.f18222i = list;
            return this;
        }

        /* renamed from: b */
        public final C6187a mo14910b(String str) {
            return m19187a("app_version", str);
        }

        /* renamed from: c */
        public final C6187a mo14912c(String str) {
            return m19187a("update_version_code", str);
        }

        /* renamed from: d */
        public final C6187a mo14914d(String str) {
            return m19187a("channel", str);
        }

        /* renamed from: a */
        public final C6187a mo14900a(int i) {
            return m19186a("aid", i);
        }

        /* renamed from: a */
        public final C6187a mo14901a(long j) {
            this.f18229p = 60;
            return this;
        }

        C6187a(C6186b bVar) {
            this.f18219f = true;
            this.f18222i = bVar.f18195a;
            this.f18223j = bVar.f18196b;
            this.f18224k = bVar.f18197c;
            this.f18215b = bVar.f18201g;
            this.f18216c = bVar.f18202h;
            this.f18217d = bVar.f18203i;
            this.f18220g = bVar.f18200f;
            this.f18221h = bVar.f18204j;
            this.f18225l = bVar.f18206l;
            this.f18226m = bVar.f18207m;
            this.f18227n = bVar.f18208n;
            this.f18231r = bVar.f18212r;
        }

        /* renamed from: a */
        public final C6187a mo14903a(C6215a aVar) {
            this.f18231r = aVar;
            return this;
        }

        /* renamed from: a */
        public final C6187a mo14904a(C6216b bVar) {
            this.f18230q = bVar;
            return this;
        }

        /* renamed from: a */
        public final C6187a mo14905a(String str) {
            return m19187a("device_id", str);
        }

        /* renamed from: a */
        public final C6187a mo14906a(List<String> list) {
            this.f18223j = list;
            return this;
        }

        /* renamed from: a */
        public final C6187a mo14907a(JSONObject jSONObject) {
            try {
                C6291h.m19518a(this.f18225l, jSONObject);
                return this;
            } catch (JSONException unused) {
                return this;
            }
        }

        /* renamed from: a */
        private C6187a m19186a(String str, int i) {
            try {
                this.f18225l.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        private C6187a m19187a(String str, String str2) {
            try {
                this.f18225l.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C6187a m19184a() {
        return new C6187a();
    }

    /* renamed from: a */
    public static C6187a m19185a(C6186b bVar) {
        return new C6187a(bVar);
    }

    private C6186b(C6187a aVar) {
        this.f18206l = aVar.f18225l;
        this.f18205k = aVar.f18214a;
        this.f18207m = aVar.f18226m;
        this.f18195a = aVar.f18222i;
        this.f18208n = aVar.f18227n;
        this.f18199e = aVar.f18219f;
        this.f18198d = aVar.f18218e;
        this.f18201g = aVar.f18215b;
        this.f18202h = aVar.f18216c;
        this.f18204j = aVar.f18221h;
        this.f18209o = aVar.f18228o;
        this.f18196b = aVar.f18223j;
        this.f18197c = aVar.f18224k;
        this.f18210p = aVar.f18229p;
        this.f18203i = aVar.f18217d;
        this.f18200f = aVar.f18220g;
        this.f18212r = aVar.f18231r;
        this.f18211q = aVar.f18230q;
        this.f18213s = aVar.f18232s;
    }
}
