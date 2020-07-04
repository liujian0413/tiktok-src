package com.twitter.sdk.android.tweetui;

import android.database.DataSetObservable;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46950g;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.ad */
final class C47009ad<T extends C46950g> {

    /* renamed from: a */
    public final C47007ab<T> f120633a;

    /* renamed from: b */
    final DataSetObservable f120634b;

    /* renamed from: c */
    final C47013af f120635c;

    /* renamed from: d */
    List<T> f120636d;

    /* renamed from: com.twitter.sdk.android.tweetui.ad$a */
    class C47010a extends C46821b<C47012ae<T>> {

        /* renamed from: a */
        final C46821b<C47012ae<T>> f120637a = null;

        /* renamed from: b */
        final C47013af f120638b;

        /* renamed from: a */
        public final void mo29989a(TwitterException twitterException) {
            this.f120638b.mo118218c();
            if (this.f120637a != null) {
                this.f120637a.mo29989a(twitterException);
            }
        }

        /* renamed from: a */
        public void mo29990a(C46830i<C47012ae<T>> iVar) {
            this.f120638b.mo118218c();
            if (this.f120637a != null) {
                this.f120637a.mo29990a(iVar);
            }
        }

        C47010a(C46821b<C47012ae<T>> bVar, C47013af afVar) {
            this.f120638b = afVar;
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.ad$b */
    class C47011b extends C47010a {
        /* renamed from: a */
        public final void mo29990a(C46830i<C47012ae<T>> iVar) {
            if (((C47012ae) iVar.f120123a).f120642b.size() > 0) {
                C47009ad.this.f120636d.addAll(((C47012ae) iVar.f120123a).f120642b);
                C47009ad.this.mo118214b();
                this.f120638b.mo118216a(((C47012ae) iVar.f120123a).f120641a);
            }
            super.mo29990a(iVar);
        }

        C47011b(C47013af afVar) {
            super(null, afVar);
        }
    }

    /* renamed from: a */
    public final int mo118212a() {
        return this.f120636d.size();
    }

    /* renamed from: b */
    public final void mo118214b() {
        this.f120634b.notifyChanged();
    }

    /* renamed from: c */
    private void m146976c() {
        m146974a(this.f120635c.mo118215a(), new C47011b(this.f120635c));
    }

    /* renamed from: d */
    private boolean m146977d() {
        if (((long) this.f120636d.size()) < 200) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m146975b(int i) {
        if (i == this.f120636d.size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final T mo118213a(int i) {
        if (m146975b(i)) {
            m146976c();
        }
        return (C46950g) this.f120636d.get(i);
    }

    /* renamed from: a */
    private void m146974a(Long l, C46821b<C47012ae<T>> bVar) {
        if (!m146977d()) {
            bVar.mo29989a(new TwitterException("Max capacity reached"));
        } else if (this.f120635c.mo118217b()) {
            this.f120633a.mo118179a(l, bVar);
        } else {
            bVar.mo29989a(new TwitterException("Request already in flight"));
        }
    }
}
