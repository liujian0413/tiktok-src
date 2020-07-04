package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.i.o */
public final class C28462o extends C25674b<C29452a> {

    /* renamed from: a */
    public C28467s f75060a;

    /* renamed from: d */
    public boolean f75061d;

    /* renamed from: e */
    private boolean f75062e;

    /* renamed from: f */
    private boolean f75063f;

    /* renamed from: g */
    private boolean f75064g;

    /* renamed from: h */
    private C25676d f75065h;

    /* renamed from: U_ */
    public final void mo59134U_() {
        super.mo59134U_();
        this.f75065h = null;
    }

    /* renamed from: e */
    public final boolean mo72200e() {
        if (this.f67571b == null || !((C29452a) this.f67571b).f77667h) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m93555j() {
        if (this.f75062e) {
            this.f75062e = false;
            ((C29452a) this.f67571b).f77663d = false;
        }
        m93556k();
    }

    /* renamed from: k */
    private void m93556k() {
        if (this.f75064g) {
            C42961az.m136380a(new C28309ae("DISCOVER"));
        } else {
            C42961az.m136380a(new C28309ae());
        }
    }

    /* renamed from: f */
    public final boolean mo72201f() {
        if (this.f67571b == null || !((C29452a) this.f67571b).isDataEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final List<String> mo72202g() {
        if (this.f67571b != null) {
            return m93554a(((C29452a) this.f67571b).f77666g);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo56977b() {
        boolean z;
        m93555j();
        boolean z2 = true;
        if (this.f75060a != null) {
            C28467s sVar = this.f75060a;
            if (!this.f75063f || this.f75061d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f75063f = false;
        this.f75061d = false;
        if (this.f67571b != null) {
            int i = ((C29452a) this.f67571b).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C29452a) this.f67571b).isDataEmpty()) {
                            if (this.f67572c != null) {
                                ((C25675c) this.f67572c).ae_();
                                return;
                            }
                        } else if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59099a(((C29452a) this.f67571b).mo75452e(), ((C29452a) this.f67571b).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59110c(((C29452a) this.f67571b).mo75452e(), true ^ ((C29452a) this.f67571b).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f67572c != null) {
                C25675c cVar = (C25675c) this.f67572c;
                List e = ((C29452a) this.f67571b).mo75452e();
                if (!((C29452a) this.f67571b).isHasMore() || ((C29452a) this.f67571b).isNewDataEmpty()) {
                    z2 = false;
                }
                cVar.mo59108b(e, z2);
            }
        }
    }

    /* renamed from: a */
    public final void mo66568a(C25676d dVar) {
        this.f75065h = dVar;
    }

    /* renamed from: a */
    public final void mo59135a(int i) {
        if (this.f75065h != null) {
            this.f75065h.mo61747c_(i);
        }
    }

    /* renamed from: a */
    private static List<String> m93554a(List<FollowFeed> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme().getAid());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        boolean z;
        m93555j();
        if (this.f75060a != null) {
            C28467s sVar = this.f75060a;
            if (!this.f75063f || this.f75061d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f75063f = false;
        this.f75061d = false;
        if (this.f67571b != null) {
            int i = ((C29452a) this.f67571b).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59105a_(exc);
                            break;
                        }
                        break;
                    case 2:
                        if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59109c(exc);
                            break;
                        }
                        break;
                }
            } else if (this.f67572c != null) {
                ((C25675c) this.f67572c).mo59107b(exc);
            }
            if (exc instanceof ApiServerException) {
                C6907h.m21524a("homepage_follow_monitor", (Map) C22984d.m75611a().mo59973a("error_type", "follow_feed_error").mo59970a("error_code", ((ApiServerException) exc).getErrorCode()).f60753a);
            } else {
                C6907h.m21524a("homepage_follow_monitor", (Map) C22984d.m75611a().mo59973a("error_type", "follow_feed_error").mo59970a("error_code", 4).f60753a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo66569a(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((C29452a) this.f67571b).getItems();
            if (!C6307b.m19566a((Collection<T>) items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    if (TextUtils.equals(((Aweme) obj).getAid(), C33230ac.m107238m(((FollowFeed) items.get(i)).getAweme()))) {
                        mo59135a(i);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        if (this.f75060a != null) {
            this.f75060a.mo67623d(this.f75061d);
        }
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    public final void mo59136a(List list, int i) {
        if (this.f75065h != null) {
            this.f75065h.mo61742a(list, i);
        }
    }

    /* renamed from: a */
    public final void mo72199a(boolean z, boolean z2) {
        ((C29452a) this.f67571b).f77663d = z;
        this.f75062e = z;
        this.f75064g = z2;
    }

    /* renamed from: a */
    public final boolean mo66570a(Object obj, int i) {
        List items = ((C29452a) this.f67571b).getItems();
        if (C6307b.m19566a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, (FollowFeed) obj);
        ((C29452a) this.f67571b).setItems(items);
        if (this.f67572c != null) {
            if (((C29452a) this.f67571b).isDataEmpty()) {
                ((C25675c) this.f67572c).ae_();
            } else {
                mo59136a(((C29452a) this.f67571b).mo75452e(), i);
            }
        }
        return true;
    }
}
