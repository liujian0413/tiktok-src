package com.p280ss.android.ugc.graph;

import com.p280ss.android.ugc.graph.C7289f.C7292c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.graph.d */
public final class C44837d {

    /* renamed from: a */
    private Map<String, C7292c> f115325a;

    /* renamed from: com.ss.android.ugc.graph.d$a */
    enum C44839a {
        INSTANCE;
        

        /* renamed from: b */
        private C44834a f115328b;

        /* renamed from: c */
        private C44837d f115329c;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C44837d mo107276b() {
            if (this.f115329c == null) {
                this.f115329c = new C44837d();
            }
            return this.f115329c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C44834a mo107275a() {
            if (this.f115328b == null) {
                try {
                    this.f115328b = (C44834a) Class.forName("com.ss.android.ugc.graph.b").newInstance();
                } catch (Exception unused) {
                }
            }
            return this.f115328b;
        }
    }

    /* renamed from: a */
    public static C44837d m141504a() {
        return C44839a.INSTANCE.mo107276b();
    }

    private C44837d() {
        this.f115325a = new HashMap();
        C44834a a = C44839a.INSTANCE.mo107275a();
        if (a != null) {
            this.f115325a.putAll(a.f115324a);
        }
    }

    /* renamed from: a */
    public final <T> T mo107274a(Object obj, Class<T> cls) {
        if (obj == null || cls == null) {
            return null;
        }
        return m141505a(obj, (C7292c) this.f115325a.get(C44834a.m141499a(obj.getClass())), cls);
    }

    /* renamed from: a */
    private static <T> T m141505a(Object obj, C7292c cVar, Class<T> cls) {
        if (cVar == null) {
            return null;
        }
        return cVar.mo19025a(obj, cls);
    }
}
