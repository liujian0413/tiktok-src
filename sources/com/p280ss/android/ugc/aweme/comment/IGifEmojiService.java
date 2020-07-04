package com.p280ss.android.ugc.aweme.comment;

import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.IGifEmojiService */
public interface IGifEmojiService {
    List<TextExtraStruct> getGifEmojiDetailTailSpan(Emoji emoji, int i, int i2);
}
