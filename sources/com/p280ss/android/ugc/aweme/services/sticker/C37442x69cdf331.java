package com.p280ss.android.ugc.aweme.services.sticker;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onFailure$1 */
final class C37442x69cdf331 implements Runnable {
    final /* synthetic */ UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 this$0;

    C37442x69cdf331(UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 unLockStickerManagerServiceImpl$resolve2UnlockSticker$1) {
        this.this$0 = unLockStickerManagerServiceImpl$resolve2UnlockSticker$1;
    }

    public final void run() {
        this.this$0.$onUnlockFailed.invoke();
    }
}
