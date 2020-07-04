package com.p280ss.android.ugc.aweme.common.p1147h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.common.h.a */
public final class C25687a {

    /* renamed from: a */
    public static final C25688a f67614a = new C25688a(null);

    /* renamed from: com.ss.android.ugc.aweme.common.h.a$a */
    public static final class C25688a {

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$a */
        static final class C25689a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f67615a;

            C25689a(View view) {
                this.f67615a = view;
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                    java.lang.Object r5 = r5.getAnimatedValue()
                    boolean r0 = r5 instanceof kotlin.Pair
                    if (r0 != 0) goto L_0x000e
                    r5 = 0
                L_0x000e:
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    android.view.View r0 = r4.f67615a
                    r1 = 2
                    r2 = 0
                    if (r5 == 0) goto L_0x0023
                    java.lang.Object r3 = r5.getFirst()
                    java.lang.Float r3 = (java.lang.Float) r3
                    if (r3 == 0) goto L_0x0023
                    float r3 = r3.floatValue()
                    goto L_0x0024
                L_0x0023:
                    r3 = 0
                L_0x0024:
                    if (r5 == 0) goto L_0x0032
                    java.lang.Object r5 = r5.getSecond()
                    java.lang.Float r5 = (java.lang.Float) r5
                    if (r5 == 0) goto L_0x0032
                    float r2 = r5.floatValue()
                L_0x0032:
                    android.view.MotionEvent r5 = com.p280ss.android.ugc.aweme.common.p1147h.C25687a.C25688a.m84434a(r1, r3, r2)
                    r0.dispatchTouchEvent(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.p1147h.C25687a.C25688a.C25689a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$b */
        public static final class C25690b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ View f67616a;

            /* renamed from: b */
            final /* synthetic */ Pair f67617b;

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f67616a.dispatchTouchEvent(C25688a.m84434a(3, ((Number) this.f67617b.getFirst()).floatValue(), ((Number) this.f67617b.getSecond()).floatValue()));
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f67616a.dispatchTouchEvent(C25688a.m84434a(1, ((Number) this.f67617b.getFirst()).floatValue(), ((Number) this.f67617b.getSecond()).floatValue()));
            }

            C25690b(View view, Pair pair) {
                this.f67616a = view;
                this.f67617b = pair;
            }
        }

        private C25688a() {
        }

        public /* synthetic */ C25688a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MotionEvent m84434a(int i, float f, float f2) {
            MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i, f, f2, 0);
            C7573i.m23582a((Object) obtain, "MotionEvent.obtain(Syste…illis(), action, x, y, 0)");
            return obtain;
        }

        /* renamed from: a */
        private final void m84435a(View view, Pair<Float, Float> pair, Pair<Float, Float> pair2) {
            view.dispatchTouchEvent(m84434a(0, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue()));
            view.dispatchTouchEvent(m84434a(2, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue()));
            view.dispatchTouchEvent(m84434a(1, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue()));
        }

        /* renamed from: a */
        public final void mo66573a(View view, Pair<Float, Float> pair, Pair<Float, Float> pair2, long j) {
            C7573i.m23587b(view, "targetView");
            C7573i.m23587b(pair, "fromPosition");
            C7573i.m23587b(pair2, "toPosition");
            if (j <= 0) {
                m84435a(view, pair, pair2);
            } else {
                m84436b(view, pair, pair2, j);
            }
        }

        /* renamed from: b */
        private final void m84436b(View view, Pair<Float, Float> pair, Pair<Float, Float> pair2, long j) {
            ValueAnimator ofObject = ValueAnimator.ofObject(C25691b.f67618a, new Object[]{pair, pair2});
            ofObject.addUpdateListener(new C25689a(view));
            ofObject.addListener(new C25690b(view, pair2));
            view.dispatchTouchEvent(m84434a(0, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue()));
            C7573i.m23582a((Object) ofObject, "animator");
            ofObject.setDuration(j);
            ofObject.start();
        }
    }

    /* renamed from: a */
    public static final void m84433a(View view, Pair<Float, Float> pair, Pair<Float, Float> pair2, long j) {
        f67614a.mo66573a(view, pair, pair2, 0);
    }
}
