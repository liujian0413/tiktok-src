package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.kit.bridge.IBridgeScope.BridgeNotFoundException;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.kit.bridge.d */
public final class C10371d implements IBridgeScope {

    /* renamed from: a */
    public static final C10372a f28093a = new C10372a(null);

    /* renamed from: b */
    private final String f28094b;

    /* renamed from: c */
    private final Map<String, IBridgeScope> f28095c;

    /* renamed from: d */
    private final Map<String, IBridge> f28096d;

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.d$a */
    public static final class C10372a {
        private C10372a() {
        }

        public /* synthetic */ C10372a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static IBridgeScope m30702a(C10376g gVar, C10403b bVar) {
            C7573i.m23587b(gVar, "scopeProviderFactory");
            C7573i.m23587b(bVar, "contextProviderFactory");
            String a = gVar.mo25148a();
            Map linkedHashMap = new LinkedHashMap();
            for (C10376g gVar2 : (Iterable) gVar.mo25149b().invoke(bVar)) {
                linkedHashMap.put(gVar2.mo25148a(), m30702a(gVar2, bVar));
            }
            Map linkedHashMap2 = new LinkedHashMap();
            for (IBridge iBridge : (Iterable) gVar.mo25150c().invoke(bVar)) {
                linkedHashMap2.put(iBridge.mo25127c(), iBridge);
            }
            return new C10371d(a, linkedHashMap, linkedHashMap2, null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.d$b */
    static final class C10373b extends Lambda implements C7563m<List<? extends IBridgeScope>, IBridge, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10371d f28097a;

        /* renamed from: b */
        final /* synthetic */ C7563m f28098b;

        C10373b(C10371d dVar, C7563m mVar) {
            this.f28097a = dVar;
            this.f28098b = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m30703a((List) obj, (IBridge) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30703a(List<? extends IBridgeScope> list, IBridge iBridge) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(iBridge, "bridge");
            C7563m mVar = this.f28098b;
            List c = C7525m.m23466c(this.f28097a);
            c.addAll(list);
            mVar.invoke(c, iBridge);
        }
    }

    /* renamed from: b */
    public final String mo25133b() {
        return this.f28094b;
    }

    /* renamed from: c */
    public final Map<String, IBridgeScope> mo25134c() {
        return this.f28095c;
    }

    /* renamed from: d */
    public final Map<String, IBridge> mo25135d() {
        return this.f28096d;
    }

    /* renamed from: a */
    public final void mo25110a() {
        for (Entry value : mo25134c().entrySet()) {
            ((IBridgeScope) value.getValue()).mo25110a();
        }
        for (Entry value2 : mo25135d().entrySet()) {
            ((IBridge) value2.getValue()).mo25110a();
        }
    }

    /* renamed from: a */
    public final void mo25132a(C7563m<? super List<? extends IBridgeScope>, ? super IBridge, C7581n> mVar) {
        C7573i.m23587b(mVar, "handler");
        for (Entry value : mo25134c().entrySet()) {
            ((IBridgeScope) value.getValue()).mo25132a(new C10373b(this, mVar));
        }
        for (Entry value2 : mo25135d().entrySet()) {
            mVar.invoke(C7525m.m23457a(this), value2.getValue());
        }
    }

    /* renamed from: a */
    public final void mo25130a(IBridgeScope iBridgeScope, boolean z) {
        boolean z2;
        C10371d dVar;
        C7573i.m23587b(iBridgeScope, "otherScope");
        for (Entry entry : iBridgeScope.mo25135d().entrySet()) {
            if (z || !mo25135d().containsKey(entry.getKey())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                dVar = this;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                mo25135d().put(entry.getKey(), entry.getValue());
            }
        }
        for (Entry entry2 : iBridgeScope.mo25134c().entrySet()) {
            if (mo25134c().containsKey(entry2.getKey())) {
                IBridgeScope iBridgeScope2 = (IBridgeScope) mo25134c().get(entry2.getKey());
                if (iBridgeScope2 != null) {
                    iBridgeScope2.mo25130a((IBridgeScope) entry2.getValue(), z);
                }
            } else {
                mo25134c().put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private C10371d(String str, Map<String, IBridgeScope> map, Map<String, IBridge> map2) {
        this.f28094b = str;
        this.f28095c = map;
        this.f28096d = map2;
    }

    public /* synthetic */ C10371d(String str, Map map, Map map2, C7571f fVar) {
        this(str, map, map2);
    }

    /* renamed from: a */
    public final void mo25131a(List<String> list, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(list, "scopeNames");
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "callback");
        C7573i.m23587b(bVar, "reject");
        switch (list.size()) {
            case 0:
                bVar.invoke(new BridgeNotFoundException("[unknown]"));
                return;
            case 1:
                String str = (String) C7525m.m23511f(list);
                IBridge iBridge = (IBridge) mo25135d().get(str);
                if (iBridge == null) {
                    bVar.invoke(new BridgeNotFoundException(str));
                    break;
                } else {
                    iBridge.mo25125a(jSONObject, aVar);
                    return;
                }
            default:
                String str2 = (String) C7525m.m23511f(list);
                IBridgeScope iBridgeScope = (IBridgeScope) mo25134c().get(str2);
                if (iBridgeScope != null) {
                    iBridgeScope.mo25131a(list.subList(1, list.size()), jSONObject, aVar, bVar);
                    break;
                } else {
                    bVar.invoke(new BridgeNotFoundException(str2));
                    return;
                }
        }
    }
}
