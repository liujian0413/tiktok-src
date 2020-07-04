package com.p280ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.bytedance.sdk.account.p645a.p649d.C12733e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C36789a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.user.C42800a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget */
public final class MChooseAccountWidget extends Widget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f96577a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MChooseAccountWidget.class), "inflater", "getInflater()Landroid/view/LayoutInflater;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MChooseAccountWidget.class), "rootView", "getRootView()Landroid/view/ViewGroup;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MChooseAccountWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;"))};

    /* renamed from: m */
    public static final C36818a f96578m = new C36818a(null);

    /* renamed from: i */
    public PopupWindow f96579i;

    /* renamed from: j */
    public final View f96580j;

    /* renamed from: k */
    public final View f96581k;

    /* renamed from: l */
    public final View f96582l;

    /* renamed from: n */
    private final C7541d f96583n = C7546e.m23569a(new C36825d(this));

    /* renamed from: o */
    private final C7541d f96584o = C7546e.m23569a(new C36829h(this));

    /* renamed from: p */
    private final C7541d f96585p = C7546e.m23569a(C36832k.f96605a);

    /* renamed from: q */
    private final List<C36819b> f96586q = new ArrayList();

    /* renamed from: r */
    private final View f96587r;

    /* renamed from: s */
    private final View f96588s;

    /* renamed from: t */
    private final View f96589t;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$a */
    public static final class C36818a {
        private C36818a() {
        }

        public /* synthetic */ C36818a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$b */
    public static final class C36819b {

        /* renamed from: a */
        public final ViewGroup f96590a;

        /* renamed from: b */
        public final C42800a f96591b;

        /* renamed from: c */
        public final MChooseAccountWidget f96592c;

        /* renamed from: d */
        public final MultiAccountViewModel f96593d;

        public C36819b(ViewGroup viewGroup, C42800a aVar, MChooseAccountWidget mChooseAccountWidget, MultiAccountViewModel multiAccountViewModel) {
            int i;
            String valueOf;
            C7573i.m23587b(viewGroup, "rootView");
            C7573i.m23587b(aVar, "user");
            C7573i.m23587b(mChooseAccountWidget, "accountWidget");
            C7573i.m23587b(multiAccountViewModel, "viewModel");
            this.f96590a = viewGroup;
            this.f96591b = aVar;
            this.f96592c = mChooseAccountWidget;
            this.f96593d = multiAccountViewModel;
            if (C7573i.m23585a((Object) this.f96591b.f111244a, (Object) "-1")) {
                ((ImageView) this.f96590a.findViewById(R.id.ic)).setImageResource(R.drawable.aoj);
                ((TextView) this.f96590a.findViewById(R.id.bm3)).setText(R.string.eh);
                View findViewById = this.f96590a.findViewById(R.id.bm4);
                C7573i.m23582a((Object) findViewById, "rootView.findViewById<View>(R.id.line1)");
                findViewById.setVisibility(8);
            } else {
                C23323e.m76514a((RemoteImageView) this.f96590a.findViewById(R.id.ic), this.f96591b.f111248e);
                View findViewById2 = this.f96590a.findViewById(R.id.bm3);
                C7573i.m23582a((Object) findViewById2, "rootView.findViewById<TextView>(R.id.line0)");
                ((TextView) findViewById2).setText(this.f96591b.f111247d);
                View findViewById3 = this.f96590a.findViewById(R.id.bm4);
                C7573i.m23582a((Object) findViewById3, "rootView.findViewById<View>(R.id.line1)");
                findViewById3.setVisibility(0);
                View findViewById4 = this.f96590a.findViewById(R.id.bm4);
                C7573i.m23582a((Object) findViewById4, "rootView.findViewById<TextView>(R.id.line1)");
                ((TextView) findViewById4).setText(this.f96591b.mo104443a());
            }
            View findViewById5 = this.f96590a.findViewById(R.id.a5h);
            C7573i.m23582a((Object) findViewById5, "rootView.findViewById<View>(R.id.current_flag)");
            String str = this.f96591b.f111244a;
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (C7573i.m23585a((Object) str, (Object) a.getCurUserId())) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById5.setVisibility(i);
            View findViewById6 = this.f96590a.findViewById(R.id.cr1);
            C7573i.m23582a((Object) findViewById6, "rootView.findViewById<View>(R.id.red_point)");
            findViewById6.setVisibility(8);
            View findViewById7 = this.f96590a.findViewById(R.id.by8);
            C7573i.m23582a((Object) findViewById7, "rootView.findViewById<View>(R.id.message_count)");
            findViewById7.setVisibility(8);
            String str2 = this.f96591b.f111244a;
            IAccountUserService a2 = C21115b.m71197a();
            C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
            if (!C7573i.m23585a((Object) str2, (Object) a2.getCurUserId())) {
                int a3 = C34315c.m110973a(this.f96591b.f111244a);
                if (a3 > 0) {
                    TextView textView = (TextView) this.f96590a.findViewById(R.id.by8);
                    View findViewById8 = this.f96590a.findViewById(R.id.cr1);
                    C7573i.m23582a((Object) findViewById8, "rootView.findViewById<View>(R.id.red_point)");
                    findViewById8.setVisibility(0);
                    C7573i.m23582a((Object) textView, "messageCountTv");
                    textView.setVisibility(0);
                    if (a3 > 99) {
                        valueOf = "99+";
                    } else {
                        valueOf = String.valueOf(a3);
                    }
                    textView.setText(valueOf);
                }
            }
            this.f96590a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C36819b f96594a;

                {
                    this.f96594a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f96594a.f96592c.dismiss();
                    if (C43122ff.m136767b()) {
                        C6877n.m21407a("child_mode_click_switch_account", "", null);
                    }
                    if (C7573i.m23585a((Object) this.f96594a.f96591b.f111244a, (Object) "-1")) {
                        TimeLockRuler.doTeenagerModeAction(this.f96594a.f96590a.getContext(), "add_account", new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C368201 f96595a;

                            {
                                this.f96595a = r1;
                            }

                            public final void run() {
                                if (C21115b.m71197a().allUidList().size() < 3) {
                                    Context context = this.f96595a.f96594a.f96590a.getContext();
                                    if (!(context instanceof FragmentActivity)) {
                                        context = null;
                                    }
                                    C36789a.m118564a((FragmentActivity) context, "", "add_account_mine");
                                    return;
                                }
                                C10761a.m31409e(this.f96595a.f96594a.f96590a.getContext(), (int) R.string.ei).mo25750a();
                            }
                        });
                        return;
                    }
                    IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                    C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
                    if (!publishService.isUnKnown()) {
                        IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                        C7573i.m23582a((Object) publishService2, "ServiceManager.get().get…ss.java).publishService()");
                        if (!publishService2.isPublishFinished()) {
                            C7573i.m23582a((Object) view, "it");
                            C10761a.m31399c(view.getContext(), (int) R.string.d9e).mo25750a();
                            return;
                        }
                    }
                    TimeLockRuler.doTeenagerModeAction(this.f96594a.f96590a.getContext(), "switch_account", new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C368201 f96596a;

                        {
                            this.f96596a = r1;
                        }

                        public final void run() {
                            C6907h.m21524a("switch_account_submit", (Map) new HashMap());
                            MultiAccountViewModel.m118558a(this.f96596a.f96594a.f96591b.f111244a, (Bundle) null, (C12720d) new C12720d() {
                                public final /* synthetic */ void onSuccess(C12707b bVar) {
                                    m118626a((C12733e) bVar);
                                }

                                /* renamed from: a */
                                private static void m118626a(C12733e eVar) {
                                    C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 1).f60753a);
                                }

                                public final /* synthetic */ void onError(C12707b bVar, int i) {
                                    m118627a((C12733e) bVar, i);
                                }

                                /* renamed from: a */
                                private static void m118627a(C12733e eVar, int i) {
                                    Activity g = C6405d.m19984g();
                                    if (g != null) {
                                        C10761a.m31399c((Context) g, (int) R.string.b29).mo25750a();
                                    }
                                    C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 0).mo59970a("fail_info", i).f60753a);
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$c */
    public static final class C36824c extends PopupWindow {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96597a;

        public final void showAsDropDown(View view) {
            C7573i.m23587b(view, "anchor");
            if (VERSION.SDK_INT >= 24) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                setHeight(this.f96597a.f96580j.getHeight() - rect.bottom);
            }
            super.showAsDropDown(view);
        }

        C36824c(MChooseAccountWidget mChooseAccountWidget, View view, int i, int i2) {
            this.f96597a = mChooseAccountWidget;
            super(view, -1, -1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$d */
    static final class C36825d extends Lambda implements C7561a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96598a;

        C36825d(MChooseAccountWidget mChooseAccountWidget) {
            this.f96598a = mChooseAccountWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LayoutInflater invoke() {
            View view = this.f96598a.f60921d;
            C7573i.m23582a((Object) view, "mContentView");
            return LayoutInflater.from(view.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$e */
    static final class C36826e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96599a;

        C36826e(MChooseAccountWidget mChooseAccountWidget) {
            this.f96599a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18722O()) {
                this.f96599a.mo93212a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$f */
    static final class C36827f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96600a;

        C36827f(MChooseAccountWidget mChooseAccountWidget) {
            this.f96600a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18722O()) {
                this.f96600a.mo93212a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$g */
    static final class C36828g implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96601a;

        C36828g(MChooseAccountWidget mChooseAccountWidget) {
            this.f96601a = mChooseAccountWidget;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2;
            if (view == this.f96601a.f96582l) {
                view2 = this.f96601a.f96581k;
            } else {
                view2 = this.f96601a.f96582l;
            }
            C7573i.m23582a((Object) motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        view2.animate().alpha(0.5f).setDuration(200).start();
                        break;
                    case 1:
                        view.performClick();
                        break;
                }
            }
            view2.animate().alpha(1.0f).setDuration(200).start();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$h */
    static final class C36829h extends Lambda implements C7561a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96602a;

        C36829h(MChooseAccountWidget mChooseAccountWidget) {
            this.f96602a = mChooseAccountWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewGroup invoke() {
            View view = this.f96602a.f60921d;
            if (view != null) {
                return (ViewGroup) view;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$i */
    static final class C36830i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96603a;

        C36830i(MChooseAccountWidget mChooseAccountWidget) {
            this.f96603a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PopupWindow popupWindow = this.f96603a.f96579i;
            if (popupWindow != null) {
                C36902c.m118774a(popupWindow);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$j */
    static final class C36831j implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f96604a;

        C36831j(MChooseAccountWidget mChooseAccountWidget) {
            this.f96604a = mChooseAccountWidget;
        }

        public final void onDismiss() {
            this.f96604a.f96582l.animate().rotation(180.0f).setDuration(100).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$k */
    static final class C36832k extends Lambda implements C7561a<MultiAccountViewModel> {

        /* renamed from: a */
        public static final C36832k f96605a = new C36832k();

        C36832k() {
            super(0);
        }

        /* renamed from: a */
        private static MultiAccountViewModel m118630a() {
            return new MultiAccountViewModel();
        }

        public final /* synthetic */ Object invoke() {
            return m118630a();
        }
    }

    /* renamed from: d */
    private final LayoutInflater m118618d() {
        return (LayoutInflater) this.f96583n.getValue();
    }

    /* renamed from: e */
    private final ViewGroup m118619e() {
        return (ViewGroup) this.f96584o.getValue();
    }

    /* renamed from: f */
    private final MultiAccountViewModel m118620f() {
        return (MultiAccountViewModel) this.f96585p.getValue();
    }

    /* renamed from: b */
    public final int mo60147b() {
        return R.layout.a0w;
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.f96579i;
        if (popupWindow != null) {
            C36901b.m118773a(popupWindow);
        }
    }

    /* renamed from: a */
    public final void mo93212a() {
        PopupWindow popupWindow = this.f96579i;
        if (popupWindow == null || !popupWindow.isShowing()) {
            this.f96579i = m118621g();
            C6907h.m21524a("account_list_unfold", (Map) C22984d.m75611a().mo59970a("status", 0).mo59973a("enter_method", "user_click").f60753a);
            PopupWindow popupWindow2 = this.f96579i;
            if (popupWindow2 == null) {
                C7573i.m23580a();
            }
            popupWindow2.showAsDropDown(this.f96588s);
            this.f96582l.animate().rotation(0.0f).setDuration(100).start();
            this.f60921d.setOnClickListener(new C36830i(this));
            PopupWindow popupWindow3 = this.f96579i;
            if (popupWindow3 == null) {
                C7573i.m23580a();
            }
            popupWindow3.setOnDismissListener(new C36831j(this));
        }
    }

    /* renamed from: g */
    private final PopupWindow m118621g() {
        m118619e().removeAllViews();
        this.f96586q.clear();
        View view = new View(m118619e().getContext());
        view.setBackgroundResource(R.color.az3);
        m118619e().addView(view, -1, (int) C9738o.m28708b(m118619e().getContext(), 4.0f));
        for (C42800a aVar : m118620f().mo93123a()) {
            View inflate = m118618d().inflate(R.layout.to, m118619e(), false);
            if (inflate != null) {
                C36819b bVar = new C36819b((ViewGroup) inflate, aVar, this, m118620f());
                bVar.f96590a.setTag(bVar);
                m118619e().addView(bVar.f96590a);
                this.f96586q.add(bVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        View view2 = new View(m118619e().getContext());
        view2.setBackgroundResource(R.color.az3);
        m118619e().addView(view2, -1, (int) C9738o.m28708b(m118619e().getContext(), 4.0f));
        C36824c cVar = new C36824c(this, this.f60921d, -1, -1);
        cVar.setFocusable(true);
        cVar.setOutsideTouchable(true);
        View view3 = this.f60921d;
        C7573i.m23582a((Object) view3, "mContentView");
        cVar.setBackgroundDrawable(new ColorDrawable(view3.getResources().getColor(R.color.a8r)));
        return cVar;
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        C7573i.m23587b(view, "view");
        super.mo60146a(view);
        m118619e().removeAllViews();
        OnTouchListener aVar = new C34032a(0.5f, 200, new C36828g(this));
        this.f96581k.setOnTouchListener(aVar);
        this.f96582l.setOnTouchListener(aVar);
        this.f96581k.setOnClickListener(new C36826e(this));
        this.f96582l.setOnClickListener(new C36827f(this));
    }

    /* renamed from: a */
    public final void mo93213a(User user) {
        int i;
        C7573i.m23587b(user, "user");
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        int i2 = 0;
        if (a.mo18722O()) {
            this.f96587r.setVisibility(8);
            this.f96582l.setVisibility(0);
            this.f96589t.setVisibility(8);
            IAccountUserService a2 = C21115b.m71197a();
            C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
            String curUserId = a2.getCurUserId();
            List allUidList = C21115b.m71197a().allUidList();
            C7573i.m23582a((Object) allUidList, "AccountUserProxyService.get().allUidList()");
            Iterable<String> iterable = allUidList;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (String str : iterable) {
                if (C7573i.m23585a((Object) curUserId, (Object) str)) {
                    i = 0;
                } else {
                    C7573i.m23582a((Object) str, "it");
                    i = C34315c.m110973a(str);
                }
                arrayList.add(Integer.valueOf(i));
            }
            int q = C7525m.m23527q((List) arrayList);
            View view = this.f96589t;
            if (q <= 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
            return;
        }
        if (!C43122ff.m136767b()) {
            this.f96587r.setVisibility(0);
        }
        this.f96582l.setVisibility(8);
        this.f96589t.setVisibility(8);
    }

    public MChooseAccountWidget(View view, View view2, View view3, View view4, View view5, View view6) {
        C7573i.m23587b(view, "fragmentRootView");
        C7573i.m23587b(view2, "qrView");
        C7573i.m23587b(view3, "titleBar");
        C7573i.m23587b(view4, "title");
        C7573i.m23587b(view5, "moreBtn");
        C7573i.m23587b(view6, "redPointView");
        this.f96580j = view;
        this.f96587r = view2;
        this.f96588s = view3;
        this.f96581k = view4;
        this.f96582l = view5;
        this.f96589t = view6;
    }
}
