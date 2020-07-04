package com.p280ss.android.ugc.aweme.antiaddic;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.commercialize.log.C24940ak;
import com.p280ss.android.ugc.aweme.miniapp.p1396n.C33411a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34193a;
import com.p280ss.android.ugc.aweme.profile.util.C36723ai;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.d */
public class C22565d implements C22570g, C7162m {

    /* renamed from: b */
    private static C22565d f60119b;

    /* renamed from: a */
    public List<C7162m> f60120a = new CopyOnWriteArrayList();

    private C22565d() {
    }

    /* renamed from: f */
    private void m74593f() {
        synchronized (C22565d.class) {
            this.f60120a.clear();
        }
    }

    /* renamed from: d */
    public static C22565d m74591d() {
        if (f60119b == null) {
            synchronized (C22565d.class) {
                if (f60119b == null) {
                    f60119b = new C22565d();
                }
            }
        }
        return f60119b;
    }

    /* renamed from: a */
    public final void mo18611a() {
        synchronized (C22565d.class) {
            for (C7162m a : this.f60120a) {
                a.mo18611a();
            }
        }
    }

    /* renamed from: b */
    public final void mo18612b() {
        synchronized (C22565d.class) {
            for (C7162m b : this.f60120a) {
                b.mo18612b();
            }
        }
    }

    /* renamed from: c */
    public final void mo18613c() {
        synchronized (C22565d.class) {
            for (C7162m c : this.f60120a) {
                c.mo18613c();
            }
        }
    }

    /* renamed from: e */
    public static void m74592e() {
        if (C6776h.m20947b(C6399b.m19921a())) {
            m74591d().m74593f();
            m74591d().mo59210a(new C22566e());
            m74591d().mo59210a(new C34193a());
            m74591d().mo59210a(new C36723ai());
            if (!C6399b.m19944t()) {
                m74591d().mo59210a(new C24940ak());
                m74591d().mo59210a(new C33411a());
            }
        }
    }

    /* renamed from: b */
    public final void mo59211b(C7162m mVar) {
        synchronized (C22565d.class) {
            this.f60120a.remove(mVar);
        }
    }

    /* renamed from: a */
    public final void mo59210a(C7162m mVar) {
        synchronized (C22565d.class) {
            if (!this.f60120a.contains(mVar)) {
                this.f60120a.add(mVar);
            }
        }
    }
}
