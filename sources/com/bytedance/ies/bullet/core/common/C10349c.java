package com.bytedance.ies.bullet.core.common;

import java.io.File;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.core.common.c */
public final class C10349c {
    /* renamed from: a */
    public static final File m30637a(File file, C7562b<? super File, Boolean> bVar) {
        C7573i.m23587b(file, "$this$searchDir");
        C7573i.m23587b(bVar, "matcher");
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (((Boolean) bVar.invoke(file2)).booleanValue()) {
                        return file2;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
