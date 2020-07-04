package com.p280ss.android.ugc.trill.setting.p1766a;

import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.HttpType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.setting.a.a */
public final class C45066a {

    /* renamed from: a */
    private static final String f115815a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/notice/shield/");
        f115815a = sb.toString();
    }

    /* renamed from: a */
    public static C34037b<String> m142136a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19565e("shield_type", String.valueOf(i)));
        arrayList.add(new C19565e("is_shield", String.valueOf(i2)));
        return new C34037b<>(f115815a, HttpType.POST, (List<C19565e>) arrayList, String.class);
    }
}
