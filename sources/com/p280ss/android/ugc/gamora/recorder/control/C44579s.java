package com.p280ss.android.ugc.gamora.recorder.control;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.AppCompatImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.transition.C41125b;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.s */
public final class C44579s extends C44535a implements C11592h {

    /* renamed from: w */
    static final /* synthetic */ C7595j[] f114875w = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44579s.class), "chooseMusicViewModel", "getChooseMusicViewModel()Lcom/ss/android/ugc/gamora/recorder/choosemusic/RecordChooseMusicViewModel;"))};

    /* renamed from: A */
    public View f114876A;

    /* renamed from: B */
    public AppCompatImageView f114877B;

    /* renamed from: C */
    public boolean f114878C = true;

    /* renamed from: D */
    private C39382ed f114879D;

    /* renamed from: E */
    private TextView f114880E;

    /* renamed from: F */
    private TextView f114881F;

    /* renamed from: G */
    private final C7541d f114882G;

    /* renamed from: x */
    public long f114883x;

    /* renamed from: y */
    public View f114884y;

    /* renamed from: z */
    public View f114885z;

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$a */
    static final class C44580a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44579s f114886a;

        C44580a(C44579s sVar) {
            this.f114886a = sVar;
        }

        public final void run() {
            C44579s.m140831d(this.f114886a).setRotation(0.0f);
            C44579s.m140827a(this.f114886a).setEnabled(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$b */
    static final class C44581b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44579s f114887a;

        C44581b(C44579s sVar) {
            this.f114887a = sVar;
        }

        public final void run() {
            C44579s.m140831d(this.f114887a).setRotation(0.0f);
            C44579s.m140827a(this.f114887a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$c */
    static final class C44582c extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44579s f114888a;

        C44582c(C44579s sVar) {
            this.f114888a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140837a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140837a(C11585f fVar, Integer num) {
            boolean z;
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                int intValue = num.intValue();
                RecordChooseMusicViewModel S = this.f114888a.mo107023S();
                boolean z2 = false;
                if (intValue == 0) {
                    z = true;
                } else {
                    z = false;
                }
                S.mo106930a(z);
                RecordChooseMusicViewModel S2 = this.f114888a.mo107023S();
                if (intValue == 0) {
                    z2 = true;
                }
                S2.mo106931b(z2);
                C44579s.m140827a(this.f114888a).setVisibility(intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$d */
    static final class C44583d extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44579s f114889a;

        C44583d(C44579s sVar) {
            this.f114889a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140838a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140838a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                if (num.intValue() == 0) {
                    C44579s.m140829b(this.f114889a).setVisibility(0);
                } else {
                    C44579s.m140829b(this.f114889a).setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$e */
    static final class C44584e extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44579s f114890a;

        C44584e(C44579s sVar) {
            this.f114890a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140839a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140839a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                if (num.intValue() == 0) {
                    C44579s.m140830c(this.f114890a).setVisibility(0);
                } else {
                    C44579s.m140830c(this.f114890a).setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$f */
    static final class C44585f extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44579s f114891a;

        C44585f(C44579s sVar) {
            this.f114891a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140840a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140840a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C12629j a = this.f114891a.mo30924a("RecordChooseMusicScene");
            if (a != null) {
                if (z) {
                    this.f114891a.mo30945d(a);
                } else {
                    this.f114891a.mo30940c(a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$g */
    static final class C44586g<T> implements C0053p<Effect> {

        /* renamed from: a */
        final /* synthetic */ C44579s f114892a;

        C44586g(C44579s sVar) {
            this.f114892a = sVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Effect effect) {
            int i;
            this.f114892a.f114878C = C44579s.m140828a(effect);
            AppCompatImageView d = C44579s.m140831d(this.f114892a);
            if (this.f114892a.f114878C) {
                i = NormalGiftView.ALPHA_255;
            } else {
                i = 127;
            }
            d.setImageAlpha(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.s$h */
    static final class C44587h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44579s f114893a;

        C44587h(C44579s sVar) {
            this.f114893a = sVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C41125b.f107007a && System.currentTimeMillis() - this.f114893a.f114883x >= 100) {
                if (!this.f114893a.f114878C) {
                    C10761a.m31410e(this.f114893a.mo31012t(), this.f114893a.mo31017x().getString(R.string.dc_)).mo25750a();
                    return;
                }
                this.f114893a.mo107024T();
                this.f114893a.f114883x = System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final int mo107009N() {
        return R.layout.b23;
    }

    /* renamed from: S */
    public final RecordChooseMusicViewModel mo107023S() {
        return (RecordChooseMusicViewModel) this.f114882G.getValue();
    }

    public C44579s() {
        C7584c a = C7575l.m23595a(RecordChooseMusicViewModel.class);
        this.f114882G = C7546e.m23569a(new RecordControlSceneExpB$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: U */
    private final void m140826U() {
        if (C6399b.m19944t()) {
            I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
            if (i18nManagerService != null) {
                String appLanguage = i18nManagerService.getAppLanguage();
                C7573i.m23582a((Object) appLanguage, "it.appLanguage");
                if (!C7634n.m23721b(appLanguage, "en", false)) {
                    String appLanguage2 = i18nManagerService.getAppLanguage();
                    C7573i.m23582a((Object) appLanguage2, "it.appLanguage");
                    if (!C7634n.m23721b(appLanguage2, "zh", false)) {
                        TextView textView = this.f114880E;
                        if (textView == null) {
                            C7573i.m23583a("tvEffect");
                        }
                        textView.setVisibility(8);
                        TextView textView2 = this.f114881F;
                        if (textView2 == null) {
                            C7573i.m23583a("tvFlip");
                        }
                        textView2.setVisibility(8);
                        mo107008M().mo99460a();
                    }
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo107024T() {
        AppCompatImageView appCompatImageView = this.f114877B;
        if (appCompatImageView == null) {
            C7573i.m23583a("ivFlip");
        }
        appCompatImageView.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new C44580a(this)).withEndAction(new C44581b(this)).start();
        C39382ed edVar = this.f114879D;
        if (edVar == null) {
            C7573i.m23583a("mOwner");
        }
        if (edVar.f33526d_ instanceof VideoRecordNewActivity) {
            C39382ed edVar2 = this.f114879D;
            if (edVar2 == null) {
                C7573i.m23583a("mOwner");
            }
            Activity activity = edVar2.f33526d_;
            if (activity != null) {
                CameraModule cameraModule = ((VideoRecordNewActivity) activity).f107327m;
                C7573i.m23582a((Object) cameraModule, "cameraModule");
                int f = cameraModule.mo100087f();
                if (f == 0) {
                    C42586v a = C42586v.m135306a();
                    C7573i.m23582a((Object) a, "event");
                    a.f110739b = false;
                    C39382ed edVar3 = this.f114879D;
                    if (edVar3 == null) {
                        C7573i.m23583a("mOwner");
                    }
                    edVar3.mo97963P().mo103594a((Object) mo29173d(), (C42155av) a);
                } else if (f == 1) {
                    C42586v b = C42586v.m135307b();
                    C7573i.m23582a((Object) b, "event");
                    b.f110739b = false;
                    C39382ed edVar4 = this.f114879D;
                    if (edVar4 == null) {
                        C7573i.m23583a("mOwner");
                    }
                    edVar4.mo97963P().mo103594a((Object) mo29173d(), (C42155av) b);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m140827a(C44579s sVar) {
        View view = sVar.f114884y;
        if (view == null) {
            C7573i.m23583a("flipCameraContainer");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m140829b(C44579s sVar) {
        View view = sVar.f114885z;
        if (view == null) {
            C7573i.m23583a("uploadContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m140830c(C44579s sVar) {
        View view = sVar.f114876A;
        if (view == null) {
            C7573i.m23583a("goNextContainer");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ AppCompatImageView m140831d(C44579s sVar) {
        AppCompatImageView appCompatImageView = sVar.f114877B;
        if (appCompatImageView == null) {
            C7573i.m23583a("ivFlip");
        }
        return appCompatImageView;
    }

    /* renamed from: a */
    public static boolean m140828a(Effect effect) {
        if (effect != null && effect.getTypes().contains("AR")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        mo107008M().mo99461a(32);
        m140826U();
        mo29062a(mo96987K(), C44588t.f114894a, C11640h.m34110a(), new C44582c(this));
        mo29062a(mo96987K(), C44589u.f114895a, C11640h.m34110a(), new C44583d(this));
        mo29062a(mo96987K(), C44590v.f114896a, C11640h.m34110a(), new C44584e(this));
        mo91868b(mo107006J(), C44591w.f114897a, new C11672v(), new C44585f(this));
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(CurUseStickerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
            ((CurUseStickerViewModel) a).mo101274a().observe(this, new C44586g(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f114879D = (C39382ed) b;
        this.f114827t = C23486n.m77122a(50.0d);
        View h_ = mo31004h_(R.id.cuj);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.rl_flip_container)");
        this.f114884y = h_;
        View h_2 = mo31004h_(R.id.an4);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.fl_upload_container)");
        this.f114885z = h_2;
        View h_3 = mo31004h_(R.id.amp);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.fl_next_container)");
        this.f114876A = h_3;
        View h_4 = mo31004h_(R.id.b9f);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.iv_flip_camera)");
        this.f114877B = (AppCompatImageView) h_4;
        View h_5 = mo31004h_(R.id.dun);
        C7573i.m23582a((Object) h_5, "requireViewById(R.id.tv_flip)");
        this.f114881F = (TextView) h_5;
        View h_6 = mo31004h_(R.id.e3r);
        C7573i.m23582a((Object) h_6, "requireViewById(R.id.tv_tool_name)");
        this.f114880E = (TextView) h_6;
        View view2 = this.f114884y;
        if (view2 == null) {
            C7573i.m23583a("flipCameraContainer");
        }
        view2.setOnClickListener(new C44587h(this));
    }
}
