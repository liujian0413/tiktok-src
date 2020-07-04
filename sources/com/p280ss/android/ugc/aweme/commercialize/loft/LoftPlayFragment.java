package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity.C24832a;
import com.p280ss.android.ugc.aweme.commercialize.loft.adapter.C24845a;
import com.p280ss.android.ugc.aweme.commercialize.loft.adapter.LoftPagerAdapter;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24878a;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftVideo;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1130a.C24844a;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType;
import com.p280ss.android.ugc.aweme.commercialize.loft.viewpager.LoftViewPager;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment */
public final class LoftPlayFragment extends Fragment implements C0935e, C28343z<C28318an>, C28519d {

    /* renamed from: e */
    public static final C24833a f65429e = new C24833a(null);

    /* renamed from: a */
    public View f65430a;

    /* renamed from: b */
    public LoftViewPager f65431b;

    /* renamed from: c */
    public IntermediateStateViewController f65432c;

    /* renamed from: d */
    public ImageView f65433d;

    /* renamed from: f */
    private LoftPagerAdapter f65434f;

    /* renamed from: g */
    private C28297e f65435g;

    /* renamed from: h */
    private String f65436h = "";

    /* renamed from: i */
    private int f65437i = -1;

    /* renamed from: j */
    private String f65438j;

    /* renamed from: k */
    private boolean f65439k;

    /* renamed from: l */
    private boolean f65440l;

    /* renamed from: m */
    private boolean f65441m = true;

    /* renamed from: n */
    private HashMap f65442n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment$a */
    public static final class C24833a {
        private C24833a() {
        }

        public /* synthetic */ C24833a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LoftPlayFragment m81499a(String str, int i, String str2, boolean z) {
            C7573i.m23587b(str2, "id");
            LoftPlayFragment loftPlayFragment = new LoftPlayFragment();
            Bundle bundle = new Bundle();
            bundle.putString("loft_event_type", str);
            bundle.putInt("loft_page_type", i);
            bundle.putString("loft_id", str2);
            bundle.putBoolean("loft_style", z);
            loftPlayFragment.setArguments(bundle);
            return loftPlayFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment$b */
    static final class C24834b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoftPlayFragment f65443a;

        /* renamed from: b */
        final /* synthetic */ View f65444b;

        C24834b(LoftPlayFragment loftPlayFragment, View view) {
            this.f65443a = loftPlayFragment;
            this.f65444b = view;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f65443a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            C23256c.m76348b(this.f65443a.getActivity(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment$c */
    static final class C24835c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoftPlayFragment f65445a;

        /* renamed from: b */
        final /* synthetic */ View f65446b;

        C24835c(LoftPlayFragment loftPlayFragment, View view) {
            this.f65445a = loftPlayFragment;
            this.f65446b = view;
        }

        public final void run() {
            LoftPlayFragment.m81488a(LoftPlayFragment.m81487a(this.f65445a).mo65150o());
            this.f65446b.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C24835c f65447a;

                {
                    this.f65447a = r1;
                }

                public final void run() {
                    ((ViewGroup) this.f65447a.f65446b).removeView(LoftPlayFragment.m81487a(this.f65447a.f65445a).mo65150o());
                    if (this.f65447a.f65445a.getContext() != null) {
                        LoftPlayFragment.m81490b(this.f65447a.f65445a).setBackgroundColor(this.f65447a.f65445a.getResources().getColor(R.color.fs));
                    }
                    if (this.f65447a.f65445a.isResumed()) {
                        C24845a a = this.f65447a.f65445a.mo64927a();
                        if (a != null) {
                            a.mo64971e();
                        }
                    }
                }
            }, 200);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment$d */
    static final class C24837d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoftPlayFragment f65448a;

        /* renamed from: b */
        final /* synthetic */ View f65449b;

        C24837d(LoftPlayFragment loftPlayFragment, View view) {
            this.f65448a = loftPlayFragment;
            this.f65449b = view;
        }

        public final void run() {
            LoftPlayFragment.m81488a((View) LoftPlayFragment.m81493c(this.f65448a));
            this.f65449b.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C24837d f65450a;

                {
                    this.f65450a = r1;
                }

                public final void run() {
                    ((ViewGroup) this.f65450a.f65449b).removeView(LoftPlayFragment.m81493c(this.f65450a.f65448a));
                    if (this.f65450a.f65448a.isResumed()) {
                        C24845a a = this.f65450a.f65448a.mo64927a();
                        if (a != null) {
                            a.mo64971e();
                        }
                    }
                }
            }, 200);
        }
    }

