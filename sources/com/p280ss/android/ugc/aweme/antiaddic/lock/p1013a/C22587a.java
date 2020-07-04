package com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi.C22591a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22600b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1014b.C22595a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a */
public final class C22587a {

    /* renamed from: a */
    public C22595a f60157a;

    /* renamed from: b */
    private final TeenageModeApi f60158b = C22591a.m74661a();

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$a */
    public static final class C22588a implements C7498y<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C22587a f60159a;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C22588a(C22587a aVar) {
            this.f60159a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
            C22595a aVar = this.f60159a.f60157a;
            if (aVar != null) {
                aVar.mo59248g();
            }
        }

        public final void onError(Throwable th) {
            String str;
            C7573i.m23587b(th, "e");
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                    str = C6399b.m19921a().getString(R.string.cjr);
                } else {
                    str = apiServerException.getErrorMsg();
                }
                C10761a.m31403c(C6399b.m19921a(), str).mo25750a();
            } else {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjr).mo25750a();
            }
            C22595a aVar = this.f60159a.f60157a;
            if (aVar != null) {
                aVar.mo59247f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$b */
    public static final class C22589b implements C7498y<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C22587a f60160a;

        /* renamed from: b */
        final /* synthetic */ String f60161b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
            C22595a aVar = this.f60160a.f60157a;
            if (aVar != null) {
                aVar.mo59248g();
            }
            C6877n.m21407a("compliance_api_status", "", C42967ba.m136396a().mo104680a("type", "/aweme/v1/minor/user/set/settings/").mo104680a("param", this.f60161b).mo104679a("status", Integer.valueOf(0)).mo104681b());
        }

        public final void onError(Throwable th) {
            int i;
            String str;
            C7573i.m23587b(th, "e");
            boolean z = th instanceof ApiServerException;
            if (z) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                    str = C6399b.m19921a().getString(R.string.cjr);
                } else {
                    str = apiServerException.getErrorMsg();
                }
                C10761a.m31403c(C6399b.m19921a(), str).mo25750a();
            } else {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjr).mo25750a();
            }
            String str2 = "compliance_api_status";
            String str3 = "";
            C42967ba a = C42967ba.m136396a().mo104680a("type", "/aweme/v1/minor/user/set/settings/");
            String str4 = "error_message";
            if (z) {
                i = ((ApiServerException) th).getErrorCode();
            } else {
                i = -1;
            }
            C6877n.m21407a(str2, str3, a.mo104679a(str4, Integer.valueOf(i)).mo104680a("param", this.f60161b).mo104679a("status", Integer.valueOf(1)).mo104681b());
            C22595a aVar = this.f60160a.f60157a;
            if (aVar != null) {
                aVar.mo59247f();
            }
        }

        C22589b(C22587a aVar, String str) {
            this.f60160a = aVar;
            this.f60161b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$c */
    public static final class C22590c implements C7498y<C22600b> {
        C22590c() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m74657a((C22600b) obj);
        }

        /* renamed from: a */
        private static void m74657a(C22600b bVar) {
            C7573i.m23587b(bVar, "t");
            C22598e.m74679a(bVar);
            C22598e.f60167a.mo59259i();
            TimeLockRuler.removeUserSettingWithoutNotify();
            C22598e.m74678a(C22598e.m74675a());
        }
    }

    /* renamed from: b */
    public final void mo59231b() {
        this.f60157a = null;
    }

    /* renamed from: c */
    private static int m74649c() {
        if (TimeLockRuler.isSelfContentFilterOn()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo59228a() {
        TeenageModeApi teenageModeApi = this.f60158b;
        int c = m74649c();
        int selfTimeInMin = TimeLockRuler.getSelfTimeInMin();
        String password = TimeLockRuler.getPassword();
        C7573i.m23582a((Object) password, "TimeLockRuler.getPassword()");
        teenageModeApi.syncMinorSettings(c, selfTimeInMin, C22598e.m74682b(password), TimeLockRuler.getLastPasswordSetTime() / 1000).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C22590c<Object>());
    }

    /* renamed from: a */
    public final void mo59229a(C22595a aVar) {
        C7573i.m23587b(aVar, "view");
        this.f60157a = aVar;
    }

    /* renamed from: b */
    public final void mo59232b(String str) {
        C7573i.m23587b(str, "minorSettings");
        this.f60158b.setMinorSettings(str).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C22589b<Object>(this, str));
    }

    /* renamed from: a */
    public final void mo59230a(String str) {
        C7573i.m23587b(str, "password");
        this.f60158b.checkTeenagePassword(C22598e.m74682b(str)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C22588a<Object>(this));
    }
}
