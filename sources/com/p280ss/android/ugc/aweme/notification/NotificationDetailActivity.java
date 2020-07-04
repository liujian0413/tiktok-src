package com.p280ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34306a;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.model.NoticeModel;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.TikTokNewNotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.p1434c.C34422h;
import com.p280ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.notification.NotificationDetailActivity */
public class NotificationDetailActivity extends AmeSSActivity implements C1032b, C6905a, C25675c<BaseNotice> {

    /* renamed from: c */
    private static final String f89608c = "NotificationDetailActivity";

    /* renamed from: a */
    View f89609a;

    /* renamed from: b */
    public DmtStatusView f89610b;

    /* renamed from: d */
    private boolean f89611d;

    /* renamed from: e */
    private int f89612e;

    /* renamed from: f */
    private int f89613f;

    /* renamed from: g */
    private RecyclerView f89614g;

    /* renamed from: h */
    private SwipeRefreshLayout f89615h;

    /* renamed from: i */
    private NotificationAdapter f89616i;

    /* renamed from: j */
    private C34422h f89617j;

    /* renamed from: k */
    private TextTitleBar f89618k;

    /* renamed from: l */
    private String f89619l;

    /* renamed from: m */
    private int f89620m;

    /* renamed from: n */
    private Integer f89621n;

    /* renamed from: o */
    private DiggNotice f89622o;

