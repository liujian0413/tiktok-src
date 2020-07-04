package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29290c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39368b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.l */
public final class C39677l extends C39516d {

    /* renamed from: a */
    public DefaultGesturePresenter f103167a;

    /* renamed from: b */
    public C39680a f103168b;

    /* renamed from: c */
    public C29296g f103169c;

    /* renamed from: d */
    public C29296g f103170d;

    /* renamed from: e */
    public C39681b f103171e;

    /* renamed from: f */
    public boolean f103172f;

    /* renamed from: g */
    private ViewGroup f103173g;

    /* renamed from: h */
    private Context f103174h;

    /* renamed from: i */
    private VideoRecordGestureLayout f103175i;

    /* renamed from: j */
    private C0043i f103176j;

    /* renamed from: k */
    private C29290c f103177k;

    /* renamed from: l */
    private AnimatorListener f103178l = new AnimatorListenerAdapter() {
        public final void onAnimationStart(Animator animator) {
            C39677l.this.f103167a.f103759c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (C39677l.this.f103170d != null) {
                C39677l.this.f103169c = C39677l.this.f103170d;
                C39677l.this.f103167a.f103758b = 0.0f;
                if (C39677l.this.f103168b != null) {
                    C39677l.this.f103168b.mo88184a(C39677l.this.f103169c);
                }
                C39677l.this.f103171e.mo98965a(C39677l.this.f103169c);
            }
            C39677l.this.f103167a.f103759c = false;
        }
    };

    /* renamed from: m */
    private AnimatorUpdateListener f103179m = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C39677l.this.mo98960d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.l$a */
    public interface C39680a {
        /* renamed from: a */
        void mo88184a(C29296g gVar);

        /* renamed from: a */
        void mo88185a(C29296g gVar, C29296g gVar2, float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.l$b */
    public static class C39681b {

        /* renamed from: a */
        private final Context f103182a;

        /* renamed from: b */
        private final ViewGroup f103183b;

        /* renamed from: c */
        private CompositeStoryFilterIndicator f103184c;

        /* renamed from: d */
        private C29296g f103185d;

        /* renamed from: a */
        public final void mo98965a(C29296g gVar) {
            if (this.f103184c != null && this.f103185d.f77270e != gVar.f77270e) {
                m127006b(gVar);
                this.f103185d = gVar;
            }
        }

        /* renamed from: b */
        private void m127006b(C29296g gVar) {
            boolean z;
            String c = C35563c.m114837d().mo74828c(this.f103185d);
            String c2 = C35563c.m114837d().mo74828c(gVar);
            CompositeStoryFilterIndicator compositeStoryFilterIndicator = this.f103184c;
            C39368b bVar = new C39368b(this.f103185d.f77267b, c);
            C39368b bVar2 = new C39368b(gVar.f77267b, c2);
            if (this.f103185d.f77270e < gVar.f77270e) {
                z = true;
            } else {
                z = false;
            }
            compositeStoryFilterIndicator.mo103466a(bVar, bVar2, z);
        }

        /* renamed from: a */
        public final void mo98964a(int i) {
            this.f103184c = new CompositeStoryFilterIndicator(this.f103182a);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f103184c.setLayoutParams(layoutParams);
            this.f103184c.setVisibility(8);
            this.f103183b.addView(this.f103184c, i);
        }

        public C39681b(Context context, ViewGroup viewGroup, C29296g gVar) {
            this.f103182a = context;
            this.f103183b = viewGroup;
            if (gVar == null) {
                gVar = C35563c.f93224F.mo70097l().mo74949b().mo74962a(0);
            }
            this.f103185d = gVar;
        }
    }

    /* renamed from: e */
    private static int m126995e(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return f < 0.0f ? -1 : 1;
    }

    /* renamed from: a */
    public final boolean mo96469a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo96472b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    /* renamed from: a */
    public final void mo98958a(C29296g gVar) {
        this.f103169c = gVar;
        this.f103171e.mo98965a(gVar);
    }

    /* renamed from: a */
    public final void mo96466a(float f) {
        if (this.f103172f) {
            mo98960d(f);
        }
    }

    /* renamed from: a */
    public final void mo98957a(int i) {
        m126994b(1);
        this.f103167a = new DefaultGesturePresenter(this.f103176j, this, this.f103175i);
    }

    /* renamed from: b */
    private void m126994b(int i) {
        this.f103175i = new VideoRecordGestureLayout(this.f103174h);
        this.f103175i.setLayoutParams(new LayoutParams(-1, -1));
        this.f103173g.addView(this.f103175i, i);
        this.f103171e.mo98964a(i + 1);
    }

    /* renamed from: d */
    public final void mo98960d(float f) {
        int i;
        float f2;
        int e = m126995e(f);
        int i2 = this.f103169c.f77270e;
        if (e == 0) {
            i = i2;
        } else if (e == -1) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i2;
            i2 = i3;
            i = i4;
        } else {
            i = i2 + 1;
            if (i >= this.f103177k.mo74966b().size()) {
                i = this.f103177k.mo74966b().size() - 1;
            }
        }
        C29296g a = this.f103177k.mo74962a(i2);
        C29296g a2 = this.f103177k.mo74962a(i);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        if (this.f103168b != null) {
            this.f103168b.mo88185a(a, a2, f2);
        }
    }

    /* renamed from: a */
    public final void mo98959a(C29296g gVar, boolean z) {
        this.f103169c = gVar;
    }

    /* renamed from: a */
    public final void mo96467a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f103172f) {
            int width = this.f103173g.getWidth();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f103170d = this.f103169c;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f103170d = this.f103177k.mo74962a(Math.max(0, this.f103169c.f77270e - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f103170d = this.f103177k.mo74962a(Math.min(this.f103177k.mo74966b().size() - 1, this.f103169c.f77270e + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f103179m);
            valueAnimator.addListener(this.f103178l);
            valueAnimator.start();
        }
    }

    public C39677l(ViewGroup viewGroup, Context context, C0043i iVar, C29296g gVar) {
        this.f103173g = viewGroup;
        this.f103174h = context;
        this.f103176j = iVar;
        this.f103169c = gVar;
        this.f103171e = new C39681b(context, viewGroup, gVar);
        this.f103172f = true;
        this.f103177k = C35563c.f93224F.mo70097l().mo74949b();
    }
}
