package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k */
public final class C40019k {
    /* renamed from: a */
    public static boolean m127927a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PCT-AL10");
        arrayList.add("PCT-TL10");
        arrayList.add("PCT-L29");
        arrayList.add("VNA-AL10");
        return arrayList.contains(Build.MODEL);
    }
}
