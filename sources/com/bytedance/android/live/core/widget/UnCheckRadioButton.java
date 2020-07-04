package com.bytedance.android.live.core.widget;

import android.support.p029v7.widget.AppCompatRadioButton;

public class UnCheckRadioButton extends AppCompatRadioButton {
    public void toggle() {
        setChecked(!isChecked());
    }
}
