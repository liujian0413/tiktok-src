package com.p280ss.android.ugc.aweme.detail.p1165i;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24087a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24092c;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.comment.services.C24221b;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24567h;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24572l;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.detail.C26055d;
import com.p280ss.android.ugc.aweme.detail.C26057e;
import com.p280ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.detail.PoiRankDetailFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.detail.p1158b.C26050a;
import com.p280ss.android.ugc.aweme.detail.p1160d.C26056a;
import com.p280ss.android.ugc.aweme.detail.p1162f.C26061a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26114r;
import com.p280ss.android.ugc.aweme.discover.model.SearchAggregateCommodity;
import com.p280ss.android.ugc.aweme.familiar.C21708a;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21712c.C21713a;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.familiar.p967c.C21720a;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.feed.adapter.C28129ab;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.event.C28315ak;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28321d;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.feed.event.C28327j;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.guide.C28398m;
import com.p280ss.android.ugc.aweme.feed.guide.C28405n;
import com.p280ss.android.ugc.aweme.feed.listener.C28516a;
import com.p280ss.android.ugc.aweme.feed.listener.C28517b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo.C29011a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo.DetailVideoSeekBarFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo.DispatchTouchEventLinearLayout.C29010a;
import com.p280ss.android.ugc.aweme.feed.panel.C28594ah;
import com.p280ss.android.ugc.aweme.feed.panel.C28598b;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.main.C32990dl;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33233af;
import com.p280ss.android.ugc.aweme.metrics.C33246ar;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.C35076e;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39325c;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.C43184ac;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.i.a */
public class C26071a extends C28598b implements C24092c, C24221b, C25675c<Aweme>, C26093f, C26114r, C28467s {

    /* renamed from: aA */
    private String f68882aA;

    /* renamed from: aB */
    private boolean f68883aB;

    /* renamed from: aC */
    private View f68884aC;

    /* renamed from: aD */
    private boolean f68885aD;

    /* renamed from: aE */
    private boolean f68886aE;

    /* renamed from: aF */
    private boolean f68887aF = false;

    /* renamed from: az */
    private boolean f68888az;

    /* renamed from: b */
    protected View f68889b;

    /* renamed from: b_ */
    public boolean f68890b_;

    /* renamed from: c */
    protected C24087a f68891c;

    /* renamed from: d */
    protected DetailVideoSeekBarFragment f68892d;

    /* renamed from: e */
    protected C28594ah f68893e;

    /* renamed from: f */
    public C28398m f68894f;

    /* renamed from: g */
    protected C28517b f68895g;

    /* renamed from: h */
    public C28516a f68896h;

    /* renamed from: i */
    public C28132ae f68897i;

    /* renamed from: j */
    public boolean f68898j = true;

    /* renamed from: k */
    public C26050a f68899k;

    /* renamed from: l */
    int f68900l;

    /* renamed from: m */
    protected int f68901m;

    /* renamed from: n */
    public C32990dl f68902n = new C32990dl() {
        /* renamed from: a */
        public final void mo67668a() {
            if (C26071a.this.f68894f != null) {
                C26071a.this.f68894f.mo72133b();
            }
        }
    };

    /* renamed from: o */
    public C26088a f68903o;

    /* renamed from: com.ss.android.ugc.aweme.detail.i.a$a */
    public interface C26088a {
        /* renamed from: b */
        void mo67669b();
    }

    /* renamed from: v */
    public final boolean mo67652v() {
        return true;
    }

    /* renamed from: a */
    public final void mo67609a(C28517b bVar) {
        this.f68895g = bVar;
    }

    /* renamed from: a */
    public final void mo67613a(String str) {
        if (mo73385bf() && C28344a.m93117h() != 0 && C28205ai.m92705a()) {
            if (TextUtils.equals(this.f68882aA, str)) {
                this.f68900l++;
                if (this.f68900l >= C28344a.m93116g() && !C28405n.m93353a().mo72141a(str)) {
                    m85653i(str);
                    if (this.f68900l == 2) {
                        C6877n.m21447a("awe_share_guide_type_log", C6869c.m21381a().mo16887a("awe_share_guide_type", C28205ai.m92707c()).mo16888b());
                    }
                } else if (this.f68900l == 2) {
                    C6877n.m21447a("awe_share_guide_type_log", C6869c.m21381a().mo16887a("awe_share_guide_type", "none").mo16888b());
                }
            } else {
                this.f68900l = 1;
                this.f68882aA = str;
            }
        }
    }

