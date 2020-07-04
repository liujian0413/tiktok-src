package com.p280ss.android.ugc.aweme.services.sticker;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.LockStickerTextBean;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService */
public interface IUnLockStickerManagerService {
    void addUnlockedStickerId(String str);

    void clearUnlockedStickerIds();

    LockStickerTextBean getDefaultTextBean();

    LockStickerTextBean getShareString(Effect effect);

    LockStickerTextBean getTextBeanForActivity(Effect effect);

    ArrayList<String> getUnlockedStickerIds();

    boolean getUpdateState();

    void resolve2UnlockSticker(Effect effect, C7562b<? super Integer, C7581n> bVar, C7561a<C7581n> aVar);

    void updateLockStickerTextBeans(List<? extends LockStickerTextBean> list);

    void updateUnlockedIdsFromNet(C25678f fVar);

    void updateUnlockedStickerIdList(List<String> list);
}
