package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.PoiCouponInputActivity;
import com.p280ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24580c;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24582d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity */
public class CouponListActivity extends AmeSSActivity implements C25675c<CouponInfo>, C28532n {

    /* renamed from: a */
    private C24582d f64903a;

    /* renamed from: b */
    private CouponListAdapter f64904b;

    /* renamed from: c */
    private LoadMoreAdapter f64905c;

    /* renamed from: d */
    private boolean f64906d;

    /* renamed from: e */
    private boolean f64907e = true;
    RecyclerView mListView;
    DmtStatusView mStatusView;
    TextView merchantTv;
    DmtTextView title;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<CouponInfo> list, boolean z) {
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f64905c.mo67986a(1);
        }
    }

    public final boolean aR_() {
        if (this.f64905c.f69540a != 0) {
            return true;
        }
        return false;
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
    }

    /* renamed from: h */
    private void m80665h() {
        this.f64903a = new C24582d();
        this.f64903a.mo66536a(new C24580c(this.f64907e));
        this.f64903a.mo66537a(this);
    }

    /* renamed from: i */
    private void m80666i() {
        if (this.mStatusView.mo25940d(true)) {
            this.f64903a.mo56976a(Integer.valueOf(1));
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid() && !this.mStatusView.f29075b) {
            this.mStatusView.mo25942f();
        }
    }

    public final void aP_() {
        this.f64903a.mo56976a(Integer.valueOf(4));
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mStatusView.mo25943g();
            m80663a((C24580c) this.f64903a.mo66539h());
        }
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C7195s.m22438a().mo18679a((Activity) this, "aweme://main");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f64903a != null) {
            this.f64903a.mo66535W_();
            this.f64903a.mo59134U_();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: g */
    private void m80664g() {
        int i;
        C28410h.m93358a(false);
        if (getIntent() != null && getIntent().hasExtra("is_coupon_valid")) {
            this.f64907e = getIntent().getBooleanExtra("is_coupon_valid", true);
        }
        if (this.f64907e) {
            i = R.string.ahp;
        } else {
            i = R.string.bux;
        }
        this.title.setText(i);
        C10805b a = C43361b.m137644a(this, new C24608c(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        C10803a a2 = C10803a.m31631a((Context) this);
        if (this.f64907e) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.b2u, null);
            inflate.findViewById(R.id.a19).setOnClickListener(new C24609d(this));
            a2.mo25963b(inflate);
        } else {
            a2.mo25954a((int) R.string.ahw);
        }
        a2.mo25966c((View) dmtDefaultView);
        this.mStatusView.setBuilder(a2);
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        this.f64904b = new CouponListAdapter(this);
        this.f64904b.f64840d = this.f64907e;
        this.f64905c = LoadMoreAdapter.m86888a((C1262a<VH>) this.f64904b);
        this.mListView.setAdapter(this.f64905c);
        this.mListView.setOnFlingListener(new OnRecyclerViewFlingListener(this.mListView, this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64456b(View view) {
        m80666i();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f64905c.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f64904b.f64839c = false;
            this.f64905c.mo67986a(2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.co);
        ButterKnife.bind((Activity) this);
        m80664g();
        m80665h();
        m80666i();
    }

    /* renamed from: a */
    private void m80663a(C24580c cVar) {
        if (cVar == null) {
            this.merchantTv.setVisibility(8);
        } else if (cVar.f64828a) {
            if (!this.f64906d) {
                C6907h.m21524a("show_im_seller", (Map) C22984d.m75611a().mo59973a("enter_from", "card_bag").f60753a);
                this.f64906d = true;
            }
            this.merchantTv.setVisibility(0);
        } else {
            this.merchantTv.setVisibility(8);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jq) {
            finish();
            return;
        }
        if (id == R.id.by5) {
            C6907h.m21524a("click_im_seller", (Map) C22984d.m75611a().mo59973a("enter_from", "card_bag").mo59973a("previous_page", "card_bag").f60753a);
            startActivity(new Intent(this, PoiCouponInputActivity.class));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64455a(View view) {
        C6907h.m21524a("enter_invalid_card_bag", (Map) C22984d.m75611a().mo59973a("enter_from", "card_bag").f60753a);
        Intent intent = new Intent(this, CouponListActivity.class);
        intent.putExtra("is_coupon_valid", false);
        startActivity(intent);
    }

    /* renamed from: b */
    public final void mo59108b(List<CouponInfo> list, boolean z) {
        if (isViewValid()) {
            this.f64904b.f64839c = z;
            this.f64904b.mo64382a(list);
            this.f64905c.mo67986a(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<CouponInfo> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo25938c(true);
            this.f64905c.mo67986a(z ? 1 : 0);
            this.f64904b.f64839c = z;
            this.f64904b.mo64382a(list);
            m80663a((C24580c) this.f64903a.mo66539h());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.f64903a.mo64375a(intent.getIntExtra("coupon_list_position", 0), (CouponInfo) intent.getSerializableExtra("coupon_info"));
            this.f64905c.notifyItemChanged(intent.getIntExtra("coupon_list_position", 0), new Object());
        }
    }
}
