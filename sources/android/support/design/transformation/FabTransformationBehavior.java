package android.support.design.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.circularreveal.C0258a;
import android.support.design.circularreveal.C0261c;
import android.support.design.circularreveal.C0263d;
import android.support.design.circularreveal.C0263d.C0267c;
import android.support.design.circularreveal.C0263d.C0268d;
import android.support.design.p015a.C0234a;
import android.support.design.p015a.C0235b;
import android.support.design.p015a.C0236c;
import android.support.design.p015a.C0237d;
import android.support.design.p015a.C0238e;
import android.support.design.p015a.C0241h;
import android.support.design.p015a.C0242i;
import android.support.design.p015a.C0243j;
import android.support.design.widget.C0402j;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.design.widget.FloatingActionButton;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f1241c = new Rect();

    /* renamed from: d */
    private final RectF f1242d = new RectF();

    /* renamed from: e */
    private final RectF f1243e = new RectF();

    /* renamed from: f */
    private final int[] f1244f = new int[2];

    /* renamed from: android.support.design.transformation.FabTransformationBehavior$a */
    protected static class C0312a {

        /* renamed from: a */
        public C0241h f1256a;

        /* renamed from: b */
        public C0243j f1257b;

        protected C0312a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0312a mo1211a(Context context, boolean z);

    /* renamed from: a */
    public final boolean mo1205a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static void m1219a(View view, View view2, boolean z, boolean z2, C0312a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float s = C0991u.m4240s(view2) - C0991u.m4240s(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-s);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-s});
        }
        aVar.f1256a.mo673a("elevation").mo678a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    private void m1220a(View view, View view2, boolean z, boolean z2, C0312a aVar, List<Animator> list, List<AnimatorListener> list2, RectF rectF) {
        C0242i iVar;
        C0242i iVar2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        C0312a aVar2 = aVar;
        List<Animator> list3 = list;
        float a = m1212a(view3, view4, aVar2.f1257b);
        float b = m1221b(view3, view4, aVar2.f1257b);
        if (a == 0.0f || b == 0.0f) {
            iVar2 = aVar2.f1256a.mo673a("translationXLinear");
            iVar = aVar2.f1256a.mo673a("translationYLinear");
        } else if ((!z || b >= 0.0f) && (z || b <= 0.0f)) {
            iVar2 = aVar2.f1256a.mo673a("translationXCurveDownwards");
            iVar = aVar2.f1256a.mo673a("translationYCurveDownwards");
        } else {
            iVar2 = aVar2.f1256a.mo673a("translationXCurveUpwards");
            iVar = aVar2.f1256a.mo673a("translationYCurveUpwards");
        }
        C0242i iVar3 = iVar2;
        C0242i iVar4 = iVar;
        if (z) {
            if (!z2) {
                view4.setTranslationX(-a);
                view4.setTranslationY(-b);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m1217a(view2, aVar, iVar3, iVar4, -a, -b, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-a});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-b});
        }
        iVar3.mo678a((Animator) objectAnimator2);
        iVar4.mo678a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: a */
    private void m1218a(View view, View view2, boolean z, boolean z2, C0312a aVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        C0242i iVar;
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C0312a aVar2 = aVar;
        if (view4 instanceof C0263d) {
            final C0263d dVar = (C0263d) view4;
            float c = m1224c(view3, view4, aVar2.f1257b);
            float d = m1227d(view3, view4, aVar2.f1257b);
            ((FloatingActionButton) view3).mo1467a(this.f1241c);
            float width = ((float) this.f1241c.width()) / 2.0f;
            C0242i a = aVar2.f1256a.mo673a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C0268d(c, d, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f1055c;
                }
                Animator a2 = C0258a.m1030a(dVar, c, d, C0402j.m1810a(c, d, 0.0f, 0.0f, f, f2));
                a2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C0268d revealInfo = dVar.getRevealInfo();
                        revealInfo.f1055c = Float.MAX_VALUE;
                        dVar.setRevealInfo(revealInfo);
                    }
                });
                m1214a(view2, a.f886a, (int) c, (int) d, width, list);
                animator = a2;
                iVar = a;
            } else {
                float f3 = dVar.getRevealInfo().f1055c;
                animator = C0258a.m1030a(dVar, c, d, width);
                int i = (int) c;
                int i2 = (int) d;
                int i3 = i2;
                int i4 = i;
                m1214a(view2, a.f886a, i, i2, f3, list);
                long j = a.f886a;
                long j2 = a.f887b;
                long a3 = aVar2.f1256a.mo672a();
                int i5 = i3;
                iVar = a;
                m1215a(view2, j, j2, a3, i4, i5, width, list);
            }
            iVar.mo678a(animator);
            list.add(animator);
            list2.add(C0258a.m1029a(dVar));
        }
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: b */
    private static ViewGroup m1222b(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo1212a(C0355d dVar) {
        if (dVar.f1414h == 0) {
            dVar.f1414h = 80;
        }
    }

    /* renamed from: c */
    private static int m1225c(View view) {
        ColorStateList z = C0991u.m4247z(view);
        if (z != null) {
            return z.getColorForState(view.getDrawableState(), z.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private ViewGroup m1213a(View view) {
        View findViewById = view.findViewById(R.id.c0h);
        if (findViewById != null) {
            return m1222b(findViewById);
        }
        if ((view instanceof C0314a) || (view instanceof TransformationChildCard)) {
            return m1222b(((ViewGroup) view).getChildAt(0));
        }
        return m1222b(view);
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m1216a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f1244f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: c */
    private float m1224c(View view, View view2, C0243j jVar) {
        RectF rectF = this.f1242d;
        RectF rectF2 = this.f1243e;
        m1216a(view, rectF);
        m1216a(view2, rectF2);
        rectF2.offset(-m1212a(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: d */
    private float m1227d(View view, View view2, C0243j jVar) {
        RectF rectF = this.f1242d;
        RectF rectF2 = this.f1243e;
        m1216a(view, rectF);
        m1216a(view2, rectF2);
        rectF2.offset(0.0f, -m1221b(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private float m1221b(View view, View view2, C0243j jVar) {
        float f;
        RectF rectF = this.f1242d;
        RectF rectF2 = this.f1243e;
        m1216a(view, rectF);
        m1216a(view2, rectF2);
        int i = jVar.f891a & 112;
        if (i == 16) {
            f = rectF2.centerY() - rectF.centerY();
        } else if (i == 48) {
            f = rectF2.top - rectF.top;
        } else if (i != 80) {
            f = 0.0f;
        } else {
            f = rectF2.bottom - rectF.bottom;
        }
        return f + jVar.f893c;
    }

    /* renamed from: a */
    private float m1212a(View view, View view2, C0243j jVar) {
        float f;
        RectF rectF = this.f1242d;
        RectF rectF2 = this.f1243e;
        m1216a(view, rectF);
        m1216a(view2, rectF2);
        int i = jVar.f891a & 7;
        if (i == 1) {
            f = rectF2.centerX() - rectF.centerX();
        } else if (i == 3) {
            f = rectF2.left - rectF.left;
        } else if (i != 5) {
            f = 0.0f;
        } else {
            f = rectF2.right - rectF.right;
        }
        return f + jVar.f892b;
    }

    /* renamed from: a */
    private static float m1211a(C0312a aVar, C0242i iVar, float f, float f2) {
        long j = iVar.f886a;
        long j2 = iVar.f887b;
        C0242i a = aVar.f1256a.mo673a("expansion");
        return C0234a.m830a(f, f2, iVar.mo677a().getInterpolation(((float) (((a.f886a + a.f887b) + 17) - j)) / ((float) j2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AnimatorSet mo1209b(View view, View view2, boolean z, boolean z2) {
        final boolean z3 = z;
        C0312a a = mo1211a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m1219a(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f1242d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        C0312a aVar = a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m1220a(view3, view4, z4, z5, aVar, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m1223b(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        m1218a(view3, view4, z4, z5, aVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m1226c(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        m1228d(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C0235b.m832a(animatorSet, arrayList);
        final View view5 = view;
        final View view6 = view2;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (!z3) {
                    view6.setVisibility(4);
                    view5.setAlpha(1.0f);
                    view5.setVisibility(0);
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (z3) {
                    view6.setVisibility(0);
                    view5.setAlpha(0.0f);
                    view5.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: a */
    private static void m1214a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b */
    private void m1223b(View view, final View view2, boolean z, boolean z2, C0312a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C0263d) && (view instanceof ImageView)) {
            final C0263d dVar = (C0263d) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(NormalGiftView.ALPHA_255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0238e.f879a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0238e.f879a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                aVar.f1256a.mo673a("iconFade").mo678a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable(null);
                    }

                    public final void onAnimationStart(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable(drawable);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m1226c(View view, View view2, boolean z, boolean z2, C0312a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C0263d) {
            C0263d dVar = (C0263d) view2;
            int c = m1225c(view);
            int i = 16777215 & c;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(c);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C0267c.f1052a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C0267c.f1052a, new int[]{c});
            }
            objectAnimator.setEvaluator(C0236c.m833a());
            aVar.f1256a.mo673a("color").mo678a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: d */
    private void m1228d(View view, View view2, boolean z, boolean z2, C0312a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof C0263d) || C0261c.f1037a != 0) {
                ViewGroup a = m1213a(view2);
                if (a != null) {
                    if (z) {
                        if (!z2) {
                            C0237d.f878a.set(a, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a, C0237d.f878a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a, C0237d.f878a, new float[]{0.0f});
                    }
                    aVar.f1256a.mo673a("contentFade").mo678a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1215a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: a */
    private void m1217a(View view, C0312a aVar, C0242i iVar, C0242i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m1211a(aVar, iVar, f, 0.0f);
        float a2 = m1211a(aVar, iVar2, f2, 0.0f);
        Rect rect = this.f1241c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f1242d;
        rectF2.set(rect);
        RectF rectF3 = this.f1243e;
        m1216a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }
}
