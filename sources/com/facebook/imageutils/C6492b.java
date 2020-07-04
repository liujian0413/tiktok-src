package com.facebook.imageutils;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* renamed from: com.facebook.imageutils.b */
public final class C6492b {

    /* renamed from: a */
    private static C6493a f18812a;

    /* renamed from: com.facebook.imageutils.b$a */
    public interface C6493a {
        /* renamed from: a */
        void mo15842a(String str);
    }

    /* renamed from: a */
    public static void m20176a(C6493a aVar) {
        f18812a = aVar;
    }

    /* renamed from: a */
    public static void m20175a(Context context) throws IOException {
        if (f18812a == null) {
            SoLoader.m42245a(context, 0);
        }
    }

    /* renamed from: a */
    public static void m20177a(String str) {
        if (f18812a != null) {
            f18812a.mo15842a(str);
        } else {
            SoLoader.m42249a(str);
        }
    }
}
