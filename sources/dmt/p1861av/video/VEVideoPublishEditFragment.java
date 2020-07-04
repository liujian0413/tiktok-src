package dmt.p1861av.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
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
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a;
import com.p280ss.android.ugc.aweme.shortvideo.p1547a.C38420b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41577y;
import com.p280ss.android.ugc.gamora.editor.EditGestureViewModel;
import com.p280ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditStickerViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: dmt.av.video.VEVideoPublishEditFragment */
public class VEVideoPublishEditFragment extends Fragment {

    /* renamed from: a */
    public LiveData<C47517w> f121614a;

    /* renamed from: b */
    public LiveData<C47518x> f121615b;

    /* renamed from: c */
    C47419ae f121616c = new C47419ae(0);

    /* renamed from: d */
    public SurfaceView f121617d;

    /* renamed from: e */
    public ImageView f121618e;

    /* renamed from: f */
    private int f121619f;

    /* renamed from: g */
    private boolean f121620g;

    /* renamed from: h */
    private C47396a f121621h;

    /* renamed from: i */
    private EditStickerViewModel f121622i;

    /* renamed from: j */
    private EditInfoStickerViewModel f121623j;

    /* renamed from: k */
    private EditGestureViewModel f121624k;

    /* renamed from: l */
    private int f121625l = Integer.MAX_VALUE;

    /* renamed from: m */
    private float f121626m;

    /* renamed from: dmt.av.video.VEVideoPublishEditFragment$a */
    public interface C47396a {
        /* renamed from: a */
        boolean mo119507a();
    }

    /* renamed from: a */
    private static float m147960a(float f, boolean z) {
        return z ? 1.0f - f : f;
    }

