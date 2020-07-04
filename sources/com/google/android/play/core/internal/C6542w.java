package com.google.android.play.core.internal;

import java.io.File;

/* renamed from: com.google.android.play.core.internal.w */
final class C6542w implements C6529j {
    C6542w() {
    }

    /* renamed from: a */
    public final boolean mo15878a(Object obj, File file, File file2) {
        try {
            return !((Boolean) C6512ad.m20218a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
