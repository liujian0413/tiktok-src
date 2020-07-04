package com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b */
public final class C41441b {

    /* renamed from: a */
    public C41442a f107808a = new C41442a();

    /* renamed from: b */
    public C7321c f107809b;

    /* renamed from: c */
    public int f107810c = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$a */
    public static final class C41442a {

        /* renamed from: a */
        public boolean f107811a;

        /* renamed from: b */
        public boolean f107812b;

        /* renamed from: a */
        public final int mo102096a() {
            if (this.f107812b) {
                if (this.f107811a) {
                    return 1000;
                }
                return 1001;
            } else if (this.f107811a) {
                return 1002;
            } else {
                return 1003;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$b */
    static final class C41443b<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C41441b f107813a;

        C41443b(C41441b bVar) {
            this.f107813a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f107813a.mo102094b();
        }
    }

    /* renamed from: d */
    private final boolean m132086d() {
        if (this.f107809b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo102094b() {
        m132085a(this.f107808a.mo102096a());
        this.f107809b = null;
    }

    /* renamed from: c */
    public final void mo102095c() {
        if (m132086d()) {
            this.f107808a.f107812b = true;
            C7321c cVar = this.f107809b;
            if (cVar != null) {
                cVar.dispose();
            }
            mo102094b();
        }
    }

    /* renamed from: a */
    public final void mo102093a() {
        if (this.f107810c < 0) {
            this.f107810c = C35563c.f93231M.mo93306b(Property.PublishOnNewIntentCheckDelay);
        }
        if (this.f107810c > 0) {
            if (m132086d()) {
                m132085a(1010);
                C7321c cVar = this.f107809b;
                if (cVar != null) {
                    cVar.dispose();
                }
            }
            this.f107808a = new C41442a();
            this.f107809b = C7319aa.m22922a((long) this.f107810c, TimeUnit.SECONDS).mo19135b(C47549a.m148327a()).mo19140d((C7326g<? super T>) new C41443b<Object>(this));
        }
    }

    /* renamed from: a */
    private final void m132085a(int i) {
        StringBuilder sb = new StringBuilder("new_intent_invoke_after_publish stateCode:");
        sb.append(i);
        sb.append(" delayTime:");
        sb.append(this.f107810c);
        sb.append(' ');
        C41530am.m132280a(sb.toString());
        C6893q.m21444a("new_intent_invoke_after_publish", i, C6869c.m21381a().mo16885a("delayTime", Integer.valueOf(this.f107810c)).mo16888b());
    }
}
