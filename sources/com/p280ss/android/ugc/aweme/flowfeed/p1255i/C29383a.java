package com.p280ss.android.ugc.aweme.flowfeed.p1255i;

import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.adapter.FlowFeedAdapter;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21754e;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.i.a */
public abstract class C29383a<T extends FlowFeedAdapter, D extends C34145b> implements C23386b, C6905a, C25663d<C1293v>, C25672e, C29400c {

    /* renamed from: a */
    protected SwipeRefreshLayout f77422a;

    /* renamed from: b */
    public NestedScrollingRecyclerView f77423b;

    /* renamed from: c */
    protected DmtStatusView f77424c;

    /* renamed from: d */
    protected NoticeView f77425d;

    /* renamed from: e */
    public DmtTextView f77426e;

    /* renamed from: f */
    public T f77427f;

    /* renamed from: g */
    public LinearLayoutManager f77428g;

    /* renamed from: h */
    public AbsFragment f77429h;

    /* renamed from: i */
    public C29359f f77430i;

    /* renamed from: j */
    public boolean f77431j;

    /* renamed from: k */
    private C21745c f77432k;

    /* renamed from: a */
    public void mo61737a(C1293v vVar) {
    }

    /* renamed from: a */
    public void mo75145a(Integer num) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo75155a(List<D> list) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo75157b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo75164c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo75167e();

    /* renamed from: g */
    public void mo75169g() {
    }

    /* renamed from: a */
    public void mo75152a(List<D> list, boolean z) {
        if (isViewValid()) {
            if (this.f77424c != null) {
                this.f77424c.mo25939d();
                this.f77424c.setVisibility(8);
            }
            this.f77423b.setVisibility(0);
            if (this.f77427f != null && mo75155a(list)) {
                this.f77427f.mo58045a(list);
            }
            mo75162b(z);
        }
    }

    /* renamed from: a */
    public final void mo75153a(boolean z) {
        if (this.f77422a != null) {
            this.f77422a.setRefreshing(z);
        }
    }

    /* renamed from: a */
    public final void mo75142a(C21754e eVar) {
        if (this.f77427f != null && eVar != null) {
            this.f77427f.mo58039a(eVar.f58264a);
        }
    }

    /* renamed from: a */
    public void mo75141a(C21750a aVar) {
        if (this.f77427f != null) {
            if (aVar.f58255a == 1) {
                this.f77427f.mo58055c(aVar.f58256b);
            } else if (aVar.f58255a == 4) {
                this.f77427f.mo58055c(aVar.f58256b);
            }
        }
    }

    /* renamed from: a */
    public final void mo75148a(String str, Comment comment) {
        this.f77427f.mo58041a(str, comment);
    }

    /* renamed from: a */
    public final void mo75150a(String str, String str2) {
        this.f77427f.mo58043a(str, str2);
    }

    /* renamed from: a */
    public final void mo75151a(String str, String str2, int i) {
        this.f77427f.mo58044a(str, str2, i);
    }

    /* renamed from: a */
    public final void mo75147a(String str, int i) {
        this.f77427f.mo58040a(str, i);
    }

    /* renamed from: a */
    public final void mo75146a(String str) {
        this.f77427f.mo58052b(str);
    }

    /* renamed from: a */
    public void mo75149a(String str, ForwardDetail forwardDetail) {
        if (forwardDetail != null) {
            this.f77427f.mo58042a(str, forwardDetail.getAweme(), 0);
            this.f77427f.mo58041a(str, forwardDetail.getComment());
        }
    }

    /* renamed from: a */
    public final void mo75143a(C29359f fVar) {
        this.f77430i = fVar;
    }

