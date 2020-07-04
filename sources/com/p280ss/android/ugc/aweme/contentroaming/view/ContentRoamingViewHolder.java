package com.p280ss.android.ugc.aweme.contentroaming.view;

import android.graphics.Outline;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33275q;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.contentroaming.view.ContentRoamingViewHolder */
public class ContentRoamingViewHolder extends AbsCellViewHolder {

    /* renamed from: b */
    private SmartAvatarImageView f68219b;

    /* renamed from: c */
    private TextView f68220c;

    /* renamed from: d */
    private TextView f68221d;

    /* renamed from: e */
    private TextView f68222e;

    /* renamed from: f */
    private String f68223f;

    /* renamed from: l */
    private boolean f68224l;

    /* renamed from: m */
    private float f68225m;

    /* renamed from: a */
    public final void mo67064a(float f) {
    }

    public final void bB_() {
        mo67071k();
    }

    /* renamed from: m */
    public final boolean mo67073m() {
        return this.f68224l;
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
            if (!TextUtils.isEmpty(((Aweme) this.f67534h).getDesc())) {
                this.f68220c.setVisibility(0);
                this.f68220c.setText(((Aweme) this.f67534h).getDesc());
            } else {
                this.f68220c.setVisibility(8);
            }
            if (((Aweme) this.f67534h).getAuthor() != null) {
                C12133n.m35299a(C23400r.m76741a(((Aweme) this.f67534h).getAuthor().getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29852b(true).mo29845a("ContentRoamingViewHolder").mo29844a((C12128i) this.f68219b).mo29848a();
            }
            this.f68221d.setVisibility(0);
            if (((Aweme) this.f67534h).getAuthor() != null) {
                this.f68221d.setText(((Aweme) this.f67534h).getAuthor().getNickname());
            }
            this.f68222e.setText(String.valueOf(C36735h.m118415a(((Aweme) this.f67534h).getStatistics().getDiggCount())));
        }
    }

    /* renamed from: k */
    public final void mo67071k() {
        if (this.f67534h != null) {
            float f = 1.0f;
            if (((Aweme) this.f67534h).isImage()) {
                List imageInfos = ((Aweme) this.f67534h).getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                    if (imageInfo != null) {
                        if (imageInfo.getWidth() != 0) {
                            f = ((float) imageInfo.getHeight()) / ((float) imageInfo.getWidth());
                        }
                        LayoutParams layoutParams = (LayoutParams) this.f67535i.getLayoutParams();
                        layoutParams.height = (int) (this.f68225m * f);
                        this.f67535i.setLayoutParams(layoutParams);
                        mo66485a(imageInfo.getLabelLarge(), "ContentRoamingViewHolder");
                    }
                }
                return;
            }
            Video video = ((Aweme) this.f67534h).getVideo();
            if (video != null) {
                if (((Aweme) this.f67534h).getVideo().getWidth() != 0) {
                    f = ((float) ((Aweme) this.f67534h).getVideo().getHeight()) / ((float) ((Aweme) this.f67534h).getVideo().getWidth());
                }
                LayoutParams layoutParams2 = (LayoutParams) this.f67535i.getLayoutParams();
                layoutParams2.height = (int) (this.f68225m * f);
                this.f67535i.setLayoutParams(layoutParams2);
                if (mo66486a(video, "ContentRoamingViewHolder")) {
                    this.f67536j = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f67535i.setImageResource(R.color.a5q);
                } else {
                    mo66485a(video.getCover(), "ContentRoamingViewHolder");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo67070d(boolean z) {
        this.f68224l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67065a(View view) {
        if (this.f67534h != null && ((Aweme) this.f67534h).getAuthor() != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("name").setLabelName(this.f68223f).setValue(((Aweme) this.f67534h).getAuthorUid()).setJsonObject(new C6869c().mo16887a("group_id", ((Aweme) this.f67534h).getAid()).mo16887a("to_user_id", C33230ac.m107205a((Aweme) this.f67534h)).mo16887a("author_id", C33230ac.m107205a((Aweme) this.f67534h)).mo16887a("request_id", C33230ac.m107206a((Aweme) this.f67534h, 12)).mo16887a("city_info", C33230ac.m107204a()).mo16887a("distance_info", C33230ac.m107231i((Aweme) this.f67534h)).mo16887a("poi_id", C33230ac.m107223e((Aweme) this.f67534h)).mo16887a("poi_type", C33230ac.m107229h((Aweme) this.f67534h)).mo16887a("enterMethod", "click_name").mo16888b()));
            ((C33276r) new C33276r().mo85312c((Aweme) this.f67534h, 12).mo85310b(this.f68223f).mo85322o(((Aweme) this.f67534h).getAuthorUid()).mo85048a("click_name")).mo85252e();
            new C33275q().mo85305a(((Aweme) this.f67534h).getAid()).mo85307c(this.f68223f).mo85306b(((Aweme) this.f67534h).getAuthorUid()).mo85252e();
            C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(C33230ac.m107205a((Aweme) this.f67534h)).setJsonObject(new C6869c().mo16887a("group_id", ((Aweme) this.f67534h).getAid()).mo16887a("request_id", C33230ac.m107206a((Aweme) this.f67534h, 12)).mo16887a("is_photo", C33230ac.m107239n((Aweme) this.f67534h)).mo16887a("enter_from", this.f68223f).mo16888b()));
            C6903bc.m21497p().mo86707a(view.getContext(), ((Aweme) this.f67534h).getAuthor());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo67068b(View view) {
        String str;
        if (this.f67534h != null && ((Aweme) this.f67534h).getAuthor() != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("head").setLabelName(this.f68223f).setValue(((Aweme) this.f67534h).getAuthorUid()).setJsonObject(new C6869c().mo16887a("group_id", ((Aweme) this.f67534h).getAid()).mo16887a("to_user_id", C33230ac.m107205a((Aweme) this.f67534h)).mo16887a("author_id", C33230ac.m107205a((Aweme) this.f67534h)).mo16887a("request_id", C33230ac.m107206a((Aweme) this.f67534h, 12)).mo16887a("city_info", C33230ac.m107204a()).mo16887a("distance_info", C33230ac.m107231i((Aweme) this.f67534h)).mo16887a("poi_id", C33230ac.m107223e((Aweme) this.f67534h)).mo16887a("poi_type", C33230ac.m107229h((Aweme) this.f67534h)).mo16887a("enterMethod", "click_head").mo16888b()));
            ((C33276r) new C33276r().mo85312c((Aweme) this.f67534h, 12).mo85310b(this.f68223f).mo85322o(((Aweme) this.f67534h).getAuthorUid()).mo85048a("click_head")).mo85252e();
            new C33275q().mo85305a(((Aweme) this.f67534h).getAid()).mo85307c(this.f68223f).mo85306b(((Aweme) this.f67534h).getAuthorUid()).mo85252e();
            MobClick value = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(C33230ac.m107205a((Aweme) this.f67534h));
            C6869c a = new C6869c().mo16887a("group_id", ((Aweme) this.f67534h).getAid()).mo16887a("request_id", C33230ac.m107206a((Aweme) this.f67534h, 12));
            String str2 = "is_photo";
            if (((Aweme) this.f67534h).isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            C6907h.onEvent(value.setJsonObject(a.mo16887a(str2, str).mo16887a("enter_from", this.f68223f).mo16888b()));
            C6903bc.m21497p().mo86707a(view.getContext(), ((Aweme) this.f67534h).getAuthor());
        }
    }

    /* renamed from: a */
    public final void mo67067a(Aweme aweme, int i, boolean z) {
        super.mo66491a(aweme, i);
        if (aweme != null) {
            this.f67534h = aweme;
            this.f68224l = z;
            if (this.f68224l) {
                mo67069c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67066a(View view, C23685d dVar, View view2) {
        if (((Aweme) this.f67534h).getStatus() == null || !((Aweme) this.f67534h).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo61615a(view, (Aweme) this.f67534h, this.f68223f);
            }
            return;
        }
        C10761a.m31409e(view.getContext(), (int) R.string.fo2).mo25750a();
    }

    public ContentRoamingViewHolder(View view, String str, C23685d dVar) {
        super(view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.a4g);
        this.f68220c = (TextView) view.findViewById(R.id.a7e);
        this.f68219b = (SmartAvatarImageView) view.findViewById(R.id.ic);
        this.f68221d = (TextView) view.findViewById(R.id.b45);
        this.f68222e = (TextView) view.findViewById(R.id.a3d);
        this.f67536j = true;
        this.f68223f = str;
        view.setOnClickListener(new C25804a(this, view, dVar));
        this.f68219b.setOnClickListener(new C25805b(this));
        this.f68221d.setOnClickListener(new C25806c(this));
        this.f67535i.setAnimationListener(this.f67532g);
        this.f68225m = (((float) C23482j.m77098b(this.f73928a)) - C9738o.m28708b(this.f73928a, 15.0f)) / 2.0f;
        if (VERSION.SDK_INT >= 21) {
            this.f67535i.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C9738o.m28708b(ContentRoamingViewHolder.this.f73928a, 6.0f));
                }
            });
            this.f67535i.setClipToOutline(true);
        }
    }
}
