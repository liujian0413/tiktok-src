package com.google.android.gms.internal.ads;

public abstract class bcr {
    /* renamed from: a */
    public abstract void mo40501a(String str);

    /* renamed from: a */
    public static bcr m48435a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new bcm(cls.getSimpleName());
        }
        return new bco(cls.getSimpleName());
    }
}
