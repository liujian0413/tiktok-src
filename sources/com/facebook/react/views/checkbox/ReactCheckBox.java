package com.facebook.react.views.checkbox;

import android.content.Context;
import android.widget.CheckBox;

class ReactCheckBox extends CheckBox {
    private boolean mAllowChange = true;

    public ReactCheckBox(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.mAllowChange) {
            this.mAllowChange = false;
            super.setChecked(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.mAllowChange = true;
    }
}
