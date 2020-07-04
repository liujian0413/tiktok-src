package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.challenge.C23666b;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.b */
public final class C23747b {
    /* renamed from: a */
    private static boolean m77881a(String str, View view) {
        return new Bidi(str, C43127fh.m136806a(view.getContext()) ? -1 : -2).baseIsLeftToRight();
    }

    /* renamed from: a */
    private static void m77874a(View view) {
        while (view != null && (view instanceof View)) {
            view = (View) view.getParent();
            if (view instanceof ScrollableLayout) {
                break;
            }
        }
        if (view instanceof ScrollableLayout) {
            ((ScrollableLayout) view).scrollTo(0, 0);
        }
    }

    /* renamed from: a */
    private static String m77873a(String str, boolean z) {
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
    private static void m77879a(TextView textView, ViewGroup viewGroup, boolean z) {
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
    private static void m77878a(TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
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
    public static void m77880a(Challenge challenge, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        boolean z2;
        String charSequence;
        int i;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (challenge != null) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().mo59877d();
            if (!C6399b.m19944t() || !(num == null || num.intValue() == 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String content = challenge.getChallengeAnnouncement().getContent();
            if (!TextUtils.isEmpty(content)) {
                boolean a = m77881a(content, (View) textView3);
                m77879a(textView3, viewGroup2, a);
                String a2 = m77873a(content, a);
                if (!TextUtils.equals(textView.getText(), a2)) {
                    if (!TextUtils.isEmpty(textView.getText())) {
                        m77878a(textView3, viewGroup2, textView4, imageView2, z2);
                    }
                    int i2 = 32;
                    if (z2) {
                        i2 = 64;
                    }
                    int a3 = (int) (((float) C9738o.m28691a(textView.getContext())) - C9738o.m28708b(textView.getContext(), (float) i2));
                    SpannableString spannableString = new SpannableString(a2);
                    if (textView4 == null) {
                        charSequence = "";
                    } else {
                        charSequence = textView2.getText().toString();
                    }
                    C23752f fVar = r11;
                    C23752f fVar2 = new C23752f(textView.getPaint(), a3, true, charSequence, 2);
                    C23666b bVar = new C23666b(challenge.getCid(), challenge.getChallengeName(), true);
                    bVar.f62373a = fVar;
                    SpannableString a4 = bVar.mo61574a(spannableString);
                    boolean z3 = fVar.f62659b;
                    if (bVar.f62413b) {
                        textView3.setText(a4);
                        textView3.setMovementMethod(C23808t.m78017a());
                    } else {
                        textView3.setText(a4);
                    }
                    int i3 = 8;
                    if (z3) {
                        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), a3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                        int height = dynamicLayout.getHeight();
                        if (!z3 || TextUtils.isEmpty(a2)) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView4.setVisibility(i);
                        if (z3 && !TextUtils.isEmpty(a2)) {
                            i3 = 0;
                        }
                        imageView2.setVisibility(i3);
                        C23749c cVar = new C23749c(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, z2, a4);
                        textView3.post(cVar);
                        return;
                    }
                    imageView2.setVisibility(8);
                    textView4.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m77877a(TextView textView, int i, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
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
        SpannableString spannableString4 = spannableString;
        imageView2.setSelected(true);
        TextView textView5 = textView2;
        textView5.setOnClickListener(new C23750d(imageView2));
        C23751e eVar = new C23751e(imageView, viewGroup, textView4, lineCount, height, z, spannableString2, spannableString4, textView5);
        imageView2.setOnClickListener(eVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m77876a(ImageView imageView, ViewGroup viewGroup, final TextView textView, int i, int i2, boolean z, SpannableString spannableString, SpannableString spannableString2, TextView textView2, View view) {
        int i3;
        TextView textView3 = textView;
        final boolean isSelected = imageView.isSelected();
        final SpannableString spannableString3 = spannableString;
        C6903bc.m21479T().mo57876a(viewGroup, imageView, textView, i, i2, isSelected, z, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!isSelected) {
                    textView.setText(spannableString3);
                }
            }
        });
        if (isSelected) {
            textView.setText(spannableString2);
        }
        Context context = textView.getContext();
        if (isSelected) {
            i3 = R.string.b7q;
        } else {
            i3 = R.string.b2o;
        }
        textView2.setText(context.getString(i3));
        ImageView imageView2 = imageView;
        imageView.setSelected(!isSelected);
        if (!isSelected) {
            m77874a(viewGroup);
        }
    }
}