    /* renamed from: a */
    public final void mo75144a(final Exception exc, final Aweme aweme) {
        if (isViewValid()) {
            if (C6903bc.m21483b().mo61553a(exc)) {
                C6903bc.m21483b().mo61552a(this.f77429h.getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        C29383a.this.f77430i.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C29383a.this.f77427f.mo58038a(exc, aweme, C29383a.this.f77430i.mo75085e());
                    }
                });
            } else {
                this.f77427f.mo58038a(exc, aweme, this.f77430i.mo75085e());
            }
        }
    }

    /* renamed from: a */
    public void mo75154a(boolean z, Aweme aweme) {
        if (!C29369d.m96463a()) {
            this.f77427f.mo58046a(z, aweme);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C21744b mo75166d() {
        return new C21744b() {
            /* renamed from: d */
            public final String mo58075d() {
                return "key_container_default";
            }

            /* renamed from: e */
            public final Object mo58076e() {
                return C29383a.this.f77427f;
            }

            /* renamed from: a */
            public final boolean mo58072a() {
                if (C29383a.this.f77429h == null || !C29383a.this.f77429h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo58074c() {
                if (C29383a.this.f77429h != null) {
                    return C29383a.this.f77429h.getActivity();
                }
                return C29383a.this.f77423b.getContext();
            }

            /* renamed from: b */
            public final boolean mo58073b() {
                if (C29383a.this.f77429h == null || !C29383a.this.f77429h.getLifecycle().mo54a().equals(State.RESUMED) || !C29383a.this.f77429h.mUserVisibleHint) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: f */
    public final void mo75168f() {
        if (this.f77432k != null) {
            this.f77432k.mo58064j();
        }
    }

    public Context getContext() {
        if (this.f77429h != null) {
            return this.f77429h.getActivity();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo75171h() {
        if (this.f77432k != null) {
            this.f77432k.aW_();
        }
    }

    public boolean isViewValid() {
        if (this.f77429h == null || !this.f77429h.isViewValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo75173j() {
        this.f77429h = null;
        if (this.f77432k != null) {
            this.f77432k.mo58065k();
        }
    }

    /* renamed from: k */
    public final int mo75174k() {
        if (this.f77427f == null) {
            return 0;
        }
        return this.f77427f.mo60557c();
    }

    /* renamed from: a */
    public void mo60744a() {
        if (isViewValid()) {
            if (!C29387b.m96566a(getContext())) {
                C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
            } else {
                mo75167e();
            }
        }
    }

    /* renamed from: a */
    public final void mo75137a(C28308ad adVar) {
        this.f77427f.mo58034a(adVar);
    }

    /* renamed from: b */
    public final Aweme mo75156b(Aweme aweme) {
        if (this.f77427f == null) {
            return null;
        }
        return this.f77427f.mo58048b(aweme);
    }

    /* renamed from: a */
    public final void mo75138a(Aweme aweme) {
        this.f77427f.mo58056c(aweme);
    }

    /* renamed from: b */
    public void mo75158b(String str) {
        int d = this.f77427f.mo58057d(str);
        if (d >= 0) {
            this.f77427f.mo58055c(d);
        }
    }

    /* renamed from: c */
    public final void mo75165c(boolean z) {
        if (this.f77432k != null) {
            if (z) {
                this.f77432k.mo58064j();
                return;
            }
            this.f77432k.aW_();
        }
    }

    /* renamed from: b */
    public final void mo75160b(List<D> list) {
        if (this.f77427f != null) {
            this.f77427f.mo58045a(null);
        }
    }

    /* renamed from: a */
    public void mo75133a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    if (this.f77424c != null) {
                        this.f77424c.setVisibility(0);
                        this.f77423b.setVisibility(4);
                        this.f77424c.mo25944h();
                    }
                    if (this.f77427f != null) {
                        this.f77427f.ah_();
                        return;
                    }
                    break;
                case 2:
                    if (!(this.f77427f == null || this.f77424c == null)) {
                        this.f77424c.setVisibility(0);
                        this.f77424c.mo25942f();
                        return;
                    }
                case 3:
                    mo75160b(null);
                    if (this.f77424c != null) {
                        this.f77424c.setVisibility(8);
                    }
                    if (this.f77427f != null) {
                        this.f77427f.ah_();
                        return;
                    }
                    break;
                case 4:
                    if (this.f77424c != null) {
                        this.f77424c.mo25939d();
                        this.f77424c.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo75134a(View view) {
        this.f77422a = (SwipeRefreshLayout) view.findViewById(R.id.cr7);
        this.f77423b = (NestedScrollingRecyclerView) view.findViewById(R.id.bnf);
        this.f77424c = (DmtStatusView) view.findViewById(R.id.dag);
        this.f77425d = (NoticeView) view.findViewById(R.id.anv);
        this.f77426e = (DmtTextView) view.findViewById(R.id.ao0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo75162b(boolean z) {
        this.f77431j = z;
        if (this.f77427f != null) {
            this.f77427f.mo66516d(true);
            if (z) {
                this.f77427f.ai_();
                return;
            }
            this.f77427f.ah_();
        }
    }

    /* renamed from: b */
    public boolean mo75163b(int i) {
        if (!isViewValid()) {
            return true;
        }
        switch (i) {
            case 1:
                if (this.f77427f != null) {
                    this.f77427f.mo66508i();
                }
                return true;
            case 2:
                if (this.f77427f != null) {
                    this.f77427f.ag_();
                }
                return true;
            case 3:
                if (this.f77427f != null) {
                    this.f77427f.ah_();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void mo75159b(String str, Comment comment) {
        this.f77427f.mo58053b(str, comment);
    }

    /* renamed from: b */
    public void mo75161b(List<D> list, boolean z) {
        if (isViewValid()) {
            if (this.f77427f != null) {
                this.f77427f.mo61577b(list);
            }
            mo75162b(z);
        }
    }

    /* renamed from: a */
    public final void mo75139a(Aweme aweme, String str) {
        this.f77427f.mo58036a(aweme, str);
    }

    /* renamed from: a */
    public final void mo75140a(Aweme aweme, boolean z, String str, long j) {
        this.f77427f.mo58037a(aweme, z, str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75135a(AbsFragment absFragment, View view, C21747e eVar, C21743a aVar, String str, int i, String str2) {
        mo75136a(absFragment, view, eVar, aVar, str, i, "", str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75136a(AbsFragment absFragment, View view, C21747e eVar, C21743a aVar, String str, int i, String str2, String str3) {
        this.f77429h = absFragment;
        mo75134a(view);
        this.f77428g = new WrapLinearLayoutManager(this.f77429h.getContext());
        this.f77428g.mo5427b(1);
        this.f77423b.setLayoutManager(this.f77428g);
        this.f77427f = mo75164c();
        this.f77427f.f58244h = eVar;
        this.f77427f.f58245i = aVar;
        this.f77427f.f58247k = mo75166d();
        this.f77427f.mo66504a((C6905a) this);
        this.f77427f.f58246j = this;
        this.f77427f.f58251z = str;
        this.f77427f.f58236A = str2;
        this.f77427f.f58238C = i;
        this.f77427f.f58250y = str3;
        this.f77423b.setAdapter(this.f77427f);
        this.f77423b.mo5528a((C1281m) new C1281m() {

            /* renamed from: a */
            boolean f77433a;

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (this.f77433a && C29383a.this.f77428g.mo5447l() >= C29383a.this.f77428g.mo5744A() - 5 && C29383a.this.f77431j) {
                    C29383a.this.mo75145a(Integer.valueOf(5));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f77433a = z;
            }
        });
        if (this.f77422a != null) {
            this.f77422a.setOnRefreshListener(this);
        }
        this.f77432k = this.f77427f.mo58066l();
        mo75157b();
    }
}
