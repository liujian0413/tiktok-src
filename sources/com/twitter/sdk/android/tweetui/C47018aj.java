package com.twitter.sdk.android.tweetui;

import android.os.Handler;
import android.support.p022v4.util.C0894f;
import android.text.TextUtils;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46940l;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46959o;

/* renamed from: com.twitter.sdk.android.tweetui.aj */
final class C47018aj {

    /* renamed from: a */
    public final C46969q f120650a;

    /* renamed from: b */
    final C0894f<Long, C46959o> f120651b;

    /* renamed from: c */
    final C0894f<Long, C47084k> f120652c;

    /* renamed from: d */
    private final Handler f120653d;

    /* renamed from: e */
    private final C46939k<C46972t> f120654e;

    /* renamed from: com.twitter.sdk.android.tweetui.aj$a */
    class C47021a extends C46821b<C46959o> {

        /* renamed from: a */
        final C46821b<C46959o> f120661a;

        /* renamed from: a */
        public final void mo29989a(TwitterException twitterException) {
            this.f120661a.mo29989a(twitterException);
        }

        /* renamed from: a */
        public final void mo29990a(C46830i<C46959o> iVar) {
            C46959o oVar = (C46959o) iVar.f120123a;
            C47018aj.this.mo118224b(oVar);
            if (this.f120661a != null) {
                this.f120661a.mo29990a(new C46830i<>(oVar, iVar.f120124b));
            }
        }

        C47021a(C46821b<C46959o> bVar) {
            this.f120661a = bVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118224b(C46959o oVar) {
        this.f120651b.mo3342a(Long.valueOf(oVar.f120435i), oVar);
    }

    /* renamed from: a */
    private void m146996a(C46821b<C46972t> bVar) {
        C46972t tVar = (C46972t) this.f120654e.mo117913a();
        if (tVar == null) {
            bVar.mo29989a((TwitterException) new TwitterAuthException("User authorization required"));
        } else {
            bVar.mo29990a(new C46830i<>(tVar, null));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C47084k mo118221a(C46959o oVar) {
        if (oVar == null) {
            return null;
        }
        C47084k kVar = (C47084k) this.f120652c.mo3341a(Long.valueOf(oVar.f120435i));
        if (kVar != null) {
            return kVar;
        }
        C47084k a = C47028ap.m147034a(oVar);
        if (a != null && !TextUtils.isEmpty(a.f120822a)) {
            this.f120652c.mo3342a(Long.valueOf(oVar.f120435i), a);
        }
        return a;
    }

    C47018aj(Handler handler, C46939k<C46972t> kVar) {
        this(handler, kVar, C46969q.m146847a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118223b(long j, C46821b<C46959o> bVar) {
        final long j2 = j;
        final C46821b<C46959o> bVar2 = bVar;
        C470202 r0 = new C47092r<C46972t>(bVar, C46940l.m146821d()) {
            /* renamed from: a */
            public final void mo29990a(C46830i<C46972t> iVar) {
                C47018aj.this.f120650a.mo118103a((C46972t) iVar.f120123a).mo118096b().destroy(Long.valueOf(j2), Boolean.valueOf(false)).mo123283a(bVar2);
            }
        };
        m146996a((C46821b<C46972t>) r0);
    }

    /* renamed from: a */
    private void m146998a(C46959o oVar, C46821b<C46959o> bVar) {
        if (bVar != null) {
            this.f120653d.post(new C47022ak(bVar, oVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo118225c(long j, C46821b<C46959o> bVar) {
        C46959o oVar = (C46959o) this.f120651b.mo3341a(Long.valueOf(j));
        if (oVar != null) {
            m146998a(oVar, bVar);
        } else {
            this.f120650a.mo118105d().mo118097c().show(Long.valueOf(j), null, null, null).mo123283a(new C47021a(bVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118222a(long j, C46821b<C46959o> bVar) {
        final long j2 = j;
        final C46821b<C46959o> bVar2 = bVar;
        C470191 r0 = new C47092r<C46972t>(bVar, C46940l.m146821d()) {
            /* renamed from: a */
            public final void mo29990a(C46830i<C46972t> iVar) {
                C47018aj.this.f120650a.mo118103a((C46972t) iVar.f120123a).mo118096b().create(Long.valueOf(j2), Boolean.valueOf(false)).mo123283a(bVar2);
            }
        };
        m146996a((C46821b<C46972t>) r0);
    }

    private C47018aj(Handler handler, C46939k<C46972t> kVar, C46969q qVar) {
        this.f120650a = qVar;
        this.f120653d = handler;
        this.f120654e = kVar;
        this.f120651b = new C0894f<>(20);
        this.f120652c = new C0894f<>(20);
    }
}
