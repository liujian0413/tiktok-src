package com.p280ss.android.ugc.aweme.effectplatform;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.h */
public final class C27484h implements C27482f {

    /* renamed from: a */
    private List<String> f72500a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.h$a */
    public static final class C27485a implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFetchResourcesListener f72501a;

        C27485a(IFetchResourcesListener iFetchResourcesListener) {
            this.f72501a = iFetchResourcesListener;
        }

        public final void onFailed(Exception exc) {
            C7573i.m23587b(exc, "e");
            IFetchResourcesListener iFetchResourcesListener = this.f72501a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C7573i.m23587b(strArr, "requirements");
            IFetchResourcesListener iFetchResourcesListener = this.f72501a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    /* renamed from: a */
    public final C27482f mo70691a() {
        C27484h hVar = this;
        if (C35563c.f93231M.mo93306b(Property.ShowAutoImproveButtonInEditPage) == 1) {
            hVar.f72500a.add("hdrnet");
        }
        return this;
    }

    /* renamed from: a */
    public final void mo70688a(IFetchResourcesListener iFetchResourcesListener) {
        if (!this.f72500a.isEmpty()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            Object[] array = this.f72500a.toArray(new String[0]);
            if (array != null) {
                iAVService.fetchResourcesNeededByRequirements((String[]) array, new C27485a(iFetchResourcesListener));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
