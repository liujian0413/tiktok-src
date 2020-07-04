package com.p280ss.android.ugc.aweme.services.sticker;

import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40960g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 */
public final class UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 implements C18245g<C40960g> {
    final /* synthetic */ Effect $effect;
    final /* synthetic */ C7561a $onUnlockFailed;
    final /* synthetic */ C7562b $onUnlockSucceed;

    public final void onFailure(Throwable th) {
        C7573i.m23587b(th, "t");
        C6726a.m20844b(new C37442x69cdf331(this));
    }

    public final void onSuccess(C40960g gVar) {
        boolean z;
        if (gVar != null) {
            if (gVar.f106473a == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                gVar = null;
            }
            if (gVar != null) {
                C6726a.m20844b(new C37441x6f63f0f3(gVar, this));
            }
        }
    }

    UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(Effect effect, C7562b bVar, C7561a aVar) {
        this.$effect = effect;
        this.$onUnlockSucceed = bVar;
        this.$onUnlockFailed = aVar;
    }
}
