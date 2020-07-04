package com.p280ss.android.ugc.aweme.app;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.ao */
public class C22795ao {

    /* renamed from: b */
    private static C22795ao f60492b;

    /* renamed from: a */
    public ArrayList<C22796ap> f60493a = new ArrayList<>();

    /* renamed from: a */
    public static C22795ao m75204a() {
        if (f60492b == null) {
            synchronized (C22795ao.class) {
                if (f60492b == null) {
                    f60492b = new C22795ao();
                }
            }
        }
        return f60492b;
    }
}
