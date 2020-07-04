package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.challenge.C23666b;
import com.p280ss.android.ugc.aweme.challenge.p1083b.C23668a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.i */
public final class C23793i {
    /* renamed from: a */
    public static void m77997a(Challenge challenge, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        String charSequence;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (challenge != null) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().mo59877d();
            boolean z2 = C6399b.m19944t() && (num == null || num.intValue() == 0);
            String desc = challenge.getDesc();
            String challengeName = challenge.getChallengeName();
            String cid = challenge.getCid();
            if (!TextUtils.isEmpty(desc)) {
                boolean a = m78000a(desc, (View) textView3);
                m77995a(textView3, viewGroup2, a);
                String a2 = m77988a(desc, a);
                if (!TextUtils.equals(textView.getText(), a2)) {
                    if (!TextUtils.isEmpty(textView.getText())) {
                        m77994a(textView3, viewGroup2, textView4, imageView2, z2);
                    }
                    int i = 32;
                    if (z2) {
                        i = 64;
                    }
                    int a3 = (int) (((float) C9738o.m28691a(textView.getContext())) - C9738o.m28708b(textView.getContext(), (float) i));
                    SpannableString spannableString = new SpannableString(a2);
                    if (textView4 == null) {
                        charSequence = "";
                    } else {
                        charSequence = textView2.getText().toString();
                    }
                    C23752f fVar = new C23752f(textView.getPaint(), a3, true, charSequence, 4);
                    C23666b bVar = new C23666b(cid, challengeName, true);
                    bVar.f62373a = fVar;
                    SpannableString a4 = bVar.mo61574a(spannableString);
                    boolean z3 = fVar.f62659b;
                    if (bVar.f62413b) {
                        textView3.setText(a4);
                        textView3.setMovementMethod(C23808t.m78017a());
                    } else {
                        textView3.setText(a4);
                    }
                    int i2 = 8;
                    if (z3) {
                        textView4.setVisibility((!z3 || TextUtils.isEmpty(a2)) ? 8 : 0);
                        if (z3 && !TextUtils.isEmpty(a2)) {
                            i2 = 0;
                        }
                        imageView2.setVisibility(i2);
                        C23795j jVar = new C23795j(textView, spannableString, imageView, textView2, viewGroup, a4, z2);
                        textView3.post(jVar);
                        return;
                    }
                    imageView2.setVisibility(8);
                    textView4.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m77999a(String str, TextView textView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("#");
        spannableStringBuilder.append(String.valueOf(str));
        if (VERSION.SDK_INT >= 17) {
            boolean z2 = true;
            if (((View) textView.getParent()).getLayoutDirection() != 1) {
                z2 = false;
            }
            textView.setGravity(z2 ? 5 : 3);
        }
        textView.setText(spannableStringBuilder);
        if (z) {
            textView.post(new C23796k(textView, spannableStringBuilder));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m77998a(User user, Challenge challenge, View view) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "challenge").mo59973a("to_user_id", user.getUid()).mo59973a("enter_method", "click_name").mo59973a("tag_id", challenge.getCid()).mo59975b().f60753a);
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(user.getUid());
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", user.getSecUid()).mo18695a());
    }

    /* renamed from: a */
    private static boolean m78000a(String str, View view) {
        return new Bidi(str, C43127fh.m136806a(view.getContext()) ? -1 : -2).baseIsLeftToRight();
    }

    /* renamed from: a */
    private static void m77989a(View view) {
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
    static final /* synthetic */ void m77993a(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        textView.setText(m78001b(textView, spannableStringBuilder));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    private static String m77988a(String str, boolean z) {
        String b = C0705a.m2999a(!z).mo2852b(str);
        if (!z) {
            return b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
        }
        StringBuilder sb = new StringBuilder("‭");
        sb.append(b);
        sb.append(8237);
        return sb.toString();
    }

    /* renamed from: b */
    private static SpannableStringBuilder m78001b(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        int i;
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new C23809u(textView.getContext(), R.drawable.a9h), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                SmartRouter.buildRoute(view.getContext(), "aweme://search/trending").open();
                C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("account_type", "click").mo59973a("enter_from", "challenge").f60753a);
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        if (textView.getContext() != null) {
            i = textView.getContext().getResources().getDrawable(R.drawable.a9h).getIntrinsicWidth();
        } else {
            i = 164;
        }
        return C30357c.m99184a(spannableStringBuilder, textView.getPaint(), textView.getMeasuredWidth(), textView.getMaxLines(), 1, i);
    }

    /* renamed from: a */
    public static void m77996a(Challenge challenge, TextView textView) {
        User author = challenge.getAuthor();
        if (!challenge.isCommerce() || author == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(author.getNickname());
        textView.setOnClickListener(new C23797l(author, challenge));
    }

    /* renamed from: a */
    private static void m77995a(TextView textView, ViewGroup viewGroup, boolean z) {
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
    private static void m77994a(TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
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
            i = (int) imageView.getResources().getDimension(R.dimen.gv);
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
    static final /* synthetic */ void m77992a(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2, boolean z) {
        if (textView.getHeight() == C23668a.m77605a(textView, spannableString).f62421b.intValue()) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C23798m(imageView));
        C23799n nVar = new C23799n(imageView, viewGroup, textView, spannableString2, z, spannableString, textView2);
        imageView.setOnClickListener(nVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m77991a(ImageView imageView, ViewGroup viewGroup, TextView textView, SpannableString spannableString, boolean z, SpannableString spannableString2, TextView textView2, View view) {
        int i;
        boolean isSelected = imageView.isSelected();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        if (!isSelected) {
            textView.setText(spannableString);
            if (C6399b.m19946v()) {
                imageView.setImageResource(R.drawable.ar5);
            } else {
                imageView.setImageResource(R.drawable.ar4);
            }
            if (z) {
                marginLayoutParams.bottomMargin = (int) C9738o.m28708b(imageView.getContext(), 20.0f);
            } else {
                marginLayoutParams.topMargin = (int) imageView.getResources().getDimension(R.dimen.gv);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        if (isSelected) {
            textView.setText(spannableString2);
            if (C6399b.m19946v()) {
                imageView.setImageResource(R.drawable.ar2);
            } else {
                imageView.setImageResource(R.drawable.ar1);
            }
            if (z) {
                marginLayoutParams.bottomMargin = (int) C9738o.m28708b(imageView.getContext(), 12.0f);
            } else {
                marginLayoutParams.topMargin = (int) C9738o.m28708b(imageView.getContext(), 0.0f);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        Context context = textView.getContext();
        if (isSelected) {
            i = R.string.b7q;
        } else {
            i = R.string.b2o;
        }
        textView2.setText(context.getString(i));
        imageView.setSelected(!isSelected);
        if (!isSelected) {
            m77989a(viewGroup);
        }
    }
}
