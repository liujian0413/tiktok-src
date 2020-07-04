package com.p280ss.android.ugc.aweme.notification;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService;
import com.p280ss.android.ugc.aweme.notification.model.NoticeModel;
import com.p280ss.android.ugc.aweme.notification.p1434c.C34422h;
import com.p280ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.NotificationDetailFragment */
public class NotificationDetailFragment extends AmeBaseFragment implements C1032b, C6905a, C25675c<BaseNotice> {

    /* renamed from: e */
    public DmtStatusView f89627e;

    /* renamed from: f */
    private boolean f89628f;

    /* renamed from: g */
    private int f89629g;

    /* renamed from: h */
    private int f89630h;

    /* renamed from: i */
    private RecyclerView f89631i;

    /* renamed from: j */
    private SwipeRefreshLayout f89632j;

    /* renamed from: k */
    private NotificationAdapter f89633k;

    /* renamed from: l */
    private C34422h f89634l;

    /* renamed from: m */
    private C10805b f89635m;

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<BaseNotice> list, boolean z) {
    }

    /* renamed from: e */
    private void m111116e() {
        this.f89630h = 46;
        onRefresh();
    }

    public final void aD_() {
        this.f89633k.ag_();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f89634l != null) {
            this.f89634l.mo59134U_();
        }
    }

    public final void bd_() {
        this.f89634l.mo56976a(Integer.valueOf(4), Integer.valueOf(this.f89630h), null);
    }

    /* renamed from: f */
    private void m111117f() {
        this.f89632j.setOnRefreshListener(this);
        this.f89631i.mo5528a((C1281m) new FrescoRecycleViewScrollListener(getActivity()));
        this.f89634l.mo66536a(new NoticeModel());
        this.f89634l.mo66537a(this);
        this.f89633k.mo66504a((C6905a) this);
        this.f89633k.mo66516d(true);
        this.f89633k.ah_();
        this.f89631i.setAdapter(this.f89633k);
        this.f89627e.mo25942f();
    }

    public final void ae_() {
        if (this.f89633k.f67566v) {
            this.f89633k.mo66516d(false);
            this.f89633k.notifyDataSetChanged();
            this.f89633k.ah_();
        }
        this.f89632j.setRefreshing(false);
        if (this.f89633k.getItemCount() == 0) {
            this.f89627e.mo25943g();
        }
    }

    /* renamed from: g */
    private void m111118g() {
        this.f89635m = new C10806a(getActivity()).mo25990b((int) R.string.bzv).mo25991b("").f29135a;
        this.f89627e.setBuilder(C10803a.m31631a((Context) getActivity()).mo25953a().mo25961a(this.f89635m).mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                NotificationDetailFragment.this.onRefresh();
            }
        }));
    }

    public void onRefresh() {
        if (C34453i.m111416a(getActivity())) {
            if (this.f89633k.getItemCount() == 0) {
                this.f89627e.mo25942f();
            }
            this.f89634l.mo56976a(Integer.valueOf(1), Integer.valueOf(this.f89630h), null);
            return;
        }
        if (this.f89633k.getItemCount() == 0) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (NotificationDetailFragment.this.isViewValid()) {
                        NotificationDetailFragment.this.f89627e.mo25944h();
                        C10761a.m31399c((Context) NotificationDetailFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f89633k.mo66508i();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f89633k.f67566v) {
            this.f89633k.mo66516d(false);
            this.f89633k.notifyDataSetChanged();
        }
        this.f89632j.setRefreshing(false);
        if (this.f89633k.getItemCount() == 0) {
            this.f89627e.mo25944h();
        }
    }

    /* renamed from: a */
    private void m111115a(View view) {
        this.f89627e = (DmtStatusView) view.findViewById(R.id.dav);
        m111118g();
        this.f89632j = (SwipeRefreshLayout) view.findViewById(R.id.c7s);
        this.f89631i = (RecyclerView) view.findViewById(R.id.c7m);
        this.f89633k = ((INoticeBridgeService) ServiceManager.get().getService(INoticeBridgeService.class)).getNotificationAdapter(this.f89629g, getActivity(), 0, "message", this.f89630h);
        this.f89634l = new C34422h();
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(1, (int) C9738o.m28708b((Context) getActivity(), 1.0f), 0);
        this.f89631i.setLayoutManager(new FixedLinearlayoutManager(getActivity()));
        this.f89631i.mo5525a((C1272h) recyclerItemDecoration);
    }

    /* renamed from: b */
    public final void mo59108b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f89633k.ah_();
        } else {
            this.f89633k.ai_();
        }
        this.f89633k.mo61577b(list);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f89629g = getArguments().getInt("from_where", -1);
        m111115a(view);
        m111117f();
        m111116e();
    }

    /* renamed from: a */
    public final void mo59099a(List<BaseNotice> list, boolean z) {
        this.f89633k.mo66516d(true);
        if (this.f89628f) {
            this.f89633k.mo87682f();
        }
        this.f89628f = true;
        if (!z) {
            this.f89633k.ah_();
        } else {
            this.f89633k.ai_();
        }
        this.f89632j.setRefreshing(false);
        this.f89633k.mo58045a(list);
        this.f89627e.mo25939d();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pm, viewGroup, false);
    }
}
