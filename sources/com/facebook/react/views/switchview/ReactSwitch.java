package com.facebook.react.views.switchview;

import android.content.Context;
import android.support.p029v7.widget.SwitchCompat;

class ReactSwitch extends SwitchCompat {
    private boolean mAllowChange = true;

    public ReactSwitch(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    public void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.mAllowChange = true;
    }

    public void setChecked(boolean z) {
        if (this.mAllowChange && isChecked() != z) {
            this.mAllowChange = false;
            super.setChecked(z);
        }
    }
}
