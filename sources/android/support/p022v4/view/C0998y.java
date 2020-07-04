package android.support.p022v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.y */
public final class C0998y {

    /* renamed from: a */
    Runnable f3441a;

    /* renamed from: b */
    Runnable f3442b;

    /* renamed from: c */
    int f3443c = -1;

    /* renamed from: d */
    private WeakReference<View> f3444d;

    /* renamed from: android.support.v4.view.y$a */
    static class C1001a implements C1002z {

        /* renamed from: a */
        C0998y f3451a;

        /* renamed from: b */
        boolean f3452b;

        C1001a(C0998y yVar) {
            this.f3451a = yVar;
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            C1002z zVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof C1002z) {
                zVar = (C1002z) tag;
            } else {
                zVar = null;
            }
            if (zVar != null) {
                zVar.mo3628c(view);
            }
        }

        /* renamed from: a */
        public final void mo3626a(View view) {
            this.f3452b = false;
            C1002z zVar = null;
            if (this.f3451a.f3443c >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f3451a.f3441a != null) {
                Runnable runnable = this.f3451a.f3441a;
                this.f3451a.f3441a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C1002z) {
                zVar = (C1002z) tag;
            }
            if (zVar != null) {
                zVar.mo3626a(view);
            }
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            C1002z zVar = null;
            if (this.f3451a.f3443c >= 0) {
                view.setLayerType(this.f3451a.f3443c, null);
                this.f3451a.f3443c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f3452b) {
                if (this.f3451a.f3442b != null) {
                    Runnable runnable = this.f3451a.f3442b;
                    this.f3451a.f3442b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C1002z) {
                    zVar = (C1002z) tag;
                }
                if (zVar != null) {
                    zVar.mo3627b(view);
                }
                this.f3452b = true;
            }
        }
    }

    /* renamed from: a */
    public final long mo3796a() {
        View view = (View) this.f3444d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo3806c() {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: b */
    public final void mo3804b() {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    C0998y(View view) {
        this.f3444d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final C0998y mo3802b(float f) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    /* renamed from: c */
    public final C0998y mo3805c(float f) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0998y mo3803b(long j) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0998y mo3797a(float f) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0998y mo3798a(long j) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0998y mo3799a(final C0953aa aaVar) {
        final View view = (View) this.f3444d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C10002 r1 = null;
            if (aaVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aaVar.mo3716a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public final C0998y mo3800a(C1002z zVar) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m4273a(view, zVar);
            } else {
                view.setTag(2113929216, zVar);
                m4273a(view, new C1001a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C0998y mo3801a(Interpolator interpolator) {
        View view = (View) this.f3444d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    private void m4273a(final View view, final C1002z zVar) {
        if (zVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    zVar.mo3628c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    zVar.mo3627b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    zVar.mo3626a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
