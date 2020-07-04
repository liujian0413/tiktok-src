package com.google.android.gms.internal.ads;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.nd */
public final class C15891nd implements C15844lk, C15890nc {

    /* renamed from: a */
    private final C15889nb f44683a;

    /* renamed from: b */
    private final HashSet<SimpleEntry<String, C15742hq<? super C15889nb>>> f44684b = new HashSet<>();

    public C15891nd(C15889nb nbVar) {
        this.f44683a = nbVar;
    }

    /* renamed from: a */
    public final void mo39875a(String str, String str2) {
        C15845ll.m51279a((C15844lk) this, str, str2);
    }

    /* renamed from: a */
    public final void mo39809a(String str, Map map) {
        C15845ll.m51280a((C15844lk) this, str, map);
    }

    /* renamed from: a */
    public final void mo39810a(String str, JSONObject jSONObject) {
        C15845ll.m51282b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo39814b(String str, JSONObject jSONObject) {
        C15845ll.m51281a((C15844lk) this, str, jSONObject);
    }

    /* renamed from: d */
    public final void mo39815d(String str) {
        this.f44683a.mo39815d(str);
    }

    /* renamed from: a */
    public final void mo41741a(String str, C15742hq<? super C15889nb> hqVar) {
        this.f44683a.mo41741a(str, hqVar);
        this.f44684b.add(new SimpleEntry(str, hqVar));
    }

    /* renamed from: b */
    public final void mo41742b(String str, C15742hq<? super C15889nb> hqVar) {
        this.f44683a.mo41742b(str, hqVar);
        this.f44684b.remove(new SimpleEntry(str, hqVar));
    }

    /* renamed from: a */
    public final void mo41766a() {
        Iterator it = this.f44684b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((C15742hq) simpleEntry.getValue()).toString());
            acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f44683a.mo41742b((String) simpleEntry.getKey(), (C15742hq) simpleEntry.getValue());
        }
        this.f44684b.clear();
    }
}
