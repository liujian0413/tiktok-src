package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h */
public final class C40961h {

    /* renamed from: a */
    private static String f106475a = "";

    /* renamed from: a */
    public static String m130825a() {
        return f106475a;
    }

    /* renamed from: a */
    public static void m130828a(String str) {
        f106475a = str;
    }

    /* renamed from: a */
    public static void m130826a(Context context) {
        C10761a.m31392b(context, (int) R.string.dxl, 1).mo25750a();
    }

    /* renamed from: a */
    public static void m130827a(Context context, String str, Effect effect) {
        String str2;
        IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
        LockStickerTextBean textBeanForActivity = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getTextBeanForActivity(effect);
        if (textBeanForActivity == null || textBeanForActivity.bubbleHint == null) {
            C10761a.m31384a(context, (int) R.string.e1o, 1).mo25750a();
        } else {
            C10761a.m31388a(context, textBeanForActivity.bubbleHint, 1).mo25750a();
        }
        String str3 = "sticker_unlocked_toast_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_method", str).mo59973a("prop_id", effect.getEffectId());
        String str4 = "is_visible";
        if (stickerUtilsService.isStickerPreviewable(effect)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
    }
}
