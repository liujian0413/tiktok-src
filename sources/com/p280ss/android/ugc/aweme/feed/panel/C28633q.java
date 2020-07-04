package com.p280ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C21762l;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.widget.BaseCustomViewPager;
import com.p280ss.android.ugc.aweme.common.widget.C25758d;
import com.p280ss.android.ugc.aweme.experiment.FeedRefreshViewModel;
import com.p280ss.android.ugc.aweme.feed.C28066ac;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.feed.C28207ak;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.adapter.C28129ab;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.feed.adapter.C28174e;
import com.p280ss.android.ugc.aweme.feed.adapter.C28178g;
import com.p280ss.android.ugc.aweme.feed.adapter.C28198z;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28313ai;
import com.p280ss.android.ugc.aweme.feed.event.C28316al;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28319b;
import com.p280ss.android.ugc.aweme.feed.event.C28321d;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28327j;
import com.p280ss.android.ugc.aweme.feed.event.C28332o;
import com.p280ss.android.ugc.aweme.feed.event.C28333p;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedPreloadIndexExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C28405n;
import com.p280ss.android.ugc.aweme.feed.guide.C28409p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1228d.C28292b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28764a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28809ar;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29028z;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29001a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29003b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.p1240a.C29002a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.journey.C32250l;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.main.C32958db;
import com.p280ss.android.ugc.aweme.main.C33013g;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.main.C33055k;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.main.dialogmanager.C32987b;
import com.p280ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p280ss.android.ugc.aweme.main.guide.C33046e;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C33063a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;
import com.p280ss.android.ugc.aweme.p1072bc.C23528b;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42690a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42695c;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37620c;
import com.p280ss.android.ugc.aweme.shortvideo.C38458ar;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43166q;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.experiment.PreloadProcessDataExperiment;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.q */
public class C28633q extends C28598b implements C25675c<Aweme>, C28467s {

    /* renamed from: d */
    public static boolean f75451d;

    /* renamed from: a */
    private ViewGroup f75452a;

    /* renamed from: aA */
    private C29028z f75453aA;

    /* renamed from: aB */
    private boolean f75454aB = false;

    /* renamed from: aC */
    private int f75455aC = -1;

    /* renamed from: aD */
    private boolean f75456aD = false;

    /* renamed from: aE */
    private boolean f75457aE = false;

    /* renamed from: aF */
    private int f75458aF = 0;

    /* renamed from: az */
    private boolean f75459az;

    /* renamed from: b */
    private ViewStub f75460b;

    /* renamed from: c */
    private ViewStub f75461c;

    /* renamed from: e */
    public C28594ah f75462e;

    /* renamed from: f */
    C28409p f75463f;

    /* renamed from: g */
    public int f75464g;

    /* renamed from: h */
    public boolean f75465h = true;

    /* renamed from: i */
    DataSetObserver f75466i = new DataSetObserver() {
        public final void onChanged() {
            C28633q.this.f75464g++;
            if (!C6903bc.m21505x().mo57943c() || C28633q.this.f75464g != 2) {
                C28633q.this.mo67648r();
            }
        }
    };

    /* renamed from: j */
    String f75467j = null;

    /* renamed from: k */
    int f75468k = 0;

    /* renamed from: l */
    boolean f75469l = false;

    /* renamed from: m */
    private C28764a f75470m;

    /* renamed from: n */
    private boolean f75471n;

    /* renamed from: o */
    private C33046e f75472o;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final ViewGroup mo67596B() {
        return this.f75452a;
    }

