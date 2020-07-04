package com.bytedance.android.live.network;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p146b.C3165b;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.network.C3455c.C3456a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.utils.C9095y;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.network.a */
final class C3452a implements C3455c {

    /* renamed from: a */
    private final String[] f10262a = {"CN", "MR", "SA", "FR", "AE"};

    C3452a() {
    }

    /* renamed from: a */
    public final C3456a mo10438a(C3456a aVar) {
        String str = aVar.f10263a;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            m12787a(sb);
            aVar.f10263a = sb.toString();
        }
        return aVar;
    }

    /* renamed from: a */
    private void m12787a(StringBuilder sb) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo10439a((Map<String, String>) linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(C3457d.m12797a((List<Pair<String, String>>) arrayList, "UTF-8"));
    }

    /* renamed from: a */
    public final void mo10439a(Map<String, String> map) {
        Locale locale;
        map.put("webcast_sdk_version", "1380");
        if (C3596c.m13172a(IHostContext.class) != null) {
            locale = ((IHostContext) C3596c.m13172a(IHostContext.class)).currentLocale();
        } else {
            locale = null;
        }
        map.put("webcast_language", C3165b.m11951a(locale));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (C3339m.m12449a() && !C9095y.m27139a()) {
            int intValue = ((Integer) CoreSettingKeys.TEST_FAKE_REGION.mo10240a()).intValue();
            String str = "";
            if (intValue >= 0 && intValue < this.f10262a.length) {
                str = this.f10262a[intValue];
            }
            map.put("fake_region", str);
        }
    }
}
