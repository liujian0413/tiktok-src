package com.bytedance.p263im.core.model;

import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.model.m */
public final class C11469m {

    /* renamed from: g */
    private static C11469m f31026g;

    /* renamed from: a */
    public int f31027a;

    /* renamed from: b */
    public long f31028b;

    /* renamed from: c */
    public boolean f31029c = true;

    /* renamed from: d */
    public Map<String, Conversation> f31030d = new LinkedHashMap();

    /* renamed from: e */
    public List<Message> f31031e;

    /* renamed from: f */
    public Set<Object> f31032f = new HashSet();

    /* renamed from: h */
    private long f31033h;

    /* renamed from: i */
    private long f31034i;

    /* renamed from: c */
    public final void mo27689c() {
        C11283p.m33057a();
        C11283p.m33065a(0, this.f31034i, null);
    }

    /* renamed from: d */
    public final void mo27690d() {
        this.f31027a = 0;
        this.f31028b = 0;
        this.f31029c = true;
        this.f31031e = null;
    }

    private C11469m() {
    }

    /* renamed from: a */
    public static C11469m m33840a() {
        if (f31026g == null) {
            synchronized (C11469m.class) {
                if (f31026g == null) {
                    f31026g = new C11469m();
                }
            }
        }
        return f31026g;
    }

    /* renamed from: b */
    public final void mo27688b() {
        Iterator it = this.f31032f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo27686a(final C11195b<Boolean> bVar) {
        C11283p.m33057a();
        C11283p.m33067a((C11195b<Boolean>) new C11195b<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo18089a(Boolean bool) {
                if (bVar != null) {
                    bVar.mo18089a(bool);
                }
                C11469m.this.mo27689c();
            }

            /* renamed from: a */
            public final void mo18088a(C11438g gVar) {
                if (bVar != null) {
                    bVar.mo18088a(gVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo27685a(int i) {
        if (i != this.f31027a && i >= 0) {
            this.f31027a = i;
            Iterator it = this.f31032f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo27687a(final String str, C11195b<String> bVar) {
        if (this.f31030d.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f31033h >= 2000) {
                C11404d.m33582a("StrangerModel markRead net");
                this.f31033h = currentTimeMillis;
                C11283p.m33057a();
                C11283p.m33066a(((Conversation) this.f31030d.get(str)).getConversationShortId(), (C11195b<Boolean>) new C11195b<Boolean>(null) {
                    /* renamed from: a */
                    public final void mo18088a(C11438g gVar) {
                        if (null != null) {
                            null.mo18088a(gVar);
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo18089a(Boolean bool) {
                        if (null != null) {
                            null.mo18089a(str);
                        }
                        C11469m.this.mo27689c();
                    }
                });
                return;
            }
            C11404d.m33582a("StrangerModel markRead net too often, smaller than 2s");
        }
    }
}
