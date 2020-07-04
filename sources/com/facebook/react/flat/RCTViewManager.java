package com.facebook.react.flat;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactDrawableHelper;
import java.util.Map;

public final class RCTViewManager extends FlatViewManager {
    private static final int[] TMP_INT_ARRAY = new int[2];

    public final String getName() {
        return "RCTView";
    }

    public final Class<RCTView> getShadowNodeClass() {
        return RCTView.class;
    }

    public final RCTView createShadowNodeInstance() {
        return new RCTView();
    }

    public final Map<String, Integer> getCommandsMap() {
        return MapBuilder.m41789of("hotspotUpdate", Integer.valueOf(1), "setPressed", Integer.valueOf(2));
    }

    public final /* bridge */ /* synthetic */ void removeAllViews(FlatViewGroup flatViewGroup) {
        super.removeAllViews(flatViewGroup);
    }

    private static PointerEvents parsePointerEvents(String str) {
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2089141766) {
                if (hashCode != -2089112978) {
                    if (hashCode != 3005871) {
                        if (hashCode == 3387192 && str.equals("none")) {
                            c = 0;
                        }
                    } else if (str.equals("auto")) {
                        c = 1;
                    }
                } else if (str.equals("box-only")) {
                    c = 3;
                }
            } else if (str.equals("box-none")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    return PointerEvents.NONE;
                case 1:
                    return PointerEvents.AUTO;
                case 2:
                    return PointerEvents.BOX_NONE;
                case 3:
                    return PointerEvents.BOX_ONLY;
            }
        }
        return PointerEvents.AUTO;
    }

    public final /* bridge */ /* synthetic */ void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
        super.setBackgroundColor(flatViewGroup, i);
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public final void setNeedsOffscreenAlphaCompositing(FlatViewGroup flatViewGroup, boolean z) {
        flatViewGroup.setNeedsOffscreenAlphaCompositing(z);
    }

    @ReactProp(name = "removeClippedSubviews")
    public final void setRemoveClippedSubviews(FlatViewGroup flatViewGroup, boolean z) {
        flatViewGroup.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "pointerEvents")
    public final void setPointerEvents(FlatViewGroup flatViewGroup, String str) {
        flatViewGroup.setPointerEvents(parsePointerEvents(str));
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public final void setHotspot(FlatViewGroup flatViewGroup, ReadableMap readableMap) {
        Drawable drawable;
        if (readableMap == null) {
            drawable = null;
        } else {
            drawable = ReactDrawableHelper.createDrawableFromJSDescription(flatViewGroup.getContext(), readableMap);
        }
        flatViewGroup.setHotspot(drawable);
    }

    @ReactProp(name = "hitSlop")
    public final void setHitSlop(FlatViewGroup flatViewGroup, ReadableMap readableMap) {
        if (readableMap == null) {
            flatViewGroup.setHitSlopRect(null);
        } else {
            flatViewGroup.setHitSlopRect(new Rect((int) PixelUtil.toPixelFromDIP(readableMap.getDouble("left")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("top")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("right")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("bottom"))));
        }
    }

    public final void receiveCommand(FlatViewGroup flatViewGroup, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                if (readableArray == null || readableArray.size() != 2) {
                    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
                } else if (VERSION.SDK_INT >= 21) {
                    flatViewGroup.getLocationOnScreen(TMP_INT_ARRAY);
                    flatViewGroup.drawableHotspotChanged(PixelUtil.toPixelFromDIP(readableArray.getDouble(0)) - ((float) TMP_INT_ARRAY[0]), PixelUtil.toPixelFromDIP(readableArray.getDouble(1)) - ((float) TMP_INT_ARRAY[1]));
                    return;
                }
                break;
            case 2:
                if (readableArray != null && readableArray.size() == 1) {
                    flatViewGroup.setPressed(readableArray.getBoolean(0));
                    break;
                } else {
                    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
                }
                break;
        }
    }
}
