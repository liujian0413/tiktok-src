package com.p280ss.android.ugc.aweme.setting.serverpush.p1527a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.e */
public final class C37716e extends C25652b<C25640a<C37723b>, C37709b> {
    public C37716e() {
        m120582e();
    }

    /* renamed from: e */
    private void m120582e() {
        mo66536a(new C25640a<C37723b>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        return PushSettingsApiManager.m120591a();
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        C37723b bVar;
        if (this.f67571b == null) {
            bVar = null;
        } else {
            bVar = (C37723b) this.f67571b.getData();
        }
        if (bVar != null && this.f67572c != null) {
            C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), "last_user_setting_version", bVar.f98290z);
            ((C37709b) this.f67572c).mo83181a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C37709b) this.f67572c).mo83182c_(exc);
        }
    }
}
