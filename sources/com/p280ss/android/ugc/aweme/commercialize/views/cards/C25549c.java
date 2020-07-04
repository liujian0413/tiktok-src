package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.model.C24989b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25271bj;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25358h;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25358h.C25359a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25363i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25364j;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer.C25414a;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25568n.C25569a;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28329l;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42968bb;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43466b;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.c */
public class C25549c implements C0053p<C23083a>, C25570o {

    /* renamed from: k */
    private static final String f67304k = "c";

    /* renamed from: a */
    public Context f67305a;

    /* renamed from: b */
    public Aweme f67306b;

    /* renamed from: c */
    public AdHalfWebPageContainer f67307c;

    /* renamed from: d */
    public AdHalfWebPageMaskLayer f67308d;

    /* renamed from: e */
    public C0608j f67309e;

    /* renamed from: f */
    public AbsHalfWebPageAction f67310f;

    /* renamed from: g */
    public int f67311g;

    /* renamed from: h */
    public AdHalfWebPageMaskLayer f67312h;

    /* renamed from: i */
    public DataCenter f67313i;

    /* renamed from: j */
    public C28130ac f67314j;

    /* renamed from: l */
    private AdHalfWebPageContainer f67315l;

    /* renamed from: m */
    private C0608j f67316m;

    /* renamed from: n */
    private AbsHalfWebPageAction f67317n;

    /* renamed from: o */
    private Handler f67318o;

    /* renamed from: p */
    private Runnable f67319p;

    /* renamed from: q */
    private long f67320q;

    /* renamed from: r */
    private long f67321r;

    /* renamed from: s */
    private C25358h f67322s;

    /* renamed from: t */
    private C25271bj f67323t;

    /* renamed from: u */
    private boolean f67324u;

    /* renamed from: v */
    private String f67325v;

    /* renamed from: w */
    private boolean f67326w;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.c$a */
    public static class C25557a {

        /* renamed from: a */
        public C25549c f67338a = new C25549c();

