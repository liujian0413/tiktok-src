package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.poi.model.C35125n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.c */
public final class C35427c extends C25652b<C35425a, C35431e> {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            C35431e eVar = (C35431e) this.f67572c;
            C25640a aVar = this.f67571b;
            C7573i.m23582a((Object) aVar, "mModel");
            C35125n nVar = (C35125n) ((C35425a) aVar).getData();
            C7573i.m23582a((Object) nVar, "mModel.data");
            eVar.mo90167a(nVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null && this.f67571b != null) {
            ((C35431e) this.f67572c).mo90168a(exc);
        }
    }
}
