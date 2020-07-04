package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.C14645b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;

public class ProgressBarShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    private final SparseIntArray mHeight;
    private final Set<Integer> mMeasured;
    private String mStyle;
    private final SparseIntArray mWidth;

    public String getStyle() {
        return this.mStyle;
    }

    public ProgressBarShadowNode() {
        this.mStyle = "Normal";
        this.mHeight = new SparseIntArray();
        this.mWidth = new SparseIntArray();
        this.mMeasured = new HashSet();
        setMeasureFunction(this);
    }

    public ProgressBarShadowNode mutableCopy() {
        return new ProgressBarShadowNode(this);
    }

    @ReactProp(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.mStyle = str;
    }

    public ProgressBarShadowNode(ProgressBarShadowNode progressBarShadowNode) {
        super(progressBarShadowNode);
        this.mStyle = "Normal";
        this.mWidth = progressBarShadowNode.mWidth.clone();
        this.mHeight = progressBarShadowNode.mHeight.clone();
        this.mMeasured = new HashSet(progressBarShadowNode.mMeasured);
        setMeasureFunction(this);
    }

    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(getStyle());
        if (!this.mMeasured.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.mHeight.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.mWidth.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.mMeasured.add(Integer.valueOf(styleFromString));
        }
        return C14645b.m42352a(this.mWidth.get(styleFromString), this.mHeight.get(styleFromString));
    }
}
