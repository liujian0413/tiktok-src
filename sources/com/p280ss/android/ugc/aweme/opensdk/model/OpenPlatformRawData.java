package com.p280ss.android.ugc.aweme.opensdk.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData */
public final class OpenPlatformRawData implements Serializable {
    @C6593c(mo15949a = "anchor")
    private final AnchorInfo anchor;
    @C6593c(mo15949a = "base")
    private final BaseInfo base;
    @C6593c(mo15949a = "label")
    private final LabelInfo label;
    @C6593c(mo15949a = "share")
    private final Share share;

    public final AnchorInfo getAnchor() {
        return this.anchor;
    }

    public final BaseInfo getBase() {
        return this.base;
    }

    public final LabelInfo getLabel() {
        return this.label;
    }

    public final Share getShare() {
        return this.share;
    }
}
