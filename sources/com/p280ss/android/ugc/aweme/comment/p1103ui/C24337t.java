package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1696v.C43178b;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.t */
public final class C24337t implements C24341w {

    /* renamed from: a */
    public MentionTextView f64251a;

    /* renamed from: b */
    public Context f64252b;

    /* renamed from: a */
    public final C0043i mo63236a() {
        return (C0043i) C23487o.m77130a(this.f64252b);
    }

    /* renamed from: a */
    public final void mo63237a(String str, List<TextExtraStruct> list) {
        m80041b(str, list);
    }

    public C24337t(Context context, MentionTextView mentionTextView) {
        this.f64252b = context;
        this.f64251a = mentionTextView;
    }

    /* renamed from: b */
    private void m80041b(final String str, final List<TextExtraStruct> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f64251a, "alpha", new float[]{0.0f}).setDuration(100);
        duration.setInterpolator(new C43178b());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f64251a, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        duration2.setInterpolator(new C43178b());
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C24337t.this.f64251a.setText(str);
                C27608b.m90502a((TextView) C24337t.this.f64251a);
                C24337t.this.f64251a.mo105184a(list, (C43346d) new C41656f(C24220a.m79551a().isChallengeToHashTag()));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }
}
