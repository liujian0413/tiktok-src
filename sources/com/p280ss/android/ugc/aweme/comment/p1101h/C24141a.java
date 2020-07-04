package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.text.TextUtils;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.h.a */
public final class C24141a {
    /* renamed from: a */
    public static void m79326a(Comment comment, TextView textView) {
        if (C6399b.m19944t() && !TextUtils.isEmpty(comment.getLabelText())) {
            String a = C1642a.m8034a(textView.getResources().getString(R.string.a8m), new Object[]{""});
            if (!TextUtils.isEmpty(a)) {
                textView.setVisibility(0);
                textView.setText(a);
                if (textView instanceof DmtTextView) {
                    ((DmtTextView) textView).setFontType(C10834d.f29337g);
                }
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static void m79327a(Comment comment, TextView textView, boolean z) {
        String labelText = comment.getLabelText();
        if (TextUtils.isEmpty(labelText)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(labelText);
        if (C6399b.m19944t()) {
            if (comment.getLabelType() == 1) {
                textView.setTextColor(textView.getResources().getColor(R.color.a2w));
            } else {
                textView.setTextColor(textView.getResources().getColor(R.color.sw));
            }
            if (textView instanceof DmtTextView) {
                ((DmtTextView) textView).setFontType(C10834d.f29337g);
            }
        } else if (comment.getLabelType() == 1) {
            textView.setBackgroundResource(R.drawable.xl);
            textView.setTextColor(-1);
        } else if (z) {
            textView.setBackgroundResource(R.drawable.j9);
            textView.setTextColor(textView.getResources().getColor(R.color.sh));
        } else {
            textView.setBackgroundResource(R.drawable.j8);
            textView.setTextColor(textView.getResources().getColor(R.color.sw));
        }
    }
}
