package com.facebook.react.views.text;

import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;

public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint sTextPaintInstance = new TextPaint(1);
    public Spannable mPreparedSpannableText;
    private final YogaMeasureFunction mTextMeasureFunction = new YogaMeasureFunction() {
        /* JADX WARNING: type inference failed for: r11v14, types: [android.text.BoringLayout] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long measure(com.facebook.yoga.YogaNode r10, float r11, com.facebook.yoga.YogaMeasureMode r12, float r13, com.facebook.yoga.YogaMeasureMode r14) {
            /*
                r9 = this;
                android.text.TextPaint r2 = com.facebook.react.views.text.ReactTextShadowNode.sTextPaintInstance
                com.facebook.react.views.text.ReactTextShadowNode r10 = com.facebook.react.views.text.ReactTextShadowNode.this
                android.text.Spannable r10 = r10.mPreparedSpannableText
                java.lang.String r13 = "Spannable element has not been prepared in onBeforeLayout"
                java.lang.Object r10 = com.facebook.infer.p728a.C13854a.m40913a(r10, r13)
                r1 = r10
                android.text.Spanned r1 = (android.text.Spanned) r1
                android.text.BoringLayout$Metrics r6 = android.text.BoringLayout.isBoring(r1, r2)
                if (r6 != 0) goto L_0x001a
                float r10 = android.text.Layout.getDesiredWidth(r1, r2)
                goto L_0x001c
            L_0x001a:
                r10 = 2143289344(0x7fc00000, float:NaN)
            L_0x001c:
                com.facebook.yoga.YogaMeasureMode r13 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
                r14 = 0
                r0 = 0
                r8 = 1
                if (r12 == r13) goto L_0x002a
                int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r12 >= 0) goto L_0x0028
                goto L_0x002a
            L_0x0028:
                r12 = 0
                goto L_0x002b
            L_0x002a:
                r12 = 1
            L_0x002b:
                r13 = 1065353216(0x3f800000, float:1.0)
                r3 = 23
                if (r6 != 0) goto L_0x0084
                if (r12 != 0) goto L_0x003d
                boolean r4 = com.facebook.yoga.C14644a.m42350a(r10)
                if (r4 != 0) goto L_0x0084
                int r4 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r4 > 0) goto L_0x0084
            L_0x003d:
                double r10 = (double) r10
                double r10 = java.lang.Math.ceil(r10)
                int r10 = (int) r10
                int r11 = android.os.Build.VERSION.SDK_INT
                if (r11 >= r3) goto L_0x0059
                android.text.StaticLayout r11 = new android.text.StaticLayout
                android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                com.facebook.react.views.text.ReactTextShadowNode r12 = com.facebook.react.views.text.ReactTextShadowNode.this
                boolean r7 = r12.mIncludeFontPadding
                r0 = r11
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                goto L_0x00e3
            L_0x0059:
                int r11 = r1.length()
                android.text.StaticLayout$Builder r10 = android.text.StaticLayout.Builder.obtain(r1, r14, r11, r2, r10)
                android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
                android.text.StaticLayout$Builder r10 = r10.setAlignment(r11)
                android.text.StaticLayout$Builder r10 = r10.setLineSpacing(r0, r13)
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                boolean r11 = r11.mIncludeFontPadding
                android.text.StaticLayout$Builder r10 = r10.setIncludePad(r11)
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                int r11 = r11.mTextBreakStrategy
                android.text.StaticLayout$Builder r10 = r10.setBreakStrategy(r11)
                android.text.StaticLayout$Builder r10 = r10.setHyphenationFrequency(r8)
                android.text.StaticLayout r11 = r10.build()
                goto L_0x00e3
            L_0x0084:
                if (r6 == 0) goto L_0x00a2
                if (r12 != 0) goto L_0x008f
                int r10 = r6.width
                float r10 = (float) r10
                int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r10 > 0) goto L_0x00a2
            L_0x008f:
                int r10 = r6.width
                android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 0
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                boolean r7 = r11.mIncludeFontPadding
                r0 = r1
                r1 = r2
                r2 = r10
                android.text.BoringLayout r11 = android.text.BoringLayout.make(r0, r1, r2, r3, r4, r5, r6, r7)
                goto L_0x00e3
            L_0x00a2:
                int r10 = android.os.Build.VERSION.SDK_INT
                if (r10 >= r3) goto L_0x00b8
                android.text.StaticLayout r10 = new android.text.StaticLayout
                int r3 = (int) r11
                android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                boolean r7 = r11.mIncludeFontPadding
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r11 = r10
                goto L_0x00e3
            L_0x00b8:
                int r10 = r1.length()
                int r11 = (int) r11
                android.text.StaticLayout$Builder r10 = android.text.StaticLayout.Builder.obtain(r1, r14, r10, r2, r11)
                android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
                android.text.StaticLayout$Builder r10 = r10.setAlignment(r11)
                android.text.StaticLayout$Builder r10 = r10.setLineSpacing(r0, r13)
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                boolean r11 = r11.mIncludeFontPadding
                android.text.StaticLayout$Builder r10 = r10.setIncludePad(r11)
                com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                int r11 = r11.mTextBreakStrategy
                android.text.StaticLayout$Builder r10 = r10.setBreakStrategy(r11)
                android.text.StaticLayout$Builder r10 = r10.setHyphenationFrequency(r8)
                android.text.StaticLayout r11 = r10.build()
            L_0x00e3:
                com.facebook.react.views.text.ReactTextShadowNode r10 = com.facebook.react.views.text.ReactTextShadowNode.this
                int r10 = r10.mNumberOfLines
                r12 = -1
                if (r10 == r12) goto L_0x0106
                com.facebook.react.views.text.ReactTextShadowNode r10 = com.facebook.react.views.text.ReactTextShadowNode.this
                int r10 = r10.mNumberOfLines
                int r12 = r11.getLineCount()
                if (r10 >= r12) goto L_0x0106
                int r10 = r11.getWidth()
                com.facebook.react.views.text.ReactTextShadowNode r12 = com.facebook.react.views.text.ReactTextShadowNode.this
                int r12 = r12.mNumberOfLines
                int r12 = r12 - r8
                int r11 = r11.getLineBottom(r12)
                long r10 = com.facebook.yoga.C14645b.m42352a(r10, r11)
                return r10
            L_0x0106:
                int r10 = r11.getWidth()
                int r11 = r11.getHeight()
                long r10 = com.facebook.yoga.C14645b.m42352a(r10, r11)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextShadowNode.C144601.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
        }
    };

    public boolean isVirtualAnchor() {
        return true;
    }

    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    public LayoutShadowNode mutableCopy() {
        return new ReactTextShadowNode(this);
    }

    public ReactTextShadowNode() {
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
        }
    }

    public void onBeforeLayout() {
        this.mPreparedSpannableText = spannedFromShadowNode(this, null);
        markUpdated();
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    private ReactTextShadowNode(ReactTextShadowNode reactTextShadowNode) {
        super(reactTextShadowNode);
        this.mPreparedSpannableText = reactTextShadowNode.mPreparedSpannableText;
        initMeasureFunction();
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mPreparedSpannableText != null) {
            ReactTextUpdate reactTextUpdate = new ReactTextUpdate(this.mPreparedSpannableText, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy);
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
        }
    }
}
