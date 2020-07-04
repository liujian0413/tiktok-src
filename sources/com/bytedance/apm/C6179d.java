package com.bytedance.apm;

import java.util.HashSet;

/* renamed from: com.bytedance.apm.d */
public final class C6179d {

    /* renamed from: a */
    public C6181a f18171a;

    /* renamed from: b */
    private HashSet<String> f18172b;

    /* renamed from: com.bytedance.apm.d$a */
    public interface C6181a {
        /* renamed from: a */
        void mo14891a(String str);

        /* renamed from: a */
        void mo14892a(Throwable th, String str);
    }

    /* renamed from: com.bytedance.apm.d$b */
    static class C6182b {

        /* renamed from: a */
        public static final C6179d f18173a = new C6179d();
    }

    /* renamed from: a */
    public static C6179d m19171a() {
        return C6182b.f18173a;
    }

    private C6179d() {
        this.f18172b = new HashSet<>();
    }

    /* renamed from: a */
    public final void mo14889a(String str) {
        if (this.f18171a != null && !this.f18172b.contains(str)) {
            this.f18172b.add(str);
            C6181a aVar = this.f18171a;
            StringBuilder sb = new StringBuilder("apm_");
            sb.append(str);
            aVar.mo14891a(sb.toString());
        }
        if (C6174c.m19149g()) {
            throw new RuntimeException(str);
        }
    }

    /* renamed from: a */
    public final void mo14890a(Throwable th, String str) {
        if (this.f18171a != null && !this.f18172b.contains(str)) {
            this.f18172b.add(str);
            C6181a aVar = this.f18171a;
            StringBuilder sb = new StringBuilder("apm_");
            sb.append(str);
            aVar.mo14892a(th, sb.toString());
        }
    }
}
