package com.facebook.react.flat;

import android.view.View;

public final class RCTVirtualTextManager extends VirtualViewManager<RCTVirtualText> {
    public final String getName() {
        return "RCTVirtualText";
    }

    public final Class<RCTVirtualText> getShadowNodeClass() {
        return RCTVirtualText.class;
    }

    public final RCTVirtualText createShadowNodeInstance() {
        return new RCTVirtualText();
    }

    public final /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }
}
