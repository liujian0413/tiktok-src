package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.res.Resources;
import android.support.p022v4.app.C0578a;
import android.support.p022v4.app.C0578a.C0580a;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cd */
public final class C28871cd extends C28895f implements C0053p<C23083a> {

    /* renamed from: c */
    ImageView f76123c;

    /* renamed from: d */
    TextView f76124d;

    /* renamed from: e */
    MarqueeView f76125e;

    /* renamed from: f */
    LinearLayout f76126f;

    /* renamed from: r */
    private boolean f76127r;

    /* renamed from: l */
    private void m95010l() {
        this.f76125e.setOnClickListener(this.f76181b);
        this.f76123c.setOnClickListener(this.f76181b);
    }

    /* renamed from: m */
    private void m95011m() {
        if (this.f76125e != null) {
            this.f76125e.mo74411a();
        }
    }

    /* renamed from: n */
    private void m95012n() {
        if (!this.f76127r) {
            this.f76127r = true;
            m95011m();
        }
    }

    /* renamed from: p */
    private void m95014p() {
        if (C32698a.m105818a(this.f76169g)) {
            this.f76176n.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m95009k() {
        if (!C6399b.m19944t()) {
            this.f76124d.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C28871cd.this.f76169g.getMusic() != null && C28871cd.this.f76169g.getMusic().isOriginMusic()) {
                        if (C6861a.m21337f().isLogin() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
                            SmartRouter.buildRoute(C28871cd.this.f76175m, "aweme://music/category/").open();
                            C6907h.onEvent(MobClick.obtain().setEventName("click_category").setLabelName("popular_song").setValue("860").setJsonObject(new C6869c().mo16887a("enter_from", "origin_flag").mo16888b()));
                            C6907h.m21524a("enter_song_category", (Map) C22984d.m75611a().mo59973a("enter_method", "click_category_list").mo59973a("category_name", C28871cd.this.f76175m.getString(R.string.cre)).mo59973a("enter_from", C28871cd.this.f76170h).mo59973a("category_id", "860").mo59973a("category_type", "original").f60753a);
                        } else {
                            C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) C28871cd.this.f76175m).mo56864a(C28871cd.this.f76170h).mo56866b(C28871cd.this.f76177o).mo56859a());
                            C6907h.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_origin_flag"));
                        }
                    }
                }
            });
        } else {
            this.f76124d.setOnClickListener(this.f76181b);
        }
    }

    /* renamed from: o */
    private void m95013o() {
        if (this.f76127r) {
            this.f76127r = false;
            if (this.f76125e != null) {
                this.f76125e.mo74412b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo74136j() {
        if (this.f76127r) {
            this.f76127r = false;
            if (this.f76125e != null) {
                this.f76125e.mo74413c();
            }
        }
    }

    public C28871cd(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        dataCenter.mo60132a("stopPlayAnimation", (C0053p<C23083a>) this).mo60132a("startPlayAnimation", (C0053p<C23083a>) this).mo60132a("pausePlayAnimation", (C0053p<C23083a>) this);
    }

    /* renamed from: a */
    private boolean m95007a(Music music) {
        if (music != null && !C6399b.m19944t()) {
            if (C25329c.m83223f(this.f76169g)) {
                if (!this.f76180a.mo64710e() || music.getMusicStatus() == 0) {
                    return true;
                }
            } else if (C25329c.m83225h(this.f76169g)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2058685350) {
                if (hashCode != -1661876786) {
                    if (hashCode == 307897710 && str.equals("startPlayAnimation")) {
                        c = 0;
                    }
                } else if (str.equals("stopPlayAnimation")) {
                    c = 2;
                }
            } else if (str.equals("pausePlayAnimation")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m95012n();
                    return;
                case 1:
                    m95013o();
                    return;
                case 2:
                    mo74136j();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo72019a(View view) {
        super.mo72019a(view);
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_title_music);
        this.f76125e = (MarqueeView) view2.findViewById(R.id.c24);
        this.f76124d = (TextView) view2.findViewById(R.id.c1l);
        this.f76123c = (ImageView) view2.findViewById(R.id.c1e);
        this.f76126f = (LinearLayout) view2.findViewById(R.id.c22);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        int i;
        super.mo72021a(videoItemParams);
        if (this.f76176n != null) {
            View view = this.f76176n;
            if (C25072c.m82577c(this.f76169g)) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.f76123c.setVisibility(0);
        if (this.f76169g.getMusic() == null || !this.f76169g.getMusic().isOriginMusic()) {
            this.f76124d.setVisibility(8);
            this.f76123c.setImageResource(R.drawable.a8p);
        } else {
            if (!C6399b.m19944t()) {
                this.f76124d.setText(R.string.crj);
            }
            this.f76124d.setVisibility(0);
            this.f76123c.setImageResource(R.drawable.auw);
        }
        if (!C6399b.m19944t()) {
            m95008b(this.f76169g.getMusic(), this.f76169g.getAuthor());
        } else if (C25300bx.m83129b(this.f76169g, 3)) {
            this.f76125e.setText((int) R.string.d8o);
        } else {
            m95005a(this.f76169g.getMusic(), this.f76169g.getAuthor());
        }
        m95010l();
        m95009k();
    }

    /* renamed from: a */
    private void m95006a(boolean z, String str) {
        if (!C6399b.m19944t()) {
            if (z) {
                this.f76124d.setContentDescription(this.f76175m.getString(R.string.cre));
                C0578a.m2438a((View) this.f76124d, (C0580a) new C0580a() {
                    /* renamed from: a */
                    public final void mo2559a(View view, C0945c cVar) {
                        cVar.mo3656b((CharSequence) Button.class.getName());
                    }
                });
            }
            this.f76125e.setContentDescription(this.f76175m.getString(R.string.cgv, new Object[]{str}));
            this.f76123c.setContentDescription(this.f76175m.getString(R.string.cgv, new Object[]{str}));
        }
    }

    /* renamed from: b */
    private void m95008b(Music music, User user) {
        String str;
        if (music != null) {
            if (m95007a(music)) {
                this.f76125e.setText(music.getMusicName());
            } else {
                this.f76125e.setText(this.f76175m.getResources().getString(R.string.ci0, new Object[]{music.getMusicName(), music.getAuthorName()}));
            }
            this.f76125e.setVisibility(0);
            if (this.f76169g != null && !this.f76169g.isCanPlay() && m95073b(this.f76169g)) {
                this.f76125e.setVisibility(4);
            }
            m95006a(music.isOriginMusic(), music.getMusicName());
            return;
        }
        MarqueeView marqueeView = this.f76125e;
        Resources resources = this.f76175m.getResources();
        Object[] objArr = new Object[2];
        objArr[0] = this.f76175m.getResources().getString(R.string.chc);
        if (user == null) {
            str = "";
        } else {
            str = user.getNickname();
        }
        objArr[1] = str;
        marqueeView.setText(resources.getString(R.string.chz, objArr));
    }

    /* renamed from: a */
    private void m95005a(Music music, User user) {
        String str;
        String str2;
        MarqueeView marqueeView;
        Object[] objArr;
        String str3;
        Resources resources;
        int i = R.string.chz;
        if (music != null) {
            if (TextUtils.isEmpty(music.getAuthorName())) {
                this.f76125e.setText(music.getMusicName());
            } else {
                if (!TextUtils.isEmpty(music.getOwnerId())) {
                    this.f76125e.setText(this.f76175m.getResources().getString(R.string.ci0, new Object[]{music.getMusicName(), music.getAuthorName()}));
                    if (TextUtils.isEmpty(music.getMusicName())) {
                        marqueeView = this.f76125e;
                        resources = this.f76175m.getResources();
                        objArr = new Object[2];
                        objArr[0] = this.f76175m.getResources().getString(R.string.chc);
                        if (TextUtils.isEmpty(music.getOwnerHandle())) {
                            str3 = "";
                        } else {
                            str3 = music.getOwnerHandle();
                        }
                    }
                } else if (!TextUtils.isEmpty(music.getMusicName()) || !TextUtils.isEmpty(music.getAuthorName())) {
                    marqueeView = this.f76125e;
                    resources = this.f76175m.getResources();
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = music.getMusicName();
                    objArr = objArr2;
                    str3 = music.getAuthorName();
                    i = R.string.ci0;
                } else {
                    this.f76125e.setText(this.f76175m.getResources().getString(R.string.cre));
                }
                objArr[1] = str3;
                marqueeView.setText(resources.getString(i, objArr));
            }
            this.f76125e.setVisibility(0);
            if (this.f76169g != null && !this.f76169g.isCanPlay() && m95073b(this.f76169g)) {
                this.f76125e.setVisibility(4);
            }
        } else {
            if (user == null) {
                str2 = "";
            } else {
                str2 = C43122ff.m136781l(user);
            }
            if (TextUtils.isEmpty(str2)) {
                this.f76125e.setText(this.f76175m.getResources().getString(R.string.cre));
            } else {
                this.f76125e.setText(this.f76175m.getResources().getString(R.string.chz, new Object[]{this.f76175m.getResources().getString(R.string.chc), str2}));
            }
        }
        if (this.f76169g != null && this.f76169g.isWithPromotionalMusic()) {
            if (music == null || TextUtils.isEmpty(music.getMusicName())) {
                str = this.f76175m.getResources().getString(R.string.d8o);
            } else {
                str = music.getMusicName();
            }
            this.f76125e.setText(str);
        }
        m95014p();
    }
}
