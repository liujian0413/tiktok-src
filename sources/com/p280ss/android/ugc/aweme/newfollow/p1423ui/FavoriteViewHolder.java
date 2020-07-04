package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FavoriteAdapter.C34152a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FavoriteViewHolder */
public class FavoriteViewHolder extends AbsAwemeViewHolder {
    public final void bB_() {
        m110090c();
    }

    /* renamed from: a */
    public final int[] mo61580a() {
        return C43012cg.m136513a(C34943c.f91127w);
    }

    /* renamed from: c */
    private void m110090c() {
        if (this.f67534h != null) {
            if (((Aweme) this.f67534h).getAwemeType() == 2) {
                m110091k();
            } else {
                m110092l();
            }
        }
    }

    /* renamed from: k */
    private void m110091k() {
        List imageInfos = ((Aweme) this.f67534h).getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                C12133n.m35299a(C23400r.m76741a(imageInfo.getLabelThumb())).mo29853b(mo61580a()).mo29844a((C12128i) this.f67535i).mo29836a(this.f67535i.getWidth(), this.f67535i.getHeight()).mo29845a("FavoriteViewHolder").mo29848a();
            }
        }
    }

    /* renamed from: l */
    private void m110092l() {
        Video video = ((Aweme) this.f67534h).getVideo();
        if (video != null) {
            if (mo66486a(video, "FavoriteViewHolder")) {
                this.f67536j = true;
            } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                this.f67535i.setImageResource(R.color.a5q);
            } else {
                mo66485a(video.getCover(), "FavoriteViewHolder");
            }
        }
    }

    public FavoriteViewHolder(View view, final C34152a aVar) {
        super(view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67535i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!(FavoriteViewHolder.this.f67534h == null || aVar == null)) {
                    ((Integer) view.getTag()).intValue();
                }
            }
        });
        this.f67535i.setAnimationListener(this.f67532g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66491a(Aweme aweme, int i) {
        if (aweme != null) {
            this.f67535i.setTag(Integer.valueOf(i));
            this.f67534h = aweme;
            m110090c();
        }
    }
}
