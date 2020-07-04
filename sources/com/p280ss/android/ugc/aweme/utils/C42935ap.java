package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ttnet.utils.C13000c;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.aweme.utils.ap */
public final class C42935ap {

    /* renamed from: a */
    public static final C42935ap f111467a = new C42935ap();

    private C42935ap() {
    }

    /* renamed from: a */
    public static final String m136288a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "target");
        C7573i.m23587b(str2, "key");
        C7573i.m23587b(str3, "transformation");
        C7573i.m23587b(str4, "iv");
        byte[] bytes = str.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = str4.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes3, "(this as java.lang.String).getBytes(charset)");
        byte[] a = C13000c.m37934a(bytes, bytes2, str3, bytes3);
        try {
            C7573i.m23582a((Object) a, "encryptedBytes");
            return new String(a, C48038d.f122880a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final String m136289b(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "target");
        C7573i.m23587b(str2, "key");
        C7573i.m23587b(str3, "transformation");
        C7573i.m23587b(str4, "iv");
        byte[] bytes = str.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = str4.getBytes(C48038d.f122880a);
        C7573i.m23582a((Object) bytes3, "(this as java.lang.String).getBytes(charset)");
        byte[] c = C13000c.m37937c(bytes, bytes2, str3, bytes3);
        try {
            C7573i.m23582a((Object) c, "decryptedBytes");
            return new String(c, C48038d.f122880a);
        } catch (Exception unused) {
            return "";
        }
    }
}
