package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.experiment.C27685a;
import com.p280ss.android.ugc.aweme.feed.C28208al;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28330m;
import com.p280ss.android.ugc.aweme.feed.event.C28342y;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoInteractionExperiment;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.C28350a;
import com.p280ss.android.ugc.aweme.feed.helper.C28417e;
import com.p280ss.android.ugc.aweme.feed.helper.C28419g;
import com.p280ss.android.ugc.aweme.feed.helper.C28421i;
import com.p280ss.android.ugc.aweme.feed.helper.C28426n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28466r;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28473w;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28480c;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28491k;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33283y;
import com.p280ss.android.ugc.aweme.metrics.C33284z;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42960ay;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.br */
public final class C28852br extends C28894e implements C0053p<C23083a>, C28466r {

    /* renamed from: A */
    private String f76066A;

    /* renamed from: B */
    private C28350a f76067B;

    /* renamed from: a */
    DiggAnimationView f76068a;

    /* renamed from: b */
    TextView f76069b;

    /* renamed from: c */
    View f76070c;

    /* renamed from: d */
    public boolean f76071d;

    /* renamed from: e */
    public C28473w f76072e;

    /* renamed from: f */
    public String f76073f;

    /* renamed from: r */
    public OnClickListener f76074r = new OnClickListener() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo74127a(View view) {
            C28852br.this.f76074r.onClick(view);
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            int c = C28344a.m93112c();
            boolean z = false;
            if (c == 0) {
                z = !C6861a.m21337f().isLogin();
            } else if (c > 0 && !C6861a.m21337f().isLogin() && !C28852br.this.f76071d && C28852br.this.f76169g.getUserDigg() == 0 && C28208al.m92714a() >= c) {
                z = true;
            }
            if (z) {
                new C33284z().mo85388a(C28852br.this.f76073f).mo85387a(C28852br.this.f76173k).mo85390b(C28852br.this.f76169g.getAid()).mo85071g(C28852br.this.f76169g).mo85392c("click_like").mo85389b(C28208al.m92718c() ^ true ? 1 : 0).mo85391c(1).mo85252e();
                if (!C28208al.m92718c()) {
                    C28208al.m92717b();
                }
                if (TextUtils.equals(C28852br.this.f76073f, "homepage_hot")) {
                    str = "";
                } else {
                    str = C28852br.this.f76175m.getString(R.string.bz5);
                }
                if (C28852br.this.f76169g != null) {
                    str2 = C28852br.this.f76169g.getAid();
                } else {
                    str2 = "";
                }
                C32656f.m105744a((Activity) C28852br.this.f76175m, C28852br.this.f76073f, "click_like", C42914ab.m136242a().mo104633a("login_title", str).mo104633a("group_id", str2).mo104633a("log_pb", C33230ac.m107234j(str2)).f111445a, (C23305g) new C28855bs(this, view));
            } else if (C32698a.m105818a(C28852br.this.f76169g) && C28852br.this.f76169g.getUserDigg() == 0) {
                C10761a.m31403c(C28852br.this.f76175m, C32698a.m105817a(C28852br.this.f76169g, R.string.fp_)).mo25750a();
            } else if (C28852br.this.f76169g.isCanPlay() || C28852br.this.f76169g.getUserDigg() != 0) {
                if (C28852br.this.f76169g.isDelete() && C28852br.this.f76169g.getUserDigg() == 0) {
                    C10761a.m31399c(C28852br.this.f76175m, (int) R.string.fp_).mo25750a();
                } else if (C28852br.this.f76169g.getVideoControl() != null && C28852br.this.f76169g.getVideoControl().timerStatus == 0) {
                    C10761a.m31409e(C28852br.this.f76175m, (int) R.string.foi).mo25750a();
                } else if (C28852br.this.f76071d || !C43168s.m136911c(C28852br.this.f76169g) || !C43168s.m136909a(C28852br.this.f76169g)) {
                    C28852br.this.f76068a.mo74355a(view);
                    if (!C28856bt.m94954a(C28852br.this.f76175m)) {
                        C10761a.m31399c(C28852br.this.f76175m, (int) R.string.cjs).mo25750a();
                    } else {
                        C28852br.this.mo74123a(C28852br.this.f76169g);
                    }
                } else {
                    C10761a.m31409e(C28852br.this.f76175m, (int) R.string.fsr).mo25750a();
                }
            } else if (C28852br.this.f76169g.isImage()) {
                C10761a.m31399c(C28852br.this.f76175m, (int) R.string.bsx).mo25750a();
            } else {
                C10761a.m31399c(C28852br.this.f76175m, (int) R.string.fp_).mo25750a();
            }
        }
    };

    /* renamed from: s */
    private int f76075s;

    /* renamed from: t */
    private int f76076t;

    /* renamed from: u */
    private int f76077u;

    /* renamed from: v */
    private View f76078v;

    /* renamed from: w */
    private Drawable f76079w;

    /* renamed from: x */
    private String f76080x;

    /* renamed from: y */
    private String f76081y;

    /* renamed from: z */
    private String f76082z;

    /* renamed from: a */
    public final void mo72018a() {
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        C28498o.m93660a(this.f76169g, this.f76176n, true, true);
        boolean z = false;
        this.f76075s = this.f76169g.getStatistics() == null ? 0 : this.f76169g.getStatistics().getDiggCount();
        this.f76076t = this.f76075s;
        this.f76077u = this.f76169g.getUserDigg();
        mo73965b();
        if (this.f76169g.getUserDigg() == 1) {
            z = true;
        }
        m94929a(z);
        m94935i();
        if (!C27685a.f72985a.mo71138a(this.f76073f, this.f76169g)) {
            return;
        }
        if (C27685a.f72985a.mo71137a() || C27685a.f72985a.mo71139b()) {
            this.f76176n.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo74123a(Aweme aweme) {
        if (this.f76175m == null || aweme == null) {
            StringBuilder sb = new StringBuilder("handleDiggClick:");
            sb.append(String.valueOf(this.f76175m));
            sb.append(",aweme:");
            sb.append(String.valueOf(aweme));
            C6921a.m21552a(6, "VideoDiggView", sb.toString());
            return;
        }
        C28419g.m93414a().mo72155b(this.f76068a, this.f76073f, C33230ac.m107238m(this.f76169g), C33230ac.m107205a(this.f76169g));
        this.f76174l.mo60134a("handle_digg_click", (Object) aweme);
        if (this.f76071d || aweme.getUserDigg() != 0) {
            boolean z = false;
            if (!this.f76071d || aweme.getUserDigg() == 0) {
                if (aweme.getUserDigg() == 1) {
                    z = true;
                }
                this.f76071d = z;
                m94938l();
                m94929a(this.f76071d);
                if (this.f76071d) {
                    this.f76075s++;
                } else {
                    this.f76075s--;
                }
            } else {
                this.f76174l.mo60134a("video_digg", (Object) Integer.valueOf(6));
                this.f76075s--;
                m94929a(false);
                m94930b(aweme);
            }
        } else {
            this.f76174l.mo60134a("video_digg", (Object) Integer.valueOf(5));
            this.f76075s++;
            m94929a(true);
            m94927a(aweme, "click_like");
        }
    }

    /* renamed from: a */
    public final void mo72204a(final Exception exc) {
        if (!C6903bc.m21483b().mo61553a(exc)) {
            mo74124b(exc);
        } else if (this.f76175m instanceof FragmentActivity) {
            C6903bc.m21483b().mo61552a(((FragmentActivity) this.f76175m).getSupportFragmentManager(), (ApiServerException) exc, new C23637b() {
                /* renamed from: a */
                public final void mo57592a() {
                    C28852br.this.f76072e.mo56975R_();
                }

                /* renamed from: b */
                public final void mo57593b() {
                    C28852br.this.mo74124b(exc);
                }
            });
        }
    }

    /* renamed from: j */
    private static String m94936j() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_DIGG_TEXT;
        }
        return "0";
    }

    /* renamed from: k */
    private JSONObject m94937k() {
        return C28480c.m93600a(this.f76169g, this.f76173k, this.f76177o, this.f76073f);
    }

    /* renamed from: i */
    private void m94935i() {
        this.f76070c.setOnClickListener(this.f76074r);
        this.f76069b.setOnClickListener(this.f76074r);
        this.f76078v.setOnClickListener(this.f76074r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo74125c() {
        Boolean bool = (Boolean) this.f76068a.getTag(C29132a.d6i);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: l */
    private void m94938l() {
        int i;
        if (!C6399b.m19944t()) {
            Context context = this.f76175m;
            if (this.f76071d) {
                i = R.string.rx;
            } else {
                i = R.string.ry;
            }
            String string = context.getString(i, new Object[]{C30537o.m99738a((long) this.f76075s)});
            this.f76078v.setContentDescription(string);
            this.f76068a.setContentDescription(string);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73965b() {
        boolean z;
        if (!C29132a.m95560a()) {
            this.f76068a.setImageDrawable(this.f76079w);
            return;
        }
        Drawable c = C29125d.m95523c();
        DiggAnimationView diggAnimationView = this.f76068a;
        int i = C29132a.d6i;
        if (c != null) {
            z = true;
        } else {
            z = false;
        }
        diggAnimationView.setTag(i, Boolean.valueOf(z));
        if (c == null) {
            c = this.f76079w;
        }
        this.f76068a.setImageDrawable(c);
    }

    /* renamed from: a */
    private String m94925a(int i) {
        if (C32698a.m105818a(this.f76169g)) {
            return "0";
        }
        if (i <= 0) {
            return m94936j();
        }
        return C30537o.m99738a((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("video_resume_play", (C0053p<C23083a>) this).mo60132a("handle_double_click", (C0053p<C23083a>) this).mo60132a("show_festival_activity_icon", (C0053p<C23083a>) this);
        }
    }

    @C7709l
    public final void onEventDiggUpdate(C28342y yVar) {
        if (yVar != null && TextUtils.equals(yVar.f74669a, C33230ac.m107238m(this.f76169g))) {
            m94929a(yVar.f74670b);
        }
    }

    /* renamed from: b */
    private void m94931b(boolean z) {
        int i;
        if (this.f76169g != null) {
            this.f76071d = z;
            m94938l();
            this.f76068a.setSelected(z);
            if (this.f76169g.getStatistics() == null) {
                i = 0;
            } else {
                i = this.f76169g.getStatistics().getDiggCount();
            }
            this.f76075s = i;
            if (this.f76075s < 0) {
                this.f76075s = 0;
            }
            this.f76069b.setText(m94925a(this.f76075s));
        }
    }

    /* renamed from: d */
    private void m94933d(Aweme aweme) {
        if (this.f76175m != null && aweme != null) {
            if (!this.f76071d) {
                this.f76075s++;
                m94929a(true);
                return;
            }
            if (this.f76071d) {
                this.f76075s--;
                m94929a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo72203a(C0902i<String, Integer> iVar) {
        this.f76174l.mo60134a("digg_success", (Object) iVar);
        C42961az.m136380a(new C28318an(13, iVar.f3154a));
        if (C6399b.m19944t() && ((Integer) iVar.f3155b).intValue() == 1) {
            C42960ay.m136379a();
        }
        C26682g.f70355a.mo68414a(this.f76169g, 4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            boolean z = false;
            if (hashCode != -1475411887) {
                if (hashCode != 281945252) {
                    if (hashCode != 350216171) {
                        if (hashCode == 710615618 && str.equals("video_resume_play")) {
                            c = 0;
                        }
                    } else if (str.equals("on_page_selected")) {
                        c = 2;
                    }
                } else if (str.equals("show_festival_activity_icon")) {
                    c = 3;
                }
            } else if (str.equals("handle_double_click")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    Aweme aweme = (Aweme) aVar.mo60161a();
                    if (aweme != null && aweme.isAd()) {
                        if (aweme.getUserDigg() == 1) {
                            z = true;
                        }
                        m94931b(z);
                        return;
                    }
                case 1:
                    m94934e((Aweme) aVar.mo60161a());
                    return;
                case 2:
                case 3:
                    mo73965b();
                    break;
            }
        }
    }

    /* renamed from: c */
    private C6869c m94932c(Aweme aweme) {
        C6869c a = new C6869c().mo16887a("author_id", C33230ac.m107205a(aweme)).mo16887a("request_id", C33230ac.m107206a(aweme, this.f76173k)).mo16887a("is_photo", C33230ac.m107239n(aweme));
        if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
            a.mo16887a("poi_id", C33230ac.m107223e(aweme));
        }
        if (C33230ac.m107220c(this.f76073f)) {
            a.mo16887a("poi_type", C33230ac.m107229h(aweme)).mo16887a("poi_channel", C33230ac.m107214b()).mo16887a("city_info", C33230ac.m107204a()).mo16887a("distance_info", C33230ac.m107231i(aweme));
        }
        return a;
    }

    /* renamed from: e */
    private void m94934e(Aweme aweme) {
        if (this.f76175m != null && aweme != null && !C6903bc.m21484c().mo59240a() && !this.f76071d && aweme.getUserDigg() == 0) {
            this.f76174l.mo60134a("video_digg", (Object) Integer.valueOf(5));
            this.f76075s++;
            m94929a(true);
            if (mo74125c()) {
                C28491k.m93636a(this.f76068a);
            } else {
                this.f76068a.mo74354a();
            }
            m94927a(aweme, "click_double_like");
        }
    }

    /* renamed from: b */
    private void m94930b(Aweme aweme) {
        Aweme aweme2 = aweme;
        C42961az.m136380a(new C28330m());
        if (!C6900g.m21454b().mo16943d()) {
            C10761a.m31399c(this.f76175m, (int) R.string.cjs).mo25750a();
        } else if (aweme2 != null) {
            new C33283y("like_cancel").mo85380d(this.f76073f).mo85381e(this.f76080x).mo85376b(this.f76173k).mo85071g(aweme2).mo85386j(this.f76066A).mo85252e();
            if (!C6399b.m19944t() || !TextUtils.equals("opus", this.f76073f)) {
                C6907h.m21519a(this.f76175m, "like_cancel", this.f76073f, aweme.getAid(), 0, m94937k());
            } else if (this.f76172j) {
                C6907h.m21519a(this.f76175m, "like_cancel", "personal_homepage", aweme.getAid(), 0, m94937k());
            } else {
                C6907h.m21519a(this.f76175m, "like_cancel", "others_homepage", aweme.getAid(), 0, m94937k());
            }
            if (aweme.getAwemeType() != 34) {
                m94928a(aweme.getAid(), 0);
            } else {
                C24671f.m80851a().mo64676g(this.f76175m, aweme2);
            }
        }
    }

    /* renamed from: a */
    private void m94929a(boolean z) {
        int i;
        int i2;
        if (this.f76169g != null) {
            this.f76071d = z;
            m94938l();
            this.f76068a.setSelected(z);
            if (z) {
                if (this.f76077u == 1) {
                    if (this.f76076t <= 0 && !this.f76169g.isDelete()) {
                        this.f76076t = 1;
                    }
                    i = this.f76076t;
                    this.f76174l.mo60134a("update_diig_view", (Object) Boolean.valueOf(z));
                } else {
                    i2 = this.f76076t + 1;
                }
            } else if (this.f76077u != 1 || this.f76169g.isDelete()) {
                i = this.f76076t;
                this.f76174l.mo60134a("update_diig_view", (Object) Boolean.valueOf(z));
            } else {
                i2 = this.f76076t - 1;
            }
            i = i2;
            this.f76174l.mo60134a("update_diig_view", (Object) Boolean.valueOf(z));
        } else {
            StringBuilder sb = new StringBuilder("updateDiggView when aweme is null:");
            sb.append(Log.getStackTraceString(new Throwable()));
            C6921a.m21552a(6, "VideoDiggView", sb.toString());
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        try {
            if (this.f76169g == null || !this.f76169g.isDelete() || i != 0) {
                this.f76069b.setVisibility(0);
                this.f76069b.setText(m94925a(i));
                return;
            }
            this.f76069b.setVisibility(4);
        } catch (NullPointerException e) {
            this.f76069b.setText(m94925a(0));
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: b */
    public final void mo74124b(Exception exc) {
        int i;
        m94933d(this.f76169g);
        Context context = this.f76175m;
        if (this.f76072e.mo72207e() == 1) {
            i = R.string.apd;
        } else {
            i = R.string.fjf;
        }
        C22814a.m75245a(context, exc, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_digg);
        this.f76068a = (DiggAnimationView) view2.findViewById(R.id.a8u);
        this.f76069b = (TextView) view2.findViewById(R.id.a8x);
        this.f76070c = view2.findViewById(R.id.a8w);
        this.f76078v = view2.findViewById(R.id.a91);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f76072e = new C28473w();
        this.f76072e.mo66536a(new C28471v());
        this.f76072e.mo66537a(this);
        this.f76079w = this.f76175m.getResources().getDrawable(R.drawable.bg_like);
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private void m94928a(String str, int i) {
        if (!C28208al.m92718c()) {
            C28208al.m92717b();
        }
        if (!TextUtils.isEmpty(this.f76073f) && C28426n.m93432a() && i == 1) {
            C28421i iVar = new C28421i(this.f76169g.getAid(), 1, System.currentTimeMillis(), this.f76073f);
            C28426n.m93431a(iVar);
        }
        if (C28344a.m93112c() == 0 || C6861a.m21337f().isLogin()) {
            this.f76072e.mo56976a(str, Integer.valueOf(i), this.f76073f);
        } else if (i == 1) {
            C28208al.m92715a(C28208al.m92714a() + 1);
            this.f76169g.setUserDigg(1);
        } else {
            if (i == 0) {
                C28208al.m92715a(Math.max(C28208al.m92714a() - 1, 0));
                this.f76169g.setUserDigg(0);
            }
        }
    }

    /* renamed from: a */
    private void m94927a(Aweme aweme, String str) {
        String str2;
        Aweme aweme2 = aweme;
        String str3 = str;
        C42961az.m136380a(new C28330m());
        long j = 0;
        if (!C6399b.m19944t()) {
            C6907h.onEvent(MobClick.obtain().setEventName("like").setLabelName(this.f76073f).setValue(C33230ac.m107238m(aweme)).setJsonObject(m94932c(aweme).mo16888b()));
            C33283y f = new C33283y().mo85380d(this.f76073f).mo85381e(this.f76080x).mo85376b(this.f76173k).mo85071g(aweme2).mo85383f(str3);
            if (this.f76067B != null) {
                j = this.f76067B.mo71759a();
            }
            ((C33283y) f.mo85373a(j).mo85384g(this.f76081y).mo85385i(this.f76082z).mo85386j(this.f76066A).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)))).mo85252e();
        } else {
            if (!TextUtils.equals("opus", this.f76073f)) {
                C6907h.m21519a(this.f76175m, "like", this.f76073f, aweme.getAid(), 0, m94937k());
            } else if (this.f76172j) {
                C6907h.m21519a(this.f76175m, "like", "personal_homepage", aweme.getAid(), 0, m94937k());
            } else {
                C6907h.m21519a(this.f76175m, "like", "others_homepage", aweme.getAid(), 0, m94937k());
            }
            if (C6399b.m19946v()) {
                str2 = C28417e.m93409a(this.f76172j, this.f76073f);
            } else {
                str2 = C28417e.m93407a(this.f76173k, this.f76073f, true);
            }
            if (!C6861a.m21337f().isLogin()) {
                new C33284z().mo85388a(this.f76073f).mo85387a(this.f76173k).mo85390b(aweme.getAid()).mo85071g(aweme2).mo85392c(str3).mo85389b(C28208al.m92718c() ^ true ? 1 : 0).mo85391c(0).mo85252e();
                C33283y yVar = (C33283y) ((C33283y) ((C33283y) new C33283y().mo85372a(0).mo85383f(str3).mo85380d(str2).mo85381e(this.f76080x).mo85374a((String) this.f76174l.mo60136b("playlist_type", "")).mo85379c((String) this.f76174l.mo60136b("playlist_id", "")).mo85377b((String) this.f76174l.mo60136b("playlist_id_key", "")).mo85283l((String) this.f76174l.mo60136b("tab_name", ""))).mo85284m(C33230ac.m107216b(this.f76169g, this.f76173k))).mo85071g(aweme2).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)));
                if (this.f76067B != null) {
                    j = this.f76067B.mo71759a();
                }
                yVar.mo85373a(j).mo85386j(this.f76066A).mo85252e();
            } else {
                C33283y yVar2 = (C33283y) ((C33283y) ((C33283y) new C33283y().mo85372a(1).mo85383f(str3).mo85380d(str2).mo85381e(this.f76080x).mo85374a((String) this.f76174l.mo60136b("playlist_type", "")).mo85379c((String) this.f76174l.mo60136b("playlist_id", "")).mo85377b((String) this.f76174l.mo60136b("playlist_id_key", "")).mo85283l((String) this.f76174l.mo60136b("tab_name", ""))).mo85284m(C33230ac.m107216b(this.f76169g, this.f76173k))).mo85071g(aweme2).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)));
                if (this.f76067B != null) {
                    j = this.f76067B.mo71759a();
                }
                yVar2.mo85373a(j).mo85386j(this.f76066A).mo85252e();
            }
        }
        if (aweme.getAwemeType() != 34) {
            m94928a(aweme.getAid(), 1);
        } else {
            C24671f.m80851a().mo64675f(this.f76175m, aweme2);
        }
    }

    public C28852br(View view, String str, String str2, String str3, String str4, String str5, C28350a aVar) {
        super(view);
        this.f76073f = str;
        this.f76080x = str2;
        this.f76067B = aVar;
        this.f76081y = str3;
        this.f76082z = str4;
        this.f76066A = str5;
    }
}
