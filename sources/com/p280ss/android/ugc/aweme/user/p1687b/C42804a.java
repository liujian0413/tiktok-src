package com.p280ss.android.ugc.aweme.user.p1687b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.C21683bp;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.user.C42803b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.user.b.a */
public final class C42804a {
    /* renamed from: a */
    public static void m135837a(Handler handler, final String str, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                C21683bp.m72581a().mo58585b(Integer.MAX_VALUE, str);
                return null;
            }
        }, 113);
    }

    /* renamed from: a */
    public static void m135843a(Handler handler, final Map<String, String> map, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                return C42803b.m135832a(map);
            }
        }, i);
    }

    /* renamed from: a */
    public static void m135838a(Handler handler, final String str, final int i, int i2) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("phone_number", str);
                }
                hashMap.put("login_type", String.valueOf(i));
                C21683bp.m72581a().mo58586b(Integer.MAX_VALUE, "https://api2.musical.ly/aweme/v1/friend/register/notice/", hashMap);
                return null;
            }
        }, 114);
    }

    /* renamed from: a */
    public static void m135842a(Handler handler, final String str, boolean z, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable(false) {
            public final Object call() throws Exception {
                return C42803b.m135833a(str, false);
            }
        }, 112);
    }

    /* renamed from: a */
    public static void m135839a(Handler handler, String str, int i, String str2, int i2) {
        m135840a(handler, str, i, str2, null, i2);
    }

    /* renamed from: a */
    public static void m135841a(Handler handler, final String str, final String str2, final int i, int i2) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                return C42803b.m135831a(str, str2, i);
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m135840a(Handler handler, final String str, final int i, final String str2, final List<C19565e> list, int i2) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                return C21683bp.m72581a().mo58582a(str, i, str2, AvatarUri.class, "data", list);
            }
        }, i2);
    }
}
