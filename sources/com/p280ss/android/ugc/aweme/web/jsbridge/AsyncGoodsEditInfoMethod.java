package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39322a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod */
public class AsyncGoodsEditInfoMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        C42961az.m136380a(new C39322a(new BusinessGoodsPublishModel(jSONObject.getString("draftId"), jSONObject.getString("title"))));
    }
}
