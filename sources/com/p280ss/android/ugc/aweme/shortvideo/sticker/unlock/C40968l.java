package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import com.p280ss.android.ugc.aweme.port.p1479in.C35558as;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.l */
public final class C40968l implements C35558as {
    /* renamed from: a */
    public final String mo90373a() {
        String a = C40961h.m130825a();
        C7573i.m23582a((Object) a, "UnlockStickerOperationHelper.getShotFrom()");
        return a;
    }

    /* renamed from: a */
    public final void mo90374a(Context context) {
        C7573i.m23587b(context, "context");
        C40961h.m130826a(context);
    }

    /* renamed from: a */
    public final void mo90375a(Context context, String str, Effect effect) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "from");
        C40961h.m130827a(context, str, effect);
    }

    /* renamed from: a */
    public final C41847c mo90372a(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        C7573i.m23587b(str, "shotFrom");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(onUnlockShareFinishListener, "listener");
        C40962i iVar = new C40962i(str, context, effect, onUnlockShareFinishListener, true, z2);
        return iVar;
    }
}
