package com.p280ss.android.ugc.aweme.p962f;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.f.d */
public final class C21704d {
    /* renamed from: a */
    public static boolean m72621a() {
        if (!C6399b.m19944t() && C21115b.m71197a().getCurUser() != null && C21115b.m71197a().getCurUser().getBindPhone() != null && C21115b.m71197a().getCurUser().getBindPhone().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m72617a(Context context) {
        String str = "";
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("bundle_webview_background", context.getResources().getColor(R.color.aye));
            intent.putExtra("hide_status_bar", true);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static float m72615a(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    private static TextView m72616a(Context context, int i) {
        SpannableString spannableString = new SpannableString(context.getString(i));
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.w0)), 1, 16, 33);
        DmtTextView dmtTextView = new DmtTextView(context);
        dmtTextView.setTextSize(18.0f);
        dmtTextView.setText(spannableString);
        dmtTextView.setPadding((int) m72615a(context.getResources(), 30.0f), (int) m72615a(context.getResources(), 20.0f), (int) m72615a(context.getResources(), 30.0f), (int) m72615a(context.getResources(), 10.0f));
        dmtTextView.setTextColor(-16777216);
        dmtTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21704d.m72617a(view.getContext());
            }
        });
        return dmtTextView;
    }

    /* renamed from: a */
    public static void m72620a(Context context, String str) {
        if (context != null) {
            C6907h.m21524a("phone_bundling_click", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
            C6861a.m21335d().bindMobile((Activity) context, str, null, null);
        }
    }

    /* renamed from: a */
    public static void m72618a(Context context, int i, Runnable runnable) {
        m72619a(context, R.string.sr, runnable, "post");
    }

    /* renamed from: a */
    public static void m72619a(final Context context, int i, final Runnable runnable, final String str) {
        Builder builder = new Builder(context);
        builder.setCustomTitle(m72616a(context, i)).setNegativeButton(R.string.s0, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        }).setPositiveButton(R.string.s3, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C21704d.m72620a(context, str);
            }
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        C6907h.m21524a("phone_bundling_show", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
        create.getButton(-1).setTextColor(context.getResources().getColor(R.color.w0));
        create.getButton(-2).setTextColor(context.getResources().getColor(R.color.abh));
    }
}
