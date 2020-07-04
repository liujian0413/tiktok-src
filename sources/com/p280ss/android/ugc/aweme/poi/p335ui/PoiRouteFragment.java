package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedane.aweme.map.api.C13047b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.poi.experiment.ShowNearbyHotAwemeExperiment;
import com.p280ss.android.ugc.aweme.poi.map.C35096i;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.model.PoiLatLng;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.nearby.p1465ui.PoiNearbyHotAwemeListDialogFragment;
import com.p280ss.android.ugc.aweme.poi.nearby.p1465ui.PoiNearbyHotAwemeListDialogFragment.C35133a;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.PoiDetailWithoutMapFragment;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteFragment */
public class PoiRouteFragment extends AmeBaseFragment implements C13047b, C35096i {

    /* renamed from: e */
    private MapLayout f92413e;

    /* renamed from: f */
    private PoiStruct f92414f;

    /* renamed from: g */
    private PoiLatLng f92415g;

    /* renamed from: h */
    private View f92416h;

    /* renamed from: i */
    private boolean f92417i;

    /* renamed from: j */
    private String f92418j;

    /* renamed from: k */
    private int f92419k;

    /* renamed from: l */
    private ViewGroup f92420l;

    /* renamed from: m */
    private DmtTextView f92421m;

    /* renamed from: n */
    private boolean f92422n;

    /* renamed from: o */
    private boolean f92423o = true;

    /* renamed from: p */
    private boolean f92424p;

    /* renamed from: q */
    private PoiNearbyHotAwemeListDialogFragment f92425q;

    /* renamed from: r */
    private String f92426r;

    /* renamed from: s */
    private String f92427s;

    /* renamed from: t */
    private String f92428t;

    /* renamed from: u */
    private long f92429u = -1;

    /* renamed from: v */
    private PoiRoutePresenter f92430v;

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo89783f() {
        this.f92424p = true;
    }

