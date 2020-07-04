package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.support.p022v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.a */
final class C35154a {

    /* renamed from: a */
    private C35169i f91930a;

    /* renamed from: b */
    private float f91931b;

    /* renamed from: c */
    private int f91932c;

    /* renamed from: a */
    private void m113393a() {
        ViewPager viewPager = this.f91930a.getViewPager();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f91930a, "backgroundColor", new int[]{this.f91930a.mo89500a(this.f91930a.f92028d), this.f91930a.mo89500a(255.0f)});
        ofInt.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewPager, "translationY", new float[]{viewPager.getTranslationY(), 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofInt, ofFloat});
        animatorSet.start();
    }

    C35154a(C35169i iVar) {
        this.f91930a = iVar;
        this.f91932c = ViewConfiguration.get(iVar.getContext()).getScaledEdgeSlop();
    }

    /* renamed from: a */
    private void m113394a(float f) {
        m113395b(f);
        ViewPager viewPager = this.f91930a.getViewPager();
        if (viewPager.getTranslationY() >= 0.0f) {
            this.f91930a.setBackgroundColor(this.f91930a.mo89500a(this.f91930a.f92028d));
            viewPager.setTranslationY(f);
            return;
        }
        this.f91930a.setBackgroundColor(this.f91930a.getTransConfig().f91974e);
        viewPager.setTranslationY(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo89454b(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        float f = y - this.f91931b;
        switch (motionEvent.getAction()) {
            case 0:
                this.f91931b = y;
                return;
            case 1:
                if (f > C9738o.m28708b(this.f91930a.getContext(), 160.0f)) {
                    this.f91930a.mo89508d();
                } else {
                    m113393a();
                }
                this.f91931b = 0.0f;
                break;
            case 2:
                m113394a(f);
                return;
        }
    }

    /* renamed from: b */
    private void m113395b(float f) {
        float abs = Math.abs(f);
        if (abs < 350.0f) {
            this.f91930a.f92028d = 255.0f - ((abs / 350.0f) * 25.0f);
        } else {
            this.f91930a.f92028d = 230.0f - ((((abs - 350.0f) * 1.35f) / ((float) this.f91930a.getHeight())) * 255.0f);
        }
        C35169i iVar = this.f91930a;
        float f2 = 0.0f;
        if (this.f91930a.f92028d >= 0.0f) {
            f2 = this.f91930a.f92028d;
        }
        iVar.f92028d = f2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo89453a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f91931b = motionEvent.getRawY();
                    break;
                case 1:
                    this.f91931b = 0.0f;
                    break;
                case 2:
                    float rawY = motionEvent.getRawY() - this.f91931b;
                    TransferImage currentImage = this.f91930a.getCurrentImage();
                    if (rawY > ((float) this.f91932c) && currentImage != null && !currentImage.mo89547e()) {
                        return true;
                    }
            }
        }
        return false;
    }
}