        /* renamed from: a */
        public final C25557a mo66337a(int i) {
            this.f67338a.f67311g = 1;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66338a(Context context) {
            this.f67338a.f67305a = context;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66339a(C0608j jVar) {
            this.f67338a.f67309e = jVar;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66340a(DataCenter dataCenter) {
            this.f67338a.f67313i = dataCenter;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66341a(AdHalfWebPageContainer adHalfWebPageContainer) {
            adHalfWebPageContainer.setUseZOrder(C42968bb.m136400a());
            this.f67338a.f67307c = adHalfWebPageContainer;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66342a(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f67338a.f67308d = adHalfWebPageMaskLayer;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66343a(C28130ac acVar) {
            this.f67338a.f67314j = acVar;
            return this;
        }

        /* renamed from: a */
        public final C25557a mo66344a(Aweme aweme) {
            this.f67338a.f67306b = aweme;
            return this;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo66319a(C24989b bVar) {
        if (!this.f67324u && m84004a(bVar.f65885b)) {
            this.f67313i.mo60134a("AD_ACTION_MOVE_OUT_DESC", (Object) Boolean.valueOf(C25364j.m83404d(this.f67306b)));
            this.f67318o.postDelayed(new C25564j(this, bVar), C25364j.m83405e(this.f67306b));
        }
    }

    /* renamed from: s */
    private void m84021s() {
        if (this.f67305a instanceof FragmentActivity) {
            C25568n a = m84001a(true);
            if (a != null) {
                this.f67316m.mo2645a().mo2587a(a.mo66305d()).mo2606d();
            }
        }
    }

    /* renamed from: u */
    private boolean m84023u() {
        if (!(this.f67317n instanceof AbsAdCardAction) || !((AbsAdCardAction) this.f67317n).f67271g) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo66329h() {
        this.f67313i.mo60134a("AD_ACTION_MOVE_IN_DESC", (Object) Boolean.valueOf(C25364j.m83404d(this.f67306b)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo66330i() {
        this.f67313i.mo60134a("AD_ACTION_MOVE_IN_DESC", (Object) Boolean.valueOf(C25364j.m83404d(this.f67306b)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo66331j() {
        this.f67313i.mo60134a("AD_ACTION_MOVE_IN_DESC", (Object) Boolean.valueOf(C25364j.m83404d(this.f67306b)));
    }

    private C25549c() {
        this.f67313i = new DataCenter();
        this.f67318o = new Handler(Looper.getMainLooper());
        this.f67320q = -1;
        this.f67321r = -1;
        this.f67324u = false;
        this.f67325v = null;
        this.f67326w = false;
    }

    /* renamed from: m */
    private void m84015m() {
        if (C25352e.m83202D(this.f67306b)) {
            C43466b.m137930a(C25352e.m83240w(this.f67306b));
            C43466b.m137931b(C25352e.m83204F(this.f67306b));
            C43466b.m137928a(1);
            C43466b.m137929a(this.f67306b);
        }
    }

    /* renamed from: o */
    private void m84017o() {
        this.f67313i.mo60132a("ACTION_HALF_WEB_PAGE_SHOW", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("ACTION_HALF_WEB_PAGE_HIDE", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("ACTION_HALF_WEB_PAGE_COLLAPSE", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("ACTION_TOP_WEB_PAGE_HIDE", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("ad_comment_dialog_visible", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("ad_share_dialog_visible", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("on_ad_light_web_page_show", (C0053p<C23083a>) this);
        this.f67313i.mo60132a("on_ad_light_web_page_hide", (C0053p<C23083a>) this);
    }

    /* renamed from: p */
    private void m84018p() {
        this.f67326w = true;
        if (C25352e.m83231n(this.f67306b) && !C25352e.m83337ai(this.f67306b)) {
            C25352e.m83338aj(this.f67306b);
        }
        this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
        C24952c.m81886b(this.f67306b, 0);
        C25363i.m83389a(this.f67306b);
    }

    /* renamed from: q */
    private void m84019q() {
        if (this.f67307c.mo65980b()) {
            this.f67307c.mo65979b(C25364j.m83404d(this.f67306b));
            this.f67307c.postDelayed(new C25561g(this), C25364j.m83405e(this.f67306b));
            this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    /* renamed from: r */
    private void m84020r() {
        if (this.f67309e != null && m84001a(false) != null) {
            C0633q a = this.f67309e.mo2645a();
            C25568n a2 = m84001a(false);
            if (a2 != null) {
                a.mo2587a(a2.mo66305d());
                a.mo2606d();
            }
        }
    }

    /* renamed from: t */
    private boolean m84022t() {
        boolean z;
        boolean z2;
        if (this.f67310f == null || !this.f67310f.f67271g) {
            z = false;
        } else {
            z = true;
        }
        if (this.f67317n == null || !this.f67317n.f67271g) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo66326e() {
        if (!this.f67324u) {
            if (this.f67308d != null && this.f67308d.f66877a) {
                this.f67308d.mo66010c();
            }
            if (this.f67312h != null && this.f67312h.f66877a) {
                this.f67312h.mo66010c();
            }
        }
    }

    /* renamed from: f */
    public final void mo66327f() {
        if (!this.f67324u && this.f67319p != null && this.f67320q > 0 && this.f67321r > 0) {
            this.f67321r = System.currentTimeMillis();
            this.f67318o.postDelayed(this.f67319p, this.f67320q);
        }
    }

    /* renamed from: g */
    public final void mo66328g() {
        if (!this.f67324u && this.f67319p != null && this.f67321r > 0 && this.f67320q > 0) {
            this.f67320q -= System.currentTimeMillis() - this.f67321r;
            this.f67318o.removeCallbacks(this.f67319p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo66332k() {
        if (!this.f67324u) {
            this.f67321r = -1;
            this.f67320q = -1;
            if (!m84022t() && this.f67307c.mo65978a()) {
                this.f67313i.mo60134a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }

    /* renamed from: l */
    private void m84014l() {
        LayoutParams layoutParams = this.f67307c.getLayoutParams();
        CardStruct w = C25352e.m83240w(this.f67306b);
        int b = (int) C9738o.m28708b(this.f67305a, 138.0f);
        if (w != null) {
            switch (w.getCardStyle()) {
                case 0:
                    if (w.getCardType() == 2) {
                        b = (int) C9738o.m28708b(this.f67305a, 147.0f);
                        break;
                    }
                    break;
                case 1:
                    b = (int) C9738o.m28708b(this.f67305a, 130.0f);
                    break;
                case 2:
                    layoutParams.width = (int) C9738o.m28708b(this.f67305a, 260.0f);
                    break;
            }
        }
        layoutParams.height = b;
        this.f67307c.setLayoutParams(layoutParams);
        this.f67307c.setInCleanMode(false);
        this.f67307c.mo65983e();
        this.f67307c.mo65982d();
        this.f67307c.mo65981c();
        this.f67308d.mo66009b();
    }

    /* renamed from: n */
    private void m84016n() {
        AdHalfWebPageFragmentV2 a = AdHalfWebPageFragmentV2.m83953a(C25352e.m83331ac(this.f67306b));
        if (a != null) {
            this.f67310f = C25364j.m83398a(this.f67305a, this.f67306b, a);
            this.f67310f.mo66286a(this.f67313i);
            a.mo66300a((C25569a) new C25569a() {
                /* renamed from: a */
                public final void mo66333a() {
                    C25549c.this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                }

                /* renamed from: b */
                public final void mo66334b() {
                    if (C25549c.this.f67310f == null || !C25549c.this.f67310f.f67271g) {
                        C25549c.this.f67313i.mo60134a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                    } else {
                        C25549c.this.f67313i.mo60134a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) Boolean.valueOf(true));
                    }
                }
            });
            View a2 = C25364j.m83397a((ViewGroup) this.f67307c);
            if (a2 != null) {
                C0633q a3 = this.f67309e.mo2645a();
                a3.mo2600b(a2.getId(), a.mo66305d(), "card_default");
                a3.mo2606d();
            }
        }
    }

    /* renamed from: a */
    public final void mo66316a() {
        if (!this.f67324u) {
            m84014l();
            m84015m();
            m84016n();
            mo66321b();
            m84017o();
        }
    }

    /* renamed from: b */
    public final void mo66321b() {
        if (!this.f67324u && this.f67305a != null && (this.f67305a instanceof FragmentActivity)) {
            this.f67316m = ((FragmentActivity) this.f67305a).getSupportFragmentManager();
            this.f67315l = (AdHalfWebPageContainer) ((FragmentActivity) this.f67305a).findViewById(R.id.dp);
            this.f67312h = (AdHalfWebPageMaskLayer) ((FragmentActivity) this.f67305a).findViewById(R.id.dq);
            if (this.f67316m != null && this.f67315l != null && this.f67312h != null) {
                CardStruct F = C25352e.m83204F(this.f67306b);
                if (F == null) {
                    this.f67315l.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f67315l.getLayoutParams();
                if (F.getCardType() == 9) {
                    layoutParams.height = (int) C9738o.m28708b(this.f67305a, 342.0f);
                } else if (F.getCardType() == 8) {
                    layoutParams.height = (int) C9738o.m28708b(this.f67305a, 295.0f);
                } else if (F.getCardType() != 1001) {
                    return;
                }
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.f67315l.mo65981c();
                this.f67315l.setLayoutParams(layoutParams);
                this.f67312h.mo66009b();
                C0633q a = this.f67316m.mo2645a();
                AdHalfWebPageFragmentV2 a2 = AdHalfWebPageFragmentV2.m83953a(C25352e.m83332ad(this.f67306b));
                a2.mo66300a((C25569a) new C25569a() {
                    /* renamed from: a */
                    public final void mo66333a() {
                    }

                    /* renamed from: b */
                    public final void mo66334b() {
                        C25549c.this.f67313i.mo60134a("ACTION_TOP_WEB_PAGE_HIDE", (Object) Boolean.valueOf(true));
                    }
                });
                this.f67317n = new TopPageAction(this.f67305a, this.f67306b, a2);
                this.f67317n.mo66286a(this.f67313i);
                ((TopPageAction) this.f67317n).f67294h = new C25558d(this);
                a.mo2586a(R.id.dp, a2.mo66305d(), "card_tag_top_page");
                a.mo2601b(a2.mo66305d()).mo2606d();
            }
        }
    }

    /* renamed from: c */
    public final void mo66324c() {
        if (!this.f67324u) {
            this.f67324u = true;
            if (this.f67307c != null && this.f67307c.mo65980b()) {
                this.f67310f.mo60992b();
            }
            m84020r();
            m84021s();
            if (this.f67310f != null) {
                this.f67310f.mo66293e();
                this.f67310f = null;
            }
            if (this.f67317n != null) {
                this.f67317n.mo66293e();
                this.f67317n = null;
            }
            this.f67313i.mo60131a((C0053p<C23083a>) this);
            if (this.f67318o != null) {
                this.f67318o.removeCallbacksAndMessages(null);
                this.f67318o = null;
                this.f67319p = null;
            }
            C25364j.m83406f(this.f67306b);
        }
    }

    /* renamed from: d */
    public final void mo66325d() {
        if (!this.f67324u) {
            String b = m84006b(false);
            if (!TextUtils.isEmpty(b)) {
                this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (Object) b);
            } else if (!this.f67307c.f66855b) {
                final C25568n a = m84001a(false);
                if (a != null) {
                    a.mo66302a(true);
                    this.f67322s = new C25358h((Activity) this.f67305a, this.f67307c);
                    this.f67322s.mo65922b();
                    this.f67322s.f66759c = new C25359a() {
                        /* renamed from: a */
                        public final void mo65924a(boolean z) {
                            a.mo66304b(z);
                        }
                    };
                    C25367k.m83411a(this.f67305a, a.mo66306e());
                    int width = this.f67307c.getWidth();
                    int a2 = C25364j.m83396a(C25364j.m83399a(this.f67306b), (View) this.f67307c);
                    if (!this.f67307c.mo65978a()) {
                        this.f67307c.mo65984f();
                        this.f67307c.mo65974a(this.f67307c.getWidth(), a2);
                        this.f67307c.mo65985g();
                    }
                    this.f67307c.mo65975a(width, a2, 100);
                    this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_EXPAND", (Object) null);
                    this.f67308d.setCallback(new C25414a() {
                        /* renamed from: b */
                        public final void mo66019b() {
                        }

                        /* renamed from: a */
                        public final void mo66017a() {
                            C25549c.this.f67308d.postDelayed(new C25565k(this), 200);
                            C42961az.m136380a(new C28329l(false));
                        }

                        /* access modifiers changed from: 0000 */
                        /* renamed from: c */
                        public final /* synthetic */ void mo66335c() {
                            if (C25549c.this.f67308d.f66877a) {
                                if (!C43316v.m137250H()) {
                                    C43316v.m137450K().mo104948x();
                                    return;
                                }
                                C44960f a = C25549c.m84002a(C25549c.this.f67314j);
                                if (a != null) {
                                    a.mo71672ad();
                                    return;
                                }
                                C44933a.m141791a().mo71672ad();
                            }
                        }

                        /* renamed from: a */
                        public final void mo66018a(boolean z) {
                            if (C25549c.this.f67311g == 0 && z) {
                                if (!C43316v.m137250H()) {
                                    C43316v.m137450K().mo104946v();
                                } else {
                                    C44960f a = C25549c.m84002a(C25549c.this.f67314j);
                                    if (a != null) {
                                        a.mo71671ac();
                                    } else {
                                        C44933a.m141791a().mo71671ac();
                                    }
                                }
                            }
                            C42961az.m136380a(new C28329l(true));
                        }
                    });
                    this.f67308d.mo66008a();
                }
            }
        }
    }

    /* renamed from: a */
    public static C44960f m84002a(C28130ac acVar) {
        if (acVar == null) {
            return null;
        }
        return acVar.mo71553b();
    }

    /* renamed from: b */
    private void m84009b(String str) {
        this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (Object) str);
        C25363i.m83393b(this.f67306b, str);
    }

    /* renamed from: b */
    private void m84007b(int i) {
        if (i > 0) {
            this.f67319p = new C25560f(this);
            this.f67321r = System.currentTimeMillis();
            this.f67320q = (long) (i * 1000);
            this.f67318o.postDelayed(this.f67319p, this.f67320q);
        }
    }

    /* renamed from: c */
    private void m84010c(C24989b bVar) {
        if (bVar != null) {
            this.f67318o.postDelayed(new C25559e(this, bVar), (long) bVar.f65884a);
        }
    }

    /* renamed from: a */
    private C25568n m84001a(boolean z) {
        if (z) {
            if (this.f67316m != null) {
                Fragment a = this.f67316m.mo2644a("card_tag_top_page");
                if (a instanceof C25568n) {
                    return (C25568n) a;
                }
            }
        } else if (this.f67309e != null) {
            Fragment a2 = this.f67309e.mo2644a("card_default");
            if (a2 instanceof C25568n) {
                return (C25568n) a2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private String m84006b(boolean z) {
        boolean z2;
        AbsHalfWebPageAction absHalfWebPageAction;
        C25568n a = m84001a(z);
        boolean z3 = false;
        if (a != null) {
            z3 = a.mo66307f();
            if (z) {
                absHalfWebPageAction = this.f67317n;
            } else {
                absHalfWebPageAction = this.f67310f;
            }
            z2 = m84005a(z3, absHalfWebPageAction);
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("checkLoadStatus() called isTopPage = ");
            sb.append(z);
            sb.append(" loadSuccess = ");
            sb.append(z3);
            sb.append(" renderSuccess = ");
            sb.append(z2);
            return null;
        } else if (!z3) {
            return "data_load_fail";
        } else {
            return "load_timeout";
        }
    }

    /* renamed from: c */
    private void m84011c(String str) {
        this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (Object) str);
        C24952c.m81886b(this.f67306b, 1);
        C25363i.m83390a(this.f67306b, str);
    }

    /* renamed from: d */
    private void m84013d(boolean z) {
        if (this.f67322s != null) {
            this.f67322s.mo65923c();
            this.f67322s = null;
        }
        if (this.f67323t != null) {
            this.f67323t.mo65885a(false);
            this.f67323t = null;
        }
        C25367k.m83410a(this.f67305a);
        this.f67315l.mo65976a(400, (Runnable) new C25563i(this));
        this.f67312h.dismiss(z);
        this.f67313i.mo60134a("ON_AD_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo66320a(C25548b bVar) {
        String str;
        CardStruct F = C25352e.m83204F(this.f67306b);
        if (F != null) {
            str = F.getCardUrl();
        } else {
            str = "";
        }
        C25568n a = m84001a(false);
        if (a != null) {
            a.mo66301a(C1642a.m8035a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{str, Integer.valueOf(bVar.f67299a)}));
        }
    }

    /* renamed from: c */
    private void m84012c(boolean z) {
        if (this.f67322s != null) {
            this.f67322s.mo65923c();
            this.f67322s = null;
        }
        if (this.f67323t != null) {
            this.f67323t.mo65885a(false);
            this.f67323t = null;
        }
        C25367k.m83410a(this.f67305a);
        this.f67307c.mo65976a(400, (Runnable) new C25562h(this));
        this.f67313i.mo60134a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (Object) null);
        this.f67308d.dismiss(z);
    }

    /* renamed from: a */
    private boolean m84004a(String str) {
        if (!C25352e.m83203E(this.f67306b)) {
            m84009b("not satisfied");
            return false;
        } else if (C28418f.m93413a().f74937g) {
            m84009b("has shown once");
            return false;
        } else {
            boolean b = DownloaderManagerHolder.m75524a().mo51673b(C25352e.m83241x(this.f67306b));
            boolean b2 = C6776h.m20948b(this.f67305a, C25352e.m83305P(this.f67306b));
            if (C25352e.m83202D(this.f67306b) && (b || b2)) {
                m84009b("already download started or installed");
                return false;
            } else if (this.f67307c.mo65978a() || this.f67326w) {
                m84009b("already shown once");
                return false;
            } else if (m84023u()) {
                m84009b("top page is showing");
                return false;
            } else {
                String b3 = m84006b(false);
                if (TextUtils.isEmpty(b3) || !TextUtils.equals(str, "passive_show") || !C28418f.m93413a().f74938h) {
                    if (b3 == null) {
                        b3 = this.f67325v;
                    }
                    if (TextUtils.isEmpty(b3)) {
                        return true;
                    }
                    m84011c(b3);
                    return false;
                }
                m84009b("search: just enter");
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (!this.f67324u && aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            boolean z = false;
            switch (str.hashCode()) {
                case -2033402377:
                    if (str.equals("ad_comment_dialog_visible")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1282907273:
                    if (str.equals("ad_share_dialog_visible")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c = 6;
                        break;
                    }
                    break;
                case -786416465:
                    if (str.equals("ACTION_HALF_WEB_PAGE_COLLAPSE")) {
                        c = 2;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c = 9;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c = 8;
                        break;
                    }
                    break;
                case 683265860:
                    if (str.equals("ACTION_HALF_WEB_PAGE_HIDE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 683592959:
                    if (str.equals("ACTION_HALF_WEB_PAGE_SHOW")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1000414804:
                    if (str.equals("ACTION_TOP_WEB_PAGE_HIDE")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            String str2 = null;
            switch (c) {
                case 0:
                    m84010c((C24989b) aVar.mo60161a());
                    return;
                case 1:
                    m84019q();
                    C28418f.m93413a().f74937g = true;
                    return;
                case 2:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    m84012c(z);
                    C28418f.m93413a().f74937g = true;
                    return;
                case 3:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    m84013d(z);
                    C28418f.m93413a().f74937g = true;
                    return;
                case 4:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    if (z) {
                        str2 = "comment_block";
                    }
                    this.f67325v = str2;
                    return;
                case 5:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    if (z) {
                        str2 = "share_block";
                    }
                    this.f67325v = str2;
                    return;
                case 6:
                    this.f67325v = "lightpage_block";
                    m84019q();
                    return;
                case 7:
                    this.f67325v = null;
                    return;
                case 8:
                    this.f67325v = "popup_webpage_block";
                    return;
                case 9:
                    this.f67325v = null;
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo66317a(int i) {
        final boolean z;
        if (!this.f67324u) {
            final C25568n a = m84001a(true);
            if (a != null) {
                if (!C21115b.m71197a().isLogin()) {
                    C32656f.m105747a(a.mo66305d(), "", "click_get_coupon", C42914ab.m136242a().mo104633a("login_title", this.f67305a.getString(R.string.ahx)).f111445a);
                } else if (this.f67315l != null && this.f67316m != null) {
                    String b = m84006b(true);
                    if (!TextUtils.isEmpty(b)) {
                        this.f67313i.mo60134a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (Object) b);
                        return;
                    }
                    a.mo66302a(true);
                    if (this.f67307c.mo65978a() && (i == 17 || i == 25)) {
                        this.f67307c.mo65979b(C25364j.m83404d(this.f67306b));
                    }
                    if (i == 8 || this.f67311g == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f67305a instanceof Activity) {
                        if (this.f67323t != null) {
                            this.f67323t.mo65885a(false);
                            this.f67323t = null;
                        }
                        this.f67323t = new C25271bj((Activity) this.f67305a) {
                            /* renamed from: a */
                            public final boolean mo60522a(int i, KeyEvent keyEvent) {
                                if (i != 4) {
                                    return false;
                                }
                                C25549c.this.f67313i.mo60134a("ACTION_TOP_WEB_PAGE_HIDE", (Object) Boolean.valueOf(!z));
                                return true;
                            }
                        };
                        this.f67323t.mo65885a(true);
                    }
                    this.f67312h.setCallback(new C25414a() {
                        /* renamed from: a */
                        public final void mo66017a() {
                            C25549c.this.f67312h.postDelayed(new C25566l(this), 200);
                        }

                        /* renamed from: b */
                        public final void mo66019b() {
                            C25549c.this.f67313i.mo60134a("ACTION_TOP_WEB_PAGE_HIDE", (Object) Boolean.valueOf(!z));
                        }

                        /* access modifiers changed from: 0000 */
                        /* renamed from: c */
                        public final /* synthetic */ void mo66336c() {
                            if (C25549c.this.f67312h.f66877a) {
                                if (!C43316v.m137250H()) {
                                    C43316v.m137450K().mo104948x();
                                    return;
                                }
                                C44960f a = C25549c.m84002a(C25549c.this.f67314j);
                                if (a != null) {
                                    a.mo71672ad();
                                    return;
                                }
                                C44933a.m141791a().mo71672ad();
                            }
                        }

                        /* renamed from: a */
                        public final void mo66018a(boolean z) {
                            if (!z && z) {
                                if (!C43316v.m137250H()) {
                                    C43316v.m137450K().mo104946v();
                                    return;
                                }
                                C44960f a = C25549c.m84002a(C25549c.this.f67314j);
                                if (a != null) {
                                    a.mo71671ac();
                                    return;
                                }
                                C44933a.m141791a().mo71671ac();
                            }
                        }
                    });
                    this.f67312h.mo66008a();
                    this.f67316m.mo2645a().mo2605c(a.mo66305d()).mo2606d();
                    if (C25364j.m83407g(this.f67306b)) {
                        this.f67322s = new C25358h((Activity) this.f67305a, this.f67315l);
                        this.f67322s.mo65922b();
                        this.f67322s.f66759c = new C25359a() {
                            /* renamed from: a */
                            public final void mo65924a(boolean z) {
                                a.mo66304b(z);
                            }
                        };
                        C25367k.m83411a(this.f67305a, a.mo66306e());
                    }
                    int width = this.f67315l.getWidth();
                    int a2 = C25364j.m83396a(C25364j.m83402b(this.f67306b), (View) this.f67315l);
                    if (!this.f67315l.mo65978a()) {
                        this.f67315l.mo65984f();
                        this.f67315l.mo65974a(this.f67315l.getWidth(), a2);
                        this.f67315l.mo65985g();
                    }
                    this.f67315l.mo65975a(width, a2, 100);
                    this.f67313i.mo60134a("ON_AD_TOP_WEB_PAGE_SHOW", (Object) null);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo66323b(C24989b bVar) {
        if (!this.f67324u) {
            C25364j.m83400a(this.f67305a, this.f67306b, this.f67307c, bVar.f65886c);
            this.f67307c.mo65977a(C25364j.m83404d(this.f67306b));
            m84007b(C25364j.m83403c(this.f67306b));
            m84018p();
        }
    }

    /* renamed from: a */
    private boolean m84005a(boolean z, AbsHalfWebPageAction absHalfWebPageAction) {
        if (this.f67310f instanceof AbsAdCardAction) {
            return ((AbsAdCardAction) absHalfWebPageAction).mo66282c();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo66322b(int i, int i2) {
        if (!this.f67324u) {
            if (i != 0 || i2 != 0) {
                LayoutParams layoutParams = this.f67315l.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C23486n.m77123a(this.f67305a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C23486n.m77123a(this.f67305a, i2);
                }
                this.f67315l.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo66318a(int i, int i2) {
        if (!this.f67324u) {
            if (i != 0 || i2 != 0) {
                LayoutParams layoutParams = this.f67307c.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C23486n.m77123a(this.f67305a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C23486n.m77123a(this.f67305a, i2);
                }
                this.f67307c.setLayoutParams(layoutParams);
            }
        }
    }
}
