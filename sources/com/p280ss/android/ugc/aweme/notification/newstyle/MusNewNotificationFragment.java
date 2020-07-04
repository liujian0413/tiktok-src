package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.C34161a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.EnterFrom;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.MTTutorialVideoExperiment;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34355d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.model.RecommendAvatarsModel;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34540f.C34541a;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.C34512b;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.MusNewNotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1442a.C34543a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1443b.C34546a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1443b.C34547b;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34559d;
import com.p280ss.android.ugc.aweme.notification.newstyle.p1440a.C34500b;
import com.p280ss.android.ugc.aweme.notification.newstyle.p1441b.C34515a;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34620f;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p280ss.android.ugc.aweme.notification.view.copy.C34647a;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a.C32264a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;
import kotlin.reflect.C7595j;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment */
public final class MusNewNotificationFragment extends AmeBaseFragment implements C1032b, C6905a, C25675c<MusNotice>, C34512b, C34547b {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f89931e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusNewNotificationFragment.class), "mFollowRequestPresenter", "getMFollowRequestPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/followrequest/presenter/FollowRequestPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusNewNotificationFragment.class), "mNoticeMultiPresenter", "getMNoticeMultiPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/presenter/MusNotificationMultiPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusNewNotificationFragment.class), "mNoticeModel", "getMNoticeModel()Lcom/ss/android/ugc/aweme/notification/newstyle/model/MusNewNotificationModel;"))};

    /* renamed from: h */
    public static final C34476a f89932h = new C34476a(null);

    /* renamed from: f */
    public MusNewNotificationAdapter f89933f;

    /* renamed from: g */
    public boolean f89934g;

    /* renamed from: i */
    private final C7541d f89935i = C7546e.m23569a(C34485j.f89958a);

    /* renamed from: j */
    private final C7541d f89936j = C7546e.m23569a(C34487l.f89960a);

    /* renamed from: k */
    private final C7541d f89937k = C7546e.m23569a(C34486k.f89959a);

    /* renamed from: l */
    private AnalysisStayTimeFragmentComponent f89938l;

    /* renamed from: m */
    private RecommendAvatarsModel f89939m;

    /* renamed from: n */
    private TutorialVideoViewModel f89940n;

    /* renamed from: o */
    private LinearLayoutManager f89941o;

    /* renamed from: p */
    private C34515a f89942p;

    /* renamed from: q */
    private final List<C34355d> f89943q = m111488s();

    /* renamed from: r */
    private int f89944r;

    /* renamed from: s */
    private int f89945s = 36;

    /* renamed from: t */
    private final String f89946t = "99+";

    /* renamed from: u */
    private final AtomicInteger f89947u = new AtomicInteger(2);

    /* renamed from: v */
    private boolean f89948v;

    /* renamed from: w */
    private NotificationPushGuide f89949w;

    /* renamed from: x */
    private HashMap f89950x;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$a */
    public static final class C34476a {
        private C34476a() {
        }

        public /* synthetic */ C34476a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$b */
    static final class C34477b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89951a;

        C34477b(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89951a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            MusNewNotificationFragment musNewNotificationFragment = this.f89951a;
            RelativeLayout relativeLayout = (RelativeLayout) this.f89951a.mo87788a((int) R.id.cv8);
            C7573i.m23582a((Object) relativeLayout, "rl_title_bar");
            musNewNotificationFragment.mo87789a((View) relativeLayout);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$c */
    static final class C34478c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89952a;

        C34478c(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89952a = musNewNotificationFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m111510a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111510a() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f89952a.mo87788a((int) R.id.dea);
            dmtStatusView.mo25943g();
            dmtStatusView.setFocusable(false);
            dmtStatusView.setFocusableInTouchMode(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$d */
    static final class C34479d<T> implements C0053p<C34362j> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89953a;

        C34479d(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89953a = musNewNotificationFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C34362j jVar) {
            MusNewNotificationFragment.m111469a(this.f89953a).mo87818a(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$e */
    static final class C34480e<T> implements C0053p<TutorialVideoResp> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89954a;

        C34480e(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89954a = musNewNotificationFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(TutorialVideoResp tutorialVideoResp) {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                C34325e eVar = (C34325e) C34324a.m111010a(C34325e.class);
                str3 = eVar.mo60348a("");
                String string = this.f89954a.getString(R.string.cjv);
                C7573i.m23582a((Object) string, "getString(R.string.new_feature_notification)");
                str2 = eVar.mo60350c(string);
                String string2 = this.f89954a.getString(R.string.cjw);
                C7573i.m23582a((Object) string2, "getString(R.string.new_feature_notification2)");
                str = eVar.mo60352e(string2);
                String string3 = this.f89954a.getString(R.string.cjx);
                C7573i.m23582a((Object) string3, "getString(R.string.new_feature_watch)");
                str4 = eVar.mo60354g(string3);
            } catch (Exception unused) {
                str3 = "";
                str2 = this.f89954a.getString(R.string.cjv);
                C7573i.m23582a((Object) str2, "getString(R.string.new_feature_notification)");
                str = this.f89954a.getString(R.string.cjv);
                C7573i.m23582a((Object) str, "getString(R.string.new_feature_notification)");
                str4 = this.f89954a.getString(R.string.cjv);
                C7573i.m23582a((Object) str4, "getString(R.string.new_feature_notification)");
            }
            if (!TextUtils.isEmpty(str3)) {
                MusNewNotificationFragment.m111469a(this.f89954a).mo87817a(new TutorialVideoResp(new TutorialVideoInfo(str3, str2, str, str4), 0));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$f */
    public static final class C34481f implements C34541a {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89955a;

        C34481f(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89955a = musNewNotificationFragment;
        }

        /* renamed from: a */
        public final void mo87795a(int i) {
            MusNewNotificationFragment.m111469a(this.f89955a).mo87821e(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$g */
    public static final class C34482g implements C34161a {
        C34482g() {
        }

        /* renamed from: a */
        public final void mo75676a(Context context) {
            C6903bc.m21505x().mo57947e(context);
        }

        /* renamed from: b */
        public final boolean mo75677b(Context context) {
            return C6903bc.m21505x().mo57949f(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$h */
    static final class C34483h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89956a;

        C34483h(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89956a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32263a.f84322a.mo83487a().openSessionListActivity(this.f89956a.getContext());
            C34315c.m110984c(997);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$i */
    static final class C34484i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89957a;

        C34484i(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89957a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32263a.f84322a.mo83487a().openSessionListActivity(this.f89957a.getContext());
            C34315c.m110984c(997);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$j */
    static final class C34485j extends Lambda implements C7561a<C34546a> {

        /* renamed from: a */
        public static final C34485j f89958a = new C34485j();

        C34485j() {
            super(0);
        }

        /* renamed from: a */
        private static C34546a m111516a() {
            return new C34546a();
        }

        public final /* synthetic */ Object invoke() {
            return m111516a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$k */
    static final class C34486k extends Lambda implements C7561a<C34559d> {

        /* renamed from: a */
        public static final C34486k f89959a = new C34486k();

        C34486k() {
            super(0);
        }

        /* renamed from: a */
        private static C34559d m111517a() {
            return new C34559d();
        }

        public final /* synthetic */ Object invoke() {
            return m111517a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$l */
    static final class C34487l extends Lambda implements C7561a<C34500b> {

        /* renamed from: a */
        public static final C34487l f89960a = new C34487l();

        C34487l() {
            super(0);
        }

        /* renamed from: a */
        private static C34500b m111518a() {
            return new C34500b();
        }

        public final /* synthetic */ Object invoke() {
            return m111518a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$m */
    static final class C34488m<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89961a;

        C34488m(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89961a = musNewNotificationFragment;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m111519a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111519a(C1592h<Void> hVar) {
            if (this.f89961a.isViewValid()) {
                this.f89961a.mo87792f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$n */
    static final class C34489n extends Lambda implements C7562b<Integer, C1293v> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89962a;

        C34489n(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89962a = musNewNotificationFragment;
            super(1);
        }

        /* renamed from: a */
        private C1293v m111520a(int i) {
            return ((RecyclerView) this.f89962a.mo87788a((int) R.id.cxi)).mo5575f(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m111520a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$o */
    static final class C34490o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89963a;

        C34490o(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89963a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89963a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment$p */
    static final class C34491p implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f89964a;

        C34491p(MusNewNotificationFragment musNewNotificationFragment) {
            this.f89964a = musNewNotificationFragment;
        }

        public final void onDismiss() {
            View a = this.f89964a.mo87788a((int) R.id.e_j);
            C7573i.m23582a((Object) a, "v_title_line");
            a.setVisibility(4);
            this.f89964a.mo87791e();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) this.f89964a.mo87788a((int) R.id.b9a), "rotation", new float[]{180.0f, 0.0f});
            C7573i.m23582a((Object) ofFloat, "animator");
            ofFloat.setDuration(200);
            ofFloat.start();
        }
    }

    /* renamed from: g */
    private final C34546a m111478g() {
        return (C34546a) this.f89935i.getValue();
    }

    /* renamed from: j */
    private final C34500b m111479j() {
        return (C34500b) this.f89936j.getValue();
    }

    /* renamed from: k */
    private final C34559d m111480k() {
        return (C34559d) this.f89937k.getValue();
    }

    /* renamed from: w */
    private void m111492w() {
        if (this.f89950x != null) {
            this.f89950x.clear();
        }
    }

    /* renamed from: a */
    public final View mo87788a(int i) {
        if (this.f89950x == null) {
            this.f89950x = new HashMap();
        }
        View view = (View) this.f89950x.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f89950x.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo87784a(List<User> list, boolean z, boolean z2) {
        C7573i.m23587b(list, "list");
    }

    /* renamed from: a */
    public final void mo87785a(boolean z) {
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<MusNotice> list, boolean z) {
    }

    /* renamed from: a */
    public final void mo59099a(List<MusNotice> list, boolean z) {
        Object obj;
        boolean z2;
        Collection collection = list;
        if (!(collection == null || collection.isEmpty()) && C33213d.m107132a().mo85008c(61) > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MusNotice) obj).getTcmNotice() != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            MusNotice musNotice = (MusNotice) obj;
            if (musNotice != null) {
                list.remove(musNotice);
                list.add(0, musNotice);
            }
        }
        if (isViewValid()) {
            this.f89947u.decrementAndGet();
            MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
            if (musNewNotificationAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter.mo66516d(true);
            if (!z) {
                m111487r();
            } else {
                MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
                if (musNewNotificationAdapter2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter2.ai_();
                RecyclerView recyclerView = (RecyclerView) mo87788a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView, "rv_list");
                recyclerView.getVisibility();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
            C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            MusNewNotificationAdapter musNewNotificationAdapter3 = this.f89933f;
            if (musNewNotificationAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter3.mo58045a(list);
            ((DmtStatusView) mo87788a((int) R.id.dea)).mo25939d();
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            ((RecyclerView) mo87788a((int) R.id.cxi)).mo5541b(0);
        }
    }

    /* renamed from: a */
    public final void mo87783a(List<User> list, int i) {
        C7573i.m23587b(list, "list");
        this.f89947u.decrementAndGet();
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo87819a(list, i, this.f89944r);
        if (this.f89947u.get() == 0) {
            ((DmtStatusView) mo87788a((int) R.id.dea)).mo25939d();
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    public final void onPause() {
        super.onPause();
        m111474b(false);
    }

    /* renamed from: r */
    private final void m111487r() {
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo66516d(false);
    }

    public final void aD_() {
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.ag_();
    }

    /* renamed from: p */
    private final void m111485p() {
        DmtTextView dmtTextView = (DmtTextView) mo87788a((int) R.id.dxu);
        C7573i.m23582a((Object) dmtTextView, "tv_message_count");
        dmtTextView.setVisibility(8);
        m111476c(false);
    }

    /* renamed from: q */
    private static boolean m111486q() {
        return C34315c.m110982b(11, 997);
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        RecyclerView recyclerView = (RecyclerView) mo87788a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        recyclerView.getVisibility();
    }

    public final Analysis getAnalysis() {
        Analysis labelName = new Analysis().setLabelName("message");
        C7573i.m23582a((Object) labelName, "Analysis().setLabelName(NoticeMob.Label.MESSAGE)");
        return labelName;
    }

    public final void onStart() {
        super.onStart();
        Object service = ServiceManager.get().getService(ILegacyService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…egacyService::class.java)");
        ((ILegacyService) service).getUgAllService().mo57945d(getContext());
    }

    public final void bd_() {
        if (isViewValid() && !m111479j().mo66540i()) {
            m111479j().mo56976a(Integer.valueOf(4), Integer.valueOf(this.f89945s), null);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        m111479j().mo66535W_();
        m111479j().mo59134U_();
        m111478g().mo66535W_();
        m111478g().mo59134U_();
        m111492w();
    }

    public final void onResume() {
        super.onResume();
        m111474b(true);
        m111482m();
        if (!this.mHidden && C43051dc.m136580a()) {
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logEnterPage("message");
        }
        if (this.f89934g) {
            onRefresh();
            this.f89934g = false;
        }
    }

    /* renamed from: m */
    private final void m111482m() {
        if (isViewValid()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("label");
                String stringExtra2 = intent.getStringExtra("uid");
                if (intent.getBooleanExtra("is_from_push", false) && this.f89945s != 36) {
                    C34515a aVar = this.f89942p;
                    if (aVar != null) {
                        aVar.mo87827a();
                    }
                    mo87790a((C34355d) this.f89943q.get(0));
                }
                intent.putExtra("label", "");
                if (TextUtils.equals(stringExtra, "follow_request")) {
                    startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", stringExtra).withParam("uid", stringExtra2).buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
                }
            }
        }
    }

    /* renamed from: n */
    private final void m111483n() {
        List a = m111480k().mo87860a(this.f89945s);
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo58045a(a);
        MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
        if (musNewNotificationAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter2.notifyDataSetChanged();
        if (!C34517c.m111626a(getActivity())) {
            this.f89947u.set(0);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C10761a.m31399c((Context) activity, (int) R.string.cjs).mo25750a();
            if (isViewValid()) {
                mo87792f();
                return;
            }
            return;
        }
        MusNewNotificationAdapter musNewNotificationAdapter3 = this.f89933f;
        if (musNewNotificationAdapter3 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musNewNotificationAdapter3.getItemCount() > 0) {
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25942f();
        }
        onRefresh();
    }

    /* renamed from: t */
    private final boolean m111489t() {
        boolean z;
        int i;
        boolean z2;
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        Collection a = musNewNotificationAdapter.mo62312a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
            if (musNewNotificationAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            List a2 = musNewNotificationAdapter2.mo62312a();
            C7573i.m23582a((Object) a2, "mAdapter.data");
            Iterable<MusNotice> iterable = a2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i = 0;
                for (MusNotice musNotice : iterable) {
                    C7573i.m23582a((Object) musNotice, "it");
                    if (musNotice.getType() != 50) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i++;
                        if (i < 0) {
                            C7525m.m23467c();
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private final void m111490u() {
        if (this.f89947u.get() == 0) {
            ((DmtStatusView) mo87788a((int) R.id.dea)).mo25939d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
            C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            if (m111489t()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) mo87788a((int) R.id.dea);
                dmtStatusView2.mo25943g();
                dmtStatusView2.setFocusable(false);
                dmtStatusView2.setFocusableInTouchMode(false);
            }
        }
    }

    /* renamed from: v */
    private final void m111491v() {
        ((NoticeView) mo87788a((int) R.id.asi)).setIconImage((int) R.drawable.adu);
        SpannableString spannableString = new SpannableString(C23481i.m77091b(R.string.btg));
        String b = C23481i.m77091b(R.string.bth);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "getContext()!!");
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.w)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        ((NoticeView) mo87788a((int) R.id.asi)).setTitleText((CharSequence) spannableStringBuilder);
    }

    public final void ae_() {
        if (isViewValid()) {
            this.f89947u.decrementAndGet();
            MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
            if (musNewNotificationAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            if (musNewNotificationAdapter.f67566v) {
                MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
                if (musNewNotificationAdapter2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter2.notifyDataSetChanged();
                m111487r();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
            C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            m111490u();
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo87791e() {
        if (this.f89945s != 36) {
            int a = C34315c.m110974a(36);
            int a2 = C34315c.m110974a(this.f89945s);
            if (a > 0 && a > a2) {
                ImageView imageView = (ImageView) mo87788a((int) R.id.bd3);
                C7573i.m23582a((Object) imageView, "iv_title_dot");
                imageView.setVisibility(0);
                return;
            }
        }
        ImageView imageView2 = (ImageView) mo87788a((int) R.id.bd3);
        C7573i.m23582a((Object) imageView2, "iv_title_dot");
        imageView2.setVisibility(8);
    }

    /* renamed from: f */
    public final void mo87792f() {
        if (this.f89947u.get() == 0) {
            ((DmtStatusView) mo87788a((int) R.id.dea)).mo25939d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
            C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            if (m111489t()) {
                ((DmtStatusView) mo87788a((int) R.id.dea)).mo25944h();
                RecyclerView recyclerView = (RecyclerView) mo87788a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView, "rv_list");
                recyclerView.getVisibility();
            }
        }
    }

    /* renamed from: o */
    private final void m111484o() {
        int a = C34315c.m110974a(99);
        if (a > 0 || !C32264a.m104778b()) {
            m111475c(a);
        } else if (m111486q()) {
            m111476c(true);
        } else {
            if (C34315c.m110982b(101)) {
                m111476c(true);
            }
        }
        if (C34637f.m111897a()) {
            DmtTextView dmtTextView = (DmtTextView) mo87788a((int) R.id.dxu);
            C7573i.m23582a((Object) dmtTextView, "tv_message_count");
            dmtTextView.setVisibility(8);
            ImageView imageView = (ImageView) mo87788a((int) R.id.dxt);
            C7573i.m23582a((Object) imageView, "tv_message_box");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) mo87788a((int) R.id.b9a);
            C7573i.m23582a((Object) imageView2, "iv_filter_arrow");
            imageView2.setVisibility(8);
        }
        ((DmtTextView) mo87788a((int) R.id.dxu)).setOnClickListener(new C34483h(this));
        C34626j.m111876a((DmtTextView) mo87788a((int) R.id.dxu));
        ((ImageView) mo87788a((int) R.id.dxt)).setOnClickListener(new C34484i(this));
        C34626j.m111876a((ImageView) mo87788a((int) R.id.dxt));
    }

    /* renamed from: s */
    private static List<C34355d> m111488s() {
        List<C34355d> arrayList = new ArrayList<>();
        C34355d dVar = new C34355d(36, R.string.cp2, R.drawable.adn, R.string.co5, R.string.cou, R.drawable.axd);
        arrayList.add(dVar);
        C34355d dVar2 = new C34355d(3, R.string.cp8, R.drawable.adr, R.string.cpf, R.string.cpe, R.drawable.axh);
        arrayList.add(dVar2);
        C34355d dVar3 = new C34355d(44, R.string.cp5, R.drawable.adp, R.string.coc, R.string.cob, R.drawable.axf);
        arrayList.add(dVar3);
        C34355d dVar4 = new C34355d(26, R.string.cp4, R.drawable.ado, R.string.cpl, R.string.cpk, R.drawable.axe);
        arrayList.add(dVar4);
        C34355d dVar5 = new C34355d(7, R.string.cp6, R.drawable.adq, R.string.cp0, R.string.coz, R.drawable.axg);
        arrayList.add(dVar5);
        C34355d dVar6 = new C34355d(37, R.string.cp_, R.drawable.ads, R.string.cpt, R.string.cps, R.drawable.axj);
        arrayList.add(dVar6);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo87781a() {
        this.f89947u.decrementAndGet();
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo87819a((List<User>) new ArrayList<User>(), 0, 0);
        if (this.f89948v) {
            mo87792f();
        } else {
            m111490u();
        }
    }

    public final void onRefresh() {
        if (isViewValid()) {
            if (C34637f.m111897a()) {
                this.f89947u.set(0);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
                C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
                swipeRefreshLayout.setRefreshing(false);
                m111490u();
                return;
            }
            if (C34517c.m111626a(getActivity())) {
                this.f89948v = false;
                MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
                if (musNewNotificationAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                if (musNewNotificationAdapter.getItemCount() == 0) {
                    ((DmtStatusView) mo87788a((int) R.id.dea)).mo25942f();
                }
                MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
                if (musNewNotificationAdapter2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter2.f90012b = C34315c.m110974a(this.f89945s);
                if (C33213d.m107132a().mo85008c(61) > 0) {
                    MusNewNotificationAdapter musNewNotificationAdapter3 = this.f89933f;
                    if (musNewNotificationAdapter3 == null) {
                        C7573i.m23583a("mAdapter");
                    }
                    musNewNotificationAdapter3.f90012b++;
                }
                if (this.f89945s == 36) {
                    this.f89947u.set(2);
                    RecommendAvatarsModel recommendAvatarsModel = this.f89939m;
                    if (recommendAvatarsModel == null) {
                        C7573i.m23583a("mRecommendAvatarsModel");
                    }
                    recommendAvatarsModel.startFetch();
                    if (!C34637f.m111897a() && C6384b.m19835a().mo15292a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", C6384b.m19835a().mo15295d().mt_tutorial_video, false)) {
                        TutorialVideoViewModel tutorialVideoViewModel = this.f89940n;
                        if (tutorialVideoViewModel == null) {
                            C7573i.m23583a("mTutorialVideoModel");
                        }
                        tutorialVideoViewModel.mo87893a(1);
                    }
                    m111478g().mo87849e();
                } else {
                    this.f89947u.set(1);
                }
                m111479j().mo56976a(Integer.valueOf(1), Integer.valueOf(this.f89945s), null);
                m111472b(this.f89945s);
                if (C27688b.m90840d()) {
                    C42961az.m136380a(new C34314g(6, 0));
                }
            } else {
                this.f89947u.set(0);
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                C10761a.m31399c((Context) activity, (int) R.string.cjs).mo25750a();
                C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C34488m<TResult,TContinuationResult>(this), C1592h.f5958b);
            }
        }
    }

    /* renamed from: l */
    private final void m111481l() {
        String str;
        if (VERSION.SDK_INT >= 19) {
            View a = mo87788a((int) R.id.e_h);
            C7573i.m23582a((Object) a, "v_status_bar");
            LayoutParams layoutParams = a.getLayoutParams();
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            layoutParams.height = C10994a.m32204a((Context) activity);
        }
        this.f89941o = new FixedLinearlayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) mo87788a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        LinearLayoutManager linearLayoutManager = this.f89941o;
        if (linearLayoutManager == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) mo87788a((int) R.id.cxi)).mo5528a((C1281m) new FrescoRecycleViewScrollListener(getContext()));
        C34550g.m111722a((RecyclerView) mo87788a((int) R.id.cxi), (SwipeRefreshLayout) mo87788a((int) R.id.d9u));
        ((SwipeRefreshLayout) mo87788a((int) R.id.d9u)).setOnRefreshListener(this);
        m111484o();
        if (!C34637f.m111897a()) {
            C34626j.m111876a((ConstraintLayout) mo87788a((int) R.id.bkg));
            ((ConstraintLayout) mo87788a((int) R.id.bkg)).setOnClickListener(new C34477b(this));
        }
        m111471a((int) R.string.co5, (int) R.string.cou, (int) R.drawable.axd);
        ((DmtStatusView) mo87788a((int) R.id.deb)).setBuilder(C10803a.m31631a((Context) getActivity()));
        m111479j().mo66536a(m111480k());
        m111479j().mo66537a((C25675c<?>) this);
        m111478g().mo66536a(new C34543a());
        m111478g().mo66537a(this);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity2, "activity!!");
        Intent intent = activity2.getIntent();
        if (intent != null) {
            if (intent.getBooleanExtra("is_from_push", false)) {
                str = "push";
            } else {
                str = "message";
            }
            Fragment fragment = this;
            this.f89933f = new MusNewNotificationAdapter(fragment, str, new C34478c(this));
            MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
            if (musNewNotificationAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter.mo66504a((C6905a) this);
            MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
            if (musNewNotificationAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter2.mo66516d(true);
            MusNewNotificationAdapter musNewNotificationAdapter3 = this.f89933f;
            if (musNewNotificationAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter3.mo66506d(0);
            m111487r();
            RecyclerView recyclerView2 = (RecyclerView) mo87788a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView2, "rv_list");
            MusNewNotificationAdapter musNewNotificationAdapter4 = this.f89933f;
            if (musNewNotificationAdapter4 == null) {
                C7573i.m23583a("mAdapter");
            }
            recyclerView2.setAdapter(musNewNotificationAdapter4);
            RecyclerView recyclerView3 = (RecyclerView) mo87788a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView3, "rv_list");
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).startRecyclerViewFpsMonitor("mus_new_notification", recyclerView3);
            C0063u a2 = C0069x.m157a(fragment).mo147a(RecommendAvatarsModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(th…AvatarsModel::class.java)");
            this.f89939m = (RecommendAvatarsModel) a2;
            RecommendAvatarsModel recommendAvatarsModel = this.f89939m;
            if (recommendAvatarsModel == null) {
                C7573i.m23583a("mRecommendAvatarsModel");
            }
            C0043i iVar = this;
            recommendAvatarsModel.liveData.observe(iVar, new C34479d(this));
            C0063u a3 = C0069x.m157a(fragment).mo147a(TutorialVideoViewModel.class);
            C7573i.m23582a((Object) a3, "ViewModelProviders.of(th…deoViewModel::class.java)");
            this.f89940n = (TutorialVideoViewModel) a3;
            TutorialVideoViewModel tutorialVideoViewModel = this.f89940n;
            if (tutorialVideoViewModel == null) {
                C7573i.m23583a("mTutorialVideoModel");
            }
            tutorialVideoViewModel.f90327a.observe(iVar, new C34480e(this));
            C34540f fVar = new C34540f();
            RecyclerView recyclerView4 = (RecyclerView) mo87788a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView4, "rv_list");
            LinearLayoutManager linearLayoutManager2 = this.f89941o;
            if (linearLayoutManager2 == null) {
                C7573i.m23583a("mLinearLayoutManager");
            }
            fVar.mo87843a(recyclerView4, linearLayoutManager2, new C34481f(this));
            m111491v();
            this.f89949w = new NotificationPushGuide((NoticeView) mo87788a((int) R.id.asi), new C34482g());
            NotificationPushGuide notificationPushGuide = this.f89949w;
            if (notificationPushGuide != null) {
                notificationPushGuide.f89060c = EnterFrom.Message;
            }
            if (C34439a.f89873b.getEnablePushGuide() != 0) {
                NotificationPushGuide notificationPushGuide2 = this.f89949w;
                if (notificationPushGuide2 != null) {
                    notificationPushGuide2.mo86880a();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ MusNewNotificationAdapter m111469a(MusNewNotificationFragment musNewNotificationFragment) {
        MusNewNotificationAdapter musNewNotificationAdapter = musNewNotificationFragment.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return musNewNotificationAdapter;
    }

    /* renamed from: b */
    private static void m111473b(View view) {
        int b = (int) C9738o.m28708b(view.getContext(), 5.0f);
        float f = (float) b;
        C34620f.m111872a(view, b, b, f, f);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f89938l = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo66508i();
    }

    /* renamed from: b */
    private final void m111474b(boolean z) {
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        MusLiveRecommendAvatarNotificationHolder musLiveRecommendAvatarNotificationHolder = (MusLiveRecommendAvatarNotificationHolder) C7605h.m23658d(C7605h.m23653a(C7605h.m23661e(C7525m.m23526p(C7551d.m23565b(0, musNewNotificationAdapter.getItemCount())), new C34489n(this)), (C7562b<? super T, Boolean>) C34492x5a7d7994.INSTANCE));
        if (musLiveRecommendAvatarNotificationHolder != null) {
            if (z) {
                musLiveRecommendAvatarNotificationHolder.mo87677e();
            } else {
                musLiveRecommendAvatarNotificationHolder.mo87676d();
            }
        }
    }

    /* renamed from: c */
    private final void m111476c(boolean z) {
        if (C34637f.m111897a() || !z) {
            ImageView imageView = (ImageView) mo87788a((int) R.id.ba_);
            C7573i.m23582a((Object) imageView, "iv_message_dot");
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) mo87788a((int) R.id.ba_);
        C7573i.m23582a((Object) imageView2, "iv_message_dot");
        imageView2.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != 101) goto L_0x0035;
     */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNotificationIndicatorEvent(com.p280ss.android.ugc.aweme.notice.api.bean.C34314g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            boolean r0 = r2.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            int r0 = r3.f89465a
            r1 = 11
            if (r0 == r1) goto L_0x0023
            r1 = 99
            if (r0 == r1) goto L_0x001b
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L_0x0023
            goto L_0x0035
        L_0x001b:
            int r0 = r3.f89465a
            int r3 = r3.f89466b
            r2.m111470a(r0, r3)
            goto L_0x0035
        L_0x0023:
            int r0 = r3.f89465a
            int r1 = r3.f89466b
            com.p280ss.android.ugc.aweme.notice.api.C34315c.m110976a(r0, r1)
            int r3 = r3.f89466b
            r0 = -1
            if (r3 == r0) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r2.m111477d(r3)
        L_0x0035:
            r2.mo87791e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment.onNotificationIndicatorEvent(com.ss.android.ugc.aweme.notice.api.bean.g):void");
    }

    /* renamed from: b */
    private final void m111472b(int i) {
        if (i == 2) {
            C34315c.m110984c(2);
        } else if (i == 26) {
            C34315c.m110984c(6, 14, 26);
        } else if (i != 36) {
            C34315c.m110984c(i);
        } else {
            this.f89944r = C34315c.m110974a(12);
            C34315c.m110984c(7, 3, 6, 9, 2, 43, 21, 14, 12, 13, 47, 62, 46, 37, 26, 1000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (com.p280ss.android.ugc.aweme.notice.api.C34315c.m110982b(101) != false) goto L_0x003d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111477d(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x001a
            r4.m111485p()
            return
        L_0x001a:
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 99
            r3 = 0
            r1[r3] = r2
            boolean r1 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110982b(r1)
            if (r1 == 0) goto L_0x0029
            return
        L_0x0029:
            if (r5 != 0) goto L_0x003e
            boolean r1 = m111486q()
            if (r1 != 0) goto L_0x003d
            int[] r0 = new int[r0]
            r1 = 101(0x65, float:1.42E-43)
            r0[r3] = r1
            boolean r0 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110982b(r0)
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            return
        L_0x003e:
            r4.m111476c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment.m111477d(boolean):void");
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.f89948v = true;
            this.f89947u.decrementAndGet();
            C34647a.m111928a(getContext(), exc);
            MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
            if (musNewNotificationAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            if (musNewNotificationAdapter.f67566v) {
                MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
                if (musNewNotificationAdapter2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter2.mo66516d(false);
                MusNewNotificationAdapter musNewNotificationAdapter3 = this.f89933f;
                if (musNewNotificationAdapter3 == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter3.notifyDataSetChanged();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
            C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo87788a((int) R.id.deb)).mo25939d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo87788a((int) R.id.deb);
            C7573i.m23582a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            ((RecyclerView) mo87788a((int) R.id.cxi)).mo5541b(0);
            mo87792f();
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isViewValid()) {
            if (!z) {
                MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
                if (musNewNotificationAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                if (!C6307b.m19566a((Collection<T>) musNewNotificationAdapter.mo62312a())) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87788a((int) R.id.d9u);
                    C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh_layout");
                    if (!swipeRefreshLayout.mRefreshing) {
                        onRefresh();
                    }
                }
            }
            mo87791e();
            if (!z) {
                ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logEnterPage("message");
            }
            m111474b(!z);
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f89938l;
            if (analysisStayTimeFragmentComponent == null) {
                C7573i.m23583a("mStayTimeFragmentComponent");
            }
            analysisStayTimeFragmentComponent.mo87920a(z);
            if (!z && C34439a.f89873b.getEnablePushGuide() != 0) {
                NotificationPushGuide notificationPushGuide = this.f89949w;
                if (notificationPushGuide != null) {
                    notificationPushGuide.mo86880a();
                }
            }
        }
    }

    /* renamed from: c */
    private final void m111475c(int i) {
        String valueOf;
        int i2;
        if (i <= 0) {
            DmtTextView dmtTextView = (DmtTextView) mo87788a((int) R.id.dxu);
            C7573i.m23582a((Object) dmtTextView, "tv_message_count");
            dmtTextView.setVisibility(8);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) mo87788a((int) R.id.dxu);
            C7573i.m23582a((Object) dmtTextView2, "tv_message_count");
            if (i > 99) {
                valueOf = this.f89946t;
            } else {
                valueOf = String.valueOf(i);
            }
            dmtTextView2.setText(valueOf);
            if (!C32264a.m104778b() || C34637f.m111897a()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            ImageView imageView = (ImageView) mo87788a((int) R.id.dxt);
            C7573i.m23582a((Object) imageView, "tv_message_box");
            imageView.setVisibility(i2);
            DmtTextView dmtTextView3 = (DmtTextView) mo87788a((int) R.id.dxu);
            C7573i.m23582a((Object) dmtTextView3, "tv_message_count");
            dmtTextView3.setVisibility(i2);
            m111476c(false);
        }
        DmtTextView dmtTextView4 = (DmtTextView) mo87788a((int) R.id.dxu);
        C7573i.m23582a((Object) dmtTextView4, "tv_message_count");
        m111473b((View) dmtTextView4);
        ImageView imageView2 = (ImageView) mo87788a((int) R.id.dxt);
        C7573i.m23582a((Object) imageView2, "tv_message_box");
        m111473b((View) imageView2);
    }

    /* renamed from: a */
    public final void mo87789a(View view) {
        if (isViewValid()) {
            if (this.f89942p == null) {
                Context context = getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "this.context!!");
                this.f89942p = new C34515a(context, this);
                C34515a aVar = this.f89942p;
                if (aVar != null) {
                    aVar.mo87828a(this.f89943q);
                }
                C34515a aVar2 = this.f89942p;
                if (aVar2 != null) {
                    aVar2.setOnDismissListener(new C34491p(this));
                }
            }
            C34515a aVar3 = this.f89942p;
            if (aVar3 != null) {
                aVar3.showAsDropDown(view);
            }
            View a = mo87788a((int) R.id.e_j);
            C7573i.m23582a((Object) a, "v_title_line");
            a.setVisibility(0);
            ImageView imageView = (ImageView) mo87788a((int) R.id.bd3);
            C7573i.m23582a((Object) imageView, "iv_title_dot");
            imageView.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) mo87788a((int) R.id.b9a), "rotation", new float[]{0.0f, 180.0f});
            C7573i.m23582a((Object) ofFloat, "animator");
            ofFloat.setDuration(200);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo87790a(C34355d dVar) {
        C7573i.m23587b(dVar, "struct");
        this.f89945s = dVar.f89528a;
        m111480k().f90154a = this.f89945s;
        MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
        if (musNewNotificationAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musNewNotificationAdapter.mo87820c(this.f89945s);
        if (this.f89945s == 36) {
            DmtTextView dmtTextView = (DmtTextView) mo87788a((int) R.id.dvd);
            C7573i.m23582a((Object) dmtTextView, "tv_group_title");
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            dmtTextView.setText(context.getString(R.string.co5));
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) mo87788a((int) R.id.dvd);
            C7573i.m23582a((Object) dmtTextView2, "tv_group_title");
            Context context2 = getContext();
            if (context2 == null) {
                C7573i.m23580a();
            }
            dmtTextView2.setText(context2.getString(dVar.f89529b));
        }
        m111471a(dVar.f89531d, dVar.f89532e, dVar.f89533f);
        m111483n();
        C34515a aVar = this.f89942p;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo87782a(Exception exc, boolean z) {
        this.f89947u.decrementAndGet();
        if (this.f89948v) {
            mo87792f();
        } else {
            m111490u();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        C34615d.m111862b(view.getContext());
        m111481l();
        onRefresh();
    }

    /* renamed from: a */
    private final void m111470a(int i, int i2) {
        if (isViewValid()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!f.isLogin()) {
                m111485p();
                return;
            }
            if (i2 < 0) {
                m111485p();
            }
            C34315c.m110976a(i, i2);
            m111475c(i2);
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<MusNotice> list, boolean z) {
        if (isViewValid()) {
            if (C6307b.m19566a((Collection<T>) list)) {
                z = false;
            }
            if (!z) {
                m111487r();
            } else {
                MusNewNotificationAdapter musNewNotificationAdapter = this.f89933f;
                if (musNewNotificationAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                musNewNotificationAdapter.ai_();
            }
            MusNewNotificationAdapter musNewNotificationAdapter2 = this.f89933f;
            if (musNewNotificationAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            musNewNotificationAdapter2.mo61577b(list);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            this.f89947u.incrementAndGet();
            m111478g().mo87849e();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.aef, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…on_new, container, false)");
        inflate.setBackgroundColor(getResources().getColor(R.color.aye));
        return inflate;
    }

    /* renamed from: a */
    private final void m111471a(int i, int i2, int i3) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        MtEmptyView a = MtEmptyView.m31657a((Context) activity);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        a.setStatus(new C10806a(activity2).mo25985a(i3).mo25990b(i).mo25993c(i2).f29135a);
        FragmentActivity activity3 = getActivity();
        if (activity3 == null) {
            C7573i.m23580a();
        }
        C10805b bVar = new C10806a(activity3).mo25990b((int) R.string.bxe).mo25991b("").f29135a;
        C10803a a2 = C10803a.m31631a((Context) getActivity()).mo25953a().mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new C34490o(this));
        if (!C34637f.m111897a()) {
            a2.mo25963b((View) a);
        } else {
            a2.mo25961a(bVar);
        }
        ((DmtStatusView) mo87788a((int) R.id.dea)).setBuilder(a2);
    }
}
