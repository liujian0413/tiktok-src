package com.p280ss.android.ugc.gamora.editor.p1743b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9738o;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39508b;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41577y;
import com.p280ss.android.ugc.gamora.editor.C44317cv;
import com.p280ss.android.ugc.gamora.editor.EditGestureViewModel;
import com.p280ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditStickerViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEListener.C45219o;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47419ae;
import dmt.p1861av.video.C47456e;
import dmt.p1861av.video.C47462j;
import dmt.p1861av.video.C47466l;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47515u;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47517w;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47520y;
import dmt.p1861av.video.VEEditorAutoStartStopArbiter;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import dmt.p1861av.video.p1862a.C47398a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.gamora.editor.b.a */
public final class C44148a extends C12629j {

    /* renamed from: i */
    public LiveData<C47517w> f114158i;

    /* renamed from: j */
    public LiveData<C47518x> f114159j;

    /* renamed from: k */
    C47419ae f114160k = new C47419ae(0);

    /* renamed from: l */
    public C44160b f114161l;

    /* renamed from: m */
    public SurfaceView f114162m;

    /* renamed from: n */
    public ImageView f114163n;

    /* renamed from: o */
    public C44317cv f114164o;

    /* renamed from: p */
    private int f114165p;

    /* renamed from: q */
    private boolean f114166q;

    /* renamed from: r */
    private C44159a f114167r;

    /* renamed from: s */
    private EditStickerViewModel f114168s;

    /* renamed from: t */
    private EditInfoStickerViewModel f114169t;

    /* renamed from: u */
    private EditGestureViewModel f114170u;

    /* renamed from: v */
    private int f114171v = Integer.MAX_VALUE;

    /* renamed from: w */
    private float f114172w;

    /* renamed from: com.ss.android.ugc.gamora.editor.b.a$a */
    public interface C44159a {
        /* renamed from: d */
        boolean mo98080d();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.b.a$b */
    public interface C44160b {
        /* renamed from: a */
        void mo106574a(C47517w wVar);

        /* renamed from: a */
        void mo106575a(C47518x xVar);
    }

    /* renamed from: a */
    private static float m139728a(float f, boolean z) {
        return z ? 1.0f - f : f;
    }

    /* renamed from: a */
    public final void mo106634a(int i, C45219o oVar) {
        this.f114160k = new C47419ae(i);
        this.f114160k.f121781w = oVar;
    }

    /* renamed from: a */
    public final C47398a mo106631a() {
        return this.f114160k.f121755E;
    }

    /* renamed from: a */
    public final void mo106633a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) this.f114163n.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f114163n.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return m139729a((Context) mo31015v());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo106639a(C47518x xVar) {
        if (xVar.f121991h == 1) {
            m139733a(false, xVar.f121992i, xVar.f121986c, xVar.f121987d, xVar.f121988e, xVar.f121984a, xVar.f121985b);
        } else if (xVar.f121991h == 0) {
            m139734a(true, xVar.f121992i, xVar.f121986c, xVar.f121987d, xVar.f121988e, xVar.f121984a, xVar.f121985b, xVar.f121989f);
        }
        if (this.f114161l != null) {
            this.f114161l.mo106575a(xVar);
        }
    }

    /* renamed from: a */
    public final void mo106632a(float f, int i, int i2) {
        if (this.f114171v == Integer.MAX_VALUE && C41577y.m132408a(f, 1.0f)) {
            this.f114171v = i2;
        }
        float f2 = (float) i;
        this.f114168s.mo106360a(f, f2, ((float) (i2 - this.f114171v)) + this.f114172w);
        this.f114169t.mo106244a(f, f2, ((float) (i2 - this.f114171v)) + this.f114172w);
        this.f114170u.mo106227a(f, f2, ((float) (i2 - this.f114171v)) + this.f114172w);
    }

    /* renamed from: a */
    public final void mo106637a(C0052o<C15389d> oVar) {
        if (this.f114160k != null) {
            this.f114160k.f121757G = oVar;
        }
    }

    /* renamed from: a */
    public final void mo106636a(LiveData<VEPreviewParams> liveData) {
        this.f114160k.f121762d = liveData;
    }

    /* renamed from: a */
    public final void mo106638a(C47462j<C47466l> jVar) {
        this.f114160k.f121768j = jVar;
    }

