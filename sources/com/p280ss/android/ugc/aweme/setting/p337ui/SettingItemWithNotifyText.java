package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItem;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingItemWithNotifyText */
public class SettingItemWithNotifyText extends EffectiveSettingItem {
    /* renamed from: b */
    public final void mo20984b() {
        super.mo20984b();
        LayoutParams layoutParams = (LayoutParams) this.f29142i.getLayoutParams();
        layoutParams.width = C23486n.m77122a(4.0d);
        layoutParams.height = C23486n.m77122a(4.0d);
        layoutParams.setMargins(layoutParams.leftMargin + C23486n.m77122a(2.0d), (((int) (-this.f29141h.getTextSize())) / 2) + C23486n.m77122a(1.0d), layoutParams.rightMargin, layoutParams.bottomMargin);
        this.f29142i.setLayoutParams(layoutParams);
        this.f29159x.setTextSize(1, this.f29149n);
    }

    public SettingItemWithNotifyText(Context context) {
        super(context);
    }

    public SettingItemWithNotifyText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingItemWithNotifyText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
