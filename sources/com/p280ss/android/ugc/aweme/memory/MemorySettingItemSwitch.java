package com.p280ss.android.ugc.aweme.memory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.memory.MemorySettingItemSwitch */
public final class MemorySettingItemSwitch extends SettingItemSwitch {
    public MemorySettingItemSwitch(Context context) {
        this(context, null, 0, 6, null);
    }

    public MemorySettingItemSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final void mo26017b(Context context, AttributeSet attributeSet) {
        super.mo26017b(context, attributeSet);
        this.f29170g.setBackgroundColor(-1);
        setStartTextColor(R.color.fs);
        FrameLayout frameLayout = this.f29171h;
        C7573i.m23582a((Object) frameLayout, "rightLayout");
        ViewParent parent = frameLayout.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = -2;
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public MemorySettingItemSwitch(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ MemorySettingItemSwitch(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
