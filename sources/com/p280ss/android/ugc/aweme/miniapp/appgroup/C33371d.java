package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.d */
public final class C33371d {

    /* renamed from: d */
    public static final int f87187d;

    /* renamed from: e */
    public static final int f87188e;

    /* renamed from: f */
    public static final int f87189f;

    /* renamed from: g */
    public static final int f87190g;

    /* renamed from: h */
    public static final int f87191h;

    /* renamed from: i */
    public static final C33372a f87192i = new C33372a(null);

    /* renamed from: j */
    private static int f87193j;

    /* renamed from: a */
    public final int f87194a;

    /* renamed from: b */
    public final MicroAppInfo f87195b;

    /* renamed from: c */
    public final String f87196c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.d$a */
    public static final class C33372a {
        private C33372a() {
        }

        /* renamed from: a */
        public static int m107935a() {
            return C33371d.f87187d;
        }

        /* renamed from: b */
        public static int m107936b() {
            return C33371d.f87188e;
        }

        /* renamed from: c */
        public static int m107937c() {
            return C33371d.f87189f;
        }

        /* renamed from: d */
        public static int m107938d() {
            return C33371d.f87190g;
        }

        /* renamed from: e */
        public static int m107939e() {
            return C33371d.f87191h;
        }

        public /* synthetic */ C33372a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final ArrayList<C33371d> mo85552a(List<? extends MicroAppInfo> list) {
            if (C6307b.m19566a((Collection<T>) list)) {
                return new ArrayList<>();
            }
            if (list == null) {
                C7573i.m23580a();
            }
            ArrayList<C33371d> arrayList = new ArrayList<>(list.size());
            for (MicroAppInfo dVar : list) {
                C33371d dVar2 = new C33371d(m107937c(), dVar, null, 4, null);
                arrayList.add(dVar2);
            }
            return arrayList;
        }
    }

    static {
        int i = f87193j + 1;
        f87193j = i;
        f87187d = i;
        int i2 = f87193j + 1;
        f87193j = i2;
        f87188e = i2;
        int i3 = f87193j + 1;
        f87193j = i3;
        f87189f = i3;
        int i4 = f87193j + 1;
        f87193j = i4;
        f87190g = i4;
        int i5 = f87193j + 1;
        f87193j = i5;
        f87191h = i5;
    }

    private C33371d(int i, MicroAppInfo microAppInfo, String str) {
        this.f87194a = i;
        this.f87195b = microAppInfo;
        this.f87196c = str;
    }

    public /* synthetic */ C33371d(int i, MicroAppInfo microAppInfo, String str, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            microAppInfo = null;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        this(i, microAppInfo, str);
    }
}
