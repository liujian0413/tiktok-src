package com.p280ss.android.ugc.aweme.emoji.utils;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.C27599a;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1203a.C27505b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.C27629a;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.EmojiApi */
public interface EmojiApi {
    @C7739o(mo20429a = "im/resources/sticker/create/")
    C18253l<C27599a> addSelfEmoji(@C7744t(mo20436a = "hash") String str, @C7744t(mo20436a = "animate_uri") String str2, @C7744t(mo20436a = "static_uri") String str3, @C7744t(mo20436a = "animate_type") String str4, @C7744t(mo20436a = "static_type") String str5, @C7744t(mo20436a = "width") int i, @C7744t(mo20436a = "height") int i2);

    @C7739o(mo20429a = "im/resources/sticker/collect/")
    C1592h<C27599a> collectEmoji(@C7744t(mo20436a = "action") int i, @C7744t(mo20436a = "sticker_ids") String str);

    @C7739o(mo20429a = "im/resources/sticker/collect/")
    C1592h<C27599a> collectEmoji(@C7744t(mo20436a = "action") int i, @C7744t(mo20436a = "sticker_ids") String str, @C7744t(mo20436a = "sticker_uri") String str2, @C7744t(mo20436a = "sticker_url") String str3, @C7744t(mo20436a = "resource_id") long j, @C7744t(mo20436a = "sticker_type") int i2);

    @C7730f(mo20420a = "im/resources/")
    C18253l<ResourcesResponse> getResources(@C7744t(mo20436a = "resource_type") String str);

    @C7730f(mo20420a = "im/resources/sticker/list/")
    C1592h<EmojiResourcesResponse> getSelfEmojis();

    @C7730f(mo20420a = "im/resources/emoji/")
    C7492s<C27629a> getSmallEmojiResources();

    @C7730f(mo20420a = "im/resources/emoticon/trending/")
    C1592h<C27505b> getTrendingEmojis(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

    @C7739o(mo20429a = "im/resources/sticker/collect/")
    C7492s<C27599a> rxCollectEmoji(@C7744t(mo20436a = "action") int i, @C7744t(mo20436a = "sticker_ids") String str);

    @C7739o(mo20429a = "im/resources/sticker/collect/")
    C7492s<C27599a> rxCollectEmoji(@C7744t(mo20436a = "action") int i, @C7744t(mo20436a = "sticker_ids") String str, @C7744t(mo20436a = "sticker_uri") String str2, @C7744t(mo20436a = "sticker_url") String str3, @C7744t(mo20436a = "resource_id") long j, @C7744t(mo20436a = "sticker_type") int i2);
}
