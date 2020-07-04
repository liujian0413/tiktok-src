package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.IGifEmojiService;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.c */
public final class C29368c {
    /* renamed from: a */
    public static final List<TextExtraStruct> m96459a(Aweme aweme) {
        int i;
        int i2;
        long j;
        boolean z;
        boolean z2;
        C7573i.m23587b(aweme, "$this$compatTextExtra");
        List<TextExtraStruct> arrayList = new ArrayList<>();
        List textExtra = aweme.getTextExtra();
        if (textExtra != null) {
            for (Object next : textExtra) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) next;
                C7573i.m23582a((Object) textExtraStruct, "it");
                if (textExtraStruct.getType() != 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
        }
        List textExtra2 = aweme.getTextExtra();
        if (textExtra2 != null) {
            Iterable iterable = textExtra2;
            Collection arrayList2 = new ArrayList();
            for (Object next2 : iterable) {
                TextExtraStruct textExtraStruct2 = (TextExtraStruct) next2;
                C7573i.m23582a((Object) textExtraStruct2, "it");
                if (textExtraStruct2.getType() == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            for (TextExtraStruct textExtraStruct3 : (List) arrayList2) {
                IGifEmojiService iGifEmojiService = (IGifEmojiService) ServiceManager.get().getService(IGifEmojiService.class);
                Emoji emoji = new Emoji();
                C7573i.m23582a((Object) textExtraStruct3, "it");
                UrlModel stickerUrl = textExtraStruct3.getStickerUrl();
                if (stickerUrl == null) {
                    stickerUrl = new UrlModel();
                }
                emoji.setAnimateUrl(stickerUrl);
                UrlModel stickerUrl2 = textExtraStruct3.getStickerUrl();
                if (stickerUrl2 == null) {
                    stickerUrl2 = new UrlModel();
                }
                emoji.setStaticUrl(stickerUrl2);
                UrlModel stickerUrl3 = textExtraStruct3.getStickerUrl();
                if (stickerUrl3 != null) {
                    i = stickerUrl3.getWidth();
                } else {
                    i = 0;
                }
                emoji.setWidth(i);
                UrlModel stickerUrl4 = textExtraStruct3.getStickerUrl();
                if (stickerUrl4 != null) {
                    i2 = stickerUrl4.getHeight();
                } else {
                    i2 = 0;
                }
                emoji.setHeight(i2);
                String stickerId = textExtraStruct3.getStickerId();
                if (stickerId != null) {
                    Long e = C7634n.m23707e(stickerId);
                    if (e != null) {
                        j = e.longValue();
                        emoji.setId(j);
                        emoji.setStickerType(textExtraStruct3.getStickerSource());
                        emoji.setAnimateType("gif");
                        arrayList.addAll(iGifEmojiService.getGifEmojiDetailTailSpan(emoji, textExtraStruct3.getStart(), textExtraStruct3.getEnd()));
                    }
                }
                j = 0;
                emoji.setId(j);
                emoji.setStickerType(textExtraStruct3.getStickerSource());
                emoji.setAnimateType("gif");
                arrayList.addAll(iGifEmojiService.getGifEmojiDetailTailSpan(emoji, textExtraStruct3.getStart(), textExtraStruct3.getEnd()));
            }
        }
        return arrayList;
    }
}
