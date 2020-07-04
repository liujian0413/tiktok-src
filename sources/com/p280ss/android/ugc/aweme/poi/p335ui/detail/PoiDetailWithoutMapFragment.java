package com.p280ss.android.ugc.aweme.poi.p335ui.detail;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.music.p1408b.C33772g;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.C35008a;
import com.p280ss.android.ugc.aweme.poi.event.C35078a;
import com.p280ss.android.ugc.aweme.poi.event.C35083f;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.p335ui.AbsSlidablePoiAwemeFeedFragment;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiRouteActivity;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a.C35317a;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a.C35318b;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.AppBarLayout;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.AppBarLayout.C35365a;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.BubbleLayout;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment */
public class PoiDetailWithoutMapFragment extends AbsSlidablePoiAwemeFeedFragment implements C29374h, C35008a, C35316a, C35321b {

    /* renamed from: B */
    public BubbleLayout f92568B;

    /* renamed from: C */
    public View f92569C;

    /* renamed from: D */
    public int f92570D;

    /* renamed from: E */
    public int f92571E;

    /* renamed from: F */
    public int f92572F;

    /* renamed from: G */
    public int f92573G;

    /* renamed from: H */
    public int f92574H;

    /* renamed from: J */
    private boolean f92575J = true;

    /* renamed from: K */
    private String f92576K;

    /* renamed from: L */
    private C35317a f92577L;

    /* renamed from: M */
    private int f92578M;

    /* renamed from: N */
    private int f92579N;
    AppBarLayout mAppBarLayout;
    public RecyclerView mRecyclerView;
    RelativeLayout mRootLayout;
    protected View mTopbarDivider;

    /* renamed from: D */
    public final C35008a mo89714D() {
        return this;
    }

    /* renamed from: E */
    public final C29374h mo89715E() {
        return this;
    }

    /* renamed from: K */
    public final void mo89753K() {
        super.mo89753K();
    }

