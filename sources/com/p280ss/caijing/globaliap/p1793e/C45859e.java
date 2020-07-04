package com.p280ss.caijing.globaliap.p1793e;

import android.text.TextUtils;
import com.p280ss.base.p1785a.C45773a;
import com.p280ss.base.p1785a.C45777d;
import com.p280ss.caijing.globaliap.p1793e.C45855c.C45856a;
import com.p280ss.caijing.globaliap.p1793e.C45855c.C45857b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.e.e */
public abstract class C45859e implements C45777d<JSONObject> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo111014a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<String, String> mo111016b();

    /* renamed from: a */
    public final void mo110978a(C45773a<? super JSONObject> aVar) {
        C45857b bVar;
        String a = mo111014a();
        if (!TextUtils.isEmpty(a)) {
            try {
                C45856a a2 = new C45856a().mo111070a(a);
                if (mo111016b() != null) {
                    bVar = a2.mo111071a(mo111016b()).f117275a.mo111069a();
                } else {
                    bVar = a2.f117275a.mo111069a();
                }
                if (bVar.f117276a == 200) {
                    try {
                        aVar.f117103a = new JSONObject(bVar.f117277b);
                        aVar.f117105c = true;
                    } catch (JSONException e) {
                        aVar.f117104b = e;
                    }
                } else {
                    new StringBuilder("result code is not 200:").append(bVar.f117276a);
                    C45854b bVar2 = new C45854b(bVar.f117277b);
                    bVar2.f117268a = bVar.f117276a;
                    aVar.f117104b = bVar2;
                }
            } catch (C45854b e2) {
                aVar.f117104b = e2;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
