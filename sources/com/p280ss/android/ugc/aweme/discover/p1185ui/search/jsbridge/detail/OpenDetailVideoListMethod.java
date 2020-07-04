package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod */
public final class OpenDetailVideoListMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public C7321c f71450a;

    /* renamed from: b */
    public WeakReference<Context> f71451b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod$a */
    static final class C27080a<T> implements C7495v<List<? extends RNAweme>> {

        /* renamed from: a */
        final /* synthetic */ OpenDetailVideoListMethod f71452a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f71453b;

        /* renamed from: c */
        final /* synthetic */ C27876a f71454c;

        C27080a(OpenDetailVideoListMethod openDetailVideoListMethod, JSONObject jSONObject, C27876a aVar) {
            this.f71452a = openDetailVideoListMethod;
            this.f71453b = jSONObject;
            this.f71454c = aVar;
        }

        public final void subscribe(C47870u<List<RNAweme>> uVar) {
            C7573i.m23587b(uVar, "emitter");
            String string = this.f71453b.getString("awemeList");
            C7573i.m23582a((Object) string, "params.getString(\"awemeList\")");
            uVar.mo19239a((Object) (List) C10944e.m32113a().mo15975a(string, new C6597a<List<? extends RNAweme>>() {
            }.type));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod$b */
    static final class C27082b<T> implements C7326g<List<? extends RNAweme>> {

        /* renamed from: a */
        final /* synthetic */ OpenDetailVideoListMethod f71455a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f71456b;

        /* renamed from: c */
        final /* synthetic */ C27876a f71457c;

        C27082b(OpenDetailVideoListMethod openDetailVideoListMethod, JSONObject jSONObject, C27876a aVar) {
            this.f71455a = openDetailVideoListMethod;
            this.f71456b = jSONObject;
            this.f71457c = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<? extends RNAweme> list) {
            Context context;
            Context context2;
            try {
                String string = this.f71456b.getString("currentAwemeId");
                C7573i.m23582a((Object) string, "params.getString(\"currentAwemeId\")");
                String optString = this.f71456b.optString("enterFrom");
                C7573i.m23582a((Object) optString, "params.optString(\"enterFrom\")");
                boolean z = this.f71456b.getBoolean("hasMore");
                boolean z2 = this.f71456b.getBoolean("needProxyLoadMoreRequest");
                Bundle bundle = new Bundle();
                if (z2) {
                    C27085b a = C27089d.m88890a();
                    C7573i.m23582a((Object) list, "it");
                    a.mo69877a(list, z);
                    C28503s.m93679a((C25673a) a);
                    bundle.putString("id", string);
                    bundle.putString("video_from", "from_rn_search");
                } else {
                    C36018b bVar = new C36018b();
                    bVar.setItems(list);
                    C28503s.m93679a((C25673a) bVar);
                    bundle.putString("id", string);
                    bundle.putString("video_from", "from_rn_search");
                }
                if (TextUtils.equals("entertainment", optString)) {
                    bundle.putString("refer", "entertainment");
                    String optString2 = this.f71456b.optString("entertainment_id");
                    String optString3 = this.f71456b.optString("type");
                    String optString4 = this.f71456b.optString(POIService.KEY_ORDER);
                    if (optString4 == null) {
                        optString4 = "";
                    }
                    C41513aa.m132242a(optString, optString2, optString3, optString4);
                } else {
                    bundle.putString("refer", "general_search");
                }
                bundle.putInt("page_type", 9);
                bundle.putString("search_keyword", C27063a.m88827c());
                WeakReference<Context> weakReference = this.f71455a.f71451b;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtras(bundle);
                WeakReference<Context> weakReference2 = this.f71455a.f71451b;
                if (weakReference2 != null) {
                    context2 = (Context) weakReference2.get();
                } else {
                    context2 = null;
                }
                DetailActivity.m86050a(context2, intent, (View) null);
                C28229b.m92772a((Aweme) list.get(0));
                JSONArray jSONArray = new JSONArray();
                C27876a aVar = this.f71457c;
                if (aVar != null) {
                    aVar.mo71363a((Object) jSONArray);
                }
            } catch (Exception e) {
                C27064b.m88836a(e, "OpenDetailVideoListMethod");
                C27876a aVar2 = this.f71457c;
                if (aVar2 != null) {
                    aVar2.mo71362a(0, e.getMessage());
                }
            }
        }
    }

    public OpenDetailVideoListMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f71451b = weakReference;
    }

    public OpenDetailVideoListMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        super(aVar);
        this.f71451b = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            if (this.f71450a != null) {
                C7321c cVar = this.f71450a;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (!cVar.isDisposed()) {
                    C7321c cVar2 = this.f71450a;
                    if (cVar2 == null) {
                        C7573i.m23580a();
                    }
                    cVar2.dispose();
                }
            }
            if (jSONObject != null) {
                this.f71450a = C7492s.m23282a((C7495v<T>) new C27080a<T>(this, jSONObject, aVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C27082b<Object>(this, jSONObject, aVar));
            }
        } catch (Exception e) {
            C27064b.m88836a(e, "OpenDetailVideoListMethod");
            aVar.mo71362a(0, e.getMessage());
        }
    }
}
