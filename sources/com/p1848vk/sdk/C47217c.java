package com.p1848vk.sdk;

import java.util.HashMap;
import java.util.Random;

/* renamed from: com.vk.sdk.c */
public class C47217c {

    /* renamed from: a */
    private static final HashMap<Long, C47217c> f121353a = new HashMap<>();

    /* renamed from: b */
    private long f121354b;

    /* renamed from: b */
    public final void mo118684b() {
        f121353a.remove(Long.valueOf(this.f121354b));
        this.f121354b = 0;
    }

    /* renamed from: a */
    public final long mo118683a() {
        if (f121353a.containsKey(Long.valueOf(this.f121354b))) {
            return this.f121354b;
        }
        Random random = new Random();
        while (true) {
            long nextLong = random.nextLong();
            if (!f121353a.containsKey(Long.valueOf(nextLong)) && nextLong != 0) {
                f121353a.put(Long.valueOf(nextLong), this);
                this.f121354b = nextLong;
                return nextLong;
            }
        }
    }

    /* renamed from: a */
    public static C47217c m147670a(long j) {
        return (C47217c) f121353a.get(Long.valueOf(j));
    }
}
