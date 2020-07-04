package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.discover.api.HotSearchApi.C26558a;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p280ss.android.ugc.aweme.discover.presenter.C26815b;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30354a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel */
public final class HotSearchViewModel extends C0063u {

    /* renamed from: c */
    public static final C27237a f71747c = new C27237a(null);

    /* renamed from: a */
    public final C23084b<C26568a<List<HotSearchItem>>> f71748a = new C23084b<>();

    /* renamed from: b */
    public final C0052o<C23073b<String, Object>> f71749b = new C0052o<>();

    /* renamed from: d */
    private C26815b f71750d;

    /* renamed from: e */
    private final C6600e f71751e = new C6600e();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$a */
    public static final class C27237a {
        private C27237a() {
        }

        public /* synthetic */ C27237a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$b */
    public static final class C27238b extends C6597a<List<? extends HotSearchItem>> {
        C27238b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$c */
    static final class C27239c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27239c f71752a = new C27239c();

        C27239c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89244a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static List<HotSearchItem> m89244a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            return data.getList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$d */
    public static final class C27240d implements C47557ad<List<? extends HotSearchItem>> {
        C27240d() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            m89245a((List) obj);
        }

        /* renamed from: a */
        private static void m89245a(List<HotSearchItem> list) {
            C7573i.m23587b(list, "t");
            C30354a.m99182a(list);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C30354a.m99182a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$e */
    static final class C27241e<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27241e f71753a = new C27241e();

        C27241e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89246a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static HotSearchListResponse m89246a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            for (HotSearchItem logPb : data.getList()) {
                logPb.setLogPb(hotSearchListResponse.getLogPb());
            }
            return hotSearchListResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$f */
    static final class C27242f<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ HotSearchViewModel f71754a;

        C27242f(HotSearchViewModel hotSearchViewModel) {
            this.f71754a = hotSearchViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<HotSearchItem> apply(HotSearchListResponse hotSearchListResponse) {
            List list;
            C7573i.m23587b(hotSearchListResponse, "it");
            C23073b bVar = new C23073b();
            String str = "key_hot_search_list";
            HotSearchEntity data = hotSearchListResponse.getData();
            if (data != null) {
                list = data.getList();
            } else {
                list = null;
            }
            bVar.mo60118a(str, list);
            bVar.mo60118a("key_operated_search_list", hotSearchListResponse.getDefaultSearchKeyword());
            bVar.mo60118a("key_operated_real_search_word", hotSearchListResponse.getRealDefaultSearchKeyword());
            bVar.mo60118a("ad_search_list", hotSearchListResponse.getAdSearchList());
            this.f71754a.f71749b.setValue(bVar);
            HotSearchEntity data2 = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data2, "it.data");
            return data2.getList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel$g */
    public static final class C27243g implements C47557ad<List<? extends HotSearchItem>> {

        /* renamed from: a */
        final /* synthetic */ HotSearchViewModel f71755a;

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C27243g(HotSearchViewModel hotSearchViewModel) {
            this.f71755a = hotSearchViewModel;
        }

        public final void onError(Throwable th) {
            boolean z;
            C26568a aVar;
            C7573i.m23587b(th, "e");
            List b = this.f71755a.mo69988b();
            C23084b<C26568a<List<HotSearchItem>>> bVar = this.f71755a.f71748a;
            Collection collection = b;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar = new C26568a(false, C7525m.m23461a());
            } else {
                aVar = new C26568a(true, b);
            }
            bVar.setValue(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(List<HotSearchItem> list) {
            boolean z;
            C26568a aVar;
            C7573i.m23587b(list, "t");
            if (list.isEmpty()) {
                list = this.f71755a.mo69988b();
            } else {
                this.f71755a.mo69987a(list);
            }
            C23084b<C26568a<List<HotSearchItem>>> bVar = this.f71755a.f71748a;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar = new C26568a(false, C7525m.m23461a());
            } else {
                aVar = new C26568a(true, list);
            }
            bVar.setValue(aVar);
        }
    }

    public HotSearchViewModel() {
        try {
            this.f71750d = (C26815b) C23336d.m76560a(AwemeApplication.m21341a(), C26815b.class);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("HotSearchViewModel getSP failed ");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: b */
    public final List<HotSearchItem> mo69988b() {
        String str;
        List<HotSearchItem> list;
        C26815b bVar = this.f71750d;
        if (bVar != null) {
            str = bVar.mo60429a();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            list = (List) this.f71751e.mo15975a(str, new C27238b().type);
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        return list;
    }

    /* renamed from: c */
    private static void m89240c() {
        C7319aa.m22929a((C7496w<? extends T>) C26558a.m87299a().getHotSearchList(Integer.valueOf(1), C25293bu.m83101a(), Integer.valueOf(0), "", " ", "").mo19317d((C7327h<? super T, ? extends R>) C27239c.f71752a).mo19304b(C7333a.m23044b())).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C27240d<Object>());
    }

    /* renamed from: a */
    public final void mo69986a() {
        C7319aa.m22929a((C7496w<? extends T>) C26558a.m87299a().getHotSearchList(Integer.valueOf(0), C25293bu.m83101a(), Integer.valueOf(0), "", " ", "")).mo19135b(C7333a.m23044b()).mo19134b((C7327h<? super T, ? extends R>) C27241e.f71753a).mo19127a(C47549a.m148327a()).mo19134b((C7327h<? super T, ? extends R>) new C27242f<Object,Object>(this)).mo19137b((C47557ad<? super T>) new C27243g<Object>(this));
        m89240c();
    }

    /* renamed from: a */
    public final void mo69987a(List<HotSearchItem> list) {
        C26815b bVar = this.f71750d;
        if (bVar != null) {
            C6600e eVar = this.f71751e;
            if (!list.isEmpty()) {
                if (list.size() > 30) {
                    list = list.subList(0, 30);
                }
                bVar.mo60430a(eVar.mo15979b((Object) list));
            }
        }
    }
}
