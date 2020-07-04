package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.C46366o;
import com.swmansion.gesturehandler.PointerEventsConfig;

/* renamed from: com.swmansion.gesturehandler.react.j */
public final class C46389j implements C46366o {
    /* renamed from: a */
    public final PointerEventsConfig mo115263a(View view) {
        PointerEvents pointerEvents;
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return PointerEventsConfig.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return PointerEventsConfig.NONE;
            }
        }
        switch (pointerEvents) {
            case BOX_ONLY:
                return PointerEventsConfig.BOX_ONLY;
            case BOX_NONE:
                return PointerEventsConfig.BOX_NONE;
            case NONE:
                return PointerEventsConfig.NONE;
            default:
                return PointerEventsConfig.AUTO;
        }
    }

    /* renamed from: a */
    public final View mo115262a(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof ReactViewGroup) {
            return viewGroup.getChildAt(((ReactViewGroup) viewGroup).getZIndexMappedChildIndex(i));
        }
        return viewGroup.getChildAt(i);
    }
}
