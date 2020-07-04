package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p280ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder */
public abstract class AbsCellViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a */
    public Context f73928a;

    /* renamed from: a */
    public abstract void mo67064a(float f);

    /* renamed from: c */
    public abstract void mo67069c();

    /* renamed from: d */
    public abstract void mo67070d(boolean z);

    /* renamed from: l */
    public abstract String mo67072l();

    /* renamed from: m */
    public abstract boolean mo67073m();

    /* renamed from: n */
    public abstract void mo67074n();

    /* renamed from: a */
    public int[] mo61580a() {
        return C43012cg.m136513a(201);
    }

    /* renamed from: k */
    public void mo67071k() {
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (mo66486a(video, "AbsCellViewHolder")) {
                    this.f67536j = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f67535i.setImageResource(R.color.a5q);
                } else {
                    mo66485a(video.getCover(), "AbsCellViewHolder");
                }
            }
        }
    }

    public AbsCellViewHolder(View view) {
        super(view);
        this.f73928a = view.getContext();
    }

    /* renamed from: a */
    protected static void m91710a(SmartImageView smartImageView) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(0.625f);
        }
        ((C13438a) smartImageView.getHierarchy()).mo32893a(new PointF(0.5f, 0.0f));
    }

    /* renamed from: a */
    protected static void m91711a(SmartImageView smartImageView, float f) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(f);
        }
        ((C13438a) smartImageView.getHierarchy()).mo32893a(new PointF(0.5f, 0.0f));
    }
}
