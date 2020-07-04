package com.p280ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService */
public interface IStickerUtilsService {
    boolean hasUnlocked(Effect effect);

    boolean isCommerceLockSticker(Effect effect);

    boolean isLockCommerceFaceSticker(NewFaceStickerBean newFaceStickerBean);

    boolean isLockFaceSticker(NewFaceStickerBean newFaceStickerBean);

    boolean isLockSticker(Effect effect);

    boolean isStickerPreviewable(Effect effect);

    boolean showCommerceStickerDialog(Context context, NewFaceStickerBean newFaceStickerBean, String str);
}
