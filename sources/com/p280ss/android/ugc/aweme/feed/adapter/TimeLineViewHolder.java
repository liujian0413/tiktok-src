package com.p280ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.TimeLineViewHolder */
public class TimeLineViewHolder extends AbsCellViewHolder {

    /* renamed from: b */
    public String f74078b;

    /* renamed from: c */
    private boolean f74079c;
    SmartAvatarImageView mAvHeadView;
    TextView mDescribeView;
    TextView mTvLocation;
    TextView mTvName;
    TagLayout tagLayout;
    TextView txtDistance;

    public final void bB_() {
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f74079c;
    }

    /* renamed from: n */
    public final void mo67074n() {
    }

    /* renamed from: l */
    public final String mo67072l() {
        if (this.f67534h != null) {
            return ((Aweme) this.f67534h).getAid();
        }
        return "";
    }

    /* renamed from: c */
    public final void mo67069c() {
        List list;
        if (this.f67534h != null) {
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (!m92006a(video)) {
                    C12133n.m35299a(C23400r.m76741a(video.getDynamicCover())).mo29845a("TimeLineViewHolder").mo29852b(true).mo29844a((C12128i) this.f67535i).mo29849a((C12112j) new C12105c() {
                        /* renamed from: a */
                        public final void mo29812a(Uri uri, View view, Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                            TimeLineViewHolder.this.f67535i.setUserVisibleHint(true);
                            TimeLineViewHolder.this.f67535i.mo29861b();
                        }
                    });
                } else {
                    C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29845a("TimeLineViewHolder").mo29836a(this.f67535i.getWidth(), this.f67535i.getHeight()).mo29844a((C12128i) this.f67535i).mo29848a();
                }
            }
            if (!TextUtils.isEmpty(((Aweme) this.f67534h).getDesc())) {
                this.mDescribeView.setVisibility(0);
                this.mDescribeView.setText(((Aweme) this.f67534h).getDesc());
            } else {
                this.mDescribeView.setVisibility(8);
            }
            if (((Aweme) this.f67534h).getAuthor() != null) {
                C12133n.m35299a(C23400r.m76741a(((Aweme) this.f67534h).getAuthor().getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29852b(true).mo29845a("TimeLineViewHolder").mo29844a((C12128i) this.mAvHeadView).mo29848a();
            }
            this.tagLayout.setEventType(this.f74078b);
            if (((Aweme) this.f67534h).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = (Aweme) this.f67534h;
                if (((Aweme) this.f67534h).getVideoLabels().size() > 0) {
                    list = ((Aweme) this.f67534h).getVideoLabels().subList(0, 1);
                } else {
                    list = ((Aweme) this.f67534h).getVideoLabels();
                }
                tagLayout2.mo61050b(aweme, list, new C23440a(7, 16));
            }
            PoiStruct poiStruct = ((Aweme) this.f67534h).getPoiStruct();
            if (poiStruct == null) {
                this.mTvName.setVisibility(0);
                if (((Aweme) this.f67534h).getAuthor() != null) {
                    this.mTvName.setText(((Aweme) this.f67534h).getAuthor().getNickname());
                }
                if (TextUtils.isEmpty(((Aweme) this.f67534h).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.f67534h).getDistance());
                }
                this.mTvLocation.setVisibility(8);
                return;
            }
            this.mTvName.setVisibility(8);
            this.txtDistance.setVisibility(8);
            this.mTvLocation.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f74079c = true;
    }

    /* renamed from: a */
    private static boolean m92006a(Video video) {
        if (!C7188c.m22428a() && video != null && video.getDynamicCover() != null && !TextUtils.isEmpty(video.getDynamicCover().getUri()) && video.getDynamicCover().getUrlList() != null && !video.getDynamicCover().getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo67064a(float f) {
        if (this.mDescribeView.getAlpha() != f) {
            float max = Math.max(0.0f, Math.min(f, 1.0f));
            this.mDescribeView.setAlpha(max);
            this.mAvHeadView.setAlpha(max);
            this.mTvLocation.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }

    /* renamed from: a */
    public final void mo71635a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f74079c = z;
            if (this.f74079c) {
                mo67069c();
            }
        }
    }

    public TimeLineViewHolder(final View view, String str, final C23685d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67536j = true;
        this.f74078b = str;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (((Aweme) TimeLineViewHolder.this.f67534h).getStatus() == null || !((Aweme) TimeLineViewHolder.this.f67534h).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.mo61615a(view, (Aweme) TimeLineViewHolder.this.f67534h, TimeLineViewHolder.this.f74078b);
                    }
                    return;
                }
                C10761a.m31409e(view.getContext(), (int) R.string.fo2).mo25750a();
            }
        });
        this.f67535i.setAnimationListener(this.f67532g);
        m91710a(this.f67535i);
    }
}
