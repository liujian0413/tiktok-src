package com.bytedance.p524g.p525a;

import android.content.Context;
import com.bytedance.p524g.p525a.p527b.C10267c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.g.a.a */
public final class C10249a {

    /* renamed from: a */
    public List<String> f27858a;

    /* renamed from: b */
    public Context f27859b;

    /* renamed from: c */
    public C10253c f27860c;

    /* renamed from: d */
    public C10254d f27861d;

    /* renamed from: e */
    public C10252b f27862e;

    /* renamed from: f */
    public C10267c f27863f;

    /* renamed from: g */
    public List<C10258b> f27864g;

    /* renamed from: h */
    Map<String, Long> f27865h;

    /* renamed from: com.bytedance.g.a.a$a */
    public static class C10251a {

        /* renamed from: a */
        private final List<String> f27866a = new ArrayList();

        /* renamed from: b */
        private Context f27867b;

        /* renamed from: c */
        private C10253c f27868c;

        /* renamed from: d */
        private C10254d f27869d;

        /* renamed from: e */
        private C10252b f27870e;

        /* renamed from: f */
        private C10267c f27871f;

        /* renamed from: a */
        public final C10249a mo24981a() {
            C10249a aVar = new C10249a();
            aVar.f27859b = this.f27867b;
            aVar.f27863f = this.f27871f;
            aVar.f27860c = this.f27868c;
            aVar.f27862e = this.f27870e;
            aVar.f27861d = this.f27869d;
            aVar.f27858a = this.f27866a;
            return aVar;
        }

        /* renamed from: a */
        public final C10251a mo24978a(Context context) {
            this.f27867b = context;
            return this;
        }

        /* renamed from: a */
        public final C10251a mo24977a(byte b) {
            this.f27871f = C10268c.m30418a(2);
            return this;
        }

        /* renamed from: a */
        public final C10251a mo24979a(C10253c cVar) {
            this.f27868c = cVar;
            return this;
        }

        /* renamed from: a */
        public final C10251a mo24980a(String str) {
            if (!this.f27866a.contains(str)) {
                this.f27866a.add(str);
            }
            return this;
        }
    }

    /* renamed from: com.bytedance.g.a.a$b */
    public interface C10252b {
    }

    /* renamed from: com.bytedance.g.a.a$c */
    public interface C10253c {
        /* renamed from: a */
        void mo13634a();

        /* renamed from: b */
        void mo13635b();

        /* renamed from: c */
        boolean mo13636c();
    }

    /* renamed from: com.bytedance.g.a.a$d */
    public interface C10254d {
    }

    private C10249a() {
        this.f27864g = new ArrayList();
        this.f27865h = new HashMap();
    }

    /* renamed from: a */
    public final byte mo24975a() {
        byte b = 0;
        for (C10258b bVar : this.f27864g) {
            b = (byte) (b | bVar.f27874a);
        }
        if ((b & 1) == 1) {
            return 1;
        }
        if ((b & 4) == 4) {
            return 4;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo24976a(C10258b bVar) {
        bVar.f27876c = this;
        this.f27864g.add(bVar);
    }
}
