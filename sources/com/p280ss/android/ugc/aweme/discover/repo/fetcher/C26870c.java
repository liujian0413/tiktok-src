package com.p280ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.jedi.model.p602d.C11800e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.discover.api.HotSearchApi.C26558a;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.c */
public final class C26870c extends C11800e<Integer, HotSearchListResponse> {

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.c$a */
    static final class C26871a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26871a f70885a = new C26871a();

        C26871a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88179a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static HotSearchListResponse m88179a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            for (HotSearchItem logPb : data.getList()) {
                logPb.setLogPb(hotSearchListResponse.getLogPb());
            }
            return hotSearchListResponse;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C7492s mo29350a(Object obj) {
        return m88177a(((Number) obj).intValue());
    }

    /* renamed from: a */
    private static C7492s<HotSearchListResponse> m88177a(int i) {
        C7492s<HotSearchListResponse> b = C26558a.m87299a().getHotSearchList(Integer.valueOf(i), C25293bu.m83101a(), Integer.valueOf(0), "", " ", "").mo19317d((C7327h<? super T, ? extends R>) C26871a.f70885a).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "HotSearchApi.INSTANCE.ge…scribeOn(Schedulers.io())");
        return b;
    }
}
