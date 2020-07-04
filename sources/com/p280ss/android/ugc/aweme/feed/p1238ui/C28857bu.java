package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.FeedTagLayout2;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bu */
public final class C28857bu extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    FeedTagLayout2 f76088a;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* renamed from: i */
    private void m94956i() {
        if (!(this.f76169g == null || this.f76088a == null)) {
            this.f76088a.mo60929c();
        }
    }

    public C28857bu(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74129a(C28318an anVar) {
        if (this.f76174l != null) {
            this.f76174l.mo60134a("feed_internal_event", (Object) anVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_tag);
        this.f76088a = (FeedTagLayout2) view2.findViewById(R.id.ajm);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("show_poi_info", (C0053p<C23083a>) this).mo60132a("hide_poi_info", (C0053p<C23083a>) this).mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("show_poi_info_with_expend", (C0053p<C23083a>) this);
            if (this.f76088a != null) {
                this.f76088a.setDataCenter(dataCenter);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2102809467) {
                if (hashCode != -1212389408) {
                    if (hashCode != -1173726595) {
                        if (hashCode == 350216171 && str.equals("on_page_selected")) {
                            c = 3;
                        }
                    } else if (str.equals("show_poi_info_with_expend")) {
                        c = 1;
                    }
                } else if (str.equals("hide_poi_info")) {
                    c = 2;
                }
            } else if (str.equals("show_poi_info")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (((Integer) aVar.mo60161a()).intValue() == 1) {
                        this.f76088a.mo60931e();
                        return;
                    }
                    break;
                case 1:
                    this.f76088a.mo60931e();
                    return;
                case 2:
                    if (this.f76088a != null) {
                        this.f76088a.mo60932f();
                        return;
                    }
                    break;
                case 3:
                    m94956i();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        this.f76088a.mo60927a(videoItemParams.curPoiLat, videoItemParams.curPoiLng, videoItemParams.curPoiId);
        this.f76088a.setOnIntervalEventListener(new C28858bv(this));
        this.f76088a.mo60925a(this.f76169g, (Activity) this.f76175m, this.f76170h, this.f76171i);
    }
}
