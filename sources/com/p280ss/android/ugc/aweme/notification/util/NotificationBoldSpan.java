package com.p280ss.android.ugc.aweme.notification.util;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.util.NotificationBoldSpan */
public class NotificationBoldSpan extends ForegroundColorSpan {
    public NotificationBoldSpan() {
        super(C6399b.m19921a().getResources().getColor(R.color.a5d));
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
