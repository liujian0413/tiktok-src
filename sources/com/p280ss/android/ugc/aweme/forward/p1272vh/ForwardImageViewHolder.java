package com.p280ss.android.ugc.aweme.forward.p1272vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29874e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29887g;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.ForwardImageViewHolder */
public class ForwardImageViewHolder extends BaseForwardViewHolder implements C29874e {

    /* renamed from: S */
    protected RemoteImageView f78629S;

    /* renamed from: T */
    protected ViewGroup f78630T;

    /* renamed from: U */
    MentionTextView f78631U;

    /* renamed from: V */
    View f78632V;

    /* renamed from: W */
    ViewGroup f78633W;

    /* renamed from: X */
    ViewStub f78634X;

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo76012K() {
        mo76057n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public String mo76052N() {
        return "from_follow_page";
    }

    /* renamed from: f */
    public final ImageView mo75898f() {
        return this.f78629S;
    }

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo76059p() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo76060q() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo76053O() {
        this.f78560N.mo75886g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo76057n() {
        ((C29887g) this.f78560N).mo75931l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo76045u() {
        super.mo76045u();
        m97998a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo76006B() {
        if (this.f78552F.getForwardItem() != null && this.f78552F.getForwardItem().getAuthor() != null) {
            mo76028b(this.f78631U, this.f78552F.getForwardItem());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo76011J() {
        if (VERSION.SDK_INT >= 21) {
            this.f78633W.setOutlineProvider(new C43070ds(this.f78633W.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f78633W.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo76058o() {
        if (this.f78552F != null && this.f78552F.getForwardItem() != null) {
            C6903bc.m21486e().mo75372b(this.f78552F, mo76044t());
            ((C29887g) this.f78560N).mo75923a((long) C40413c.f105051b);
            C28503s.m93679a(this.f78550D.mo58090c(this.f78552F));
            m97999b(true);
            C29363d.m96451a().mo75038a(mo75888b(), this.f78552F.getAid(), mo76044t(), mo76052N(), this.f78552F.getEnterpriseType(), mo76060q(), mo76059p(), (View) this.f78630T);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo76049y() {
        if (this.f78552F != null && this.f78552F.getForwardItem() != null && this.f78552F.getForwardItem().getImageInfos() != null) {
            List imageInfos = this.f78552F.getForwardItem().getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    mo76020a((View) this.f78630T, imageInfo.getWidth(), imageInfo.getHeight());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo76055e(View view) {
        mo76053O();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C29887g mo76054a(C29376j jVar) {
        return new C29887g(this, jVar);
    }

    /* renamed from: b */
    private void m97999b(boolean z) {
        ((C29887g) this.f78560N).mo75930a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo76056f(View view) {
        if (!C27326a.m89578a(view)) {
            mo76057n();
        }
    }

    /* renamed from: a */
    private void m97998a(boolean z) {
        this.f78629S.setVisibility(0);
        if (this.f78552F.getForwardItem() != null) {
            List imageInfos = this.f78552F.getForwardItem().getImageInfos();
            if (!C6307b.m19566a((Collection<T>) imageInfos)) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    if (imageInfo.getLabelLarge() != null) {
                        C6307b.m19566a((Collection<T>) imageInfo.getLabelLarge().getUrlList());
                    }
                    C23323e.m76506a(this.f78629S, imageInfo.getLabelLarge(), this.f78629S.getWidth(), this.f78629S.getHeight());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76016a(View view) {
        super.mo76016a(view);
        this.f78629S = (RemoteImageView) view.findViewById(R.id.b7x);
        this.f78630T = (ViewGroup) view.findViewById(R.id.bhv);
        this.f78630T.setOnClickListener(new C29923e(this));
        this.f78631U = (MentionTextView) view.findViewById(R.id.dz3);
        this.f78632V = view.findViewById(R.id.biq);
        this.f78632V.setOnClickListener(new C29924f(this));
        this.f78633W = (ViewGroup) view.findViewById(R.id.cwo);
        this.f78634X = (ViewStub) view.findViewById(R.id.dc3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6v);
        mo76017a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6d);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub6.setLayoutResource(R.layout.a6p);
        mo76017a(viewStub6.inflate(), 12.0f);
    }

    public ForwardImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f78560N = mo76054a(jVar);
    }
}
