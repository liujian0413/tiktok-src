package com.p280ss.android.ugc.aweme.ttuploader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.d */
public abstract class C42634d {

    /* renamed from: d */
    public static final C42635a f110802d = new C42635a(null);

    /* renamed from: a */
    public String f110803a = "";

    /* renamed from: b */
    public boolean f110804b;

    /* renamed from: c */
    public final List<String> f110805c;

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.d$a */
    public static final class C42635a {
        private C42635a() {
        }

        public /* synthetic */ C42635a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public abstract String mo104248b();

    /* renamed from: a */
    public String mo104247a() {
        boolean z;
        String b = mo104248b();
        Collection collection = this.f110805c;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f110805c.get(0));
        sb.append(b);
        return sb.toString();
    }

    /* renamed from: c */
    public final List<String> mo104249c() {
        ArrayList arrayList = new ArrayList();
        String b = mo104248b();
        for (String str : this.f110805c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(b);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public C42634d(List<String> list) {
        C7573i.m23587b(list, "imageDomains");
        this.f110805c = list;
    }
}
