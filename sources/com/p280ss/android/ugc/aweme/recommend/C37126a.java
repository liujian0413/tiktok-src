package com.p280ss.android.ugc.aweme.recommend;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.FansFollowUserBtn;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.a */
public final class C37126a {

    /* renamed from: a */
    public static final C37126a f97157a = new C37126a();

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$a */
    static final class C37127a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f97158a;

        C37127a(FansFollowUserBtn fansFollowUserBtn) {
            this.f97158a = fansFollowUserBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams buttonLayoutParams = this.f97158a.getButtonLayoutParams();
                buttonLayoutParams.width = intValue;
                this.f97158a.setButtonLayoutParams(buttonLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$b */
    static final class C37128b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f97159a;

        C37128b(FansFollowUserBtn fansFollowUserBtn) {
            this.f97159a = fansFollowUserBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams buttonLayoutParams = this.f97159a.getButtonLayoutParams();
                buttonLayoutParams.width = intValue;
                this.f97159a.setButtonLayoutParams(buttonLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    private C37126a() {
    }

    /* renamed from: a */
    public static void m119349a(Context context, FansFollowUserBtn fansFollowUserBtn, DmtTextView dmtTextView, int i, int i2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fansFollowUserBtn, "followUserBtn");
        C7573i.m23587b(dmtTextView, "dislikeBtn");
        if (dmtTextView.getVisibility() != 8) {
            dmtTextView.setVisibility(8);
            fansFollowUserBtn.mo75747a(i, i2);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) C9738o.m28708b(context, 68.0f), (int) C9738o.m28708b(context, 142.0f)});
            C7573i.m23582a((Object) ofInt, "it");
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(300);
            C7573i.m23582a((Object) ofInt, "ValueAnimator.ofInt(orig…tion = DURATION\n        }");
            ofInt.addUpdateListener(new C37127a(fansFollowUserBtn));
            ofInt.start();
        }
    }

    /* renamed from: b */
    public static void m119350b(Context context, FansFollowUserBtn fansFollowUserBtn, DmtTextView dmtTextView, int i, int i2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fansFollowUserBtn, "followUserBtn");
        C7573i.m23587b(dmtTextView, "dislikeBtn");
        if (dmtTextView.getVisibility() != 0) {
            dmtTextView.setVisibility(0);
            fansFollowUserBtn.mo75747a(i, i2);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) C9738o.m28708b(context, 142.0f), (int) C9738o.m28708b(context, 68.0f)});
            C7573i.m23582a((Object) ofInt, "it");
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(300);
            C7573i.m23582a((Object) ofInt, "ValueAnimator.ofInt(orig…ion = DURATION\n\n        }");
            ofInt.addUpdateListener(new C37128b(fansFollowUserBtn));
            ofInt.start();
        }
    }
}
