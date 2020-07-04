package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.hotsearch.p1293a.C30352b;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoItemViewHolder */
public class HotVideoItemViewHolder extends C1293v {

    /* renamed from: a */
    private String f69523a;

    /* renamed from: b */
    private C30352b<Aweme> f69524b;

    /* renamed from: c */
    private Aweme f69525c;
    AnimatedImageView mCover;
    TextView mRank;
    TextView mText;

    /* renamed from: b */
    private boolean m86867b() {
        if ((!C6399b.m19944t() || !C7188c.m22428a()) && C29958a.m98225a(this.itemView.getContext()) && C37656k.m120485a(this.itemView.getContext())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m86863a() {
        if (!m86867b() || m86866a(this.f69525c.getVideo())) {
            C23323e.m76524b(this.mCover, this.f69525c.getVideo().getCover());
            return;
        }
        this.mCover.mo60860a(this.f69525c.getVideo().getDynamicCover());
        C23323e.m76509a((RemoteImageView) this.mCover, this.f69525c.getVideo().getDynamicCover(), this.mCover.getControllerListener());
        this.mCover.setUserVisibleHint(true);
        this.mCover.setAttached(true);
    }

    /* renamed from: a */
    private void m86864a(int i) {
        C30357c.m99189a(this.mRank, i + 1, 4);
    }

    /* renamed from: a */
    private void m86865a(long j) {
        String a = C30537o.m99738a(j);
        this.mText.setText(this.itemView.getContext().getString(R.string.e_s, new Object[]{a}));
    }

    /* renamed from: a */
    private static boolean m86866a(Video video) {
        if (video == null || video.getDynamicCover() == null || TextUtils.isEmpty(video.getDynamicCover().getUri()) || video.getDynamicCover().getUrlList() == null || video.getDynamicCover().getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo67975a(boolean z) {
        if (z) {
            this.mCover.mo60861b();
        } else {
            this.mCover.mo60862c();
        }
    }

    /* renamed from: a */
    public final void mo67974a(HotVideoItem hotVideoItem, int i) {
        if (hotVideoItem != null) {
            this.f69525c = hotVideoItem.getAweme();
            if (this.f69525c != null) {
                m86863a();
                m86864a(i);
                m86865a(hotVideoItem.getHotValue());
                this.itemView.setOnClickListener(new C26493m(this, i, hotVideoItem));
            }
        }
    }

    private HotVideoItemViewHolder(View view, String str, C30352b<Aweme> bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69523a = str;
        this.f69524b = bVar;
    }

    /* renamed from: a */
    public static HotVideoItemViewHolder m86862a(ViewGroup viewGroup, String str, C30352b<Aweme> bVar) {
        return new HotVideoItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3t, viewGroup, false), str, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67973a(int i, HotVideoItem hotVideoItem, View view) {
        C6907h.m21524a("hot_search_video_keyword", (Map) new C22984d().mo59973a("group_id", this.f69525c.getAid()).mo59973a("author_id", this.f69525c.getAuthorUid()).mo59973a("action_type", "click").mo59973a("enter_from", "discovery").mo59970a(POIService.KEY_ORDER, i + 1).f60753a);
        this.f69524b.mo67980a(hotVideoItem.getAweme(), i);
    }
}
