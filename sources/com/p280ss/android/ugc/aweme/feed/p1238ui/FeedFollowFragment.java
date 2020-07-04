package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28133af;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.event.C28335r;
import com.p280ss.android.ugc.aweme.feed.guide.C28393i;
import com.p280ss.android.ugc.aweme.feed.guide.C28395k;
import com.p280ss.android.ugc.aweme.feed.listener.C28521f;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28545a;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C28576a;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28454h;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28461n;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28462o;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.panel.C28630o;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p280ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment;
import com.p280ss.android.ugc.aweme.follow.p1259b.C29444b;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.C29457e;
import com.p280ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p280ss.android.ugc.aweme.login.p1371a.C32646b;
import com.p280ss.android.ugc.aweme.main.C32958db;
import com.p280ss.android.ugc.aweme.main.C33013g;
import com.p280ss.android.ugc.aweme.metrics.C33274p;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40959f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment */
public class FeedFollowFragment extends BaseFeedListFragment implements C28133af, C28395k, C28521f, C33013g {

    /* renamed from: k */
    public C28630o f75672k = new C28630o("homepage_follow", 1);

    /* renamed from: l */
    C28576a f75673l = null;

    /* renamed from: s */
    private int f75674s = -1;

    /* renamed from: t */
    private C28393i f75675t;

    /* renamed from: u */
    private C28723c f75676u;

