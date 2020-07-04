package com.facebook.react.uimanager;

import android.widget.ImageView.ScaleType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import java.util.HashMap;
import java.util.Map;

class UIManagerModuleConstants {
    UIManagerModuleConstants() {
    }

    static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put("topChange", MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onChange", "captured", "onChangeCapture"))).put("topSelect", MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.START.getJSEventName(), MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.MOVE.getJSEventName(), MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.END.getJSEventName(), MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.CANCEL.getJSEventName(), MapBuilder.m41788of("phasedRegistrationNames", MapBuilder.m41789of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.m41788of("ContentMode", MapBuilder.m41790of("ScaleAspectFit", Integer.valueOf(ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.m41788of("PointerEventsValues", MapBuilder.m41791of("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        newHashMap.put("PopupMenu", MapBuilder.m41789of("dismissed", "dismissed", "itemSelected", "itemSelected"));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.m41789of("typeWindowStateChanged", Integer.valueOf(32), "typeViewClicked", Integer.valueOf(1)));
        return newHashMap;
    }

    static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.m41788of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m41788of("registrationName", "onLayout")).put("topLoadingError", MapBuilder.m41788of("registrationName", "onLoadingError")).put("topLoadingFinish", MapBuilder.m41788of("registrationName", "onLoadingFinish")).put("topLoadingStart", MapBuilder.m41788of("registrationName", "onLoadingStart")).put("topSelectionChange", MapBuilder.m41788of("registrationName", "onSelectionChange")).put("topMessage", MapBuilder.m41788of("registrationName", "onMessage")).put("topScrollBeginDrag", MapBuilder.m41788of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m41788of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m41788of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m41788of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m41788of("registrationName", "onMomentumScrollEnd")).build();
    }
}
