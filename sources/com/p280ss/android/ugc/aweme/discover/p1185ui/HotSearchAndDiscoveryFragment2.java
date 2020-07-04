package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchCarouselExperiment;
import com.p280ss.android.ugc.aweme.discover.activity.C26369a;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.helper.C26649a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.helper.C26661i;
import com.p280ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.HotSearchListObserver;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchObserver;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchStateListener;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26581h;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment.Style;
import com.p280ss.android.ugc.aweme.discover.p1185ui.HotSearchWordsFlipperView.C26906a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchScanView.C26984a;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p280ss.android.ugc.aweme.feed.event.C28305aa;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2 */
public class HotSearchAndDiscoveryFragment2 extends BaseDiscoveryAndSearchFragment implements C26369a {

    /* renamed from: i */
    protected long f70984i = -1;

    /* renamed from: j */
    public boolean f70985j;

    /* renamed from: k */
    public boolean f70986k;

    /* renamed from: l */
    public boolean f70987l;
    LoftNestedRefreshLayout loftNestedRefreshLayout;

    /* renamed from: m */
    public LogPbBean f70988m;
    ViewGroup mFragmentContainer;
    HotSearchWordsFlipperView mHotSearchFlipperView;
    ImageView mRightBackBtn;
    View mRightSearchView;
    View mSearchContainer;
    SearchScanView mSearchScanView;
    SearchScanView mSearchScanViewRight;
    ViewGroup mTopStatus;

    /* renamed from: n */
    public C26906a f70989n;

    /* renamed from: o */
    private C26596c f70990o;

    /* renamed from: p */
    private C26649a f70991p;

    /* renamed from: q */
    private String f70992q;

    /* renamed from: r */
    private String f70993r;

    /* renamed from: s */
    private BroadcastReceiver f70994s;

    /* renamed from: t */
    private boolean f70995t;

    /* renamed from: u */
    private boolean f70996u;

    /* renamed from: v */
    private Context f70997v;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo69533e() {
        return 1;
    }

