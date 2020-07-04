package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.GreetEmojiList */
public final class GreetEmojiList extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "stickers")
    private List<? extends Emoji> emojiList;

    public final List<Emoji> getEmojiList() {
        return this.emojiList;
    }

    public final void setEmojiList(List<? extends Emoji> list) {
        this.emojiList = list;
    }
}
