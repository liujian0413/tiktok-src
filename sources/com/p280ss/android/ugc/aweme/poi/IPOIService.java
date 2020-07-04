package com.p280ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.IPOIService */
public interface IPOIService {

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$ResultType */
    public enum ResultType {
        RESULT_DEFAULT,
        RESULT_MANUAL
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$a */
    public interface C35001a {
        /* renamed from: a */
        void mo83218a();

        /* renamed from: a */
        void mo83219a(ResultType resultType, PoiStruct poiStruct, String str);

        /* renamed from: b */
        void mo83220b();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$b */
    public interface C35002b {
        /* renamed from: a */
        void mo88688a(ResultType resultType, PoiStruct poiStruct, String str);
    }

    Dialog getPOISearchDialog(Activity activity, Bundle bundle, C35002b bVar);
}