    /* renamed from: y */
    private void m88345y() {
        this.f70984i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo67888a() {
        if (this.mSearchInputView != null) {
            KeyboardUtils.m77057c(this.mSearchInputView);
            this.mSearchInputView.setCursorVisible(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo69535g() {
        KeyboardUtils.m77057c(this.mSearchInputView);
        m88344x();
    }

    public Context getContext() {
        if (this.f70997v != null) {
            return this.f70997v;
        }
        return super.getContext();
    }

    public void onPause() {
        super.onPause();
        this.f18760c_ = false;
        if (this.f70985j) {
            m88346z();
        }
        this.f70986k = false;
    }

    /* renamed from: q */
    private boolean m88337q() {
        if (C32904bi.m106502g()) {
            return false;
        }
        if (this.f70996u || !C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m88338r() {
        if (C32904bi.m106502g()) {
            return true;
        }
        if (this.f70996u || !C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m88343w() {
        if (C26654b.m87578f()) {
            this.f70893f.mo69985b(SearchEnterViewModel.m89250b(getActivity()));
        }
    }

    /* renamed from: b */
    public final void mo67890b() {
        C6726a.m20843a(new Runnable() {
            public final void run() {
                if (HotSearchAndDiscoveryFragment2.this.mSearchInputView != null) {
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.setText("");
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.setCursorVisible(false);
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.clearFocus();
                }
            }
        }, C34943c.f91127w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo69532d() {
        if (C6399b.m19944t()) {
            return R.layout.oc;
        }
        return R.layout.od;
    }

    /* renamed from: o */
    public final void mo69591o() {
        if (this.mUserVisibleHint && !C43076dy.m136656a() && this.f70985j && this.f70990o != null) {
            this.f70990o.aJ_();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        C0688e.m2941a(getContext()).mo2837a(this.f70994s);
    }

    /* renamed from: A */
    private void m88330A() {
        this.f70991p.mo68349b();
        mo69530c(1);
        this.mSearchInputView.setText("");
        this.mSearchInputView.setCursorVisible(false);
        mo69522a(false);
        this.f70990o.mo68282b(mo69541n());
    }

    /* renamed from: s */
    private void m88339s() {
        if (m88337q()) {
            this.mSearchScanView.setVisibility(8);
            this.mSearchScanViewRight.setVisibility(0);
            this.mSearchScanViewRight.mo69771a();
        } else {
            this.mSearchScanViewRight.setVisibility(8);
            this.mSearchScanView.setVisibility(0);
            this.mSearchScanView.mo69771a();
        }
        C269002 r0 = new C26984a() {
            /* renamed from: a */
            public final void mo67879a(View view) {
                HotSearchAndDiscoveryFragment2.this.mo69528b(new SearchResultParam().setEnterFrom("normal_search").setSearchFrom(0));
            }

            /* renamed from: b */
            public final void mo67880b(View view) {
                C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
                QRCodePermissionActivity.m119022a(HotSearchAndDiscoveryFragment2.this.getContext(), false);
            }
        };
        this.mSearchScanView.setOnInternalClickListener(r0);
        this.mSearchScanViewRight.setOnInternalClickListener(r0);
    }

    /* renamed from: x */
    private void m88344x() {
        if (!mo67891c()) {
            if (getActivity() instanceof MainActivity) {
                ((MainActivity) getActivity()).onKeyBack();
            } else {
                getActivity().onBackPressed();
            }
        }
    }

    /* renamed from: z */
    private void m88346z() {
        if (this.f70984i > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f70984i;
            if (currentTimeMillis > 0) {
                C1592h.m7855a((Callable<TResult>) new C26998ac<TResult>(currentTimeMillis), (Executor) C6907h.m21516a());
            }
            this.f70984i = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo69539l() {
        if (mo69541n() == 1) {
            this.f70991p.mo68345a();
        }
        this.mIntermediateView.mo69728a();
        mo69530c(3);
        this.f70990o.mo68282b(mo69541n());
        this.f70990o.onHiddenChanged(true);
    }

    /* renamed from: p */
    private void m88336p() {
        SearchScanView searchScanView;
        ImageView imageView;
        Context context = getContext();
        ViewGroup viewGroup = this.mTopStatus;
        if (m88337q()) {
            searchScanView = this.mSearchScanViewRight;
        } else {
            searchScanView = this.mSearchScanView;
        }
        SearchScanView searchScanView2 = searchScanView;
        ImageView imageView2 = this.mBackView;
        if (m88338r()) {
            imageView = this.mRightBackBtn;
        } else {
            imageView = this.mBackView;
        }
        C26661i iVar = new C26661i(context, viewGroup, searchScanView2, imageView2, imageView, this.mTvSearch, this.mSearchContainer);
        this.f70991p = iVar;
        ((C26661i) this.f70991p).mo68363b(!this.f70996u).mo68364c(m88338r()).mo68365d(true).mo68366e(m88337q());
    }

    /* renamed from: t */
    private void m88340t() {
        if (C6384b.m19835a().mo15287a(SearchCarouselExperiment.class, true, "search_carousel", C6384b.m19835a().mo15295d().search_carousel, 0) != 1) {
            this.f70892e.hotSearchLiveData.observe(this, new HotSearchListObserver().setListener(new C27105y(this)));
        } else {
            this.f70892e.hotSearchLiveData.observe(this, new HotSearchListObserver().setListener(new IHotSearchListListener() {
                public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
                    HotSearchAndDiscoveryFragment2.this.f70988m = logPbBean;
                    HotSearchAndDiscoveryFragment2.this.f70987l = true;
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                    HotSearchAndDiscoveryFragment2.this.mo69588a(str, str2, logPbBean);
                }

                public final void onHotSearchWordsFlipper(List<HotSearchItem> list, LogPbBean logPbBean, List<AdDefaultSearchStruct> list2) {
                    HotSearchAndDiscoveryFragment2.this.f70988m = logPbBean;
                    HotSearchAndDiscoveryFragment2.this.f70987l = false;
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.setVisibility(0);
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint("");
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69601a(list, list2);
                }
            }));
            getLifecycle().mo55a(this.mHotSearchFlipperView);
            this.f70892e.searchState.observe(this, new SearchObserver().setListener(new SearchStateListener() {
                public final void onPageHidden() {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69602b();
                }

                public final void onPageResume() {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69599a();
                }

                public final void onContentVisible(boolean z) {
                    if (!HotSearchAndDiscoveryFragment2.this.f70987l) {
                        if (z) {
                            HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69599a();
                            HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint("");
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                        if (TextUtils.isEmpty(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord())) {
                            HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint(HotSearchAndDiscoveryFragment2.this.mo69536i());
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord());
                        HotSearchAndDiscoveryFragment2.this.f70894g = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentOperatedWord();
                        HotSearchAndDiscoveryFragment2.this.f70989n = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentItem();
                    }
                }
            }));
        }
        this.f70892e.isVisibleToUser.observe(this, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69599a();
                } else {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo69602b();
                }
            }
        });
    }

    /* renamed from: u */
    private void m88341u() {
        this.mRightBackBtn.setOnClickListener(new C27106z(this));
        if (this.f70996u) {
            this.mRightBackBtn.setVisibility(8);
            this.mBackView.setVisibility(8);
        } else if (m88338r()) {
            this.mRightBackBtn.setVisibility(0);
            this.mBackView.setVisibility(8);
        } else {
            this.mRightBackBtn.setVisibility(8);
            this.mBackView.setVisibility(0);
        }
        if (this.f70996u) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mSearchContainer.getLayoutParams();
            int b = (int) C9738o.m28708b(getContext(), 16.0f);
            marginLayoutParams.leftMargin = b;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(b);
            }
            this.mSearchContainer.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: v */
    private void m88342v() {
        if (C43122ff.m136767b()) {
            C23487o.m77140a(this.mRightSearchView, 8);
            if (this.mSearchInputView != null) {
                this.mSearchInputView.setCursorVisible(false);
                this.mSearchInputView.setFocusable(false);
                this.mSearchInputView.setFocusableInTouchMode(false);
                this.mSearchInputView.setOnClickListener(C26996aa.f71280a);
            }
            if (this.mSearchContainer != null && getContext() != null) {
                LayoutParams layoutParams = this.mSearchContainer.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.rightMargin = (int) C9738o.m28708b(getContext(), 16.0f);
                    layoutParams2.leftMargin = (int) C9738o.m28708b(getContext(), 16.0f);
                    if (VERSION.SDK_INT >= 17) {
                        int b = (int) C9738o.m28708b(getContext(), 16.0f);
                        layoutParams2.setMarginEnd(b);
                        layoutParams2.setMarginStart(b);
                    }
                    this.mSearchContainer.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo67891c() {
        if (!isViewValid()) {
            return false;
        }
        if (this.mSearchInputView != null) {
            this.mSearchInputView.setText("");
            this.mSearchInputView.setCursorVisible(false);
            this.mSearchInputView.clearFocus();
        }
        if (mo69541n() == 1) {
            return false;
        }
        if (this.f70991p != null) {
            this.f70991p.mo68349b();
        }
        mo69530c(1);
        mo69522a(true);
        this.f70990o.mo68282b(mo69541n());
        this.f70990o.onHiddenChanged(false);
        m88343w();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo69534f() {
        Style style;
        mo69530c(1);
        C0633q a = getChildFragmentManager().mo2645a();
        if (C6399b.m19944t()) {
            style = Style.DISCOVER_LEFT;
        } else {
            style = Style.HOT_SEARCH_WITH_DISCOVER;
        }
        this.f70990o = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDiscoverFragment(style, false);
        this.loftNestedRefreshLayout.mo64894a((C24858b) new C24858b() {
            /* renamed from: b */
            public final void mo64992b() {
            }

            /* renamed from: d */
            public final void mo64994d() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: e */
            public final /* synthetic */ void mo69594e() {
                HotSearchAndDiscoveryFragment2.this.mGapStatusBar.setVisibility(0);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: f */
            public final /* synthetic */ void mo69595f() {
                HotSearchAndDiscoveryFragment2.this.mTopStatus.setVisibility(0);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: g */
            public final /* synthetic */ void mo69596g() {
                HotSearchAndDiscoveryFragment2.this.mGapStatusBar.setVisibility(4);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: h */
            public final /* synthetic */ void mo69597h() {
                HotSearchAndDiscoveryFragment2.this.mTopStatus.setVisibility(4);
            }

            /* renamed from: a */
            public final void mo64991a() {
                if (HotSearchAndDiscoveryFragment2.this.mTopStatus != null) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new C26999ad(this)).start();
                }
                if (HotSearchAndDiscoveryFragment2.this.mGapStatusBar != null) {
                    HotSearchAndDiscoveryFragment2.this.mGapStatusBar.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new C27000ae(this)).start();
                }
            }

            /* renamed from: c */
            public final void mo64993c() {
                if (!(HotSearchAndDiscoveryFragment2.this.mTopStatus == null || HotSearchAndDiscoveryFragment2.this.mTopStatus.getVisibility() == 0 || HotSearchAndDiscoveryFragment2.this.mTopStatus == null)) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new C27001af(this)).start();
                }
                if (HotSearchAndDiscoveryFragment2.this.mGapStatusBar != null && HotSearchAndDiscoveryFragment2.this.mGapStatusBar.getVisibility() != 0) {
                    HotSearchAndDiscoveryFragment2.this.mGapStatusBar.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new C27002ag(this)).start();
                }
            }
        });
        this.f70990o.mo68279a(this.loftNestedRefreshLayout);
        this.f70990o.mo68282b(mo69541n());
        a.mo2599b(R.id.aoy, (Fragment) this.f70990o);
        a.mo2606d();
        this.f70990o.mo68280a(false);
    }

    public void onResume() {
        super.onResume();
        if (this.f70985j) {
            this.f70984i = System.currentTimeMillis();
        }
        if (this.f70995t) {
            this.f70995t = false;
            m88330A();
        }
        if (this.mUserVisibleHint && !C43076dy.m136656a() && this.f70985j) {
            String charSequence = this.mSearchInputView.getHint().toString();
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, mo69536i()) && this.f70988m != null) {
                C6907h.m21524a("search_default", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", charSequence).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70988m)).f60753a);
            }
            this.f70986k = true;
        }
        if (mo69541n() == 1) {
            m88343w();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f70997v = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo69590e(View view) {
        KeyboardUtils.m77057c(this.mIntermediateView);
        m88344x();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        m88333b(!z);
    }

    /* renamed from: f */
    private void m88335f(View view) {
        if (view != null) {
            view.setBackground(null);
        }
        if (this.loftNestedRefreshLayout != null) {
            this.loftNestedRefreshLayout.setBackground(null);
        }
        if (this.mFragmentContainer != null) {
            this.mFragmentContainer.setBackground(null);
        }
    }

    /* renamed from: c */
    public final void mo69530c(int i) {
        super.mo69530c(i);
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            C42961az.m136380a(new C28305aa(8));
        } else {
            C42961az.m136380a(new C28305aa(0));
        }
    }

    @C7709l
    public void onSearchResultOpenedEvent(C26581h hVar) {
        if (mo69541n() != 1 && isViewValid()) {
            m88330A();
        }
    }

    /* renamed from: b */
    private void m88333b(boolean z) {
        if (!(getActivity() == null || this.f70990o == null || mo69541n() != 1)) {
            this.f70990o.mo68280a(z);
        }
        if (this.f70892e != null) {
            this.f70892e.isVisibleToUser.setValue(Boolean.valueOf(!z));
        }
        this.f70985j = !z;
        if (this.f70985j) {
            m88345y();
            if (isViewValid()) {
                m88343w();
            }
        } else {
            m88346z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69517a(Bundle bundle) {
        if (bundle != null) {
            this.f70996u = bundle.getBoolean("i18n_tab_mode", false);
            SearchEnterViewModel.m89249a(getActivity()).mo69989a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69518a(View view) {
        if (!C43122ff.m136767b() && this.mSearchInputView != null) {
            if (mo69541n() == 1) {
                C6907h.m21524a("enter_search", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
            }
            this.mSearchInputView.setCursorVisible(true);
            KeyboardUtils.m77056b(this.mSearchInputView);
            if (TextUtils.isEmpty(this.mSearchInputView.getText().toString())) {
                mo69539l();
            } else {
                mo69540m();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69528b(SearchResultParam searchResultParam) {
        if ((!C6399b.m19944t() || !C27035bc.m88798a(searchResultParam.getKeyword())) && getContext() != null) {
            this.mIntermediateView.mo69730a(searchResultParam);
            C37385g gVar = C37385g.f97617a;
            C37388a aVar = new C37388a(getActivity(), searchResultParam, null, null, null, null);
            gVar.launchSearchPage(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69529b(String str) {
        String str2;
        C26906a aVar;
        String str3;
        boolean z = false;
        if (TextUtils.isEmpty(str) && (mo69541n() == 1 || SearchStateViewModel.isSearchIntermediate(mo69541n()))) {
            str2 = this.mSearchInputView.getHint().toString();
            if (!TextUtils.isEmpty(str2) && !mo69525a(str2)) {
                if (C26654b.m87578f()) {
                    if (this.f70895h == null) {
                        str3 = "";
                    } else {
                        str3 = this.f70895h.getId();
                    }
                    C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", 0).mo59973a("words_source", "recom_search").mo59973a("words_content", str2).mo59973a("group_id", str3).f60753a);
                } else {
                    C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", str2).mo59973a("key_word_type", "general_word").mo59973a("enter_from", "default_search_keyword").f60753a);
                }
                z = true;
                aVar = this.f70989n;
                if (aVar != null && aVar.mo69610a() == 2) {
                    C24962g.m81952a((C24939aj) new C26997ab(this, aVar), aVar.f71013b.getAdData().getClickTrackUrlList(), true);
                    C24958f.m81905a().mo65266a("result_ad").mo65276b("hot_search_keyword_click").mo65283e("default_search_keyword").mo65286h(aVar.f71013b.getAdData().getLogExtra()).mo65264a(aVar.f71013b.getAdData().getCreativeId()).mo65270a(getContext());
                }
                String str4 = null;
                if (z && !C26654b.m87578f()) {
                    str4 = this.f70894g;
                }
                super.mo69521a(str2, str4, z);
            }
        }
        str2 = str;
        aVar = this.f70989n;
        C24962g.m81952a((C24939aj) new C26997ab(this, aVar), aVar.f71013b.getAdData().getClickTrackUrlList(), true);
        C24958f.m81905a().mo65266a("result_ad").mo65276b("hot_search_keyword_click").mo65283e("default_search_keyword").mo65286h(aVar.f71013b.getAdData().getLogExtra()).mo65264a(aVar.f71013b.getAdData().getCreativeId()).mo65270a(getContext());
        String str42 = null;
        str42 = this.f70894g;
        super.mo69521a(str2, str42, z);
    }

    /* renamed from: b */
    private void m88332b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            mo69521a(str, str2, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70994s = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && HotSearchAndDiscoveryFragment2.this.mUserVisibleHint && HotSearchAndDiscoveryFragment2.this.f18760c_ && !HotSearchAndDiscoveryFragment2.this.f70986k && HotSearchAndDiscoveryFragment2.this.f70985j) {
                    String charSequence = HotSearchAndDiscoveryFragment2.this.mSearchInputView.getHint().toString();
                    if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, HotSearchAndDiscoveryFragment2.this.mo69536i()) && HotSearchAndDiscoveryFragment2.this.f70988m != null) {
                        C6907h.m21524a("search_default", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", charSequence).mo59973a("log_pb", new C6600e().mo15979b((Object) HotSearchAndDiscoveryFragment2.this.f70988m)).f60753a);
                    }
                    HotSearchAndDiscoveryFragment2.this.f70986k = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a(getContext()).mo2838a(this.f70994s, intentFilter);
        m88332b(this.f70993r, this.f70992q);
        this.f70893f.f71743b.mo60162a(this, this, true);
    }

    /* renamed from: a */
    public final void mo67889a(String str, String str2) {
        if (this.mSearchInputView == null) {
            this.f70993r = str;
            this.f70992q = str2;
            return;
        }
        m88332b(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo69589b(String str, String str2, LogPbBean logPbBean) {
        this.f70988m = logPbBean;
        mo69588a(str, str2, logPbBean);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        m88339s();
        m88340t();
        m88341u();
        m88336p();
        m88342v();
        m88335f(onCreateView);
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo69588a(String str, String str2, LogPbBean logPbBean) {
        if (!C26654b.m87578f() && getActivity() != null && !getActivity().isFinishing() && mo69541n() == 1 && !TextUtils.isEmpty(str) && !TextUtils.equals(str, mo69536i()) && !TextUtils.equals(this.mSearchInputView.getHint().toString(), str)) {
            C6907h.m21524a("search_default", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", str).mo59973a("log_pb", new C6600e().mo15979b((Object) logPbBean)).f60753a);
            this.mSearchInputView.setHint(str);
            this.f70894g = str2;
            this.f70989n = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69587a(C26906a aVar, String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65263a(aVar.f71013b.getAdData()).mo65270a(getContext());
    }
}
