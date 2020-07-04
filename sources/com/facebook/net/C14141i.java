package com.facebook.net;

import com.bytedance.common.utility.C6319n;
import java.util.HashMap;

/* renamed from: com.facebook.net.i */
public final class C14141i {

    /* renamed from: a */
    private final HashMap<String, Integer> f37368a = new HashMap<>();

    /* renamed from: a */
    public final int mo33894a(String str) {
        if (!C6319n.m19593a(str) && this.f37368a.containsKey(str)) {
            return ((Integer) this.f37368a.get(str)).intValue();
        }
        return -1;
    }
}
