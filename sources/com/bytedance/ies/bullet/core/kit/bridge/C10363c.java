package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.C10371d.C10372a;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.kit.bridge.IBridgeScope.BridgeNotFoundException;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10408b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c */
public final class C10363c implements C10375f {

    /* renamed from: b */
    public static final C7562b<String, List<String>> f28076b = C10366c.f28084a;

    /* renamed from: c */
    public static final C7562b<List<String>, String> f28077c = C10365b.f28083a;

    /* renamed from: d */
    public static final C10364a f28078d = new C10364a(null);

    /* renamed from: a */
    public final C10403b f28079a;

    /* renamed from: e */
    private final Map<String, IBridgeScope> f28080e = new LinkedHashMap();

    /* renamed from: f */
    private final Map<String, IBridge> f28081f = new LinkedHashMap();

    /* renamed from: g */
    private C10410d<C10361a> f28082g;

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$a */
    public static final class C10364a {
        private C10364a() {
        }

        /* renamed from: a */
        public static C7562b<String, List<String>> m30687a() {
            return C10363c.f28076b;
        }

        /* renamed from: b */
        public static C7562b<List<String>, String> m30688b() {
            return C10363c.f28077c;
        }

        public /* synthetic */ C10364a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$b */
    static final class C10365b extends Lambda implements C7562b<List<? extends String>, String> {

        /* renamed from: a */
        public static final C10365b f28083a = new C10365b();

        C10365b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m30689a((List) obj);
        }

