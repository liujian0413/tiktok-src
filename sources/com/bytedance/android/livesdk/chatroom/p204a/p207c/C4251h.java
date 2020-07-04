package com.bytedance.android.livesdk.chatroom.p204a.p207c;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.p280ss.ugc.live.barrage.p1824a.C46196c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.h */
public final class C4251h {

    /* renamed from: a */
    public final C46196c f12413a;

    /* renamed from: b */
    private final View f12414b;

    public C4251h(View view, float f, float f2, C8680m mVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        this.f12414b = view;
        if (mVar == null || mVar.f23626c == null || TTLiveSDKContext.getHostService().mo22367h().mo22179b() != mVar.f23626c.getId()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = (TextView) view.findViewById(R.id.dsf);
        if (!(mVar == null || mVar.f23625b == null)) {
            textView.setText(mVar.f23625b);
        }
        textView.setTextSize(1, f);
        textView.setAlpha(f2);
        if (view.getContext() == null || view.getContext().getResources() == null) {
            i = -1;
        } else {
            Resources resources = view.getContext().getResources();
            if (z) {
                i3 = R.color.aqq;
            } else {
                i3 = R.color.as5;
            }
            i = resources.getColor(i3);
        }
        if (!(mVar == null || mVar.f23626c == null)) {
            NobleLevelInfo nobleLevelInfo = mVar.f23626c.getNobleLevelInfo();
            if (nobleLevelInfo != null && nobleLevelInfo.getNobleLevel() > 0) {
                try {
                    i2 = Color.parseColor(mVar.f23629f);
                } catch (Exception unused) {
                    i2 = -1;
                }
                if (z) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setStroke(C3358ac.m12510a(1.0f), i);
                    gradientDrawable.setCornerRadius((float) C3358ac.m12510a(17.0f));
                    gradientDrawable.setColor(0);
                    this.f12414b.setBackgroundDrawable(gradientDrawable);
                }
            }
        }
        textView.setTextColor(i);
        this.f12413a = new C46196c(this.f12414b);
    }
}
