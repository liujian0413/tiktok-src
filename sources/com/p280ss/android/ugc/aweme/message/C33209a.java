package com.p280ss.android.ugc.aweme.message;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.notice.api.C34301b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.a */
public class C33209a implements C34301b {

    /* renamed from: c */
    private static volatile C33209a f86415c;

    /* renamed from: a */
    private List<Long> f86416a = new ArrayList();

    /* renamed from: b */
    private boolean f86417b = false;

    /* renamed from: d */
    private boolean f86418d = true;

    /* renamed from: e */
    private boolean f86419e = false;

    /* renamed from: f */
    private Keva f86420f = Keva.getRepo("live_push_data_keva");

    /* renamed from: a */
    public static C33209a m107123a() {
        if (f86415c == null) {
            synchronized (C33209a.class) {
                if (f86415c == null) {
                    f86415c = new C33209a();
                }
            }
        }
        return f86415c;
    }
}
