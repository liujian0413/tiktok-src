package com.p280ss.android.ugc.aweme.feed.panel;

import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.antiaddic.C22565d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p1076c.p1077a.C23623a;
import com.p280ss.android.ugc.aweme.video.C43222g;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ad */
public final class C28590ad implements C28587aa, C7162m {

    /* renamed from: a */
    private final WeakReference<C28648x> f75278a;

    /* renamed from: b */
    private final int f75279b;

    /* renamed from: c */
    private final C47562b f75280c = new C47562b();

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        this.f75280c.dispose();
    }

    /* renamed from: d */
    public final void mo73310d() {
        C22565d.m74591d().mo59211b(this);
        this.f75280c.dispose();
    }

    /* renamed from: b */
    public final void mo18612b() {
        this.f75280c.dispose();
        this.f75280c.mo119661a(C7492s.m23301b("").mo19320e((long) this.f75279b, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C28591ae<Object>(this), C28592af.f75282a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73312a(String str) throws Exception {
        C28648x xVar = (C28648x) this.f75278a.get();
        if (xVar != null) {
            m93886a(xVar);
        }
    }

    /* renamed from: a */
    private static void m93886a(C28648x xVar) {
        C43222g aq = xVar.mo73367aq();
        if (aq.mo104916o()) {
            StringBuilder sb = new StringBuilder("panel:");
            sb.append(xVar);
            sb.append(",player:");
            sb.append(aq);
            sb.append(". is playing! should not be like this!");
            C6921a.m21552a(6, "PlayerManagerMonitor", sb.toString());
            C23623a.m77524a();
            C6379c.m19826a("aweme_player_monitor", new JSONObject());
        }
    }

    public C28590ad(C28648x xVar, int i) {
        this.f75278a = new WeakReference<>(xVar);
        this.f75279b = i;
        C22565d.m74591d().mo59210a(this);
    }
}
