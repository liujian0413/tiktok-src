package com.p280ss.android.ugc.aweme.comment.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.GifEmojiResponse */
public final class GifEmojiResponse implements Serializable {
    @C6593c(mo15949a = "log_pb")
    private LogPbBean logPb;
    @C6593c(mo15949a = "emoticon_data")
    private StickerBean stickers;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final StickerBean getStickers() {
        return this.stickers;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(StickerBean stickerBean) {
        this.stickers = stickerBean;
    }
}