    public final boolean av_() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo67652v() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73494a(Integer num) {
        this.f75455aC = num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73492a(C28324g gVar, ScrollSwitchStateManager scrollSwitchStateManager) throws Exception {
        FeedFragment feedFragment;
        if (C6399b.m19945u()) {
            feedFragment = (FeedFragment) scrollSwitchStateManager.mo79728d();
        } else {
            feedFragment = (FeedFragment) scrollSwitchStateManager.mo79732e();
        }
        if (feedFragment instanceof C33013g) {
            C33013g gVar2 = (C33013g) feedFragment;
            String aw_ = aw_();
            if (TextUtils.equals(gVar2.mo73825s(), aw_)) {
                mo73338a(gVar.f74650a, gVar.f74655f);
                return;
            }
            String str = f75305p;
            StringBuilder sb = new StringBuilder("dislike ignore eventType:");
            sb.append(aw_);
            C6921a.m21552a(4, str, sb.toString());
        }
    }

    /* renamed from: a */
    public void mo59099a(List<Aweme> list, boolean z) {
        boolean z2;
        if (mo73385bf()) {
            if (this.f75349ac) {
                m94176I();
            }
            m94190bJ();
            this.f75356aj = true;
            DmtStatusView n = mo73419n(false);
            if (n != null) {
                n.setVisibility(8);
            }
            if (this.f75394y == null || this.f75394y.getCount() != 1 || (!C25329c.m83231n(this.f75394y.mo67568b(0)) && !C25072c.m82575a(this.f75394y.mo67568b(0)))) {
                z2 = false;
            } else {
                list.add(0, this.f75394y.mo67568b(0));
                this.f75388s.mo74379d();
                z2 = true;
            }
            this.f75324S.setRefreshing(false);
            if (!(this.f75394y == null || this.f75389t == null || z2)) {
                C24671f.m80856f().mo63383b(this.f75394y.mo67568b(this.f75389t.getCurrentItem()));
            }
            if (!this.f75454aB) {
                if (C6311g.m19573a(list)) {
                    mo67647q();
                } else {
                    this.f75454aB = true;
                    if (n != null) {
                        n.mo25939d();
                    }
                }
            } else if (n != null) {
                n.mo25939d();
            }
            C28130ac ai = mo71903ai();
            if (ai != null && !z2) {
                ai.mo65715l();
            }
            if (!this.f75330Y && this.f75395z == 0 && !z2) {
                this.f75330Y = true;
            }
            this.f75394y.f73985a = z;
            this.f75394y.mo71589a(list);
            if (C6399b.m19944t() && mo73488bw()) {
                mo73392bm();
            }
            C28405n.m93353a().mo72140a(list);
            if (!(this.f75389t == null || this.f75395z == 0)) {
                this.f75395z = 0;
                this.f75389t.mo66753a(0, false);
            }
            mo73336a("", true);
            C42961az.m136380a(new C28327j());
            m94181bA();
            mo73344aF();
            if (C6399b.m19944t() && !z2) {
                C6903bc.m21505x().mo57939b(mo105655bv());
            }
            C42961az.m136380a(new C32987b());
            if (C6384b.m19835a().mo15292a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", C6384b.m19835a().mo15295d().is_preload_process_data, false)) {
                C43316v.m137450K().mo104940a(list);
            }
            this.f75356aj = false;
            if (m94192by()) {
                this.f75370ax.mo104308d();
            } else if (m94193bz()) {
                this.f75370ax.mo104309e();
            }
            this.f75455aC = -1;
            if (this.f75394y.getCount() == 0) {
                C21780t.m72807a().mo57890a();
            }
            if (ai instanceof C28178g) {
                ((C28178g) ai).mo71775k(mo73369as());
                return;
            }
            if (ai instanceof C28174e) {
                ((C28174e) ai).mo71770a(mo73369as());
            }
        }
    }

    /* renamed from: a */
    public final void mo67613a(String str) {
        if (mo73385bf() && C28344a.m93117h() != 0 && C28205ai.m92705a()) {
            if (TextUtils.equals(this.f75467j, str)) {
                this.f75468k++;
                if (!this.f75457aE && this.f75468k >= C28344a.m93116g() && !C28405n.m93353a().mo72141a(str)) {
                    if (this.f75456aD) {
                        this.f75469l = true;
                    } else {
                        m94196i(str);
                    }
                    if (this.f75468k == 2) {
                        C6877n.m21447a("awe_share_guide_type_log", C6869c.m21381a().mo16887a("awe_share_guide_type", C28205ai.m92707c()).mo16888b());
                    }
                } else if (this.f75468k == 2) {
                    C6877n.m21447a("awe_share_guide_type_log", C6869c.m21381a().mo16887a("awe_share_guide_type", "none").mo16888b());
                }
            } else {
                this.f75468k = 1;
                this.f75467j = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo67610a(Aweme aweme) {
        if (C29132a.m95560a()) {
            C33055k bG = m94187bG();
            if (bG != null) {
                if (C25329c.m83221d(aweme)) {
                    bG.mo84445a(false);
                } else if (!C29132a.m95569e()) {
                    bG.mo84439a();
                } else {
                    bG.mo84445a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo73493a(Aweme aweme, int i, int i2) {
        if (C29132a.m95560a() && m94187bG() != null && !C25329c.m83221d(aweme) && !C29132a.m95569e() && i > i2) {
            C29132a.m95571f();
        }
    }

    /* renamed from: by */
    private boolean m94192by() {
        if (this.f75455aC == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: bl */
    public final void mo73391bl() {
        if (this.f75463f != null) {
            this.f75463f = null;
        }
    }

    /* renamed from: k */
    public final void mo67631k() {
        this.f75392w.setViewPager(this.f75389t);
    }

    /* renamed from: bA */
    private void m94181bA() {
        if (mo73365ao()) {
            C34196c.m110395a(this.f75357ak).mo86929d();
        }
    }

    /* renamed from: bE */
    private boolean m94185bE() {
        mo73340aB();
        this.f75394y.notifyDataSetChanged();
        m94186bF();
        mo67654x();
        return false;
    }

    /* renamed from: z */
    private void m94200z() {
        if (mo73345aG()) {
            C25758d.m84611a(mo73370at());
        }
    }

    public final void aD_() {
        if (mo73385bf()) {
            this.f75388s.mo74375a();
        }
    }

    public final void aE_() {
        if (mo73385bf() && !this.f75471n) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo67647q() {
        DmtStatusView n = mo73419n(true);
        if (n != null) {
            n.mo25943g();
        }
    }

    /* renamed from: r */
    public final void mo67648r() {
        if (this.f75462e != null) {
            this.f75462e.mo73316c();
            this.f75462e = null;
        }
    }

    /* renamed from: u */
    public final void mo67651u() {
        if (!m94175E()) {
            super.mo67651u();
        }
    }

    /* renamed from: I */
    private void m94176I() {
        Context bv = mo105655bv();
        if (bv != null) {
            try {
                C24217a.m79549a().hideCommentListImmediately(bv);
            } catch (Throwable th) {
                C6921a.m21559a(th);
            }
        }
    }

    /* renamed from: bD */
    private void m94184bD() {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            C24716aj o = aH.mo71564o();
            if (o != null) {
                o.mo64603x();
            }
        }
    }

    /* renamed from: bF */
    private void m94186bF() {
        if (this.f75394y.getCount() == 3) {
            C42961az.m136380a(new C28333p("from_full_recommend"));
        }
        this.f75389t.post(new C28646v(this));
    }

    /* renamed from: bG */
    private C33055k m94187bG() {
        Fragment ay_ = ay_();
        if (ay_ == null || !(ay_.mParentFragment instanceof C33055k)) {
            return null;
        }
        return (C33055k) ay_.mParentFragment;
    }

    /* renamed from: bK */
    private boolean m94191bK() {
        if ((this.f75320O == null || !this.f75320O.mo72115d()) && (this.f75319N == null || !this.f75319N.isShowing())) {
            return false;
        }
        return true;
    }

    /* renamed from: bz */
    private boolean m94193bz() {
        boolean z;
        boolean z2 = false;
        if (this.f75455aC == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f75455aC == 2) {
            z2 = true;
        }
        return z | z2;
    }

    /* renamed from: aM */
    public final void mo73351aM() {
        if (this.f113033ay != null && mo62993e() && ax_()) {
            super.mo73351aM();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bp */
    public final boolean mo73393bp() {
        if (super.mo73393bp() || (this.f75462e != null && this.f75462e.mo73317d())) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo67633m() {
        super.mo67633m();
        if (this.f75470m != null && this.f75470m.f75873b) {
            this.f75470m.mo73985e();
        }
    }

    /* renamed from: D */
    private boolean m94174D() {
        if (!mo62993e() || this.f75394y == null || this.f75394y.getCount() <= 0 || !ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79723b("page_feed") || f75451d) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private boolean m94175E() {
        if (this.f113033ay == null || !mo62993e() || !ax_() || !ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79723b("page_feed")) {
            return true;
        }
        BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
        return false;
    }

    /* renamed from: bC */
    private void m94183bC() {
        if (ay_() != null && ay_().getActivity() != null) {
            DataCenter.m75849a(C0069x.m159a(ay_().getActivity()), (C0043i) ay_()).mo60134a("tryShowGuideView", (Object) null);
        }
    }

    /* renamed from: bH */
    private void m94188bH() {
        if (C6399b.m19944t()) {
            if (this.f75453aA == null) {
                this.f75453aA = C6903bc.m21481a(this.f113033ay);
            }
            this.f75453aA.mo73999a(mo71910am());
            if (!m94191bK()) {
                this.f75453aA.mo73998a();
            }
        }
    }

    /* renamed from: bI */
    private void m94189bI() {
        if (this.f75461c != null) {
            this.f75461c.inflate();
            this.f75461c = null;
            ViewGroup viewGroup = (ViewGroup) this.f75452a.findViewById(R.id.fa);
            if (viewGroup != null) {
                this.f75470m = new C28764a(viewGroup);
            }
        }
    }

    /* renamed from: bJ */
    private void m94190bJ() {
        this.f75459az = false;
        if (C6399b.m19944t() && this.f75470m != null && this.f75470m.f75873b && "homepage_hot".equals(aw_()) && mo71888Y() == 0) {
            this.f75470m.mo73982b();
            mo73392bm();
        }
    }

    public void ae_() {
        if (mo73385bf()) {
            m94190bJ();
            this.f75324S.setRefreshing(false);
            if (C6399b.m19944t() && mo73488bw()) {
                ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79716a(false);
            }
            if (!this.f75454aB) {
                mo67647q();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public final void mo73387bh() {
        if (mo73345aG() && MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode() && this.f75472o != null && this.f75472o.mo84739a() && !this.f75349ac && !this.f75350ad) {
            this.f75472o.mo84736a(this.f75452a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo62993e() {
        Activity activity = this.f113033ay;
        if (!(activity instanceof C33054j) || !((C33054j) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo67634n() {
        this.f75394y.unregisterDataSetObserver(this.f75466i);
        mo67648r();
        if (this.f75453aA != null) {
            this.f75453aA.mo74000b();
            this.f75453aA = null;
        }
        C24671f.m80870t().mo65844e();
        super.mo67634n();
    }

    /* renamed from: w */
    public final void mo67653w() {
        if (this.f75361ao != 4) {
            this.f75459az = true;
            m94190bJ();
            return;
        }
        if (this.f75470m == null) {
            m94189bI();
        }
        if (this.f75470m != null) {
            mo71895aa();
            mo73340aB();
            this.f75470m.mo73981a();
            this.f75459az = false;
            mo73392bm();
        }
    }

    /* renamed from: bB */
    private void m94182bB() {
        if (this.f75314I != null) {
            int count = this.f75394y.getCount();
            int a = C6384b.m19835a().mo15287a(FeedPreloadIndexExperiment.class, true, "feed_preload_idx", C6384b.m19835a().mo15295d().feed_preload_idx, 3);
            int i = count - 1;
            if (this.f75395z == i || count == 1) {
                final String aw_ = aw_();
                C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        C6907h.m21524a("hit_bottom", (Map) C22984d.m75611a().mo59973a("enter_from", aw_).f60753a);
                        return null;
                    }
                }, (Executor) C6907h.m21516a());
            }
            if (((count <= a && (this.f75395z == 1 || this.f75395z == i)) || this.f75395z == count - a) && (!C32250l.f84286c.mo83470c() || C32250l.f84285b)) {
                this.f75314I.mo67746g();
            }
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        boolean z;
        if (mo73385bf()) {
            C28198z W = mo71886W();
            if (W == null || W.getCount() != 1 || (!C25329c.m83231n(W.mo67568b(0)) && !C25072c.m82575a(W.mo67568b(0)))) {
                z = false;
            } else {
                z = true;
            }
            if (this.f75470m != null && this.f75470m.f75873b) {
                this.f75324S.setRefreshing(true);
            } else if (z) {
                aE_();
            } else if (!this.f75454aB) {
                this.f75324S.setRefreshing(false);
                DmtStatusView n = mo73419n(true);
                if (n != null) {
                    n.setVisibility(0);
                    n.mo25942f();
                }
            } else {
                this.f75324S.setRefreshing(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bg */
    public final void mo73386bg() {
        if (C32904bi.m106503h() && mo73345aG()) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
            if (this.f75320O == null || !this.f75320O.mo72115d()) {
                if ((!(this.f113033ay instanceof C33054j) || !((C33054j) this.f113033ay).isInMaskLayer()) && this.f75472o != null && this.f75472o.mo84739a() && !this.f75349ac && !this.f75350ad) {
                    this.f75472o.mo84736a(this.f75452a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo67635o() {
        if (C6399b.m19946v()) {
            m94182bB();
            return;
        }
        if (C6399b.m19947w()) {
            if ((this.f75395z == this.f75394y.getCount() - 3 || (this.f75395z == this.f75394y.getCount() - 1 && this.f75394y.getCount() <= 3)) && this.f75314I != null) {
                if (!C32250l.f84286c.mo83470c() || C32250l.f84285b) {
                    this.f75314I.mo67746g();
                }
            }
        } else if (this.f75395z == this.f75394y.getCount() - 3 && this.f75314I != null) {
            this.f75314I.mo67746g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ void mo67655y() {
        if (mo73385bf()) {
            C28130ac aL = mo73350aL();
            if (aL != null) {
                aL.mo65708a(aL.mo65711h());
                if ((this.f113033ay instanceof FragmentActivity) && mo73381bb()) {
                    C42961az.m136380a(new C28306ab(aL.mo65711h()));
                    AwemeChangeCallBack.m106765a((FragmentActivity) this.f113033ay, aL.mo65711h());
                }
                C42961az.m136380a(new C29001a(aL.mo65711h(), this.f75327V.getEventType(), this.f75327V.getPageType(), this));
            }
            if (!m94180b(aL)) {
                mo71895aa();
                mo73351aM();
                if (m93937bo() && aL != null) {
                    aL.au_();
                }
            }
        }
    }

    /* renamed from: g */
    private void mo67628g() {
        this.f75452a.setOnClickListener(C28645u.f75491a);
        Activity activity = this.f113033ay;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            AwemeChangeCallBack.m106764a(fragmentActivity, fragmentActivity, new C33063a() {
                /* renamed from: a */
                public final void mo67730a(Aweme aweme) {
                    if ((C28633q.this.f113033ay instanceof AmeActivity) && !C28633q.this.f75465h) {
                        ((AmeActivity) C28633q.this.f113033ay).tryRemoveDeeplinkBackView();
                    }
                    C28633q.this.f75465h = false;
                    if (aweme != null) {
                        C28633q.this.mo67610a(aweme);
                    }
                }
            });
        }
        this.f75324S = new C32958db(this.f75392w);
        this.f75389t.mo66629a((C0935e) new SimpleOnPageChangeListener() {

            /* renamed from: a */
            boolean f75475a;

            /* renamed from: b */
            int f75476b = -1;

            public final void onPageScrollStateChanged(int i) {
                if (i == 1) {
                    this.f75475a = false;
                }
            }

            public final void onPageSelected(int i) {
                C39330h hVar = new C39330h(10);
                hVar.f102162e = 1;
                C42961az.m136380a(hVar);
                C28633q.this.mo73493a(C28633q.this.f75394y.mo67568b(C28633q.this.f75389t.getCurrentItem()), i, this.f75476b);
                this.f75476b = i;
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (i == C28633q.this.f75395z) {
                    if (C28633q.this.f75462e != null) {
                        C28633q.this.f75462e.mo73314a((float) (-i2));
                    }
                } else if (C28633q.this.f75462e != null) {
                    C28633q.this.f75462e.mo73314a((float) (C9738o.m28709b(C28633q.this.mo105655bv()) - i2));
                }
                if (!this.f75475a) {
                    this.f75475a = true;
                    C42961az.m136380a(new C29003b(C28633q.this.mo71904aj(), C28633q.this.aw_(), C28633q.this.mo71888Y(), C28633q.this));
                }
            }
        });
        C42980bm.m136450a(this.f75327V.getEventType()).mo104687a((BaseCustomViewPager) this.f75389t);
        this.f75394y.registerDataSetObserver(this.f75466i);
        this.f75388s.mo74379d();
        this.f75388s.mo74376a(this.f75389t, this.f75392w);
        this.f75388s.setLabel("main_feed");
        if (!C6399b.m19944t()) {
            this.f75389t.setContentDescription(mo105655bv().getString(R.string.fny));
        }
        if (C6399b.m19944t() && "homepage_hot".equals(aw_()) && mo71888Y() == 0 && C6903bc.m21478S().mo57886d() && C6903bc.m21478S().mo57885c() != null) {
            mo67653w();
        }
    }

    /* renamed from: aX */
    public final void mo73362aX() {
        boolean z;
        super.mo73362aX();
        if (mo73488bw()) {
            if (mo71903ai() == null || mo71903ai().mo65709f() != 101) {
                z = false;
            } else {
                z = true;
            }
            if (z && C28066ac.m91706b(aw_())) {
                C21780t.m72807a().mo57890a();
            }
            if (C28066ac.m91705a(aw_()) || C28066ac.m91706b(aw_())) {
                C28207ak.m92713a(mo71904aj());
                if (this.f75394y.getCount() <= 0) {
                    C21780t.m72807a().mo57890a();
                    C21780t.m72807a().mo57890a();
                } else {
                    C21780t.m72807a().mo57890a();
                }
            }
            if (!(this.f75394y == null || this.f75389t == null)) {
                this.f75394y.mo71585a(this.f75395z, false);
                if (!C43268o.m137250H()) {
                    mo73367aq().mo104939a((C34976f) this.f75328W);
                    C43238k.m137170a().mo104975a((C34976f) this.f75328W);
                } else {
                    C44960f aK = mo73349aK();
                    if (aK != null) {
                        aK.mo71663a((C34976f) this.f75328W);
                    }
                }
                Aweme b = this.f75394y.mo67568b(this.f75389t.getCurrentItem());
                if ((this.f113033ay instanceof FragmentActivity) && mo73381bb()) {
                    C42961az.m136380a(new C28306ab(b));
                    AwemeChangeCallBack.m106765a((FragmentActivity) this.f113033ay, b);
                }
                C28130ac aH = mo73346aH();
                if (m93937bo() && aH != null) {
                    aH.mo71530c(1);
                }
                mo67617b(b);
            }
            if (C28066ac.m91705a(aw_())) {
                m94183bC();
            }
            if (this.f75470m != null && this.f75470m.f75873b) {
                this.f75470m.mo73984d();
            }
        }
    }

    /* renamed from: l */
    public final void mo67632l() {
        super.mo67632l();
        m94200z();
        if (mo73488bw()) {
            if (C6399b.m19944t()) {
                if ((this.f113033ay instanceof FragmentActivity) && mo73381bb()) {
                    try {
                        FragmentActivity fragmentActivity = (FragmentActivity) this.f113033ay;
                        if (fragmentActivity.getSupportFragmentManager() != null) {
                            C33055k kVar = (C33055k) TabChangeManager.m106432a(fragmentActivity).mo84577b("HOME");
                            if (!(kVar == null || ay_() == null || !ay_().equals(kVar.mo84447b()))) {
                                if (this.f75470m != null && this.f75470m.f75873b && ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79723b("page_feed")) {
                                    this.f75470m.mo73984d();
                                }
                                if (!C43268o.m137250H()) {
                                    mo73367aq().mo104939a((C34976f) this.f75328W);
                                    C43238k.m137170a().mo104975a((C34976f) this.f75328W);
                                } else {
                                    C44960f aK = mo73349aK();
                                    if (aK != null) {
                                        aK.mo71663a((C34976f) this.f75328W);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (!C43268o.m137250H()) {
                mo73367aq().mo104939a((C34976f) this.f75328W);
            } else {
                C44960f aK2 = mo73349aK();
                if (aK2 != null) {
                    aK2.mo71663a((C34976f) this.f75328W);
                }
            }
            if (m94174D()) {
                mo73416k(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo67654x() {
        boolean z;
        super.mo67654x();
        Aweme aj = mo71904aj();
        if (this.f75472o != null) {
            this.f75472o.mo84738a(aj);
        }
        C28207ak.m92713a(aj);
        C28130ac aH = mo73346aH();
        boolean z2 = false;
        if (aH != null) {
            if (mo71903ai().mo65709f() == 101) {
                z = true;
            } else {
                z = false;
            }
            if (aH.mo65716m() == null) {
                C21780t.m72807a().mo57890a();
                C21780t.m72808a(false).mo57896b();
            }
            z2 = z;
        } else {
            C21780t.m72807a().mo57890a();
            C21780t.m72808a(false).mo57896b();
        }
        if ((!C28066ac.m91706b(aw_()) || !C28207ak.f74308a) && this.f75368av) {
            C21780t.m72807a().mo57890a();
        }
        if (z2 && C28066ac.m91706b(aw_()) && this.f75368av) {
            C21780t.m72807a().mo57890a();
        }
        m94188bH();
        m94199k(aj);
        this.f75458aF = this.f75395z;
    }

    /* renamed from: d */
    public final void mo67623d(boolean z) {
        this.f75471n = z;
    }

    @C7709l(mo20401b = true)
    public void onSettingSyncDone(C37620c cVar) {
        m94200z();
    }

    @C7709l
    public void onShowSwipeUpGuideEvent(C28316al alVar) {
        m94183bC();
    }

    @C7709l
    public void onRefreshEvent(C42695c cVar) {
        this.f75455aC = cVar.f110973a;
    }

    /* renamed from: b */
    private static boolean m94180b(C28130ac acVar) {
        if (acVar == null || acVar.mo65709f() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private static void m94199k(Aweme aweme) {
        String str;
        if (aweme == null) {
            str = "";
        } else {
            str = aweme.getAid();
        }
        C38458ar.m122944a(str);
    }

    /* renamed from: e */
    public final void mo73402e(Aweme aweme) {
        if (!m94175E()) {
            super.mo73402e(aweme);
        }
    }

    /* renamed from: j */
    private boolean m94197j(Aweme aweme) {
        if (aweme == null || this.f75315J == null || !this.f75315J.mo67739a(aweme)) {
            return true;
        }
        return m94185bE();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo67617b(Aweme aweme) {
        if (mo62993e() && ax_()) {
            super.mo67617b(aweme);
        }
    }

    /* renamed from: b_ */
    public final void mo67620b_(String str) {
        if (mo73385bf() && !m94198j(str)) {
            super.mo67620b_(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo73399d(int i) {
        super.mo73399d(i);
        if (C28066ac.m91705a(aw_())) {
            C24671f.m80870t().mo65841a(this, i, mo71904aj());
        }
    }

    /* renamed from: e */
    public final void mo67624e(Exception exc) {
        if (mo73385bf()) {
            C22814a.m75245a(this.f113033ay, exc, R.string.anx);
        }
    }

    /* renamed from: f */
    public final void mo67627f(boolean z) {
        super.mo67627f(z);
        if (z && this.f75470m != null && this.f75470m.f75873b) {
            this.f75470m.mo73984d();
        }
    }

    /* renamed from: k */
    public final void mo73416k(boolean z) {
        if (!m94175E()) {
            super.mo73416k(z);
        }
    }

    @C7709l
    public void onBackupUpdateEvent(C28319b bVar) {
        Map<String, AwemeStatisticsBackup> map = bVar.f74642a;
        if (mo73345aG() && map != null && map.size() != 0) {
            m94194c((C7326g<C28130ac>) new C28644t<C28130ac>(map, bVar));
        }
    }

    @C7709l
    public void onShareDialogEvent(C28313ai aiVar) {
        if (mo73345aG()) {
            boolean z = true;
            if (aiVar.f74628a != 1) {
                z = false;
            }
            this.f75457aE = z;
            if (this.f75457aE) {
                this.f75468k = 0;
                this.f75467j = null;
            }
        }
    }

    @C7709l
    public void onVisionSearchSwitchEvent(C23528b bVar) {
        if (mo73345aG() && this.f75389t != null) {
            m94194c((C7326g<C28130ac>) new C28647w<C28130ac>(bVar));
        }
    }

    /* renamed from: a */
    private void m94177a(View view) {
        this.f75452a = (ViewGroup) view.findViewById(R.id.ajj);
        this.f75460b = (ViewStub) view.findViewById(R.id.dcg);
        this.f75461c = (ViewStub) view.findViewById(R.id.fb);
    }

    /* renamed from: c */
    private void m94194c(C7326g<C28130ac> gVar) {
        if (this.f75389t != null) {
            int childCount = this.f75389t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C28130ac acVar = (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
                if (acVar != null) {
                    try {
                        gVar.accept(acVar);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private boolean m94198j(String str) {
        if (this.f75315J == null || !this.f75315J.mo67740a(str)) {
            return true;
        }
        return m94185bE();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo73495h(String str) {
        if (!C6307b.m19566a((Collection<T>) this.f75394y.mo71593b()) && !TextUtils.isEmpty(str) && this.f75394y.mo71592a(str)) {
            mo73343aE();
            mo73357aS();
            m94186bF();
            mo73399d(this.f75389t.getCurrentItem());
        }
    }

    public void onAwesomeSplashEvent(C25053a aVar) {
        super.onAwesomeSplashEvent(aVar);
        if (aVar.f66130a == 4 && C6399b.m19944t() && this.f75459az && "homepage_hot".equals(aw_()) && mo71888Y() == 0 && C6903bc.m21478S().mo57886d() && C6903bc.m21478S().mo57885c() != null) {
            mo67653w();
        }
    }

    @C7709l
    public void onDeleteAwemeEvent(C28322e eVar) {
        if (TextUtils.equals(aw_(), "homepage_hot")) {
            if (eVar.f74649a != null) {
                String str = f75305p;
                StringBuilder sb = new StringBuilder("onDeleteAwemeEvent");
                sb.append(eVar.f74649a.getAid());
                C6921a.m21563c(4, str, sb.toString());
            }
            m94197j(eVar.f74649a);
        }
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        if (gVar.f74654e == this.f113033ay.hashCode()) {
            if (FixDislikeEventSetting.isOpen()) {
                mo73335a((C7326g<ScrollSwitchStateManager>) new C28643s<ScrollSwitchStateManager>(this, gVar));
            } else {
                mo73338a(gVar.f74650a, gVar.f74655f);
            }
        }
    }

    @C7709l
    public void onFakeLikeEvent(C28332o oVar) {
        if (this.f75393x != null && oVar != null && TextUtils.equals(aw_(), oVar.f74660a)) {
            this.f75393x.mo66634a((float) (C9738o.m28691a(mo105655bv()) / 2), (float) (C9738o.m28709b(mo105655bv()) / 2));
        }
    }

    @C7709l
    public void onVideoCleanModeEvent(C29002a aVar) {
        C28130ac aL = mo73350aL();
        if (aL != null && aVar.f76392b != null && aL.mo65711h() != null && aVar.f76392b.getAid().equals(aL.mo65711h().getAid())) {
            aL.mo71536f(aVar.f76391a);
        }
    }

    /* renamed from: i */
    private void m94196i(String str) {
        String str2;
        try {
            MobClick value = new MobClick().setEventName("share_highlight").setLabelName("homepage_hot").setValue(str);
            JSONObject jSONObject = new JSONObject();
            String str3 = "repeat";
            if (C28344a.m93117h() == 1) {
                str2 = "double";
            } else {
                str2 = "triple";
            }
            C6907h.onEvent(value.setJsonObject(jSONObject.put(str3, str2)));
        } catch (JSONException unused) {
        }
        C28405n.m93353a().mo72142b(str);
        C28129ab aJ = mo73348aJ();
        if (aJ != null) {
            aJ.mo71639K();
            C28205ai.m92706b();
        }
    }

    /* renamed from: b */
    public void mo59107b(Exception exc) {
        if (mo73385bf()) {
            if (!C6399b.m19944t() || !"homepage_hot".equals(aw_()) || mo71888Y() != 0 || !(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 13315) {
                m94190bJ();
                this.f75388s.mo74377b();
                return;
            }
            if (C43122ff.m136767b()) {
                C6877n.m21407a("ftc_show_algo_free", "", null);
            }
            C6903bc.m21478S().mo57882a(new C21762l() {
                /* renamed from: a */
                public final void mo58109a() {
                    if (!C6903bc.m21478S().mo57886d() || C6903bc.m21478S().mo57885c() == null) {
                        mo58110a(0);
                        return;
                    }
                    C28633q.this.f75388s.mo74379d();
                    C28633q.this.f75394y.mo71589a((List<Aweme>) new ArrayList<Aweme>());
                    C6877n.m21407a("compliance_api_status", "", C6869c.m21381a().mo16887a("type", "/aweme/v1/algo/free/settings/").mo16885a("status", Integer.valueOf(0)).mo16888b());
                    C28633q.this.mo67653w();
                }

                /* renamed from: a */
                public final void mo58110a(int i) {
                    C6877n.m21407a("compliance_api_status", "", C6869c.m21381a().mo16885a("error_message", Integer.valueOf(i)).mo16887a("type", "/aweme/v1/algo/free/settings/").mo16885a("status", Integer.valueOf(1)).mo16888b());
                    C28633q.this.f75388s.mo74377b();
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        if (mo73385bf()) {
            this.f75324S.setRefreshing(false);
            if (this.f75394y.getCount() == 0) {
                DmtStatusView n = mo73419n(true);
                if (n != null) {
                    n.setVisibility(0);
                    n.mo25944h();
                }
                return;
            }
            C10761a.m31399c((Context) this.f113033ay, (int) R.string.c43).mo25750a();
        }
    }

    /* renamed from: m */
    public final void mo73418m(boolean z) {
        super.mo73418m(z);
        mo73400d((String) null);
        if (!C43268o.m137250H()) {
            mo73354aP();
        } else {
            C44960f aK = mo73349aK();
            if (aK != null) {
                aK.mo71672ad();
            }
        }
        C43238k.m137170a().mo104982d();
        mo73380ba();
        mo73363aY();
        mo67648r();
        C21780t.m72807a().mo57890a();
        C21780t.m72807a().mo57896b();
        if (this.f75470m != null && this.f75470m.f75873b) {
            this.f75470m.mo73985e();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onVPAOptOutEvent(C28809ar arVar) {
        if (TextUtils.equals(aw_(), "homepage_hot")) {
            boolean z = false;
            ArrayList arrayList = new ArrayList();
            for (int i = this.f75395z + 1; i < this.f75394y.getCount(); i++) {
                if (this.f75394y.mo67568b(i).getUploadMiscInfoStruct().vpaInfo.getInfoBarType() != 0) {
                    arrayList.add(this.f75394y.mo67568b(i).getAid());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f75315J != null && this.f75315J.mo67740a(str)) {
                    z = true;
                }
            }
            if (z) {
                this.f75394y.notifyDataSetChanged();
            }
            arrayList.clear();
            if (this.f75394y.getCount() > this.f75395z + 1) {
                C42961az.m136380a(new C42690a());
            }
        }
    }

    /* renamed from: a */
    public final void mo73490a(Bundle bundle) {
        super.mo73490a(bundle);
        if (this.f75472o == null) {
            this.f75472o = new C33046e();
        }
        if ((this.f113033ay instanceof FragmentActivity) && this.f113033ay != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.f113033ay;
            ((FeedRefreshViewModel) C0069x.m159a(fragmentActivity).mo147a(FeedRefreshViewModel.class)).mo71127a().observe(fragmentActivity, new C28642r(this));
        }
    }

    /* renamed from: a_ */
    public void mo59105a_(Exception exc) {
        boolean z;
        if (mo73385bf()) {
            C28198z W = mo71886W();
            if (W == null || W.getCount() != 1 || (!C25329c.m83231n(W.mo67568b(0)) && !C25072c.m82575a(W.mo67568b(0)))) {
                z = false;
            } else {
                z = true;
            }
            C28434i.m93484m();
            if (!C6399b.m19944t() || !"homepage_hot".equals(aw_()) || mo71888Y() != 0 || !(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 13315) {
                this.f75324S.setRefreshing(false);
                m94190bJ();
                if (this.f75454aB || z) {
                    C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
                    C42961az.m136380a(new C32987b());
                } else {
                    DmtStatusView n = mo73419n(true);
                    if (n != null) {
                        try {
                            n.mo25944h();
                        } catch (RuntimeException e) {
                            C6921a.m21554a((Exception) e);
                            C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
                        }
                    }
                }
                if (this.f75355ai != null && this.f75355ai.mo95909h()) {
                    if (this.f75370ax != null) {
                        this.f75370ax.mo104304a();
                    }
                    if (this.f75369aw != null) {
                        this.f75369aw.dismiss();
                    }
                    this.f75355ai.mo95906f(false);
                }
                return;
            }
            if (C43122ff.m136767b()) {
                C6877n.m21407a("ftc_show_algo_free", "", null);
            }
            C6903bc.m21478S().mo57882a(new C21762l() {
                /* renamed from: a */
                public final void mo58109a() {
                    if (!C6903bc.m21478S().mo57886d() || C6903bc.m21478S().mo57885c() == null) {
                        mo58110a(0);
                        return;
                    }
                    C28633q.this.f75324S.setRefreshing(false);
                    C28633q.this.f75394y.mo71589a((List<Aweme>) new ArrayList<Aweme>());
                    DmtStatusView n = C28633q.this.mo73419n(false);
                    if (n != null) {
                        n.mo25939d();
                    }
                    C6877n.m21407a("compliance_api_status", "", C6869c.m21381a().mo16887a("type", "/aweme/v1/algo/free/settings/").mo16885a("status", Integer.valueOf(0)).mo16888b());
                    C28633q.this.mo67653w();
                }

                /* renamed from: a */
                public final void mo58110a(int i) {
                    C6877n.m21407a("compliance_api_status", "", C6869c.m21381a().mo16885a("error_message", Integer.valueOf(i)).mo16887a("type", "/aweme/v1/algo/free/settings/").mo16885a("status", Integer.valueOf(1)).mo16888b());
                    C28633q.this.ae_();
                }
            });
        }
    }

    @C7709l
    public void onCommentDialogEvent(C28321d dVar) {
        boolean z;
        boolean z2 = true;
        if (dVar.f74645a == 1) {
            z = true;
        } else {
            z = false;
        }
        mo73415j(z);
        if (dVar.f74645a != 1) {
            z2 = false;
        }
        this.f75456aD = z2;
        mo73409g(this.f75456aD);
        if (mo73345aG()) {
            mo73411h(this.f75456aD);
            if (!this.f75456aD && this.f75469l) {
                m94184bD();
                m94196i(this.f75467j);
                this.f75469l = false;
            }
            if (!C6399b.m19944t()) {
                Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(dVar.f74647c);
                C28130ac aH = mo73346aH();
                if (aH != null && dVar.f74645a == 0) {
                    C24716aj o = aH.mo71564o();
                    if (o != null && C43166q.m136903a(awemeById) && C24671f.m80852b().isShowCommerceAfterInteraction()) {
                        o.mo64552a(C24671f.m80852b().getDelayTimeAfterInteraction() * 1000, "passive_show");
                    } else if (o != null && C25329c.m83236s(awemeById)) {
                        o.mo64552a(C25329c.m83237t(awemeById) * 1000, "passive_show");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo73491a(C28132ae aeVar) {
        if (this.f75388s != null) {
            this.f75388s.setLoadMoreListener(aeVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67608a(C28318an anVar) {
        if (anVar.f74631a == 0 && (!mo62993e() || !ax_())) {
            return;
        }
        if (anVar.f74631a == 43) {
            Object[] objArr = (Object[]) anVar.f74632b;
            if (objArr != null && objArr.length >= 2) {
                this.f75348ab = true;
                boolean z = false;
                Aweme aweme = (Aweme) objArr[0];
                Comment comment = (Comment) objArr[1];
                if (objArr.length == 3 && objArr[2] != null) {
                    z = ((Boolean) objArr[2]).booleanValue();
                }
                mo73329a(aweme, comment, z, "click_danmu");
                return;
            }
            return;
        }
        super.mo67608a(anVar);
        if (mo73345aG()) {
            Aweme aweme2 = (Aweme) anVar.f74632b;
            int i = anVar.f74631a;
            if (i != 3) {
                if (i != 35) {
                    switch (i) {
                        case 5:
                            if (aweme2 != null) {
                                C28292b.m93052a().mo71981f(aweme2.getAid());
                                return;
                            }
                            break;
                        case 6:
                            if (aweme2 != null) {
                                C28292b.m93052a().mo71982g(aweme2.getAid());
                                return;
                            }
                            break;
                        case 7:
                            if (aweme2 != null) {
                                C28292b.m93052a().mo71976a(aweme2.getAid());
                                return;
                            }
                            break;
                    }
                } else if (aweme2 != null) {
                    C28292b.m93052a().mo71977b(aweme2.getAid());
                }
            } else if (aweme2 != null) {
                C28292b.m93052a().mo71980e(aweme2.getAid());
            }
        }
    }

    public C28633q(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public final void mo73323a(int i, Aweme aweme) {
        super.mo73323a(i, aweme);
        if (this.f75315J != null && aweme != null) {
            this.f75315J.mo67740a(aweme.getAid());
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<Aweme> list, boolean z) {
        if (!mo73385bf()) {
            C6921a.m21552a(4, "FeedFetchModel", "FullFeedFragmentPanel receive onLoadMoreResult,but invalid");
            return;
        }
        m94190bJ();
        this.f75324S.setRefreshing(false);
        this.f75394y.f73985a = z;
        if (z || this.f75471n) {
            this.f75388s.mo74379d();
        } else {
            this.f75388s.mo74378c();
        }
        final Aweme b = this.f75394y.mo67568b(this.f75389t.getCurrentItem());
        final int a = C28482e.m93604a(list, b);
        this.f75394y.mo71589a(list);
        if (!this.f75471n) {
            this.f75389t.post(new Runnable() {
                public final void run() {
                    if (a < C28633q.this.f75394y.getCount() - 1 && C28633q.this.f75389t != null && !C25329c.m83231n(b) && !C25072c.m82575a(b)) {
                        C28633q.this.f75395z = a + 1;
                        C28633q.this.f75307B = true;
                        C28633q.this.f75389t.setCurrentItemWithDefaultVelocity(C28633q.this.f75395z);
                    }
                }
            });
        }
        m94181bA();
        if (C6384b.m19835a().mo15292a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", C6384b.m19835a().mo15295d().is_preload_process_data, false)) {
            C43316v.m137450K().mo104940a(list);
        }
    }

    /* renamed from: c */
    public final void mo59110c(List<Aweme> list, boolean z) {
        if (mo73385bf()) {
            this.f75324S.setRefreshing(false);
            boolean z2 = true;
            if (z || this.f75471n) {
                if (!this.f75471n || C6307b.m19566a((Collection<T>) list) || this.f75394y.getCount() == list.size()) {
                    z2 = false;
                }
                this.f75321P = z2;
                this.f75394y.mo71589a(list);
                if (!this.f75471n) {
                    this.f75389t.post(new Runnable() {
                        public final void run() {
                            if (C28633q.this.f75389t != null) {
                                C28633q.this.f75395z = 0;
                                C28633q.this.f75307B = true;
                                C28633q.this.f75389t.mo66753a(0, false);
                            }
                        }
                    });
                }
            } else if (mo73488bw() && this.f113033ay != null && mo62993e()) {
                C10761a.m31409e((Context) this.f113033ay, (int) R.string.am0).mo25750a();
                if (this.f75389t.getCurrentItem() > 1) {
                    this.f75389t.mo66753a(0, false);
                } else {
                    this.f75389t.setCurrentItemWithDefaultVelocity(0);
                }
            }
            m94181bA();
        }
    }

    /* renamed from: a */
    public final void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        m94177a(view);
        mo67628g();
    }

    /* renamed from: a */
    public final FeedPagerAdapter mo67600a(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        FullFeedPagerAdapter fullFeedPagerAdapter = new FullFeedPagerAdapter(context, layoutInflater, 10, zVar, fragment, onTouchListener, baseFeedPageParams);
        return fullFeedPagerAdapter;
    }
}
