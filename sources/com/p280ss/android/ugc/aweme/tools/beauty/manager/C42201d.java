package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.d */
public final class C42201d {

    /* renamed from: a */
    public static final C42201d f109779a = new C42201d();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.d$a */
    public static final class C42202a implements C43757g {
        C42202a() {
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
        }
    }

    private C42201d() {
    }

    /* renamed from: a */
    public static void m134266a() {
        C42203e.m134269a((C43757g) new C42202a());
    }

    /* renamed from: a */
    public static View m134265a(Context context, BeautyCategory beautyCategory) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(beautyCategory, "beatyCategory");
        AVDmtTabItemView a = C42107a.m134028a(context);
        if (TextUtils.isEmpty(beautyCategory.getCategoryResponse().icon_normal_url)) {
            a.setText(beautyCategory.getCategoryResponse().name);
        } else {
            a.mo103523a(beautyCategory.getCategoryResponse().icon_normal_url, 0);
        }
        return a;
    }
}
