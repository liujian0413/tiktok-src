package com.p280ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.abtest.EnableHotSearchAwemeBillboardExperiment;
import com.p280ss.android.ugc.aweme.discover.hotspot.C26688a.C26689a;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.widget.flowlayout.C43554a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder */
public class HotSearchWordViewHolder extends BaseWordViewHolder<HotSearchItem> {

    /* renamed from: g */
    public static final List<HotSearchItem> f69515g;

    /* renamed from: h */
    public String f69516h;

    /* renamed from: i */
    public C27013b f69517i;

    static {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new HotSearchItem());
        f69515g = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private boolean m86849e() {
        if (TextUtils.equals(this.f69516h, "hot_search_general_search") || TextUtils.equals(this.f69516h, "hot_search_video_search")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo67915b() {
        C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("action_type", "show").f60753a);
        super.mo67917c();
    }

    /* renamed from: d */
    public static boolean m86848d() {
        if (!((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().mo59877d()).booleanValue() || !((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().mo59877d()).booleanValue() || !C6384b.m19835a().mo15292a(EnableHotSearchAwemeBillboardExperiment.class, true, "enable_hotsearch_aweme_billboard", C6384b.m19835a().mo15295d().enable_hotsearch_aweme_billboard, false)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67912a() {
        this.f69427a.getPaint().setFakeBoldText(true);
        this.f69430d.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("action_type", "click").f60753a);
                if (!C6900g.m21454b().mo16943d()) {
                    C10761a.m31403c(C6399b.m19921a(), HotSearchWordViewHolder.this.itemView.getResources().getString(R.string.cjs)).mo25750a();
                }
                SmartRouter.buildRoute(HotSearchWordViewHolder.this.itemView.getContext(), "//search/trending").open();
                if (HotSearchWordViewHolder.m86848d()) {
                    SharePrefCache.inst().getIsShowRankingIndicator().mo59871a(Boolean.valueOf(false));
                }
            }
        });
        if (m86849e()) {
            this.f69427a.setText(R.string.bet);
            this.f69430d.setVisibility(8);
        } else {
            this.f69430d.setVisibility(0);
        }
        if (TextUtils.equals(this.f69516h, "hot_search_section_discovery")) {
            C23487o.m77140a(this.f69431e, 0);
        } else {
            C23487o.m77140a(this.f69431e, 8);
        }
    }

    /* renamed from: c */
    public final void mo67918c(List<HotSearchItem> list) {
        C23487o.m77140a((View) this.f69429c, 0);
        C23487o.m77140a(this.f69428b, 8);
        this.f69432f = list;
        this.f69429c.setAdapter(new C43554a<HotSearchItem>(list) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public View mo67958a(FlowLayout flowLayout, final int i, final HotSearchItem hotSearchItem) {
                View inflate = LayoutInflater.from(HotSearchWordViewHolder.this.itemView.getContext()).inflate(R.layout.wm, flowLayout, false);
                TextView textView = (TextView) inflate.findViewById(R.id.dvv);
                TextView textView2 = (TextView) inflate.findViewById(R.id.e30);
                if (hotSearchItem.getType() == 0) {
                    C26689a.m87671a(HotSearchWordViewHolder.this.itemView.getContext(), textView, hotSearchItem.getLabel(), false);
                } else if (hotSearchItem.getType() == 1) {
                    textView2.setVisibility(8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(HotSearchWordViewHolder.this.itemView.getResources().getDrawable(R.drawable.a89), null, null, null);
                }
                textView.setText(hotSearchItem.getWord());
                inflate.setOnTouchListener(new C27009an() {
                    /* renamed from: b */
                    public final void mo67959b(View view, MotionEvent motionEvent) {
                        if (HotSearchWordViewHolder.this.f69517i == null) {
                            return;
                        }
                        if (hotSearchItem.getType() == 0) {
                            HotSearchWordViewHolder.this.mo67970a(hotSearchItem, i);
                            HotSearchWordViewHolder.this.f69517i.mo68315a(hotSearchItem, i, HotSearchWordViewHolder.this.f69516h);
                            return;
                        }
                        if (hotSearchItem.getType() == 1) {
                            HotSearchWordViewHolder.this.mo67972b(hotSearchItem, i);
                            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                            sb.append(hotSearchItem.getChallengeId());
                            C7195s.m22438a().mo18682a(sb.toString());
                        }
                    }
                });
                return inflate;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo67916b(List<HotSearchItem> list) {
        if (!list.equals(f69515g)) {
            return false;
        }
        C23487o.m77140a(this.f69428b, 0);
        C23487o.m77140a((View) this.f69429c, 8);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo67913a(HotSearchItem hotSearchItem, int i) {
        String str;
        String str2;
        if (!hotSearchItem.getHasSentMob()) {
            hotSearchItem.setHasSentMob(true);
            String str3 = "hot_search_keyword";
            C22984d a = C22984d.m75611a().mo59973a("action_type", "show").mo59973a("key_word", hotSearchItem.getWord());
            String str4 = "key_word_type";
            if (hotSearchItem.getType() == 1) {
                str = "tag";
            } else {
                str = "general_word";
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).mo59970a(POIService.KEY_ORDER, i + 1).mo59973a("enter_from", this.f69516h).f60753a);
            if (TextUtils.equals(this.f69516h, "hot_search_section_search")) {
                str2 = "hot_search_keyword_show";
            } else {
                str2 = "hot_search_keyword_show_detail";
            }
            if (hotSearchItem.isAd()) {
                C24962g.m81952a((C24939aj) new C26490j(this, hotSearchItem), hotSearchItem.getAdData().getTrackUrl(), true);
                C24958f.m81905a().mo65266a("result_ad").mo65276b(str2).mo65283e(this.f69516h).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
                C24958f.m81905a().mo65266a("result_ad").mo65276b("show").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo67970a(HotSearchItem hotSearchItem, int i) {
        String str;
        C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", hotSearchItem.getWord()).mo59973a("key_word_type", "general_word").mo59970a(POIService.KEY_ORDER, i + 1).mo59973a("enter_from", this.f69516h).f60753a);
        if (TextUtils.equals(this.f69516h, "hot_search_section_search")) {
            str = "hot_search_keyword_click";
        } else {
            str = "hot_search_keyword_click_detail";
        }
        if (hotSearchItem.isAd()) {
            C24962g.m81952a((C24939aj) new C26491k(hotSearchItem.getAdData()), hotSearchItem.getAdData().getClickTrackUrl(), true);
            C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69516h).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            C24958f.m81905a().mo65266a("result_ad").mo65276b("click").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
        }
    }

    /* renamed from: b */
    public final void mo67972b(HotSearchItem hotSearchItem, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", hotSearchItem.getChallengeId());
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
        int i2 = i + 1;
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("tag_id", hotSearchItem.getChallengeId()).mo59970a(POIService.KEY_ORDER, i2).mo59973a("enter_from", this.f69516h).mo59973a("log_pb", new C6600e().mo15979b((Object) hotSearchItem.getLogPb())).f60753a);
        C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", hotSearchItem.getWord()).mo59973a("key_word_type", "tag").mo59970a(POIService.KEY_ORDER, i2).mo59973a("enter_from", this.f69516h).f60753a);
        if (hotSearchItem.isAd()) {
            if (TextUtils.equals(this.f69516h, "hot_search_section_search")) {
                str = "hot_search_keyword_click";
            } else {
                str = "hot_search_keyword_click_detail";
            }
            C24962g.m81952a((C24939aj) new C26492l(hotSearchItem.getAdData()), hotSearchItem.getAdData().getClickTrackUrl(), true);
            C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69516h).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            C24958f.m81905a().mo65266a("result_ad").mo65276b("click").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
        }
    }

    private HotSearchWordViewHolder(View view, String str, C27013b bVar) {
        super(view);
        this.f69516h = str;
        this.f69517i = bVar;
        mo67912a();
    }

    /* renamed from: a */
    public static HotSearchWordViewHolder m86844a(ViewGroup viewGroup, String str, C27013b bVar) {
        return new HotSearchWordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wl, viewGroup, false), str, bVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m86845a(HotSearchAdData hotSearchAdData, String str, String str2, long j) {
        if (hotSearchAdData != null) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(hotSearchAdData.getCreativeId())).mo65286h(hotSearchAdData.getLogExtra()).mo65279c(Long.valueOf(-1)).mo65278b();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m86846b(HotSearchAdData hotSearchAdData, String str, String str2, long j) {
        if (hotSearchAdData != null) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(hotSearchAdData.getCreativeId())).mo65286h(hotSearchAdData.getLogExtra()).mo65279c(Long.valueOf(-1)).mo65278b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67971a(HotSearchItem hotSearchItem, String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65261a(hotSearchItem.getAdData()).mo65270a(this.itemView.getContext());
    }
}
