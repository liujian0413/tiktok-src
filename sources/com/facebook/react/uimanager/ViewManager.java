package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import java.util.Map;

public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, T t) {
    }

    /* access modifiers changed from: protected */
    public abstract T createViewInstance(ThemedReactContext themedReactContext);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public abstract Class<? extends C> getShadowNodeClass();

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public Map<String, String> getNativeProps() {
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public final void updateProperties(T t, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, t, reactStylesDiffMap);
        onAfterUpdateTransaction(t);
    }

    public final T createView(ThemedReactContext themedReactContext, JSResponderHandler jSResponderHandler) {
        T createViewInstance = createViewInstance(themedReactContext);
        addEventEmitters(themedReactContext, createViewInstance);
        if (createViewInstance instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) createViewInstance).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return createViewInstance;
    }
}
