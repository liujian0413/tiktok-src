package com.p280ss.android.ugc.aweme.p1216fe.method.feeds;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27639h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api.C27986a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api.IDynamicApi;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api.IDynamicApi.C27985a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.p1221b.C27989a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a */
public final class C27976a extends C25673a<Aweme, C27989a> {

    /* renamed from: d */
    public static final C27977a f73700d = new C27977a(null);

    /* renamed from: a */
    public int f73701a;

    /* renamed from: b */
    public final String f73702b;

    /* renamed from: c */
    public final C27986a f73703c;

    /* renamed from: e */
    private final C47562b f73704e;

    /* renamed from: f */
    private String f73705f;

    /* renamed from: g */
    private int f73706g;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$a */
    public static final class C27977a {
        private C27977a() {
        }

        public /* synthetic */ C27977a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27976a m91578a(C27989a aVar, String str, C27986a aVar2) {
            C7573i.m23587b(aVar, "data");
            C7573i.m23587b(str, "reactId");
            C7573i.m23587b(aVar2, "reporter");
            return new C27976a(aVar, str, aVar2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$b */
    static final class C27978b<T> implements C7326g<C27989a> {

        /* renamed from: a */
        final /* synthetic */ C27976a f73707a;

        C27978b(C27976a aVar) {
            this.f73707a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C27989a aVar) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f73707a.f73702b);
            jSONObject2.put("page", this.f73707a.f73701a);
            jSONObject2.put("has_more", aVar.f73719b);
            jSONObject2.put("exist_list_raw", C27639h.m90621a(aVar.f73718a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            this.f73707a.f73703c.mo71383b("notification", jSONObject, 3);
            this.f73707a.handleData(aVar);
            this.f73707a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$c */
    static final class C27979c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C27976a f73708a;

        C27979c(C27976a aVar) {
            this.f73708a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f73708a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$d */
    static final class C27980d<T> implements C7326g<C27989a> {

        /* renamed from: a */
        final /* synthetic */ C27976a f73709a;

        C27980d(C27976a aVar) {
            this.f73709a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C27989a aVar) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f73709a.f73702b);
            jSONObject2.put("page", this.f73709a.f73701a);
            jSONObject2.put("has_more", aVar.f73719b);
            jSONObject2.put("exist_list_raw", C27639h.m90621a(aVar.f73718a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            this.f73709a.f73703c.mo71383b("notification", jSONObject, 3);
            this.f73709a.handleData(aVar);
            this.f73709a.mIsLoading = false;
            List<C25678f> list = this.f73709a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        fVar.mo56977b();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$e */
    static final class C27981e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C27976a f73710a;

        C27981e(C27976a aVar) {
            this.f73710a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            Throwable th2;
            this.f73710a.mIsLoading = false;
            List<C25678f> list = this.f73710a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        if (!(th instanceof Exception)) {
                            th2 = null;
                        } else {
                            th2 = th;
                        }
                        fVar.mo57296a((Exception) th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71446a() {
        this.f73704e.dispose();
    }

    public final List<Aweme> getItems() {
        return ((C27989a) this.mData).f73718a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C27989a) this.mData).f73719b) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m91574a(false);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m91574a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(C27989a aVar) {
        this.f73701a++;
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f73718a.isEmpty();
            ((C27989a) this.mData).f73719b = aVar.f73719b;
            ((C27989a) this.mData).f73718a.addAll(aVar.f73718a);
        }
    }

    /* renamed from: a */
    private void m91574a(boolean z) {
        int i;
        this.mIsLoading = true;
        C47562b bVar = this.f73704e;
        String str = this.f73705f;
        if (str == null) {
            C7573i.m23583a("requestUrl");
        }
        IDynamicApi a = C27985a.m91586a(str);
        String str2 = this.f73705f;
        if (str2 == null) {
            C7573i.m23583a("requestUrl");
        }
        HashMap hashMap = new HashMap();
        String str3 = "page";
        if (z) {
            i = 0;
        } else {
            i = this.f73701a;
        }
        hashMap.put(str3, String.valueOf(i));
        hashMap.put("size", String.valueOf(this.f73706g));
        bVar.mo119661a(a.loadVideos(str2, hashMap).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C27980d<Object>(this), (C7326g<? super Throwable>) new C27981e<Object>(this)));
    }

    private C27976a(C27989a aVar, String str, C27986a aVar2) {
        this.f73702b = str;
        this.f73703c = aVar2;
        this.mData = aVar;
        this.f73704e = new C47562b();
        this.f73706g = 20;
    }

    /* renamed from: a */
    public final void mo71448a(String str, int i, int i2) {
        C7573i.m23587b(str, "baseUrl");
        this.f73705f = str;
        this.f73701a = i;
        this.f73706g = i2;
        C47562b bVar = this.f73704e;
        IDynamicApi a = C27985a.m91586a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("size", String.valueOf(i2));
        bVar.mo119661a(a.loadVideos(str, hashMap).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C27978b<Object>(this), (C7326g<? super Throwable>) new C27979c<Object>(this)));
    }

    public /* synthetic */ C27976a(C27989a aVar, String str, C27986a aVar2, C7571f fVar) {
        this(aVar, str, aVar2);
    }
}