    /* renamed from: v */
    private boolean f75677v = false;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$a */
    class C28721a extends C28723c<C28454h> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73827a() {
            ((C28454h) this.f75682b).mo66536a(new C28461n(6));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo73834c() {
            return ((C28454h) this.f75682b).mo72193g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo73835d() {
            return ((C28454h) this.f75682b).mo72192f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo73833b() {
            return ((C28454h) this.f75682b).mo56976a(Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73828a(int i) {
            ((C28454h) this.f75682b).f75040e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73829a(C28467s sVar) {
            ((C28454h) this.f75682b).f75038a = sVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo73832b(boolean z) {
            ((C28454h) this.f75682b).mo72189a(z);
            ((C28454h) this.f75682b).mo56976a(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73831a(boolean z) {
            ((C28454h) this.f75682b).f75039d = true;
        }

        C28721a(C28454h hVar) {
            super(hVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73830a(String str, String str2, String str3) {
            ((C28454h) this.f75682b).mo56976a(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), str, str2, str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$b */
    class C28722b extends C28723c<C28462o> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73828a(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73827a() {
            ((C28462o) this.f75682b).mo66536a(new C29452a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo73834c() {
            return ((C28462o) this.f75682b).mo72201f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo73835d() {
            return ((C28462o) this.f75682b).mo72200e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo73833b() {
            C34196c.m110395a(C22704b.f60414c).mo86925a(((C28462o) this.f75682b).mo72202g());
            return ((C28462o) this.f75682b).mo56976a(Integer.valueOf(4), C29457e.m96948a(4, 2, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75461a(C34196c.m110395a(C22704b.f60414c).mo86924a()).mo75459a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73829a(C28467s sVar) {
            ((C28462o) this.f75682b).f75060a = sVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73831a(boolean z) {
            ((C28462o) this.f75682b).f75061d = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo73832b(boolean z) {
            ((C28462o) this.f75682b).mo72199a(z, !FeedFollowFragment.this.mo73777n());
            ((C28462o) this.f75682b).mo56976a(Integer.valueOf(1), C29457e.m96948a(1, 0, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75459a());
        }

        C28722b(C28462o oVar) {
            super(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo73830a(String str, String str2, String str3) {
            ((C28462o) this.f75682b).mo56976a(Integer.valueOf(1), C29457e.m96948a(1, 0, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75462b(str).mo75463c(str2).mo75464d(str3).mo75459a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c */
    abstract class C28723c<T extends C25674b> {

        /* renamed from: b */
        public T f75682b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo73827a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo73828a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo73829a(C28467s sVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo73830a(String str, String str2, String str3);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo73831a(boolean z);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo73832b(boolean z);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo73833b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract boolean mo73834c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract boolean mo73835d();

        C28723c(T t) {
            this.f75682b = t;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: c */
    public final Fragment mo72129c() {
        return this;
    }

    /* renamed from: r */
    public final String mo73823r() {
        return "FeedFollowFragment";
    }

    /* renamed from: s */
    public final String mo73825s() {
        return "homepage_follow";
    }

    /* renamed from: A */
    private boolean m94507A() {
        return this.f75676u.mo73833b();
    }

    /* renamed from: d */
    public final void mo72130d() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f75582e;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo74381f();
        }
    }

    /* renamed from: e */
    public final void mo72131e() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f75582e;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo74380e();
        }
    }

    /* renamed from: f */
    public final boolean mo72228f() {
        return this.f75676u.mo73835d();
    }

    /* renamed from: g */
    public final boolean mo67746g() {
        m94508B();
        return super.mo67746g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C25674b mo73773i() {
        return this.f75676u.f75682b;
    }

    /* renamed from: m */
    public final void mo73776m() {
        this.f75672k.mo73392bm();
    }

    /* renamed from: o */
    public final C28130ac mo73816o() {
        return this.f75672k.mo71903ai();
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C.append(C23280a.f61314c, this.f75672k);
        return C;
    }

    /* renamed from: a */
    public final void mo67659a() {
        m94508B();
        m94507A();
        if (C28548b.m93760b()) {
            C28545a.m93751b();
        }
    }

    /* renamed from: b */
    public final boolean mo72128b() {
        return SuggestionFriendsEntranceTypeExperiment.shouldShowInFeeds();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo73774j() {
        this.f75676u.mo73831a(true);
        return m94507A();
    }

    /* renamed from: k */
    public final boolean mo67749k() {
        if (this.f75672k == null || !this.f75672k.mo73355aQ()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final void mo73821p() {
        this.f75587j.setRefreshing(true);
        mo73772d_(false);
    }

    /* renamed from: q */
    public final int mo73822q() {
        if (this.f75672k != null) {
            return this.f75672k.mo73384be();
        }
        return 0;
    }

    /* renamed from: B */
    private void m94508B() {
        if (C6399b.m19946v() && this.f75586i != null) {
            this.f75676u.mo73828a(mo73822q());
        }
    }

    /* renamed from: y */
    private boolean m94511y() {
        if (this.f75674s != 0 || C6861a.m21337f().getCurUser().getFollowingCount() <= 0 || !this.f75676u.mo73834c()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private static void m94512z() {
        C34315c.m110984c(5);
        C42961az.m136380a(new C34314g(5));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f75672k.mo67634n();
        if (this.f75673l != null) {
            this.f75673l.mo73288a();
        }
    }

    /* renamed from: D */
    private C28723c m94509D() {
        if (this.f75676u == null) {
            if (SmartFeedExperiment.isEnabled()) {
                this.f75676u = new C28722b(new C28462o());
            } else {
                this.f75676u = new C28721a(new C28454h(this));
            }
        }
        return this.f75676u;
    }

    public void onResume() {
        super.onResume();
        if (this.f75674s == -1) {
            this.f75674s = C6861a.m21337f().getCurUser().getFollowingCount();
        }
        if (this.mUserVisibleHint && isResumed() && this.f75687p != null && !this.f75687p.mHidden && C43051dc.m136580a()) {
            C28580o.m93830a(PAGE.FOLLOW);
            new C33274p().mo85304a("homepage_follow").mo85252e();
        }
        if (this.f75677v) {
            this.f75672k.mo67628g();
            this.f75677v = false;
        }
    }

    @C7709l
    public void receiveJumpToRecord(C40959f fVar) {
        this.f75677v = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ View mo73813b(View view) {
        return this.f75675t.mo72032a();
    }

    @C7709l
    public void onRefreshFollowEvent(C29444b bVar) {
        mo73772d_(false);
    }

    /* renamed from: c */
    static final /* synthetic */ View m94510c(View view) {
        return new DmtLoadingLayout(view.getContext());
    }

    @C7709l
    public void onLoginEvent(C32646b bVar) {
        if (this.f75675t != null) {
            this.f75675t.mo72043c();
        }
    }

    @C7709l
    public void onProfileFollow(C23661d dVar) {
        if (this.f75675t != null) {
            this.f75675t.mo72035a(dVar);
        }
    }

    /* renamed from: d */
    public final void mo73815d(boolean z) {
        super.mo73815d(z);
        this.f75675t.onPause();
        this.f75672k.mo73418m(z);
        C28571f.m93815e(Boolean.valueOf(false));
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            C42961az.m136385f(aVar);
            mo73772d_(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtStatusView mo73769a(Context context) {
        C28771ad adVar = new C28771ad(context);
        adVar.mo73988a(C28924m.f76247a, new C28989n(this), new C28990o(this));
        adVar.mo25766a(1);
        adVar.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.ml));
        return adVar;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f75672k.mo67627f(z);
        if (this.mUserVisibleHint && isResumed() && this.f75687p != null && !this.f75687p.mHidden) {
            C28580o.m93830a(PAGE.FOLLOW);
            new C33274p().mo85304a("homepage_follow").mo85252e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ View mo73812a(View view) {
        int i;
        C10806a aVar = new C10806a(getActivity());
        if (C6399b.m19946v()) {
            i = R.drawable.b7a;
        } else {
            i = R.drawable.b7_;
        }
        C10805b bVar = aVar.mo25985a(i).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                FeedFollowFragment.this.mo73772d_(false);
            }
        }).f29135a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(bVar);
        return dmtDefaultView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r4.mo25941e() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3.f75676u.mo73834c() == false) goto L_0x004f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73814c(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.mUserVisibleHint
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.isViewValid()
            if (r0 != 0) goto L_0x000b
            goto L_0x0058
        L_0x000b:
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f.m93815e(r1)
            com.ss.android.ugc.aweme.feed.guide.i r1 = r3.f75675t
            r1.onResume()
            super.mo73814c(r4)
            r1 = 0
            if (r4 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.feed.panel.o r4 = r3.f75672k
            r4.mo67651u()
            goto L_0x0054
        L_0x0024:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r4 = r3.mo73771b(r1)
            boolean r2 = r3.m94511y()
            if (r2 != 0) goto L_0x0049
            int[] r0 = new int[r0]
            r2 = 5
            r0[r1] = r2
            boolean r0 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110982b(r0)
            if (r0 != 0) goto L_0x0049
            if (r4 == 0) goto L_0x0041
            boolean r4 = r4.mo25941e()
            if (r4 == 0) goto L_0x004f
        L_0x0041:
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c r4 = r3.f75676u
            boolean r4 = r4.mo73834c()
            if (r4 == 0) goto L_0x004f
        L_0x0049:
            r3.mo73772d_(r1)
            m94512z()
        L_0x004f:
            com.ss.android.ugc.aweme.feed.panel.o r4 = r3.f75672k
            r4.mo73362aX()
        L_0x0054:
            r3.mo73840e(r1)
            return
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment.mo73814c(boolean):void");
    }

    /* renamed from: d_ */
    public final boolean mo73772d_(boolean z) {
        if (this.f75675t != null) {
            this.f75675t.mo72040b();
        }
        C42961az.m136380a(new C28335r(false));
        if (!C6861a.m21337f().isLogin()) {
            this.f75672k.ae_();
            C42961az.m136380a(new C28309ae("HOME"));
            return false;
        } else if (!super.mo73772d_(z)) {
            return false;
        } else {
            m94508B();
            this.f75676u.mo73832b(z);
            this.f75674s = C6861a.m21337f().getCurUser().getFollowingCount();
            if (C28548b.m93760b()) {
                C28545a.m93751b();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo73770a(C10803a aVar) {
        this.f75675t = BusinessComponentServiceUtils.getBusinessBridgeService().mo61468a(this, mo73843v(), this);
        this.f75672k.f75442a = this.f75675t;
        this.f75584g.mo60699a(false, (int) C9738o.m28708b((Context) getActivity(), 49.0f), (int) C9738o.m28708b((Context) getActivity(), 113.0f));
        this.f75587j = new C32958db(this.f75584g);
        this.f75672k.mo73326a((C0935e) new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (C28548b.m93760b()) {
                    boolean z = true;
                    if (i != 0) {
                        if (i > 0) {
                            try {
                                if (i == FeedFollowFragment.this.f75672k.mo71886W().getCount() - 1) {
                                }
                            } catch (Exception unused) {
                            }
                        }
                        z = false;
                    }
                    C28571f.m93813c(Boolean.valueOf(z));
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c r0 = r4.m94509D()
            r4.f75676u = r0
            super.onViewCreated(r5, r6)
            r0 = 0
            r4.mo73840e(r0)
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = new com.ss.android.ugc.aweme.feed.param.FeedParam
            r0.<init>()
            java.lang.String r1 = "homepage_follow"
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setEventType(r1)
            r1 = 1
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setPageType(r1)
            java.lang.String r2 = "follow_button"
            com.ss.android.ugc.aweme.feed.param.FeedParam r0 = r0.setPreviousPagePosition(r2)
            com.ss.android.ugc.aweme.feed.panel.o r2 = r4.f75672k
            r2.mo73322a(r0)
            com.ss.android.ugc.aweme.feed.panel.o r0 = r4.f75672k
            r0.mo67605a(r5, r6)
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f75672k
            r5.mo73491a(r4)
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f75672k
            r5.f75443b = r4
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f75672k
            r5.mo67609a(r4)
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f75672k
            r5.f75315J = r4
            com.ss.android.ugc.aweme.common.e.b r5 = r4.f75586i
            com.ss.android.ugc.aweme.feed.panel.o r6 = r4.f75672k
            r5.mo66537a(r6)
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c r5 = r4.f75676u
            com.ss.android.ugc.aweme.feed.panel.o r6 = r4.f75672k
            r5.mo73829a(r6)
            com.ss.android.ugc.aweme.common.e.b r5 = r4.f75586i
            com.ss.android.ugc.aweme.feed.panel.o r6 = r4.f75672k
            r5.mo66568a(r6)
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c r5 = r4.f75676u
            r5.mo73827a()
            r4.m94508B()
            android.support.v4.app.Fragment r5 = r4.f75687p
            boolean r6 = r5 instanceof com.p280ss.android.ugc.aweme.main.C33055k
            r0 = 0
            if (r6 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.main.k r5 = (com.p280ss.android.ugc.aweme.main.C33055k) r5
            com.ss.android.ugc.aweme.homepage.api.data.a r5 = r5.mo84457e()
            if (r5 == 0) goto L_0x0078
            java.lang.String r6 = r5.mo79697a()
            java.lang.String r2 = r5.mo79698b()
            java.lang.String r5 = r5.mo79699c()
            goto L_0x007b
        L_0x0078:
            r5 = r0
            r6 = r5
            r2 = r6
        L_0x007b:
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            boolean r3 = r3.isLogin()
            if (r3 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment$c r3 = r4.f75676u
            r3.mo73830a(r6, r2, r5)
            goto L_0x0090
        L_0x008b:
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f75672k
            r5.ae_()
        L_0x0090:
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.a r5 = r4.f75673l
            if (r5 != 0) goto L_0x00aa
            boolean r5 = com.p280ss.android.ugc.aweme.feed.netdetector.C28548b.m93760b()
            if (r5 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.feed.panel.y r5 = com.p280ss.android.ugc.aweme.feed.service.C28677a.m94349c()
            android.support.v4.app.FragmentActivity r6 = r4.getActivity()
            android.view.View r2 = r4.f75583f
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.a r5 = r5.mo73480a(r6, r2, r0)
            r4.f75673l = r5
        L_0x00aa:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f.m93815e(r5)
            com.p280ss.android.ugc.aweme.utils.C42970bd.m136413b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f75675t.mo72045d();
        }
    }
}
