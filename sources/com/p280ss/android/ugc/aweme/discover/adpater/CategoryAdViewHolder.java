package com.p280ss.android.ugc.aweme.discover.adpater;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d;
import com.p280ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.p280ss.android.ugc.aweme.discover.widget.CategoryAdView;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.adpater.CategoryAdViewHolder */
public class CategoryAdViewHolder extends BaseCategoryNewViewHolder implements C25696d {

    /* renamed from: a */
    private int f70003a;

    /* renamed from: b */
    public final void mo68162b(int i) {
        this.f70003a = i;
        ((CategoryAdView) this.itemView).setCategoryOrAdStartPos(i);
    }

    /* renamed from: a */
    private static void m87240a(CategoryListAdInfo categoryListAdInfo) {
        if (categoryListAdInfo != null) {
            IMiniAppService a = C7167b.m22380b().mo18647a();
            String openUrl = categoryListAdInfo.getOpenUrl();
            String mpUrl = categoryListAdInfo.getMpUrl();
            if (!TextUtils.isEmpty(openUrl)) {
                a.preloadMiniApp(openUrl);
            }
            if (!TextUtils.isEmpty(mpUrl)) {
                a.preloadMiniApp(mpUrl);
            }
        }
    }

    public CategoryAdViewHolder(View view, RecyclerView recyclerView) {
        super(view, recyclerView);
    }

    /* renamed from: a */
    public final void mo68161a(CategoryListAdInfo categoryListAdInfo, int i) {
        m87240a(categoryListAdInfo);
        ((CategoryAdView) this.itemView).setAd(categoryListAdInfo);
        ((CategoryAdView) this.itemView).setPos(i);
        mo67910a(i);
    }

    /* renamed from: a */
    public final void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            CategoryListAdInfo ad = ((CategoryAdView) this.itemView).getAd();
            if (ad != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("topic_order", Integer.valueOf((i + 1) - this.f70003a));
                C24958f.m81905a().mo65266a("list_ad").mo65276b("show").mo65264a(ad.getCreativeId()).mo65286h(ad.getLogExtra()).mo65265a((Object) hashMap).mo65270a(this.itemView.getContext());
                if (!(ad.getTrackUrlList() == null || ad.getTrackUrlList().getUrlList() == null)) {
                    C24962g.m81954a((C24939aj) new C26538a(ad), (Collection<String>) ad.getTrackUrlList().getUrlList(), true);
                }
            }
        }
    }
}