    /* renamed from: a */
    public void mo59099a(List list, boolean z) {
        if (mo73385bf()) {
            this.f75356aj = true;
            if (this.f68891c != null) {
                this.f68891c.mo62421d();
            }
            DmtStatusView n = mo73419n(false);
            if (!this.f68886aE) {
                if (C6311g.m19573a(list)) {
                    DmtStatusView n2 = mo73419n(true);
                    if (n2 != null) {
                        n2.mo25943g();
                    }
                } else {
                    this.f68886aE = true;
                    if (n != null) {
                        n.mo25939d();
                    }
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (C26071a.this.f75327V.isShowShareAfterOpen()) {
                                C26071a.this.mo73406f(C26071a.this.mo67648r());
                            }
                            if (C26071a.this.f75327V.isShowCommentAfterOpen()) {
                                C26071a.this.mo73407g(C26071a.this.mo67647q());
                            }
                        }
                    });
                }
            } else if (n != null) {
                n.mo25939d();
            }
            if (list == null || list.isEmpty() || !(list.get(0) instanceof Aweme)) {
                list = null;
            }
            List f = m85650f(list);
            this.f75324S.setRefreshing(false);
            this.f75394y.f73985a = z;
            mo67618b(f);
            m85648d(f);
            mo73336a("", true);
            C42961az.m136380a(new C28327j());
            m85631bF();
            this.f75358al = true;
            mo67630j();
            this.f75356aj = false;
        }
    }

    /* renamed from: a */
    public final void mo67610a(Aweme aweme) {
        if (mo73385bf()) {
            DmtStatusView n = mo73419n(false);
            if (n != null) {
                n.setVisibility(8);
            }
            if (aweme == null) {
                C10761a.m31399c(mo105655bv(), (int) R.string.fod).mo25750a();
            } else if (!C26057e.m85590b(mo73389bj()) || !aweme.isForwardAweme() || aweme.getForwardItem() != null) {
                if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                    this.f68889b.postDelayed(new Runnable() {
                        public final void run() {
                            if (C26071a.this.f113033ay != null && !C26071a.this.f113033ay.isFinishing()) {
                                C26071a.this.f113033ay.finish();
                            }
                        }
                    }, 600);
                }
                if (C6399b.m19944t() && C43122ff.m136769b(aweme.getAuthor(), C43122ff.m136787r(aweme.getAuthor()))) {
                    if (this.f68891c != null) {
                        this.f68891c.mo62415a(false);
                    }
                    if (this.f68903o != null) {
                        this.f68903o.mo67669b();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme));
                    mo67618b((List<Aweme>) arrayList);
                    if (this.f68891c != null) {
                        this.f68891c.mo62417b();
                    }
                }
                if (("message".equals(aw_()) || "chat".equals(aw_()) || "push".equals(aw_()) || "like_list".equals(aw_())) && !TextUtils.isEmpty(m85640bO()) && m85641bP() == 0 && !m85634bI()) {
                    mo67611a(mo67648r(), m85640bO(), 0);
                }
                if (this.f75327V.isShowShareAfterOpen()) {
                    mo73406f(mo67648r());
                }
            } else {
                C10761a.m31399c(mo105655bv(), (int) R.string.b9w).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public final void mo67611a(final Aweme aweme, final String str, final int i) {
        if (mo71903ai() != null || i >= 3) {
            mo73331a(mo67648r(), m85640bO(), m85643bR());
        } else {
            mo71894a((Runnable) new Runnable() {
                public final void run() {
                    C26071a.this.mo67611a(aweme, str, i + 1);
                }
            }, 50);
        }
    }

    /* renamed from: a */
    public final void mo67614a(List<Aweme> list) {
        int i;
        if (mo73385bf()) {
            this.f75395z = 0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) list.get(i3));
                list.set(i3, updateAweme);
                if (updateAweme != null && C6319n.m19594a(updateAweme.getAid(), m85639bN())) {
                    i2 = i3;
                }
            }
            mo67618b(list);
            this.f75395z = i2;
            this.f75389t.mo66753a(this.f75395z, false);
            this.f75389t.post(new Runnable() {
                public final void run() {
                    if (C26071a.this.f68891c != null) {
                        C26071a.this.f68891c.mo62417b();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo67612a(Exception exc) {
        if (mo73385bf()) {
            C22814a.m75245a(this.f113033ay, exc, R.string.c43);
            DmtStatusView n = mo73419n(false);
            if (n != null) {
                n.setVisibility(8);
            }
        }
    }

    /* renamed from: bM */
    private boolean m85638bM() {
        return this.f75327V.isMyProfile();
    }

    /* renamed from: bN */
    private String m85639bN() {
        return this.f75327V.getAid();
    }

    /* renamed from: bO */
    private String m85640bO() {
        return this.f75327V.getCid();
    }

    /* renamed from: bP */
    private int m85641bP() {
        return this.f75327V.getCommentDeleted();
    }

    /* renamed from: bQ */
    private int m85642bQ() {
        return this.f75327V.getLevel1CommentDeleted();
    }

    /* renamed from: bR */
    private boolean m85643bR() {
        return this.f75327V.isCommentForceOpenReply();
    }

    /* renamed from: A */
    public final String mo67595A() {
        return this.f75327V.getTabName();
    }

    /* renamed from: B */
    public final ViewGroup mo67596B() {
        return (ViewGroup) this.f68889b;
    }

    /* renamed from: C */
    public final String mo67597C() {
        return this.f75327V.getTracker();
    }

    /* renamed from: e */
    public final Aweme mo62993e() {
        return mo67648r();
    }

    /* renamed from: f */
    public final void mo67626f() {
        Activity activity = this.f113033ay;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: bC */
    private void m85628bC() {
        if (this.f75389t != null) {
            this.f75389t.mo66629a((C0935e) new SimpleOnPageChangeListener() {
                public final void onPageScrolled(int i, float f, int i2) {
                    if (i == C26071a.this.f75395z) {
                        if (C26071a.this.f68893e != null) {
                            C26071a.this.f68893e.mo73314a((float) (-i2));
                        }
                    } else if (C26071a.this.f68893e != null) {
                        C26071a.this.f68893e.mo73314a((float) (C9738o.m28709b(C26071a.this.mo105655bv()) - i2));
                    }
                }
            });
        }
    }

    /* renamed from: bF */
    private void m85631bF() {
        if (mo73365ao()) {
            C34196c.m110395a(this.f75357ak).mo86929d();
        }
    }

    /* renamed from: g */
    public final void mo67628g() {
        if (this.f68893e != null) {
            this.f68893e.mo73316c();
            this.f68893e = null;
        }
    }

    /* renamed from: i */
    public final void mo67629i() {
        if (m85627bB()) {
            mo71902ah();
        }
    }

    /* renamed from: m */
    public final void mo67633m() {
        super.mo67633m();
        if (this.f68894f != null) {
            this.f68894f.mo72133b();
        }
    }

    /* renamed from: s */
    public final boolean mo67649s() {
        boolean s = super.mo67649s();
        if (this.f68891c != null) {
            this.f68891c.mo62415a(!s);
        }
        return s;
    }

    /* renamed from: t */
    public final void mo67650t() {
        super.mo67650t();
        if (this.f68891c != null) {
            this.f68891c.mo62415a(true);
        }
    }

    /* renamed from: w */
    public final void mo67653w() {
        if (this.f68891c != null) {
            this.f68891c.mo62422e();
        }
    }

    /* renamed from: y */
    public final long mo67655y() {
        if (this.f75328W != null) {
            return this.f75328W.f74444a;
        }
        return -1;
    }

    public C26071a() {
        super("");
    }

    /* renamed from: bD */
    private void m85629bD() {
        C35076e.m113205a(mo105655bv(), mo71904aj(), 2, this.f75327V, mo73366ap());
    }

    /* renamed from: bH */
    private boolean m85633bH() {
        if ("discovery".equals(aw_()) || this.f75327V.isHotSpot()) {
            return true;
        }
        return false;
    }

    /* renamed from: bI */
    private boolean m85634bI() {
        if (m85641bP() != 0 || m85642bQ() != 1) {
            return false;
        }
        C10761a.m31409e(C6399b.m19921a(), (int) R.string.cnv).mo25750a();
        return true;
    }

    /* renamed from: bJ */
    private void m85635bJ() {
        if (this.f75394y.getCount() == 0) {
            mo67626f();
        } else {
            this.f75389t.post(new C26091d(this));
        }
    }

    /* renamed from: by */
    private void m85644by() {
        if (this.f75394y.getCount() == 0) {
            mo67626f();
        } else {
            this.f75389t.post(new C26089b(this));
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (mo73385bf()) {
            if (this.f68891c != null) {
                this.f68891c.mo62419c();
            }
            DmtStatusView n = mo73419n(true);
            if (n != null) {
                n.setVisibility(0);
                n.mo25942f();
            }
        }
    }

    public final void aD_() {
        if (mo73385bf() && !this.f68885aD) {
            this.f75388s.mo74375a();
        }
    }

    public final void aE_() {
        if (mo73385bf() && !this.f68885aD) {
            this.f75324S.setRefreshing(true);
        }
    }

    public void ae_() {
        if (this.f68891c != null) {
            this.f68891c.mo62419c();
        }
        if (this.f75327V.isShowVideoRank()) {
            DmtStatusView n = mo73419n(true);
            if (n != null) {
                n.setVisibility(0);
                n.mo25943g();
            }
        }
    }

    /* renamed from: j */
    public final void mo67630j() {
        if (C21085a.m71133e() > 0 && this.f75358al && this.f68884aC != null) {
            this.f68884aC.setVisibility(0);
            this.f68884aC.setOnClickListener(new C26090c(this));
        }
    }

    /* renamed from: u */
    public final void mo67651u() {
        if (ax_() && this.f68898j) {
            if (this.f113033ay != null) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
            }
            if (!this.f68883aB) {
                super.mo67651u();
            }
        }
    }

    /* renamed from: bA */
    private boolean m85626bA() {
        if (!C26056a.m85583a(true) || this.f75389t.getCurrentItem() == this.f75394y.getCount() - 1 || (!TextUtils.equals("hot_search_video_board", aw_()) && !TextUtils.equals("discovery_hot_search_video", aw_()))) {
            return false;
        }
        m85628bC();
        return true;
    }

    /* renamed from: bB */
    private boolean m85627bB() {
        if (!"from_tutorial_detail".equals(mo73389bj()) || C26055d.m85578a(false) || C26055d.m85580c(false) || mo71886W() == null || mo71886W().getCount() <= 1) {
            return false;
        }
        C26055d.m85579b(true);
        return true;
    }

    /* renamed from: bE */
    private boolean m85630bE() {
        if (VERSION.SDK_INT != 29 || this.f68892d == null) {
            return false;
        }
        if (!mo73488bw()) {
            return true;
        }
        Aweme r = mo67648r();
        if (r == null || !r.isLive()) {
            return false;
        }
        return true;
    }

    /* renamed from: bG */
    private boolean m85632bG() {
        if (m85633bH()) {
            if (this.f75395z >= this.f75394y.getCount() - 3) {
                return true;
            }
            return false;
        } else if (this.f75395z == this.f75394y.getCount() - 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: bK */
    private void m85636bK() {
        if (!this.f75327V.isShowVideoRank() && this.f113033ay != null && !this.f113033ay.isFinishing() && ay_() != null) {
            this.f68891c = C24217a.m79549a().showInputFragment(ay_().getView(), mo73489bx(), mo64928a(true), this, this);
        }
    }

    /* renamed from: bz */
    private boolean m85645bz() {
        boolean c = C26056a.m85585c(true);
        if (!"discovery".equals(aw_()) || C6399b.m19944t() || !c) {
            return false;
        }
        C26056a.m85586d(false);
        m85628bC();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final /* synthetic */ void mo67598D() {
        if (mo73385bf()) {
            C28130ac aH = mo73346aH();
            if (C28478a.m93590e(aH)) {
                aH.mo65708a(aH.mo65711h());
                mo67617b(aH.mo65711h());
                if (m93937bo()) {
                    aH.au_();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final /* synthetic */ void mo67599E() {
        if (mo73385bf()) {
            C28130ac aL = mo73350aL();
            if (aL != null) {
                aL.mo65708a(aL.mo65711h());
                if (aL.mo65709f() != 2) {
                    mo71895aa();
                    mo73351aM();
                }
                if (m93937bo()) {
                    aL.au_();
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo67634n() {
        super.mo67634n();
        mo67628g();
        if (C43268o.f112004a) {
            C43184ac.m136934a().mo104820d();
        }
        try {
            if (TextUtils.equals("commerce_general", this.f75327V.getFrom())) {
                mo73367aq().mo104922B();
            }
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }

    /* renamed from: o */
    public final void mo67635o() {
        if (mo73385bf()) {
            super.mo67635o();
            if (!this.f75394y.f73985a) {
                this.f75388s.mo74378c();
                return;
            }
            if (m85632bG() && this.f68895g != null) {
                this.f68895g.mo67746g();
            }
        }
    }

    /* renamed from: p */
    public final void mo67646p() {
        if (mo73385bf() && this.f75394y.f73986b && this.f75395z == 2 && this.f68896h != null) {
            this.f68896h.mo67747i();
        }
    }

    /* renamed from: q */
    public final Aweme mo67647q() {
        C28130ac aL = mo73350aL();
        if (aL != null) {
            return aL.mo71542A();
        }
        if (this.f75394y == null || this.f75389t == null) {
            return null;
        }
        return this.f75394y.mo71595c(this.f75389t.getCurrentItem());
    }

    /* renamed from: r */
    public final Aweme mo67648r() {
        C28130ac aL = mo73350aL();
        if (aL != null) {
            return aL.mo65711h();
        }
        if (this.f75394y == null || this.f75389t == null) {
            return null;
        }
        return this.f75394y.mo67568b(this.f75389t.getCurrentItem());
    }

    /* renamed from: I */
    private void mo69890I() {
        if (!C26092e.m85724a(mo105655bv())) {
            C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
            return;
        }
        if (!this.f75327V.isShowVideoRank()) {
            mo73419n(true).setBuilder(C10803a.m31631a((Context) this.f113033ay).mo25962b((int) R.string.fi5).mo25954a((int) R.string.bzv));
        }
        this.f68889b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26071a.this.mo67653w();
            }
        });
        m85636bK();
        m85637bL();
        this.f75324S = this.f75392w;
        if (C26056a.m85583a(true)) {
            this.f75389t.mo66629a((C0935e) new SimpleOnPageChangeListener() {

                /* renamed from: a */
                int f68924a = -2;

                public final void onPageSelected(int i) {
                    if (Math.abs(this.f68924a - i) == 1 && this.f68924a < i && C32960dc.m106535c(true)) {
                        C32960dc.m106536d(false);
                        C26071a.this.mo67628g();
                    }
                    if ((Math.abs(this.f68924a - i) == 1 && C32960dc.m106535c(true)) || (C26071a.this.f68893e != null && C26071a.this.f68893e.mo73317d())) {
                        C26056a.m85584b(false);
                        C26071a.this.mo67628g();
                    }
                    this.f68924a = i;
                }

                public final void onPageScrolled(int i, float f, int i2) {
                    if (i == C26071a.this.f75395z) {
                        if (C26071a.this.f68893e != null) {
                            C26071a.this.f68893e.mo73314a((float) (-i2));
                        }
                    } else if (C26071a.this.f68893e != null) {
                        C26071a.this.f68893e.mo73314a((float) (C9738o.m28709b(C26071a.this.mo105655bv()) - i2));
                    }
                }
            });
        }
        this.f75389t.mo66629a((C0935e) new SimpleOnPageChangeListener() {
            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    C26071a.this.mo67656z();
                }
            }

            public final void onPageSelected(int i) {
                C39330h hVar = new C39330h(10);
                hVar.f102162e = 2;
                C42961az.m136380a(hVar);
                if (!C26071a.this.f75330Y && C26061a.m85601b(C26071a.this.f75327V.getFrom())) {
                    C26061a.f68871a.mo67588a(C26071a.this.mo67647q(), C26071a.this.f75327V.getFrom(), C26071a.this.f75327V.getVideoType(), C26071a.this.f75327V.getEventType(), C26071a.this.mo67655y());
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                C26071a.this.mo67601a(i, f);
                if (C26071a.this.f68892d != null) {
                    C26071a.this.f68892d.mo74330a(i, f, i2);
                }
            }
        });
    }

    /* renamed from: bL */
    private void m85637bL() {
        if (!this.f75327V.isShowVideoRank() && !C6399b.m19944t() && this.f113033ay != null && !this.f113033ay.isFinishing()) {
            Fragment a = mo73489bx().mo2644a("detail_seek_bar");
            if (a == null) {
                this.f68892d = new DetailVideoSeekBarFragment();
                try {
                    this.f68892d.show(mo73489bx(), "detail_seek_bar");
                } catch (IllegalStateException unused) {
                    mo73489bx().mo2645a().mo2588a((Fragment) this.f68892d, "detail_seek_bar").mo2606d();
                }
            } else {
                this.f68892d = (DetailVideoSeekBarFragment) a;
            }
            this.f68892d.f76410c = new C29010a() {
                /* renamed from: a */
                public final boolean mo67665a(KeyEvent keyEvent) {
                    if (C26071a.this.f68891c == null || keyEvent == null) {
                        return false;
                    }
                    return C26071a.this.f68891c.mo62416a(keyEvent);
                }

                /* renamed from: a */
                public final boolean mo67666a(MotionEvent motionEvent) {
                    if (C26071a.this.f68891c == null || C26071a.this.f68891c.getView() == null || motionEvent == null) {
                        return false;
                    }
                    return C26071a.this.f68891c.getView().dispatchTouchEvent(motionEvent);
                }
            };
            this.f68892d.mo74331a((C28648x) this);
        }
    }

    public final boolean av_() {
        if (m85645bz()) {
            if (this.f68893e == null) {
                ViewStub viewStub = (ViewStub) this.f68889b.findViewById(R.id.dcf);
                if (viewStub != null) {
                    this.f68893e = new C28594ah(this.f75389t, viewStub);
                    this.f68893e.mo73315a(500);
                }
            }
            return true;
        } else if (!m85626bA()) {
            return false;
        } else {
            ViewStub viewStub2 = (ViewStub) this.f68889b.findViewById(R.id.dcf);
            if (this.f68893e == null || viewStub2 != null) {
                this.f68893e = new C28594ah(this.f75389t, viewStub2);
            }
            this.f68893e.mo73313a();
            return true;
        }
    }

    /* renamed from: l */
    public final void mo67632l() {
        super.mo67632l();
        if (m85630bE()) {
            this.f68892d.mo74333b();
        }
        if (mo73488bw() && this.f75394y != null && this.f75394y.getCount() > 0) {
            if (!mo73367aq().mo104942b((C34976f) this.f75328W)) {
                C28130ac aH = mo73346aH();
                if (!C43268o.m137250H()) {
                    mo73367aq().mo104939a((C34976f) this.f75328W);
                } else if (aH != null) {
                    C44960f b = aH.mo71553b();
                    if (b != null) {
                        b.mo71663a((C34976f) this.f75328W);
                    }
                }
                if (C28478a.m93590e(aH) && (aH.mo65716m().mo71568s() || m93937bo())) {
                    mo67617b(aH.mo65711h());
                }
            } else if (this.f68898j) {
                mo67651u();
            }
        }
    }

    /* renamed from: x */
    public final void mo67654x() {
        String str;
        int i;
        super.mo67654x();
        this.f75328W.mo71926b();
        if (this.f68891c != null) {
            this.f68891c.mo62423f();
        }
        if (TextUtils.equals(aw_(), "homepage_familiar")) {
            Aweme aj = mo71904aj();
            if (aj != null && aj.getAuthor() != null) {
                if (TextUtils.isEmpty(aj.getRepostFromGroupId())) {
                    str = "item";
                } else {
                    str = "repost";
                }
                String str2 = (String) C21713a.m72631a().get(aj.getAuthorUid());
                Integer num = (Integer) C21713a.m72632b().get(aj.getAid());
                String str3 = "impression";
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                C21718a.m72641a(aj, str3, str2, str, i);
            }
        }
    }

    /* renamed from: z */
    public final void mo67656z() {
        boolean z;
        boolean z2;
        float f;
        Aweme b = this.f75394y.mo67568b(this.f75395z);
        if (b != null) {
            boolean z3 = false;
            if (b.getAwemeType() == 101) {
                z = true;
            } else {
                z = false;
            }
            if (b.getAwemeType() == 4000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                z3 = true;
            }
            float f2 = 1.0f;
            if (this.f68891c != null) {
                this.f68891c.mo62418b(z3);
                C24087a aVar = this.f68891c;
                if (z3) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                aVar.mo62414a(f);
            }
            if (this.f68899k != null) {
                C26050a aVar2 = this.f68899k;
                if (z) {
                    f2 = 0.0f;
                }
                aVar2.mo67584a(f2);
            }
            if (this.f68892d != null) {
                this.f68892d.mo74332a(z);
            }
        }
    }

    /* renamed from: k */
    public final void mo67631k() {
        boolean z;
        int i = 0;
        this.f75395z = 0;
        C25673a a = C28503s.m93677a();
        List list = null;
        if (a instanceof C26112p) {
            list = ((C26112p) a).mo57985a();
        } else if ("homepage_fresh".equalsIgnoreCase(aw_())) {
            if (a != null) {
                list = m85646c(a.getItems());
            }
        } else if (a != null) {
            list = a.getItems();
        }
        if (this.f75327V.isShowVideoRank() && !C6307b.m19566a((Collection<T>) list)) {
            this.f75358al = true;
        }
        if (a == null || !a.isHasMore()) {
            z = false;
        } else {
            z = true;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            list = m85650f(list);
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                Aweme aweme = (Aweme) list.get(i);
                if (aweme != null && C6319n.m19594a(aweme.getAid(), m85639bN())) {
                    this.f75395z = i;
                    break;
                }
                i++;
            }
            mo67618b(list);
            this.f75394y.f73985a = z;
            this.f75389t.setCurrentItem(this.f75395z);
            mo67656z();
        }
        if (z || mo71888Y() != -1) {
            this.f75388s.mo74379d();
        } else {
            this.f75388s.mo74378c();
        }
        this.f75389t.postDelayed(new Runnable() {
            public final void run() {
                if (C26071a.this.f68891c != null) {
                    C26071a.this.f68891c.mo62417b();
                }
            }
        }, 150);
        this.f75388s.mo74376a(this.f75389t, this.f75392w);
        this.f75388s.setLoadMoreListener(new C28132ae() {
            /* renamed from: a */
            public final void mo67659a() {
                if (C26071a.this.f75394y.f73985a || C26071a.this.f75388s == null) {
                    if (C26071a.this.f68897i != null) {
                        C26071a.this.f68890b_ = true;
                        C26071a.this.f68897i.mo67659a();
                    }
                    return;
                }
                C26071a.this.f75388s.mo74378c();
            }
        });
        if (this.f75327V.isShowVideoRank() && !C6307b.m19566a((Collection<T>) list) && list.size() > 1) {
            this.f75389t.setCurrentItem(list.size() * 1000);
        }
    }

    /* renamed from: a */
    public final void mo62991a(int i) {
        this.f68901m = i;
    }

    /* renamed from: d */
    public final void mo67623d(boolean z) {
        this.f68885aD = z;
    }

    /* renamed from: a */
    public final void mo67603a(long j) {
        this.f75328W.f74444a = j;
    }

    /* renamed from: b */
    public final void mo67619b(boolean z) {
        this.f68888az = z;
        this.f75328W.f74456j = z;
    }

    /* renamed from: a_ */
    public final void mo62464a_(boolean z) {
        if (this.f68892d != null) {
            this.f68892d.mo74334c();
        }
    }

    /* renamed from: b */
    public final void mo67616b(int i) {
        if (this.f68892d != null) {
            this.f68892d.mo74329a(i);
        }
    }

    /* renamed from: b_ */
    public final void mo67620b_(String str) {
        if (mo73385bf()) {
            m85654j(str);
            super.mo67620b_(str);
        }
    }

    /* renamed from: c */
    public final void mo67621c(boolean z) {
        if (this.f68891c != null) {
            this.f68891c.mo62415a(z);
            if (z) {
                mo67650t();
            }
        }
    }

    /* renamed from: e */
    public final void mo67625e(boolean z) {
        this.f75327V.setMyProfile(z);
        this.f75329X.mo71857a(z);
    }

    /* renamed from: f */
    public final void mo67627f(boolean z) {
        super.mo67627f(z);
        if (z) {
            m85636bK();
        }
    }

    /* renamed from: d */
    private void m85647d(View view) {
        this.f68889b = view.findViewById(R.id.cwn);
        this.f68884aC = view.findViewById(R.id.cfx);
    }

    /* renamed from: p */
    private void m85657p(boolean z) {
        if (!(this.f75394y.mo67568b(this.f75395z) == null || this.f68891c == null)) {
            this.f68891c.mo62420c(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67604a(View view) {
        m85629bD();
    }

    /* renamed from: b */
    public final void mo67617b(Aweme aweme) {
        if (this.f68898j) {
            if (this.f113033ay != null) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
            }
            super.mo67617b(aweme);
        }
    }

    @C7709l
    public void onCommerceDialogEvent(C28315ak akVar) {
        this.f68887aF = akVar.f74629a;
        if (akVar.f74629a) {
            if (this.f68891c != null) {
                this.f68891c.mo62419c();
            }
        } else if (this.f68891c != null) {
            this.f68891c.mo62421d();
        }
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        if (gVar.f74654e == this.f113033ay.hashCode()) {
            mo73338a(gVar.f74650a, gVar.f74655f);
        }
    }

    /* renamed from: d */
    private void m85648d(List<Aweme> list) {
        int e = m85649e(list);
        if (e != -1 && e < this.f75394y.getCount()) {
            if (!(this.f75394y == null || this.f75389t.getExpectedAdapterCount() == this.f75394y.getCount())) {
                this.f75394y.notifyDataSetChanged();
            }
            this.f75389t.mo66753a(e, false);
        }
    }

    /* renamed from: e */
    private int m85649e(List<Aweme> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme = (Aweme) list.get(i);
                if (aweme != null && TextUtils.equals(aweme.getAid(), m85639bN())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: h */
    private void m85652h(String str) {
        if (mo73385bf() && !C6307b.m19566a((Collection<T>) this.f75394y.mo71593b())) {
            if (C28478a.m93590e(mo73346aH())) {
                mo73353aO();
            }
            if (this.f75394y.mo71592a(str)) {
                mo73343aE();
                mo73357aS();
                m85644by();
                mo73399d(this.f75389t.getCurrentItem());
            }
        }
    }

    /* renamed from: j */
    private boolean m85655j(Aweme aweme) {
        if (C6399b.m19944t() || !TextUtils.equals(this.f75327V.getFrom(), "from_profile_self") || this.f75327V.getVideoType() != 1) {
            return false;
        }
        return aweme.isDelete();
    }

    /* renamed from: k */
    private void m85656k(String str) {
        if (str != null && this.f75394y != null && this.f75394y.mo71593b() != null) {
            List b = this.f75394y.mo71593b();
            int i = 0;
            while (i < b.size()) {
                Aweme aweme = (Aweme) b.get(i);
                if (aweme == null || !str.equals(aweme.getAid())) {
                    i++;
                } else {
                    mo61747c_(i);
                    m85635bJ();
                    return;
                }
            }
        }
    }

    /* renamed from: a_ */
    public void mo59105a_(Exception exc) {
        if (this.f68891c != null) {
            this.f68891c.mo62419c();
        }
        C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
        if (this.f75327V.isShowVideoRank()) {
            DmtStatusView n = mo73419n(true);
            if (n != null) {
                n.setVisibility(0);
                n.mo25944h();
            }
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
            } else {
                C22814a.m75245a(C6399b.m19921a(), exc, R.string.c43);
            }
            this.f68885aD = false;
        }
    }

    @C7709l
    public void onCommentEvent(C24029a aVar) {
        if (aVar != null) {
            Aweme aweme = aVar.f63542d;
            if (aweme != null) {
                for (Aweme aweme2 : this.f75394y.mo71593b()) {
                    if (aweme2.getAid().equals(aweme.getAid())) {
                        aweme2.setCommentSetting(aweme.getCommentSetting());
                    }
                }
            }
        }
    }

    @C7709l
    public void onDuetSettingEvent(C39325c cVar) {
        if (cVar != null) {
            Aweme aweme = cVar.f102145a;
            if (aweme != null) {
                for (Aweme aweme2 : this.f75394y.mo71593b()) {
                    if (aweme2.getAid().equals(aweme.getAid())) {
                        aweme2.setDuetSetting(aweme.getDuetSetting());
                        aweme2.setReactSetting(aweme.getReactSetting());
                    }
                }
            }
        }
    }

    @C7709l
    public void onHideCommentInputFragmentEvent(C24567h hVar) {
        Activity activity = this.f113033ay;
        if (activity != null && hVar.f64808b == activity.hashCode()) {
            if (hVar.f64807a) {
                if (this.f68892d != null) {
                    this.f68892d.dismissAllowingStateLoss();
                }
                if (this.f68891c != null) {
                    this.f68891c.mo62424g();
                }
            } else {
                Fragment ay_ = ay_();
                if (ay_ != null && ay_.mUserVisibleHint) {
                    m85636bK();
                    m85637bL();
                }
            }
        }
    }

    @C7709l
    public void onShowAdLayoutEvent(C24572l lVar) {
        if (this.f75394y.mo67568b(this.f75395z) != null && TextUtils.equals(lVar.f64816b, this.f75394y.mo67568b(this.f75395z).getAid())) {
            if (lVar.f64815a) {
                m85657p(true);
            } else {
                m85657p(false);
            }
        }
    }

    @C7709l
    public void onVideoCleanModeEvent(C29011a aVar) {
        if (this == aVar.f76425c) {
            C28130ac aL = mo73350aL();
            if (aL != null && aVar.f76424b != null && aL.mo65711h() != null && aVar.f76424b.getAid().equals(aL.mo65711h().getAid())) {
                aL.mo71533d(aVar.f76423a);
            }
        }
    }

    /* renamed from: c */
    private static List<Aweme> m85646c(List<Aweme> list) {
        if (!C6903bc.m21496o().mo88907a().mo88879b()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                if (aweme.isLive()) {
                    StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
                    if (!(aweme.getRoom() == null || streamUrlModel == null || TextUtils.isEmpty(streamUrlModel.f75165id))) {
                        C43238k.m137170a().f111932a.put(streamUrlModel.f75165id, RoomStruct.fromAweme(aweme));
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private List<Aweme> m85650f(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (!aweme.isPoiRank() && !aweme.isPoiOperate() && !aweme.isPoiRegion()) {
                if ((!mo73382bc() || !aweme.isLive()) && !m85655j(aweme)) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m85651g(int i) {
        String str;
        if (TextUtils.equals(aw_(), "homepage_familiar")) {
            Aweme aj = mo71904aj();
            if (!(aj == null || aj.getAuthor() == null)) {
                if (TextUtils.isEmpty(aj.getRepostFromGroupId())) {
                    str = "item";
                } else {
                    str = "repost";
                }
                String str2 = (String) C21713a.m72631a().get(aj.getAuthorUid());
                Integer num = (Integer) C21713a.m72632b().get(aj.getAid());
                int i2 = 0;
                if (i != 12) {
                    switch (i) {
                        case 18:
                        case 19:
                            String str3 = "enter_profile";
                            if (num != null) {
                                i2 = num.intValue();
                            }
                            C21718a.m72641a(aj, str3, str2, str, i2);
                            return;
                    }
                } else {
                    String str4 = "follow";
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    C21718a.m72641a(aj, str4, str2, str, i2);
                }
            }
        }
    }

    /* renamed from: i */
    private void m85653i(String str) {
        String str2;
        try {
            MobClick value = new MobClick().setEventName("share_highlight").setLabelName(C22704b.f60415d).setValue(str);
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

    /* renamed from: j */
    private void m85654j(String str) {
        if (mo73385bf()) {
            if (C28478a.m93590e(mo73346aH())) {
                mo73353aO();
            }
            if (this.f75315J == null || !this.f75315J.mo67740a(str)) {
                StringBuilder sb = new StringBuilder("mDeleteItemListener.deleteItem ");
                sb.append(str);
                sb.append(" failed");
                C6921a.m21552a(6, "DeleteAweme", sb.toString());
                m85656k(str);
                return;
            }
            m85635bJ();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (mo73385bf()) {
            this.f75388s.mo74377b();
            this.f68885aD = false;
            this.f68890b_ = false;
            C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
        }
    }

    /* renamed from: d */
    public final void mo67622d(Exception exc) {
        if (mo73385bf()) {
            C22814a.m75245a(this.f113033ay, exc, R.string.c43);
            DmtStatusView n = mo73419n(false);
            if (n != null) {
                n.setVisibility(8);
            }
        }
    }

    /* renamed from: e */
    public final void mo67624e(Exception exc) {
        if (mo73385bf()) {
            if (exc instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) exc;
                if (apiServerException.getErrorCode() == 2130) {
                    C22814a.m75245a(this.f113033ay, exc, R.string.foa);
                    return;
                }
                if (apiServerException.getErrorCode() == 2752) {
                    C22814a.m75243a(mo105655bv(), exc, R.string.c7z, R.string.c7y);
                    C33228ab.m107200a("promote_layer_show").mo85057b("enter_from", aw_()).mo85057b(C38347c.f99553h, "delete_fail").mo85057b("group_id", m85639bN()).mo85252e();
                }
                return;
            }
            C22814a.m75245a(this.f113033ay, exc, R.string.anx);
        }
    }

    @C7709l
    public void onCommentDialogEvent(C28321d dVar) {
        boolean z;
        boolean z2;
        Activity activity = this.f113033ay;
        if (activity != null && !activity.isFinishing() && dVar.f74648d == activity.hashCode()) {
            boolean z3 = false;
            if (dVar.f74645a == 1) {
                z = true;
            } else {
                z = false;
            }
            mo73415j(z);
            if (dVar.f74645a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo73409g(z2);
            if (dVar.f74645a == 1) {
                z3 = true;
            }
            mo73411h(z3);
            if (dVar.f74645a == 1) {
                if (this.f68892d != null) {
                    this.f68892d.dismissAllowingStateLoss();
                }
                if (this.f68891c != null) {
                    this.f68891c.mo62424g();
                }
            } else {
                Fragment ay_ = ay_();
                if (ay_ != null && ay_.mUserVisibleHint) {
                    m85636bK();
                    m85637bL();
                }
            }
        }
    }

    @C7709l
    public void onDislikeUserEvent(C28325h hVar) {
        String str;
        int i;
        if (hVar != null && hVar.f74656a != null) {
            if (TextUtils.equals(aw_(), "homepage_familiar")) {
                Aweme aj = mo71904aj();
                if (!(aj == null || aj.getAuthor() == null)) {
                    if (TextUtils.isEmpty(aj.getRepostFromGroupId())) {
                        str = "item";
                    } else {
                        str = "repost";
                    }
                    String str2 = (String) C21713a.m72631a().get(aj.getAuthorUid());
                    Integer num = (Integer) C21713a.m72632b().get(aj.getAid());
                    String str3 = "delete";
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    C21718a.m72641a(aj, str3, str2, str, i);
                }
            }
            m85652h(hVar.f74656a.getUid());
        }
    }

    @C7709l
    public void onFamiliarScrollToProfileEvent(C21708a aVar) {
        String str;
        int i;
        Aweme aj = mo71904aj();
        if (aj != null && aj.getAuthor() != null) {
            if (TextUtils.isEmpty(aj.getRepostFromGroupId())) {
                str = "item";
            } else {
                str = "repost";
            }
            String str2 = (String) C21713a.m72631a().get(aj.getAuthorUid());
            Integer num = (Integer) C21713a.m72632b().get(aj.getAid());
            String str3 = "enter_profile";
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C21718a.m72641a(aj, str3, str2, str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67618b(List<Aweme> list) {
        if (this.f75394y != null) {
            this.f75394y.mo71589a(list);
        }
    }

    /* renamed from: b */
    private void m85625b(C28130ac acVar) {
        if (C6399b.m19944t()) {
            if (!(acVar == null || acVar.mo65711h() == null)) {
                if (!aw_().equals("opus")) {
                    C6907h.m21518a(mo105655bv(), "comment", aw_(), m85639bN(), 0);
                } else if (m85638bM()) {
                    C6907h.m21518a(mo105655bv(), "comment", "personal_homepage", m85639bN(), 0);
                } else {
                    C6907h.m21518a(mo105655bv(), "comment", "others_homepage", m85639bN(), 0);
                }
                mo67607a(acVar, mo64928a(true));
            }
        } else if (!(acVar == null || acVar.mo65711h() == null)) {
            C6909j jVar = new C6909j();
            jVar.mo16966a("enter_from", aw_());
            jVar.mo16966a("author_id", acVar.mo65711h().getAuthorUid());
            if (!TextUtils.isEmpty(C33230ac.m107223e(acVar.mo65711h()))) {
                jVar.mo16966a("poi_id", C33230ac.m107223e(acVar.mo65711h()));
            }
            if (C33230ac.m107220c(aw_())) {
                jVar.mo16966a("city_info", C33230ac.m107204a());
                jVar.mo16966a("distance_info", C33230ac.m107231i(acVar.mo65711h()));
                jVar.mo16966a("poi_type", C33230ac.m107229h(acVar.mo65711h()));
                jVar.mo16966a("poi_channel", C33230ac.m107214b());
            }
            C6907h.m21519a(mo105655bv(), "comment", aw_(), C33230ac.m107238m(acVar.mo65711h()), 0, jVar.mo16967a());
            C6907h.m21524a("comment", (Map) C22984d.m75611a().mo59973a("enter_from", aw_()).mo59973a("group_id", C33230ac.m107238m(acVar.mo65711h())).f60753a);
            mo67607a(acVar, aw_());
        }
    }

    /* renamed from: a */
    public final void mo67608a(C28318an anVar) {
        switch (anVar.f74631a) {
            case 8:
                if (mo73385bf()) {
                    this.f75389t.setCanTouch(false);
                    this.f75392w.setCanTouch(false);
                    C28130ac aH = mo73346aH();
                    if (aH != null) {
                        C24716aj o = aH.mo71564o();
                        if (o != null) {
                            o.mo64568a(false);
                        }
                        aH.mo71533d(true);
                    }
                    C28130ac i = mo73412i(this.f75308C);
                    if (i != null) {
                        C24716aj o2 = i.mo71564o();
                        if (o2 != null) {
                            o2.mo64556a(mo73489bx(), false, aH);
                            o2.mo64590l();
                            break;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 9:
                if (mo71903ai() == null || !mo71903ai().mo71517B()) {
                    this.f75389t.setCanTouch(true);
                    this.f75392w.setCanTouch(true);
                    C28130ac aH2 = mo73346aH();
                    if (aH2 != null) {
                        if (!this.f68887aF) {
                            aH2.mo71533d(false);
                            break;
                        } else {
                            aH2.mo71533d(true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                Activity activity = this.f113033ay;
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 11:
                if (C26092e.m85724a(mo105655bv())) {
                    m85625b(mo73350aL());
                    break;
                } else {
                    C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
                    return;
                }
            default:
                super.mo67608a(anVar);
                break;
        }
        m85651g(anVar.f74631a);
    }

    /* renamed from: b */
    private int m85624b(List<Aweme> list, int i) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return -1;
        }
        List c = this.f75394y.mo71596c();
        if (C6307b.m19566a((Collection<T>) c)) {
            return -1;
        }
        Aweme aweme = (Aweme) c.get(this.f75395z);
        if (aweme == null) {
            return -1;
        }
        int indexOf = list.indexOf(aweme) - i;
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        m85647d(view);
        mo69890I();
        this.f75389t.mo66629a((C0935e) new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (C26071a.this.f68891c != null) {
                    C26071a.this.f68891c.mo62413a();
                }
                if (C26071a.this.f75394y != null) {
                    new C33246ar().mo85126a(C26071a.this.f75327V.getEventType()).mo85128c(C26071a.this.f75394y.mo67568b(i), C26071a.this.mo71888Y()).mo85127b(C26071a.this.f75327V.getTabName()).mo85133g("full").mo85252e();
                }
            }
        });
        C33061p a = C32895a.m106470a((FragmentActivity) this.f113033ay);
        if (a != null) {
            a.mo84694a((C0935e) new C0935e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    if (i == 0) {
                        AwemeChangeCallBack.m106765a((FragmentActivity) C26071a.this.f113033ay, C26071a.this.f75394y.mo67568b(C26071a.this.f75389t.getCurrentItem()));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo67601a(int i, float f) {
        boolean z;
        Aweme aweme;
        float f2;
        float f3;
        if (f != 0.0f && this.f75394y.getCount() > this.f75395z + 1) {
            if (this.f75395z == i) {
                z = true;
            } else {
                z = false;
            }
            Aweme b = this.f75394y.mo67568b(this.f75395z);
            if (z) {
                aweme = this.f75394y.mo67568b(this.f75395z + 1);
            } else {
                aweme = this.f75394y.mo67568b(i);
            }
            if (b.getAwemeType() != aweme.getAwemeType() && (b.getAwemeType() == 101 || aweme.getAwemeType() == 101)) {
                if (b.getAwemeType() == 101) {
                    if (z) {
                        f3 = Math.max(f - 0.5f, 0.0f);
                    } else {
                        f3 = Math.max(0.5f - f, 0.0f);
                    }
                    if (this.f68899k != null) {
                        this.f68899k.mo67584a(f3 * 2.0f);
                    }
                    if (this.f68891c != null) {
                        this.f68891c.mo62414a(f3 * 2.0f);
                    }
                } else if (aweme.getAwemeType() == 101) {
                    if (z) {
                        f2 = Math.max(0.5f - f, 0.0f);
                    } else {
                        f2 = Math.max(f - 0.5f, 0.0f);
                    }
                    if (this.f68899k != null) {
                        this.f68899k.mo67584a(f2 * 2.0f);
                    }
                    if (this.f68891c != null) {
                        this.f68891c.mo62414a(f2 * 2.0f);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo59110c(List list, boolean z) {
        boolean z2;
        final int i;
        if (mo73385bf()) {
            this.f75324S.setRefreshing(false);
            this.f75394y.f73986b = z;
            if (z || this.f68885aD) {
                if (!this.f68885aD || C6307b.m19566a((Collection<T>) list) || this.f75394y.getCount() == list.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f75321P = z2;
                String from = this.f75327V.getFrom();
                if (TextUtils.equals("from_rn_search", from) || TextUtils.equals("from_visual_search_result", from)) {
                    i = m85624b(list, 0);
                } else if (TextUtils.equals("from_chat", from)) {
                    i = m85624b(list, 1);
                } else if (TextUtils.equals("from_mix_detail", from)) {
                    i = m85624b(list, 1);
                } else if (!C6399b.m19928c()) {
                    i = -1;
                } else {
                    throw new RuntimeException("该种类型不支持Load Lastest操作");
                }
                mo67618b(list);
                if (!this.f68885aD) {
                    this.f75389t.post(new Runnable() {
                        public final void run() {
                            if (C26071a.this.f75389t != null) {
                                C26071a.this.f75307B = true;
                                if (i > 0) {
                                    C26071a.this.f75395z = i;
                                    C26071a.this.f75389t.setCurrentItemWithDefaultVelocity(C26071a.this.f75395z);
                                    return;
                                }
                                C26071a.this.f75395z = 0;
                                C26071a.this.f75389t.mo66753a(C26071a.this.f75395z, false);
                            }
                        }
                    });
                }
            } else if (mo73488bw()) {
                C10761a.m31409e((Context) this.f113033ay, (int) R.string.am0).mo25750a();
                if (this.f75389t.getCurrentItem() > 1) {
                    this.f75389t.mo66753a(0, false);
                } else {
                    this.f75389t.setCurrentItemWithDefaultVelocity(0);
                }
            }
            this.f68885aD = false;
            m85631bF();
        }
    }

    /* renamed from: a */
    public final void mo67606a(C24202a aVar, Aweme aweme) {
        C21720a.m72644a(aVar, this.f75360an, aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67607a(C28130ac acVar, String str) {
        new C33233af().mo85061a(str).mo85063b(str).mo85071g(acVar.mo65711h()).mo85067e(String.valueOf(this.f68901m)).mo85252e();
    }

    /* renamed from: b */
    public final void mo59108b(List list, boolean z) {
        if (mo73385bf() && !C6307b.m19566a((Collection<T>) list)) {
            this.f75388s.mo74385i();
            if (!z) {
                this.f75388s.mo74378c();
            } else {
                this.f75388s.mo74379d();
            }
            if (list.get(0) instanceof FollowFeed) {
                list = C29452a.m96923a(list);
            } else if ("homepage_fresh".equalsIgnoreCase(aw_())) {
                list = m85646c(list);
            } else if (list.get(0) instanceof SearchAggregateCommodity) {
                if (this.f75360an instanceof C26112p) {
                    list = ((C26112p) this.f75360an).mo57985a();
                } else {
                    list = new ArrayList();
                }
            }
            List f = m85650f(list);
            this.f75394y.f73985a = z;
            mo67618b(f);
            final int a = C28482e.m93604a(f, this.f75394y.mo67568b(this.f75389t.getCurrentItem()));
            if (!this.f68885aD && this.f68890b_) {
                this.f75389t.post(new Runnable() {
                    public final void run() {
                        if (a < C26071a.this.f75394y.getCount() - 1 && C26071a.this.f75389t != null) {
                            C26071a.this.f75395z = a + 1;
                            C26071a.this.f75307B = true;
                            C26071a.this.f75389t.setCurrentItemWithDefaultVelocity(C26071a.this.f75395z);
                        }
                    }
                });
            }
            this.f68885aD = false;
            this.f68890b_ = false;
            m85631bF();
        }
    }

    /* renamed from: a */
    public final void mo67602a(int i, float f, int i2) {
        if (this.f68892d != null) {
            this.f68892d.mo74330a(i, f, i2);
        }
    }

    /* renamed from: a */
    public FeedPagerAdapter mo67600a(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        if (C26057e.m85590b(mo73389bj())) {
            ForwardFeedPagerAdapter forwardFeedPagerAdapter = new ForwardFeedPagerAdapter(context, layoutInflater, 10, zVar, fragment, onTouchListener, baseFeedPageParams);
            return forwardFeedPagerAdapter;
        } else if (this.f75327V.isShowVideoRank()) {
            PoiRankDetailFeedPagerAdapter poiRankDetailFeedPagerAdapter = new PoiRankDetailFeedPagerAdapter(context, layoutInflater, 10, zVar, fragment, onTouchListener, baseFeedPageParams);
            return poiRankDetailFeedPagerAdapter;
        } else {
            DetailFeedPagerAdapter detailFeedPagerAdapter = new DetailFeedPagerAdapter(context, layoutInflater, 10, zVar, fragment, onTouchListener, baseFeedPageParams);
            return detailFeedPagerAdapter;
        }
    }
}
