package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ChooseArticleInfoMethod */
public class ChooseArticleInfoMethod extends BaseCommonJavaMethod {
    public ChooseArticleInfoMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        if (jSONObject == null) {
            aVar.mo71362a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("data");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo71362a(0, "no data in params");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("article_title");
        if (TextUtils.isEmpty(optString2)) {
            aVar.mo71362a(0, "no article_title in data");
        } else if (TextUtils.isEmpty(jSONObject2.optString("micro_app_id"))) {
            aVar.mo71362a(0, "no micro_app_id in data");
        } else {
            if (this.f73443f != null) {
                C42961az.m136380a(new C24522a(new AnchorTransData(AnchorBusinessType.ARTICLE.getTYPE(), optString, optString2)));
            }
            aVar.mo71363a((Object) Integer.valueOf(1));
        }
    }
}
