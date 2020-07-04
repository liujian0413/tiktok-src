package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ao */
public final class C28797ao extends PopupWindow {

    /* renamed from: a */
    private final Runnable f75943a = new C28799b(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$a */
    static final class C28798a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28797ao f75944a;

        C28798a(C28797ao aoVar) {
            this.f75944a = aoVar;
        }

        public final void run() {
            if (VERSION.SDK_INT >= 21) {
                View contentView = this.f75944a.getContentView();
                C7573i.m23582a((Object) contentView, "contentView");
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.m8);
                C7573i.m23582a((Object) linearLayout, "contentView.bg_view");
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    View contentView2 = this.f75944a.getContentView();
                    C7573i.m23582a((Object) contentView2, "contentView");
                    LinearLayout linearLayout2 = (LinearLayout) contentView2.findViewById(R.id.m8);
                    C7573i.m23582a((Object) linearLayout2, "contentView.bg_view");
                    ObjectAnimator duration = ObjectAnimator.ofArgb((GradientDrawable) background, "color", new int[]{0, linearLayout2.getResources().getColor(R.color.lq)}).setDuration(300);
                    View contentView3 = this.f75944a.getContentView();
                    C7573i.m23582a((Object) contentView3, "contentView");
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat((ImageView) contentView3.findViewById(R.id.ax9), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    View contentView4 = this.f75944a.getContentView();
                    C7573i.m23582a((Object) contentView4, "contentView");
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat((DmtTextView) contentView4.findViewById(R.id.a7e), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    C7573i.m23582a((Object) duration3, "descAnima");
                    duration3.setStartDelay(150);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
                    animatorSet.start();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$b */
    static final class C28799b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28797ao f75945a;

        C28799b(C28797ao aoVar) {
            this.f75945a = aoVar;
        }

        public final void run() {
            this.f75945a.mo74027a();
        }
    }

    /* renamed from: a */
    public final void mo74027a() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private final void m94801b() {
        getContentView().post(new C28798a(this));
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        getContentView().removeCallbacks(this.f75943a);
    }

    public C28797ao(Context context) {
        C7573i.m23587b(context, "context");
        setContentView(LayoutInflater.from(context).inflate(R.layout.ago, null));
        setWidth((int) C9738o.m28708b(context, 180.0f));
        setHeight(-2);
        setAnimationStyle(R.style.a17);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        m94801b();
        getContentView().removeCallbacks(this.f75943a);
        getContentView().postDelayed(this.f75943a, 3000);
    }
}
