package com.p280ss.android.ugc.aweme.profile.presenter;

import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28466r;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.w */
public final class C36049w extends C25652b<C28471v, C28466r> {
    /* renamed from: b */
    public final void mo56977b() {
        C0902i iVar;
        if (this.f67571b == null) {
            iVar = null;
        } else {
            C25640a aVar = this.f67571b;
            C7573i.m23582a((Object) aVar, "mModel");
            iVar = (C0902i) ((C28471v) aVar).getData();
        }
        if (iVar != null) {
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            String str = (String) iVar.f3154a;
            S s = iVar.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s, "second!!");
            iAwemeService.updateUserDigg(str, ((Number) s).intValue());
            C42961az.m136380a(new C28318an(13, iVar.f3154a));
        }
        C28466r rVar = (C28466r) this.f67572c;
        if (rVar != null) {
            rVar.mo72203a(iVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        C28466r rVar = (C28466r) this.f67572c;
        if (rVar != null) {
            rVar.mo72204a(exc);
        }
    }
}
