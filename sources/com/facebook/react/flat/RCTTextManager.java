package com.facebook.react.flat;

public final class RCTTextManager extends FlatViewManager {
    public final String getName() {
        return "RCTText";
    }

    public final Class<RCTText> getShadowNodeClass() {
        return RCTText.class;
    }

    public final RCTText createShadowNodeInstance() {
        return new RCTText();
    }

    public final /* bridge */ /* synthetic */ void removeAllViews(FlatViewGroup flatViewGroup) {
        super.removeAllViews(flatViewGroup);
    }

    public final /* bridge */ /* synthetic */ void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
        super.setBackgroundColor(flatViewGroup, i);
    }
}
