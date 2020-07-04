package com.p280ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.PoiDetailViewHolder */
public class PoiDetailViewHolder extends AbsCellViewHolder {
    SmartCircleImageView authorAvatar;

    /* renamed from: b */
    private String f74006b;

    /* renamed from: c */
    private boolean f74007c;
    TagLayout tagLayout;
    TextView txtAuthorName;
    TextView txtDesc;
    TextView txtLikeCount;

    public final void bB_() {
        mo67071k();
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f74007c;
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
        if (this.f67534h != null) {
            mo67071k();
            if (TextUtils.isEmpty(((Aweme) this.f67534h).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                this.txtDesc.setText(((Aweme) this.f67534h).getDesc());
            }
            User author = ((Aweme) this.f67534h).getAuthor();
            if (author != null) {
                this.txtAuthorName.setText(author.getNickname());
                C12133n.m35299a(C23400r.m76741a(author.getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29845a("AbsCellViewHolder").mo29844a((C12128i) this.authorAvatar).mo29848a();
            }
            this.txtLikeCount.setVisibility(8);
            this.tagLayout.setEventType(this.f74006b);
            if (((Aweme) this.f67534h).getVideoLabels() != null) {
                this.tagLayout.mo61048a((Aweme) this.f67534h, ((Aweme) this.f67534h).getVideoLabels(), new C23440a(7, 16));
            }
        }
    }

    /* renamed from: k */
    public final void mo67071k() {
        if (this.f67534h != null) {
            List imageInfos = ((Aweme) this.f67534h).getImageInfos();
            if (imageInfos == null || imageInfos.isEmpty()) {
                Video video = ((Aweme) this.f67534h).getVideo();
                if (video != null) {
                    if (mo66486a(video, "AbsCellViewHolder")) {
                        this.f67536j = true;
                        return;
                    } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                        this.f67535i.setImageResource(R.color.a5q);
                        return;
                    } else {
                        mo66485a(video.getCover(), "AbsCellViewHolder");
                    }
                }
                return;
            }
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                mo66485a(imageInfo.getLabelLarge(), "AbsCellViewHolder");
            }
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f74007c = true;
    }

    /* renamed from: a */
    public final void mo67064a(float f) {
        if (this.txtDesc.getAlpha() != f) {
            this.txtDesc.setAlpha(f);
            this.txtAuthorName.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.authorAvatar.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo71603a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f74007c = z;
            if (this.f74007c) {
                mo67069c();
            }
        }
    }

    public PoiDetailViewHolder(View view, String str, C23685d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f67536j = true;
        this.f74006b = str;
        view.setOnClickListener(new C28139ak(this, view, dVar));
        this.f67535i.setAnimationListener(this.f67532g);
        m91710a(this.f67535i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71602a(View view, C23685d dVar, View view2) {
        if (((Aweme) this.f67534h).getStatus() == null || !((Aweme) this.f67534h).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo61615a(view, (Aweme) this.f67534h, this.f74006b);
            }
            return;
        }
        C10761a.m31409e(view.getContext(), (int) R.string.fo2).mo25750a();
    }
}
