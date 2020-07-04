package com.p280ss.android.ugc.aweme.p1070bb.p1071a;

import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.live.C32430a;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.bb.a.a */
public final class C23525a {

    /* renamed from: a */
    private static final String f62101a;

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C32430a.m105063b());
        sb.append("/webcast/certification/query/");
        f62101a = sb.toString();
    }

    /* renamed from: a */
    public static String m77283a(String str) throws Exception {
        if (C23526b.m77284a(AwemeApplication.m21341a())) {
            StringBuilder sb = new StringBuilder();
            sb.append(f62101a);
            sb.append("?zhima_token=");
            sb.append(str);
            return NetworkUtils.executeGet(0, sb.toString());
        }
        throw new IOException();
    }
}
