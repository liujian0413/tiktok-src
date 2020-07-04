package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.C0042h;
import android.view.KeyEvent;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView.C23407b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController */
public final class VolumeController implements C0042h, C23254a {

    /* renamed from: a */
    public final AudioControlView f85534a;

    /* renamed from: b */
    private AnimatorSet f85535b;

    /* renamed from: c */
    private AnimatorSet f85536c;

    /* renamed from: d */
    private AnimatorSet f85537d;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController$a */
    public static final class C32791a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f85539a;

        C32791a(VolumeController volumeController) {
            this.f85539a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f85539a.f85534a.mo60874c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController$b */
    public static final class C32792b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f85540a;

        C32792b(VolumeController volumeController) {
            this.f85540a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f85540a.f85534a.mo60873b();
        }
    }

    /* renamed from: a */
    public final void mo84317a() {
        if (this.f85534a != null) {
            this.f85537d = new AnimatorSet();
            AnimatorSet animatorSet = this.f85537d;
            if (animatorSet != null) {
                animatorSet.play(this.f85534a.getHideVolumeAnim());
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public final void mo84318b() {
        AnimatorSet animatorSet = this.f85537d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AudioControlView audioControlView = this.f85534a;
        if (audioControlView != null) {
            audioControlView.setAlpha(1.0f);
        }
    }

    /* renamed from: c */
    public final void mo84319c() {
        AnimatorSet animatorSet = this.f85535b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f85536c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f85537d;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    /* renamed from: d */
    private final void m106142d() {
        if (this.f85534a != null) {
            this.f85535b = new AnimatorSet();
            AnimatorSet animatorSet = this.f85535b;
            if (animatorSet != null) {
                animatorSet.play(this.f85534a.getShowVolumeAnim());
                animatorSet.addListener(new C32792b(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: e */
    private final void m106143e() {
        if (this.f85534a != null) {
            this.f85536c = new AnimatorSet();
            AnimatorSet animatorSet = this.f85536c;
            if (animatorSet != null) {
                animatorSet.play(this.f85534a.getShowVolumeAnim());
                animatorSet.addListener(new C32791a(this));
                animatorSet.start();
            }
        }
    }

    public VolumeController(AudioControlView audioControlView) {
        this.f85534a = audioControlView;
        AudioControlView audioControlView2 = this.f85534a;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new C23407b(this) {

                /* renamed from: a */
                final /* synthetic */ VolumeController f85538a;

                /* renamed from: a */
                public final void mo60892a() {
                    this.f85538a.mo84317a();
                }

                /* renamed from: b */
                public final void mo60893b() {
                    this.f85538a.mo84318b();
                }

                {
                    this.f85538a = r1;
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo60522a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                m106143e();
                return true;
            case 25:
                m106142d();
                return true;
            default:
                return false;
        }
    }
}
