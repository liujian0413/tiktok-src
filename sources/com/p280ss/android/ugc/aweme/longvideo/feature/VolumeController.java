package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView.C23407b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController */
public final class VolumeController implements C0042h, C23254a {

    /* renamed from: a */
    public final FragmentActivity f85363a;

    /* renamed from: b */
    public final AudioControlView f85364b;

    /* renamed from: c */
    private AnimatorSet f85365c;

    /* renamed from: d */
    private AnimatorSet f85366d;

    /* renamed from: e */
    private AnimatorSet f85367e;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController$a */
    public static final class C32742a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f85369a;

        C32742a(VolumeController volumeController) {
            this.f85369a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f85369a.f85364b.mo60874c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController$b */
    public static final class C32743b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f85370a;

        C32743b(VolumeController volumeController) {
            this.f85370a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f85370a.f85364b.mo60873b();
        }
    }

    /* renamed from: a */
    public final void mo84235a() {
        if (this.f85364b != null) {
            this.f85367e = new AnimatorSet();
            AnimatorSet animatorSet = this.f85367e;
            if (animatorSet != null) {
                animatorSet.play(this.f85364b.getHideVolumeAnim());
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public final void mo84236b() {
        AnimatorSet animatorSet = this.f85367e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AudioControlView audioControlView = this.f85364b;
        if (audioControlView != null) {
            audioControlView.setAlpha(1.0f);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        AnimatorSet animatorSet = this.f85365c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f85366d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f85367e;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    /* renamed from: c */
    private final void m106000c() {
        if (this.f85364b != null) {
            this.f85365c = new AnimatorSet();
            AnimatorSet animatorSet = this.f85365c;
            if (animatorSet != null) {
                animatorSet.play(this.f85364b.getShowVolumeAnim());
                animatorSet.addListener(new C32743b(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: d */
    private final void m106001d() {
        if (this.f85364b != null) {
            this.f85366d = new AnimatorSet();
            AnimatorSet animatorSet = this.f85366d;
            if (animatorSet != null) {
                animatorSet.play(this.f85364b.getShowVolumeAnim());
                animatorSet.addListener(new C32742a(this));
                animatorSet.start();
            }
        }
    }

    public VolumeController(FragmentActivity fragmentActivity, AudioControlView audioControlView) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f85363a = fragmentActivity;
        this.f85364b = audioControlView;
        this.f85363a.getLifecycle().mo55a(this);
        AudioControlView audioControlView2 = this.f85364b;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new C23407b(this) {

                /* renamed from: a */
                final /* synthetic */ VolumeController f85368a;

                /* renamed from: a */
                public final void mo60892a() {
                    this.f85368a.mo84235a();
                }

                /* renamed from: b */
                public final void mo60893b() {
                    this.f85368a.mo84236b();
                }

                {
                    this.f85368a = r1;
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo60522a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                m106001d();
                return true;
            case 25:
                m106000c();
                return true;
            default:
                return false;
        }
    }
}
