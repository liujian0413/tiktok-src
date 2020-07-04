package com.bytedance.crash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.crash.b */
public final class C9854b {

    /* renamed from: a */
    public Map<String, String> f26859a = new HashMap();

    /* renamed from: b */
    public final List<C9900g> f26860b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final List<C9900g> f26861c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final List<C9900g> f26862d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final List<C9900g> f26863e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final List<Object> f26864f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public C9908h f26865g = null;

    /* renamed from: h */
    private Map<CrashType, List<C9847a>> f26866h = new HashMap();

    /* renamed from: i */
    private Map<CrashType, List<C9847a>> f26867i = new HashMap();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24424a(Map<? extends String, ? extends String> map) {
        this.f26859a.putAll(map);
    }

    /* renamed from: a */
    public final List<C9847a> mo24421a(CrashType crashType) {
        return (List) this.f26866h.get(crashType);
    }

    /* renamed from: b */
    public final List<C9847a> mo24425b(CrashType crashType) {
        return (List) this.f26867i.get(crashType);
    }

    /* renamed from: a */
    private void m29077a(CrashType crashType, C9847a aVar) {
        List list;
        if (this.f26866h.get(crashType) == null) {
            list = new ArrayList();
            this.f26866h.put(crashType, list);
        } else {
            list = (List) this.f26866h.get(crashType);
        }
        list.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24422a(C9847a aVar, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m29077a(CrashType.LAUNCH, aVar);
            m29077a(CrashType.JAVA, aVar);
            m29077a(CrashType.CUSTOM_JAVA, aVar);
            m29077a(CrashType.NATIVE, aVar);
            m29077a(CrashType.ANR, aVar);
            m29077a(CrashType.DART, aVar);
            return;
        }
        m29077a(crashType, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24423a(C9900g gVar, CrashType crashType) {
        switch (crashType) {
            case ALL:
                this.f26860b.add(gVar);
                this.f26861c.add(gVar);
                this.f26862d.add(gVar);
                this.f26863e.add(gVar);
                return;
            case ANR:
                this.f26863e.add(gVar);
                return;
            case JAVA:
                this.f26861c.add(gVar);
                return;
            case LAUNCH:
                this.f26860b.add(gVar);
                return;
            case NATIVE:
                this.f26862d.add(gVar);
                break;
        }
    }
}
