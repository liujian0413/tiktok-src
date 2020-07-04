package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29290c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39516d;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a */
public final class C42059a extends C39516d {

    /* renamed from: a */
    public StickerGesturePresenter f109266a;

    /* renamed from: b */
    public C29296g f109267b;

    /* renamed from: c */
    public C29296g f109268c;

    /* renamed from: d */
    public boolean f109269d;

    /* renamed from: e */
    private ViewGroup f109270e;

    /* renamed from: f */
    private AnimatorListener f109271f;

    /* renamed from: g */
    private AnimatorUpdateListener f109272g;

    /* renamed from: e */
    private static int m133750e(float f) {
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
    public final void mo103297a(C39944a aVar) {
        this.f109266a.mo103296a(aVar);
    }

    /* renamed from: a */
    public final void mo96466a(float f) {
        if (this.f109269d) {
            m133749d(f);
        }
    }

    /* renamed from: d */
    private void m133749d(float f) {
        int i;
        int e = m133750e(f);
        int i2 = this.f109267b.f77270e;
        C29290c b = C35563c.f93224F.mo70097l().mo74949b();
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
            if (i >= b.mo74966b().size()) {
                i = b.mo74966b().size() - 1;
            }
        }
        b.mo74962a(i2);
        b.mo74962a(i);
        if (f < 0.0f) {
            Math.abs(f);
        }
    }

    /* renamed from: a */
    public final void mo96467a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f109269d) {
            int width = this.f109270e.getWidth();
            C29290c b = C35563c.f93224F.mo70097l().mo74949b();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f109268c = this.f109267b;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f109268c = b.mo74962a(Math.max(0, this.f109267b.f77270e - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f109268c = b.mo74962a(Math.min(b.mo74966b().size() - 1, this.f109267b.f77270e + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f109272g);
            valueAnimator.addListener(this.f109271f);
            valueAnimator.start();
        }
    }
}
