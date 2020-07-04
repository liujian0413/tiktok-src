package com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0371c;
import android.support.design.widget.TabLayout.C0376f;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4ViewPagerAdapter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4NavigationViewModel;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment */
public final class DiscoverV4NavigationFragment extends JediBaseFragment implements C26596c {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71612f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4NavigationFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4NavigationViewModel;"))};

    /* renamed from: j */
    public static final C27170a f71613j = new C27170a(null);

    /* renamed from: g */
    public DiscoverV4ViewPagerAdapter f71614g;

    /* renamed from: h */
    public int f71615h;

    /* renamed from: i */
    public boolean f71616i;

    /* renamed from: k */
    private final lifecycleAwareLazy f71617k;

    /* renamed from: l */
    private boolean f71618l;

    /* renamed from: m */
    private HashMap f71619m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$a */
    public static final class C27170a {
        private C27170a() {
        }

        public /* synthetic */ C27170a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$b */
    public static final class C27171b implements C0371c {
        C27171b() {
        }

        /* renamed from: a */
        public final void mo1669a(C0376f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1539f;
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setTextSize(1, 20.0f);
            }
        }

        /* renamed from: b */
        public final void mo1670b(C0376f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1539f;
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setTextSize(1, 17.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$c */
    static final class C27172c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NavigationFragment f71620a;

        C27172c(DiscoverV4NavigationFragment discoverV4NavigationFragment) {
            this.f71620a = discoverV4NavigationFragment;
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v3, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r3v4, types: [android.support.design.widget.TabLayout$f] */
        /* JADX WARNING: type inference failed for: r3v5, types: [android.support.design.widget.TabLayout$f] */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.support.design.widget.TabLayout$f, android.view.View]
          uses: [?[OBJECT, ARRAY], android.support.design.widget.TabLayout$f]
          mth insns count: 58
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r0 = r6.f71620a
                com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter r0 = r0.f71614g
                if (r0 != 0) goto L_0x0009
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0009:
                java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r0 = r0.f71596c
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L_0x0011:
                r3 = 0
                r4 = 2131301966(0x7f09164e, float:1.8222005E38)
                if (r2 >= r0) goto L_0x003e
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r5 = r6.f71620a
                android.view.View r4 = r5.mo60553a(r4)
                android.support.design.widget.TabLayout r4 = (android.support.design.widget.TabLayout) r4
                if (r4 == 0) goto L_0x0025
                android.support.design.widget.TabLayout$f r3 = r4.getTabAt(r2)
            L_0x0025:
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r4 = r6.f71620a
                com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter r4 = r4.f71614g
                if (r4 != 0) goto L_0x002e
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x002e:
                java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r4 = r4.f71596c
                java.lang.Object r4 = r4.get(r2)
                com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4 r4 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4) r4
                java.lang.String r4 = r4.tabText
                com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4NavigationFragment.m89070a(r3, r4)
                int r2 = r2 + 1
                goto L_0x0011
            L_0x003e:
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r0 = r6.f71620a
                android.view.View r0 = r0.mo60553a(r4)
                android.support.design.widget.TabLayout r0 = (android.support.design.widget.TabLayout) r0
                if (r0 == 0) goto L_0x0051
                android.support.design.widget.TabLayout$f r0 = r0.getTabAt(r1)
                if (r0 == 0) goto L_0x0051
                r0.mo1689a()
            L_0x0051:
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r0 = r6.f71620a
                com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter r0 = r0.f71614g
                if (r0 == 0) goto L_0x0072
                java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.v4.ui.a>> r0 = r0.f71594a
                if (r0 == 0) goto L_0x0072
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.get(r2)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                if (r0 == 0) goto L_0x0072
                java.lang.Object r0 = r0.get()
                com.ss.android.ugc.aweme.discover.v4.ui.a r0 = (com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27189a) r0
                if (r0 == 0) goto L_0x0072
                r0.mo69940l()
            L_0x0072:
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment r0 = r6.f71620a
                android.view.View r0 = r0.mo60553a(r4)
                android.support.design.widget.TabLayout r0 = (android.support.design.widget.TabLayout) r0
                if (r0 == 0) goto L_0x0084
                android.support.design.widget.TabLayout$f r0 = r0.getTabAt(r1)
                if (r0 == 0) goto L_0x0084
                android.view.View r3 = r0.f1539f
            L_0x0084:
                android.widget.TextView r3 = (android.widget.TextView) r3
                if (r3 == 0) goto L_0x008f
                r0 = 1101004800(0x41a00000, float:20.0)
                r1 = 1
                r3.setTextSize(r1, r0)
                return
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4NavigationFragment.C27172c.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$d */
    static final class C27173d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NavigationFragment f71621a;

        C27173d(DiscoverV4NavigationFragment discoverV4NavigationFragment) {
            this.f71621a = discoverV4NavigationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71621a.mo69896i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$e */
    public static final class C27174e implements C7498y<DiscoverV4CategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NavigationFragment f71622a;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C27174e(DiscoverV4NavigationFragment discoverV4NavigationFragment) {
            this.f71622a = discoverV4NavigationFragment;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f71622a.mo60553a((int) R.id.daj);
            if (dmtStatusView != null) {
                dmtStatusView.mo25944h();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(DiscoverV4CategoryResponse discoverV4CategoryResponse) {
            boolean z;
            C7573i.m23587b(discoverV4CategoryResponse, "t");
            Collection collection = discoverV4CategoryResponse.categoryList;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f71622a.mo60553a((int) R.id.daj);
                if (dmtStatusView != null) {
                    dmtStatusView.mo25943g();
                }
            } else {
                this.f71622a.mo69929a(discoverV4CategoryResponse);
            }
        }
    }

    /* renamed from: j */
    private final DiscoverV4NavigationViewModel m89071j() {
        return (DiscoverV4NavigationViewModel) this.f71617k.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f71619m == null) {
            this.f71619m = new HashMap();
        }
        View view = (View) this.f71619m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71619m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo68279a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        C7573i.m23587b(loftNestedRefreshLayout, "loftNestedRefreshLayout");
    }

    /* renamed from: b */
    public final void mo68282b(int i) {
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f71619m != null) {
            this.f71619m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    public final void onDestroy() {
        super.onDestroy();
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().clear();
    }

    public DiscoverV4NavigationFragment() {
        C7584c a = C7575l.m23595a(DiscoverV4NavigationViewModel.class);
        C7561a discoverV4NavigationFragment$$special$$inlined$viewModel$1 = new DiscoverV4NavigationFragment$$special$$inlined$viewModel$1(a);
        this.f71617k = new lifecycleAwareLazy(this, discoverV4NavigationFragment$$special$$inlined$viewModel$1, new DiscoverV4NavigationFragment$$special$$inlined$viewModel$3(this, discoverV4NavigationFragment$$special$$inlined$viewModel$1, a, DiscoverV4NavigationFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: l */
    private final void m89073l() {
        this.f71618l = true;
        TabLayout tabLayout = (TabLayout) mo60553a((int) R.id.dfo);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager((RtlViewPager) mo60553a((int) R.id.ed4));
        }
        TabLayout tabLayout2 = (TabLayout) mo60553a((int) R.id.dfo);
        if (tabLayout2 != null) {
            tabLayout2.addOnTabSelectedListener(new C27171b());
        }
        TabLayout tabLayout3 = (TabLayout) mo60553a((int) R.id.dfo);
        if (tabLayout3 != null) {
            tabLayout3.post(new C27172c(this));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, java.lang.ref.WeakReference]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.ref.WeakReference, java.lang.Object]
      mth insns count: 22
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aJ_() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter r0 = r3.f71614g
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.v4.ui.a>> r0 = r0.f71594a
            if (r0 == 0) goto L_0x0023
            r2 = 2131303243(0x7f091b4b, float:1.8224595E38)
            android.view.View r2 = r3.mo60553a(r2)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.p280ss.android.ugc.aweme.views.RtlViewPager) r2
            if (r2 == 0) goto L_0x001c
            int r1 = r2.getCurrentItem()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x001c:
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
        L_0x0023:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.get()
            com.ss.android.ugc.aweme.discover.v4.ui.a r0 = (com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27189a) r0
            if (r0 == 0) goto L_0x0031
            r0.mo69938j()
            return
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4NavigationFragment.aJ_():void");
    }

    /* renamed from: k */
    private final void m89072k() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            C0608j supportFragmentManager = activity.getSupportFragmentManager();
            C7573i.m23582a((Object) supportFragmentManager, "activity!!.supportFragmentManager");
            this.f71614g = new DiscoverV4ViewPagerAdapter(supportFragmentManager, new ArrayList());
            RtlViewPager rtlViewPager = (RtlViewPager) mo60553a((int) R.id.ed4);
            if (rtlViewPager != null) {
                rtlViewPager.setAdapter(this.f71614g);
            }
            RtlViewPager rtlViewPager2 = (RtlViewPager) mo60553a((int) R.id.ed4);
            if (rtlViewPager2 != null) {
                rtlViewPager2.addOnPageChangeListener(new DiscoverV4NavigationFragment$initViewPager$1(this));
            }
        }
    }

