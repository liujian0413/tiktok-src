package com.facebook.react.flat;

import android.view.View;

public final class RCTRawTextManager extends VirtualViewManager<RCTRawText> {
    public final String getName() {
        return "RCTRawText";
    }

    public final Class<RCTRawText> getShadowNodeClass() {
        return RCTRawText.class;
    }

    public final RCTRawText createShadowNodeInstance() {
        return new RCTRawText();
    }

    public final /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }
}
