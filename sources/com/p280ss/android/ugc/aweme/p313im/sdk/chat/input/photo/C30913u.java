package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.utils.C43005cc;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.u */
public final class C30913u {

    /* renamed from: a */
    public static int f80961a = 9;

    /* renamed from: d */
    private static int f80962d = 2000;

    /* renamed from: g */
    private static C30913u f80963g = new C30913u();

    /* renamed from: b */
    public boolean f80964b;

    /* renamed from: c */
    public List<C30897h> f80965c = new ArrayList();

    /* renamed from: e */
    private LinkedHashMap<String, C30897h> f80966e = new LinkedHashMap<>();

    /* renamed from: f */
    private long f80967f = 0;

    /* renamed from: a */
    public static C30913u m100638a() {
        return f80963g;
    }

    /* renamed from: c */
    public final int mo80836c() {
        return this.f80966e.size();
    }

    /* renamed from: b */
    public final List<C30897h> mo80834b() {
        return new ArrayList(this.f80966e.values());
    }

    /* renamed from: e */
    public final void mo80838e() {
        this.f80966e.clear();
        this.f80964b = false;
    }

    /* renamed from: f */
    public final void mo80839f() {
        this.f80966e.clear();
        this.f80965c.clear();
        this.f80964b = false;
    }

    /* renamed from: d */
    public final String mo80837d() {
        if (this.f80966e.size() <= 0) {
            return C6399b.m19921a().getString(R.string.bp9);
        }
        return C6399b.m19921a().getString(R.string.bpa, new Object[]{Integer.valueOf(this.f80966e.size())});
    }

    /* renamed from: a */
    public final boolean mo80832a(String str) {
        return this.f80966e.containsKey(str);
    }

    /* renamed from: a */
    public final void mo80831a(C30897h hVar) {
        if (hVar != null) {
            this.f80966e.put(hVar.f80944a.f52149b, hVar);
        }
    }

    /* renamed from: b */
    public final void mo80835b(C30897h hVar) {
        if (hVar != null) {
            this.f80966e.remove(hVar.f80944a.f52149b);
        }
    }

    /* renamed from: c */
    private int m100639c(String str) {
        int i = 1;
        for (String equals : this.f80966e.keySet()) {
            if (str.equals(equals)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final C30897h mo80833b(String str) {
        if (!C23477d.m77081a((Collection<T>) this.f80965c)) {
            for (C30897h hVar : this.f80965c) {
                if (hVar.f80944a.f52149b.equals(str)) {
                    return hVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo80830a(TextView textView, ImageView imageView, View view, String str) {
        if (textView != null && imageView != null && !TextUtils.isEmpty(str)) {
            if (mo80832a(str)) {
                imageView.setSelected(true);
                textView.setText(String.valueOf(m100639c(str)));
                imageView.setImageResource(R.drawable.av9);
                if (view != null) {
                    view.setBackgroundResource(R.color.uy);
                    view.setVisibility(0);
                }
            } else {
                imageView.setSelected(false);
                textView.setText("");
                imageView.setImageResource(R.drawable.b5r);
                if (view != null) {
                    if (mo80836c() >= f80961a) {
                        view.setBackgroundResource(R.color.a6h);
                        view.setVisibility(0);
                        return;
                    }
                    view.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80829a(View view, View view2, TextView textView, ImageView imageView, View view3, String str) {
        final View view4 = view2;
        view2.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 0.3f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 0.3f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(50);
        final TextView textView2 = textView;
        final ImageView imageView2 = imageView;
        final View view5 = view3;
        final String str2 = str;
        final View view6 = view;
        C309141 r0 = new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                C30913u.this.mo80830a(textView2, imageView2, view5, str2);
            }

            public final void onAnimationEnd(Animator animator) {
                Animator animator2;
                Animator animator3;
                C30913u.this.mo80830a(textView2, imageView2, view5, str2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, "scaleX", new float[]{0.3f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{0.3f, 1.0f});
                ObjectAnimator objectAnimator = null;
                if (view6 == null || view5 == null) {
                    animator3 = null;
                    animator2 = null;
                } else {
                    view6.clearAnimation();
                    view5.clearAnimation();
                    if (C30913u.this.mo80832a(str2)) {
                        objectAnimator = ObjectAnimator.ofFloat(view6, "scaleX", new float[]{1.0f, 1.1f});
                        animator3 = ObjectAnimator.ofFloat(view6, "scaleY", new float[]{1.0f, 1.1f});
                        animator2 = ObjectAnimator.ofFloat(view5, "alpha", new float[]{0.0f, 1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(view6, "scaleX", new float[]{1.1f, 1.0f});
                        animator3 = ObjectAnimator.ofFloat(view6, "scaleY", new float[]{1.1f, 1.0f});
                        animator2 = ObjectAnimator.ofFloat(view5, "alpha", new float[]{1.0f, 0.0f});
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (objectAnimator == null || animator3 == null || animator2 == null) {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                } else {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, objectAnimator, animator3, animator2});
                }
                animatorSet.setInterpolator(C43005cc.m136505a(2, 0.32f, 0.94f, 0.6f, 1.0f));
                animatorSet.setDuration(300);
                animatorSet.start();
            }
        };
        animatorSet.addListener(r0);
        animatorSet.start();
    }
}
