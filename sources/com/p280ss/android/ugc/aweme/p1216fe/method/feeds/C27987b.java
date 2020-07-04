package com.p280ss.android.ugc.aweme.p1216fe.method.feeds;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api.C27986a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.p1221b.C27989a;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b */
public final class C27987b extends C25673a<Aweme, C27989a> {

    /* renamed from: a */
    public static final C27988a f73714a = new C27988a(null);

    /* renamed from: b */
    private int f73715b;

    /* renamed from: c */
    private final String f73716c;

    /* renamed from: d */
    private final C27986a f73717d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b$a */
    public static final class C27988a {
        private C27988a() {
        }

        public /* synthetic */ C27988a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27987b m91591a(C27989a aVar, String str, C27986a aVar2) {
            C7573i.m23587b(aVar, "data");
            C7573i.m23587b(str, "reactId");
            C7573i.m23587b(aVar2, "reporter");
            return new C27987b(aVar, str, aVar2, null);
        }
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

    /* renamed from: a */
    private final void m91588a() {
        this.mIsLoading = false;
        List<C25678f> list = this.mNotifyListeners;
        if (list != null) {
            for (C25678f fVar : list) {
                if (fVar != null) {
                    fVar.mo57296a(new Exception());
                }
            }
        }
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
        m91589a(false);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m91589a(false);
    }

    /* renamed from: a */
    private void m91589a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.f73715b + 1);
        jSONObject2.put("react_id", this.f73716c);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        this.f73717d.mo71383b("notification", jSONObject, 3);
    }

    private C27987b(C27989a aVar, String str, C27986a aVar2) {
        this.f73716c = str;
        this.f73717d = aVar2;
        this.mData = aVar;
    }

    public /* synthetic */ C27987b(C27989a aVar, String str, C27986a aVar2, C7571f fVar) {
        this(aVar, str, aVar2);
    }

    /* renamed from: a */
    public final void mo71450a(List<? extends Aweme> list, int i, boolean z, boolean z2) {
        C7573i.m23587b(list, "feeds");
        if (list.isEmpty()) {
            m91588a();
            return;
        }
        this.f73715b = i;
        C27989a aVar = (C27989a) getData();
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f73718a.isEmpty();
            ((C27989a) this.mData).f73719b = z;
            if (z2) {
                ((C27989a) this.mData).f73718a.addAll(0, list);
            } else {
                ((C27989a) this.mData).f73718a.addAll(list);
            }
        }
        this.mIsLoading = false;
        List<C25678f> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (C25678f fVar : list2) {
                if (fVar != null) {
                    fVar.mo56977b();
                }
            }
        }
    }
}
