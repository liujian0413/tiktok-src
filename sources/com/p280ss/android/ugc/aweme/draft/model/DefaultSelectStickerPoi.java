package com.p280ss.android.ugc.aweme.draft.model;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi */
public final class DefaultSelectStickerPoi implements Serializable {
    private boolean isCancelSelect;
    private final StickerPoi stickerPoi;

    public final StickerPoi getStickerPoi() {
        return this.stickerPoi;
    }

    public final boolean isCancelSelect() {
        return this.isCancelSelect;
    }

    public final void setCancelSelect(boolean z) {
        this.isCancelSelect = z;
    }

    public DefaultSelectStickerPoi(StickerPoi stickerPoi2) {
        C7573i.m23587b(stickerPoi2, "stickerPoi");
        this.stickerPoi = stickerPoi2;
    }
}
