package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.C8151f;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.c */
final class C7940c {
    C7940c() {
    }

    /* renamed from: a */
    static void m24372a(C7939b bVar, C7938a aVar) {
        Object obj = aVar.f21492b;
        int i = aVar.f21491a;
        if (i != 1) {
            if (i == 10) {
                bVar.f21493a = 2;
                if (obj instanceof C8151f) {
                    bVar.mo20802a((C8151f) obj);
                    return;
                }
            } else if (!(i == 12 || i == 14)) {
                switch (i) {
                    case 5:
                        bVar.f21493a = 1;
                        if (obj instanceof Integer) {
                            bVar.f21498f = ((Integer) obj).intValue();
                            bVar.mo20801a((C8135b) null);
                            bVar.f21502j = false;
                            return;
                        }
                        break;
                    case 6:
                        bVar.f21493a = 2;
                        if (obj instanceof C8135b) {
                            bVar.mo20801a((C8135b) obj);
                            return;
                        }
                        break;
                    case 7:
                        bVar.f21493a = 3;
                        return;
                }
            }
        }
        bVar.f21493a = 0;
    }
}
