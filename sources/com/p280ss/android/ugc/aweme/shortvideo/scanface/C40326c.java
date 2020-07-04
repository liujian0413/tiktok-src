package com.p280ss.android.ugc.aweme.shortvideo.scanface;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.scanface.c */
public final class C40326c {

    /* renamed from: a */
    private View f104723a;

    /* renamed from: b */
    private TextView f104724b;

    /* renamed from: c */
    private final float f104725c = 0.54f;

    /* renamed from: d */
    private final int f104726d = 256;

    /* renamed from: e */
    private final int f104727e = 15;

    /* renamed from: f */
    private final FrameLayout f104728f;

    /* renamed from: c */
    private final void m128791c() {
        TextView textView = this.f104724b;
        if (textView == null) {
            C7573i.m23583a("hintTextView");
        }
        textView.setText(R.string.ald);
    }

    /* renamed from: a */
    public final void mo100150a() {
        FrameLayout frameLayout = this.f104728f;
        View view = this.f104723a;
        if (view == null) {
            C7573i.m23583a("mCurView");
        }
        frameLayout.addView(view);
        View view2 = this.f104723a;
        if (view2 == null) {
            C7573i.m23583a("mCurView");
        }
        view2.setVisibility(0);
        m128791c();
    }

    /* renamed from: b */
    public final void mo100152b() {
        View view = this.f104723a;
        if (view == null) {
            C7573i.m23583a("mCurView");
        }
        view.setVisibility(8);
        FrameLayout frameLayout = this.f104728f;
        View view2 = this.f104723a;
        if (view2 == null) {
            C7573i.m23583a("mCurView");
        }
        frameLayout.removeView(view2);
    }

    /* renamed from: d */
    private final void m128792d() {
        int i;
        int i2 = 0;
        View inflate = LayoutInflater.from(this.f104728f.getContext()).inflate(R.layout.a_d, this.f104728f, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…ce, containerView, false)");
        this.f104723a = inflate;
        View view = this.f104723a;
        if (view == null) {
            C7573i.m23583a("mCurView");
        }
        View findViewById = view.findViewById(R.id.cyj);
        C7573i.m23582a((Object) findViewById, "mCurView.findViewById(R.id.scan_face_hint)");
        this.f104724b = (TextView) findViewById;
        View view2 = this.f104723a;
        if (view2 == null) {
            C7573i.m23583a("mCurView");
        }
        int b = (C39805en.m127447b(view2.getContext()) * 16) / 9;
        StringBuilder sb = new StringBuilder("video Height: ");
        sb.append(C39804em.f103458b);
        sb.append("video width: ");
        View view3 = this.f104723a;
        if (view3 == null) {
            C7573i.m23583a("mCurView");
        }
        sb.append(C39805en.m127447b(view3.getContext()));
        sb.append("expireSurfaceHeight: ");
        sb.append(b);
        sb.append("  screenHeight: ");
        View view4 = this.f104723a;
        if (view4 == null) {
            C7573i.m23583a("mCurView");
        }
        sb.append(C39805en.m127452e(view4.getContext()));
        sb.append("textHeight: ");
        TextView textView = this.f104724b;
        if (textView == null) {
            C7573i.m23583a("hintTextView");
        }
        sb.append(textView.getHeight());
        StringBuilder sb2 = new StringBuilder("hasStatusBar: ");
        sb2.append(C39804em.m127436a());
        sb2.append("  statusBarHeight: ");
        View view5 = this.f104723a;
        if (view5 == null) {
            C7573i.m23583a("mCurView");
        }
        sb2.append(C39805en.m127450c(view5.getContext()));
        View view6 = this.f104723a;
        if (view6 == null) {
            C7573i.m23583a("mCurView");
        }
        int e = C39805en.m127452e(view6.getContext());
        if (C39804em.f103458b == 0) {
            i = e;
        } else {
            i = C39804em.f103458b;
        }
        float f = ((float) i) * this.f104725c;
        if (C39804em.m127436a()) {
            View view7 = this.f104723a;
            if (view7 == null) {
                C7573i.m23583a("mCurView");
            }
            i2 = C39805en.m127450c(view7.getContext());
        }
        int i3 = (int) (f + ((float) i2));
        int a = C23486n.m77122a((double) this.f104726d);
        int a2 = C23486n.m77122a((double) this.f104727e);
        TextView textView2 = this.f104724b;
        if (textView2 == null) {
            C7573i.m23583a("hintTextView");
        }
        LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (((e - i3) + a) - a2) / 2;
            TextView textView3 = this.f104724b;
            if (textView3 == null) {
                C7573i.m23583a("hintTextView");
            }
            textView3.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C40326c(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "containerView");
        this.f104728f = frameLayout;
        m128792d();
    }

    /* renamed from: a */
    public final void mo100151a(int i) {
        if (i == 5) {
            TextView textView = this.f104724b;
            if (textView == null) {
                C7573i.m23583a("hintTextView");
            }
            textView.setText(R.string.akk);
        } else if (i == 7) {
            TextView textView2 = this.f104724b;
            if (textView2 == null) {
                C7573i.m23583a("hintTextView");
            }
            textView2.setText(R.string.aj4);
        } else if (i != 16) {
            switch (i) {
                case 2:
                    TextView textView3 = this.f104724b;
                    if (textView3 == null) {
                        C7573i.m23583a("hintTextView");
                    }
                    textView3.setText(R.string.aip);
                    return;
                case 3:
                    TextView textView4 = this.f104724b;
                    if (textView4 == null) {
                        C7573i.m23583a("hintTextView");
                    }
                    textView4.setText(R.string.al4);
                    return;
            }
        } else {
            TextView textView5 = this.f104724b;
            if (textView5 == null) {
                C7573i.m23583a("hintTextView");
            }
            textView5.setText(R.string.aki);
        }
    }
}
