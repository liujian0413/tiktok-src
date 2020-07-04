package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.NewSettingItem */
public final class NewSettingItem extends SettingItem {
    public NewSettingItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public NewSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo59384a() {
        if (this.f29164b != null) {
            ImageView imageView = this.f29164b;
            C7573i.m23582a((Object) imageView, "ivRightIcon");
            imageView.setVisibility(8);
        }
    }

    public NewSettingItem(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NewSettingItem(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
