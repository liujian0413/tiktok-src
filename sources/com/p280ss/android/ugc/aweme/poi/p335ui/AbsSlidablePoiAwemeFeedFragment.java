package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.discover.helper.C26666n;
import com.p280ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.music.p1408b.C33772g;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiBannerAdapter;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.C35018a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35026b;
import com.p280ss.android.ugc.aweme.poi.event.FinishMapEvent;
import com.p280ss.android.ugc.aweme.poi.event.MeiweiOrderEvent;
import com.p280ss.android.ugc.aweme.poi.map.C35095h;
import com.p280ss.android.ugc.aweme.poi.map.C35096i;
import com.p280ss.android.ugc.aweme.poi.map.C35097j;
import com.p280ss.android.ugc.aweme.poi.map.C35099l;
import com.p280ss.android.ugc.aweme.poi.map.C35100m;
import com.p280ss.android.ugc.aweme.poi.map.C35101n;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.model.C35105b;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiPhoto;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j.C35388a;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35271a;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35272b;
import com.p280ss.android.ugc.aweme.poi.p335ui.upload.ChooseImageActivity;
import com.p280ss.android.ugc.aweme.poi.preview.C35135a;
import com.p280ss.android.ugc.aweme.poi.preview.C35142b;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35447g;
import com.p280ss.android.ugc.aweme.poi.utils.C35453l;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment */
public abstract class AbsSlidablePoiAwemeFeedFragment extends AbsPoiAwemeFeedFragment implements C6310a, C35025a, C35026b, C35096i, C35097j, C35099l, C35100m, C35101n, C35388a {

    /* renamed from: A */
    protected C35447g f92356A;

    /* renamed from: B */
    private PoiBannerAdapter f92357B;

    /* renamed from: C */
    private C26666n f92358C;

    /* renamed from: D */
    private C35142b f92359D;

    /* renamed from: E */
    private double f92360E;

    /* renamed from: F */
    private double f92361F;

    /* renamed from: G */
    private LocationResult f92362G;

    /* renamed from: H */
    private String f92363H;

    /* renamed from: J */
    private MeiweiOrderEvent f92364J;

    /* renamed from: K */
    private boolean f92365K;
    protected AutoRTLImageView mBackBtn;
    protected BannerViewPager mBannerVPer;
    ViewGroup mCollectContainer;
    public View mHeader;
    protected DmtTextView mIndicatorView;
    ImageView mMoreActionBtn;
    protected PoiHeaderLayout mPoiHeaderLayout;
    protected MapLayout mPoiMap;
    protected View mPoiMore;
    protected View mRouteStatus;
    ImageView mShareBtn;
    protected View mStatusBar;
    View mTitleBarBg;
    View mTitleBarTools;
    public CheckableImageView mTopCollectImg;
    protected View mTopbar;
    protected View mTopbarBg;
    public View mTopbarStatus;
    protected ImageView mUploadImage;

    /* renamed from: x */
    protected PoiOptimizedRoutePresenter f92366x;

    /* renamed from: y */
    public List<PoiPhoto> f92367y;

    /* renamed from: z */
    protected C6309f f92368z;

    /* renamed from: A */
    public final C35025a mo89712A() {
        return this;
    }

    /* renamed from: L */
    public abstract void mo89754L();

