package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27083a.C27084a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod */
public final class OnLoadMoreRequestMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$a */
    static final class C27077a<T> implements C7495v<List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ OnLoadMoreRequestMethod f71444a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f71445b;

        /* renamed from: c */
        final /* synthetic */ C27876a f71446c;

        C27077a(OnLoadMoreRequestMethod onLoadMoreRequestMethod, JSONObject jSONObject, C27876a aVar) {
            this.f71444a = onLoadMoreRequestMethod;
            this.f71445b = jSONObject;
            this.f71446c = aVar;
        }

        public final void subscribe(C47870u<List<Aweme>> uVar) {
            C7573i.m23587b(uVar, "emitter");
            String string = this.f71445b.getString("message");
            C7573i.m23582a((Object) string, "params.getString(\"message\")");
            if (!TextUtils.equals("success", string)) {
                uVar.mo19239a((Object) C7525m.m23461a());
            } else if (C28503s.m93677a() instanceof C27085b) {
                String string2 = this.f71445b.getString("awemeList");
                C7573i.m23582a((Object) string2, "params.getString(\"awemeList\")");
                List a = OnLoadMoreRequestMethod.m88874a(string2);
                if (a == null) {
                    a = C7525m.m23461a();
                }
                uVar.mo19239a((Object) a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$b */
    static final class C27078b<T> implements C7326g<List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ OnLoadMoreRequestMethod f71447a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f71448b;

        /* renamed from: c */
        final /* synthetic */ C27876a f71449c;

        C27078b(OnLoadMoreRequestMethod onLoadMoreRequestMethod, JSONObject jSONObject, C27876a aVar) {
            this.f71447a = onLoadMoreRequestMethod;
            this.f71448b = jSONObject;
            this.f71449c = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<? extends Aweme> list) {
            try {
                String string = this.f71448b.getString("message");
                C7573i.m23582a((Object) string, "params.getString(\"message\")");
                String string2 = this.f71448b.getString("type");
                C7573i.m23582a((Object) string2, "params.getString(\"type\")");
                if (TextUtils.equals("success", string)) {
                    boolean z = this.f71448b.getBoolean("hasMore");
                    C25673a a = C28503s.m93677a();
                    if (a instanceof C27085b) {
                        if (TextUtils.equals("loadMore", string2)) {
                            C27084a aVar = ((C27085b) a).f71462h.f71458a;
                            if (aVar != null) {
                                aVar.mo69875a(list, z);
                            }
                        } else if (TextUtils.equals("loadLatest", string2)) {
                            C27084a aVar2 = ((C27085b) a).f71462h.f71459b;
                            if (aVar2 != null) {
                                aVar2.mo69875a(list, z);
                            }
                        }
                    }
                } else {
                    C25673a a2 = C28503s.m93677a();
                    if (a2 instanceof C27085b) {
                        if (TextUtils.equals("loadMore", string2)) {
                            C27084a aVar3 = ((C27085b) a2).f71462h.f71458a;
                            if (aVar3 != null) {
                                aVar3.mo69874a();
                            }
                        } else if (TextUtils.equals("loadLatest", string2)) {
                            C27084a aVar4 = ((C27085b) a2).f71462h.f71459b;
                            if (aVar4 != null) {
                                aVar4.mo69874a();
                            }
                        }
                    }
                }
                JSONArray jSONArray = new JSONArray();
                C27876a aVar5 = this.f71449c;
                if (aVar5 != null) {
                    aVar5.mo71363a((Object) jSONArray);
                }
            } catch (Exception unused) {
                C27876a aVar6 = this.f71449c;
                if (aVar6 != null) {
                    aVar6.mo71362a(0, "");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$c */
    public static final class C27079c extends C6597a<List<? extends RNAweme>> {
        C27079c() {
        }
    }

    public OnLoadMoreRequestMethod() {
    }

    public OnLoadMoreRequestMethod(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public static List<RNAweme> m88874a(String str) {
        C7573i.m23587b(str, "result");
        List<RNAweme> list = (List) C10944e.m32113a().mo15975a(str, new C27079c().type);
        C7573i.m23582a((Object) list, "list");
        return list;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            C28503s.m93679a((C25673a) C27089d.m88890a());
            if (jSONObject != null) {
                C7492s.m23282a((C7495v<T>) new C27077a<T>(this, jSONObject, aVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C27078b<Object>(this, jSONObject, aVar));
            }
        } catch (Exception e) {
            C27064b.m88836a(e, "OnLoadMoreRequestMethod");
            aVar.mo71362a(0, e.getMessage());
        }
    }
}
