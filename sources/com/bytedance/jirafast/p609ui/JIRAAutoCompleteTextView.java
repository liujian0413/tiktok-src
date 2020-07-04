package com.bytedance.jirafast.p609ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.AppCompatAutoCompleteTextView;
import android.util.AttributeSet;

/* renamed from: com.bytedance.jirafast.ui.JIRAAutoCompleteTextView */
public class JIRAAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public boolean enoughToFilter() {
        return true;
    }

    public JIRAAutoCompleteTextView(Context context) {
        super(context);
    }

    public JIRAAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JIRAAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        performFiltering(getText(), 0);
    }
}
