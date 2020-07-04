package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0996w;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C21651ak;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.helper.C26662j;
import com.p280ss.android.ugc.aweme.discover.helper.C26664l;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateData;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.HotSearchListObserver;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26574a;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26575b;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26579f;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26581h;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26582i;
import com.p280ss.android.ugc.aweme.discover.p1185ui.p1186a.C26995b;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.C37381d;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment */
public final class SearchResultFragment extends BaseDiscoveryAndSearchFragment {

    /* renamed from: l */
    public static final int f71210l = C23486n.m77122a(16.0d);

    /* renamed from: m */
    public static final C26966a f71211m = new C26966a(null);

    /* renamed from: i */
    public LoftNestedRefreshLayout f71212i;

    /* renamed from: j */
    public ViewGroup f71213j;

    /* renamed from: k */
    public SearchResultParam f71214k;

    /* renamed from: n */
    private ViewGroup f71215n;

    /* renamed from: o */
    private ViewGroup f71216o;

    /* renamed from: p */
    private ViewGroup f71217p;

    /* renamed from: q */
    private C26662j f71218q;

    /* renamed from: r */
    private HashMap f71219r;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$a */
    public static final class C26966a {
        private C26966a() {
        }

        public /* synthetic */ C26966a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchResultFragment m88699a(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam) {
            C7573i.m23587b(searchResultParam, "param");
            Bundle bundle = new Bundle();
            bundle.putSerializable("searchParam", searchResultParam);
            bundle.putSerializable("search_enter_param", searchEnterParam);
            SearchResultFragment searchResultFragment = new SearchResultFragment();
            searchResultFragment.setArguments(bundle);
            return searchResultFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$b */
    public static final class C26967b implements C10820c {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71220a;

        C26967b(SearchResultFragment searchResultFragment) {
            this.f71220a = searchResultFragment;
        }

        /* renamed from: b */
        public final void mo26116b(C10825f fVar) {
            C7573i.m23587b(fVar, "tab");
            SearchResultFragment searchResultFragment = this.f71220a;
            EditText editText = this.f71220a.mSearchInputView;
            C7573i.m23582a((Object) editText, "mSearchInputView");
            if (searchResultFragment.mo69525a(editText.getHint().toString())) {
                EditText editText2 = this.f71220a.mSearchInputView;
                C7573i.m23582a((Object) editText2, "mSearchInputView");
                editText2.setHint(this.f71220a.mo69516a(fVar.f29291e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$c */
    static final class C26968c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71221a;

        C26968c(SearchResultFragment searchResultFragment) {
            this.f71221a = searchResultFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "default_search_keyword").f60753a);
            QRCodePermissionActivity.m119022a(this.f71221a.getContext(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$d */
    public static final class C26969d extends C27009an {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71222a;

        C26969d(SearchResultFragment searchResultFragment) {
            this.f71222a = searchResultFragment;
        }

        /* renamed from: b */
        public final void mo67959b(View view, MotionEvent motionEvent) {
            if (this.f71222a.isViewValid()) {
                this.f71222a.mo69535g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$e */
    static final class C26970e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71223a;

        C26970e(SearchResultFragment searchResultFragment) {
            this.f71223a = searchResultFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71223a.mSearchInputView.setText("");
            EditText editText = this.f71223a.mSearchInputView;
            C7573i.m23582a((Object) editText, "mSearchInputView");
            editText.setCursorVisible(true);
            KeyboardUtils.m77056b(this.f71223a.mSearchInputView);
            Activity[] activityStack = ActivityStack.getActivityStack();
            C7573i.m23582a((Object) activityStack, "stack");
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (C37385g.f97617a.isSearchResultActivity(activityStack[i])) {
                    break;
                }
                i++;
            }
            int length2 = activityStack.length - 1;
            while (true) {
                if (length2 < 0) {
                    length2 = -1;
                    break;
                }
                if (C37385g.f97617a.isSearchResultActivity(activityStack[length2])) {
                    break;
                }
                length2--;
            }
            if (i != length2) {
                while (i < length2) {
                    activityStack[i].finish();
                    i++;
                }
            }
            this.f71223a.mo69760p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$f */
    static final class C26971f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71224a;

        C26971f(SearchResultFragment searchResultFragment) {
            this.f71224a = searchResultFragment;
        }

        public final void run() {
            if (this.f71224a.isViewValid()) {
                this.f71224a.mSearchInputView.requestFocus();
                KeyboardUtils.m77056b(this.f71224a.mSearchInputView);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$g */
    public static final class C26972g implements C24858b {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71225a;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$g$a */
        static final class C26973a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26972g f71226a;

            C26973a(C26972g gVar) {
                this.f71226a = gVar;
            }

            public final void run() {
                ViewGroup viewGroup = this.f71226a.f71225a.f71213j;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$g$b */
        static final class C26974b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26972g f71227a;

            C26974b(C26972g gVar) {
                this.f71227a = gVar;
            }

            public final void run() {
                View view = this.f71227a.f71225a.mGapStatusBar;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$g$c */
        static final class C26975c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26972g f71228a;

            C26975c(C26972g gVar) {
                this.f71228a = gVar;
            }

            public final void run() {
                ViewGroup viewGroup = this.f71228a.f71225a.f71213j;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$g$d */
        static final class C26976d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26972g f71229a;

            C26976d(C26972g gVar) {
                this.f71229a = gVar;
            }

            public final void run() {
                View view = this.f71229a.f71225a.mGapStatusBar;
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }

        /* renamed from: b */
        public final void mo64992b() {
        }

        /* renamed from: d */
        public final void mo64994d() {
        }

        /* renamed from: a */
        public final void mo64991a() {
            if (this.f71225a.f71213j != null) {
                ViewGroup viewGroup = this.f71225a.f71213j;
                if (viewGroup != null) {
                    ViewPropertyAnimator animate = viewGroup.animate();
                    if (animate != null) {
                        ViewPropertyAnimator alpha = animate.alpha(0.0f);
                        if (alpha != null) {
                            ViewPropertyAnimator duration = alpha.setDuration(200);
                            if (duration != null) {
                                ViewPropertyAnimator interpolator = duration.setInterpolator(new LinearInterpolator());
                                if (interpolator != null) {
                                    ViewPropertyAnimator withEndAction = interpolator.withEndAction(new C26975c(this));
                                    if (withEndAction != null) {
                                        withEndAction.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f71225a.mGapStatusBar != null) {
                View view = this.f71225a.mGapStatusBar;
                if (view != null) {
                    ViewPropertyAnimator animate2 = view.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(0.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                            if (duration2 != null) {
                                ViewPropertyAnimator interpolator2 = duration2.setInterpolator(new LinearInterpolator());
                                if (interpolator2 != null) {
                                    ViewPropertyAnimator withEndAction2 = interpolator2.withEndAction(new C26976d(this));
                                    if (withEndAction2 != null) {
                                        withEndAction2.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo64993c() {
            if (this.f71225a.f71213j != null) {
                ViewGroup viewGroup = this.f71225a.f71213j;
                if ((viewGroup == null || viewGroup.getVisibility() != 0) && this.f71225a.f71213j != null) {
                    ViewGroup viewGroup2 = this.f71225a.f71213j;
                    if (viewGroup2 != null) {
                        ViewPropertyAnimator animate = viewGroup2.animate();
                        if (animate != null) {
                            ViewPropertyAnimator alpha = animate.alpha(1.0f);
                            if (alpha != null) {
                                ViewPropertyAnimator duration = alpha.setDuration(200);
                                if (duration != null) {
                                    ViewPropertyAnimator interpolator = duration.setInterpolator(new LinearInterpolator());
                                    if (interpolator != null) {
                                        ViewPropertyAnimator withStartAction = interpolator.withStartAction(new C26973a(this));
                                        if (withStartAction != null) {
                                            withStartAction.start();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f71225a.mGapStatusBar != null) {
                View view = this.f71225a.mGapStatusBar;
                C7573i.m23582a((Object) view, "mGapStatusBar");
                if (view.getVisibility() != 0) {
                    View view2 = this.f71225a.mGapStatusBar;
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        if (animate2 != null) {
                            ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                            if (alpha2 != null) {
                                ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                                if (duration2 != null) {
                                    ViewPropertyAnimator interpolator2 = duration2.setInterpolator(new LinearInterpolator());
                                    if (interpolator2 != null) {
                                        ViewPropertyAnimator withStartAction2 = interpolator2.withStartAction(new C26974b(this));
                                        if (withStartAction2 != null) {
                                            withStartAction2.start();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        C26972g(SearchResultFragment searchResultFragment) {
            this.f71225a = searchResultFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$h */
    public static final class C26977h implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71230a;

        /* renamed from: b */
        final /* synthetic */ SearchIntermediateViewModel f71231b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            int i;
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f71230a.f71212i;
            if (loftNestedRefreshLayout != null) {
                boolean z = false;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (SearchStateViewModel.isSearchIntermediate(i)) {
                    Integer num2 = (Integer) this.f71231b.getIntermediateState().getValue();
                    if (num2 != null && num2.intValue() == 1) {
                        z = true;
                    }
                }
                loftNestedRefreshLayout.setEnabled(z);
            }
        }

        C26977h(SearchResultFragment searchResultFragment, SearchIntermediateViewModel searchIntermediateViewModel) {
            this.f71230a = searchResultFragment;
            this.f71231b = searchIntermediateViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$i */
    public static final class C26978i implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71232a;

        /* renamed from: b */
        final /* synthetic */ SearchStateData f71233b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f71232a.f71212i;
            if (loftNestedRefreshLayout != null) {
                Integer num2 = (Integer) this.f71233b.getSearchState().getValue();
                boolean z = false;
                if (num2 == null) {
                    num2 = Integer.valueOf(0);
                }
                if (SearchStateViewModel.isSearchIntermediate(num2.intValue()) && num != null && num.intValue() == 1) {
                    z = true;
                }
                loftNestedRefreshLayout.setEnabled(z);
            }
        }

        C26978i(SearchResultFragment searchResultFragment, SearchStateData searchStateData) {
            this.f71232a = searchResultFragment;
            this.f71233b = searchStateData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$j */
    static final class C26979j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71234a;

        C26979j(SearchResultFragment searchResultFragment) {
            this.f71234a = searchResultFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                KeyboardUtils.m77057c(this.f71234a.mSearchInputView);
                EditText editText = this.f71234a.mSearchInputView;
                C7573i.m23582a((Object) editText, "mSearchInputView");
                editText.setCursorVisible(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$k */
    static final class C26980k implements IHotSearchListListener {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71235a;

        C26980k(SearchResultFragment searchResultFragment) {
            this.f71235a = searchResultFragment;
        }

        public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
            SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
        }

        public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
            this.f71235a.mo69753a(str, str2, logPbBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$l */
    static final class C26981l implements Runnable {

        /* renamed from: a */
        public static final C26981l f71236a = new C26981l();

        C26981l() {
        }

        public final void run() {
            C42961az.m136380a(new C26581h());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$m */
    public static final class C26982m implements C37381d {

        /* renamed from: a */
        final /* synthetic */ Runnable f71237a;

        /* renamed from: a */
        public final void mo69769a() {
            this.f71237a.run();
        }

        C26982m(Runnable runnable) {
            this.f71237a = runnable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$n */
    static final class C26983n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultFragment f71238a;

        /* renamed from: b */
        final /* synthetic */ SearchResultParam f71239b;

        C26983n(SearchResultFragment searchResultFragment, SearchResultParam searchResultParam) {
            this.f71238a = searchResultFragment;
            this.f71239b = searchResultParam;
        }

        public final void run() {
            if (this.f71238a.mo67888a() != null) {
                SearchContainerFragment a = this.f71238a.mo67888a();
                if (a == null) {
                    C7573i.m23580a();
                }
                a.mo69666b(this.f71239b);
                SearchResultParam searchResultParam = this.f71238a.f71214k;
                if (searchResultParam != null && searchResultParam.isOpenNewSearchContainer()) {
                    SearchContainerFragment a2 = this.f71238a.mo67888a();
                    if (a2 == null) {
                        C7573i.m23580a();
                    }
                    a2.mo69662a(0);
                }
            } else {
                this.f71238a.mo69754c(this.f71239b);
            }
            this.f71238a.mo69522a(false);
        }
    }

    /* renamed from: d */
    private View m88677d(int i) {
        if (this.f71219r == null) {
            this.f71219r = new HashMap();
        }
        View view = (View) this.f71219r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71219r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: s */
    private void m88681s() {
        if (this.f71219r != null) {
            this.f71219r.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo69532d() {
        return R.layout.oh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo69533e() {
        return 2;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m88681s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo69534f() {
        if (this.f71214k != null) {
            SearchResultParam searchResultParam = this.f71214k;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            mo69528b(searchResultParam);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo69540m() {
        C26662j jVar = this.f71218q;
        if (jVar != null) {
            jVar.mo68368b();
        }
        super.mo69540m();
    }

    public final void onResume() {
        super.onResume();
        C6726a.m20843a(C26981l.f71236a, 100);
    }

    /* renamed from: q */
    private final int m88679q() {
        if (mo67888a() == null) {
            return 0;
        }
        SearchContainerFragment a = mo67888a();
        if (a == null) {
            C7573i.m23580a();
        }
        return a.mo69660a();
    }

    /* renamed from: a */
    public final SearchContainerFragment mo67888a() {
        Fragment a = getChildFragmentManager().mo2644a("Container");
        if (a instanceof SearchContainerFragment) {
            return (SearchContainerFragment) a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo69535g() {
        KeyboardUtils.m77057c(this.mSearchInputView);
        if (!mo69591o()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            ActivityCompat.m2243b(activity);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo69538k() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(50);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo69539l() {
        boolean z;
        C26662j jVar = this.f71218q;
        if (jVar != null) {
            jVar.mo68368b();
        }
        SearchIntermediateView searchIntermediateView = this.mIntermediateView;
        SearchResultParam searchResultParam = this.f71214k;
        if (searchResultParam == null || searchResultParam.getSearchFrom() != 17) {
            z = false;
        } else {
            z = true;
        }
        searchIntermediateView.mo69732a(z);
        mo69530c(3);
    }

    /* renamed from: r */
    private final void m88680r() {
        if (VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            C26664l lVar = new C26664l();
            SearchResultParam searchResultParam = this.f71214k;
            if (searchResultParam != null && searchResultParam.getSearchFrom() == 20) {
                fade.excludeTarget((FrameLayout) m88677d((int) R.id.ami), true);
                C0996w.m4262a((FrameLayout) m88677d((int) R.id.cu8), false);
                View view = this.mGapStatusBar;
                if (view != null) {
                    C0996w.m4262a((ViewGroup) view, false);
                    LoftNestedRefreshLayout loftNestedRefreshLayout = this.f71212i;
                    if (loftNestedRefreshLayout == null) {
                        C7573i.m23580a();
                    }
                    C0996w.m4262a(loftNestedRefreshLayout, false);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            lVar.addTarget(R.id.cqp);
            transitionSet.addTransition(lVar);
            transitionSet.addTransition(fade);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    window.setEnterTransition(transitionSet);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo69760p() {
        String str;
        int q = m88679q();
        if (q == C27029ba.f71319a) {
            str = "general_search";
        } else if (q == C27029ba.f71321c) {
            str = "search_user";
        } else if (q == C27029ba.f71324f) {
            str = "search_tag";
        } else if (q == C27029ba.f71323e) {
            str = "search_music";
        } else if (q == C27029ba.f71320b) {
            str = "search_video";
        } else if (q == C27029ba.f71322d) {
            str = "search_poi";
        } else if (q == C27029ba.f71325g) {
            str = "search_ecommerce";
        } else {
            return;
        }
        C6907h.m21524a("enter_search", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
    }

    /* renamed from: o */
    public final boolean mo69591o() {
        Integer num;
        boolean z;
        if (C26654b.m87577e()) {
            if (mo69541n() == 2) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                SearchEnterParam searchEnterParam = C27244a.m89252a(activity).f71757a;
                if (searchEnterParam != null) {
                    num = Integer.valueOf(searchEnterParam.getEnterSearchFromBusiness());
                } else {
                    num = null;
                }
                if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                this.mSearchInputView.setText("");
                return true;
            } else if (!this.mIntermediateView.mo69734b() || this.mIntermediateView.getOpenSugFromState() != 2) {
                return false;
            } else {
                mo69530c(2);
                EditText editText = this.mSearchInputView;
                C7573i.m23582a((Object) editText, "mSearchInputView");
                editText.setCursorVisible(false);
                mo69522a(true);
                return true;
            }
        } else if (mo69541n() == 2 || mo67888a() == null) {
            return false;
        } else {
            mo69530c(2);
            EditText editText2 = this.mSearchInputView;
            C7573i.m23582a((Object) editText2, "mSearchInputView");
            editText2.setCursorVisible(false);
            mo69522a(true);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo69537j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        LoftNestedRefreshLayout loftNestedRefreshLayout;
        super.mo69537j();
        View view = getView();
        Integer num = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.d0c);
        } else {
            viewGroup = null;
        }
        this.f71215n = viewGroup;
        View view2 = getView();
        if (view2 != null) {
            viewGroup2 = (ViewGroup) view2.findViewById(R.id.cu8);
        } else {
            viewGroup2 = null;
        }
        this.f71217p = viewGroup2;
        View view3 = getView();
        if (view3 != null) {
            viewGroup3 = (ViewGroup) view3.findViewById(R.id.ami);
        } else {
            viewGroup3 = null;
        }
        this.f71216o = viewGroup3;
        View view4 = getView();
        if (view4 != null) {
            viewGroup4 = (ViewGroup) view4.findViewById(R.id.dms);
        } else {
            viewGroup4 = null;
        }
        this.f71213j = viewGroup4;
        View view5 = getView();
        if (view5 != null) {
            loftNestedRefreshLayout = (LoftNestedRefreshLayout) view5.findViewById(R.id.bv9);
        } else {
            loftNestedRefreshLayout = null;
        }
        this.f71212i = loftNestedRefreshLayout;
        View view6 = getView();
        if (view6 != null) {
            view6.findViewById(R.id.bbw);
        }
        C10789c.m31502a(this.mBackView);
        ImageView imageView = this.mBackView;
        C7573i.m23582a((Object) imageView, "mBackView");
        imageView.setVisibility(0);
        if (C26654b.m87577e()) {
            ViewGroup viewGroup5 = this.f71215n;
            if (viewGroup5 == null) {
                C7573i.m23580a();
            }
            ImageView imageView2 = this.mBackView;
            C7573i.m23582a((Object) imageView2, "mBackView");
            View view7 = imageView2;
            ViewGroup viewGroup6 = this.f71216o;
            if (viewGroup6 == null) {
                C7573i.m23580a();
            }
            this.f71218q = new C26662j(viewGroup5, view7, viewGroup6);
            this.mBackView.setImageResource(R.drawable.ahf);
            this.mBackView.setOnClickListener(new C26968c(this));
            this.mTvSearch.setText(R.string.w_);
            this.mTvSearch.setOnTouchListener(new C26969d(this));
            EditText editText = this.mSearchInputView;
            C7573i.m23582a((Object) editText, "mSearchInputView");
            editText.setCursorVisible(true);
            this.mBtnClear.setOnClickListener(new C26970e(this));
            SearchResultParam searchResultParam = this.f71214k;
            if (searchResultParam != null) {
                num = Integer.valueOf(searchResultParam.getSearchFrom());
            }
            if ((num != null && num.intValue() == 17) || ((num != null && num.intValue() == 18) || (num != null && num.intValue() == 20))) {
                this.mSearchInputView.postDelayed(new C26971f(this), 200);
            }
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f71212i;
        if (loftNestedRefreshLayout2 != null) {
            loftNestedRefreshLayout2.mo64894a((C24858b) new C26972g(this));
        }
        Fragment fragment = this;
        C0063u a = C0069x.m157a(fragment).mo147a(SearchStateData.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…rchStateData::class.java)");
        SearchStateData searchStateData = (SearchStateData) a;
        C0063u a2 = C0069x.m157a(fragment).mo147a(SearchIntermediateViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(th…ateViewModel::class.java)");
        SearchIntermediateViewModel searchIntermediateViewModel = (SearchIntermediateViewModel) a2;
        C0043i iVar = this;
        searchStateData.getSearchState().observe(iVar, new C26977h(this, searchIntermediateViewModel));
        searchIntermediateViewModel.getIntermediateState().observe(iVar, new C26978i(this, searchStateData));
        searchIntermediateViewModel.getDismissKeyboard().observe(iVar, new C26979j(this));
        this.mIntermediateView.setLoft(this.f71212i);
    }

    @C7709l
    public final void onInnerSearchEvent(C26575b bVar) {
        C7573i.m23587b(bVar, "innerSearchEvent");
        mo69528b(bVar.f70099a);
    }

    @C7709l
    public final void onSearchCorrectEvent(C26579f fVar) {
        C7573i.m23587b(fVar, "searchCorrectEvent");
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(fVar.f70105a).setSearchFrom(8);
        C7573i.m23582a((Object) searchFrom, "param");
        mo69528b(searchFrom);
    }

    /* renamed from: c */
    public final void mo69754c(SearchResultParam searchResultParam) {
        SearchContainerFragment a = SearchContainerFragment.m88488a(searchResultParam);
        a.f71100g = new C26967b(this);
        getChildFragmentManager().mo2645a().mo2600b(R.id.aoy, a, "Container").mo2606d();
    }

    @C7709l
    public final void onSearchSugCompletionEvent(C26582i iVar) {
        int i;
        C7573i.m23587b(iVar, "searchSugCompletionEvent");
        if (!TextUtils.isEmpty(iVar.f70107a)) {
            this.mSearchInputView.setText(iVar.f70107a);
            EditText editText = this.mSearchInputView;
            String str = iVar.f70107a;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            editText.setSelection(i);
            EditText editText2 = this.mSearchInputView;
            C7573i.m23582a((Object) editText2, "mSearchInputView");
            editText2.setCursorVisible(true);
            KeyboardUtils.m77056b(this.mSearchInputView);
        }
    }

    /* renamed from: d */
    private static String m88678d(SearchResultParam searchResultParam) {
        String str;
        String keyword = searchResultParam.getKeyword();
        if (!TextUtils.isEmpty(searchResultParam.getRealSearchWord())) {
            keyword = searchResultParam.getRealSearchWord();
        }
        if (C27035bc.m88798a(keyword)) {
            return null;
        }
        if (!TextUtils.isEmpty(searchResultParam.getKeyword())) {
            str = searchResultParam.getKeyword();
        } else {
            str = keyword;
        }
        if (!TextUtils.isEmpty(str) && !C37380c.m119974a()) {
            SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(str, 0));
        }
        return keyword;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69518a(View view) {
        if (this.mSearchInputView != null) {
            if (mo69541n() == 2) {
                mo69760p();
            }
            EditText editText = this.mSearchInputView;
            C7573i.m23582a((Object) editText, "mSearchInputView");
            editText.setCursorVisible(true);
            EditText editText2 = this.mSearchInputView;
            C7573i.m23582a((Object) editText2, "mSearchInputView");
            if (!TextUtils.isEmpty(editText2.getText().toString())) {
                mo69540m();
            } else {
                mo69539l();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69529b(String str) {
        boolean z;
        String str2;
        EditText editText = this.mSearchInputView;
        C7573i.m23582a((Object) editText, "mSearchInputView");
        String obj = editText.getHint().toString();
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(obj) || mo69525a(obj)) {
            z = false;
        } else {
            z = true;
            if (C26654b.m87578f()) {
                if (this.f70895h == null) {
                    str2 = "";
                } else {
                    str2 = this.f70895h.getId();
                }
                m88676a(obj, str2);
            } else {
                C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", str).mo59973a("key_word_type", "general_word").mo59973a("enter_from", "default_search_keyword").f60753a);
            }
            str = obj;
        }
        String str3 = null;
        if (z && !C26654b.m87578f()) {
            str3 = this.f70894g;
        }
        mo69521a(str, str3, z);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            Serializable serializable = arguments.getSerializable("searchParam");
            if (serializable != null) {
                this.f71214k = (SearchResultParam) serializable;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                C27244a.m89252a(activity).mo69989a(getArguments());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            }
        }
        C0043i iVar = this;
        this.f70893f.f71742a.observe(iVar, this);
        this.f70892e.hotSearchLiveData.observe(iVar, new HotSearchListObserver().setListener(new C26980k(this)));
    }

    @C7709l
    public final void onGuideSearchEvent(C26574a aVar) {
        String str;
        C7573i.m23587b(aVar, "guideSearchEvent");
        EditText editText = this.mSearchInputView;
        C7573i.m23582a((Object) editText, "mSearchInputView");
        String obj = editText.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            str = aVar.f70098a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" ");
            sb.append(aVar.f70098a);
            str = sb.toString();
        }
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(str).setSearchFrom(9);
        C7573i.m23582a((Object) searchFrom, "param");
        mo69528b(searchFrom);
    }

    /* renamed from: a */
    public final void mo69519a(SearchResultParam searchResultParam) {
        boolean z;
        C7573i.m23587b(searchResultParam, "param");
        if (SearchStateViewModel.isSearchIntermediate(mo69541n()) && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            if (searchResultParam.getSearchFrom() == 2) {
                if (!C26654b.m87577e() || this.mIntermediateView.getOpenSugFromState() == 2) {
                    z = false;
                } else {
                    z = true;
                }
                searchResultParam.setOpenNewSearchContainer(z);
            }
            mo69528b(searchResultParam);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69528b(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        this.f71214k = searchResultParam;
        String d = m88678d(searchResultParam);
        if (TextUtils.isEmpty(d)) {
            this.mSearchInputView.setText("");
            return;
        }
        C26662j jVar = this.f71218q;
        if (jVar != null) {
            jVar.mo68367a();
        }
        mo69530c(2);
        this.mSearchInputView.setText(searchResultParam.getKeyword());
        ImageButton imageButton = this.mBtnClear;
        C7573i.m23582a((Object) imageButton, "mBtnClear");
        imageButton.setVisibility(0);
        EditText editText = this.mSearchInputView;
        C7573i.m23582a((Object) editText, "mSearchInputView");
        editText.setCursorVisible(false);
        KeyboardUtils.m77057c(this.mSearchInputView);
        searchResultParam.setKeyword(d);
        Runnable nVar = new C26983n(this, searchResultParam);
        if (C6399b.m19944t()) {
            nVar.run();
        } else {
            C21651ak a = C21780t.m72807a();
            String keyword = searchResultParam.getKeyword();
            C7573i.m23582a((Object) keyword, "param.keyword");
            a.mo57893a(keyword, (C37381d) new C26982m(nVar));
        }
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("search", searchResultParam.getKeyword());
    }

    @C7709l
    public final void onChangeBgColorEvent(C26995b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C7573i.m23587b(bVar, "event");
        if (!bVar.f71279b) {
            ViewGroup viewGroup = this.f71213j;
            if (viewGroup != null) {
                viewGroup.setBackground(null);
            }
            View view = this.mGapStatusBar;
            if (view != null) {
                view.setBackground(null);
            }
            ViewGroup viewGroup2 = this.f71215n;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(null);
            }
            ViewGroup viewGroup3 = this.f71217p;
            if (viewGroup3 != null) {
                viewGroup3.setBackground(null);
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f71212i;
            if (loftNestedRefreshLayout != null) {
                View childAt = loftNestedRefreshLayout.getChildAt(0);
                if (childAt != null) {
                    childAt.setBackground(null);
                }
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f71212i;
            if (loftNestedRefreshLayout2 != null) {
                loftNestedRefreshLayout2.setBackground(bVar.f71278a);
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout3 = this.f71212i;
            if (loftNestedRefreshLayout3 != null) {
                ViewGroup headerView = loftNestedRefreshLayout3.getHeaderView();
                if (headerView != null) {
                    headerView.setVisibility(8);
                }
            }
            return;
        }
        ViewGroup viewGroup4 = this.f71213j;
        if (viewGroup4 != null) {
            Context context = getContext();
            if (context != null) {
                Resources resources = context.getResources();
                if (resources != null) {
                    i6 = resources.getColor(R.color.a3z);
                    viewGroup4.setBackgroundColor(i6);
                }
            }
            i6 = 0;
            viewGroup4.setBackgroundColor(i6);
        }
        View view2 = this.mGapStatusBar;
        if (view2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                Resources resources2 = context2.getResources();
                if (resources2 != null) {
                    i5 = resources2.getColor(R.color.a3z);
                    view2.setBackgroundColor(i5);
                }
            }
            i5 = 0;
            view2.setBackgroundColor(i5);
        }
        ViewGroup viewGroup5 = this.f71215n;
        if (viewGroup5 != null) {
            Context context3 = getContext();
            if (context3 != null) {
                Resources resources3 = context3.getResources();
                if (resources3 != null) {
                    i4 = resources3.getColor(R.color.a3z);
                    viewGroup5.setBackgroundColor(i4);
                }
            }
            i4 = 0;
            viewGroup5.setBackgroundColor(i4);
        }
        ViewGroup viewGroup6 = this.f71217p;
        if (viewGroup6 != null) {
            Context context4 = getContext();
            if (context4 != null) {
                Resources resources4 = context4.getResources();
                if (resources4 != null) {
                    i3 = resources4.getColor(R.color.a3z);
                    viewGroup6.setBackgroundColor(i3);
                }
            }
            i3 = 0;
            viewGroup6.setBackgroundColor(i3);
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout4 = this.f71212i;
        if (loftNestedRefreshLayout4 != null) {
            View childAt2 = loftNestedRefreshLayout4.getChildAt(0);
            if (childAt2 != null) {
                Context context5 = getContext();
                if (context5 != null) {
                    Resources resources5 = context5.getResources();
                    if (resources5 != null) {
                        i2 = resources5.getColor(R.color.a3z);
                        childAt2.setBackgroundColor(i2);
                    }
                }
                i2 = 0;
                childAt2.setBackgroundColor(i2);
            }
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout5 = this.f71212i;
        if (loftNestedRefreshLayout5 != null) {
            Context context6 = getContext();
            if (context6 != null) {
                Resources resources6 = context6.getResources();
                if (resources6 != null) {
                    i = resources6.getColor(R.color.a3z);
                    loftNestedRefreshLayout5.setBackgroundColor(i);
                }
            }
            i = 0;
            loftNestedRefreshLayout5.setBackgroundColor(i);
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout6 = this.f71212i;
        if (loftNestedRefreshLayout6 != null) {
            ViewGroup headerView2 = loftNestedRefreshLayout6.getHeaderView();
            if (headerView2 != null) {
                headerView2.setVisibility(0);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m88680r();
    }

    /* renamed from: a */
    private static void m88676a(String str, String str2) {
        C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", 0).mo59973a("words_source", "recom_search").mo59973a("words_content", str).mo59973a("group_id", str2).f60753a);
    }

    /* renamed from: a */
    public final void mo69753a(String str, String str2, LogPbBean logPbBean) {
        if (C26654b.m87577e() && !C26654b.m87578f()) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, mo69536i())) {
                EditText editText = this.mSearchInputView;
                C7573i.m23582a((Object) editText, "mSearchInputView");
                if (!TextUtils.equals(editText.getHint().toString(), charSequence)) {
                    C6907h.m21524a("search_default", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", str).mo59973a("log_pb", new C6600e().mo15979b((Object) logPbBean)).f60753a);
                    EditText editText2 = this.mSearchInputView;
                    C7573i.m23582a((Object) editText2, "mSearchInputView");
                    editText2.setHint(charSequence);
                    this.f70894g = str2;
                }
            }
        }
    }
}
