package com.p280ss.android.ugc.aweme.filter;

import android.net.Uri;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.effectplatform.C27470a;
import com.p280ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p280ss.android.ugc.aweme.utils.C43117fa;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.filter.p */
public final class C29325p {
    /* renamed from: a */
    public static final void m96173a(C7561a<C7581n> aVar) {
        C6726a.m20844b(new C29326q(aVar));
    }

    /* renamed from: a */
    public static final C29324o m96172a(FilterEffect filterEffect) {
        String str;
        C7573i.m23587b(filterEffect, "$this$toFilterBean");
        C29324o oVar = new C29324o();
        oVar.f77267b = filterEffect.getName();
        oVar.f77268c = C29341z.m96254a((Effect) filterEffect);
        oVar.f77266a = Integer.parseInt(filterEffect.getEffectId());
        UrlModel iconUrl = filterEffect.getIconUrl();
        C7573i.m23582a((Object) iconUrl, "filterEffect.iconUrl");
        List urlList = iconUrl.getUrlList();
        if (urlList != null) {
            str = (String) urlList.get(0);
        } else {
            str = null;
        }
        oVar.f77271f = Uri.parse(str);
        oVar.f77269d = C43117fa.m136744a(C27470a.m90049a(filterEffect.getFileUrl()));
        oVar.f77274i = filterEffect.getTags();
        oVar.f77317l = filterEffect.getChecked();
        oVar.f77318m = filterEffect.getBuildIn();
        C29296g gVar = oVar;
        if (C29341z.m96266c(gVar)) {
            oVar.mo74977a(C29341z.m96260b(gVar));
        }
        return oVar;
    }
}
