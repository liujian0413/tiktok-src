package com.p280ss.android.ugc.aweme.antiaddic;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17454q;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22584a;
import com.p280ss.android.ugc.aweme.antiaddic.p1012c.C22563a;
import com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.C22660a;
import com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.C22662b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.e */
public final class C22566e implements C6310a, C7162m {

    /* renamed from: b */
    private static Integer f60121b;

    /* renamed from: c */
    private static Integer f60122c;

    /* renamed from: a */
    public ArrayList<C22568a> f60123a = new ArrayList<>();

    /* renamed from: d */
    private C17454q f60124d = C17454q.m58001a();

    /* renamed from: e */
    private C6309f f60125e = new C6309f(this);

    /* renamed from: f */
    private boolean f60126f;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.e$a */
    public interface C22568a {
        /* renamed from: a */
        boolean mo59194a(long j, long j2);
    }

    /* renamed from: f */
    private void m74603f() {
        this.f60123a.clear();
    }

    /* renamed from: b */
    public final void mo18612b() {
        this.f60125e.sendEmptyMessageDelayed(100004, (long) m74602e());
    }

    /* renamed from: d */
    public static int m74601d() {
        int i;
        if (f60122c == null) {
            if (C22562c.m74572b()) {
                i = 20000;
            } else {
                i = 60000;
            }
            f60122c = Integer.valueOf(i);
        }
        return f60122c.intValue();
    }

    /* renamed from: e */
    private static int m74602e() {
        int i;
        if (f60121b == null) {
            if (C22562c.m74572b()) {
                i = 20000;
            } else {
                i = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            f60121b = Integer.valueOf(i);
        }
        return f60121b.intValue();
    }

    /* renamed from: c */
    public final void mo18613c() {
        if (!this.f60126f) {
            this.f60126f = true;
            m74599a(this.f60124d.mo44941a(TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: a */
    public final void mo18611a() {
        this.f60125e.removeMessages(100004);
        if (!this.f60125e.hasMessages(100003)) {
            this.f60125e.sendEmptyMessageDelayed(100003, (long) m74601d());
        }
        if (!this.f60124d.f48412a) {
            this.f60124d.mo44942c();
        }
    }

    public C22566e() {
        m74603f();
        m74600a((C22568a) new C22584a());
        if (!C6399b.m19944t()) {
            m74600a((C22568a) new C22569f());
            m74600a((C22568a) new C22660a());
            m74600a((C22568a) new C22563a());
            return;
        }
        m74600a((C22568a) new C22571h());
        m74600a((C22568a) new C22662b());
    }

    /* renamed from: a */
    private void m74599a(final long j) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = C22566e.this.f60123a.iterator();
                while (it.hasNext()) {
                    ((C22568a) it.next()).mo59194a(currentTimeMillis, j);
                }
            }
        });
    }

    /* renamed from: a */
    private void m74600a(C22568a aVar) {
        if (!this.f60123a.contains(aVar)) {
            this.f60123a.add(aVar);
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f60125e.sendEmptyMessageDelayed(100003, (long) m74601d());
                m74599a(this.f60124d.mo44941a(TimeUnit.MILLISECONDS));
                return;
            case 100004:
                this.f60125e.removeMessages(100003);
                this.f60124d.mo44944e();
                C22562c.m74570a().f60111c = "";
                C22562c.m74570a().f60109a = false;
                if (C6399b.m19944t()) {
                    Iterator it = this.f60123a.iterator();
                    while (it.hasNext()) {
                        C22568a aVar = (C22568a) it.next();
                        if (aVar instanceof C22571h) {
                            ((C22571h) aVar).f60130a.mo59201b();
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
