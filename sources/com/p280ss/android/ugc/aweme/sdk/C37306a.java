package com.p280ss.android.ugc.aweme.sdk;

import android.util.Pair;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sdk.a */
public final class C37306a {

    /* renamed from: a */
    public C11087a f97437a;

    /* renamed from: b */
    public Pair<String, C11093e> f97438b;

    /* renamed from: c */
    public Pair<String, C11093e> f97439c;

    /* renamed from: d */
    public Map<String, C11093e> f97440d;

    /* renamed from: e */
    private String f97441e = "charge";

    /* renamed from: f */
    private String f97442f = "walletAuth";

    /* renamed from: com.ss.android.ugc.aweme.sdk.a$a */
    public static class C37307a {

        /* renamed from: a */
        private C11087a f97443a;

        /* renamed from: b */
        private C11093e f97444b;

        /* renamed from: c */
        private C11093e f97445c;

        /* renamed from: d */
        private Map<String, C11093e> f97446d;

        /* renamed from: a */
        public final C37306a mo93927a() {
            C37306a aVar = new C37306a();
            aVar.mo93923b(this.f97445c);
            aVar.mo93921a(this.f97444b);
            aVar.f97437a = this.f97443a;
            aVar.f97440d = this.f97446d;
            return aVar;
        }

        /* renamed from: a */
        public final C37307a mo93925a(C11087a aVar) {
            this.f97443a = aVar;
            return this;
        }

        /* renamed from: a */
        public final C37307a mo93926a(String str, C11093e eVar) {
            if (this.f97446d == null) {
                this.f97446d = new HashMap(3);
            }
            this.f97446d.put(str, eVar);
            return this;
        }
    }

    /* renamed from: a */
    public static C37307a m119797a() {
        return new C37307a();
    }

    /* renamed from: c */
    public final Map<String, C11093e> mo93924c() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.f97438b.first, this.f97438b.second);
        hashMap.put(this.f97439c.first, this.f97439c.second);
        if (this.f97440d != null && !this.f97440d.isEmpty()) {
            hashMap.putAll(this.f97440d);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo93922b() {
        this.f97437a.mo27026a((String) this.f97438b.first, (C11093e) this.f97438b.second);
        this.f97437a.mo27026a((String) this.f97439c.first, (C11093e) this.f97439c.second);
        if (this.f97440d != null && !this.f97440d.isEmpty()) {
            for (String str : this.f97440d.keySet()) {
                this.f97437a.mo27026a(str, (C11093e) this.f97440d.get(str));
            }
        }
    }

    /* renamed from: a */
    public final void mo93921a(C11093e eVar) {
        this.f97438b = new Pair<>(this.f97441e, eVar);
    }

    /* renamed from: b */
    public final void mo93923b(C11093e eVar) {
        this.f97439c = new Pair<>(this.f97442f, eVar);
    }
}
