package com.facebook.react.flat;

import android.view.View;

public final class RCTTextInlineImageManager extends VirtualViewManager<RCTTextInlineImage> {
    public final String getName() {
        return "RCTTextInlineImage";
    }

    public final Class<RCTTextInlineImage> getShadowNodeClass() {
        return RCTTextInlineImage.class;
    }

    public final RCTTextInlineImage createShadowNodeInstance() {
        return new RCTTextInlineImage();
    }

    public final /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }
}
