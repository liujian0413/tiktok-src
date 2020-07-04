package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C41608a;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C41608a.C41609a;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi.Api;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.C41601b;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1625b.C41603a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.d */
public final class C41612d implements C41596a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108117a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41612d.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/api/LongVideoCategoryApi;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41612d.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/cache/network/INetworkCache;"))};

    /* renamed from: b */
    private final C7541d f108118b = C7546e.m23570a(new LongVideoCategoryApi());

    /* renamed from: c */
    private final C7541d f108119c = C7546e.m23570a(new C41601b());

    /* renamed from: b */
    private final LongVideoCategoryApi m132477b() {
        return (LongVideoCategoryApi) this.f108118b.getValue();
    }

    /* renamed from: c */
    private final C41603a<List<VideoCategoryParam>> m132478c() {
        return (C41603a) this.f108119c.getValue();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo102222a() {
        if (m132478c().mo102230a()) {
            return m132479d();
        }
        return m132480e();
    }

    /* renamed from: e */
    private final List<VideoCategoryParam> m132480e() {
        List<VideoCategoryParam> list = (List) m132478c().mo102232c();
        if (list == null) {
            list = C7525m.m23461a();
        }
        if (!list.isEmpty()) {
            return list;
        }
        return (List) m132478c().mo102231b();
    }

    /* renamed from: d */
    private final List<VideoCategoryParam> m132479d() {
        try {
            Object service = ServiceManager.get().getService(I18nManagerService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…nagerService::class.java)");
            String appLanguage = ((I18nManagerService) service).getAppLanguage();
            m132477b();
            Api a = LongVideoCategoryApi.m132473a();
            C7573i.m23582a((Object) appLanguage, "appLanguage");
            List<C41609a> list = ((C41608a) a.getLongVideoCategory(appLanguage).get()).f108114c;
            if (list == null) {
                return m132480e();
            }
            Iterable<C41609a> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (C41609a aVar : iterable) {
                arrayList.add(new VideoCategoryParam(aVar.f108116b, aVar.f108115a));
            }
            List<VideoCategoryParam> list2 = (List) arrayList;
            m132476a(list2);
            return list2;
        } catch (Exception unused) {
            return m132480e();
        }
    }

    /* renamed from: a */
    private final void m132476a(List<VideoCategoryParam> list) {
        m132478c().mo102229a(list);
    }
}
