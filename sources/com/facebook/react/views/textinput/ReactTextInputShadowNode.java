package com.facebook.react.views.textinput;

import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.C14645b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    private EditText mDummyEditText;
    private ReactTextInputLocalData mLocalData;
    private int mMostRecentEventCount = -1;
    private String mText;

    public String getText() {
        return this.mText;
    }

    public boolean isVirtualAnchor() {
        return true;
    }

    public boolean isYogaLeafNode() {
        return true;
    }

    public ReactTextInputShadowNode() {
        int i = VERSION.SDK_INT;
        this.mTextBreakStrategy = 0;
        setMeasureFunction(this);
    }

    public ReactTextInputShadowNode mutableCopy() {
        return new ReactTextInputShadowNode(this);
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }

    public void setLocalData(Object obj) {
        C13854a.m40914a(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    private ReactTextInputShadowNode(ReactTextInputShadowNode reactTextInputShadowNode) {
        super(reactTextInputShadowNode);
        this.mMostRecentEventCount = reactTextInputShadowNode.mMostRecentEventCount;
        this.mText = reactTextInputShadowNode.mText;
        this.mLocalData = reactTextInputShadowNode.mLocalData;
        setMeasureFunction(this);
        ThemedReactContext themedContext = getThemedContext();
        if (themedContext != null) {
            setThemedContext(themedContext);
        }
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            ReactTextUpdate reactTextUpdate = new ReactTextUpdate(spannedFromShadowNode(this, getText()), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy);
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
        }
    }

    public void setTextBreakStrategy(String str) {
        if (VERSION.SDK_INT >= 23) {
            if (str == null || "simple".equals(str)) {
                this.mTextBreakStrategy = 0;
            } else if ("highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
            } else {
                StringBuilder sb = new StringBuilder("Invalid textBreakStrategy: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
        }
    }

    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText editText = new EditText(getThemedContext());
        setDefaultPadding(4, (float) editText.getPaddingStart());
        setDefaultPadding(1, (float) editText.getPaddingTop());
        setDefaultPadding(5, (float) editText.getPaddingEnd());
        setDefaultPadding(3, (float) editText.getPaddingBottom());
        this.mDummyEditText = editText;
        this.mDummyEditText.setPadding(0, 0, 0, 0);
        this.mDummyEditText.setLayoutParams(new LayoutParams(-2, -2));
    }

    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) C13854a.m40916b(this.mDummyEditText);
        if (this.mLocalData == null) {
            return C14645b.m42352a(0, 0);
        }
        this.mLocalData.apply(editText);
        editText.measure(MeasureUtil.getMeasureSpec(f, yogaMeasureMode), MeasureUtil.getMeasureSpec(f2, yogaMeasureMode2));
        return C14645b.m42352a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }
}
