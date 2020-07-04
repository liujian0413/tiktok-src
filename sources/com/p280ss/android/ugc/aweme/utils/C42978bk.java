package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10833c;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.web.p1703a.C43435c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.bk */
public final class C42978bk {

    /* renamed from: a */
    private static Map<String, String> f111535a;

    /* renamed from: b */
    private static Map<String, String> f111536b;

    /* renamed from: a */
    private static boolean m136447a() {
        return TextUtils.equals(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(C6399b.m19921a()).mo18531b(), "th");
    }

    static {
        HashMap hashMap = new HashMap();
        f111535a = hashMap;
        hashMap.put(C10834d.f29331a, "font/ProximaNova-Reg.ttf");
        f111535a.put(C10834d.f29332b, "font/ProximaNova-Bold.ttf");
        f111535a.put(C10834d.f29337g, "font/ProximaNova-Semibold.ttf");
        HashMap hashMap2 = new HashMap();
        f111536b = hashMap2;
        hashMap2.put(C10833c.f29323a, "font/ProximaNova-Reg.ttf");
        f111536b.put(C10833c.f29324b, "font/ProximaNova-Bold.ttf");
        f111536b.put(C10833c.f29329g, "font/ProximaNova-Semibold.ttf");
    }

    /* renamed from: a */
    public static void m136446a(Context context) {
        if (!m136447a()) {
            C10832b.m31784a().mo26162a(context, f111535a);
            C43435c.m137838a().mo105372a(context, f111536b);
        }
    }
}
