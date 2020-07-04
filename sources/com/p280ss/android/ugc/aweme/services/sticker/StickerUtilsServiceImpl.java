package com.p280ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl */
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    public final boolean isCommerceLockSticker(Effect effect) {
        return C40496bh.m129465j(effect);
    }

    public final boolean isLockSticker(Effect effect) {
        return C40496bh.m129464i(effect);
    }

    public final boolean hasUnlocked(Effect effect) {
        C7573i.m23587b(effect, "effect");
        return C40496bh.m129471p(effect);
    }

    public final boolean isLockCommerceFaceSticker(NewFaceStickerBean newFaceStickerBean) {
        C7573i.m23587b(newFaceStickerBean, "newFaceStickerBean");
        return C40496bh.m129445b(newFaceStickerBean);
    }

    public final boolean isLockFaceSticker(NewFaceStickerBean newFaceStickerBean) {
        C7573i.m23587b(newFaceStickerBean, "newFaceStickerBean");
        return C40496bh.m129439a(newFaceStickerBean);
    }

    public final boolean isStickerPreviewable(Effect effect) {
        C7573i.m23587b(effect, "effect");
        return C40496bh.m129467l(effect);
    }

    public final boolean showCommerceStickerDialog(Context context, NewFaceStickerBean newFaceStickerBean, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "enterFrom");
        return C40496bh.m129436a(context, newFaceStickerBean, str);
    }
}
