package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24509a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26778c;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26779d;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryNewViewHolder */
public class CategoryNewViewHolder extends BaseCategoryNewViewHolder implements C25696d {

    /* renamed from: a */
    AnimatedImageView f69447a;

    /* renamed from: b */
    DmtTextView f69448b;

    /* renamed from: c */
    public int f69449c;

    /* renamed from: d */
    private Category f69450d;

    /* renamed from: a */
    public final void mo67929a(boolean z) {
        if (z) {
            this.f69447a.mo60861b();
        } else {
            this.f69447a.mo60862c();
        }
    }

    /* renamed from: a */
    public final void mo67926a() {
        this.f69447a.setAttached(true);
        this.f69447a.setUserVisibleHint(true);
        m86762b(this.f69450d.getWord());
    }

    /* renamed from: c */
    private boolean m86763c() {
        if ((!C6399b.m19944t() || !C7188c.m22428a()) && C29958a.m98225a(this.itemView.getContext()) && C37656k.m120485a(this.itemView.getContext())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo67930b() {
        this.f69447a.setAttached(false);
        this.f69447a.setUserVisibleHint(false);
        this.f69447a.mo60862c();
    }

    /* renamed from: a */
    private static void m86760a(Word word) {
        if (word != null) {
            new C26778c().mo68556a(word).mo85252e();
        }
    }

    /* renamed from: b */
    private static void m86762b(Word word) {
        if (word != null && !word.isShowed()) {
            word.setShowed(true);
            new C26779d().mo68556a(word).mo85252e();
        }
    }

    /* renamed from: a */
    private void m86759a(CategoryCoverStruct categoryCoverStruct) {
        if (categoryCoverStruct != null) {
            if (!m86763c() || !m86761a(categoryCoverStruct.getDynamicCover())) {
                C23323e.m76524b(this.f69447a, categoryCoverStruct.getCover());
                return;
            }
            this.f69447a.mo60860a(categoryCoverStruct.getDynamicCover());
            C23323e.m76524b(this.f69447a, categoryCoverStruct.getDynamicCover());
        }
    }

    /* renamed from: a */
    private static boolean m86761a(UrlModel urlModel) {
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

    public CategoryNewViewHolder(View view, RecyclerView recyclerView) {
        super(view, recyclerView);
        this.f69447a = (AnimatedImageView) view.findViewById(R.id.b7x);
        this.f69448b = (DmtTextView) view.findViewById(R.id.e3f);
    }

    /* renamed from: a */
    public final void mo67911a(Category category, int i) {
        super.mo67911a(category, i);
        this.f69450d = category;
        if (category.isChallenge()) {
            Challenge challenge = category.getChallenge();
            DmtTextView dmtTextView = this.f69448b;
            StringBuilder sb = new StringBuilder("#");
            sb.append(challenge.getChallengeName());
            dmtTextView.setText(sb.toString());
            m86759a(challenge.getCategoryCover());
            this.itemView.setOnClickListener(new C26482b(this, challenge, category, i));
            return;
        }
        if (category.isMusic()) {
            Music music = category.getMusic();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append("*");
            spannableStringBuilder.setSpan(new C24509a(this.itemView.getContext(), R.drawable.a6b), 0, 1, 17);
            this.f69448b.setText(music.getMusicName());
            spannableStringBuilder.append(music.getMusicName());
            this.f69448b.setText(spannableStringBuilder);
            m86759a(music.getCategoryCover());
            this.itemView.setOnClickListener(new C26483c(this, music, category));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67928a(Music music, Category category, View view) {
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(music.getCategoryCover().getAwemeId());
        C7195s.m22438a().mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "discovery").mo18694a("video_from", "from_music").mo18693a("video_type", 0).mo18694a("music_id", String.valueOf(music.getId())).mo18695a());
        m86760a(category.getWord());
        C6907h.m21524a("cell_click", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").mo59971a("music_id", music.getId()).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67927a(Challenge challenge, Category category, int i, View view) {
        C6907h.m21524a("cell_click", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", challenge.getCid()).f60753a);
        m86760a(category.getWord());
        if (challenge.isCommerceAndValid()) {
            String uuid = UUID.randomUUID().toString();
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
            sb.append(challenge.getCid());
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("enter_from", "discovery").mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).mo18694a("is_commerce", "1").mo18694a("process_id", uuid).mo18695a());
            C6907h.m21524a("enter_tag_detail", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", challenge.getCid()).mo59973a("process_id", uuid).f60753a);
        } else {
            String str = "from_discovery_challenge";
            if (challenge.getCategoryCover() != null) {
                StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                sb2.append(challenge.getCategoryCover().getAwemeId());
                C7195s.m22438a().mo18682a(C7203u.m22460a(sb2.toString()).mo18694a("refer", "discovery").mo18694a("video_from", str).mo18693a("video_type", 2).mo18694a("challenge_id", challenge.getCid()).mo18695a());
            } else {
                return;
            }
        }
        if (category.isChallengeAd()) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf((i + 1) - this.f69449c));
            C24958f.m81905a().mo65266a("list_ad").mo65276b("click").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65265a((Object) hashMap).mo65270a(this.itemView.getContext());
        }
    }

    /* renamed from: a */
    public final void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 == 1 && this.f69450d != null && this.f69450d.isChallengeAd()) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf((i + 1) - this.f69449c));
            C24958f.m81905a().mo65266a("list_ad").mo65276b("show").mo65264a(Long.valueOf(this.f69450d.getCreativeId())).mo65286h(this.f69450d.getLogExtra()).mo65265a((Object) hashMap).mo65270a(this.itemView.getContext());
        }
    }
}