    /* renamed from: m */
    private void m113832m() {
        C1592h.m7855a((Callable<TResult>) new C35288ac<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: n */
    private void m113833n() {
        C1592h.m7855a((Callable<TResult>) new C35289ad<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo89778a() throws Exception {
        C6907h.m21524a("nearby_poi_icon_click", m113834o());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Object mo89782e() throws Exception {
        C6907h.m21524a("nearby_poi_icon_show", m113834o());
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f92430v.mo89795i();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92413e.mo88960e();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f92413e.mo88961f();
    }

    public void onPause() {
        super.onPause();
        this.f92413e.mo88957c();
        m113829j();
    }

    public void onStart() {
        super.onStart();
        this.f92413e.mo88956b();
        this.f92413e.setOnCameraChangeListener(this);
    }

    public void onStop() {
        super.onStop();
        this.f92413e.mo88958d();
    }

    /* renamed from: i */
    private void m113828i() {
        if (this.mUserVisibleHint) {
            if (this.f92429u == -1) {
                this.f92429u = System.currentTimeMillis();
            }
            PoiDetailWithoutMapFragment.m113965N();
        }
    }

    public void onResume() {
        super.onResume();
        this.f92413e.mo88947a();
        m113828i();
        this.f92420l.postDelayed(new C35438z(this), 500);
    }

    /* renamed from: j */
    private void m113829j() {
        if (this.mUserVisibleHint) {
            if (this.f92429u != -1) {
                long currentTimeMillis = System.currentTimeMillis() - this.f92429u;
                if (currentTimeMillis > 0 && !TextUtils.isEmpty(this.f92426r)) {
                    C6726a.m20842a(new C35286aa(this, currentTimeMillis));
                }
                this.f92429u = -1;
            }
            PoiDetailWithoutMapFragment.m113966O();
        }
    }

    /* renamed from: l */
    private boolean m113831l() {
        if (this.f92419k == 0 || C6384b.m19835a().mo15287a(ShowNearbyHotAwemeExperiment.class, true, "show_nearby_hot_aweme", C6384b.m19835a().mo15295d().show_nearby_hot_aweme, 0) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private Map<String, String> m113834o() {
        return C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("page_type", "poi_map").mo59974a(C35454m.m114521a(this.f92414f)).f60753a;
    }

    /* renamed from: d */
    public final void mo88968d() {
        if (this.f92414f != null) {
            this.f92430v.mo89767a(this.f92414f);
            if (this.f92430v instanceof PoiOptimizedRoutePresenter) {
                ((PoiOptimizedRoutePresenter) this.f92430v).mo89771e();
            }
            this.f92427s = this.f92414f.poiId;
            this.f92428t = this.f92414f.typeCode;
            return;
        }
        if (this.f92415g != null) {
            this.f92430v.mo89792a(this.f92415g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo89784g() {
        if (isViewValid() && !C6399b.m19944t()) {
            float translationY = this.f92420l.getTranslationY();
            if (translationY != 0.0f) {
                this.f92422n = false;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new C10743b());
                ofFloat.addUpdateListener(new C35287ab(this, translationY));
                ofFloat.start();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f92413e.mo88951a(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.cge) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: b */
    private void m113827b(long j) {
        new C33248at().mo85138a(String.valueOf(j)).mo85139b(this.f92426r).mo85142e(this.f92427s).mo85144f(this.f92428t).mo85141d("map").mo85145g(this.f92418j).mo85137a(this.f92414f).mo85252e();
    }

    /* renamed from: a */
    private void m113826a(Bundle bundle) {
        if (bundle != null) {
            this.f92414f = (PoiStruct) bundle.getSerializable("poi_detail");
            this.f92415g = (PoiLatLng) bundle.getSerializable("poi_latlng");
            this.f92417i = bundle.getBoolean("poi_route_from_poi");
            this.f92426r = bundle.getString("enter_from");
            this.f92418j = bundle.getString("aweme_id");
            this.f92419k = bundle.getInt("poi_nearby_hot_poi_cunt", 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89780a(long j) {
        C6907h.m21517a(getContext(), "stay_time", this.f92426r, j, 0);
        m113827b(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89781a(View view) {
        if (this.mFragmentManager != null) {
            if (this.mFragmentManager.mo2644a("PoiNearbyHotAwemeListDialogFragment") == null) {
                this.f92425q = C35133a.m113343a(this.f92414f, this.f92419k, this.f92418j);
            }
            if (!this.f92425q.isAdded()) {
                this.mFragmentManager.mo2645a().mo2588a((Fragment) this.f92425q, "PoiNearbyHotAwemeListDialogFragment").mo2606d();
            } else {
                this.mFragmentManager.mo2645a().mo2605c(this.f92425q).mo2606d();
            }
        }
        m113833n();
    }

    public void onViewCreated(View view, Bundle bundle) {
        PoiRoutePresenter poiRoutePresenter;
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.f92416h.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
        }
        if (this.f92417i) {
            poiRoutePresenter = new PoiOptimizedRoutePresenter();
        } else {
            poiRoutePresenter = new PoiRoutePresenter();
        }
        this.f92430v = poiRoutePresenter;
        this.f92430v.mo89790a(this, view, this.f92413e, true);
        this.f92413e.mo88952a(bundle, this);
        this.f92413e.setOnMapZoomGestureListener(new C35436x(this));
        this.f92420l.setOnClickListener(new C35437y(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89779a(float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f92420l.setTranslationY(f * floatValue);
        this.f92420l.setAlpha(1.0f - floatValue);
    }

    /* renamed from: a */
    public static PoiRouteFragment m113824a(PoiLatLng poiLatLng, boolean z, int i) {
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("poi_latlng", poiLatLng);
        bundle.putBoolean("poi_route_from_poi", z);
        bundle.putInt("poi_nearby_hot_poi_cunt", i);
        PoiRouteFragment poiRouteFragment = new PoiRouteFragment();
        poiRouteFragment.setArguments(bundle);
        return poiRouteFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m113826a(getArguments());
        View inflate = layoutInflater.inflate(R.layout.pz, viewGroup, false);
        this.f92416h = inflate.findViewById(R.id.cgn);
        this.f92413e = (MapLayout) inflate.findViewById(R.id.cgl);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cge);
        this.f92420l = (ViewGroup) inflate.findViewById(R.id.c3j);
        this.f92421m = (DmtTextView) inflate.findViewById(R.id.awe);
        if (m113831l()) {
            this.f92420l.setVisibility(8);
        } else {
            this.f92420l.setVisibility(0);
            this.f92420l.setTranslationY(C9738o.m28708b(getContext(), 68.0f));
            m113832m();
        }
        this.f92421m.setText(getResources().getString(R.string.cz4));
        int b = (int) C9738o.m28708b(getContext(), 32.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 12.0f);
        imageView.setBackgroundResource(R.drawable.u6);
        imageView.setImageResource(R.drawable.b1x);
        LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        layoutParams.leftMargin = b2;
        int b3 = (int) C9738o.m28708b(getContext(), 6.0f);
        imageView.setPadding(b3, b3, b3, b3);
        return inflate;
    }

    /* renamed from: a */
    public static PoiRouteFragment m113825a(PoiStruct poiStruct, String str, String str2, boolean z, int i) {
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("poi_detail", poiStruct);
        bundle.putBoolean("poi_route_from_poi", z);
        bundle.putString("enter_from", str);
        bundle.putInt("poi_nearby_hot_poi_cunt", i);
        bundle.putString("aweme_id", str2);
        PoiRouteFragment poiRouteFragment = new PoiRouteFragment();
        poiRouteFragment.setArguments(bundle);
        return poiRouteFragment;
    }
}
