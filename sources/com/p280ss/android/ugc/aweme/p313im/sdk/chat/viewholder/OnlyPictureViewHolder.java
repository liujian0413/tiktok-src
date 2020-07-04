package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30735c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31862ah;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.OnlyPictureViewHolder */
public class OnlyPictureViewHolder extends BaseViewHolder<OnlyPictureContent> {

    /* renamed from: m */
    private final int f81251m = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.hz);

    /* renamed from: n */
    private RemoteImageView f81252n;

    /* renamed from: c */
    public final View mo81434c() {
        return this.f81252n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81252n = (RemoteImageView) this.itemView.findViewById(R.id.cbm);
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81197e);
    }

    /* renamed from: f */
    private void m100980f() {
        Integer[] a = C31862ah.m103524a(this.f81252n, (float) ((OnlyPictureContent) this.f81198f).getWidth(), (float) ((OnlyPictureContent) this.f81198f).getHeight());
        LayoutParams layoutParams = (LayoutParams) this.f81252n.getLayoutParams();
        layoutParams.width = a[0].intValue();
        layoutParams.height = a[1].intValue();
        this.f81252n.setLayoutParams(layoutParams);
        ((C13438a) this.f81252n.getHierarchy()).mo32897a(RoundingParams.m39400b((float) this.f81251m, (float) this.f81251m, (float) this.f81251m, (float) this.f81251m));
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
    }

    public OnlyPictureViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, OnlyPictureContent onlyPictureContent, int i) {
        super.mo81421a(message, message2, onlyPictureContent, i);
        m100980f();
        C23323e.m76524b(this.f81252n, C30735c.m100130a(onlyPictureContent.getUrl(), onlyPictureContent.getPicturePath()));
        this.f81197e.setTag(50331648, Integer.valueOf(9));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
