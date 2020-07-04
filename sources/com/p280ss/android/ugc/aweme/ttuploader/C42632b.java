package com.p280ss.android.ugc.aweme.ttuploader;

import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.b */
public final class C42632b {

    /* renamed from: a */
    public static final C42632b f110799a = new C42632b();

    /* renamed from: b */
    private static final List<String> f110800b = C7525m.m23464b((T[]) new String[]{"http://p1-dy.byteimg.com", "http://p3-dy.byteimg.com", "http://p9-dy.byteimg.com"});

    private C42632b() {
    }

    /* renamed from: a */
    private static List<String> m135444a() {
        boolean z;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            List imImageDomains = a.getImImageDomains();
            if (imImageDomains != null) {
                List e = C7525m.m23510e(imImageDomains);
                if (e != null) {
                    List<String> d = C7525m.m23509d((Collection<? extends T>) e);
                    int size = d.size();
                    if (size >= 3) {
                        return d;
                    }
                    Iterable iterable = f110800b;
                    Collection arrayList = new ArrayList();
                    int i = 0;
                    for (Object next : iterable) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C7525m.m23465b();
                        }
                        if (i >= 3 - size) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                        i = i2;
                    }
                    for (String add : (List) arrayList) {
                        d.add(add);
                    }
                    return d;
                }
            }
            return f110800b;
        } catch (Exception unused) {
            return f110800b;
        }
    }

    /* renamed from: a */
    public final C42633c mo104246a(String str) {
        return new C42633c(m135444a(), str);
    }
}