    /* renamed from: i */
    public final void mo69896i() {
        if (!this.f71618l) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
            if (dmtStatusView != null) {
                dmtStatusView.mo25942f();
            }
            int i = 1;
            switch (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0)) {
                case 3:
                    i = 2;
                    break;
            }
            m89071j();
            DiscoverV4NavigationViewModel.m89198a(i).mo19189a((C7498y<? super T>) new C27174e<Object>(this));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, java.lang.ref.WeakReference]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.ref.WeakReference, java.lang.Object]
      mth insns count: 22
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68280a(boolean r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter r0 = r3.f71614g
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.v4.ui.a>> r0 = r0.f71594a
            if (r0 == 0) goto L_0x0023
            r2 = 2131303243(0x7f091b4b, float:1.8224595E38)
            android.view.View r2 = r3.mo60553a(r2)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.p280ss.android.ugc.aweme.views.RtlViewPager) r2
            if (r2 == 0) goto L_0x001c
            int r1 = r2.getCurrentItem()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x001c:
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
        L_0x0023:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.get()
            com.ss.android.ugc.aweme.discover.v4.ui.a r0 = (com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27189a) r0
            if (r0 == 0) goto L_0x0031
            r0.mo69937b(r4)
            return
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4NavigationFragment.mo68280a(boolean):void");
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 21) {
            DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter = this.f71614g;
            if (discoverV4ViewPagerAdapter != null) {
                Map<Integer, WeakReference<C27189a>> map = discoverV4ViewPagerAdapter.f71594a;
                if (map != null) {
                    for (Entry value : map.entrySet()) {
                        WeakReference weakReference = (WeakReference) value.getValue();
                        if (weakReference != null) {
                            C27189a aVar = (C27189a) weakReference.get();
                            if (aVar != null) {
                                Object obj = anVar.f74632b;
                                if (obj != null) {
                                    aVar.mo69935a((DiscoverPlaylistUpdateParam) obj);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69929a(DiscoverV4CategoryResponse discoverV4CategoryResponse) {
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
        if (dmtStatusView != null) {
            dmtStatusView.mo25939d();
        }
        if (!this.f71618l) {
            DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter = this.f71614g;
            if (discoverV4ViewPagerAdapter != null) {
                List<DiscoverCategoryStructV4> list = discoverV4ViewPagerAdapter.f71596c;
                if (list != null) {
                    list.clear();
                }
            }
            String str = null;
            if (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) == 2) {
                String discover_playlist = DiscoverV4PlayListDataCenter.Companion.getDISCOVER_PLAYLIST();
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.apx);
                }
                DiscoverCategoryStructV4 discoverCategoryStructV4 = new DiscoverCategoryStructV4(discover_playlist, str);
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter2 = this.f71614g;
                if (discoverV4ViewPagerAdapter2 != null) {
                    List<DiscoverCategoryStructV4> list2 = discoverV4ViewPagerAdapter2.f71596c;
                    if (list2 != null) {
                        list2.add(discoverCategoryStructV4);
                    }
                }
            } else {
                String trending_playlist = DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST();
                Context context2 = getContext();
                if (context2 != null) {
                    str = context2.getString(R.string.asi);
                }
                DiscoverCategoryStructV4 discoverCategoryStructV42 = new DiscoverCategoryStructV4(trending_playlist, str);
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter3 = this.f71614g;
                if (discoverV4ViewPagerAdapter3 != null) {
                    List<DiscoverCategoryStructV4> list3 = discoverV4ViewPagerAdapter3.f71596c;
                    if (list3 != null) {
                        list3.add(discoverCategoryStructV42);
                    }
                }
            }
            List<DiscoverCategoryStructV4> list4 = discoverV4CategoryResponse.categoryList;
            if (list4 != null) {
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter4 = this.f71614g;
                if (discoverV4ViewPagerAdapter4 != null) {
                    List<DiscoverCategoryStructV4> list5 = discoverV4ViewPagerAdapter4.f71596c;
                    if (list5 != null) {
                        list5.addAll(list4);
                    }
                }
            }
            DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter5 = this.f71614g;
            if (discoverV4ViewPagerAdapter5 != null) {
                discoverV4ViewPagerAdapter5.notifyDataSetChanged();
            }
            m89073l();
        }
    }

    /* renamed from: a */
    public static void m89070a(C0376f fVar, String str) {
        View view;
        if (fVar != null) {
            fVar.mo1685a((int) R.layout.ui);
        }
        if (fVar != null) {
            view = fVar.f1539f;
        } else {
            view = null;
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C43361b.m137644a(getActivity(), new C27173d(this)));
        MtEmptyView a = MtEmptyView.m31657a((Context) getActivity());
        a.setStatus(new C10806a(getActivity()).mo25990b((int) R.string.bzv).f29135a);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25963b((View) a).mo25966c((View) dmtDefaultView));
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo60553a((int) R.id.daj);
        if (dmtStatusView2 != null) {
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "context!!");
            dmtStatusView2.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.ml));
        }
        m89072k();
        mo69896i();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ny, viewGroup, false);
    }
}
