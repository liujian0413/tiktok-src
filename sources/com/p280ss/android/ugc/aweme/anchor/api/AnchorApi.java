package com.p280ss.android.ugc.aweme.anchor.api;

import com.bytedance.ies.ugc.aweme.network.C10943d;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.anchor.api.p1009b.C22529a;
import com.p280ss.android.ugc.aweme.anchor.api.p1009b.C22530b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.anchor.api.AnchorApi */
public final class AnchorApi {

    /* renamed from: a */
    public static final AnchorApi f59998a = new AnchorApi();

    /* renamed from: b */
    private static final C10943d f59999b = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://aweme.snssdk.com").mo26430a();

    /* renamed from: com.ss.android.ugc.aweme.anchor.api.AnchorApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/anchor/search/")
        C18253l<C22529a> getAnchorSearchResponse(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "keyword") String str);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/anchor/selection/")
        C18253l<C22530b> getAnchorSelectionResponse(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "tab_id") int i2, @C7744t(mo20436a = "page") int i3, @C7744t(mo20436a = "page_size") int i4);
    }

    private AnchorApi() {
    }

    /* renamed from: a */
    public static C22529a m74493a(int i, String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        Object obj = ((RealApi) f59999b.mo26435a(RealApi.class)).getAnchorSearchResponse(10, str).get();
        C7573i.m23582a(obj, "RETROFIT\n               …d)\n                .get()");
        return (C22529a) obj;
    }

    /* renamed from: a */
    public static C22530b m74494a(int i, int i2, int i3, int i4) {
        Object obj = ((RealApi) f59999b.mo26435a(RealApi.class)).getAnchorSelectionResponse(i, 0, i3, 20).get();
        C7573i.m23582a(obj, "RETROFIT\n               …e)\n                .get()");
        return (C22530b) obj;
    }
}
