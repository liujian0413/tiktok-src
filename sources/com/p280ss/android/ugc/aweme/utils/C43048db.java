package com.p280ss.android.ugc.aweme.utils;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.utils.db */
public final class C43048db {

    /* renamed from: a */
    private ConcurrentHashMap<String, Boolean> f111645a;

    /* renamed from: com.ss.android.ugc.aweme.utils.db$a */
    static class C43050a {

        /* renamed from: a */
        public static final C43048db f111646a = new C43048db();
    }

    /* renamed from: a */
    public static C43048db m136578a() {
        return C43050a.f111646a;
    }

    private C43048db() {
        this.f111645a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final boolean mo104720a(OneTimeEnum oneTimeEnum) {
        if (this.f111645a.get(oneTimeEnum.getName()) != null && ((Boolean) this.f111645a.get(oneTimeEnum.getName())).booleanValue()) {
            return false;
        }
        this.f111645a.put(oneTimeEnum.getName(), Boolean.valueOf(true));
        return true;
    }
}
