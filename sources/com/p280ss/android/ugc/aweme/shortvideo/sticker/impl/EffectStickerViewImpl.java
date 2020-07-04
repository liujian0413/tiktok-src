package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17457s;
import com.p280ss.android.agilelogger.utils.C19199d;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35558as;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.shortvideo.C38458ar;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39960gg;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.game.GameResultViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.net.C40198a;
import com.p280ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40368aa;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40369ab;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag.C40377a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40378ah;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40495bg;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40823l;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40889o;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40889o.C40890a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40907r;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41018x;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.IStickerTabGuidePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.composer.C40521a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.FaceMattingPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.PixaloopARPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40451a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40573c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40576b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40903d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.C40909a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.search.C40916b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.search.C40933d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40954b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl */
public abstract class EffectStickerViewImpl implements C0042h, C40954b, C41018x {

    /* renamed from: A */
    public C41020a f105479A = new C41020a() {
        /* renamed from: b */
        public final void mo100337b(FaceStickerBean faceStickerBean) {
            for (C41020a b : EffectStickerViewImpl.this.f105525t) {
                b.mo100337b(faceStickerBean);
            }
        }

        /* renamed from: c */
        public final void mo100339c(FaceStickerBean faceStickerBean) {
            for (C41020a c : EffectStickerViewImpl.this.f105525t) {
                c.mo100339c(faceStickerBean);
            }
        }

        /* renamed from: a */
        public final void mo100333a(FaceStickerBean faceStickerBean) {
            for (C41020a aVar : EffectStickerViewImpl.this.f105525t) {
                StringBuilder sb = new StringBuilder("prop_panel_");
                sb.append(FaceStickerBean.sCurPropSource);
                faceStickerBean.setPropSource(sb.toString());
                aVar.mo100333a(faceStickerBean);
            }
        }

        /* renamed from: a */
        public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
            for (C41020a a : EffectStickerViewImpl.this.f105525t) {
                a.mo100334a(faceStickerBean, str);
            }
        }

