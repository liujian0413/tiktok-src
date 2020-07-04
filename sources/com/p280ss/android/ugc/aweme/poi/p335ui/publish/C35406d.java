package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.poi.api.POIApiManager;
import com.p280ss.android.ugc.aweme.poi.model.C35126o;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.d */
public final class C35406d extends C25652b<C25640a<C35126o>, C35405c> {
    /* renamed from: a */
    public final void mo57296a(Exception exc) {
    }

    public C35406d() {
        mo66536a(new C25640a<C35126o>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                int i;
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                try {
                    String d = C28290d.m93043d();
                    if (TextUtils.isEmpty(d)) {
                        i = 0;
                        POIApiManager.m113161a(this.mHandler, objArr[0], objArr[1], i, objArr[2]);
                        return true;
                    }
                    i = Integer.parseInt(d);
                    POIApiManager.m113161a(this.mHandler, objArr[0], objArr[1], i, objArr[2]);
                    return true;
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: e */
    private C35126o m114368e() {
        if (this.f67571b == null) {
            return null;
        }
        return (C35126o) this.f67571b.getData();
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null) {
            ((C35405c) this.f67572c).mo90144a(m114368e());
        }
    }
}
