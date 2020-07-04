package com.p280ss.android.ugc.aweme.notice;

import android.os.Message;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.message.p1392a.C33211b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34303b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34304c;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34305d;
import com.p280ss.android.ugc.aweme.notice.api.utils.C34326a;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notice.a */
public final class C34292a implements C34303b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89434a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34292a.class), "redPointService", "getRedPointService()Lcom/ss/android/ugc/aweme/notice/api/count/RedPointService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34292a.class), "oldPointService", "getOldPointService()Lcom/ss/android/ugc/aweme/notice/api/count/OldRedPointService;"))};

    /* renamed from: b */
    private final C7541d f89435b = C7546e.m23569a(C34294b.f89438a);

    /* renamed from: c */
    private final C7541d f89436c = C7546e.m23569a(C34293a.f89437a);

    /* renamed from: com.ss.android.ugc.aweme.notice.a$a */
    static final class C34293a extends Lambda implements C7561a<C34304c> {

        /* renamed from: a */
        public static final C34293a f89437a = new C34293a();

        C34293a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m110939a();
        }

        /* renamed from: a */
        private static C34304c m110939a() {
            return (C34304c) ServiceManager.get().getService(C34304c.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.a$b */
    static final class C34294b extends Lambda implements C7561a<C34305d> {

        /* renamed from: a */
        public static final C34294b f89438a = new C34294b();

        C34294b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m110940a();
        }

        /* renamed from: a */
        private static C34305d m110940a() {
            return (C34305d) ServiceManager.get().getService(C34305d.class);
        }
    }

    /* renamed from: b */
    private final C34305d m110928b() {
        return (C34305d) this.f89435b.getValue();
    }

    /* renamed from: c */
    private final C34304c m110929c() {
        return (C34304c) this.f89436c.getValue();
    }

    /* renamed from: a */
    public final void mo87069a(int... iArr) {
        C7573i.m23587b(iArr, "groups");
        int i = 0;
        if (C34326a.m111019a()) {
            int length = iArr.length;
            while (i < length) {
                m110928b().mo85007b(iArr[i]);
                i++;
            }
            return;
        }
        int length2 = iArr.length;
        while (i < length2) {
            m110929c().mo85007b(iArr[i]);
            i++;
        }
    }

    /* renamed from: a */
    public final void mo87063a() {
        if (C34326a.m111019a()) {
            m110928b().mo85006b();
        } else {
            m110929c().mo85006b();
        }
    }

    /* renamed from: a */
    public final int mo87062a(String str) {
        C7573i.m23587b(str, "uid");
        return C33211b.m107126a().mo84995a(str);
    }

    /* renamed from: a */
    public final int mo87061a(int i) {
        if (C34326a.m111019a()) {
            return m110928b().mo85008c(i);
        }
        return m110929c().mo85008c(i);
    }

    /* renamed from: a */
    public final void mo87065a(Message message) {
        C7573i.m23587b(message, "msg");
        if (C34326a.m111019a()) {
            m110928b().mo85002a(message);
        } else {
            m110929c().mo85002a(message);
        }
    }

    /* renamed from: a */
    public final void mo87066a(List<String> list) {
        C7573i.m23587b(list, "uids");
        C33211b.m107126a().mo84997a(list);
    }

    /* renamed from: a */
    public final void mo87067a(boolean z) {
        if (C34326a.m111019a()) {
            m110928b().mo85004a(z);
        } else {
            m110929c().mo85004a(z);
        }
    }

    /* renamed from: a */
    public final void mo87064a(int i, int i2) {
        if (C34326a.m111019a()) {
            m110928b().mo85000a(i, i2);
        } else {
            m110929c().mo85000a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo87068a(boolean z, int i) {
        if (C34326a.m111019a()) {
            m110928b().mo85005a(z, i);
        } else {
            m110929c().mo85005a(z, i);
        }
    }
}
