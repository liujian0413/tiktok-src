package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.mix.C33570w;
import com.p280ss.android.ugc.aweme.mix.C33572y;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.j.t */
public final class C28504t {
    /* renamed from: a */
    public static boolean m93691a() {
        return m93695b();
    }

    /* renamed from: b */
    public static boolean m93695b() {
        if (C6399b.m19944t() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        if (C30199h.m98861a().getMixPermission().intValue() != 1 && !C7213d.m22500a().mo18764ab()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m93693a(String str) {
        return Keva.getRepo("mix_repo").getBoolean(str, false);
    }

    /* renamed from: a */
    private static void m93689a(TextView textView, CharSequence charSequence) {
        try {
            textView.setText(charSequence);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: a */
    public static void m93690a(String str, boolean z) {
        Keva.getRepo("mix_repo").storeBoolean(str, true);
    }

    /* renamed from: b */
    public static boolean m93696b(Aweme aweme, int i, String str) {
        if (!m93695b() || aweme == null || !aweme.isMixAweme()) {
            return false;
        }
        if (i == 1 && (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 2))) {
            return false;
        }
        if (i == 2 || i == 1) {
            if (aweme.isProhibited() && C33230ac.m107241p(aweme)) {
                return false;
            }
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.isInReviewing()) {
                return false;
            }
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null && C33230ac.m107241p(aweme)) {
                int reviewStatus = starAtlasInfo.getReviewStatus();
                if (reviewStatus == 1 || reviewStatus == 2 || reviewStatus == 3 || reviewStatus == 4) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m93688a(Context context, Aweme aweme, TextView textView) {
        String str;
        boolean z;
        int i;
        if (m93695b() && aweme.getMixInfo() != null && aweme.getMixInfo().statis != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                aweme.setDesc(" ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
                str = context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
                sb.append(" | ");
                str = sb.toString();
                z = true;
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(textView.getText());
            spannableStringBuilder.setSpan(new C33570w(), 0, str.length(), 34);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(R.color.aze));
            if (z) {
                i = str.length() - 3;
            } else {
                i = str.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, i, 34);
            if (z) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.aza)), str.length() - 2, str.length() - 1, 34);
            }
            m93689a(textView, (CharSequence) spannableStringBuilder);
            textView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static void m93694b(Context context, Aweme aweme, TextView textView) {
        String str;
        boolean z;
        if (m93695b() && aweme.getMixInfo() != null && aweme.getMixInfo().statis != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                aweme.setDesc(" ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
                str = context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
                sb.append(" | ");
                str = sb.toString();
                z = true;
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(textView.getText());
            if (z) {
                spannableStringBuilder.setSpan(new C33572y((float) C23486n.m77127c(14.0d), context.getResources().getColor(R.color.aza)), str.length() - 2, str.length() - 1, 34);
            }
            m93689a(textView, (CharSequence) spannableStringBuilder);
            textView.setVisibility(0);
        }
    }

    /* renamed from: c */
    public static int m93697c(Context context, Aweme aweme, TextView textView) {
        String str;
        if (!m93695b() || aweme.getMixInfo() == null || aweme.getMixInfo().statis == null) {
            return 0;
        }
        if (TextUtils.isEmpty(aweme.getDesc())) {
            aweme.setDesc("");
        }
        if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
            str = context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getResources().getString(R.string.c_f, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
            sb.append(" | ");
            str = sb.toString();
        }
        return str.length();
    }

    /* renamed from: a */
    public static boolean m93692a(Aweme aweme, int i, String str) {
        if (!m93695b() || aweme == null || !aweme.isMixAweme() || "compilation_detail".equals(str)) {
            return false;
        }
        if (i == 1 && (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 2))) {
            return false;
        }
        if (i == 2 || i == 1) {
            if (aweme.isProhibited() && C33230ac.m107241p(aweme)) {
                return false;
            }
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.isInReviewing()) {
                return false;
            }
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null && C33230ac.m107241p(aweme)) {
                int reviewStatus = starAtlasInfo.getReviewStatus();
                if (reviewStatus == 1 || reviewStatus == 2 || reviewStatus == 3 || reviewStatus == 4) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m93687a(Context context, Aweme aweme, ImageView imageView, String str, int i) {
        if (!m93695b() || aweme == null || !aweme.isMixAweme()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m93686a(final Context context, final Aweme aweme, View view, TextView textView, final String str, int i) {
        if (!m93695b() || aweme == null || !aweme.isMixAweme()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (textView != null) {
                textView.setText("");
            }
        } else {
            if (view != null) {
                view.setVisibility(0);
                view.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        MixDetailActivity.m108253a(context, aweme, aweme.getMixInfo().mixId, str, "video");
                    }
                });
            }
            if (textView != null) {
                textView.setText(aweme.getMixInfo().mixName);
            }
        }
    }
}
