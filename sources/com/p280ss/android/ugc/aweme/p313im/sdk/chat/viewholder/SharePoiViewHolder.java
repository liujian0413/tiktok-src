package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiViewHolder */
public class SharePoiViewHolder extends BaseViewHolder<SharePoiContent> {

    /* renamed from: m */
    private RemoteImageView f81364m;

    /* renamed from: n */
    private DmtTextView f81365n;

    /* renamed from: o */
    private DmtTextView f81366o;

    /* renamed from: p */
    private RemoteImageView f81367p;

    /* renamed from: q */
    private RemoteImageView f81368q;

    /* renamed from: r */
    private RemoteImageView f81369r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81364m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81365n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81366o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81367p = (RemoteImageView) this.itemView.findViewById(R.id.ayo);
        this.f81368q = (RemoteImageView) this.itemView.findViewById(R.id.ayp);
        this.f81369r = (RemoteImageView) this.itemView.findViewById(R.id.ayq);
    }

    public SharePoiViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, SharePoiContent sharePoiContent, int i) {
        super.mo81421a(message, message2, sharePoiContent, i);
        this.f81365n.setText(sharePoiContent.getTitle());
        this.f81366o.setVisibility(0);
        if (TextUtils.isEmpty(sharePoiContent.getSubtitle())) {
            this.f81366o.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bo5), new Object[]{C31916o.m103674a((long) sharePoiContent.getUserCount())}));
        } else {
            this.f81366o.setText(sharePoiContent.getSubtitle());
        }
        ((C13438a) this.f81364m.getHierarchy()).mo32898b((int) R.drawable.b69);
        ((C13438a) this.f81364m.getHierarchy()).mo32902c((int) R.drawable.b69);
        C23323e.m76503a(this.f81364m, (int) R.drawable.b68);
        C23323e.m76524b(this.f81367p, (UrlModel) sharePoiContent.getCoverUrl().get(0));
        C23323e.m76524b(this.f81368q, (UrlModel) sharePoiContent.getCoverUrl().get(1));
        C23323e.m76524b(this.f81369r, (UrlModel) sharePoiContent.getCoverUrl().get(2));
        this.f81197e.setTag(50331648, Integer.valueOf(16));
        this.f81197e.setTag(67108864, sharePoiContent.getPoiId());
        this.f81197e.setTag(50331649, this.f81196d);
    }
}
