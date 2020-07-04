package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.LinearLayoutManager;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40885h.C40886a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.model.EmptyStickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.model.LoadingStickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.d */
public final class C40881d {

    /* renamed from: a */
    public static final C40881d f106311a = new C40881d();

    private C40881d() {
    }

    /* renamed from: a */
    public static void m130624a() {
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        Resources resources = b.getResources();
        C7573i.m23582a((Object) resources, "CameraClient.getApplication().resources");
        C40886a.m130658a(200.0f / ((float) resources.getDisplayMetrics().densityDpi));
    }

    /* renamed from: b */
    public static EmptyStickerWrapper m130628b(String str) {
        C7573i.m23587b(str, "tips");
        EmptyStickerWrapper emptyStickerWrapper = new EmptyStickerWrapper(str);
        Effect effect = new Effect();
        effect.setId("");
        effect.setEffectId("");
        emptyStickerWrapper.f104908a = effect;
        return emptyStickerWrapper;
    }

    /* renamed from: a */
    public static boolean m130625a(Context context) {
        C7573i.m23587b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "mActivity");
        if (C39804em.m127429a(applicationContext, C39804em.f103457a) >= applicationContext.getResources().getDimensionPixelSize(R.dimen.cp)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m130626a(String str) {
        C7573i.m23587b(str, "panel");
        if (!C7573i.m23585a((Object) "default", (Object) str) || !C6399b.m19944t() || !C35574k.m114859a().mo70096k().mo93305a(Property.StudioEffectNewTabUi)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m130627a(List<? extends StickerWrapper> list, int i) {
        StickerWrapper stickerWrapper;
        if (list != null) {
            stickerWrapper = (StickerWrapper) list.get(i);
        } else {
            stickerWrapper = null;
        }
        return stickerWrapper instanceof EmptyStickerWrapper;
    }

    /* renamed from: b */
    public static boolean m130629b(List<? extends StickerWrapper> list, int i) {
        StickerWrapper stickerWrapper;
        if (list != null) {
            stickerWrapper = (StickerWrapper) list.get(i);
        } else {
            stickerWrapper = null;
        }
        return stickerWrapper instanceof LoadingStickerWrapper;
    }

    /* renamed from: a */
    public static final int m130623a(NewPanelStickerAdapter newPanelStickerAdapter, LinearLayoutManager linearLayoutManager) {
        StickerWrapper stickerWrapper;
        if (linearLayoutManager == null || newPanelStickerAdapter == null) {
            return -1;
        }
        int j = linearLayoutManager.mo5445j();
        int l = linearLayoutManager.mo5447l();
        if (j <= l) {
            while (true) {
                List a = newPanelStickerAdapter.mo62312a();
                if (a != null) {
                    stickerWrapper = (StickerWrapper) a.get(j);
                } else {
                    stickerWrapper = null;
                }
                if (!StickerWrapper.m129072a(stickerWrapper)) {
                    if (j == l) {
                        break;
                    }
                    j++;
                } else {
                    return j;
                }
            }
        }
        return -1;
    }
}
