package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ac */
public final class C30373ac {

    /* renamed from: a */
    public static final C30373ac f79859a = new C30373ac();

    private C30373ac() {
    }

    /* renamed from: a */
    public static Uri m99256a(String str) {
        C7573i.m23587b(str, "url");
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "Uri.parse(url)");
        return parse;
    }

    /* renamed from: a */
    public static Uri m99257a(String str, String str2) {
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(str2, "module");
        Uri build = new Builder().scheme("react-native").authority(str).path(str2).build();
        C7573i.m23582a((Object) build, "Uri.Builder().scheme(Con…nel).path(module).build()");
        return build;
    }
}
