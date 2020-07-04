package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.model.Address;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiRouteActivity;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMapMethod */
public final class OpenMapMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27907a f73518a = new C27907a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMapMethod$a */
    public static final class C27907a {
        private C27907a() {
        }

        public /* synthetic */ C27907a(C7571f fVar) {
            this();
        }
    }

    public OpenMapMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private final Context m91425c() {
        if (this.f73443f != null) {
            return (Context) this.f73443f.get();
        }
        return null;
    }

    public OpenMapMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static Address m91424a(String str, String str2) {
        Address address = new Address();
        address.setCityCode(str);
        address.setSimpleAddr(str2);
        return address;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        boolean z;
        if (jSONObject != null) {
            if (!jSONObject.has("lat") || !jSONObject.has("lon")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("name");
                String optString2 = jSONObject.optString("address");
                String optString3 = jSONObject.optString("lat");
                String optString4 = jSONObject.optString("lon");
                String optString5 = jSONObject.optString("city_code");
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.poiName = optString;
                poiStruct.address = m91424a(optString5, optString2);
                poiStruct.poiLatitude = optString3;
                poiStruct.poiLongitude = optString4;
                PoiRouteActivity.m113823a(m91425c(), poiStruct, "", "", true, 0);
            }
        }
    }

    private /* synthetic */ OpenMapMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
