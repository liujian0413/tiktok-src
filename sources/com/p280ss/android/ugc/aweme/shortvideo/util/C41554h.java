package com.p280ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.h */
public final class C41554h {

    /* renamed from: a */
    public static final C41554h f108024a = new C41554h();

    private C41554h() {
    }

    /* renamed from: a */
    public static boolean m132329a() {
        C35603z zVar = C35563c.f93245h;
        C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
        String c = zVar.mo83209c();
        ArrayList arrayList = new ArrayList();
        arrayList.add("NP");
        arrayList.add("RO");
        arrayList.add("MA");
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (C7634n.m23717a((String) it.next(), c, true)) {
                z = true;
            }
        }
        if (C6399b.m19946v() && z) {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean shareDownloadDisabled = a.getShareDownloadDisabled();
            C7573i.m23582a((Object) shareDownloadDisabled, "SettingsReader.get().shareDownloadDisabled");
            if (!shareDownloadDisabled.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m132330b() {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Date date = new Date(((long) a.getShareDownloadDisabledEndtime().doubleValue()) * 1000);
        Object service = ServiceManager.get().getService(I18nManagerService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…nagerService::class.java)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", ((I18nManagerService) service).getCountryLocale());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(date);
        C7573i.m23582a((Object) format, "sdf.format(date)");
        return format;
    }
}
