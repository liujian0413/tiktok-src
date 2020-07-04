package com.p280ss.android.ugc.aweme.poi.services;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.poi.IPOIService;
import com.p280ss.android.ugc.aweme.poi.IPOIService.C35002b;
import com.p280ss.android.ugc.aweme.poi.IPOIService.ResultType;
import com.p280ss.android.ugc.aweme.poi.event.C35079b;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.poi.search.POISearchDialog;

/* renamed from: com.ss.android.ugc.aweme.poi.services.POIService */
public class POIService implements IPOIService {
    public static final String INVALID_ID = "NULL";
    public static final String KEY_KEYWORD = "keyword";
    public static final String KEY_LOGPB = "logpb";
    public static final String KEY_ORDER = "order";

    public PoiStruct poiContext2PoiStruct(String str) {
        PoiContext unserializeFromJson = PoiContext.unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.poiId = unserializeFromJson.mSelectPoiId;
        poiStruct.poiName = unserializeFromJson.mSelectPoiName;
        return poiStruct;
    }

    public String poiStruct2PoiContext(PoiStruct poiStruct) {
        PoiContext poiContext = new PoiContext();
        poiContext.mSelectPoiId = poiStruct.poiId;
        poiContext.mSelectPoiName = poiStruct.poiName;
        return C10944e.m32113a().mo15979b((Object) poiContext);
    }

    public Dialog getPOISearchDialog(Activity activity, Bundle bundle, C35002b bVar) {
        POISearchDialog pOISearchDialog = new POISearchDialog(activity, bundle);
        pOISearchDialog.setOwnerActivity(activity);
        pOISearchDialog.f92241a = new C35245a(bVar, pOISearchDialog);
        return pOISearchDialog;
    }

    static final /* synthetic */ void lambda$getPOISearchDialog$0$POIService(C35002b bVar, POISearchDialog pOISearchDialog, C35079b bVar2) {
        ResultType resultType;
        if (bVar2.f91738a == 2) {
            resultType = ResultType.RESULT_MANUAL;
        } else {
            resultType = ResultType.RESULT_DEFAULT;
        }
        if (bVar2.f91739b != null) {
            bVar.mo88688a(resultType, bVar2.f91739b, pOISearchDialog.mo89669b());
            return;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.setPoiId(INVALID_ID);
        bVar.mo88688a(resultType, poiStruct, pOISearchDialog.mo89669b());
    }
}
