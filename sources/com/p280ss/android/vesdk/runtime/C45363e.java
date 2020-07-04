package com.p280ss.android.vesdk.runtime;

import com.p280ss.android.vesdk.VEException;
import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.e */
public final class C45363e {

    /* renamed from: a */
    private String f116878a = VERuntime.m143285a().f116766e.f116805a;

    C45363e() {
    }

    /* renamed from: a */
    public final String mo108581a() {
        StringBuilder sb = new StringBuilder();
        sb.append(m143379a("audio"));
        sb.append(File.separator);
        sb.append(System.currentTimeMillis());
        sb.append("_record");
        sb.append(".wav");
        return sb.toString();
    }

    /* renamed from: a */
    private String m143379a(String str) throws VEException {
        File file = new File(this.f116878a, str);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("mkdirs failed, workspace path: ");
        sb.append(this.f116878a);
        throw new VEException(-100, sb.toString());
    }

    /* renamed from: a */
    public static String m143380a(String str, String str2) throws VEException {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("mkdirs failed, workspace path: ");
        sb.append(str);
        throw new VEException(-100, sb.toString());
    }
}
