package com.facebook.react.views.switchview;

import android.graphics.PorterDuff.Mode;
import android.view.View.MeasureSpec;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.C14645b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactSwitchManager extends SimpleViewManager<ReactSwitch> {
    private static final OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ReactSwitchEvent(compoundButton.getId(), z));
        }
    };

    static class ReactSwitchShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int mHeight;
        private boolean mMeasured;
        private int mWidth;

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }

        private ReactSwitchShadowNode() {
            initMeasureFunction();
        }

        public ReactSwitchShadowNode mutableCopy() {
            return new ReactSwitchShadowNode(this);
        }

        private ReactSwitchShadowNode(ReactSwitchShadowNode reactSwitchShadowNode) {
            super(reactSwitchShadowNode);
            this.mWidth = reactSwitchShadowNode.mWidth;
            this.mHeight = reactSwitchShadowNode.mHeight;
            this.mMeasured = reactSwitchShadowNode.mMeasured;
            initMeasureFunction();
        }

        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.mMeasured) {
                ReactSwitch reactSwitch = new ReactSwitch(getThemedContext());
                reactSwitch.setShowText(false);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
                reactSwitch.measure(makeMeasureSpec, makeMeasureSpec);
                this.mWidth = reactSwitch.getMeasuredWidth();
                this.mHeight = reactSwitch.getMeasuredHeight();
                this.mMeasured = true;
            }
            return C14645b.m42352a(this.mWidth, this.mHeight);
        }
    }

    public String getName() {
        return "AndroidSwitch";
    }

    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    /* access modifiers changed from: protected */
    public ReactSwitch createViewInstance(ThemedReactContext themedReactContext) {
        ReactSwitch reactSwitch = new ReactSwitch(themedReactContext);
        reactSwitch.setShowText(false);
        return reactSwitch;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwitch reactSwitch, boolean z) {
        reactSwitch.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactSwitch reactSwitch) {
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @ReactProp(name = "on")
    public void setOn(ReactSwitch reactSwitch, boolean z) {
        reactSwitch.setOnCheckedChangeListener(null);
        reactSwitch.setOn(z);
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(ReactSwitch reactSwitch, Integer num) {
        if (num == null) {
            reactSwitch.getThumbDrawable().clearColorFilter();
        } else {
            reactSwitch.getThumbDrawable().setColorFilter(num.intValue(), Mode.MULTIPLY);
        }
    }

    @ReactProp(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(ReactSwitch reactSwitch, Integer num) {
        if (num == null) {
            reactSwitch.getTrackDrawable().clearColorFilter();
        } else {
            reactSwitch.getTrackDrawable().setColorFilter(num.intValue(), Mode.MULTIPLY);
        }
    }
}
