package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.p280ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.n */
public final class C27997n {

    /* renamed from: a */
    public static final C27997n f73732a = new C27997n();

    private C27997n() {
    }

    /* renamed from: a */
    private static void m91596a(String str) {
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", "unboxing").mo59973a("creation_id", str).f60753a);
    }

    /* renamed from: a */
    public static final void m91597a(JSONObject jSONObject, WeakReference<Context> weakReference) {
        Context context;
        if (!C6399b.m19944t()) {
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            Activity a = C23487o.m77130a(context);
            if (!(a == null || jSONObject == null)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("item_id");
                    if (optString != null) {
                        String optString2 = jSONObject2.optString("user_id");
                        if (optString2 != null) {
                            String optString3 = jSONObject2.optString("title");
                            if (optString3 != null) {
                                String optString4 = jSONObject2.optString("promotion_id");
                                if (optString4 != null) {
                                    Context context2 = a;
                                    Object service = ServiceManager.get().getService(IAVService.class);
                                    C7573i.m23582a(service, "ServiceManager.get()\n   …e(IAVService::class.java)");
                                    Intent intent = new Intent(context2, ((IAVService) service).getRecordPermissionActivity());
                                    ShopOrderShareStructInfo shopOrderShareStructInfo = new ShopOrderShareStructInfo();
                                    shopOrderShareStructInfo.setTitle(optString3);
                                    ShopOrderShareStruct shopOrderShareStruct = new ShopOrderShareStruct();
                                    shopOrderShareStruct.setOriginItemId(optString);
                                    shopOrderShareStruct.setOriginUserId(optString2);
                                    shopOrderShareStruct.setPromotionId(optString4);
                                    shopOrderShareStructInfo.setShopOrderShareStruct(shopOrderShareStruct);
                                    String uuid = UUID.randomUUID().toString();
                                    C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
                                    C25006o b = C25006o.m82327b("");
                                    C7573i.m23582a((Object) b, "commercePublishModel");
                                    b.f65943f = shopOrderShareStructInfo;
                                    intent.putExtra("commerce_data_in_tools_line", C25006o.m82326a(b));
                                    intent.putExtra("shoot_way", "unboxing");
                                    intent.putExtra("creation_id", uuid);
                                    a.startActivity(intent);
                                    m91596a(uuid);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
