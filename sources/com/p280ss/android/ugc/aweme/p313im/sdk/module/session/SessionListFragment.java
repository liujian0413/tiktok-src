package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.adapter.NewSessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1337b.C31498a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.p1335a.C31483a;
import com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31083h;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6967g;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C32008b;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListFragment */
public class SessionListFragment extends AmeBaseFragment implements C6905a, C7095a {

    /* renamed from: e */
    public View f19770e;

    /* renamed from: f */
    public NewSessionListAdapter f19771f;

    /* renamed from: g */
    public DmtStatusView f19772g;

    /* renamed from: h */
    public int f19773h = -1;

    /* renamed from: i */
    public int f19774i = -1;

    /* renamed from: j */
    private View f19775j;

    /* renamed from: k */
    private View f19776k;

    /* renamed from: l */
    private RecyclerView f19777l;

    /* renamed from: m */
    private View f19778m;

    /* renamed from: n */
    private RecyclerView f19779n;

    /* renamed from: o */
    private LinearLayoutManager f19780o;

    /* renamed from: p */
    private C31498a f19781p;

    /* renamed from: q */
    private C31488e f19782q;

    /* renamed from: r */
    private Boolean f19783r = Boolean.valueOf(true);

    /* renamed from: s */
    private String f19784s = "";

    /* renamed from: t */
    private C32008b f19785t;

