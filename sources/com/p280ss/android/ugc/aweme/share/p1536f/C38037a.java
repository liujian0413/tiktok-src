package com.p280ss.android.ugc.aweme.share.p1536f;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.share.f.a */
public final class C38037a {

    /* renamed from: a */
    public static final C38037a f99023a = new C38037a();

    private C38037a() {
    }

    /* renamed from: a */
    public static boolean m121403a() {
        String g = C32326h.m104885g();
        ArrayList arrayList = new ArrayList();
        arrayList.add("NP");
        arrayList.add("RO");
        arrayList.add("MA");
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (C7634n.m23717a((String) it.next(), g, true)) {
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
    public static String m121404b() {
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
