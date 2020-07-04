package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33334i;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.GameElementsAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33300b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33302d;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33347a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.GameElementsFragment */
public class GameElementsFragment extends MoreElementsFragment<GameInfo, C1293v> implements C33334i, C33335j<GameInfo> {

    /* renamed from: k */
    private C33300b<GameInfo, C33347a> f87071k;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85485g() {
        super.mo85485g();
        this.f87090a.setText(getString(R.string.a_8));
        this.f87091b.setText(getString(R.string.a9s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo85487i() {
        this.f87099j = new C25674b();
        this.f87071k = new C33302d();
        this.f87099j.mo66537a(this);
        this.f87099j.mo66536a(this.f87071k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85486h() {
        super.mo85486h();
        this.f87097h = new GameElementsAdapter();
        this.f87097h.f86999b = this;
        ((GameElementsAdapter) this.f87097h).f87007c = this;
        this.f87098i = LoadMoreAdapter.m86888a((C1262a<VH>) this.f87097h);
        this.f87095f.setAdapter(this.f87098i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85483a(Object obj) {
        m107793b((GameInfo) obj);
    }

    /* renamed from: b */
    private static void m107793b(GameInfo gameInfo) {
        if (gameInfo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", gameInfo.getId());
            } catch (JSONException e) {
                C6921a.m21554a((Exception) e);
            }
            String a = C33336b.m107781a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_content", jSONObject.toString());
            linkedHashMap.put("scene", "201014");
            C33336b.m107786a(C33336b.m107784a(a, (Map<String, String>) linkedHashMap));
        }
    }

    /* renamed from: a */
    public final void mo85482a(GameInfo gameInfo) {
        String str;
        if (gameInfo != null) {
            C6907h.m21524a("gc_label_game_add", (Map) C22984d.m75611a().mo59973a("game_name", gameInfo.getName()).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "enter_page").f60753a);
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(gameInfo.getTitle())) {
                str = gameInfo.getName();
            } else {
                str = gameInfo.getTitle();
            }
            try {
                jSONObject.put("id", gameInfo.getId());
                jSONObject.put("name", gameInfo.getName());
                jSONObject.put("icon", gameInfo.getIcon());
                jSONObject.put("title", gameInfo.getTitle());
                jSONObject.put("description", gameInfo.getDescription());
                jSONObject.put("extra", gameInfo.getExtra());
                jSONObject.put(POIService.KEY_KEYWORD, str);
            } catch (JSONException e) {
                C6921a.m21554a((Exception) e);
            }
            String a = C33336b.m107781a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_content", jSONObject.toString());
            try {
                jSONObject.put("url", C33336b.m107784a(a, (Map<String, String>) linkedHashMap));
            } catch (JSONException e2) {
                C6921a.m21554a((Exception) e2);
            }
            C33336b.m107787a(str, jSONObject.toString());
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<GameInfo> list, boolean z) {
        super.mo59099a(list, z);
        C6907h.m21524a("gc_label_page_show", (Map) C22984d.m75611a().mo59973a("position", "enter_page").f60753a);
    }
}