    /* renamed from: u */
    private C1281m f19786u = new C1281m() {
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 2) {
                SessionListFragment.this.mo18100a(recyclerView);
            }
            if (i == 0) {
                SessionListFragment.this.mo18100a(recyclerView);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int j = linearLayoutManager.mo5445j();
                int l = linearLayoutManager.mo5447l();
                if (SessionListFragment.this.f19773h == -1 || SessionListFragment.this.f19774i == -1) {
                    SessionListFragment.this.f19773h = j;
                    SessionListFragment.this.f19774i = l;
                    return;
                }
                if (SessionListFragment.this.f19773h < j) {
                    SessionListFragment.this.mo18099a(linearLayoutManager, SessionListFragment.this.f19773h, j - 1);
                }
                if (SessionListFragment.this.f19774i > l) {
                    SessionListFragment.this.mo18099a(linearLayoutManager, l + 1, SessionListFragment.this.f19774i);
                }
                SessionListFragment.this.f19773h = j;
                SessionListFragment.this.f19774i = l;
            }
        }
    };

    /* renamed from: o */
    private void m21815o() {
        getActivity();
    }

    /* renamed from: d */
    public final Fragment mo18105d() {
        return this;
    }

    /* renamed from: e */
    public final void mo18106e() {
    }

    /* renamed from: f */
    public final void mo18107f() {
    }

    public void onPause() {
        super.onPause();
    }

    public final void bd_() {
        this.f19781p.f82484b.mo82221f();
    }

    /* renamed from: g */
    public final void mo18108g() {
        C31487d.m102389a(this.f19779n, this.f19771f);
    }

    public void onStop() {
        super.onStop();
        m21815o();
    }

    /* renamed from: j */
    private void m21810j() {
        this.f19779n.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C31083h.m101385c();
                }
            }
        });
    }

    /* renamed from: l */
    private void m21812l() {
        this.f19770e.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo18109a() {
                SessionListFragment.this.f19772g.requestLayout();
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LayoutParams layoutParams = (LayoutParams) SessionListFragment.this.f19772g.getLayoutParams();
                layoutParams.topMargin = SessionListFragment.this.f19770e.getHeight();
                SessionListFragment.this.f19772g.setLayoutParams(layoutParams);
                SessionListFragment.this.f19772g.post(new C31489f(this));
            }
        });
    }

    /* renamed from: a */
    public final void mo18098a() {
        if (C31490g.m102392a(getActivity())) {
            if (this.f19771f.mo82189j()) {
                this.f19772g.mo25942f();
            }
            C31863ai.m103532b();
            C7705c.m23799a().mo20394d("sessionListFragment-onMain");
            return;
        }
        if (this.f19771f.mo82189j()) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (SessionListFragment.this.isViewValid() && SessionListFragment.this.f19771f.getItemCount() <= 0) {
                        SessionListFragment.this.f19772g.mo25944h();
                        C10761a.m31399c((Context) SessionListFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                    }
                }
            }, 100);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C31083h.m101383b();
        C6951b.m21622a();
        if (this.f19781p != null) {
            this.f19781p.mo82202c();
        }
        C6978j.m21717a().mo18050b((C31483a<C7102a>) this.f19781p);
        if (this.f19779n != null) {
            this.f19779n.setAdapter(null);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f19783r.booleanValue()) {
            getActivity();
        }
        C31863ai.m103532b();
        if (!this.f19783r.booleanValue()) {
            this.f19771f.mo82191l();
            this.f19781p.mo82203d();
        }
        C6978j.m21717a().mo18060k();
        this.f19783r = Boolean.valueOf(false);
    }

    /* renamed from: n */
    private static void m21814n() {
        if (!C31915n.m103671a()) {
            C7103h f = C6956a.m21632a().mo18009f();
            IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
            if (f != null && !f.isFFSDKBind() && iIMService != null && C7076p.m22077a().mo18326j()) {
                iIMService.onFlipChatPushMsgUpdate(C7076p.m22077a().mo18327k(), C7076p.m22077a().mo18328l());
            }
        }
    }

    /* renamed from: k */
    private void m21811k() {
        this.f19777l = (RecyclerView) this.f19770e.findViewById(R.id.cx5);
        this.f19782q = new C31488e(this.f19770e);
        getActivity();
        this.f19775j = this.f19770e.findViewById(R.id.bhl);
        this.f19770e.findViewById(R.id.duq).setTag("tag_msg_follow_request_count");
        this.f19770e.findViewById(R.id.any).setTag("tag_msg_follow_request_unread_dot");
        this.f19776k = this.f19770e.findViewById(R.id.bkk);
        this.f19770e.findViewById(R.id.ev).setTag("tag_msg_tutorial_video_head");
        this.f19770e.findViewById(R.id.dsf).setTag("tag_msg_tutorial_video_content");
        this.f19770e.findViewById(R.id.ry).setTag("tag_msg_tutorial_video_watch");
        if (!C7027a.f19815b.mo18138n() && this.f19785t != null) {
            this.f19785t.mo82978a(this.f19777l, this.f19775j, this.f19776k, (ViewStub) this.f19770e.findViewById(R.id.edh));
        }
    }

    /* renamed from: m */
    private void m21813m() {
        View view;
        if (C7027a.f19815b.mo18138n()) {
            MtEmptyView a = MtEmptyView.m31657a((Context) getActivity());
            a.setStatus(new C10806a(getActivity()).mo25985a((int) R.drawable.a76).mo25990b((int) R.string.c9f).mo25993c(R.string.c9e).f29135a);
            this.f19772g.setBuilder(C10803a.m31631a((Context) getActivity()).mo25963b((View) a).mo25953a().mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    SessionListFragment.this.mo18098a();
                }
            }));
        } else {
            C10806a c = new C10806a(getActivity()).mo25990b((int) R.string.bpp).mo25993c(R.string.bpo);
            if (C31915n.m103671a()) {
                view = MtEmptyView.m31657a((Context) getActivity());
                ((MtEmptyView) view).setStatus(c.mo25985a((int) R.drawable.ax2).f29135a);
            } else {
                view = new DmtDefaultView(getActivity());
                ((DmtDefaultView) view).setStatus(c.f29135a);
            }
            this.f19772g.setBuilder(C10803a.m31631a((Context) getActivity()).mo25963b(view).mo25953a().mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    SessionListFragment.this.mo18098a();
                }
            }));
            ViewGroup.LayoutParams layoutParams = this.f19772g.getLayoutParams();
            layoutParams.height = (int) C9738o.m28708b((Context) getActivity(), 404.0f);
            this.f19772g.setLayoutParams(layoutParams);
        }
        this.f19781p = new C31498a(this.f19771f, this.f19772g);
        this.f19781p.mo82198a(this.f19784s);
        C6978j.m21717a().mo18044a((C31483a<C7102a>) this.f19781p);
        m21814n();
        mo18098a();
    }

    /* renamed from: a */
    public final void mo18102a(C32008b bVar) {
        this.f19785t = bVar;
    }

    /* renamed from: a */
    public final void mo18103a(String str) {
        if (this.f19781p != null) {
            this.f19781p.mo82198a(str);
        }
        this.f19784s = str;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6967g.m21701d().mo18040b();
        C31083h.m101379a();
    }

    /* renamed from: a */
    public final void mo18100a(RecyclerView recyclerView) {
        int i;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if (this.f19778m != null) {
            View view = this.f19778m;
            if (canScrollVertically) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m21809b(View view) {
        this.f19779n = (RecyclerView) view.findViewById(R.id.d3h);
        this.f19772g = (DmtStatusView) view.findViewById(R.id.dav);
        this.f19778m = view.findViewById(R.id.bya);
        this.f19780o = new LinearLayoutManager(getActivity());
        this.f19779n.setLayoutManager(this.f19780o);
        this.f19779n.setItemViewCacheSize(4);
        this.f19771f = new NewSessionListAdapter();
        this.f19779n.mo5528a((C1281m) new FrescoRecycleViewScrollListener(getActivity()));
        this.f19779n.mo5528a(this.f19786u);
        this.f19771f.mo66504a((C6905a) this);
        this.f19771f.mo66516d(false);
        this.f19771f.ah_();
        this.f19770e = LayoutInflater.from(getContext()).inflate(R.layout.a8u, null, false);
        this.f19770e.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        m21812l();
        this.f19771f.mo82185c(this.f19770e);
        m21811k();
        this.f19779n.setAdapter(this.f19771f);
    }

    /* renamed from: a */
    public final void mo18101a(View view) {
        if (!view.equals(this.f19770e)) {
            this.f19770e = view;
        }
        if (this.f19771f != null) {
            this.f19771f.mo82185c(view);
        }
    }

    /* renamed from: a */
    public final void mo18104a(boolean z) {
        if (z) {
            m21815o();
            return;
        }
        if (!this.f19783r.booleanValue()) {
            getActivity();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m21809b(view);
        m21810j();
        m21813m();
        C6956a.m21632a().mo18011h();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.om, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo18099a(LinearLayoutManager linearLayoutManager, int i, int i2) {
        if (linearLayoutManager != null && i < i2) {
            while (i <= i2) {
                try {
                    Object obj = this.f19771f.mo62312a().get(i);
                    if (obj instanceof C7102a) {
                        C7102a aVar = (C7102a) obj;
                        if (aVar.f19950n) {
                            aVar.f19950n = false;
                        }
                    }
                    i++;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
