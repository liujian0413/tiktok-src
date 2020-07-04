package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.p022v4.view.animation.C0957c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5559a.C5565f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eh */
public final class C5691eh extends C5559a<LinkPkTaskWidget> {

    /* renamed from: g */
    public final FrameLayout f16782g = ((FrameLayout) mo14056a().findViewById(R.id.kk));

    /* renamed from: h */
    private final ObjectAnimator f16783h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eh$a */
    public static final class C5692a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5691eh f16784a;

        C5692a(C5691eh ehVar) {
            this.f16784a = ehVar;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                FrameLayout frameLayout = this.f16784a.f16782g;
                C7573i.m23582a((Object) frameLayout, "barContainerView");
                frameLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo14061b() {
        this.f16783h.reverse();
    }

    /* renamed from: e */
    public final void mo14064e() {
        this.f16783h.cancel();
    }

    /* renamed from: d */
    public final void mo14063d() {
        LinkPkTaskWidget linkPkTaskWidget = (LinkPkTaskWidget) this.f16604b;
        if (linkPkTaskWidget != null) {
            linkPkTaskWidget.f16150f = this;
        }
    }

    /* renamed from: c */
    public final void mo14062c() {
        this.f16783h.start();
        FrameLayout frameLayout = this.f16782g;
        C7573i.m23582a((Object) frameLayout, "barContainerView");
        frameLayout.setVisibility(0);
    }

    /* renamed from: a */
    public final View mo14057a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parentView");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ay4, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…older, parentView, false)");
        return inflate;
    }

    /* renamed from: a */
    public final void mo14058a(ValueAnimator valueAnimator) {
        C7573i.m23587b(valueAnimator, "animator");
        int[] iArr = new int[2];
        LayoutParams layoutParams = this.f16605c.getLayoutParams();
        if (layoutParams != null) {
            iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
            int i = -this.f16605c.getHeight();
            FrameLayout frameLayout = this.f16782g;
            C7573i.m23582a((Object) frameLayout, "barContainerView");
            iArr[1] = i + frameLayout.getHeight();
            valueAnimator.setIntValues(iArr);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C5691eh(ViewGroup viewGroup, C5565f fVar) {
        C7573i.m23587b(viewGroup, "parentView");
        C7573i.m23587b(fVar, "stateChangeListener");
        super(viewGroup, R.id.cc1, fVar);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16782g, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f));
        ofFloat.addListener(new C5692a(this));
        this.f16783h = ofFloat;
    }
}
