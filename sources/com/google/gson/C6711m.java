package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.gson.m */
public final class C6711m extends C6709k {

    /* renamed from: a */
    private final LinkedTreeMap<String, C6709k> f19165a = new LinkedTreeMap<>();

    /* renamed from: a */
    public final Set<Entry<String, C6709k>> mo16143a() {
        return this.f19165a.entrySet();
    }

    public final int hashCode() {
        return this.f19165a.hashCode();
    }

    /* renamed from: q */
    public final int mo16155q() {
        return this.f19165a.size();
    }

    /* renamed from: a */
    private static C6709k m20751a(Object obj) {
        if (obj == null) {
            return C6710l.f19164a;
        }
        return new C6712o(obj);
    }

    /* renamed from: b */
    public final C6709k mo16149b(String str) {
        return (C6709k) this.f19165a.get(str);
    }

    /* renamed from: c */
    public final C6712o mo16150c(String str) {
        return (C6712o) this.f19165a.get(str);
    }

    /* renamed from: d */
    public final C6609h mo16151d(String str) {
        return (C6609h) this.f19165a.get(str);
    }

    /* renamed from: e */
    public final C6711m mo16152e(String str) {
        return (C6711m) this.f19165a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C6711m) && ((C6711m) obj).f19165a.equals(this.f19165a))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo16148a(String str) {
        return this.f19165a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo16144a(String str, C6709k kVar) {
        if (kVar == null) {
            kVar = C6710l.f19164a;
        }
        this.f19165a.put(str, kVar);
    }

    /* renamed from: a */
    public final void mo16145a(String str, Boolean bool) {
        mo16144a(str, m20751a((Object) bool));
    }

    /* renamed from: a */
    public final void mo16146a(String str, Number number) {
        mo16144a(str, m20751a((Object) number));
    }

    /* renamed from: a */
    public final void mo16147a(String str, String str2) {
        mo16144a(str, m20751a((Object) str2));
    }
}
