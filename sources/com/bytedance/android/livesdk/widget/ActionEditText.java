package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.android.live.core.widget.LiveEditText;

public class ActionEditText extends LiveEditText {
    public ActionEditText(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    public ActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
