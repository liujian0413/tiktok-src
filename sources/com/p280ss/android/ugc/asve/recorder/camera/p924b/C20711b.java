package com.p280ss.android.ugc.asve.recorder.camera.p924b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ttve.utils.C20503a;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.p756d.C15452f;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b */
public final class C20711b {

    /* renamed from: a */
    public boolean f55942a;

    /* renamed from: b */
    public final ASCameraView f55943b;

    /* renamed from: c */
    private final Context f55944c;

    /* renamed from: d */
    private final C15422c f55945d;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$a */
    public static final class C20712a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C20711b f55946a;

        /* renamed from: b */
        final /* synthetic */ ImageView f55947b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f55946a.f55943b.removeView(this.f55947b);
            this.f55946a.f55942a = false;
        }

        C20712a(C20711b bVar, ImageView imageView) {
            this.f55946a = bVar;
            this.f55947b = imageView;
        }
    }

    /* renamed from: a */
    public final void mo56006a(int i, int i2) {
        if (!this.f55942a) {
            this.f55942a = true;
            ImageView imageView = new ImageView(this.f55944c);
            imageView.setImageResource(this.f55945d.mo38916g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
            int b = (int) C9738o.m28708b(this.f55944c, 65.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.leftMargin = (int) (((float) i) - (C9738o.m28708b(this.f55944c, 60.0f) / 2.0f));
            if (C15452f.m45254a(this.f55944c)) {
                layoutParams.rightMargin = (C9738o.m28691a(this.f55944c) - layoutParams.leftMargin) - b;
            }
            layoutParams.topMargin = i2 - (((int) C9738o.m28708b(this.f55944c, 60.0f)) / 2);
            if (layoutParams.leftMargin > C9738o.m28691a(this.f55944c) - b) {
                layoutParams.leftMargin = C9738o.m28691a(this.f55944c) - b;
            }
            if (C15452f.m45254a(this.f55944c) && layoutParams.rightMargin > C9738o.m28691a(this.f55944c) - b) {
                layoutParams.rightMargin = C9738o.m28691a(this.f55944c) - b;
            }
            if (layoutParams.leftMargin < 0) {
                layoutParams.leftMargin = 0;
            }
            if (C15452f.m45254a(this.f55944c) && layoutParams.rightMargin < 0) {
                layoutParams.rightMargin = 0;
            }
            if (layoutParams.topMargin > C9738o.m28709b(this.f55944c) - b) {
                layoutParams.topMargin = C9738o.m28709b(this.f55944c) - b;
            }
            if (layoutParams.topMargin < 0) {
                layoutParams.topMargin = 0;
            }
            imageView.setLayoutParams(layoutParams);
            this.f55943b.addView(imageView);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{1.0f, 1.1f, 0.95f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{1.0f, 1.1f, 0.95f});
            ofFloat.addListener(new C20712a(this, imageView));
            C7573i.m23582a((Object) ofFloat, "animatorX");
            ofFloat.setInterpolator(new C20503a());
            C7573i.m23582a((Object) ofFloat2, "animatorY");
            ofFloat2.setInterpolator(new C20503a());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(1500).start();
        }
    }

    public C20711b(Context context, ASCameraView aSCameraView, C15422c cVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aSCameraView, "rootView");
        C7573i.m23587b(cVar, "cameraContext");
        this.f55944c = context;
        this.f55943b = aSCameraView;
        this.f55945d = cVar;
    }
}
