package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33334i;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.GameSearchAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.GameSearchAdapter.GameSearchViewHolder;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33304f;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.GameSearchFragment */
public class GameSearchFragment extends SearchElementsFragment<GameInfo, GameSearchViewHolder> implements C33334i, C33335j<GameInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85488g() {
        super.mo85488g();
        this.f87105d.setHint(getString(R.string.a9s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85489h() {
        this.f87106e = new GameSearchAdapter();
        this.f87106e.f86999b = this;
        ((GameSearchAdapter) this.f87106e).f87012c = this;
        super.mo85489h();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85483a(Object obj) {
        m107800b((GameInfo) obj);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87102a = "game_search_history";
        this.f87110i = new C33304f();
    }

    /* renamed from: b */
    private static void m107800b(GameInfo gameInfo) {
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
            C6907h.m21524a("gc_label_game_add", (Map) C22984d.m75611a().mo59973a("game_name", gameInfo.getName()).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "search_result").f60753a);
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
            getActivity().finish();
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<GameInfo> list, boolean z) {
        super.mo59099a(list, z);
        C6907h.m21524a("gc_label_page_show", (Map) C22984d.m75611a().mo59973a("position", "search_result").f60753a);
    }
}
