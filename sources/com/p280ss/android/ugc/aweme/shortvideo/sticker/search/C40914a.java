package com.p280ss.android.ugc.aweme.shortvideo.sticker.search;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.a */
public final class C40914a {

    /* renamed from: a */
    private final EffectPlatform f106398a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.a$a */
    public static final class C40915a implements C43769s {

        /* renamed from: a */
        final /* synthetic */ C0052o f106399a;

        C40915a(C0052o oVar) {
            this.f106399a = oVar;
        }

        /* renamed from: a */
        public final void mo70694a(C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            this.f106399a.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
        }

        /* renamed from: a */
        public final void mo70695a(SearchEffectResponse searchEffectResponse) {
            C7573i.m23587b(searchEffectResponse, "response");
            this.f106399a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, searchEffectResponse));
        }
    }

    public C40914a(EffectPlatform effectPlatform) {
        C7573i.m23587b(effectPlatform, "effectPlatform");
        this.f106398a = effectPlatform;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<SearchEffectResponse>> mo101200a(String str, String str2, int i, int i2, Map<String, String> map) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(str2, POIService.KEY_KEYWORD);
        C0052o oVar = new C0052o();
        oVar.setValue(LiveDataWrapper.m109596a(STATUS.LOADING, null));
        this.f106398a.mo70628a(str, str2, 0, 0, null, (C43769s) new C40915a(oVar));
        return oVar;
    }
}
