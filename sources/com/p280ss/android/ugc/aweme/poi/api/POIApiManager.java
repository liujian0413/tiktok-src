package com.p280ss.android.ugc.aweme.poi.api;

import android.os.Handler;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.model.C35126o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.POIApiManager */
public final class POIApiManager {

    /* renamed from: a */
    public static POIApi f91676a = ((POIApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(POIApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.POIApiManager$POIApi */
    public interface POIApi {
        @C7730f(mo20420a = "/aweme/v1/poi/search/")
        C18253l<C35126o> searchPoi(@C7744t(mo20436a = "keywords") String str, @C7744t(mo20436a = "longitude") String str2, @C7744t(mo20436a = "latitude") String str3, @C7744t(mo20436a = "search_type") int i, @C7744t(mo20436a = "page") int i2, @C7744t(mo20436a = "count") int i3, @C7744t(mo20436a = "get_current_loc") int i4, @C7744t(mo20436a = "candidate_loc") String str4);

        @C7730f(mo20420a = "/aweme/v1/poi/recommend/")
        C18253l<C35126o> speedRecommendPoi(@C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "city_code") int i, @C7744t(mo20436a = "top_ids") String str3);
    }

    /* renamed from: a */
    public static void m113161a(Handler handler, final String str, final String str2, final int i, final String str3) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return POIApiManager.f91676a.speedRecommendPoi(str, str2, i, str3).get();
                } catch (ExecutionException e) {
                    throw C22838j.m75277a(e);
                }
            }
        }, 2);
    }

    /* renamed from: a */
    public static C35126o m113160a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) throws Exception {
        try {
            return (C35126o) f91676a.searchPoi(str, str2, str3, i, i2, i3, i4, str4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }
}
