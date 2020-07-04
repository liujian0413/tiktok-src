package com.p280ss.android.ugc.aweme.services.sticker;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40967k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40970n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.LockStickerTextBean;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockStickerApi;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl */
public final class UnLockStickerManagerServiceImpl implements IUnLockStickerManagerService {
    public final void clearUnlockedStickerIds() {
        C40970n.m130846c();
    }

    public final boolean getUpdateState() {
        return C40970n.m130845b();
    }

    public final LockStickerTextBean getDefaultTextBean() {
        LockStickerTextBean d = C40970n.m130847d();
        C7573i.m23582a((Object) d, "UnlockedStickersManager.getDefaultTextBean()");
        return d;
    }

    public final ArrayList<String> getUnlockedStickerIds() {
        ArrayList<String> a = C40970n.m130840a();
        C7573i.m23582a((Object) a, "UnlockedStickersManager.getUnlockedStickerIds()");
        return a;
    }

    public final void addUnlockedStickerId(String str) {
        C40970n.m130841a(str);
    }

    public final void updateLockStickerTextBeans(List<? extends LockStickerTextBean> list) {
        C40970n.m130844b(list);
    }

    public final void updateUnlockedStickerIdList(List<String> list) {
        C40970n.m130842a(list);
    }

    public final LockStickerTextBean getShareString(Effect effect) {
        return C40970n.m130839a(effect);
    }

    public final LockStickerTextBean getTextBeanForActivity(Effect effect) {
        C7573i.m23587b(effect, "effect");
        return C40970n.m130843b(C40496bh.m129468m(effect));
    }

    public final void updateUnlockedIdsFromNet(C25678f fVar) {
        if (C6399b.m19944t() && fVar != null) {
            fVar.mo56977b();
        }
    }

    public final void resolve2UnlockSticker(Effect effect, C7562b<? super Integer, C7581n> bVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(effect, "effect");
        C7573i.m23587b(bVar, "onUnlockSucceed");
        C7573i.m23587b(aVar, "onUnlockFailed");
        C40967k kVar = new C40967k();
        kVar.f106495a = C40496bh.m129468m(effect);
        kVar.f106496b = C7525m.m23457a(effect.getEffectId());
        C18246h.m60213a(UnlockStickerApi.m130814a(C35563c.f93239b.mo15979b((Object) kVar)), new UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(effect, bVar, aVar));
    }
}
