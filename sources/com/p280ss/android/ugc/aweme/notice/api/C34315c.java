package com.p280ss.android.ugc.aweme.notice.api;

import android.os.Message;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34303b;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34319b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notice.api.c */
public final class C34315c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89467a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34315c.class), "noticeListService", "getNoticeListService()Lcom/ss/android/ugc/aweme/notice/api/list/NoticeListService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34315c.class), "noticeCountService", "getNoticeCountService()Lcom/ss/android/ugc/aweme/notice/api/count/NoticeCountService;"))};

    /* renamed from: b */
    public static final C34315c f89468b = new C34315c();

    /* renamed from: c */
    private static final C7541d f89469c = C7546e.m23569a(C34317b.f89472a);

    /* renamed from: d */
    private static final C7541d f89470d = C7546e.m23569a(C34316a.f89471a);

    /* renamed from: com.ss.android.ugc.aweme.notice.api.c$a */
    static final class C34316a extends Lambda implements C7561a<C34303b> {

        /* renamed from: a */
        public static final C34316a f89471a = new C34316a();

        C34316a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m110987a();
        }

        /* renamed from: a */
        private static C34303b m110987a() {
            return (C34303b) ServiceManager.get().getService(C34303b.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.c$b */
    static final class C34317b extends Lambda implements C7561a<C34319b> {

        /* renamed from: a */
        public static final C34317b f89472a = new C34317b();

        C34317b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m110988a();
        }

        /* renamed from: a */
        private static C34319b m110988a() {
            return (C34319b) ServiceManager.get().getService(C34319b.class);
        }
    }

    private C34315c() {
    }

    /* renamed from: d */
    private final C34319b m110985d() {
        return (C34319b) f89469c.getValue();
    }

    /* renamed from: e */
    private final C34303b m110986e() {
        return (C34303b) f89470d.getValue();
    }

    /* renamed from: a */
    public static final void m110980a(boolean z, int i) {
        f89468b.m110986e().mo87068a(z, i);
    }

    /* renamed from: b */
    public static final <T extends AmeBaseFragment> Class<? extends T> m110981b() {
        return f89468b.m110985d().mo87147a();
    }

    /* renamed from: c */
    public static final void m110983c() {
        f89468b.m110986e().mo87063a();
    }

    /* renamed from: a */
    public static final C34318a m110975a() {
        return f89468b.m110985d().mo87148b();
    }

    /* renamed from: a */
    private int m110972a(int i) {
        return m110986e().mo87061a(i);
    }

    /* renamed from: a */
    public static final int m110973a(String str) {
        C7573i.m23587b(str, "uid");
        return f89468b.m110986e().mo87062a(str);
    }

    /* renamed from: c */
    public static final void m110984c(int... iArr) {
        C7573i.m23587b(iArr, "groups");
        f89468b.m110986e().mo87069a(iArr);
    }

    /* renamed from: a */
    public static final int m110974a(int... iArr) {
        C7573i.m23587b(iArr, "groups");
        Collection arrayList = new ArrayList(iArr.length);
        for (int a : iArr) {
            arrayList.add(Integer.valueOf(f89468b.m110972a(a)));
        }
        return C7525m.m23527q((List) arrayList);
    }

    /* renamed from: b */
    public static final boolean m110982b(int... iArr) {
        C7573i.m23587b(iArr, "groups");
        Collection arrayList = new ArrayList(iArr.length);
        for (int a : iArr) {
            arrayList.add(Integer.valueOf(f89468b.m110972a(a)));
        }
        if (C7525m.m23527q((List) arrayList) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m110977a(Message message) {
        C7573i.m23587b(message, "msg");
        f89468b.m110986e().mo87065a(message);
    }

    /* renamed from: a */
    public static final void m110978a(List<String> list) {
        C7573i.m23587b(list, "uids");
        f89468b.m110986e().mo87066a(list);
    }

    /* renamed from: a */
    public static final void m110979a(boolean z) {
        f89468b.m110986e().mo87067a(z);
    }

    /* renamed from: a */
    public static final void m110976a(int i, int i2) {
        f89468b.m110986e().mo87064a(i, i2);
    }
}
