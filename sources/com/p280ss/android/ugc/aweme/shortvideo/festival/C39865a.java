package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.challenge.p1083b.C23668a;
import com.p280ss.android.ugc.aweme.utils.C42920ah;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.a */
public final class C39865a {
    /* renamed from: a */
    static final /* synthetic */ void m127604a(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        int height = textView.getHeight();
        int intValue = C23668a.m77605a(textView, spannableString).f62421b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C39869c(imageView));
        C39870d dVar = new C39870d(imageView, viewGroup, textView, intValue, height, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(dVar);
    }

    /* renamed from: a */
    public static void m127605a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        String str2;
        int i;
        if (!TextUtils.isEmpty(str)) {
            int a = (int) (((float) C9738o.m28691a(textView.getContext())) - C9738o.m28708b(textView.getContext(), 32.0f));
            SpannableString spannableString = new SpannableString(str);
            if (textView2 == null) {
                str2 = "";
            } else {
                str2 = textView2.getText().toString();
            }
            C39879l lVar = new C39879l(textView.getPaint(), a, z, str2);
            SpannableString a2 = lVar.mo61574a(spannableString);
            boolean z2 = lVar.f103617b;
            textView.setText(a2);
            if (z) {
                int i2 = 8;
                if (z2) {
                    if (!z2 || TextUtils.isEmpty(str)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView2.setVisibility(i);
                    if (z2 && !TextUtils.isEmpty(str)) {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                    C39868b bVar = new C39868b(textView, spannableString, imageView, textView2, viewGroup, a2);
                    textView.post(bVar);
                    return;
                }
                imageView.setVisibility(8);
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m127603a(ImageView imageView, ViewGroup viewGroup, final TextView textView, int i, int i2, final SpannableString spannableString, SpannableString spannableString2, TextView textView2, View view) {
        int i3;
        TextView textView3 = textView;
        final boolean isSelected = imageView.isSelected();
        SpannableString spannableString3 = spannableString;
        C42920ah.m136265a(viewGroup, imageView, textView, i, i2, isSelected, false, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!isSelected) {
                    textView.setText(spannableString);
                }
            }
        });
        if (isSelected) {
            textView.setText(spannableString2);
        }
        Resources resources = textView2.getContext().getResources();
        if (isSelected) {
            i3 = R.string.b7q;
        } else {
            i3 = R.string.b2o;
        }
        textView2.setText(resources.getString(i3));
        ImageView imageView2 = imageView;
        imageView.setSelected(!isSelected);
    }
}
