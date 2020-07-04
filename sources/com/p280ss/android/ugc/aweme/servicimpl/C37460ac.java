package com.p280ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.app.AlertDialog;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IPrivacySettingService;
import com.p280ss.android.ugc.aweme.services.IPrivacySettingService.OnPostNowClickListener;
import com.p280ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.ac */
public final class C37460ac implements IAVPrivacySettingService {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f97766a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37460ac.class), "service", "getService()Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;"))};

    /* renamed from: b */
    private final C7541d f97767b = C7546e.m23569a(C37461a.f97768a);

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ac$a */
    static final class C37461a extends Lambda implements C7561a<IPrivacySettingService> {

        /* renamed from: a */
        public static final C37461a f97768a = new C37461a();

        C37461a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m120119a();
        }

        /* renamed from: a */
        private static IPrivacySettingService m120119a() {
            return (IPrivacySettingService) ServiceManager.get().getService(IPrivacySettingService.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ac$b */
    static final class C37462b implements OnPostNowClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f97769a;

        C37462b(C7561a aVar) {
            this.f97769a = aVar;
        }

        public final void onPostNowClick() {
            this.f97769a.invoke();
        }
    }

    /* renamed from: a */
    private final IPrivacySettingService m120118a() {
        return (IPrivacySettingService) this.f97767b.getValue();
    }

    public final boolean needShowPrivacyConfirmationDialog(Activity activity) {
        C7573i.m23587b(activity, "activity");
        IPrivacySettingService a = m120118a();
        if (a != null) {
            return a.needShowPrivacyConfirmationDialog(activity);
        }
        return false;
    }

    public final AlertDialog showPrivacyConfirmationDialog(Activity activity, C7561a<C7581n> aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aVar, "onPostNowClickListener");
        IPrivacySettingService a = m120118a();
        if (a != null) {
            return a.showPrivacyConfirmationDialog(activity, new C37462b(aVar));
        }
        return null;
    }
}
