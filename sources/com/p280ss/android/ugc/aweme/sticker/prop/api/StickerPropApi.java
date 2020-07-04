package com.p280ss.android.ugc.aweme.sticker.prop.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.sticker.prop.p1636a.C41855a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.StickerPropApi */
public interface StickerPropApi {
    @C7730f(mo20420a = "/aweme/v1/sticker/detail/")
    C18253l<NewFaceStickerListBean> getStickerDetail(@C7744t(mo20436a = "sticker_ids") String str);

    @C7730f(mo20420a = "/aweme/v1/sticker/aweme/")
    C18253l<C41855a> queryStickerAwemeList(@C7744t(mo20436a = "sticker_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i);
}
