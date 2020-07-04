package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.account.p938b.C21116a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.feed.i.w */
public final class C28473w extends C21116a<C28471v, C28466r> {
    /* renamed from: e */
    public final int mo72207e() {
        if (this.f67571b == null) {
            return 0;
        }
        return ((C28471v) this.f67571b).f75069a;
    }

    /* renamed from: b */
    public final void mo56977b() {
        C0902i iVar;
        if (this.f67571b == null) {
            iVar = null;
        } else {
            iVar = (C0902i) ((C28471v) this.f67571b).getData();
        }
        if (iVar != null) {
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateUserDigg((String) iVar.f3154a, ((Integer) iVar.f3155b).intValue());
        }
        if (this.f67572c != null) {
            ((C28466r) this.f67572c).mo72203a(iVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C28466r) this.f67572c).mo72204a(exc);
        }
    }
}
