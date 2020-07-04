package com.p280ss.android.ugc.aweme.profile.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23752f;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23808t;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42920ah;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;

/* renamed from: com.ss.android.ugc.aweme.profile.util.j */
public final class C36737j {
    /* renamed from: a */
    public static void m118426a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        String charSequence;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().mo59877d();
            boolean z2 = C6399b.m19944t() && (num == null || num.intValue() == 0);
            boolean a = m118427a(str, (View) textView);
            m118425a(textView3, viewGroup2, a);
            String a2 = m118420a(str, a);
            if (!TextUtils.equals(textView.getText(), a2)) {
                if (!TextUtils.isEmpty(textView.getText())) {
                    m118424a(textView3, viewGroup2, textView4, imageView2, z2);
                }
                int b = (int) C9738o.m28708b(textView.getContext(), 240.0f);
                SpannableString spannableString = new SpannableString(a2);
                if (textView4 == null) {
                    charSequence = "";
                } else {
                    charSequence = textView2.getText().toString();
                }
                C23752f fVar = new C23752f(textView.getPaint(), b, true, charSequence, 3);
                SpannableString a3 = fVar.mo61574a(spannableString);
                textView3.setText(a3);
                boolean z3 = fVar.f62659b;
                if (z3) {
                    int i = b;
                    int i2 = 8;
                    DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    int height = dynamicLayout.getHeight();
                    textView4.setVisibility((!z3 || TextUtils.isEmpty(a2)) ? 8 : 0);
                    if (z3 && !TextUtils.isEmpty(a2)) {
                        i2 = 0;
                    }
                    imageView2.setVisibility(i2);
                    C36740k kVar = new C36740k(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, z2, a3);
                    textView3.post(kVar);
                    return;
                }
                imageView2.setVisibility(8);
                textView4.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private static Spannable m118419a() {
        String string = C6399b.m19921a().getString(R.string.dkx);
        String str = (String) SharePrefCache.inst().getUpdateUserTipContent().mo59877d();
        if (TextUtils.isEmpty(str)) {
            str = C6399b.m19921a().getString(R.string.anh);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(string);
        String sb2 = sb.toString();
        int indexOf = sb2.indexOf(string);
        Spannable newSpannable = Factory.getInstance().newSpannable(sb2);
        newSpannable.setSpan(new C22367e(C23481i.m77088a(R.color.a79), C23481i.m77088a(R.color.lp)) {
            public final void onClick(View view) {
                C7195s.m22438a().mo18682a((String) SharePrefCache.inst().getJudgementClauseScheme().mo59877d());
            }
        }, indexOf, string.length() + indexOf, 17);
        return newSpannable;
    }

    /* renamed from: a */
    private static boolean m118427a(String str, View view) {
        int i;
        if (C43127fh.m136806a(view.getContext())) {
            i = -1;
        } else {
            i = -2;
        }
        return new Bidi(str, i).baseIsLeftToRight();
    }

    /* renamed from: a */
    private static String m118420a(String str, boolean z) {
        String b = C0705a.m2999a(!z).mo2852b(str);
        if (!z) {
            return b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
        }
        StringBuilder sb = new StringBuilder("‭");
        sb.append(b);
        sb.append(8237);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m118425a(TextView textView, ViewGroup viewGroup, boolean z) {
        int i;
        boolean a = C43127fh.m136806a(viewGroup.getContext());
        C0991u.m4209d((View) (ViewGroup) textView.getParent(), z ^ true ? 1 : 0);
        int i2 = 3;
        if (z) {
            i = 3;
        } else {
            i = 5;
        }
        textView.setGravity(i);
        if (VERSION.SDK_INT >= 17) {
            if (!z) {
                i2 = 2;
            }
            textView.setTextDirection(i2);
            viewGroup.setLayoutDirection(a ? 1 : 0);
        }
    }

    /* renamed from: a */
    private static void m118424a(TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        int i;
        imageView.setSelected(false);
        if (textView2 != null) {
            textView2.setText(C23481i.m77091b(R.string.b2o));
        }
        imageView.setRotation(0.0f);
        textView.getLayoutParams().height = -2;
        if (z) {
            i = (int) C9738o.m28708b(imageView.getContext(), 20.0f);
        } else {
            i = (int) imageView.getResources().getDimension(R.dimen.gu);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = i;
        } else {
            marginLayoutParams.topMargin = i;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    static final /* synthetic */ void m118422a(ImageView imageView, ViewGroup viewGroup, final TextView textView, int i, int i2, boolean z, final SpannableString spannableString, View view) {
        final boolean isSelected = imageView.isSelected();
        C42920ah.m136265a(viewGroup, imageView, textView, i, i2, isSelected, z, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!isSelected) {
                    textView.setText(spannableString);
                }
            }
        });
        if (isSelected) {
            textView.setMovementMethod(C23808t.m78017a());
            textView.setText(m118419a());
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m118423a(TextView textView, int i, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        ImageView imageView2 = imageView;
        int height = textView.getHeight();
        int lineCount = (int) (((float) i) + (((float) dynamicLayout.getLineCount()) * C9738o.m28708b(textView.getContext(), 2.0f)));
        if (height == lineCount) {
            TextView textView3 = textView;
            SpannableString spannableString3 = spannableString;
            textView.setText(spannableString);
            return;
        }
        TextView textView4 = textView;
        imageView.setSelected(true);
        TextView textView5 = textView2;
        textView2.setOnClickListener(new C36741l(imageView));
        C36742m mVar = new C36742m(imageView, viewGroup, textView4, lineCount, height, z, spannableString2);
        imageView.setOnClickListener(mVar);
    }
}
