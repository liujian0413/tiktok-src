package com.p280ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39322a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod */
public final class AsyncGoodsEditInfoMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23568a f62173c = new C23568a(null);

    /* renamed from: d */
    private final String f62174d = "asyncGoodsEditInfo";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod$a */
    public static final class C23568a {
        private C23568a() {
        }

        public /* synthetic */ C23568a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62174d;
    }

    public AsyncGoodsEditInfoMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        C42961az.m136380a(new C39322a(new BusinessGoodsPublishModel(jSONObject.optString("draftId"), jSONObject.optString("title"))));
    }
}
