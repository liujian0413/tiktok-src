package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.transition.C0508m.C0514c;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: android.support.transition.c */
public final class C0476c extends C0508m {

    /* renamed from: p */
    private static final String[] f1948p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: q */
    private static final Property<Drawable, PointF> f1949q = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {

        /* renamed from: a */
        private Rect f1959a = new Rect();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1959a);
            return new PointF((float) this.f1959a.left, (float) this.f1959a.top);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1959a);
            this.f1959a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1959a);
        }
    };

    /* renamed from: r */
    private static final Property<C0487a, PointF> f1950r = new Property<C0487a, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        /* renamed from: a */
        private static void m2074a(C0487a aVar, PointF pointF) {
            aVar.mo2102a(pointF);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2074a((C0487a) obj, (PointF) obj2);
        }
    };

    /* renamed from: s */
    private static final Property<C0487a, PointF> f1951s = new Property<C0487a, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        /* renamed from: a */
        private static void m2075a(C0487a aVar, PointF pointF) {
            aVar.mo2103b(pointF);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2075a((C0487a) obj, (PointF) obj2);
        }
    };

    /* renamed from: t */
    private static final Property<View, PointF> f1952t = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2076a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        private static void m2076a(View view, PointF pointF) {
            C0460ae.m2008a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: u */
    private static final Property<View, PointF> f1953u = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2077a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        private static void m2077a(View view, PointF pointF) {
            C0460ae.m2008a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: v */
    private static final Property<View, PointF> f1954v = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2078a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        private static void m2078a(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0460ae.m2008a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: y */
    private static C0495i f1955y = new C0495i();

    /* renamed from: a */
    public boolean f1956a;

    /* renamed from: w */
    private int[] f1957w = new int[2];

    /* renamed from: x */
    private boolean f1958x;

    /* renamed from: android.support.transition.c$a */
    static class C0487a {

        /* renamed from: a */
        private int f1978a;

        /* renamed from: b */
        private int f1979b;

        /* renamed from: c */
        private int f1980c;

        /* renamed from: d */
        private int f1981d;

        /* renamed from: e */
        private View f1982e;

        /* renamed from: f */
        private int f1983f;

        /* renamed from: g */
        private int f1984g;

        /* renamed from: a */
        private void m2079a() {
            C0460ae.m2008a(this.f1982e, this.f1978a, this.f1979b, this.f1980c, this.f1981d);
            this.f1983f = 0;
            this.f1984g = 0;
        }

        C0487a(View view) {
            this.f1982e = view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2103b(PointF pointF) {
            this.f1980c = Math.round(pointF.x);
            this.f1981d = Math.round(pointF.y);
            this.f1984g++;
            if (this.f1983f == this.f1984g) {
                m2079a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2102a(PointF pointF) {
            this.f1978a = Math.round(pointF.x);
            this.f1979b = Math.round(pointF.y);
            this.f1983f++;
            if (this.f1983f == this.f1984g) {
                m2079a();
            }
        }
    }

    /* renamed from: a */
    public final String[] mo2073a() {
        return f1948p;
    }

    /* renamed from: a */
    public final void mo1185a(C0524s sVar) {
        m2064d(sVar);
    }

    /* renamed from: b */
    public final void mo1186b(C0524s sVar) {
        m2064d(sVar);
    }

    /* renamed from: d */
    private void m2064d(C0524s sVar) {
        View view = sVar.f2073b;
        if (C0991u.m4167D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f2072a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f2072a.put("android:changeBounds:parent", sVar.f2073b.getParent());
            if (this.f1958x) {
                sVar.f2073b.getLocationInWindow(this.f1957w);
                sVar.f2072a.put("android:changeBounds:windowX", Integer.valueOf(this.f1957w[0]));
                sVar.f2072a.put("android:changeBounds:windowY", Integer.valueOf(this.f1957w[1]));
            }
            if (this.f1956a) {
                sVar.f2072a.put("android:changeBounds:clip", C0991u.m4169F(view));
            }
        }
    }

    /* renamed from: a */
    private boolean m2063a(View view, View view2) {
        if (!this.f1958x) {
            return true;
        }
        C0524s b = mo2132b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == b.f2073b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Animator mo1184a(ViewGroup viewGroup, C0524s sVar, C0524s sVar2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        C0524s sVar3 = sVar;
        C0524s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f2072a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) sVar4.f2072a.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f2073b;
        if (m2063a(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) sVar3.f2072a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) sVar4.f2072a.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i10 = rect4.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect5 = (Rect) sVar3.f2072a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) sVar4.f2072a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect7 = rect6;
                Rect rect8 = rect5;
                if (!this.f1956a) {
                    view = view3;
                    C0460ae.m2008a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = C0491e.m2088a(view, f1954v, this.f2035o.mo2106a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            final C0487a aVar = new C0487a(view);
                            ObjectAnimator a = C0491e.m2088a(aVar, f1950r, this.f2035o.mo2106a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C0491e.m2088a(aVar, f1951s, this.f2035o.mo2106a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                private C0487a mViewBounds = aVar;
                            });
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = C0491e.m2088a(view, f1952t, this.f2035o.mo2106a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = C0491e.m2088a(view, f1953u, this.f2035o.mo2106a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    C0460ae.m2008a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = C0491e.m2088a(view, f1954v, this.f2035o.mo2106a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect8 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect8;
                    }
                    if (rect7 == null) {
                        rect2 = new Rect(i2, i2, i13, i14);
                    } else {
                        rect2 = rect7;
                    }
                    if (!rect.equals(rect2)) {
                        C0991u.m4184a(view, rect);
                        C0495i iVar = f1955y;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect2;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", iVar, objArr);
                        final View view4 = view;
                        final Rect rect9 = rect7;
                        final int i15 = i4;
                        final int i16 = i6;
                        final int i17 = i8;
                        final int i18 = i10;
                        C04869 r0 = new AnimatorListenerAdapter() {

                            /* renamed from: h */
                            private boolean f1977h;

                            public final void onAnimationCancel(Animator animator) {
                                this.f1977h = true;
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (!this.f1977h) {
                                    C0991u.m4184a(view4, rect9);
                                    C0460ae.m2008a(view4, i15, i16, i17, i18);
                                }
                            }
                        };
                        objectAnimator.addListener(r0);
                    } else {
                        objectAnimator = null;
                    }
                    animator = C0523r.m2215a(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C0531y.m2229a(viewGroup4, true);
                    mo2117a((C0514c) new C0515n() {

                        /* renamed from: a */
                        boolean f1960a;

                        /* renamed from: b */
                        public final void mo2043b(C0508m mVar) {
                            C0531y.m2229a(viewGroup4, false);
                        }

                        /* renamed from: c */
                        public final void mo2044c(C0508m mVar) {
                            C0531y.m2229a(viewGroup4, true);
                        }

                        /* renamed from: a */
                        public final void mo2042a(C0508m mVar) {
                            if (!this.f1960a) {
                                C0531y.m2229a(viewGroup4, false);
                            }
                            mVar.mo2130b((C0514c) this);
                        }
                    });
                }
                return animator;
            }
        } else {
            int intValue = ((Integer) sVar3.f2072a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar3.f2072a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar4.f2072a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar4.f2072a.get("android:changeBounds:windowY")).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f1957w);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C0460ae.m2012c(view2);
                C0460ae.m2006a(view2, 0.0f);
                C0460ae.m2004a(viewGroup).mo2048a(bitmapDrawable);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0494h.m2092a(f1949q, this.f2035o.mo2106a((float) (intValue - this.f1957w[0]), (float) (intValue2 - this.f1957w[1]), (float) (intValue3 - this.f1957w[0]), (float) (intValue4 - this.f1957w[1])))});
                final ViewGroup viewGroup5 = viewGroup;
                final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                final View view5 = view2;
                final float f = c;
                C04792 r02 = new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C0460ae.m2004a(viewGroup5).mo2049b(bitmapDrawable2);
                        C0460ae.m2006a(view5, f);
                    }
                };
                ofPropertyValuesHolder.addListener(r02);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
