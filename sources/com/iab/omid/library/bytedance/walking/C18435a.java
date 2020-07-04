package com.iab.omid.library.bytedance.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance.p790c.C18417a;
import com.iab.omid.library.bytedance.p790c.C18417a.C18418a;
import com.iab.omid.library.bytedance.p790c.C18419b;
import com.iab.omid.library.bytedance.p790c.C18420c;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18425c;
import com.iab.omid.library.bytedance.p791d.C18427e;
import com.iab.omid.library.bytedance.walking.p794a.C18443c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.walking.a */
public final class C18435a implements C18418a {

    /* renamed from: a */
    private static C18435a f49982a = new C18435a();

    /* renamed from: b */
    private static Handler f49983b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f49984c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f49985j = new Runnable() {
        public final void run() {
            C18435a.m60702a().m60712h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f49986k = new Runnable() {
        public final void run() {
            if (C18435a.f49984c != null) {
                C18435a.f49984c.post(C18435a.f49985j);
                C18435a.f49984c.postDelayed(C18435a.f49986k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<Object> f49987d = new ArrayList();

    /* renamed from: e */
    private int f49988e;

    /* renamed from: f */
    private C18419b f49989f = new C18419b();

    /* renamed from: g */
    private C18447b f49990g = new C18447b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C18449d f49991h = new C18449d(new C18443c());

    /* renamed from: i */
    private double f49992i;

    C18435a() {
    }

    /* renamed from: a */
    public static C18435a m60702a() {
        return f49982a;
    }

    /* renamed from: a */
    private void m60704a(long j) {
        if (this.f49987d.size() > 0) {
            Iterator it = this.f49987d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    private void m60705a(View view, C18417a aVar, JSONObject jSONObject, C18448c cVar) {
        aVar.mo47858a(view, jSONObject, this, cVar == C18448c.PARENT_VIEW);
    }

    /* renamed from: a */
    private boolean m60706a(View view, JSONObject jSONObject) {
        String a = this.f49990g.mo47891a(view);
        if (a == null) {
            return false;
        }
        C18423b.m60654a(jSONObject, a);
        this.f49990g.mo47896c();
        return true;
    }

    /* renamed from: b */
    private void m60707b(View view, JSONObject jSONObject) {
        ArrayList b = this.f49990g.mo47893b(view);
        if (b != null) {
            C18423b.m60656a(jSONObject, (List<String>) b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m60712h() {
        m60713i();
        m60715k();
        m60714j();
    }

    /* renamed from: i */
    private void m60713i() {
        this.f49988e = 0;
        this.f49992i = C18425c.m60665a();
    }

    /* renamed from: j */
    private void m60714j() {
        m60704a((long) (C18425c.m60665a() - this.f49992i));
    }

    /* renamed from: k */
    private void m60715k() {
        this.f49990g.mo47892a();
        double a = C18425c.m60665a();
        C18420c cVar = this.f49989f.f49960a;
        if (this.f49990g.f50004b.size() > 0) {
            this.f49991h.mo47899b(cVar.mo47857a(null), this.f49990g.f50004b, a);
        }
        if (this.f49990g.f50003a.size() > 0) {
            JSONObject a2 = cVar.mo47857a(null);
            m60705a(null, cVar, a2, C18448c.PARENT_VIEW);
            C18423b.m60653a(a2);
            this.f49991h.mo47897a(a2, this.f49990g.f50003a, a);
        } else {
            this.f49991h.mo47898b();
        }
        this.f49990g.mo47894b();
    }

    /* renamed from: l */
    private static void m60716l() {
        if (f49984c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f49984c = handler;
            handler.post(f49985j);
            f49984c.postDelayed(f49986k, 200);
        }
    }

    /* renamed from: m */
    private static void m60717m() {
        if (f49984c != null) {
            f49984c.removeCallbacks(f49986k);
            f49984c = null;
        }
    }

    /* renamed from: a */
    public final void mo47859a(View view, C18417a aVar, JSONObject jSONObject) {
        if (C18427e.m60680c(view)) {
            C18448c c = this.f49990g.mo47895c(view);
            if (c != C18448c.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo47857a(view);
                C18423b.m60657a(jSONObject, a);
                if (!m60706a(view, a)) {
                    m60707b(view, a);
                    m60705a(view, aVar, a, c);
                }
                this.f49988e++;
            }
        }
    }

    /* renamed from: b */
    public final void mo47875b() {
        m60716l();
    }

    /* renamed from: c */
    public final void mo47876c() {
        mo47877d();
        this.f49987d.clear();
        f49983b.post(new Runnable() {
            public final void run() {
                C18435a.this.f49991h.mo47898b();
            }
        });
    }

    /* renamed from: d */
    public final void mo47877d() {
        m60717m();
    }
}
