package com.bytedance.android.p089a.p099b;

import android.view.View;
import com.bytedance.android.p089a.p090a.p094d.C2220a;
import com.bytedance.android.p089a.p090a.p095e.C2221a;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import com.bytedance.android.p089a.p090a.p097g.C2227a;
import com.bytedance.android.p089a.p090a.p098h.C2230a;
import com.bytedance.android.p089a.p090a.p098h.C2231b;
import com.bytedance.android.p089a.p090a.p098h.C2233d;
import com.bytedance.android.p089a.p099b.p100a.C2239a;
import com.bytedance.android.p089a.p099b.p101b.C2240a;
import com.bytedance.android.p089a.p099b.p101b.C2251d;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b;
import com.bytedance.android.p089a.p099b.p103c.C2252a;
import com.bytedance.android.p089a.p099b.p103c.C2252a.C2254a;
import com.bytedance.android.p089a.p099b.p104d.C2255a;
import com.bytedance.android.p089a.p099b.p104d.C2257b;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.a */
public final class C2236a extends C2227a<C2252a> {

    /* renamed from: a */
    public C2252a f7488a;

    /* renamed from: b */
    private C2257b f7489b;

    /* renamed from: c */
    private C2240a f7490c;

    /* renamed from: com.bytedance.android.a.b.a$a */
    public static class C2238a {

        /* renamed from: a */
        public boolean f7491a = true;

        /* renamed from: b */
        public int f7492b;

        /* renamed from: c */
        public C2239a f7493c;

        /* renamed from: d */
        public List<C2244b> f7494d;

        /* renamed from: a */
        public final C2236a mo7975a() {
            return new C2236a(this);
        }

        /* renamed from: a */
        public final C2238a mo7972a(C2239a aVar) {
            this.f7493c = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2238a mo7974a(boolean z) {
            this.f7491a = true;
            return this;
        }

        /* renamed from: a */
        public final C2238a mo7973a(C2244b bVar) {
            if (bVar == null) {
                return this;
            }
            if (this.f7494d == null) {
                this.f7494d = new ArrayList();
            }
            this.f7494d.add(bVar);
            return this;
        }
    }

    /* renamed from: b */
    public final String mo7969b() {
        return "c2s";
    }

    /* renamed from: d */
    public final void mo7971d() {
        m9617e();
    }

    /* renamed from: a */
    public final void mo7932a() {
        JSONObject c = mo7970c();
        if (c != null) {
            this.f7488a.mo7963a(c);
            this.f7489b.mo7998a(this.f7488a.f7520d);
        }
    }

    /* renamed from: e */
    private void m9617e() {
        if (this.f7488a.f7486f) {
            List<C2222b> c = this.f7489b.mo8002c();
            if (!C2230a.m9594a()) {
                for (C2222b bVar : c) {
                    C2231b.m9597a(bVar);
                    bVar.f7473k++;
                    this.f7489b.mo8003c(bVar);
                }
                return;
            }
            for (C2222b a : C2220a.m9573a(c)) {
                m9616a(a, true);
            }
        }
    }

    private C2236a(C2238a aVar) {
        this.f7488a = new C2254a().mo7994a(aVar.f7491a).mo7992a(aVar.f7492b).mo7993a(aVar.f7493c).mo7995a();
        this.f7490c = new C2240a(this, aVar.f7494d);
        this.f7489b = new C2255a(this);
    }

    /* renamed from: a */
    private void m9616a(C2222b bVar, boolean z) {
        int i;
        for (String str : bVar.f7468f) {
            C2231b.m9605b(bVar);
            int[] iArr = new int[4];
            if (C2233d.m9608b(str)) {
                new StringBuilder("invalid url containing %:").append(str);
                iArr[0] = 3002;
                i = 1;
            } else {
                i = 0;
            }
            if (C2233d.m9609c(str)) {
                new StringBuilder("invalid url containing %%:").append(str);
                int i2 = i + 1;
                iArr[i] = 3001;
                i = i2;
            }
            if (C2233d.m9610d(str)) {
                new StringBuilder("invalid url containing space:").append(str);
                int i3 = i + 1;
                iArr[i] = 3003;
                i = i3;
            }
            if (C2233d.m9611e(str)) {
                new StringBuilder("invalid url containing ×:").append(str);
                int i4 = i + 1;
                iArr[i] = 3004;
                i = i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                C2231b.m9598a(bVar, iArr[i5]);
            }
            C2251d a = this.f7490c.mo7977a(str, bVar);
            if (a != null) {
                StringBuilder sb = new StringBuilder("code:");
                sb.append(a.f7511a);
                sb.append(" msg:");
                sb.append(a.f7512b);
            }
        }
        if (z) {
            this.f7489b.mo8001b(bVar);
        }
    }

    /* renamed from: a */
    public final void mo7933a(View view, C2221a aVar) {
        String str;
        if (!(aVar instanceof C2222b)) {
            StringBuilder sb = new StringBuilder("incompatible event type: ");
            if (aVar != null) {
                str = aVar.getClass().getName();
            } else {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            sb.append(str);
        } else if (this.f7488a.f7486f) {
            C2222b bVar = (C2222b) aVar;
            List<String> list = bVar.f7468f;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    if (!C2233d.m9607a(str2)) {
                        new StringBuilder("not a valid http url:").append(str2);
                        arrayList.add(str2);
                    }
                }
                list.removeAll(arrayList);
            }
            if (list == null || list.isEmpty()) {
                C2231b.m9598a(bVar, 1);
                return;
            }
            bVar.f7468f = list;
            if (!C2230a.m9594a()) {
                C2231b.m9597a(bVar);
                if (this.f7488a.f7519c) {
                    bVar.f7473k++;
                    this.f7489b.mo7999a(bVar);
                }
                return;
            }
            m9616a(bVar, false);
        }
    }
}
