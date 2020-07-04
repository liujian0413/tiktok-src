package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.d.a */
public final class C20588a extends C20590c {
    /* renamed from: b */
    public final String mo55726b() {
        if (m68168c()) {
            return "3";
        }
        return super.mo55726b();
    }

    /* renamed from: a */
    public final boolean mo55725a() {
        if (!"0".equals(mo55726b()) || m68168c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m68168c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    public C20588a(Context context) {
        super(context);
    }
}
