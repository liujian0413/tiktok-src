package com.p280ss.android.ugc.aweme.effectplatform;

import com.p280ss.android.ugc.aweme.filter.C29324o;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.d */
public final class C27480d {
    /* renamed from: a */
    public static final FilterEffect m90098a(C29324o oVar) {
        C7573i.m23587b(oVar, "$this$toEffect");
        FilterEffect filterEffect = new FilterEffect();
        filterEffect.setName(oVar.f77267b);
        oVar.f77268c = oVar.f77268c;
        filterEffect.setEffectId(String.valueOf(oVar.f77266a));
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C7525m.m23457a(oVar.f77271f.toString()));
        filterEffect.setIconUrl(urlModel);
        UrlModel urlModel2 = new UrlModel();
        ToolsUrlModel toolsUrlModel = oVar.f77269d;
        C7573i.m23582a((Object) toolsUrlModel, "filterBean.resource");
        urlModel2.setUri(toolsUrlModel.f109646a);
        ToolsUrlModel toolsUrlModel2 = oVar.f77269d;
        C7573i.m23582a((Object) toolsUrlModel2, "filterBean.resource");
        urlModel2.setUrlList(toolsUrlModel2.f109647b);
        filterEffect.setFileUrl(urlModel2);
        filterEffect.setTags(oVar.mo74976a());
        filterEffect.setChecked(oVar.f77317l);
        filterEffect.setBuildIn(oVar.f77318m);
        return filterEffect;
    }
}
