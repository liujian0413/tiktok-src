package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder */
public class HotSearchImageItemNewViewHolder extends C1293v {

    /* renamed from: a */
    public String f69496a;

    /* renamed from: b */
    public C27013b f69497b;

    /* renamed from: c */
    private LogPbBean f69498c;
    RemoteImageView mImageView;
    View mMaskView;
    HotSearchTitleTextView mTitleView;

    /* renamed from: a */
    private void m86818a(HotSearchItem hotSearchItem) {
        if (m86820a(hotSearchItem.getUrlModel())) {
            int b = (int) C9738o.m28708b(this.mImageView.getContext(), 100.0f);
            C23323e.m76506a(this.mImageView, hotSearchItem.getUrlModel(), b, b);
            return;
        }
        this.mMaskView.setVisibility(8);
        this.mImageView.setImageDrawable(this.itemView.getResources().getDrawable(R.color.ee));
    }

    /* renamed from: a */
    private static boolean m86820a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        for (String isEmpty : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo67961b(HotSearchItem hotSearchItem, int i) {
        String str;
        C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", hotSearchItem.getWord()).mo59973a("key_word_type", "general_word").mo59970a(POIService.KEY_ORDER, i + 1).mo59973a("enter_from", this.f69496a).f60753a);
        if (TextUtils.equals(this.f69496a, "hot_search_section_search")) {
            str = "hot_search_keyword_click";
        } else {
            str = "hot_search_keyword_click_detail";
        }
        if (hotSearchItem.isAd()) {
            C24962g.m81952a((C24939aj) new C26486f(hotSearchItem), hotSearchItem.getAdData().getClickTrackUrl(), true);
            C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69496a).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            C24958f.m81905a().mo65266a("result_ad").mo65276b("click").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
        }
    }

    /* renamed from: a */
    public final void mo67960a(final HotSearchItem hotSearchItem, final int i) {
        if (hotSearchItem != null && !hotSearchItem.isPlaceholder()) {
            this.f69498c = hotSearchItem.getLogPb();
            m86818a(hotSearchItem);
            this.mTitleView.setHotSearchItem(hotSearchItem);
            try {
                hotSearchItem.getHotValue();
            } catch (NumberFormatException unused) {
            }
            this.itemView.setOnTouchListener(new C27009an() {
                /* renamed from: b */
                public final void mo67959b(View view, MotionEvent motionEvent) {
                    if (HotSearchImageItemNewViewHolder.this.f69497b != null) {
                        if (hotSearchItem.getType() == 0) {
                            HotSearchImageItemNewViewHolder.this.mo67961b(hotSearchItem, i);
                            HotSearchImageItemNewViewHolder.this.f69497b.mo68315a(hotSearchItem, i, HotSearchImageItemNewViewHolder.this.f69496a);
                        } else if (hotSearchItem.getType() == 1) {
                            HotSearchImageItemNewViewHolder.this.mo67962c(hotSearchItem, i);
                            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                            sb.append(hotSearchItem.getChallengeId());
                            C7195s.m22438a().mo18682a(sb.toString());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo67962c(HotSearchItem hotSearchItem, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", hotSearchItem.getChallengeId());
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
        int i2 = i + 1;
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("tag_id", hotSearchItem.getChallengeId()).mo59970a(POIService.KEY_ORDER, i2).mo59973a("enter_from", this.f69496a).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f69498c)).f60753a);
        C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", hotSearchItem.getWord()).mo59973a("key_word_type", "tag").mo59970a(POIService.KEY_ORDER, i2).mo59973a("enter_from", this.f69496a).f60753a);
        if (hotSearchItem.isAd()) {
            if (TextUtils.equals(this.f69496a, "hot_search_section_search")) {
                str = "hot_search_keyword_click";
            } else {
                str = "hot_search_keyword_click_detail";
            }
            C24962g.m81952a((C24939aj) new C26487g(hotSearchItem), hotSearchItem.getAdData().getClickTrackUrl(), true);
            C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69496a).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            C24958f.m81905a().mo65266a("result_ad").mo65276b("click").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
        }
    }

    private HotSearchImageItemNewViewHolder(View view, String str, C27013b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69496a = str;
        this.f69497b = bVar;
    }

    /* renamed from: a */
    public static HotSearchImageItemNewViewHolder m86817a(ViewGroup viewGroup, String str, C27013b bVar) {
        return new HotSearchImageItemNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wk, viewGroup, false), str, bVar);
    }
}
