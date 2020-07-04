package com.p280ss.android.ugc.aweme.ttuploader;

import com.C1642a;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.c */
public final class C42633c extends C42634d {

    /* renamed from: e */
    private final String f110801e;

    /* renamed from: a */
    public final String mo104247a() {
        return this.f110801e;
    }

    /* renamed from: b */
    public final String mo104248b() {
        if (this.f110804b) {
            String a = C1642a.m8034a("/img/%s~tplv-noop.image", Arrays.copyOf(new Object[]{this.f110801e}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            return a;
        }
        String a2 = C1642a.m8034a("/img/%s~tplv-obj.image", Arrays.copyOf(new Object[]{this.f110801e}, 1));
        C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
        return a2;
    }

    public C42633c(List<String> list, String str) {
        C7573i.m23587b(list, "imageDomains");
        super(list);
        this.f110801e = str;
    }
}
