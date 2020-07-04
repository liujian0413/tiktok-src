package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtTextView */
public class DmtTextView extends AppCompatTextView {
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", text: ");
        sb.append(getText());
        return sb.toString();
    }

    public DmtTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25769a(AttributeSet attributeSet) {
        C10832b.m31784a().mo26163a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10832b.m31784a().mo26164a((TextView) this, str);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException unused) {
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo25769a(attributeSet);
    }

    public DmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo25769a(attributeSet);
    }
}