    /* renamed from: p */
    private String f89623p;

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

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aD_() {
        this.f89616i.ag_();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName(m111104j());
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f89617j != null) {
            this.f89617j.mo59134U_();
        }
    }

    /* renamed from: e */
    private void m111100e() {
        int[] a = C34306a.m110969a(this.f89612e);
        C34315c.m110984c(a);
        for (int gVar : a) {
            C42961az.m136380a(new C34314g(gVar, 0));
        }
    }

    /* renamed from: j */
    private String m111104j() {
        String str = "fans";
        switch (this.f89612e) {
            case 0:
                return "fans";
            case 1:
                return "like";
            case 2:
                return "at";
            case 3:
                return "comment";
            default:
                return str;
        }
    }

    public final void bd_() {
        this.f89617j.mo56976a(Integer.valueOf(4), Integer.valueOf(this.f89613f), this.f89621n);
    }

    public void finish() {
        ((DeepLinkReturnHelperService) ServiceManager.get().getService(DeepLinkReturnHelperService.class)).onFinish(this);
        super.finish();
    }

    public void setStatusBarColor() {
        super.setStatusBarColor();
        ((IMainService) ServiceManager.get().getService(IMainService.class)).setI18nStatusBarColor(this);
    }

    public final void ae_() {
        if (this.f89616i.f67566v) {
            this.f89616i.mo66516d(false);
            this.f89616i.notifyDataSetChanged();
            this.f89616i.ah_();
        }
        this.f89615h.setRefreshing(false);
        if (this.f89616i.getItemCount() == 0) {
            this.f89610b.mo25943g();
        }
    }

    /* renamed from: f */
    private void m111101f() {
        this.f89615h.setOnRefreshListener(this);
        this.f89618k.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                NotificationDetailActivity.this.finish();
            }
        });
        this.f89614g.mo5528a((C1281m) new FrescoRecycleViewScrollListener(this));
        this.f89617j.mo66536a(new NoticeModel());
        this.f89617j.mo66537a(this);
        this.f89616i.mo66504a((C6905a) this);
        this.f89616i.mo66516d(true);
        this.f89616i.ah_();
        this.f89614g.setAdapter(this.f89616i);
        this.f89610b.mo25942f();
    }

    public void onRefresh() {
        if (this.f89622o != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f89622o.getUsers().size(); i++) {
                User user = (User) this.f89622o.getUsers().get(i);
                BaseNotice baseNotice = new BaseNotice();
                DiggNotice diggNotice = new DiggNotice(this.f89622o);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                diggNotice.setUsers(arrayList2);
                diggNotice.setMergeCount(1);
                baseNotice.setDiggNotice(diggNotice);
                arrayList.add(baseNotice);
            }
            this.f89610b.mo25939d();
            this.f89616i.mo58045a(arrayList);
            this.f89616i.notifyDataSetChanged();
        } else if (C34452h.m111415a(this)) {
            if (this.f89616i.getItemCount() == 0) {
                this.f89610b.mo25942f();
            }
            this.f89617j.mo56976a(Integer.valueOf(1), Integer.valueOf(this.f89613f), this.f89621n);
        } else if (this.f89616i.getItemCount() == 0) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (NotificationDetailActivity.this.isViewValid()) {
                        NotificationDetailActivity.this.f89610b.mo25944h();
                        C10761a.m31399c((Context) NotificationDetailActivity.this, (int) R.string.cjs).mo25750a();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: g */
    private void m111102g() {
        int i;
        if (this.f89612e == 0) {
            this.f89613f = 7;
            this.f89619l = getResources().getString(R.string.b94);
            if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(this).mo18535f().equals("Indonesia")) {
                this.f89619l = "Pengikut terbaru";
            }
        } else if (this.f89612e == 1) {
            this.f89613f = 3;
            this.f89619l = getResources().getString(R.string.cp8);
        } else if (this.f89612e == 2) {
            if (C27688b.m90838b()) {
                i = 26;
            } else {
                i = 6;
            }
            this.f89613f = i;
            this.f89619l = getResources().getString(R.string.cp4);
        } else if (this.f89612e == 3) {
            this.f89613f = 44;
            this.f89619l = getResources().getString(R.string.cp5);
        } else if (this.f89612e == 4) {
            this.f89613f = 46;
            this.f89619l = getResources().getString(R.string.biu);
        } else if (this.f89612e == 7) {
            this.f89613f = 21;
            this.f89619l = getResources().getString(R.string.bgh);
        } else if (this.f89612e == 62) {
            this.f89613f = 62;
            this.f89619l = getResources().getString(R.string.bn0);
        } else {
            this.f89613f = 47;
            this.f89619l = getResources().getString(R.string.bqu);
        }
        this.f89618k = (TextTitleBar) findViewById(R.id.djz);
        this.f89618k.setTitle((CharSequence) this.f89619l);
        this.f89615h = (SwipeRefreshLayout) findViewById(R.id.c7s);
        this.f89614g = (RecyclerView) findViewById(R.id.c7m);
        ((SimpleItemAnimator) this.f89614g.getItemAnimator()).f5112m = false;
        this.f89610b = (DmtStatusView) findViewById(R.id.dav);
        this.f89610b.setBuilder(C10803a.m31631a((Context) this).mo25953a().mo25963b(m111103h()).mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                NotificationDetailActivity.this.onRefresh();
            }
        }));
        if (C34538e.m111692c()) {
            TikTokNewNotificationAdapter tikTokNewNotificationAdapter = new TikTokNewNotificationAdapter(this, this.f89623p, this.f89613f, this.f89612e, this.f89620m);
            this.f89616i = tikTokNewNotificationAdapter;
        } else {
            this.f89616i = new NotificationAdapter(this.f89612e, this, this.f89620m, this.f89623p);
        }
        this.f89616i.f89800b = new C34451g(this);
        this.f89617j = new C34422h();
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(1, (int) C9738o.m28708b((Context) this, 1.0f), 0);
        this.f89614g.setLayoutManager(new FixedLinearlayoutManager(this));
        this.f89614g.mo5525a((C1272h) recyclerItemDecoration);
        this.f89609a = findViewById(R.id.dal);
        if (VERSION.SDK_INT >= 19) {
            this.f89609a.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    /* renamed from: h */
    private View m111103h() {
        if (C6399b.m19944t()) {
            MtEmptyView a = MtEmptyView.m31657a((Context) this);
            if (this.f89612e == 0) {
                a.setStatus(new C10806a(this).mo25985a((int) R.drawable.axg).mo25990b((int) R.string.cp0).mo25993c(R.string.coz).f29135a);
            } else if (this.f89612e == 1) {
                a.setStatus(new C10806a(this).mo25985a((int) R.drawable.axh).mo25990b((int) R.string.cpf).mo25993c(R.string.cpe).f29135a);
            } else if (this.f89612e == 2) {
                a.setStatus(new C10806a(this).mo25985a((int) R.drawable.axe).mo25990b((int) R.string.cpl).mo25993c(R.string.cpk).f29135a);
            } else if (this.f89612e == 3) {
                a.setStatus(new C10806a(this).mo25985a((int) R.drawable.axf).mo25990b((int) R.string.coc).mo25993c(R.string.cob).f29135a);
            } else {
                a.setStatus(new C10806a(this).mo25990b((int) R.string.bzv).mo25991b("").f29135a);
            }
            return a;
        }
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        if (this.f89612e == 0) {
            dmtDefaultView.setStatus(new C10806a(this).mo25990b((int) R.string.bjd).mo25993c(R.string.bjc).f29135a);
        } else if (this.f89612e == 1) {
            dmtDefaultView.setStatus(new C10806a(this).mo25990b((int) R.string.bm5).mo25993c(R.string.bm4).f29135a);
        } else if (this.f89612e == 2) {
            dmtDefaultView.setStatus(new C10806a(this).mo25990b((int) R.string.bgv).mo25993c(R.string.bgu).f29135a);
        } else if (this.f89612e == 3) {
            dmtDefaultView.setStatus(new C10806a(this).mo25990b((int) R.string.bhz).mo25993c(R.string.bhy).f29135a);
        } else {
            dmtDefaultView.setStatus(new C10806a(this).mo25990b((int) R.string.bzv).mo25991b("").f29135a);
        }
        return dmtDefaultView;
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f89616i.mo66508i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87634a(int i) {
        if (i == 0) {
            ae_();
        }
    }

    /* renamed from: a */
    private void m111099a(boolean z) {
        if (z) {
            this.f89616i.ai_();
        } else if (C6399b.m19944t()) {
            this.f89616i.mo66516d(false);
        } else {
            this.f89616i.ah_();
        }
    }

    @C7709l
    public void onProfileFollowEvent(C23661d dVar) {
        Object obj = dVar.f62380b;
        if (obj != null && (obj instanceof User)) {
            User user = (User) obj;
            int i = dVar.f62379a;
            NotificationAdapter notificationAdapter = this.f89616i;
            int i2 = 2;
            if (!(i == 1 || i == 2)) {
                i2 = 0;
            }
            notificationAdapter.mo87679a(user, i2);
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f89616i.f67566v) {
            this.f89616i.mo66516d(false);
            this.f89616i.notifyDataSetChanged();
        }
        this.f89615h.setRefreshing(false);
        if (this.f89616i.getItemCount() == 0) {
            this.f89610b.mo25944h();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dl);
        this.f89623p = getIntent().getStringExtra("enter_from");
        if (TextUtils.isEmpty(this.f89623p)) {
            this.f89623p = "message";
        }
        this.f89612e = getIntent().getIntExtra("from_where", -1);
        this.f89620m = getIntent().getIntExtra("unRead_message_count", 0);
        this.f89622o = (DiggNotice) getIntent().getSerializableExtra("digg_notice_data");
        if (this.f89612e < 0) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", false);
            return;
        }
        m111102g();
        m111101f();
        onRefresh();
        m111100e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        m111099a(z);
        this.f89616i.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<BaseNotice> list, boolean z) {
        this.f89616i.mo66516d(true);
        if (this.f89611d) {
            this.f89616i.mo87682f();
        }
        this.f89611d = true;
        m111099a(z);
        this.f89615h.setRefreshing(false);
        this.f89616i.mo58045a(list);
        this.f89610b.mo25939d();
        if (this.f89616i.mo62312a() != null) {
        }
    }

    /* renamed from: a */
    public static void m111097a(Context context, int i, int i2) {
        m111098a(context, i, i2, null);
    }

    /* renamed from: a */
    private static void m111098a(Context context, int i, int i2, String str) {
        Intent intent = new Intent(context, NotificationDetailActivity.class);
        intent.putExtra("from_where", i);
        intent.putExtra("unRead_message_count", i2);
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("notice_name", null);
        }
        context.startActivity(intent);
    }
}
