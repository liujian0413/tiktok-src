package com.bytedance.ies.dmt.p262ui.widget.setting.checkable;

import android.content.Context;
import android.support.p029v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.SettingSwitch */
public class SettingSwitch extends SwitchCompat {
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public SettingSwitch(Context context) {
        super(context);
    }

    public SettingSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
