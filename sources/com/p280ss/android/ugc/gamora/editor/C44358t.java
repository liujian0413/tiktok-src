package com.p280ss.android.ugc.gamora.editor;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0043i;
import android.view.ScaleGestureDetector;
import android.view.animation.DecelerateInterpolator;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29290c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39516d;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StickerGesturePresenter;

/* renamed from: com.ss.android.ugc.gamora.editor.t */
public final class C44358t extends C39516d {

    /* renamed from: a */
    public StickerGesturePresenter f114589a;

    /* renamed from: b */
    public C44361a f114590b;

    /* renamed from: c */
    public C29296g f114591c;

    /* renamed from: d */
    public C29296g f114592d;

    /* renamed from: e */
    public boolean f114593e = true;

    /* renamed from: f */
    public EditFilterIndicatorViewModel f114594f;

    /* renamed from: g */
    private VideoRecordGestureLayout f114595g;

    /* renamed from: h */
    private C0043i f114596h;

    /* renamed from: i */
    private EditGestureViewModel f114597i;

    /* renamed from: j */
    private AnimatorListener f114598j = new AnimatorListenerAdapter() {
        public final void onAnimationStart(Animator animator) {
            C44358t.this.f114589a.f109262c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (C44358t.this.f114592d != null) {
                C44358t.this.f114591c = C44358t.this.f114592d;
                C44358t.this.f114589a.f109261b = 0.0f;
                if (C44358t.this.f114590b != null) {
                    C44358t.this.f114590b.mo106799a(C44358t.this.f114591c);
                }
                C44358t.this.f114594f.mo106208a(false, C44358t.this.f114591c);
            }
            C44358t.this.f114589a.f109262c = false;
        }
    };

    /* renamed from: k */
    private AnimatorUpdateListener f114599k = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C44358t.this.mo106795d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    /* renamed from: com.ss.android.ugc.gamora.editor.t$a */
    public interface C44361a {
        /* renamed from: a */
        void mo106799a(C29296g gVar);

        /* renamed from: a */
        void mo106800a(C29296g gVar, C29296g gVar2, float f);
    }

    /* renamed from: e */
    private static int m140333e(float f) {
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
    public final void mo106793a(C39944a aVar) {
        this.f114589a.mo103296a(aVar);
    }

    /* renamed from: a */
    public final void mo96466a(float f) {
        if (this.f114593e) {
            mo106795d(f);
        }
    }

    /* renamed from: d */
    public final void mo106795d(float f) {
        int i;
        float f2;
        int e = m140333e(f);
        int i2 = this.f114591c.f77270e;
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
        C29296g a = b.mo74962a(i2);
        C29296g a2 = b.mo74962a(i);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        if (this.f114590b != null) {
            this.f114590b.mo106800a(a, a2, f2);
        }
    }

    /* renamed from: a */
    public final void mo106794a(boolean z, C29296g gVar) {
        this.f114591c = gVar;
        this.f114594f.mo106208a(false, gVar);
    }

    /* renamed from: a */
    public final void mo96467a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator;
        if (this.f114593e) {
            int width = this.f114595g.getWidth();
            C29290c b = C35563c.f93224F.mo70097l().mo74949b();
            if (Math.signum(f2) == Math.signum(f)) {
                this.f114592d = this.f114591c;
                valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) width) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                if (f >= 1.0E-5f) {
                    this.f114592d = b.mo74962a(Math.max(0, this.f114591c.f77270e - 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    this.f114592d = b.mo74962a(Math.min(b.mo74966b().size() - 1, this.f114591c.f77270e + 1));
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(min);
            valueAnimator.addUpdateListener(this.f114599k);
            valueAnimator.addListener(this.f114598j);
            valueAnimator.start();
        }
    }

    public C44358t(C0043i iVar, VideoRecordGestureLayout videoRecordGestureLayout, EditFilterIndicatorViewModel editFilterIndicatorViewModel, C29296g gVar, EditGestureViewModel editGestureViewModel) {
        this.f114596h = iVar;
        this.f114595g = videoRecordGestureLayout;
        this.f114594f = editFilterIndicatorViewModel;
        this.f114591c = gVar;
        this.f114589a = new StickerGesturePresenter(this.f114596h, this, this.f114595g);
        this.f114594f.mo106208a(true, this.f114591c);
        this.f114597i = editGestureViewModel;
    }
}
