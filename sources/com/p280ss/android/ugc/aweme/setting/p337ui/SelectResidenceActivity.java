package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.setting.C37561an;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.adapter.RegionListAdapter;
import com.p280ss.android.ugc.aweme.setting.p1513c.C37587a;
import com.p280ss.android.ugc.aweme.setting.p1513c.C37587a.C37588a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37719f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity */
public final class SelectResidenceActivity extends AmeBaseActivity implements C37561an, C37708a {

    /* renamed from: e */
    public static final C37805a f98531e = new C37805a(null);

    /* renamed from: a */
    public RegionListAdapter f98532a;

    /* renamed from: b */
    public List<C37587a> f98533b;

    /* renamed from: c */
    public final String f98534c = "region_of_residence";

    /* renamed from: d */
    public C37719f f98535d;

    /* renamed from: q */
    private LinearLayoutManager f98536q;

    /* renamed from: r */
    private int f98537r;

    /* renamed from: s */
    private HashMap f98538s;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity$a */
    public static final class C37805a {
        private C37805a() {
        }

        public /* synthetic */ C37805a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity$b */
    static final class C37806b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectResidenceActivity f98539a;

        C37806b(SelectResidenceActivity selectResidenceActivity) {
            this.f98539a = selectResidenceActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SelectResidenceActivity.m120957a(this.f98539a).mo56976a(this.f98539a.f98534c, ((C37587a) SelectResidenceActivity.m120958b(this.f98539a).get(SelectResidenceActivity.m120959c(this.f98539a).f97954c)).f98021c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity$c */
    static final class C37807c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectResidenceActivity f98540a;

        C37807c(SelectResidenceActivity selectResidenceActivity) {
            this.f98540a = selectResidenceActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98540a.finish();
        }
    }

    /* renamed from: a */
    private View m120956a(int i) {
        if (this.f98538s == null) {
            this.f98538s = new HashMap();
        }
        View view = (View) this.f98538s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98538s.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.en;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: i */
    private void m120961i() {
        this.f98533b = C37588a.m120384a();
    }

    public final void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.t, R.anim.t);
    }

    public final void bJ_() {
        C10761a.m31403c((Context) this, getString(R.string.dxl)).mo25750a();
    }

    public final void onDestroy() {
        super.onDestroy();
        C37719f fVar = this.f98535d;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        if (fVar != null) {
            fVar.mo59134U_();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: c */
    public final void mo58711c() {
        TextTitleBar textTitleBar = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar, "btb_select_region");
        DmtTextView endText = textTitleBar.getEndText();
        C7573i.m23582a((Object) endText, "btb_select_region.endText");
        endText.setEnabled(true);
        TextTitleBar textTitleBar2 = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar2, "btb_select_region");
        DmtTextView endText2 = textTitleBar2.getEndText();
        C7573i.m23582a((Object) endText2, "btb_select_region.endText");
        endText2.setAlpha(1.0f);
    }

    public final void bI_() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl userResidence = inst.getUserResidence();
        C7573i.m23582a((Object) userResidence, "SharePrefCache.inst().userResidence");
        List<C37587a> list = this.f98533b;
        if (list == null) {
            C7573i.m23583a("mList");
        }
        RegionListAdapter regionListAdapter = this.f98532a;
        if (regionListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        userResidence.mo59871a(((C37587a) list.get(regionListAdapter.f97954c)).f98021c);
        Intent intent = new Intent();
        String str = "SELECT_REGION_INDEX";
        RegionListAdapter regionListAdapter2 = this.f98532a;
        if (regionListAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        intent.putExtra(str, regionListAdapter2.f97954c);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: d */
    private final void m120960d() {
        Context context = this;
        this.f98536q = new LinearLayoutManager(context);
        List<C37587a> list = this.f98533b;
        if (list == null) {
            C7573i.m23583a("mList");
        }
        this.f98532a = new RegionListAdapter(context, list, this.f98537r);
        RecyclerView recyclerView = (RecyclerView) m120956a((int) R.id.cxp);
        C7573i.m23582a((Object) recyclerView, "rv_select_region");
        LinearLayoutManager linearLayoutManager = this.f98536q;
        if (linearLayoutManager == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) m120956a((int) R.id.cxp);
        C7573i.m23582a((Object) recyclerView2, "rv_select_region");
        RegionListAdapter regionListAdapter = this.f98532a;
        if (regionListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView2.setAdapter(regionListAdapter);
        RegionListAdapter regionListAdapter2 = this.f98532a;
        if (regionListAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        regionListAdapter2.mo94839a(this);
        TextTitleBar textTitleBar = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar, "btb_select_region");
        DmtTextView endText = textTitleBar.getEndText();
        C7573i.m23582a((Object) endText, "btb_select_region.endText");
        endText.setEnabled(false);
        TextTitleBar textTitleBar2 = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar2, "btb_select_region");
        DmtTextView endText2 = textTitleBar2.getEndText();
        C7573i.m23582a((Object) endText2, "btb_select_region.endText");
        endText2.setAlpha(0.3f);
        TextTitleBar textTitleBar3 = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar3, "btb_select_region");
        textTitleBar3.getEndText().setOnClickListener(new C37806b(this));
        TextTitleBar textTitleBar4 = (TextTitleBar) m120956a((int) R.id.pl);
        C7573i.m23582a((Object) textTitleBar4, "btb_select_region");
        textTitleBar4.getStartText().setOnClickListener(new C37807c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ C37719f m120957a(SelectResidenceActivity selectResidenceActivity) {
        C37719f fVar = selectResidenceActivity.f98535d;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ List m120958b(SelectResidenceActivity selectResidenceActivity) {
        List<C37587a> list = selectResidenceActivity.f98533b;
        if (list == null) {
            C7573i.m23583a("mList");
        }
        return list;
    }

    /* renamed from: c */
    public static final /* synthetic */ RegionListAdapter m120959c(SelectResidenceActivity selectResidenceActivity) {
        RegionListAdapter regionListAdapter = selectResidenceActivity.f98532a;
        if (regionListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return regionListAdapter;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.s, 0);
        this.f98537r = getIntent().getIntExtra("CUTTENT_SELECT_REGION", -1);
        this.f98535d = new C37719f();
        C37719f fVar = this.f98535d;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        fVar.mo66537a(this);
        m120961i();
        m120960d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SelectResidenceActivity", "onCreate", false);
    }
}
