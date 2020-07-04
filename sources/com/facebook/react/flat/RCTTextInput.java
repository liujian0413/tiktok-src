package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.C14645b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class RCTTextInput extends RCTVirtualText implements AndroidView, YogaMeasureFunction {
    private EditText mEditText;
    private int mJsEventCount = -1;
    private int mNumberOfLines = -1;
    private boolean mPaddingChanged;
    private String mText;

    /* access modifiers changed from: 0000 */
    public boolean isEditable() {
        return true;
    }

    public boolean isPaddingChanged() {
        return this.mPaddingChanged;
    }

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return true;
    }

    public /* bridge */ /* synthetic */ void markUpdated() {
        super.markUpdated();
    }

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void resetPaddingChanged() {
        this.mPaddingChanged = false;
    }

    public void setBackgroundColor(int i) {
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldAllowEmptySpans() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean clipsSubviews() {
        return super.clipsSubviews();
    }

    public /* bridge */ /* synthetic */ boolean isHorizontal() {
        return super.isHorizontal();
    }

    public RCTTextInput() {
        forceMountToView();
        setMeasureFunction(this);
    }

    @ReactProp(defaultDouble = Double.NaN, name = "color")
    public /* bridge */ /* synthetic */ void setColor(double d) {
        super.setColor(d);
    }

    @ReactProp(name = "fontFamily")
    public /* bridge */ /* synthetic */ void setFontFamily(String str) {
        super.setFontFamily(str);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public /* bridge */ /* synthetic */ void setFontSize(float f) {
        super.setFontSize(f);
    }

    @ReactProp(name = "fontStyle")
    public /* bridge */ /* synthetic */ void setFontStyle(String str) {
        super.setFontStyle(str);
    }

    @ReactProp(name = "fontWeight")
    public /* bridge */ /* synthetic */ void setFontWeight(String str) {
        super.setFontWeight(str);
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mJsEventCount = i;
    }

    public /* bridge */ /* synthetic */ void setOverflow(String str) {
        super.setOverflow(str);
    }

    @ReactProp(name = "textDecorationLine")
    public /* bridge */ /* synthetic */ void setTextDecorationLine(String str) {
        super.setTextDecorationLine(str);
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public /* bridge */ /* synthetic */ void setTextShadowColor(int i) {
        super.setTextShadowColor(i);
    }

    @ReactProp(name = "textShadowOffset")
    public /* bridge */ /* synthetic */ void setTextShadowOffset(ReadableMap readableMap) {
        super.setTextShadowOffset(readableMap);
    }

    @ReactProp(name = "textShadowRadius")
    public /* bridge */ /* synthetic */ void setTextShadowRadius(float f) {
        super.setTextShadowRadius(f);
    }

    /* access modifiers changed from: protected */
    public void notifyChanged(boolean z) {
        super.notifyChanged(z);
        markUpdated();
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        this.mNumberOfLines = i;
        notifyChanged(true);
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        notifyChanged(true);
    }

    /* access modifiers changed from: protected */
    public void performCollectText(SpannableStringBuilder spannableStringBuilder) {
        if (this.mText != null) {
            spannableStringBuilder.append(this.mText);
        }
        super.performCollectText(spannableStringBuilder);
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mJsEventCount != -1) {
            ReactTextUpdate reactTextUpdate = new ReactTextUpdate(getText(), this.mJsEventCount, false, getPadding(4), getPadding(1), getPadding(5), getPadding(3), -1);
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
        }
    }

    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        this.mEditText = new EditText(themedReactContext);
        this.mEditText.setLayoutParams(new LayoutParams(-2, -2));
        setDefaultPadding(4, (float) this.mEditText.getPaddingStart());
        setDefaultPadding(1, (float) this.mEditText.getPaddingTop());
        setDefaultPadding(5, (float) this.mEditText.getPaddingEnd());
        setDefaultPadding(3, (float) this.mEditText.getPaddingBottom());
        this.mEditText.setPadding(0, 0, 0, 0);
    }

    public /* bridge */ /* synthetic */ void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
    }

    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        this.mPaddingChanged = true;
        dirty();
    }

    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) C13854a.m40916b(this.mEditText);
        int fontSize = getFontSize();
        if (fontSize == -1) {
            fontSize = (int) Math.ceil((double) PixelUtil.toPixelFromSP(14.0f));
        }
        editText.setTextSize(0, (float) fontSize);
        if (this.mNumberOfLines != -1) {
            editText.setLines(this.mNumberOfLines);
        }
        editText.measure(MeasureUtil.getMeasureSpec(f, yogaMeasureMode), MeasureUtil.getMeasureSpec(f2, yogaMeasureMode2));
        return C14645b.m42352a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }
}
