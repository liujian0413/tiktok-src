package com.bytedance.apm.p238b;

import android.app.Activity;
import android.os.Build.VERSION;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p238b.p465a.C9568b;
import com.bytedance.apm.p238b.p466b.C9571a;
import com.bytedance.apm.p238b.p467c.C9580d;
import com.bytedance.apm.p238b.p467c.C9581e;
import com.bytedance.apm.p238b.p467c.C9582f;
import com.bytedance.apm.p238b.p467c.C9583g;
import com.bytedance.apm.p238b.p467c.C9585h;
import com.bytedance.apm.p238b.p467c.C9586i;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.p248k.C6244a;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.a */
public final class C6171a extends C6244a {

    /* renamed from: a */
    public final List<C9586i> f18152a;

    /* renamed from: com.bytedance.apm.b.a$a */
    static final class C6173a {

        /* renamed from: a */
        public static final C6171a f18153a = new C6171a();
    }

    /* renamed from: a */
    public static C6171a m19119a() {
        return C6173a.f18153a;
    }

    /* renamed from: a */
    public final void mo14862a(JSONObject jSONObject) {
    }

    /* renamed from: c */
    public final boolean mo14865c() {
        return true;
    }

    /* renamed from: d */
    public final long mo14866d() {
        return 600000;
    }

    private C6171a() {
        this.f18152a = new ArrayList(6);
    }

    public final void onReady() {
        super.onReady();
        C9571a.m28319a().mo23886b();
    }

    /* renamed from: j */
    private void m19121j() {
        if (C6174c.m19149g()) {
            new String[1][0] = "onChangeToBack, record data";
        }
        C6273b.m19475a().mo15065a((C6276b) this);
        C9571a.m28319a().mo23885a(new C9603b(false, System.currentTimeMillis()));
        for (C9586i b : this.f18152a) {
            b.mo23898b();
        }
    }

    /* renamed from: i */
    private void m19120i() {
        if (C6174c.m19149g()) {
            new String[1][0] = "onChangeToFront, record data";
        }
        C9571a.m28319a().f26148b = ActivityLifeObserver.getInstance().getTopActivityClassName();
        C6273b.m19475a().mo15068b(this);
        C9571a.m28319a().mo23885a(new C9603b(true, System.currentTimeMillis()));
        for (C9586i c : this.f18152a) {
            c.mo23899c();
        }
    }

    /* renamed from: e */
    public final void mo14867e() {
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("onTimer record, current is background? : ");
            sb.append(ActivityLifeObserver.getInstance().isForeground());
            String[] strArr = {sb.toString()};
        }
        if (this.f18371c) {
            C9571a.m28319a().mo23885a(new C9603b(false, System.currentTimeMillis()));
            for (C9586i d : this.f18152a) {
                d.mo23900d();
            }
        }
    }

    /* renamed from: b */
    public final void mo14863b() {
        if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT <= 27) {
            C9580d dVar = new C9580d();
            C9581e eVar = new C9581e();
            C9583g gVar = new C9583g(C6174c.m19129a());
            C9582f fVar = new C9582f();
            C9585h hVar = new C9585h();
            this.f18152a.add(dVar);
            this.f18152a.add(eVar);
            this.f18152a.add(gVar);
            this.f18152a.add(fVar);
            this.f18152a.add(hVar);
            try {
                C9568b bVar = new C9568b();
                bVar.mo23880a("alarm", dVar);
                bVar.mo23880a("location", fVar);
                bVar.mo23880a("power", hVar);
                bVar.mo23879a();
            } catch (Exception e) {
                if (C6174c.m19149g()) {
                    StringBuilder sb = new StringBuilder("hook failed: ");
                    sb.append(e.getMessage());
                    String[] strArr = {sb.toString()};
                }
            }
            if (ActivityLifeObserver.getInstance().isForeground()) {
                C9571a.m28319a().mo23885a(new C9603b(false, System.currentTimeMillis()));
                m19120i();
            } else {
                m19121j();
            }
            if (C6174c.m19145c() && this.f18370b) {
                C9571a.m28319a().mo23886b();
            }
        }
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        super.mo14861a(activity);
        m19121j();
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        super.mo14864b(activity);
        m19120i();
    }
}