    /* renamed from: M */
    public boolean mo89755M() {
        return true;
    }

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return true;
    }

    /* renamed from: c */
    public final CheckableImageView mo88806c() {
        return this.mTopCollectImg;
    }

    /* renamed from: i */
    public final int mo89735i() {
        return 65441;
    }

    /* renamed from: j */
    public final AbsFragment mo89718H() {
        return this;
    }

    /* renamed from: O */
    private void m113757O() {
        if (!C35462r.m114565a()) {
            this.mTopCollectImg.setVisibility(8);
        }
    }

    /* renamed from: P */
    private void mo89860P() {
        this.f92362G = C32640a.m105721a().mo84026b(null);
    }

    public final void bt_() {
        C35454m.m114529a("click_map", "zoom", this.f92333i);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f92368z != null) {
            this.f92368z.removeCallbacksAndMessages(null);
        }
    }

    public void onDestroyView() {
        if (this.mPoiMap != null) {
            this.mPoiMap.mo88960e();
        }
        super.onDestroyView();
    }

    public void onLowMemory() {
        if (this.mPoiMap != null) {
            this.mPoiMap.mo88961f();
        }
        super.onLowMemory();
    }

    public void onPause() {
        super.onPause();
        this.mPoiMap.mo88957c();
        FinishMapEvent.pageKey = this.f92363H;
    }

    public void onResume() {
        super.onResume();
        this.mPoiMap.mo88947a();
        m113762T();
    }

    public void onStart() {
        super.onStart();
        this.mPoiMap.mo88956b();
    }

    public void onStop() {
        super.onStop();
        this.mPoiMap.mo88958d();
    }

    /* renamed from: s */
    public final C35386j mo89746s() {
        if (this.f92330f == null) {
            this.f92330f = new C35271a(this);
        }
        return this.f92330f;
    }

    /* renamed from: y */
    public final C35390l mo89747y() {
        if (this.f92329e == null) {
            this.f92329e = new C35272b();
        }
        return this.f92329e;
    }

    /* renamed from: S */
    private boolean m113761S() {
        if (this.f92360E <= 0.0d || this.f92361F <= 0.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    private void m113763U() {
        StringBuilder sb = new StringBuilder(this.f92334j);
        sb.append(System.currentTimeMillis());
        this.f92363H = C43734f.m138605a(sb.toString());
    }

    /* renamed from: V */
    private void m113764V() {
        C22477b.m74364a(getActivity(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C35385i(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo89753K() {
        if (isViewValid() && this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.mo90215a(this.f92337s);
            this.mPoiHeaderLayout.mo90213a(this.mPoiMore);
        }
    }

    /* renamed from: d */
    public final void mo88968d() {
        this.f92365K = true;
        if (this.f92338t != null && isViewValid()) {
            this.f92366x.mo89767a(this.f92338t);
        }
    }

    /* renamed from: Q */
    private void m113759Q() {
        mo89860P();
        if (!(this.f92337s == null || !m113761S() || getContext() == null)) {
            this.mPoiMap.mo88950a(C35462r.m114549a(getContext()), this.f92360E, this.f92361F, m113760R(), (C35095h) null);
        }
    }

    /* renamed from: R */
    private float m113760R() {
        if (this.f92337s == null) {
            return this.mPoiMap.getZoomSmall();
        }
        if (C35441aa.m114462a(this.f92337s.getPoiStruct(), this.f92362G)) {
            return this.mPoiMap.getZoomBig();
        }
        return this.mPoiMap.getZoomSmall();
    }

    /* renamed from: T */
    private void m113762T() {
        if (this.f92364J != null && this.f92364J.isSuccess()) {
            if (C35409r.m114381a(getContext())) {
                new C35409r(getActivity(), this.f92364J.isBookOrder(), this.f92333i).show();
            }
            this.f92364J = null;
        }
    }

    /* renamed from: z */
    public final C35118h mo89748z() {
        String str;
        C35105b bVar = new C35105b(mo89735i());
        if (this.f92332h != null) {
            bVar.mo89406a(this.f92332h.poiId).mo89408b(this.f92332h.cityCode).mo89413d(this.f92332h.backendType);
            if (!TextUtils.isEmpty(C28290d.m93043d())) {
                if (C28290d.m93043d().equalsIgnoreCase(this.f92332h.cityCode)) {
                    str = "1";
                } else {
                    str = "0";
                }
                bVar.mo89410c(str);
            }
        }
        return bVar;
    }

    /* renamed from: N */
    private void m113756N() {
        ((LayoutParams) this.mTitleBarBg.getLayoutParams()).height = (int) C9738o.m28708b(getContext(), 52.0f);
        int b = (int) C9738o.m28708b(getContext(), 32.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 12.0f);
        this.mBackBtn.setBackgroundResource(R.drawable.u6);
        this.mBackBtn.setImageResource(R.drawable.b1x);
        LayoutParams layoutParams = (LayoutParams) this.mBackBtn.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        layoutParams.leftMargin = b2;
        int b3 = (int) C9738o.m28708b(getContext(), 6.0f);
        this.mBackBtn.setPadding(b3, b3, b3, b3);
        ((LayoutParams) this.mTitleBarTools.getLayoutParams()).rightMargin = b2;
        this.mTopCollectImg.setBackgroundResource(R.drawable.u6);
        this.mTopCollectImg.setImageResource(R.drawable.b1o);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mTopCollectImg.getLayoutParams();
        layoutParams2.width = b;
        layoutParams2.height = b;
        this.mTopCollectImg.setPadding(b3, b3, b3, b3);
        this.mTopCollectImg.setTag(R.id.axz, Boolean.valueOf(true));
        this.mShareBtn.setBackgroundResource(R.drawable.u6);
        this.mShareBtn.setImageResource(R.drawable.b1u);
        this.mMoreActionBtn.setBackgroundResource(R.drawable.u6);
        this.mMoreActionBtn.setImageResource(R.drawable.aeo);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mShareBtn.getLayoutParams();
        layoutParams3.width = b;
        layoutParams3.height = b;
        layoutParams3.leftMargin = (int) C9738o.m28708b(getContext(), 8.0f);
        this.mShareBtn.setPadding(b3, b3, b3, b3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.mMoreActionBtn.getLayoutParams();
        layoutParams4.width = b;
        layoutParams4.height = b;
        layoutParams4.leftMargin = (int) C9738o.m28708b(getContext(), 8.0f);
        this.mMoreActionBtn.setPadding(b3, b3, b3, b3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo89752J() {
        if (this.mBannerVPer.getVisibility() != 0) {
            C35444d.m114487a(getContext(), ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(mo89713B()), "map", this.f92334j);
            mo89754L();
            mo88969a(this.f92360E, this.f92361F);
            return;
        }
        C35135a.m113348a("top_pic", this.f92329e.f92834m);
        int size = this.f92367y.size();
        if (this.f92359D == null) {
            this.f92359D = C35142b.m113365a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (PoiPhoto poiPhoto : this.f92367y) {
                arrayList.add(poiPhoto.getMedium());
                arrayList2.add(poiPhoto.getLarge());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", this.f92334j);
            hashMap.put("page_type", "top_pic");
            hashMap.put("poi_type", this.f92336l);
            hashMap.put("group_id", mo89713B());
            hashMap.put("previous_page", mo73845x());
            C35454m.m114530a(hashMap, this.f92333i);
            this.f92359D.mo89431a(getContext(), arrayList, arrayList2, this.mBannerVPer, size, R.id.czm, this.f92334j, hashMap, true, true);
        }
        this.f92359D.mo89434a("tag_poi_header", this.mBannerVPer.getCurrentItem() % size, size);
    }

    /* renamed from: a */
    public final void mo88804a(boolean z) {
        mo89754L();
    }

    @C7709l
    public void onEvent(MeiweiOrderEvent meiweiOrderEvent) {
        this.f92364J = meiweiOrderEvent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo89731b(LocationResult locationResult) {
        super.mo89731b(locationResult);
        m113759Q();
    }

    @C7709l
    public void onEvent(FinishMapEvent finishMapEvent) {
        if (finishMapEvent != null) {
            finishMapEvent.isSamePage(this.f92363H);
        }
    }

    public void handleMsg(Message message) {
        if (isViewValid() && message != null) {
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mPoiMap.mo88951a(bundle);
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("poi", shareCompleteEvent.itemType) || TextUtils.equals("coupon", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.mStartRecordOutRing, shareCompleteEvent);
        }
    }

    /* renamed from: b */
    public final void mo89757b(int i) {
        this.mIndicatorView.setText(C1642a.m8034a(getString(R.string.cyw), new Object[]{Integer.valueOf(i), Integer.valueOf(this.f92367y.size())}));
    }

    @C7709l
    public void onEvent(C33772g gVar) {
        if (!(gVar.f88130b == null || !TextUtils.equals(gVar.f88130b.poiId, this.f92334j) || this.f92329e == null)) {
            this.f92329e.mo90114c(gVar.f88129a);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cdt) {
            mo89752J();
        } else if (id == R.id.b7l) {
            if (this.f92329e != null && !C27326a.m89578a(this.mTopCollectImg)) {
                this.f92329e.mo90113b(this.mCollectContainer);
            }
        } else {
            if (id == R.id.d4t) {
                if (!C27326a.m89578a(view)) {
                    if (!C35453l.m114518b(this.f92334j)) {
                        this.mPoiMap.mo88954a((C35099l) new C35384h(this));
                    }
                } else {
                    return;
                }
            } else if (id != R.id.ceh) {
                if (id == R.id.chm) {
                    m113764V();
                    return;
                }
            } else {
                return;
            }
            super.onClick(view);
        }
    }

    /* renamed from: a */
    private void m113765a(List<PoiPhoto> list) {
        if (isViewValid() && list != null && list.size() != 0) {
            this.f92367y = list;
            this.f92358C = new C26666n(this.mBannerVPer);
            C0991u.m4209d((View) this.mIndicatorView, 0);
            if (list.size() > 1) {
                this.mIndicatorView.setVisibility(0);
            }
            this.mBannerVPer.setVisibility(0);
            if (this.f92357B == null) {
                this.f92357B = new PoiBannerAdapter(getContext(), LayoutInflater.from(getContext()), this.f92334j, new C35018a() {
                    /* renamed from: a */
                    public final void mo88789a() {
                        AbsSlidablePoiAwemeFeedFragment.this.mo89752J();
                    }
                });
                this.mBannerVPer.setAdapter(new InfiniteLoopPoiBannerAdapter(this.f92357B, this.f92367y.size(), true));
            }
            boolean a = C43127fh.m136806a(getContext());
            if (a) {
                Collections.reverse(list);
            }
            this.f92358C.f70304a = list.size();
            this.f92358C.f70305b = false;
            this.f92357B.mo88769a(list);
            this.mBannerVPer.addOnPageChangeListener(new C0935e() {
                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        C35135a.m113346a(AbsSlidablePoiAwemeFeedFragment.this.f92333i, "top_pic");
                    }
                }

                public final void onPageSelected(int i) {
                    AbsSlidablePoiAwemeFeedFragment.this.mo89757b((i % AbsSlidablePoiAwemeFeedFragment.this.f92367y.size()) + 1);
                }
            });
            if (a) {
                this.mBannerVPer.setCurrentItem(list.size() - 1);
                mo89757b(list.size() - 1);
                return;
            }
            mo89757b(1);
        }
    }

    /* renamed from: a */
    public boolean mo89727a(PoiDetail poiDetail) {
        String str;
        if (super.mo89727a(poiDetail) || !isViewValid() || poiDetail == null || poiDetail.getPoiStruct() == null) {
            return true;
        }
        this.f92337s = poiDetail;
        if (this.f92365K) {
            this.f92366x.mo89767a(this.f92338t);
        }
        C35118h b = mo89748z().mo89406a(this.f92338t.poiId).mo89408b(this.f92338t.getCityCode());
        if (C28290d.m93043d().equalsIgnoreCase(this.f92338t.getCityCode())) {
            str = "1";
        } else {
            str = "0";
        }
        b.mo89410c(str).mo89413d(this.f92338t.getBackendTypeCode());
        if (!poiDetail.isPoiValid()) {
            C10761a.m31399c(getContext(), (int) R.string.cyx).mo25750a();
        }
        if (poiDetail.poiExtension == null || !poiDetail.poiExtension.hasUploadImagePermission) {
            this.mUploadImage.setVisibility(8);
        } else {
            this.mUploadImage.setVisibility(0);
        }
        if (!C6319n.m19593a(this.f92338t.getPoiLatitude()) && !C6319n.m19593a(this.f92338t.getPoiLongitude())) {
            try {
                mo89860P();
                this.f92360E = Double.parseDouble(this.f92338t.getPoiLatitude());
                this.f92361F = Double.parseDouble(this.f92338t.getPoiLongitude());
                double[] a = C35442b.m114469a(this.f92360E, this.f92361F);
                this.f92360E = a[0];
                this.f92361F = a[1];
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
        m113765a(poiDetail.getPoiTopPhoto());
        mo89753K();
        C42961az.m136380a(new FinishMapEvent());
        return false;
    }

    /* renamed from: a */
    public final void mo88969a(double d, double d2) {
        C35454m.m114529a("click_map", "click", this.f92333i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89756a(String[] strArr, int[] iArr) {
        if (strArr != null && strArr.length != 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(getActivity(), ChooseImageActivity.class);
                intent.putExtra("poi_id", this.f92334j);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.s, 0);
                return;
            }
            C10761a.m31392b((Context) getActivity(), (int) R.string.ct5, 0).mo25750a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.mTopbarStatus.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
            this.mRouteStatus.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
        }
        this.f92366x = new PoiOptimizedRoutePresenter();
        this.f92366x.mo89790a(this, view, this.mPoiMap, mo89755M());
        this.f92356A = new C35447g();
        this.mPoiMap.mo88952a(bundle, this);
        this.mPoiMap.setOnMapClickListener(this);
        this.mPoiMap.setOnMapZoomGestureListener(this);
        this.mPoiMap.f91774a = this;
        this.f92368z = new C6309f(this);
        m113757O();
        if (this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.mo90214a(this, this, null, this);
        }
        m113756N();
        m113763U();
    }
}