        /* renamed from: b */
        public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
            for (C41020a b : EffectStickerViewImpl.this.f105525t) {
                b.mo100338b(faceStickerBean, str);
            }
        }
    };

    /* renamed from: B */
    private C40198a f105480B;

    /* renamed from: C */
    private C40576b f105481C;

    /* renamed from: D */
    private PixaloopARPresenter f105482D;

    /* renamed from: E */
    private C17457s<C40832n> f105483E;

    /* renamed from: F */
    private BackgroundVideoStickerPresenter f105484F;

    /* renamed from: G */
    private C20749b f105485G;

    /* renamed from: H */
    private C40521a f105486H;

    /* renamed from: I */
    private C40903d f105487I;

    /* renamed from: J */
    private int[] f105488J = new int[4];

    /* renamed from: K */
    private List<Effect> f105489K;

    /* renamed from: L */
    private boolean f105490L;

    /* renamed from: M */
    private ImageView f105491M;

    /* renamed from: N */
    private ViewGroup f105492N;

    /* renamed from: O */
    private CheckableImageView f105493O;

    /* renamed from: P */
    private C40916b f105494P;

    /* renamed from: Q */
    private C40378ah f105495Q;

    /* renamed from: R */
    private OnClickListener f105496R;

    /* renamed from: S */
    private int f105497S;

    /* renamed from: T */
    private boolean f105498T = true;

    /* renamed from: U */
    private C40369ab f105499U;

    /* renamed from: V */
    private C40368aa f105500V;

    /* renamed from: W */
    private final FrameLayout f105501W;

    /* renamed from: X */
    private C41020a f105502X = new C41020a() {
        /* renamed from: a */
        public final void mo100333a(FaceStickerBean faceStickerBean) {
        }

        /* renamed from: b */
        public final void mo100337b(FaceStickerBean faceStickerBean) {
        }

        /* renamed from: c */
        public final void mo100339c(FaceStickerBean faceStickerBean) {
        }

        /* renamed from: b */
        public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
            EffectStickerViewImpl.this.f105521p = false;
        }

        /* renamed from: a */
        public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
            EffectStickerViewImpl.this.f105521p = true;
            if (EffectStickerViewImpl.this.f105522q) {
                EffectStickerViewImpl.this.mo100703j();
            }
        }
    };

    /* renamed from: Y */
    private boolean f105503Y = false;

    /* renamed from: Z */
    private C41847c f105504Z;

    /* renamed from: a */
    private View f105505a;

    /* renamed from: aa */
    private OnUnlockShareFinishListener f105506aa = new OnUnlockShareFinishListener() {
        public final void onShareAppFailed() {
            C35574k.m114859a().mo70082P().mo90374a(EffectStickerViewImpl.this.f105507b);
        }

        public final void onShareAppSucceed(Effect effect) {
            EffectStickerViewImpl.this.f105531z = true;
        }

        public final void onVKShareSucceed(Effect effect) {
            EffectStickerViewImpl.this.mo100708o();
        }
    };

    /* renamed from: b */
    public AppCompatActivity f105507b;

    /* renamed from: c */
    public EffectPlatform f105508c;

    /* renamed from: d */
    public EffectStickerManager f105509d;

    /* renamed from: e */
    public FaceMattingPresenter f105510e;

    /* renamed from: f */
    protected MultiStickerPresenter f105511f;

    /* renamed from: g */
    public Effect f105512g;

    /* renamed from: h */
    protected Effect f105513h;

    /* renamed from: i */
    protected Effect f105514i;

    /* renamed from: j */
    public View f105515j;

    /* renamed from: k */
    public View f105516k;

    /* renamed from: l */
    protected ShortVideoContext f105517l;

    /* renamed from: m */
    protected boolean f105518m;

    /* renamed from: n */
    protected boolean f105519n = true;

    /* renamed from: o */
    public C40889o f105520o;

    /* renamed from: p */
    protected boolean f105521p;

    /* renamed from: q */
    protected boolean f105522q;

    /* renamed from: r */
    protected int f105523r = -1;

    /* renamed from: s */
    public AVDmtTabLayout f105524s;

    /* renamed from: t */
    protected List<C41020a> f105525t = new ArrayList();

    /* renamed from: u */
    public boolean f105526u = true;

    /* renamed from: v */
    protected IStickerTabGuidePresenter<C0902i<EffectCategoryModel, Object>> f105527v;

    /* renamed from: w */
    Effect f105528w;

    /* renamed from: x */
    int f105529x = -1;

    /* renamed from: y */
    int f105530y = -1;

    /* renamed from: z */
    public boolean f105531z = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo100662a(C0043i iVar, C0608j jVar, String str, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo100663a(C0043i iVar, String str);

    /* renamed from: c */
    public final FrameLayout mo100699c() {
        return this.f105501W;
    }

    /* renamed from: f */
    public final void mo100702f() {
        onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo100667g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo100668h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo100669i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo100711p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo100693a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && mo100701e()) {
            mo100700d();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo100683a(IStickerTabGuidePresenter<C0902i<EffectCategoryModel, Object>> iStickerTabGuidePresenter) {
        this.f105527v = iStickerTabGuidePresenter;
    }

    /* renamed from: a */
    public final void mo100682a(ShortVideoContext shortVideoContext) {
        this.f105517l = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo100677a(AppCompatActivity appCompatActivity, List<Effect> list, boolean z, String str) {
        this.f105490L = z;
        this.f105523r = C40909a.m130719a(list, appCompatActivity, z, str);
    }

    /* renamed from: a */
    public final void mo100676a(AppCompatActivity appCompatActivity, Effect effect, String str) {
        if (effect != null) {
            this.f105490L = true;
            this.f105523r = C40909a.m130718a(effect, appCompatActivity, str);
        }
    }

    /* renamed from: a */
    public final void mo100690a(List<Effect> list) {
        this.f105489K = list;
    }

    /* renamed from: a */
    public final void mo100687a(Effect effect) {
        this.f105514i = effect;
    }

    /* renamed from: a */
    public final void mo100678a(OnClickListener onClickListener) {
        this.f105496R = onClickListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100689a(String str) {
        mo100700d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100679a(View view) {
        if (!this.f105498T) {
            C10761a.m31410e((Context) this.f105507b, this.f105507b.getResources().getString(R.string.dc_)).mo25750a();
        } else if (!((GameResultViewModel) C0069x.m159a((FragmentActivity) this.f105507b).mo147a(GameResultViewModel.class)).f103690a) {
            this.f105491M.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new C40635o(this)).withEndAction(new C40636p(this)).start();
            if (this.f105496R != null) {
                this.f105496R.onClick(this.f105491M);
            }
        }
    }

    /* renamed from: a */
    public final void mo100688a(Effect effect, int i, int i2) {
        this.f105530y = i;
        this.f105529x = i2;
        this.f105528w = effect;
        this.f105503Y = true;
        mo101117s();
    }

    /* renamed from: a */
    public final void mo100692a(boolean z) {
        this.f105498T = z;
        if (this.f105491M != null) {
            this.f105491M.setImageAlpha(z ? NormalGiftView.ALPHA_255 : 127);
        }
    }

    /* renamed from: a */
    public final void mo100681a(C20749b bVar) {
        this.f105485G = bVar;
    }

    /* renamed from: a */
    public final void mo100685a(C40369ab abVar) {
        this.f105499U = abVar;
    }

    /* renamed from: a */
    public final void mo100684a(C40368aa aaVar) {
        this.f105500V = aaVar;
    }

    /* renamed from: a */
    public final void mo100691a(List<StickerWrapper> list, int i) {
        if (this.f105487I != null) {
            if (list != null) {
                this.f105487I.mo101182a(list);
            }
            this.f105487I.mo101181a(i);
        }
    }

    /* renamed from: a */
    public final void mo100686a(C40907r rVar) {
        if (this.f105509d != null) {
            this.f105509d.f104791i = rVar;
        }
    }

    /* renamed from: a */
    public final void mo100680a(C17457s<C40832n> sVar) {
        this.f105483E = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo100707n() {
        if (this.f105519n) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo100713r() {
        this.f105491M.setEnabled(false);
    }

    /* renamed from: e */
    public final boolean mo100701e() {
        if (this.f105505a == null || this.f105505a.getParent() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (C6399b.m19944t() && this.f105531z) {
            mo100708o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo100712q() {
        this.f105491M.setRotation(0.0f);
        this.f105491M.setEnabled(true);
    }

    /* renamed from: t */
    private void m129784t() {
        this.f105492N.setVisibility(0);
        this.f105492N.findViewById(R.id.b6u).setVisibility(0);
        this.f105491M.setOnClickListener(new C40634n(this));
    }

    /* renamed from: b */
    public final boolean mo100698b() {
        if (this.f105509d == null) {
            return false;
        }
        this.f105509d.mo100224b((Effect) null);
        return true;
    }

    /* renamed from: d */
    public final void mo100700d() {
        C42111b.m134052a((String) null);
        if (this.f105481C != null) {
            this.f105481C.mo74849b(new C40582c());
        }
        if (this.f105494P != null) {
            this.f105494P.mo101206c();
        }
    }

    /* renamed from: s */
    private void mo101117s() {
        String str;
        C35558as P = C35574k.m114859a().mo70082P();
        if (this.f105503Y) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        this.f105504Z = P.mo90372a(str, this.f105507b, this.f105528w, this.f105506aa, true, true);
        this.f105504Z.mo101264a();
    }

    /* renamed from: a */
    public final void mo100671a() {
        if (this.f105487I != null) {
            this.f105487I.mo101183d();
        }
    }

    /* renamed from: k */
    public final void mo100704k() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f105515j, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(250);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                EffectStickerViewImpl.this.f105515j.setVisibility(8);
            }
        });
    }

    /* renamed from: l */
    public final void mo100705l() {
        this.f105515j.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f105515j, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                EffectStickerViewImpl.this.f105516k.setVisibility(0);
            }
        });
    }

    /* renamed from: o */
    public final void mo100708o() {
        String str;
        C35558as P = C35574k.m114859a().mo70082P();
        AppCompatActivity appCompatActivity = this.f105507b;
        if (this.f105503Y) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        P.mo90375a(appCompatActivity, str, this.f105528w);
        mo100700d();
        this.f105509d.mo100225b(this.f105528w, this.f105529x, null);
        this.f105531z = false;
        this.f105503Y = false;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f105505a = null;
        this.f105508c = null;
        this.f105525t.clear();
        if (this.f105493O != null) {
            this.f105493O.setOnStateChangeListener(null);
            this.f105493O.clearAnimation();
        }
        if (this.f105480B != null) {
            NetStateReceiver.m128494b(this.f105480B);
            this.f105480B = null;
        }
        NetStateReceiver.m128493b((Context) this.f105507b);
        this.f105507b = null;
        mo100711p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo100703j() {
        if (C6399b.m19944t()) {
            C21164d G = C35574k.m114859a().mo70073G();
            if (G.mo57090c() && !TextUtils.isEmpty(G.mo57091d())) {
                C0902i a = m129778a(this.f105509d);
                Effect effect = (Effect) a.f3154a;
                int intValue = ((Integer) a.f3155b).intValue();
                if (effect != null) {
                    List a2 = C40496bh.m129429a((Context) this.f105507b, G.mo57091d());
                    if (a2 != null && !a2.contains(effect.getEffectId()) && C40496bh.m129466k(effect)) {
                        C40496bh.m129432a((Context) this.f105507b, G.mo57091d(), effect.getEffectId());
                        this.f105528w = effect;
                        this.f105529x = intValue;
                        mo101117s();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo100706m() {
        String str;
        if (this.f105509d.mo100228c().size() > 1) {
            C42962b bVar = C42962b.f111525a;
            MobClick value = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(((EffectCategoryModel) this.f105509d.mo100228c().get(1)).f113499id);
            C6909j jVar = new C6909j();
            String str2 = "position";
            if (this.f105509d.mo100221b().equals("livestreaming")) {
                str = "live_set";
            } else {
                str = "shoot_page";
            }
            bVar.onEvent(value.setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100696b(String str) {
        mo100700d();
    }

    /* renamed from: b */
    public final void mo100695b(Effect effect) {
        this.f105513h = effect;
        if (this.f105509d != null) {
            this.f105509d.mo100232d(effect);
        }
    }

    /* renamed from: a */
    private void m129780a(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        LayoutInflater.from(this.f105507b).inflate(mo100667g(), frameLayout, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100694b(View view) {
        C42962b.f111525a.mo104671a("click_prop_search", C22984d.m75611a().mo59973a("creation_id", this.f105517l.f99787w).mo59973a("shoot_way", this.f105517l.f99788x).mo59973a("group_id", C38458ar.m122943a()).mo59973a("enter_from", "video_shoot_page").f60753a);
        this.f105494P.mo101201a();
    }

    public EffectStickerViewImpl(FrameLayout frameLayout) {
        this.f105501W = frameLayout;
        frameLayout.setOnTouchListener(new C40630j(this));
    }

    /* renamed from: a */
    private static C0902i<Effect, Integer> m129778a(EffectStickerManager effectStickerManager) {
        C0902i<Effect, Integer> iVar = new C0902i<>(null, Integer.valueOf(-1));
        if (C19199d.m62924a(effectStickerManager.mo100228c())) {
            return iVar;
        }
        for (int i = 0; i < effectStickerManager.mo100228c().size(); i++) {
            CategoryEffectModel a = effectStickerManager.mo100208a(((EffectCategoryModel) effectStickerManager.mo100228c().get(i)).name);
            if (a != null) {
                for (int i2 = 0; i2 < a.effects.size(); i2++) {
                    Effect effect = (Effect) a.effects.get(i2);
                    if (C40496bh.m129464i(effect)) {
                        return new C0902i<>(effect, Integer.valueOf(i2));
                    }
                }
                continue;
            }
        }
        return iVar;
    }

    /* renamed from: c */
    private void m129782c(String str) {
        if (C6399b.m19945u() && C35574k.m114859a().mo70096k().mo93305a(Property.EnableSearchEffect) && !TextUtils.equals(str, "livestreaming")) {
            this.f105516k = this.f105505a.findViewById(R.id.bk2);
            this.f105516k.setVisibility(0);
            this.f105516k.setOnClickListener(new C40633m(this));
            C40916b bVar = new C40916b(this.f105505a, this.f105507b, this.f105517l, this.f105509d, this.f105508c, new C40933d() {
                /* renamed from: a */
                public final void mo100716a() {
                    EffectStickerViewImpl.this.f105516k.setVisibility(8);
                    EffectStickerViewImpl.this.f105512g = EffectStickerViewImpl.this.f105509d.f104783a;
                    EffectStickerViewImpl.this.mo100697b(true);
                    EffectStickerViewImpl.this.mo100704k();
                }

                /* renamed from: c */
                public final void mo100718c() {
                    if (EffectStickerViewImpl.this.f105509d.f104783a != null && EffectStickerViewImpl.this.f105509d.f104783a.equals(EffectStickerViewImpl.this.f105512g)) {
                        EffectStickerViewImpl.this.mo100697b(false);
                    }
                }

                /* renamed from: b */
                public final void mo100717b() {
                    EffectStickerViewImpl.this.mo100705l();
                    if (EffectStickerViewImpl.this.f105509d.f104783a != null && EffectStickerViewImpl.this.f105509d.f104783a.equals(EffectStickerViewImpl.this.f105512g)) {
                        EffectStickerViewImpl.this.mo100697b(false);
                    }
                }
            });
            this.f105494P = bVar;
        }
    }

    /* renamed from: b */
    public final void mo100697b(boolean z) {
        if (this.f105520o != null) {
            this.f105520o.mo101164a(!z);
        }
        int i = 0;
        C40934t[] tVarArr = {this.f105510e, this.f105511f, this.f105482D, this.f105487I, this.f105484F};
        if (z) {
            Arrays.fill(this.f105488J, -1);
            while (i < 5) {
                if (tVarArr[i] != null && tVarArr[i].mo100381a()) {
                    tVarArr[i].mo100383c();
                    this.f105488J[i] = i;
                }
                i++;
            }
            return;
        }
        while (i < this.f105488J.length) {
            if (!(this.f105488J[i] == -1 || tVarArr[this.f105488J[i]] == null)) {
                tVarArr[i].mo100382b();
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100673a(AppCompatActivity appCompatActivity) {
        if (this.f105519n && this.f105509d != null && appCompatActivity != null) {
            this.f105509d.mo100228c().add(0, C40377a.m129124b(appCompatActivity));
        }
    }

    /* renamed from: a */
    private void m129779a(final AppCompatActivity appCompatActivity, final EffectPlatform effectPlatform, final String str) {
        NetStateReceiver.m128491a((Context) appCompatActivity);
        this.f105480B = new C40198a() {

            /* renamed from: e */
            private boolean f105538e = true;

            /* renamed from: a */
            public final void mo99998a() {
                this.f105538e = false;
            }

            /* renamed from: a */
            public final void mo99999a(int i) {
                if (!this.f105538e) {
                    ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(EffectStickerViewModel.class)).mo101291c();
                    if (EffectStickerViewImpl.this.f105519n) {
                        ((FavoriteStickerViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FavoriteStickerViewModel.class)).mo101297a(effectPlatform, str);
                    }
                    this.f105538e = true;
                }
            }
        };
        NetStateReceiver.m128492a(this.f105480B);
    }

    /* renamed from: a */
    public final void mo100672a(int i, int i2, Intent intent) {
        if (this.f105482D != null) {
            this.f105482D.mo100406a(i, i2, intent);
        }
        if (this.f105484F != null) {
            this.f105484F.mo100406a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo100675a(AppCompatActivity appCompatActivity, C0043i iVar, String str, FrameLayout frameLayout, C41020a aVar) {
        C0608j supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        if (iVar instanceof Fragment) {
            supportFragmentManager = ((Fragment) iVar).getChildFragmentManager();
        }
        mo100674a(appCompatActivity, iVar, supportFragmentManager, str, frameLayout, aVar);
    }

    /* renamed from: b */
    private void m129781b(AppCompatActivity appCompatActivity, C0043i iVar, C0608j jVar, String str, FrameLayout frameLayout, C41020a aVar) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C0043i iVar2 = iVar;
        String str2 = str;
        FrameLayout frameLayout2 = frameLayout;
        if (this.f105505a == null) {
            this.f105507b = appCompatActivity2;
            iVar.getLifecycle().mo55a(this);
            int i = 0;
            this.f105505a = LayoutInflater.from(appCompatActivity).inflate(R.layout.al0, frameLayout2, false);
            FrameLayout frameLayout3 = (FrameLayout) this.f105505a.findViewById(R.id.daz);
            m129780a(frameLayout3);
            this.f105524s = (AVDmtTabLayout) this.f105505a.findViewById(R.id.dfu);
            final FrameLayout frameLayout4 = (FrameLayout) this.f105505a.findViewById(R.id.bjy);
            LinearLayout linearLayout = (LinearLayout) this.f105505a.findViewById(R.id.bju);
            LinearLayout linearLayout2 = (LinearLayout) this.f105505a.findViewById(R.id.a0g);
            LinearLayout linearLayout3 = (LinearLayout) this.f105505a.findViewById(R.id.a0i);
            FrameLayout frameLayout5 = (FrameLayout) this.f105505a.findViewById(R.id.dg3);
            this.f105492N = (ViewGroup) this.f105505a.findViewById(R.id.bgv);
            this.f105492N.addView(LayoutInflater.from(appCompatActivity).inflate(R.layout.a1v, this.f105492N, false));
            this.f105491M = (ImageView) this.f105492N.findViewById(R.id.b_a);
            View findViewById = this.f105492N.findViewById(R.id.dw4);
            if (!C39960gg.m127843a(appCompatActivity)) {
                i = 8;
            }
            findViewById.setVisibility(i);
            if (this.f105497S > 0) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) frameLayout5.getLayoutParams();
                ((MarginLayoutParams) this.f105491M.getLayoutParams()).topMargin = this.f105497S;
                marginLayoutParams.topMargin = this.f105497S;
            }
            if (C39805en.m127445a()) {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f105491M.getLayoutParams();
                MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) frameLayout5.getLayoutParams();
                marginLayoutParams2.topMargin += C39804em.f103459c;
                marginLayoutParams3.topMargin += C39804em.f103459c;
            }
            this.f105493O = (CheckableImageView) this.f105505a.findViewById(R.id.b06);
            this.f105515j = this.f105505a.findViewById(R.id.bk6);
            this.f105525t.add(aVar);
            this.f105525t.add(this.f105502X);
            if (str2.equals("livestreaming")) {
                this.f105505a.findViewById(R.id.bk5).setBackground(appCompatActivity.getResources().getDrawable(R.drawable.blg));
                this.f105515j.setBackground(appCompatActivity.getResources().getDrawable(R.drawable.ud));
                if (C6399b.m19944t()) {
                    View findViewById2 = this.f105505a.findViewById(R.id.bjz);
                    Drawable background = findViewById2.getBackground();
                    if (background != null) {
                        C42111b.m134051a(background, this.f105507b.getResources().getColor(R.color.is));
                        findViewById2.setBackground(background);
                    }
                }
            }
            if (!str2.equals("livestreaming")) {
                this.f105510e = new FaceMattingPresenter(appCompatActivity2, (ViewStubCompat) this.f105505a.findViewById(R.id.dc4));
                this.f105525t.add(this.f105510e);
                m129784t();
            }
            if (!str2.equals("livestreaming")) {
                this.f105482D = new PixaloopARPresenter(appCompatActivity2, (ViewStubCompat) this.f105505a.findViewById(R.id.dck), str2);
                this.f105482D.mo100431a(this.f105517l);
                this.f105482D.mo100430a(this.f105485G);
                this.f105482D.mo100432a((C40451a) new C40631k(this));
                this.f105525t.add(this.f105482D);
            }
            if (!str2.equals("livestreaming") && this.f105527v != null) {
                this.f105527v.mo100245a(true);
                this.f105525t.add(this.f105527v);
            }
            if (!str2.equals("livestreaming") && this.f105483E != null) {
                this.f105484F = new BackgroundVideoStickerPresenter(appCompatActivity2, str2, (ViewStubCompat) this.f105505a.findViewById(R.id.dbz), this.f105483E);
                this.f105484F.mo100407a(this.f105517l);
                this.f105484F.mo100408a((C40451a) new C40632l(this));
                this.f105525t.add(this.f105484F);
            }
            this.f105481C = new C40576b(frameLayout2, this.f105505a, frameLayout3);
            if (this.f105508c == null) {
                this.f105508c = new EffectPlatform(appCompatActivity2, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
                this.f105508c.mo70619a((C0043i) appCompatActivity2);
            }
            EffectStickerManager effectStickerManager = r1;
            EffectStickerManager effectStickerManager2 = new EffectStickerManager(appCompatActivity, iVar, this.f105508c, this.f105479A, str, this.f105517l);
            this.f105509d = effectStickerManager;
            this.f105509d.f104794l = this.f105526u;
            this.f105509d.mo100211a(linearLayout);
            this.f105509d.mo100212a(linearLayout2, this.f105505a.getContext());
            this.f105509d.mo100222b(linearLayout3, this.f105505a.getContext());
            this.f105509d.mo100227b(this.f105489K);
            this.f105509d.mo100206a((C40495bg) new C40495bg() {
                /* renamed from: a */
                public final void mo100544a() {
                    if (EffectStickerViewImpl.this.f105519n) {
                        EffectStickerViewImpl.this.f105520o.mo101162a();
                    }
                }

                /* renamed from: a */
                public final void mo100545a(boolean z, Effect effect) {
                    if (EffectStickerViewImpl.this.f105519n && EffectStickerViewImpl.this.f105520o != null) {
                        EffectStickerViewImpl.this.f105520o.mo101164a(z);
                        EffectStickerViewImpl.this.f105520o.mo101163a(effect);
                    }
                }
            });
            this.f105509d.f104793k = this.f105495Q;
            this.f105509d.f104786d = C40377a.m129123a(appCompatActivity);
            if (this.f105519n) {
                C40890a aVar2 = new C40890a(this.f105509d, str, appCompatActivity, frameLayout4, this.f105493O, this.f105517l);
                this.f105520o = aVar2;
            }
            mo100673a(appCompatActivity);
            m129782c(str2);
            if (!str2.equals("livestreaming")) {
                MultiStickerPresenter multiStickerPresenter = new MultiStickerPresenter(appCompatActivity, str, this.f105505a, this.f105509d, this.f105517l);
                this.f105511f = multiStickerPresenter;
                this.f105525t.add(this.f105511f);
                this.f105486H = new C40521a(appCompatActivity2, (ViewGroup) this.f105505a, this.f105485G, this.f105509d);
                this.f105525t.add(this.f105486H);
            }
            this.f105487I = new C40903d(appCompatActivity2, this.f105505a, this.f105499U, this.f105500V);
            if (this.f105490L) {
                this.f105509d.f104789g = 1;
            }
            mo100662a(iVar2, jVar, str2, this.f105505a);
            this.f105505a.findViewById(R.id.ayx).setOnTouchListener(new C34032a(0.5f, 200, null));
            this.f105505a.findViewById(R.id.ayx).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (EffectStickerViewImpl.this.f105517l != null) {
                        C42962b.f111525a.mo104671a("click_prop_tab", C22984d.m75611a().mo59973a("creation_id", EffectStickerViewImpl.this.f105517l.f99787w).mo59973a("shoot_way", EffectStickerViewImpl.this.f105517l.f99788x).mo59970a("draft_id", EffectStickerViewImpl.this.f105517l.f99790z).mo59973a("tab_name", "none").f60753a);
                    }
                    C40573c.m129707a(EffectStickerViewImpl.this.f105507b, null);
                    EffectStickerViewImpl.this.f105509d.mo100224b((Effect) null);
                }
            });
            this.f105481C.mo74846a((C34860g) new C34861a() {
                /* renamed from: a */
                public final void mo74767a() {
                    if (EffectStickerViewImpl.this.f105509d != null) {
                        EffectStickerViewImpl.this.f105479A.mo100334a(C40376ag.m129117a(EffectStickerViewImpl.this.f105509d.f104783a), null);
                    }
                    C40823l.m130437a().f106157b = false;
                }

                /* renamed from: d */
                public final void mo74768d() {
                    C40823l.m130437a().f106156a = false;
                    EffectStickerViewImpl.this.f105509d.f104784b.clear();
                    if (EffectStickerViewImpl.this.f105509d != null) {
                        EffectStickerViewImpl.this.f105479A.mo100338b(C40376ag.m129117a(EffectStickerViewImpl.this.f105509d.f104783a), null);
                    }
                    if (EffectStickerViewImpl.this.f105510e != null) {
                        EffectStickerViewImpl.this.f105510e.mo100385e();
                    }
                    EffectStickerViewImpl.this.mo100669i();
                }

                /* renamed from: b */
                public final void mo74847b() {
                    super.mo74847b();
                    C40823l.m130437a().f106157b = true;
                    if (EffectStickerViewImpl.this.f105507b != null && !EffectStickerViewImpl.this.f105507b.isFinishing()) {
                        C40823l.m130437a().mo101088a(frameLayout4.findViewById(R.id.bjz), (Activity) EffectStickerViewImpl.this.f105507b);
                    }
                    if (EffectStickerViewImpl.this.f105510e != null) {
                        EffectStickerViewImpl.this.f105510e.mo100384d();
                    }
                    EffectStickerViewImpl.this.mo100668h();
                }
            });
            m129779a(appCompatActivity2, this.f105508c, str2);
            mo100663a(iVar2, str2);
        }
    }

    /* renamed from: a */
    public final void mo100674a(AppCompatActivity appCompatActivity, C0043i iVar, C0608j jVar, String str, FrameLayout frameLayout, C41020a aVar) {
        frameLayout.removeAllViews();
        C42111b.m134052a(str);
        m129781b(appCompatActivity, iVar, jVar, str, frameLayout, aVar);
        this.f105481C.mo74845a((C34856c) new C40582c());
    }
}
