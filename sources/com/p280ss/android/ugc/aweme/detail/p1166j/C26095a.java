package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.detail.api.DetailApi;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.j.a */
public final class C26095a extends C25640a<C26066a> {

    /* renamed from: a */
    public int f68929a;

    public C26095a(int i) {
        this.f68929a = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                String str = "";
                if (objArr.length > 1 && objArr[1] != null) {
                    str = (String) objArr[1];
                }
                String str2 = "";
                if (objArr.length > 2 && objArr[2] != null) {
                    str2 = (String) objArr[2];
                }
                return DetailApi.m85566a((String) objArr[0], str, str2);
            }
        }, 0);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C26066a aVar) {
        if (aVar == null || aVar.f68878a == null) {
            C6921a.m21552a(6, "BatchDetailModel", "data is null or items null!");
            return;
        }
        super.handleData(aVar);
        int size = aVar.f68878a.size();
        for (int i = 0; i < size; i++) {
            Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) aVar.f68878a.get(i));
            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
            StringBuilder sb = new StringBuilder();
            sb.append(updateAweme.getAid());
            sb.append(this.f68929a);
            iRequestIdService.setRequestIdAndIndex(sb.toString(), aVar.f68879b, i);
            aVar.f68878a.set(i, updateAweme);
        }
    }
}
