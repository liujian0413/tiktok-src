package com.p280ss.android.ugc.aweme.app.services;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.login.LoginType;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.aa */
public final class C23026aa implements C33034t {
    /* renamed from: b */
    public final String mo60002b() {
        String g = C32326h.m104885g();
        C7573i.m23582a((Object) g, "RegionHelper.getRegion()");
        return g;
    }

    /* renamed from: c */
    public final String mo60003c() {
        String h = C32326h.m104886h();
        C7573i.m23582a((Object) h, "RegionHelper.getSimCountry()");
        return h;
    }

    /* renamed from: a */
    public final List<String> mo60001a() {
        LinkedList linkedList = new LinkedList();
        C7120e currentI18nItem = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(AwemeApplication.m21341a());
        C7573i.m23582a((Object) currentI18nItem, "ServiceManager.get().get…ication.getApplication())");
        for (LoginType name : currentI18nItem.mo18534e()) {
            linkedList.add(name.name());
        }
        return linkedList;
    }
}
