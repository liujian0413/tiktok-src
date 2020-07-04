package com.p280ss.android.ugc.aweme.comment.repo;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.comment.api.GifEmojiApi.C24082a;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p280ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p280ss.android.ugc.aweme.comment.model.StickerBean;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.comment.repo.b */
final class C24213b extends C11789a<C24215d, List<? extends GifEmoji>, C24215d, GifEmojiResponse> {
    /* renamed from: a */
    private static C24215d m79539a(C24215d dVar) {
        C7573i.m23587b(dVar, "req");
        return dVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m79539a((C24215d) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C7492s mo29350a(Object obj) {
        return m79541b((C24215d) obj);
    }

    /* renamed from: b */
    private static C7492s<GifEmojiResponse> m79541b(C24215d dVar) {
        C7573i.m23587b(dVar, "req");
        C7492s<GifEmojiResponse> b = C24082a.m79018a().searchGifEmoji(dVar.f63929a, dVar.f63930b, "comment").mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "GifEmojiApi.instance.sea…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    private static List<GifEmoji> m79540a(C24215d dVar, GifEmojiResponse gifEmojiResponse) {
        C7573i.m23587b(dVar, "req");
        C7573i.m23587b(gifEmojiResponse, "resp");
        StickerBean stickers = gifEmojiResponse.getStickers();
        if (stickers != null) {
            List<GifEmoji> stickerList = stickers.getStickerList();
            if (stickerList != null) {
                return stickerList;
            }
        }
        return C7525m.m23461a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m79540a((C24215d) obj, (GifEmojiResponse) obj2);
    }
}
