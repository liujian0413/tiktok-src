package com.bytedance.netecho;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    private static C7562b<? super String, C7581n> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    private NetechoConfig() {
    }

    public final C7562b<String, C7581n> getLoadLibrary() {
        return loadLibrary;
    }

    public final void setLoadLibrary(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        loadLibrary = bVar;
    }
}
