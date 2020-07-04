package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.widget.EditText;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.ElementAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter.MediumSearchViewHolder;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33308h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.shortvideo.p1577h.C39995a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MediumSearchFragment */
public final class MediumSearchFragment extends SearchElementsFragment<MediumInfo, MediumSearchViewHolder> implements C33335j<MediumInfo>, C39995a {

    /* renamed from: j */
    private HashMap f87074j;

    /* renamed from: n */
    private void m107814n() {
        if (this.f87074j != null) {
            this.f87074j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m107814n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85488g() {
        super.mo85488g();
        EditText editText = this.f87105d;
        C7573i.m23582a((Object) editText, "mSearch");
        editText.setHint("搜索影视综艺");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85489h() {
        this.f87106e = new MediumSearchAdapter();
        this.f87106e.f86999b = this;
        ElementAdapter elementAdapter = this.f87106e;
        if (elementAdapter != null) {
            ((MediumSearchAdapter) elementAdapter).mo85465a(this);
            super.mo85489h();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85483a(Object obj) {
        m107813b((MediumInfo) obj);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87102a = "medium_search_history";
        this.f87110i = new C33308h();
    }

    /* renamed from: b */
    private static void m107813b(MediumInfo mediumInfo) {
        if (mediumInfo != null) {
            Map linkedHashMap = new LinkedHashMap();
            String str = "movie_id";
            String id = mediumInfo.getId();
            if (id == null) {
                id = "";
            }
            linkedHashMap.put(str, id);
            linkedHashMap.put("enter_from", "video_post_page");
            C41513aa.m132240a(C33336b.m107784a(C41513aa.m132237a(), linkedHashMap));
            String str2 = "video_post_page";
            String id2 = mediumInfo.getId();
            if (id2 == null) {
                id2 = "";
            }
            C41513aa.m132241a(str2, id2);
        }
    }

    /* renamed from: a */
    public final void mo85490a(MediumInfo mediumInfo) {
        C7573i.m23587b(mediumInfo, "info");
        JSONObject jSONObject = new JSONObject();
        String str = "id";
        String id = mediumInfo.getId();
        if (id == null) {
            id = "";
        }
        jSONObject.put(str, id);
        String str2 = POIService.KEY_KEYWORD;
        String name = mediumInfo.getName();
        if (name == null) {
            name = "";
        }
        jSONObject.put(str2, name);
        int type = AnchorBusinessType.MEDIUM.getTYPE();
        String jSONObject2 = jSONObject.toString();
        C7573i.m23582a((Object) jSONObject2, "contentMap.toString()");
        String name2 = mediumInfo.getName();
        if (name2 == null) {
            name2 = "";
        }
        AnchorTransData anchorTransData = new AnchorTransData(type, jSONObject2, name2, "影视综艺", null, null, null, 112, null);
        C42961az.m136380a(new C24522a(anchorTransData));
        String str3 = "add_entertainment_anchor";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "video_post_page");
        String str4 = "entertainment_id";
        String id2 = mediumInfo.getId();
        if (id2 == null) {
            id2 = "";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, id2).mo59973a("type", "search").f60753a);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<MediumInfo> list, boolean z) {
        super.mo59099a(list, z);
        C6907h.m21524a("search_entertainment_anchor", (Map) C22984d.m75611a().mo59973a("enter_from", "video_post_page").f60753a);
    }
}