        /* renamed from: a */
        private static String m30689a(List<String> list) {
            C7573i.m23587b(list, "it");
            return C7525m.m23492a(list, "/", null, null, 0, null, null, 62, null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$c */
    static final class C10366c extends Lambda implements C7562b<String, List<? extends String>> {

        /* renamed from: a */
        public static final C10366c f28084a = new C10366c();

        C10366c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m30690a((String) obj);
        }

        /* renamed from: a */
        private static List<String> m30690a(String str) {
            C7573i.m23587b(str, "it");
            return C7634n.m23768b((CharSequence) str, new String[]{"/"}, false, 0);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$d */
    static final class C10367d extends Lambda implements C7562b<C10361a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48007r f28085a;

        C10367d(C48007r rVar) {
            this.f28085a = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30691a((C10361a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30691a(C10361a aVar) {
            C7573i.m23587b(aVar, "it");
            this.f28085a.invoke(aVar.f28070a, aVar.f28071b, aVar.f28072c, aVar.f28073d);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$e */
    static final class C10368e extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48007r f28086a;

        /* renamed from: b */
        final /* synthetic */ String f28087b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f28088c;

        /* renamed from: d */
        final /* synthetic */ C10360a f28089d;

        /* renamed from: e */
        final /* synthetic */ C7562b f28090e;

        C10368e(C48007r rVar, String str, JSONObject jSONObject, C10360a aVar, C7562b bVar) {
            this.f28086a = rVar;
            this.f28087b = str;
            this.f28088c = jSONObject;
            this.f28089d = aVar;
            this.f28090e = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30692a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30692a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f28086a.invoke(this.f28087b, this.f28088c, this.f28089d, this.f28090e);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$f */
    static final class C10369f extends Lambda implements C48007r<String, JSONObject, C10360a, C7562b<? super Throwable, ? extends C7581n>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10363c f28091a;

        C10369f(C10363c cVar) {
            this.f28091a = cVar;
            super(4);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m30693a((String) obj, (JSONObject) obj2, (C10360a) obj3, (C7562b) obj4);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30693a(String str, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar) {
            C7573i.m23587b(str, "funcName");
            C7573i.m23587b(jSONObject, "params");
            C7573i.m23587b(aVar, "callback");
            C7573i.m23587b(bVar, "reject");
            this.f28091a.mo25142a((List) C10364a.m30687a().invoke(str), jSONObject, aVar, bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.c$g */
    static final class C10370g extends Lambda implements C7563m<List<? extends IBridgeScope>, IBridge, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f28092a;

        C10370g(C7563m mVar) {
            this.f28092a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m30694a((List) obj, (IBridge) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30694a(List<? extends IBridgeScope> list, IBridge iBridge) {
            String str;
            C7573i.m23587b(list, "list");
            C7573i.m23587b(iBridge, "bridge");
            C7563m mVar = this.f28092a;
            if (list.isEmpty()) {
                str = iBridge.mo25127c();
            } else {
                Iterable<IBridgeScope> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IBridgeScope b : iterable) {
                    arrayList.add(b.mo25133b());
                }
                List d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
                d.add(iBridge.mo25127c());
                str = (String) C10364a.m30688b().invoke(d);
            }
            mVar.invoke(str, iBridge);
        }
    }

    /* renamed from: b */
    public final Map<String, IBridgeScope> mo25144b() {
        return this.f28080e;
    }

    /* renamed from: c */
    public final Map<String, IBridge> mo25145c() {
        return this.f28081f;
    }

    /* renamed from: d */
    public final C10410d<C10361a> mo25146d() {
        return this.f28082g;
    }

    /* renamed from: a */
    public final void mo25110a() {
        for (Entry value : this.f28080e.entrySet()) {
            ((IBridgeScope) value.getValue()).mo25110a();
        }
    }

    /* renamed from: a */
    private void m30677a(C10410d<C10361a> dVar) {
        this.f28082g = dVar;
    }

    /* renamed from: a */
    public final void mo25143a(C7563m<? super String, ? super IBridge, C7581n> mVar) {
        C7573i.m23587b(mVar, "handler");
        m30678b(new C10370g(mVar));
    }

    /* renamed from: b */
    private void m30678b(C7563m<? super List<? extends IBridgeScope>, ? super IBridge, C7581n> mVar) {
        C7573i.m23587b(mVar, "handler");
        for (Entry value : this.f28080e.entrySet()) {
            ((IBridgeScope) value.getValue()).mo25132a(mVar);
        }
        for (Entry value2 : this.f28081f.entrySet()) {
            mVar.invoke(C7525m.m23461a(), value2.getValue());
        }
    }

    /* renamed from: a */
    public final void mo25140a(C10375f fVar, boolean z) {
        C7573i.m23587b(fVar, "otherRegistry");
        for (Entry entry : fVar.mo25144b().entrySet()) {
            if (mo25144b().containsKey(entry.getKey())) {
                IBridgeScope iBridgeScope = (IBridgeScope) this.f28080e.get(entry.getKey());
                if (iBridgeScope != null) {
                    iBridgeScope.mo25130a((IBridgeScope) entry.getValue(), false);
                }
            } else {
                this.f28080e.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = fVar.mo25145c().entrySet().iterator();
        while (true) {
            C10363c cVar = null;
            if (!it.hasNext()) {
                break;
            }
            Entry entry2 = (Entry) it.next();
            if (true ^ this.f28081f.containsKey(entry2.getKey())) {
                cVar = this;
            }
            if (cVar != null) {
                this.f28081f.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (mo25146d() == null) {
            m30677a(fVar.mo25146d());
            return;
        }
        C10410d d = mo25146d();
        if (d == null) {
            C7573i.m23580a();
        }
        C10410d d2 = fVar.mo25146d();
        if (d2 != null) {
            List b = C7525m.m23464b((T[]) new C10410d[]{d, d2});
            if (b != null) {
                m30677a((C10410d<C10361a>) new C10408b<C10361a>(b, null, 2, null));
            }
        }
    }

    public C10363c(List<? extends C10376g> list, List<? extends IBridge> list2, C10403b bVar, C10410d<C10361a> dVar) {
        C7573i.m23587b(list, "scopeProviderFactories");
        C7573i.m23587b(list2, "bridges");
        C7573i.m23587b(bVar, "contextProviderFactory");
        this.f28079a = bVar;
        this.f28082g = dVar;
        for (C10376g gVar : list) {
            this.f28080e.put(gVar.mo25148a(), C10372a.m30702a(gVar, this.f28079a));
        }
        for (IBridge iBridge : list2) {
            this.f28081f.put(iBridge.mo25127c(), iBridge);
        }
    }

    /* renamed from: a */
    public final void mo25141a(String str, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(str, "funcName");
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "callback");
        C7573i.m23587b(bVar, "reject");
        C48007r fVar = new C10369f(this);
        if (mo25146d() == null) {
            fVar.invoke(str, jSONObject, aVar, bVar);
            return;
        }
        C10410d d = mo25146d();
        if (d == null) {
            C7573i.m23580a();
        }
        C10361a aVar2 = new C10361a(str, jSONObject, aVar, bVar);
        C7562b dVar = new C10367d(fVar);
        C10368e eVar = new C10368e(fVar, str, jSONObject, aVar, bVar);
        d.mo25083a(aVar2, dVar, eVar);
    }

    /* renamed from: a */
    public final void mo25142a(List<String> list, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar) {
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
                IBridge iBridge = (IBridge) mo25145c().get(str);
                if (iBridge == null) {
                    bVar.invoke(new BridgeNotFoundException(str));
                    break;
                } else {
                    iBridge.mo25125a(jSONObject, aVar);
                    return;
                }
            default:
                String str2 = (String) C7525m.m23511f(list);
                IBridgeScope iBridgeScope = (IBridgeScope) mo25144b().get(str2);
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
