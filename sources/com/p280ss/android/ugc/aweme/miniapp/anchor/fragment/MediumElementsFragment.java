package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.ElementAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33300b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33306g;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33349c;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.shortvideo.p1577h.C39995a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MediumElementsFragment */
public final class MediumElementsFragment extends MoreElementsFragment<MediumInfo, C1293v> implements C33335j<MediumInfo>, C39995a {

    /* renamed from: k */
    private C33300b<MediumInfo, C33349c> f87072k;

    /* renamed from: l */
    private HashMap f87073l;

    /* renamed from: k */
    private void m107807k() {
        if (this.f87073l != null) {
            this.f87073l.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m107807k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85485g() {
        super.mo85485g();
        DmtTextView dmtTextView = this.f87090a;
        C7573i.m23582a((Object) dmtTextView, "mTextTile");
        dmtTextView.setText("抖音影视综艺");
        DmtTextView dmtTextView2 = this.f87091b;
        C7573i.m23582a((Object) dmtTextView2, "mTextSearch");
        dmtTextView2.setText("搜索影视综艺");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85486h() {
        super.mo85486h();
        this.f87097h = new MediumElementAdapter();
        this.f87097h.f86999b = this;
        ElementAdapter elementAdapter = this.f87097h;
        if (elementAdapter != null) {
            ((MediumElementAdapter) elementAdapter).mo85461a(this);
            this.f87098i = LoadMoreAdapter.m86888a((C1262a<VH>) this.f87097h);
            RecyclerView recyclerView = this.f87095f;
            C7573i.m23582a((Object) recyclerView, "mRecyclerView");
            recyclerView.setAdapter(this.f87098i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo85487i() {
        this.f87099j = new C25674b();
        this.f87072k = new C33306g();
        this.f87099j.mo66537a(this);
        this.f87099j.mo66536a(this.f87072k);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85483a(Object obj) {
        m107806b((MediumInfo) obj);
    }

    /* renamed from: b */
    private static void m107806b(MediumInfo mediumInfo) {
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
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, id2).mo59973a("type", "recom").f60753a);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
