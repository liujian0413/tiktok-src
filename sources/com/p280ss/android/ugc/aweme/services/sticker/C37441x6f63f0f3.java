package com.p280ss.android.ugc.aweme.services.sticker;

import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40960g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40970n;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$$inlined$let$lambda$1 */
final class C37441x6f63f0f3 implements Runnable {
    final /* synthetic */ C40960g $it;
    final /* synthetic */ UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 this$0;

    C37441x6f63f0f3(C40960g gVar, UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 unLockStickerManagerServiceImpl$resolve2UnlockSticker$1) {
        this.$it = gVar;
        this.this$0 = unLockStickerManagerServiceImpl$resolve2UnlockSticker$1;
    }

    public final void run() {
        C40970n.m130841a(this.this$0.$effect.getEffectId());
        this.this$0.$onUnlockSucceed.invoke(Integer.valueOf(this.$it.f106473a));
    }
}
