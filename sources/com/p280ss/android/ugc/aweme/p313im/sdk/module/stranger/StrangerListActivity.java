package com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C11469m;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.p1339a.C31530a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.p1340b.C31533a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.p1341c.C31534a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity */
public class StrangerListActivity extends AmeActivity implements C6905a {

    /* renamed from: d */
    private static final String f82522d = "StrangerListActivity";

    /* renamed from: a */
    public C31534a f82523a;

    /* renamed from: b */
    public DmtStatusView f82524b;

    /* renamed from: c */
    public ImTextTitleBar f82525c;

    /* renamed from: e */
    private RecyclerView f82526e;

    /* renamed from: f */
    private SessionListAdapter f82527f;

    /* renamed from: g */
    private C31533a f82528g;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public final void bd_() {
        this.f82528g.mo56976a(Integer.valueOf(4));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f82528g != null) {
            this.f82528g.mo59134U_();
        }
        if (this.f82523a != null) {
            this.f82523a.mo82240e();
        }
        if (this.f82526e != null) {
            this.f82526e.setAdapter(null);
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", true);
        super.onResume();
        if (this.f82528g != null) {
            mo82231a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", false);
    }

    /* renamed from: d */
    private void m102494d() {
        this.f82528g = new C31533a();
        this.f82528g.mo66536a(new C31530a());
        this.f82523a = new C31534a(this, this.f82527f, this.f82524b);
        this.f82528g.mo66537a(this.f82523a);
    }

    /* renamed from: a */
    public final void mo82231a() {
        if (C31532b.m102504a(this)) {
            if (this.f82527f.getItemCount() == 0) {
                this.f82524b.mo25942f();
            }
            this.f82528g.mo56976a(Integer.valueOf(1));
            return;
        }
        if (this.f82527f.getItemCount() == 0) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (StrangerListActivity.this.isViewValid()) {
                        StrangerListActivity.this.f82523a.mo82241f();
                        StrangerListActivity.this.f82524b.mo25944h();
                        C10761a.m31399c((Context) StrangerListActivity.this, (int) R.string.cjs).mo25750a();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: b */
    public final void mo82232b() {
        AlertDialog b = new C1081a(this, R.style.m2).mo4237b((int) R.string.bmm).mo4235a(false).mo4226a((int) R.string.bi8, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11469m.m33840a().mo27686a((C11195b<Boolean>) new C11195b<Boolean>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo18089a(Boolean bool) {
                        StrangerListActivity.this.mo82231a();
                    }

                    /* renamed from: a */
                    public final void mo18088a(C11438g gVar) {
                        C9738o.m28697a(C6399b.m19921a(), StrangerListActivity.this.getResources().getString(R.string.bna));
                    }
                });
            }
        }).mo4238b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo4242b();
        if (!b.isShowing()) {
            b.show();
        }
    }

    /* renamed from: c */
    private void m102493c() {
        this.f82525c = (ImTextTitleBar) findViewById(R.id.djz);
        if (!C31915n.m103671a()) {
            this.f82525c.setRightTextSize(C9738o.m28708b((Context) this, 15.0f));
            this.f82525c.setRightText((int) R.string.bml);
        }
        this.f82525c.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: a */
            public final void mo18096a() {
                StrangerListActivity.this.onBackPressed();
            }

            /* renamed from: b */
            public final void mo18097b() {
                StrangerListActivity.this.mo82232b();
            }
        });
        this.f82526e = (RecyclerView) findViewById(R.id.dbo);
        this.f82526e.setLayoutManager(new LinearLayoutManager(this));
        this.f82527f = new SessionListAdapter();
        this.f82527f.f82440a = true;
        this.f82526e.setAdapter(this.f82527f);
        this.f82526e.mo5528a((C1281m) new FrescoRecycleViewScrollListener(this));
        this.f82527f.mo66504a((C6905a) this);
        this.f82527f.mo66516d(C6956a.m21633b().needSessionListShowMore());
        this.f82524b = (DmtStatusView) findViewById(R.id.dav);
        this.f82524b.setBuilder(C10803a.m31631a((Context) this).mo25961a(new C10806a(this).mo25985a((int) R.drawable.b79).mo25990b((int) R.string.bpp).mo25993c(R.string.bpo).f29135a).mo25953a().mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                StrangerListActivity.this.mo82231a();
            }
        }));
    }

    /* renamed from: a */
    public static void m102492a(Context context) {
        context.startActivity(new Intent(context, StrangerListActivity.class));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ew);
        C6956a.m21633b().setupStatusBar(this);
        C6956a.m21632a().mo18010g();
        m102493c();
        m102494d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", false);
    }
}