    /* renamed from: a */
    public final void mo106640a(ArrayList<EffectPointModel> arrayList) {
        this.f114160k.mo119568a(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo106641a(boolean z, float f, int i, int i2, int i3, int i4, int i5, int i6, ValueAnimator valueAnimator) {
        boolean z2 = z;
        float a = m139728a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] a2 = m139738a(a, floatValue, f, i, i2, i3, i4, i5);
        float f2 = a2[0];
        float f3 = a2[1];
        int i7 = (int) f3;
        int i8 = (int) a2[2];
        int i9 = (int) f2;
        int i10 = (int) floatValue;
        this.f114160k.f121778t.mo38798a(i7, i8, i9, i10);
        mo106633a(i7, i8, i9, i10);
        mo106632a((floatValue * 1.0f) / ((float) i6), i7, i8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo106642a(boolean z, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, ValueAnimator valueAnimator) {
        float[] fArr;
        float f2 = f;
        int i8 = i3;
        int i9 = i4;
        boolean z2 = z;
        float a = m139728a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (m139735a(i, i2)) {
            fArr = m139736a(a, floatValue, f, i3, i9 - ((!C39805en.m127445a() || !C39804em.m127436a()) ? 0 : i5));
        } else if (C39805en.m127445a()) {
            fArr = m139739b(a, floatValue, f, i3, i9);
        } else {
            fArr = m139737a(a, floatValue, f, i3, i6, i4, i7);
        }
        float f3 = fArr[0];
        int i10 = (int) fArr[1];
        int i11 = (int) fArr[2];
        int i12 = (int) f3;
        int i13 = (int) floatValue;
        this.f114160k.f121778t.mo38798a(i10, i11, i12, i13);
        mo106633a(i10, i11, i12, i13);
        mo106632a((floatValue * 1.0f) / ((float) i), i10, i11);
        C39701c.m127045a(i10, i11, i12, i13);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo106635a(ValueAnimator valueAnimator) {
        this.f114172w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* renamed from: a */
    private static float[] m139737a(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        float f4 = f3 * f2;
        return new float[]{f4, (((float) i) - f4) / 2.0f, ((((float) i2) - (((float) (i4 - i3)) * f)) - f2) / 2.0f};
    }

    /* renamed from: a */
    private static float[] m139738a(float f, float f2, float f3, int i, int i2, int i3, int i4, int i5) {
        return new float[]{f3 * f2, 0.0f, ((((((float) i) - (((float) (i2 - i3)) * f)) - f2) / 2.0f) + ((float) i4)) - ((float) i5)};
    }

    /* renamed from: b */
    public final VEEditorAutoStartStopArbiter mo106643b() {
        return this.f114160k.f121777s;
    }

    /* renamed from: c */
    public final C0052o<Void> mo106647c() {
        return this.f114160k.f121782x;
    }

    /* renamed from: d */
    public final C0052o<Void> mo106650d() {
        return this.f114160k.f121783y;
    }

    /* renamed from: e */
    public final C0052o<Boolean> mo106653e() {
        return this.f114160k.f121784z;
    }

    /* renamed from: G */
    private C15389d m139727G() {
        if (this.f114160k == null) {
            return null;
        }
        return this.f114160k.f121778t;
    }

    /* renamed from: o */
    public final void mo31006o() {
        super.mo31006o();
        if (this.f33526d_ instanceof C44159a) {
            this.f114167r = (C44159a) this.f33526d_;
        }
    }

    /* renamed from: q */
    public final void mo31008q() {
        this.f114160k.mo119572b();
        super.mo31008q();
    }

    /* renamed from: z */
    public final void mo31019z() {
        super.mo31019z();
        if (this.f114166q) {
            m139727G().mo38868p();
            this.f114166q = false;
            C41530am.m132285d("VEVideoPublishEditFragment prepare");
        }
    }

    /* renamed from: C */
    public final void mo30995C() {
        if (C35563c.f93231M.mo93305a(Property.EnableEditPageMemoryOpt) && this.f114167r != null && this.f114167r.mo98080d() && m139727G() != null) {
            m139727G().mo38873r();
            this.f114166q = true;
            C41530am.m132285d("VEVideoPublishEditFragment releaseEngine");
        }
        super.mo30995C();
    }

    /* renamed from: f */
    public final void mo106658f(LiveData<C47515u> liveData) {
        this.f114160k.f121771m = liveData;
    }

    /* renamed from: g */
    public final void mo106660g(C0052o<InfoStickerModel> oVar) {
        this.f114160k.f121772n = oVar;
    }

    /* renamed from: h */
    public final void mo106661h(C0052o<Boolean> oVar) {
        this.f114160k.f121774p = oVar;
    }

    /* renamed from: i */
    public final void mo106662i(C0052o<C40026b> oVar) {
        this.f114160k.f121776r = oVar;
    }

    /* renamed from: b */
    public final void mo106644b(LiveData<VEPreviewMusicParams> liveData) {
        this.f114160k.f121763e = liveData;
    }

    /* renamed from: c */
    public final void mo106648c(LiveData<C29321a> liveData) {
        this.f114160k.f121764f = liveData;
    }

    /* renamed from: d */
    public final void mo106651d(LiveData<C47516v> liveData) {
        this.f114160k.f121765g = liveData;
    }

    /* renamed from: e */
    public final void mo106655e(LiveData<C47479s> liveData) {
        this.f114160k.f121766h = liveData;
    }

    /* renamed from: f */
    public final void mo106659f(C0052o<Boolean> oVar) {
        this.f114160k.mo119562a(oVar);
    }

    /* renamed from: a */
    public static C44148a m139730a(VEPreviewParams vEPreviewParams) {
        C44148a aVar = new C44148a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", null);
        aVar.f33529g = bundle;
        return aVar;
    }

    /* renamed from: d */
    public static IllegalStateException m139740d(int i) {
        StringBuilder sb = new StringBuilder("Seek failed. ret = ");
        sb.append(i);
        sb.append(" See logs for more details.");
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final void mo106649c(C0052o<C39508b> oVar) {
        if (oVar != null) {
            this.f114160k.f121775q = oVar;
        }
    }

    /* renamed from: e */
    public final void mo106656e(C0052o<VEVolumeChangeOp> oVar) {
        this.f114160k.f121770l = oVar;
    }

    /* renamed from: a */
    private FrameLayout m139729a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f114162m = new SurfaceView(context);
        this.f114162m.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f114162m);
        this.f114163n = new ImageView(context);
        this.f114163n.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f114163n);
        this.f114163n.setScaleType(ScaleType.FIT_XY);
        return frameLayout;
    }

    /* renamed from: b */
    public final void mo106645b(C0052o<AudioEffectParam> oVar) {
        if (oVar != null) {
            this.f114160k.mo119574b(oVar);
        }
    }

    /* renamed from: d */
    public final void mo106652d(C0052o<AudioRecorderParam> oVar) {
        this.f114160k.f121769k = oVar;
    }

    /* renamed from: a */
    private void m139731a(float f) {
        this.f114168s.mo106361a(f, 300);
        this.f114170u.mo106228a(f, 300);
        this.f114169t.mo106245a(f, 300);
    }

    /* renamed from: b */
    public final void mo106646b(C47462j<C47520y> jVar) {
        this.f114160k.f121767i = jVar;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        this.f114160k.mo119564a((Context) mo31015v(), (C0043i) this.f114164o, this.f114162m, C39506a.m126191b());
        this.f114168s = (EditStickerViewModel) C36113b.m116288a((FragmentActivity) mo31015v()).mo91871a(EditStickerViewModel.class);
        this.f114169t = (EditInfoStickerViewModel) C36113b.m116288a((FragmentActivity) mo31015v()).mo91871a(EditInfoStickerViewModel.class);
        this.f114170u = (EditGestureViewModel) C36113b.m116288a((FragmentActivity) mo31015v()).mo91871a(EditGestureViewModel.class);
        this.f114158i.observe(this, new C0053p<C47517w>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47517w wVar) {
                if (wVar.f121981a == 1) {
                    C44148a.this.mo106657f(wVar.f121982b);
                } else if (wVar.f121981a == 0) {
                    C44148a.this.mo106654e(wVar.f121982b);
                }
                if (C44148a.this.f114161l != null) {
                    C44148a.this.f114161l.mo106574a(wVar);
                }
            }
        });
        this.f114158i.observe(this, new C47456e());
        this.f114159j.observe(this, new C44161b(this));
        this.f114159j.observe(this, new C47456e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo106654e(final int i) {
        Context context = this.f33523b.getContext();
        final int height = this.f33523b.getHeight();
        int width = this.f33523b.getWidth();
        int e = (int) (((float) C39805en.m127452e(context)) - C9738o.m28708b(context, 250.0f));
        final float b = C9738o.m28708b(context, 50.0f);
        final float b2 = C9738o.m28708b(context, 250.0f);
        VESize c = this.f114160k.f121778t.mo38828c();
        final int i2 = c.f116386b;
        final int i3 = c.f116385a;
        if (i2 > i3) {
            int i4 = width / 2;
            if ((i4 * height) / width < e) {
                e = (i4 * i2) / i3;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) e, (float) i2});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i5 = i3;
            final int i6 = width;
            C441523 r2 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = (((float) i5) * floatValue) / ((float) i2);
                    int i = (int) ((((float) i6) - f) / 2.0f);
                    int i2 = (int) (((((float) height) - (b2 * (1.0f - animatedFraction))) - floatValue) / 2.0f);
                    int i3 = (int) f;
                    int i4 = (int) floatValue;
                    C44148a.this.f114160k.f121778t.mo38798a(i, i2, i3, i4);
                    C44148a.this.mo106633a(i, i2, i3, i4);
                    C44148a.this.mo106632a((floatValue * 1.0f) / ((float) i2), i, i2);
                }
            };
            ofFloat.addUpdateListener(r2);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C44148a.this.f114160k.f121778t.mo38823b(i);
                    C44148a.this.f114160k.f121777s.mo119465a(false);
                }
            });
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{((float) e) / ((float) height), 1.0f});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i7 = width;
            C441545 r22 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = floatValue * ((float) i7);
                    float f2 = (((float) i2) * f) / ((float) i3);
                    int i = (int) ((((float) i7) - f) / 2.0f);
                    int animatedFraction = (int) (((((float) height) - ((b2 - b) * (1.0f - valueAnimator.getAnimatedFraction()))) - f2) / 2.0f);
                    int i2 = (int) f;
                    int i3 = (int) f2;
                    C44148a.this.f114160k.f121778t.mo38798a(i, animatedFraction, i2, i3);
                    C44148a.this.mo106633a(i, animatedFraction, i2, i3);
                    C44148a.this.mo106632a((f2 * 1.0f) / ((float) i2), i, animatedFraction);
                }
            };
            ofFloat2.addUpdateListener(r22);
            ofFloat2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C44148a.this.f114160k.f121778t.mo38823b(i);
                    C44148a.this.f114160k.f121777s.mo119465a(false);
                }
            });
            ofFloat2.start();
        }
        this.f114160k.f121778t.mo38832c(true);
    }

    /* renamed from: f */
    public final void mo106657f(int i) {
        this.f114160k.f121777s.mo119465a(true);
        this.f114160k.f121778t.mo38823b(i);
        Context context = this.f33523b.getContext();
        final int height = this.f33523b.getHeight();
        int width = this.f33523b.getWidth();
        int e = (int) (((float) C39805en.m127452e(context)) - C9738o.m28708b(context, 250.0f));
        final float b = C9738o.m28708b(context, 50.0f);
        final float b2 = C9738o.m28708b(context, 250.0f);
        VESize c = this.f114160k.f121778t.mo38828c();
        final int i2 = c.f116386b;
        final int i3 = c.f116385a;
        if (i2 > i3) {
            int i4 = ((width / 2) * i2) / i3;
            if (i4 < e) {
                e = i4;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i2, (float) e});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i5 = i3;
            final int i6 = width;
            C4415010 r2 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = (((float) i5) * floatValue) / ((float) i2);
                    int i = (int) ((((float) i6) - f) / 2.0f);
                    int i2 = (int) (((((float) height) - (b2 * animatedFraction)) - floatValue) / 2.0f);
                    int i3 = (int) f;
                    int i4 = (int) floatValue;
                    C44148a.this.f114160k.f121778t.mo38798a(i, i2, i3, i4);
                    C44148a.this.mo106633a(i, i2, i3, i4);
                    C44148a.this.mo106632a((floatValue * 1.0f) / ((float) i2), i, i2);
                }
            };
            ofFloat.addUpdateListener(r2);
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, ((float) e) / ((float) height)});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i7 = width;
            C441512 r22 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = floatValue * ((float) i7);
                    float f2 = (((float) i2) * f) / ((float) i3);
                    int i = (int) ((((float) i7) - f) / 2.0f);
                    int animatedFraction = (int) (((((float) height) - ((b2 - b) * valueAnimator.getAnimatedFraction())) - f2) / 2.0f);
                    int i2 = (int) f;
                    int i3 = (int) f2;
                    C44148a.this.f114160k.f121778t.mo38798a(i, animatedFraction, i2, i3);
                    C44148a.this.mo106633a(i, animatedFraction, i2, i3);
                    C44148a.this.mo106632a((f2 * 1.0f) / ((float) i2), i, animatedFraction);
                }
            };
            ofFloat2.addUpdateListener(r22);
            ofFloat2.start();
        }
        this.f114160k.f121778t.mo38832c(false);
    }

    /* renamed from: a */
    private static boolean m139735a(int i, int i2) {
        return C39804em.m127437a(i2, i);
    }

    /* renamed from: a */
    private void m139732a(boolean z, final int i, int i2, int i3) {
        float f = (float) i2;
        float f2 = (float) i3;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        if (z) {
            translateAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C44148a.this.f114160k.f121778t.mo38823b(i);
                    C44148a.this.f114160k.f121777s.mo119465a(false);
                }
            });
        }
        this.f33523b.startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C44164e(this));
        ofFloat.start();
    }

    /* renamed from: b */
    private static float[] m139739b(float f, float f2, float f3, int i, int i2) {
        float f4 = f2 * f3;
        return new float[]{f4, (((float) i) - f4) / 2.0f, 0.0f};
    }

    /* renamed from: a */
    private static float[] m139736a(float f, float f2, float f3, int i, int i2) {
        float f4 = f2 * f3;
        return new float[]{f4, (((float) i) - f4) / 2.0f, ((float) i2) * f};
    }

    /* renamed from: a */
    private void m139733a(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        m139734a(false, i, i2, i3, i4, i5, i6, false);
    }

    /* renamed from: a */
    private void m139734a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        float f;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        boolean z3 = z;
        final int i11 = i;
        int i12 = i4;
        if (!z3) {
            this.f114160k.f121777s.mo119465a(true);
            this.f114160k.f121778t.mo38823b(i11);
            if (C39805en.m127445a() && (this.f33526d_ instanceof VEVideoPublishEditActivity)) {
                ((VEVideoPublishEditActivity) this.f33526d_).mo98065a(i11);
            }
        } else if (C39805en.m127445a() && (this.f33526d_ instanceof VEVideoPublishEditActivity)) {
            ((VEVideoPublishEditActivity) this.f33526d_).mo98065a(mo31017x().getColor(R.color.fs));
        }
        int e = C39805en.m127452e(this.f33526d_);
        int width = this.f33523b.getWidth();
        int c = C39805en.m127450c(this.f33526d_);
        VESize c2 = this.f114160k.f121778t.mo38828c();
        int i13 = c2.f116386b;
        int i14 = c2.f116385a;
        float f3 = (float) i13;
        float f4 = ((float) i14) / f3;
        if (i12 <= i13) {
            if (z3) {
                f = (float) i12;
            } else {
                f = f3;
            }
            if (!z3) {
                f3 = (float) i12;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f3});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            C44163d dVar = r0;
            int i15 = i13;
            int i16 = i13;
            ValueAnimator valueAnimator = ofFloat;
            int i17 = i14;
            C44163d dVar2 = new C44163d(this, z, i15, i14, f4, width, i2, c, e, i3);
            valueAnimator.addUpdateListener(dVar);
            if (z3) {
                final boolean z4 = z2;
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C44148a.this.f114160k.f121778t.mo38823b(i11);
                        C44148a.this.f114160k.f121777s.mo119466a(false, z4);
                    }
                });
            }
            valueAnimator.start();
            if (!m139735a(i16, i17) && C39805en.m127445a()) {
                if (!z3) {
                    this.f114165p = ((MarginLayoutParams) this.f33523b.getLayoutParams()).topMargin - i2;
                }
                if (z3) {
                    i8 = -this.f114165p;
                    i7 = 0;
                } else {
                    i7 = -this.f114165p;
                    i8 = 0;
                }
                m139732a(z3, i11, i8, i7);
            }
        } else if (C39805en.m127445a()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f33523b.getLayoutParams();
            if (z3) {
                i10 = (((((C39805en.m127452e(mo31015v()) - i2) - i3) - i13) / 2) + i2) - marginLayoutParams.topMargin;
                i9 = 0;
            } else {
                i9 = (((((C39805en.m127452e(mo31015v()) - i2) - i3) - i13) / 2) + i2) - marginLayoutParams.topMargin;
                i10 = 0;
            }
            m139732a(z3, i11, i10, i9);
            m139731a((float) i9);
        } else {
            int i18 = (int) (((float) width) / f4);
            if (z3) {
                f2 = (float) i18;
            } else {
                f2 = f3;
            }
            if (!z3) {
                f3 = (float) i18;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f2, f3});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            C44162c cVar = r0;
            ValueAnimator valueAnimator2 = ofFloat2;
            C44162c cVar2 = new C44162c(this, z, f4, e, i3, i2, i5, i6, i13);
            valueAnimator2.addUpdateListener(cVar);
            if (z3) {
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C44148a.this.f114160k.f121778t.mo38823b(i11);
                        C44148a.this.f114160k.f121777s.mo119465a(false);
                    }
                });
            }
            valueAnimator2.start();
        }
        this.f114160k.f121778t.mo38832c(z3);
    }
}