    /* renamed from: a */
    public final void mo119490a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) this.f121618e.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f121618e.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119492a(C47518x xVar) {
        if (xVar.f121991h == 1) {
            m147965a(false, xVar.f121992i, xVar.f121986c, xVar.f121987d, xVar.f121988e, xVar.f121984a, xVar.f121985b, xVar.f121993j, xVar.f121994k);
            return;
        }
        if (xVar.f121991h == 0) {
            m147965a(true, xVar.f121992i, xVar.f121986c, xVar.f121987d, xVar.f121988e, xVar.f121984a, xVar.f121985b, xVar.f121993j, xVar.f121994k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119489a(final int i) {
        Context context = getView().getContext();
        final int height = getView().getHeight();
        int width = getView().getWidth();
        int e = (int) (((float) C39805en.m127452e(context)) - C9738o.m28708b(context, 250.0f));
        final float b = C9738o.m28708b(context, 50.0f);
        final float b2 = C9738o.m28708b(context, 250.0f);
        VESize c = this.f121616c.f121778t.mo38828c();
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
            C473893 r2 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = (((float) i5) * floatValue) / ((float) i2);
                    int i = (int) ((((float) i6) - f) / 2.0f);
                    int i2 = (int) (((((float) height) - (b2 * (1.0f - animatedFraction))) - floatValue) / 2.0f);
                    int i3 = (int) f;
                    int i4 = (int) floatValue;
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38798a(i, i2, i3, i4);
                    VEVideoPublishEditFragment.this.mo119490a(i, i2, i3, i4);
                    VEVideoPublishEditFragment.this.mo119488a((floatValue * 1.0f) / ((float) i2), i, i2);
                }
            };
            ofFloat.addUpdateListener(r2);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38823b(i);
                    VEVideoPublishEditFragment.this.f121616c.f121777s.mo119465a(false);
                }
            });
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{((float) e) / ((float) height), 1.0f});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i7 = width;
            C473915 r22 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = floatValue * ((float) i7);
                    float f2 = (((float) i2) * f) / ((float) i3);
                    int i = (int) ((((float) i7) - f) / 2.0f);
                    int animatedFraction = (int) (((((float) height) - ((b2 - b) * (1.0f - valueAnimator.getAnimatedFraction()))) - f2) / 2.0f);
                    int i2 = (int) f;
                    int i3 = (int) f2;
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38798a(i, animatedFraction, i2, i3);
                    VEVideoPublishEditFragment.this.mo119490a(i, animatedFraction, i2, i3);
                    VEVideoPublishEditFragment.this.mo119488a((f2 * 1.0f) / ((float) i2), i, animatedFraction);
                }
            };
            ofFloat2.addUpdateListener(r22);
            ofFloat2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38823b(i);
                    VEVideoPublishEditFragment.this.f121616c.f121777s.mo119465a(false);
                }
            });
            ofFloat2.start();
        }
        this.f121616c.f121778t.mo38832c(true);
    }

    /* renamed from: a */
    public final void mo119488a(float f, int i, int i2) {
        if (this.f121625l == Integer.MAX_VALUE && C41577y.m132408a(f, 1.0f)) {
            this.f121625l = i2;
        }
        float f2 = (float) i;
        this.f121622i.mo106360a(f, f2, ((float) (i2 - this.f121625l)) + this.f121626m);
        this.f121623j.mo106244a(f, f2, ((float) (i2 - this.f121625l)) + this.f121626m);
        this.f121624k.mo106227a(f, f2, ((float) (i2 - this.f121625l)) + this.f121626m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119493a(boolean z, float f, int i, int i2, int i3, int i4, int i5, int i6, ValueAnimator valueAnimator) {
        boolean z2 = z;
        float a = m147960a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] a2 = m147969a(a, floatValue, f, i, i2, i3, i4, i5);
        float f2 = a2[0];
        float f3 = a2[1];
        int i7 = (int) f3;
        int i8 = (int) a2[2];
        int i9 = (int) f2;
        int i10 = (int) floatValue;
        this.f121616c.f121778t.mo38798a(i7, i8, i9, i10);
        mo119490a(i7, i8, i9, i10);
        mo119488a((floatValue * 1.0f) / ((float) i6), i7, i8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119494a(boolean z, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, ValueAnimator valueAnimator) {
        float[] fArr;
        float f2 = f;
        int i8 = i3;
        int i9 = i4;
        boolean z2 = z;
        float a = m147960a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (m147966a(i, i2)) {
            fArr = m147967a(a, floatValue, f, i3, i9 - ((!C39805en.m127445a() || !C39804em.m127436a()) ? 0 : i5));
        } else if (C39805en.m127445a()) {
            fArr = m147970b(a, floatValue, f, i3, i9);
        } else {
            fArr = m147968a(a, floatValue, f, i3, i6, i4, i7);
        }
        float f3 = fArr[0];
        int i10 = (int) fArr[1];
        int i11 = (int) fArr[2];
        int i12 = (int) f3;
        int i13 = (int) floatValue;
        this.f121616c.f121778t.mo38798a(i10, i11, i12, i13);
        mo119490a(i10, i11, i12, i13);
        mo119488a((floatValue * 1.0f) / ((float) i), i10, i11);
        C39701c.m127045a(i10, i11, i12, i13);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119491a(ValueAnimator valueAnimator) {
        this.f121626m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* renamed from: a */
    private static float[] m147969a(float f, float f2, float f3, int i, int i2, int i3, int i4, int i5) {
        return new float[]{f3 * f2, 0.0f, ((((((float) i) - (((float) (i2 - i3)) * f)) - f2) / 2.0f) + ((float) i4)) - ((float) i5)};
    }

    /* renamed from: a */
    private C15389d m147962a() {
        if (this.f121616c == null) {
            return null;
        }
        return this.f121616c.f121778t;
    }

    public void onDestroy() {
        this.f121616c.mo119572b();
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        if (this.f121620g) {
            m147962a().mo38868p();
            this.f121620g = false;
            C41530am.m132285d("VEVideoPublishEditFragment prepare");
        }
    }

    public void onStop() {
        if (C35563c.f93231M.mo93305a(Property.EnableEditPageMemoryOpt) && this.f121621h != null && this.f121621h.mo119507a() && m147962a() != null) {
            m147962a().mo38873r();
            this.f121620g = true;
            C41530am.m132285d("VEVideoPublishEditFragment releaseEngine");
        }
        super.onStop();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C47396a) {
            this.f121621h = (C47396a) context;
        }
    }

    /* renamed from: a */
    private void m147963a(float f) {
        this.f121622i.mo106361a(f, 300);
        this.f121624k.mo106228a(f, 300);
        this.f121623j.mo106245a(f, 300);
    }

    /* renamed from: a */
    private FrameLayout m147961a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f121617d = new SurfaceView(context);
        this.f121617d.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f121617d);
        this.f121618e = new ImageView(context);
        this.f121618e.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f121618e);
        this.f121618e.setScaleType(ScaleType.FIT_XY);
        return frameLayout;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f121616c.mo119564a(getContext(), (C0043i) this, this.f121617d, C39506a.m126191b());
        this.f121622i = (EditStickerViewModel) C36113b.m116288a(requireActivity()).mo91871a(EditStickerViewModel.class);
        this.f121623j = (EditInfoStickerViewModel) C36113b.m116288a(requireActivity()).mo91871a(EditInfoStickerViewModel.class);
        this.f121624k = (EditGestureViewModel) C36113b.m116288a(requireActivity()).mo91871a(EditGestureViewModel.class);
        this.f121614a.observe(this, new C0053p<C47517w>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47517w wVar) {
                if (wVar.f121981a == 1) {
                    VEVideoPublishEditFragment.this.mo119495b(wVar.f121982b);
                    return;
                }
                if (wVar.f121981a == 0) {
                    VEVideoPublishEditFragment.this.mo119489a(wVar.f121982b);
                }
            }
        });
        this.f121614a.observe(this, new C47456e());
        this.f121615b.observe(this, new C47415aa(this));
        this.f121615b.observe(this, new C47456e());
    }

    /* renamed from: b */
    public final void mo119495b(int i) {
        this.f121616c.f121777s.mo119465a(true);
        this.f121616c.f121778t.mo38823b(i);
        Context context = getView().getContext();
        final int height = getView().getHeight();
        int width = getView().getWidth();
        int e = (int) (((float) C39805en.m127452e(context)) - C9738o.m28708b(context, 250.0f));
        final float b = C9738o.m28708b(context, 50.0f);
        final float b2 = C9738o.m28708b(context, 250.0f);
        VESize c = this.f121616c.f121778t.mo38828c();
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
            C4738710 r2 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = (((float) i5) * floatValue) / ((float) i2);
                    int i = (int) ((((float) i6) - f) / 2.0f);
                    int i2 = (int) (((((float) height) - (b2 * animatedFraction)) - floatValue) / 2.0f);
                    int i3 = (int) f;
                    int i4 = (int) floatValue;
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38798a(i, i2, i3, i4);
                    VEVideoPublishEditFragment.this.mo119490a(i, i2, i3, i4);
                    VEVideoPublishEditFragment.this.mo119488a((floatValue * 1.0f) / ((float) i2), i, i2);
                }
            };
            ofFloat.addUpdateListener(r2);
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, ((float) e) / ((float) height)});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            final int i7 = width;
            C473882 r22 = new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f = floatValue * ((float) i7);
                    float f2 = (((float) i2) * f) / ((float) i3);
                    int i = (int) ((((float) i7) - f) / 2.0f);
                    int animatedFraction = (int) (((((float) height) - ((b2 - b) * valueAnimator.getAnimatedFraction())) - f2) / 2.0f);
                    int i2 = (int) f;
                    int i3 = (int) f2;
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38798a(i, animatedFraction, i2, i3);
                    VEVideoPublishEditFragment.this.mo119490a(i, animatedFraction, i2, i3);
                    VEVideoPublishEditFragment.this.mo119488a((f2 * 1.0f) / ((float) i2), i, animatedFraction);
                }
            };
            ofFloat2.addUpdateListener(r22);
            ofFloat2.start();
        }
        this.f121616c.f121778t.mo38832c(false);
    }

    /* renamed from: a */
    private static boolean m147966a(int i, int i2) {
        return C39804em.m127437a(i2, i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return m147961a(getContext());
    }

    /* renamed from: a */
    private void m147964a(boolean z, final int i, int i2, int i3) {
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
                    VEVideoPublishEditFragment.this.f121616c.f121778t.mo38823b(i);
                    VEVideoPublishEditFragment.this.f121616c.f121777s.mo119465a(false);
                }
            });
        }
        getView().startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C47418ad(this));
        ofFloat.start();
    }

    /* renamed from: b */
    private static float[] m147970b(float f, float f2, float f3, int i, int i2) {
        float f4 = f2 * f3;
        return new float[]{f4, (((float) i) - f4) / 2.0f, 0.0f};
    }

    /* renamed from: a */
    private static float[] m147967a(float f, float f2, float f3, int i, int i2) {
        float f4 = f2 * f3;
        return new float[]{f4, (((float) i) - f4) / 2.0f, ((float) i2) * f};
    }

    /* renamed from: a */
    private static float[] m147968a(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        float f4 = f3 * f2;
        return new float[]{f4, (((float) i) - f4) / 2.0f, ((((float) i2) - (((float) (i4 - i3)) * f)) - f2) / 2.0f};
    }

    /* renamed from: a */
    private void m147965a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        boolean z4;
        float f;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        boolean z5 = z;
        final int i11 = i;
        int i12 = i4;
        if (!z5) {
            this.f121616c.f121777s.mo119465a(z2);
            this.f121616c.f121778t.mo38823b(i11);
            if (C39805en.m127445a() && (getActivity() instanceof VEVideoPublishEditActivity)) {
                ((VEVideoPublishEditActivity) getActivity()).mo98065a(i11);
            }
        } else if (C39805en.m127445a() && (getActivity() instanceof VEVideoPublishEditActivity)) {
            ((VEVideoPublishEditActivity) getActivity()).mo98065a(getResources().getColor(R.color.fs));
        }
        int e = C39805en.m127452e(getActivity());
        int width = getView().getWidth();
        int c = C39805en.m127450c(getActivity());
        VESize c2 = this.f121616c.f121778t.mo38828c();
        int i13 = c2.f116386b;
        int i14 = c2.f116385a;
        float f3 = (float) i13;
        float f4 = ((float) i14) / f3;
        if (i12 <= i13) {
            if (z5) {
                f = (float) i12;
            } else {
                f = f3;
            }
            if (!z5) {
                f3 = (float) i12;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f3});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            C47417ac acVar = r0;
            int i15 = i13;
            int i16 = i13;
            ValueAnimator valueAnimator = ofFloat;
            int i17 = i14;
            C47417ac acVar2 = new C47417ac(this, z, i15, i14, f4, width, i2, c, e, i3);
            valueAnimator.addUpdateListener(acVar);
            if (z5) {
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        VEVideoPublishEditFragment.this.f121616c.f121778t.mo38823b(i11);
                        VEVideoPublishEditFragment.this.f121616c.f121777s.mo119465a(false);
                    }
                });
            }
            valueAnimator.start();
            if (!m147966a(i16, i17) && C39805en.m127445a()) {
                if (!z5) {
                    this.f121619f = ((MarginLayoutParams) getView().getLayoutParams()).topMargin - i2;
                }
                if (z5) {
                    i8 = -this.f121619f;
                    i7 = 0;
                } else {
                    i7 = -this.f121619f;
                    i8 = 0;
                }
                m147964a(z5, i11, i8, i7);
            }
        } else if (C39805en.m127445a()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getView().getLayoutParams();
            if (z5) {
                i10 = (((((C39805en.m127452e(getContext()) - i2) - i3) - i13) / 2) + i2) - marginLayoutParams.topMargin;
                i9 = 0;
            } else {
                i9 = (((((C39805en.m127452e(getContext()) - i2) - i3) - i13) / 2) + i2) - marginLayoutParams.topMargin;
                i10 = 0;
            }
            m147964a(z5, i11, i10, i9);
            m147963a((float) i9);
        } else {
            int i18 = (int) (((float) width) / f4);
            if (z5) {
                f2 = (float) i18;
            } else {
                f2 = f3;
            }
            if (!z5) {
                f3 = (float) i18;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f2, f3});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            C47416ab abVar = r0;
            ValueAnimator valueAnimator2 = ofFloat2;
            C47416ab abVar2 = new C47416ab(this, z, f4, e, i3, i2, i5, i6, i13);
            valueAnimator2.addUpdateListener(abVar);
            if (z5) {
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        VEVideoPublishEditFragment.this.f121616c.f121778t.mo38823b(i11);
                        VEVideoPublishEditFragment.this.f121616c.f121777s.mo119465a(false);
                    }
                });
            }
            valueAnimator2.start();
        }
        C38420b bVar = this.f121616c.f121778t;
        if (z5 || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        bVar.mo38832c(z4);
    }
}
