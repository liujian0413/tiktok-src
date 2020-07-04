package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

abstract class FlatTextShadowNode extends FlatShadowNode {
    private int mTextBegin;
    private int mTextEnd;

    FlatTextShadowNode() {
    }

    /* access modifiers changed from: 0000 */
    public boolean isEditable() {
        return false;
    }

    public boolean isVirtual() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void performApplySpans(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z);

    /* access modifiers changed from: protected */
    public abstract void performCollectAttachDetachListeners(StateBuilder stateBuilder);

    /* access modifiers changed from: protected */
    public abstract void performCollectText(SpannableStringBuilder spannableStringBuilder);

    /* access modifiers changed from: 0000 */
    public boolean shouldAllowEmptySpans() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void collectText(SpannableStringBuilder spannableStringBuilder) {
        this.mTextBegin = spannableStringBuilder.length();
        performCollectText(spannableStringBuilder);
        this.mTextEnd = spannableStringBuilder.length();
    }

    /* access modifiers changed from: protected */
    public void notifyChanged(boolean z) {
        ReactShadowNodeImpl parent = getParent();
        if (parent instanceof FlatTextShadowNode) {
            ((FlatTextShadowNode) parent).notifyChanged(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void applySpans(SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (this.mTextBegin != this.mTextEnd || shouldAllowEmptySpans()) {
            performApplySpans(spannableStringBuilder, this.mTextBegin, this.mTextEnd, z);
        }
    }
}
