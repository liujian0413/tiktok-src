package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.listener.C28517b;
import com.p280ss.android.ugc.aweme.feed.listener.C28518c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p280ss.android.ugc.aweme.main.C32958db;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42695c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment */
public abstract class BaseFeedListFragment<T extends C25674b> extends FeedFragment implements C28132ae, C28517b, C28518c, C29026x {

    /* renamed from: e */
    protected LoadMoreFrameLayout f75582e;

    /* renamed from: f */
    protected View f75583f;

    /* renamed from: g */
    protected FeedSwipeRefreshLayout f75584g;

    /* renamed from: h */
    DmtStatusView f75585h;

    /* renamed from: i */
    protected T f75586i;

    /* renamed from: j */
    protected C23389b f75587j;

    /* renamed from: k */
    private boolean f75588k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DmtStatusView mo73769a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract T mo73773i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo73774j();

    /* renamed from: m */
    public void mo73776m() {
    }

    /* renamed from: d */
    private boolean mo72130d() {
        if (this.f75585h == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo67746g() {
        if (!mo73775l()) {
            return false;
        }
        return mo73774j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo73775l() {
        if (!this.f75586i.mo66540i()) {
            return true;
        }
        return false;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f75586i != null) {
            this.f75586i.mo59134U_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo73777n() {
        if (!(getActivity() instanceof C33054j) || !ScrollSwitchStateManager.m98918a(getActivity()).mo79723b("page_feed") || !((C33054j) getActivity()).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo67739a(Aweme aweme) {
        return this.f75586i.mo66569a((Object) aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73770a(C10803a aVar) {
        if (this.f75584g != null) {
            this.f75584g.mo60699a(false, (int) C9738o.m28708b((Context) getActivity(), 49.0f), (int) C9738o.m28708b((Context) getActivity(), 113.0f));
            this.f75587j = new C32958db(this.f75584g);
        }
    }

    /* renamed from: b */
    public final DmtStatusView mo73771b(boolean z) {
        if (mo72130d() && z && this.f75588k && getContext() != null) {
            this.f75585h = mo73769a(getContext());
            this.f75585h.setBackgroundColor(getContext().getResources().getColor(R.color.lw));
            this.f75582e.addView(this.f75585h, new LayoutParams(-1, -1));
        }
        return this.f75585h;
    }

    /* renamed from: d_ */
    public boolean mo73772d_(boolean z) {
        if (!isViewValid()) {
            return false;
        }
        if (!C28893d.m95059a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            this.f75587j.setRefreshing(false);
            C42961az.m136380a(new C28309ae());
            return false;
        } else if (!this.f75586i.mo66540i()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo67740a(String str) {
        boolean a = this.f75586i.mo66569a((Object) ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" deleteItem :");
        sb.append(a);
        C6921a.m21552a(4, "BaseFeedListFragment", sb.toString());
        return a;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f75588k = true;
        this.f75582e = (LoadMoreFrameLayout) view.findViewById(R.id.bua);
        this.f75583f = view.findViewById(R.id.ajj);
        this.f75584g = (FeedSwipeRefreshLayout) view.findViewById(R.id.cr7);
        mo73770a((C10803a) null);
        this.f75584g.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                BaseFeedListFragment.this.mo73772d_(false);
                C42961az.m136380a(new C42695c(0));
            }
        });
        this.f75586i = mo73773i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((X2CFragmentFeed) C7121a.m22249b(X2CFragmentFeed.class)).getView(getContext(), R.layout.fragment_feed);
    }
}
