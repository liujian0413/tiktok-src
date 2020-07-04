package com.p280ss.android.ugc.aweme.comment;

import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.GifEmojiServiceImpl */
public final class GifEmojiServiceImpl implements IGifEmojiService {
    public final List<TextExtraStruct> getGifEmojiDetailTailSpan(Emoji emoji, int i, int i2) {
        C7573i.m23587b(emoji, "emoji");
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setStart(i);
        textExtraStruct.setEnd(i2);
        textExtraStruct.setCustomSpan(new C24207q());
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setStart(i);
        textExtraStruct2.setEnd(i2);
        textExtraStruct2.setCustomSpan(new C24209r(emoji));
        return C7525m.m23464b((T[]) new TextExtraStruct[]{textExtraStruct, textExtraStruct2});
    }
}
