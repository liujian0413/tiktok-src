package com.facebook.react.views.drawer;

import android.os.Build.VERSION;
import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.view.View;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.drawer.events.DrawerClosedEvent;
import com.facebook.react.views.drawer.events.DrawerOpenedEvent;
import com.facebook.react.views.drawer.events.DrawerSlideEvent;
import com.facebook.react.views.drawer.events.DrawerStateChangedEvent;
import java.util.Map;

@ReactModule(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<ReactDrawerLayout> {

    public static class DrawerEventEmitter implements C1009c {
        private final DrawerLayout mDrawerLayout;
        private final EventDispatcher mEventDispatcher;

        public void onDrawerClosed(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerClosedEvent(this.mDrawerLayout.getId()));
        }

        public void onDrawerOpened(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerOpenedEvent(this.mDrawerLayout.getId()));
        }

        public void onDrawerStateChanged(int i) {
            this.mEventDispatcher.dispatchEvent(new DrawerStateChangedEvent(this.mDrawerLayout.getId(), i));
        }

        public DrawerEventEmitter(DrawerLayout drawerLayout, EventDispatcher eventDispatcher) {
            this.mDrawerLayout = drawerLayout;
            this.mEventDispatcher = eventDispatcher;
        }

        public void onDrawerSlide(View view, float f) {
            this.mEventDispatcher.dispatchEvent(new DrawerSlideEvent(this.mDrawerLayout.getId(), f));
        }
    }

    public String getName() {
        return "AndroidDrawerLayout";
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m41789of("openDrawer", Integer.valueOf(1), "closeDrawer", Integer.valueOf(2));
    }

    public Map getExportedViewConstants() {
        return MapBuilder.m41788of("DrawerPosition", MapBuilder.m41789of("Left", Integer.valueOf(8388611), "Right", Integer.valueOf(8388613)));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41791of("topDrawerSlide", MapBuilder.m41788of("registrationName", "onDrawerSlide"), "topDrawerOpened", MapBuilder.m41788of("registrationName", "onDrawerOpen"), "topDrawerClosed", MapBuilder.m41788of("registrationName", "onDrawerClose"), "topDrawerStateChanged", MapBuilder.m41788of("registrationName", "onDrawerStateChanged"));
    }

    /* access modifiers changed from: protected */
    public ReactDrawerLayout createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactDrawerLayout(themedReactContext);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactDrawerLayout reactDrawerLayout) {
        reactDrawerLayout.setDrawerListener(new DrawerEventEmitter(reactDrawerLayout, ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @ReactProp(defaultFloat = Float.NaN, name = "drawerWidth")
    public void getDrawerWidth(ReactDrawerLayout reactDrawerLayout, float f) {
        int i;
        if (Float.isNaN(f)) {
            i = -1;
        } else {
            i = Math.round(PixelUtil.toPixelFromDIP(f));
        }
        reactDrawerLayout.setDrawerWidth(i);
    }

    @ReactProp(name = "drawerLockMode")
    public void setDrawerLockMode(ReactDrawerLayout reactDrawerLayout, String str) {
        if (str == null || "unlocked".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(0);
        } else if ("locked-closed".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(1);
        } else if ("locked-open".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(2);
        } else {
            StringBuilder sb = new StringBuilder("Unknown drawerLockMode ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    @ReactProp(defaultInt = 8388611, name = "drawerPosition")
    public void setDrawerPosition(ReactDrawerLayout reactDrawerLayout, int i) {
        if (8388611 == i || 8388613 == i) {
            reactDrawerLayout.setDrawerPosition(i);
            return;
        }
        StringBuilder sb = new StringBuilder("Unknown drawerPosition ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    public void setElevation(ReactDrawerLayout reactDrawerLayout, float f) {
        if (VERSION.SDK_INT >= 21) {
            try {
                ReactDrawerLayout.class.getMethod("setDrawerElevation", new Class[]{Float.TYPE}).invoke(reactDrawerLayout, new Object[]{Float.valueOf(PixelUtil.toPixelFromDIP(f))});
            } catch (Exception e) {
                C13286a.m38854b("ReactNative", "setDrawerElevation is not available in this version of the support lib.", (Throwable) e);
            }
        }
    }

    public void receiveCommand(ReactDrawerLayout reactDrawerLayout, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                reactDrawerLayout.openDrawer();
                return;
            case 2:
                reactDrawerLayout.closeDrawer();
                break;
        }
    }

    public void addView(ReactDrawerLayout reactDrawerLayout, View view, int i) {
        if (getChildCount(reactDrawerLayout) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        } else if (i == 0 || i == 1) {
            reactDrawerLayout.addView(view, i);
            reactDrawerLayout.setDrawerProperties();
        } else {
            StringBuilder sb = new StringBuilder("The only valid indices for drawer's child are 0 or 1. Got ");
            sb.append(i);
            sb.append(" instead.");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }
}
