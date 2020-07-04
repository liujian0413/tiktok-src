package com.p280ss.android.ugc.aweme.comment.adapter;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.GifEmojiDiffer */
public final class GifEmojiDiffer extends C1147c<GifEmoji> {
    /* renamed from: b */
    private static boolean m78989b(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        C7573i.m23587b(gifEmoji, "p0");
        C7573i.m23587b(gifEmoji2, "p1");
        return C7573i.m23585a((Object) gifEmoji, (Object) gifEmoji2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m78988a((GifEmoji) obj, (GifEmoji) obj2);
    }

    /* renamed from: a */
    private static boolean m78988a(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        C7573i.m23587b(gifEmoji, "p0");
        C7573i.m23587b(gifEmoji2, "p1");
        return C7573i.m23585a((Object) gifEmoji.getId(), (Object) gifEmoji2.getId());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m78989b((GifEmoji) obj, (GifEmoji) obj2);
    }
}
