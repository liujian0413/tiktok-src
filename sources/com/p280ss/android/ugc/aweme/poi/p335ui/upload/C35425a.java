package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.api.PoiUploadImageApi;
import com.p280ss.android.ugc.aweme.poi.model.C35125n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a */
public final class C35425a extends C25640a<C35125n> {
    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        String str = objArr[0];
        if (str != null) {
            String str2 = str;
            String str3 = objArr[1];
            if (str3 != null) {
                String str4 = str3;
                String str5 = objArr[2];
                if (str5 != null) {
                    PoiUploadImageApi.m113169a(str2, str4, str5).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
