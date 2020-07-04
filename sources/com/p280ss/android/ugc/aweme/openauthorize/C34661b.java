package com.p280ss.android.ugc.aweme.openauthorize;

import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.b */
public final class C34661b {

    /* renamed from: a */
    public static final C34661b f90439a = new C34661b();

    private C34661b() {
    }

    /* renamed from: a */
    public static void m111955a(String str, C23328a aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(aVar, "callback");
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        C23323e.m76502a(urlModel, aVar);
    }
}
