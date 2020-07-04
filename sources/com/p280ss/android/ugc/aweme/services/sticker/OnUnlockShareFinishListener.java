package com.p280ss.android.ugc.aweme.services.sticker;

import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener */
public interface OnUnlockShareFinishListener {
    void onShareAppFailed();

    void onShareAppSucceed(Effect effect);

    void onVKShareSucceed(Effect effect);
}