    /* renamed from: M */
    public final boolean mo89755M() {
        return false;
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo75108a(RecyclerView recyclerView, int i) {
    }

    /* renamed from: b */
    public final void mo75109b(RecyclerView recyclerView, int i) {
    }

    /* renamed from: g */
    public final int mo89734g() {
        return R.layout.pp;
    }

    /* renamed from: N */
    public static void m113965N() {
        C35318b.m114003a().mo89887b();
    }

    /* renamed from: O */
    public static void m113966O() {
        C35318b.m114003a().mo89889c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final /* synthetic */ void mo89860P() {
        m113969f(this.f92578M);
    }

    /* renamed from: a */
    public final int mo75107a() {
        return this.f92570D + this.f92571E;
    }

    public void onDestroy() {
        super.onDestroy();
        C35318b.m114003a().mo89888b(m113967Q());
    }

    public void onPause() {
        super.onPause();
        this.f92575J = false;
        m113966O();
    }

    /* renamed from: L */
    public final void mo89754L() {
        int i;
        if (this.f92337s != null) {
            i = this.f92337s.aroundHotPoiCount;
        } else {
            i = 0;
        }
        PoiRouteActivity.m113823a(getContext(), this.f92338t, "poi_page", mo89713B(), true, i);
    }

    public void onResume() {
        super.onResume();
        this.f92575J = true;
        C35318b.m114003a().mo89886a(m113967Q());
        m113965N();
    }

    /* renamed from: Q */
    private String m113967Q() {
        if (TextUtils.isEmpty(this.f92576K)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f92332h.poiId);
            sb.append("-");
            sb.append(System.currentTimeMillis());
            this.f92576K = sb.toString();
        }
        return this.f92576K;
    }

    public final void bu_() {
        if (getActivity() != null && isViewValid() && this.f92575J && this.f92577L != null && this.f92577L.mo89874a()) {
            this.f92568B = this.f92330f.mo90102a(this.mRootLayout);
            final ViewTreeObserver viewTreeObserver = this.f92568B.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (PoiDetailWithoutMapFragment.this.f92574H == 0) {
                        C35386j.m114274a(PoiDetailWithoutMapFragment.this.f92568B);
                        PoiDetailWithoutMapFragment.this.f92574H = PoiDetailWithoutMapFragment.this.f92568B.getWidth();
                        if ((-PoiDetailWithoutMapFragment.this.f92571E) >= PoiDetailWithoutMapFragment.this.mAppBarLayout.getTotalScrollRange()) {
                            int[] iArr = new int[2];
                            PoiDetailWithoutMapFragment.this.mTopCollectImg.getLocationOnScreen(iArr);
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f92572F - (PoiDetailWithoutMapFragment.this.f92574H / 2)));
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationY((float) (iArr[1] + PoiDetailWithoutMapFragment.this.mTopCollectImg.getHeight()));
                        } else {
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f92572F - (PoiDetailWithoutMapFragment.this.f92574H / 2)));
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationY((float) PoiDetailWithoutMapFragment.this.f92573G);
                        }
                        PoiDetailWithoutMapFragment.this.f92568B.setVisibility(0);
                        C35386j.m114273a((View) PoiDetailWithoutMapFragment.this.f92568B);
                        return;
                    }
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            });
            C35454m.m114527a(this.f92338t, "favourite_reminder_jump", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f92333i.getPreviousPage()).mo59973a("poi_id", this.f92333i.getPoiId()));
            C35318b.m114003a().mo89890d();
        }
    }

    /* renamed from: e_ */
    public final void mo89866e_(int i) {
        m113968a(i, false);
    }

    /* renamed from: e */
    public final void mo89865e(int i) {
        if (isViewValid() && this.f92570D > 0) {
            mo89720a(i);
        }
    }

    @C7709l
    public void setInitLocation(C35083f fVar) {
        this.f92572F = fVar.f91747a;
        this.f92573G = fVar.f91748b;
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/poi/aweme/?")) {
            C42961az.m136385f(aVar);
            this.f92329e.mo75167e();
        }
    }

    /* renamed from: f */
    private void m113969f(int i) {
        C35370d dVar = (C35370d) this.mAppBarLayout.getLayoutParams();
        int height = this.f92569C.getHeight() - i;
        dVar.height = height;
        this.f92570D = height;
        this.mAppBarLayout.setLayoutParams(dVar);
        this.mAppBarLayout.setAnchorHeight(height - this.f92578M);
        this.mAppBarLayout.mo89931a(this.f92578M - height);
    }

    /* renamed from: c */
    public final void mo89863c(int i) {
        if (isViewValid() && this.f92570D > 0) {
            int i2 = -this.f92570D;
            if (i <= i2) {
                this.mPoiMap.setTranslationY((float) ((-i2) / 2));
                return;
            }
            float f = (float) i2;
            this.mPoiMap.setTranslationY(((-Math.abs((((float) i) * 1.0f) / f)) * f) / 2.0f);
        }
    }

    @C7709l
    public void onCollectedPoi(C33772g gVar) {
        if (gVar == null || 1 != gVar.f88129a) {
            C35318b.m114003a().mo89888b(m113967Q());
        } else {
            C35318b.m114003a().mo89890d();
        }
        if (this.f92568B != null) {
            this.f92330f.mo90103a(this.mRootLayout, (View) this.f92568B);
        }
    }

    @C7709l
    public void onFeedFinish(C35078a aVar) {
        if (this.f92577L != null && this.f92577L.mo89878d() == 2 && this.f92337s != null && TextUtils.equals(this.f92337s.getPoiId(), aVar.f91737a)) {
            this.f92577L.mo89873a(true);
        }
    }

    /* renamed from: a */
    public final boolean mo89727a(PoiDetail poiDetail) {
        boolean a = super.mo89727a(poiDetail);
        if (poiDetail.isCollected()) {
            C35318b.m114003a().mo89888b(m113967Q());
        }
        return a;
    }

    /* renamed from: d */
    public final void mo89864d(int i) {
        if (isViewValid() && this.f92570D > 0) {
            boolean a = C35462r.m114565a();
            float height = 1.0f - ((((float) (((this.f92570D + i) - this.mTopbarStatus.getHeight()) - this.f92579N)) * 1.0f) / ((float) ((this.f92578M - this.mTopbarStatus.getHeight()) - this.f92579N)));
            this.mTopbarBg.setAlpha(height);
            this.mTopbarStatus.setAlpha(height);
            this.f92366x.mo89787a(height);
            if (height > 0.0f) {
                this.mTopbarBg.setVisibility(0);
                this.f92366x.mo89788a(0);
                if (a) {
                    this.mTopCollectImg.setAlpha(height);
                    this.mTopCollectImg.setVisibility(0);
                }
                this.mTopbarDivider.setVisibility(0);
                this.mTopbarDivider.setAlpha(height);
                if (C6399b.m19944t()) {
                    double d = (double) height;
                    if (d > 0.5d) {
                        this.mBackBtn.setImageResource(R.drawable.adc);
                        this.mBackBtn.setBackgroundResource(R.drawable.blk);
                        Double.isNaN(d);
                        float f = (float) ((d - 0.5d) * 2.0d);
                        if (f <= 0.2f) {
                            f = 0.2f;
                        }
                        this.mBackBtn.setAlpha(f);
                        return;
                    }
                    this.mBackBtn.setImageResource(R.drawable.b1x);
                    this.mBackBtn.setBackgroundResource(R.drawable.u6);
                    this.mBackBtn.setAlpha(1.0f - (height * 2.0f));
                }
            } else {
                this.mBackBtn.setAlpha(1.0f);
                this.mBackBtn.setImageResource(R.drawable.b1x);
                this.mBackBtn.setBackgroundResource(R.drawable.u6);
                this.mTopbarBg.setVisibility(8);
                this.mTopbarDivider.setVisibility(8);
                this.f92366x.mo89788a(8);
                this.mTopCollectImg.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m113968a(int i, boolean z) {
        this.mAppBarLayout.mo89931a(-this.f92570D);
        this.f92368z.postDelayed(new C35350d(this, false, i), 0);
    }

    /* renamed from: a */
    public final void mo88807a(int i, float f) {
        StringBuilder sb = new StringBuilder("PoiDetailWithoutMapFragment/updatePanelHeight...height:");
        sb.append(i);
        sb.append("/panelHeight:");
        sb.append(f);
        if (i > 0) {
            m113969f(i);
        } else {
            this.mAppBarLayout.post(new C35328c(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89861a(boolean z, int i) {
        if (z) {
            C353143 r2 = new LinearSmoothScroller(this.mRecyclerView.getContext()) {
                /* renamed from: a */
                public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                    return super.mo5466a(i, i2, i3, i4, -1);
                }
            };
            r2.f4993g = i;
            this.mRecyclerView.getLayoutManager().mo5755a((C1287r) r2);
            return;
        }
        ((LinearLayoutManager) this.mRecyclerView.getLayoutManager()).mo5417a(i, 0);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f92569C = view;
        this.f92579N = getResources().getDimensionPixelSize(R.dimen.x5);
        Resources resources = getResources();
        if (C22911a.m75401a(getContext())) {
            i = R.dimen.li;
        } else {
            i = R.dimen.lh;
        }
        this.f92570D = resources.getDimensionPixelSize(i);
        this.f92578M = this.f92570D;
        this.mHeader.getLayoutParams().height = this.f92570D;
        this.mAppBarLayout.mo89932a((C35365a) new C35365a() {
            /* renamed from: a */
            public final void mo89871a(AppBarLayout appBarLayout, int i) {
                if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    StringBuilder sb = new StringBuilder("PoiDetailWithoutMapFragment////");
                    sb.append(i);
                    sb.append("/");
                    sb.append(appBarLayout.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.f92569C.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.mTopbarStatus.getHeight());
                    PoiDetailWithoutMapFragment.this.f92571E = i;
                    PoiDetailWithoutMapFragment.this.mo89741o();
                    PoiDetailWithoutMapFragment.this.mo89863c(i);
                    PoiDetailWithoutMapFragment.this.mo89864d(i);
                    PoiDetailWithoutMapFragment.this.mo89865e(i);
                    if (!(PoiDetailWithoutMapFragment.this.f92568B == null || PoiDetailWithoutMapFragment.this.f92568B.getParent() == null)) {
                        int[] iArr = new int[2];
                        PoiDetailWithoutMapFragment.this.mTopCollectImg.getLocationOnScreen(iArr);
                        if ((-i) >= appBarLayout.getHeight()) {
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f92572F - (PoiDetailWithoutMapFragment.this.f92574H / 2)));
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationY((float) (iArr[1] + PoiDetailWithoutMapFragment.this.mTopCollectImg.getHeight()));
                        } else {
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationX((float) (PoiDetailWithoutMapFragment.this.f92572F - (PoiDetailWithoutMapFragment.this.f92574H / 2)));
                            PoiDetailWithoutMapFragment.this.f92568B.setTranslationY((float) (PoiDetailWithoutMapFragment.this.f92573G + i));
                        }
                    }
                    LayoutParams layoutParams = PoiDetailWithoutMapFragment.this.mHeader.getLayoutParams();
                    layoutParams.height = PoiDetailWithoutMapFragment.this.f92570D + i;
                    PoiDetailWithoutMapFragment.this.mHeader.setLayoutParams(layoutParams);
                }
            }
        });
        mo89722a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    PoiDetailWithoutMapFragment.this.mo89741o();
                    PoiDetailWithoutMapFragment.this.mo89720a(i2);
                }
            }
        });
        this.mAppBarLayout.f92685d = false;
        this.f92577L = C35318b.m114003a().mo89885a(m113967Q(), this);
        if (this.f92577L != null && this.f92577L.mo89876b()) {
            this.f92577L.mo89877c();
        }
    }
}
