package com.bytedance.android.livesdk.p397k;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.coupon.C5882f;
import com.bytedance.android.livesdk.utils.C9077o;
import java.io.File;
import java.io.IOException;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.k.g */
public final class C8355g {

    /* renamed from: com.bytedance.android.livesdk.k.g$a */
    public interface C8357a {
        /* renamed from: a */
        void mo14415a(C8346a aVar);
    }

    /* renamed from: a */
    private C7492s<String> m25453a(final String str) {
        return C7492s.m23282a((C7495v<T>) new C7495v<String>() {
            public final void subscribe(C47870u<String> uVar) throws Exception {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        String parent = file.getParent();
                        try {
                            C9077o.m27098a(file.getPath(), parent);
                        } catch (IOException unused) {
                            parent = "IOException";
                        }
                        uVar.mo19239a((Object) parent);
                    } else {
                        uVar.mo19239a((Object) "");
                    }
                } else {
                    uVar.mo19239a((Object) "");
                }
            }
        });
    }

    /* renamed from: a */
    private static C8346a m25452a(String str, int i) {
        if (5 == i) {
            return new C5882f(str);
        }
        return null;
    }

    /* renamed from: a */
    private void m25454a(Context context, C8346a aVar, C8357a aVar2) {
        if (!(context == null && aVar == null) && !TextUtils.isEmpty(aVar.f22890i) && new File(aVar.f22890i).exists()) {
            aVar.f22891j++;
            m25453a(aVar.f22890i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8360j<Object>(this, aVar, aVar2, context), C8361k.f22918a);
        }
    }

    /* renamed from: a */
    public final void mo21509a(Context context, int i, C8357a aVar) {
        C8349c.m25444a(context, i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8358h<Object>(this, i, aVar, context), C8359i.f22913a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21508a(int i, C8357a aVar, Context context, Object obj) throws Exception {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 0) {
                C8346a a = m25452a(str, i);
                if (a != null) {
                    if (!a.mo21504b()) {
                        m25454a(context, a, aVar);
                    } else if (aVar != null) {
                        aVar.mo14415a(a);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21510a(C8346a aVar, C8357a aVar2, Context context, String str) throws Exception {
        if (aVar.mo21504b()) {
            if (aVar2 != null) {
                aVar2.mo14415a(aVar);
            }
        } else if (aVar.f22891j < 3) {
            m25454a(context, aVar, aVar2);
        } else if (aVar2 != null && !TextUtils.isEmpty(str)) {
            "IOException".equals(str);
        }
    }
}
