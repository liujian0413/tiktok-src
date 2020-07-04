package com.p280ss.android.ugc.aweme.shortvideo.festival;

import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o */
public final class C39882o {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o$a */
    public static final class C39883a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((C39880m) t).f103623a), Integer.valueOf(((C39880m) t2).f103623a));
        }
    }

    /* renamed from: a */
    public static final List<C39880m> m127634a(String str) {
        File[] listFiles;
        int i;
        if (!C38527bf.m123172a(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : new File(str).listFiles()) {
            C7573i.m23582a((Object) file, "waterFile");
            if (!file.isHidden()) {
                String name = file.getName();
                C7573i.m23582a((Object) name, "waterFile.name");
                if (C7634n.m23721b(name, "dynamic_watermark_", false)) {
                    String path = file.getPath();
                    C7573i.m23582a((Object) path, "waterFile.path");
                    if (C7634n.m23723c(path, ".png", false)) {
                        String name2 = file.getName();
                        C7573i.m23582a((Object) name2, "waterFile.name");
                        String a = C7634n.m23764b(C7634n.m23775c(name2, "dynamic_watermark_", name2), ".png", C7634n.m23775c(name2, "dynamic_watermark_", name2));
                        if (C7634n.m23706d(a) == null) {
                            i = 0;
                        } else {
                            i = Integer.parseInt(a);
                        }
                        String path2 = file.getPath();
                        C7573i.m23582a((Object) path2, "waterFile.path");
                        arrayList.add(new C39880m(i, path2));
                    }
                }
            }
        }
        List<C39880m> list = arrayList;
        if (list.size() > 1) {
            C7525m.m23474a(list, new C39883a());
        }
        return list;
    }
}
