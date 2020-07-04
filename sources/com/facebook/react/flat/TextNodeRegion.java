package com.facebook.react.flat;

import android.text.Layout;
import android.text.Spanned;

final class TextNodeRegion extends NodeRegion {
    private Layout mLayout;

    /* access modifiers changed from: 0000 */
    public final Layout getLayout() {
        return this.mLayout;
    }

    public final void setLayout(Layout layout) {
        this.mLayout = layout;
    }

    /* access modifiers changed from: 0000 */
    public final boolean matchesTag(int i) {
        if (super.matchesTag(i)) {
            return true;
        }
        if (this.mLayout != null) {
            CharSequence text = this.mLayout.getText();
            if (text instanceof Spanned) {
                for (RCTRawText reactTag : (RCTRawText[]) ((Spanned) text).getSpans(0, text.length(), RCTRawText.class)) {
                    if (reactTag.getReactTag() == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int getReactTag(float f, float f2) {
        if (this.mLayout != null) {
            CharSequence text = this.mLayout.getText();
            if (text instanceof Spanned) {
                int round = Math.round(f2 - getTop());
                if (round >= this.mLayout.getLineTop(0) && round < this.mLayout.getLineBottom(this.mLayout.getLineCount() - 1)) {
                    float round2 = (float) Math.round(f - getLeft());
                    int lineForVertical = this.mLayout.getLineForVertical(round);
                    if (this.mLayout.getLineLeft(lineForVertical) <= round2 && round2 <= this.mLayout.getLineRight(lineForVertical)) {
                        int offsetForHorizontal = this.mLayout.getOffsetForHorizontal(lineForVertical, round2);
                        RCTRawText[] rCTRawTextArr = (RCTRawText[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, RCTRawText.class);
                        if (rCTRawTextArr.length != 0) {
                            return rCTRawTextArr[0].getReactTag();
                        }
                    }
                }
            }
        }
        return super.getReactTag(f, f2);
    }

    TextNodeRegion(float f, float f2, float f3, float f4, int i, boolean z, Layout layout) {
        super(f, f2, f3, f4, i, z);
        this.mLayout = layout;
    }
}