    /* renamed from: a */
    public static final LoftPlayFragment m81485a(String str, int i, String str2) {
        return C24833a.m81499a(str, i, str2, false);
    }

    /* renamed from: c */
    private void m81494c() {
        if (this.f65442n != null) {
            this.f65442n.clear();
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C24845a a = mo64927a();
        if (a != null) {
            a.mo64974h();
        }
        m81494c();
    }

    public final void onDestroy() {
        super.onDestroy();
        C28297e eVar = this.f65435g;
        if (eVar == null) {
            C7573i.m23583a("mDialogController");
        }
        eVar.mo71836c();
        C7705c.m23799a().mo20393c((Object) this);
    }

    public final void onPause() {
        FragmentInstrumentation.onPause(this);
        super.onPause();
        C24845a a = mo64927a();
        if (a != null) {
            a.mo64973g();
        }
        C24845a a2 = mo64927a();
        if (a2 != null) {
            a2.mo64972f();
        }
    }

    public final void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        C24845a a = mo64927a();
        if (a != null) {
            a.mo64971e();
        }
    }

    /* renamed from: b */
    private final C24845a m81491b() {
        int i;
        if (this.f65431b == null) {
            return null;
        }
        LoftViewPager loftViewPager = this.f65431b;
        if (loftViewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        int currentItem = loftViewPager.getCurrentItem();
        if (this.f65440l) {
            i = currentItem + 1;
        } else {
            i = currentItem - 1;
        }
        LoftViewPager loftViewPager2 = this.f65431b;
        if (loftViewPager2 == null) {
            C7573i.m23583a("mViewPager");
        }
        int childCount = loftViewPager2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C24845a a = m81486a(i2);
            if (a != null && a.mo64969c() == i) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C24845a mo64927a() {
        if (this.f65431b == null) {
            return null;
        }
        LoftViewPager loftViewPager = this.f65431b;
        if (loftViewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        int currentItem = loftViewPager.getCurrentItem();
        LoftViewPager loftViewPager2 = this.f65431b;
        if (loftViewPager2 == null) {
            C7573i.m23583a("mViewPager");
        }
        int childCount = loftViewPager2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C24845a a = m81486a(i);
            if (a != null && a.mo64969c() == currentItem) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f65436h;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m81490b(LoftPlayFragment loftPlayFragment) {
        View view = loftPlayFragment.f65430a;
        if (view == null) {
            C7573i.m23583a("mRoot");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m81493c(LoftPlayFragment loftPlayFragment) {
        ImageView imageView = loftPlayFragment.f65433d;
        if (imageView == null) {
            C7573i.m23583a("mImage");
        }
        return imageView;
    }

    /* renamed from: a */
    private final C24845a m81486a(int i) {
        Object obj;
        LoftViewPager loftViewPager = this.f65431b;
        if (loftViewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        View childAt = loftViewPager.getChildAt(i);
        if (childAt != null) {
            obj = childAt.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof C24845a)) {
            obj = null;
        }
        return (C24845a) obj;
    }

    @C7709l
    public final void onEvent(C24844a aVar) {
        boolean z;
        LoftViewPager loftViewPager = this.f65431b;
        if (loftViewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        if (aVar != null) {
            z = aVar.f65477a;
        } else {
            z = false;
        }
        loftViewPager.setForbidScroll(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ IntermediateStateViewController m81487a(LoftPlayFragment loftPlayFragment) {
        IntermediateStateViewController intermediateStateViewController = loftPlayFragment.f65432c;
        if (intermediateStateViewController == null) {
            C7573i.m23583a("mIntermediateStateViewController");
        }
        return intermediateStateViewController;
    }

    /* renamed from: a */
    public static void m81488a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.2f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.2f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.start();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("loft_event_type", "");
            C7573i.m23582a((Object) string, "it.getString(LOFT_EVENT_TYPE, \"\")");
            this.f65436h = string;
            this.f65437i = arguments.getInt("loft_page_type");
        }
        C7705c.m23799a().mo20389a((Object) this);
        this.f65435g = new C28297e(this.f65436h, this.f65437i, this, this);
        C28297e eVar = this.f65435g;
        if (eVar == null) {
            C7573i.m23583a("mDialogController");
        }
        eVar.mo71834a(getActivity(), this);
        C28297e eVar2 = this.f65435g;
        if (eVar2 == null) {
            C7573i.m23583a("mDialogController");
        }
        eVar2.mo71830a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64929a(C28318an anVar) {
        Integer num;
        if (anVar != null) {
            num = Integer.valueOf(anVar.f74631a);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C6900g b = C6900g.m21454b();
            C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
            if (!b.mo16943d()) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            Object obj = anVar.f74632b;
            if (!(obj instanceof Aweme)) {
                obj = null;
            }
            Aweme aweme = (Aweme) obj;
            if (!(aweme == null || aweme.getAuthor() == null)) {
                ShareDependService a = C37950a.m121238a();
                C28297e eVar = this.f65435g;
                if (eVar == null) {
                    C7573i.m23583a("mDialogController");
                }
                String n = eVar.mo71843n();
                C7573i.m23582a((Object) n, "mDialogController.eventType");
                C28297e eVar2 = this.f65435g;
                if (eVar2 == null) {
                    C7573i.m23583a("mDialogController");
                }
                Activity d = eVar2.mo71837d();
                C7573i.m23582a((Object) d, "mDialogController.activity");
                a.showReportDialog(aweme, n, d, "");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.commercialize.loft.adapter.a r9 = r8.m81491b()
            com.ss.android.ugc.aweme.commercialize.loft.adapter.a r0 = r8.mo64927a()
            boolean r1 = r8.f65441m
            if (r1 == 0) goto L_0x0011
            r1 = 0
            r8.f65441m = r1
            goto L_0x0099
        L_0x0011:
            r1 = 0
            if (r9 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.mo64970d()
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.mo64970d()
            goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            boolean r4 = r8.f65440l
            if (r4 == 0) goto L_0x0060
            java.lang.String r4 = "discovery_second_floor_slide_right"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r6 = "from_group_id"
            if (r2 == 0) goto L_0x0035
            java.lang.String r7 = r2.getAid()
            goto L_0x0036
        L_0x0035:
            r7 = r1
        L_0x0036:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "author_id"
            if (r2 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = r2.getUid()
            goto L_0x004a
        L_0x0049:
            r2 = r1
        L_0x004a:
            com.ss.android.ugc.aweme.app.g.d r2 = r5.mo59973a(r6, r2)
            java.lang.String r5 = "to_group_id"
            if (r3 == 0) goto L_0x0056
            java.lang.String r1 = r3.getAid()
        L_0x0056:
            com.ss.android.ugc.aweme.app.g.d r1 = r2.mo59973a(r5, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r1)
            goto L_0x0099
        L_0x0060:
            java.lang.String r4 = "discovery_second_floor_slide_left"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r6 = "from_group_id"
            if (r2 == 0) goto L_0x006f
            java.lang.String r7 = r2.getAid()
            goto L_0x0070
        L_0x006f:
            r7 = r1
        L_0x0070:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "author_id"
            if (r2 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = r2.getUid()
            goto L_0x0084
        L_0x0083:
            r2 = r1
        L_0x0084:
            com.ss.android.ugc.aweme.app.g.d r2 = r5.mo59973a(r6, r2)
            java.lang.String r5 = "to_group_id"
            if (r3 == 0) goto L_0x0090
            java.lang.String r1 = r3.getAid()
        L_0x0090:
            com.ss.android.ugc.aweme.app.g.d r1 = r2.mo59973a(r5, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r1)
        L_0x0099:
            if (r9 == 0) goto L_0x009e
            r9.mo64968b()
        L_0x009e:
            if (r0 == 0) goto L_0x00a4
            r0.mo64966a()
            return
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment.onPageSelected(int):void");
    }

    /* renamed from: b */
    private final void m81492b(View view) {
        List<LoftVideo> list;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View findViewById = view.findViewById(R.id.a19);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.container)");
            this.f65430a = findViewById;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "activity!!");
            LayoutInflater from = LayoutInflater.from(getActivity());
            C7573i.m23582a((Object) from, "LayoutInflater.from(activity)");
            C28297e eVar = this.f65435g;
            if (eVar == null) {
                C7573i.m23583a("mDialogController");
            }
            LoftPagerAdapter loftPagerAdapter = new LoftPagerAdapter(activity2, from, 1, eVar, this.f65439k);
            this.f65434f = loftPagerAdapter;
            LoftPagerAdapter loftPagerAdapter2 = this.f65434f;
            if (loftPagerAdapter2 == null) {
                C7573i.m23583a("mLoftPagerAdapter");
            }
            C24878a aVar = C24877b.f65602l;
            C7573i.m23582a((Object) activity, "it");
            C24877b bVar = (C24877b) aVar.mo65136a(activity);
            String str = this.f65438j;
            if (str == null) {
                C7573i.m23583a("mLoftId");
            }
            Loft a = bVar.mo65114a(str);
            if (a != null) {
                list = a.getVideoList();
            } else {
                list = null;
            }
            loftPagerAdapter2.f65479b = list;
            LoftPagerAdapter loftPagerAdapter3 = this.f65434f;
            if (loftPagerAdapter3 == null) {
                C7573i.m23583a("mLoftPagerAdapter");
            }
            String str2 = this.f65438j;
            if (str2 == null) {
                C7573i.m23583a("mLoftId");
            }
            loftPagerAdapter3.f65478a = str2;
            View findViewById2 = view.findViewById(R.id.edp);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.viewpager)");
            this.f65431b = (LoftViewPager) findViewById2;
            LoftViewPager loftViewPager = this.f65431b;
            if (loftViewPager == null) {
                C7573i.m23583a("mViewPager");
            }
            LoftPagerAdapter loftPagerAdapter4 = this.f65434f;
            if (loftPagerAdapter4 == null) {
                C7573i.m23583a("mLoftPagerAdapter");
            }
            loftViewPager.setAdapter(loftPagerAdapter4);
            LoftViewPager loftViewPager2 = this.f65431b;
            if (loftViewPager2 == null) {
                C7573i.m23583a("mViewPager");
            }
            loftViewPager2.addOnPageChangeListener(this);
            if (!this.f65439k) {
                Context context = activity;
                if (view != null) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    this.f65432c = new IntermediateStateViewController(context, viewGroup, this.f65439k);
                    IntermediateStateViewController intermediateStateViewController = this.f65432c;
                    if (intermediateStateViewController == null) {
                        C7573i.m23583a("mIntermediateStateViewController");
                    }
                    intermediateStateViewController.mo65148m();
                    IntermediateStateViewController intermediateStateViewController2 = this.f65432c;
                    if (intermediateStateViewController2 == null) {
                        C7573i.m23583a("mIntermediateStateViewController");
                    }
                    C24877b bVar2 = (C24877b) C24877b.f65602l.mo65136a(activity);
                    String str3 = this.f65438j;
                    if (str3 == null) {
                        C7573i.m23583a("mLoftId");
                    }
                    intermediateStateViewController2.mo65140a(bVar2.mo65114a(str3), ViewType.VIDEO_PLACEHOLDER, (OnClickListener) new C24834b(this, view));
                    IntermediateStateViewController intermediateStateViewController3 = this.f65432c;
                    if (intermediateStateViewController3 == null) {
                        C7573i.m23583a("mIntermediateStateViewController");
                    }
                    viewGroup.addView(intermediateStateViewController3.mo65150o());
                    view.postDelayed(new C24835c(this, view), 1000);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            } else {
                this.f65433d = new ImageView(activity);
                ImageView imageView = this.f65433d;
                if (imageView == null) {
                    C7573i.m23583a("mImage");
                }
                imageView.setScaleType(ScaleType.CENTER_CROP);
                if (C24832a.m81482a() != null) {
                    ImageView imageView2 = this.f65433d;
                    if (imageView2 == null) {
                        C7573i.m23583a("mImage");
                    }
                    imageView2.setImageBitmap(C24832a.m81482a());
                }
                if (view != null) {
                    LayoutParams layoutParams = new LayoutParams(-1, -1);
                    layoutParams.topMargin = C10994a.m32204a(getContext());
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    ImageView imageView3 = this.f65433d;
                    if (imageView3 == null) {
                        C7573i.m23583a("mImage");
                    }
                    viewGroup2.addView(imageView3, layoutParams);
                    view.postDelayed(new C24837d(this, view), 100);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.on, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("loft_id", "");
            C7573i.m23582a((Object) string, "it.getString(LOFT_ID, \"\")");
            this.f65438j = string;
            this.f65439k = arguments.getBoolean("loft_style", false);
        }
        C7573i.m23582a((Object) inflate, "view");
        m81492b(inflate);
        return inflate;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        boolean z2;
        LoftViewPager loftViewPager = this.f65431b;
        if (loftViewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        boolean z3 = true;
        if (i != loftViewPager.getCurrentItem()) {
            z = true;
        } else {
            z = false;
        }
        this.f65440l = z;
        boolean z4 = this.f65441m;
        if (f == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 & z2;
        if (i2 != 0) {
            z3 = false;
        }
        if (z5 && z3) {
            onPageSelected(0);
        }
    }
}
