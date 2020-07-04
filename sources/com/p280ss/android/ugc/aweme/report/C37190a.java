package com.p280ss.android.ugc.aweme.report;

import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.report.a */
public final class C37190a {
    /* renamed from: a */
    public static void m119551a(Aweme aweme, LinearLayout linearLayout) {
        double d;
        if (C28482e.m93617j(aweme)) {
            if (aweme.getAwemeRiskModel().getType() == 1) {
                linearLayout.setBackground(linearLayout.getResources().getDrawable(R.color.a80));
            } else {
                linearLayout.setBackground(linearLayout.getResources().getDrawable(R.color.a7d));
            }
            TextView textView = (TextView) linearLayout.findViewById(R.id.e0y);
            if (C6399b.m19946v()) {
                textView.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a6d));
            } else {
                textView.setTextColor(C6399b.m19921a().getResources().getColor(R.color.az3));
            }
            textView.setText(aweme.getAwemeRiskModel().getContent());
            LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (textView.getLineCount() > 1) {
                d = 68.0d;
            } else {
                d = 32.0d;
            }
            layoutParams.height = C23486n.m77122a(d);
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}
