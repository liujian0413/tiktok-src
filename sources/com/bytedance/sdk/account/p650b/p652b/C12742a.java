package com.bytedance.sdk.account.p650b.p652b;

import android.os.Bundle;
import com.bytedance.sdk.account.p650b.p651a.C12740a;
import com.bytedance.sdk.account.p650b.p651a.C12741b;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b;

/* renamed from: com.bytedance.sdk.account.b.b.a */
public final class C12742a implements C12741b {
    /* renamed from: a */
    public final boolean mo31238a(int i, Bundle bundle, C12740a aVar) {
        if (bundle == null || aVar == null) {
            return false;
        }
        if (i == 1) {
            C12746a aVar2 = new C12746a(bundle);
            if (!aVar2.checkArgs()) {
                return false;
            }
            if (aVar2.f33741f != null) {
                aVar2.f33741f = aVar2.f33741f.replace(" ", "");
            }
            if (aVar2.f33743h != null) {
                aVar2.f33743h = aVar2.f33743h.replace(" ", "");
            }
            if (aVar2.f33742g != null) {
                aVar2.f33742g = aVar2.f33742g.replace(" ", "");
            }
            aVar.onReq(aVar2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C12747b bVar = new C12747b(bundle);
            if (!bVar.checkArgs()) {
                return false;
            }
            aVar.onResp(bVar);
            return true;
        }
    }
}
