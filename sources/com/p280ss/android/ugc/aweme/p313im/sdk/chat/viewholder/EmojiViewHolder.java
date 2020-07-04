package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EmojiViewHolder */
public class EmojiViewHolder extends BaseViewHolder<EmojiContent> {

    /* renamed from: n */
    private static int f81230n = ((int) C9738o.m28708b(C6399b.m19921a(), 112.0f));

    /* renamed from: m */
    private RemoteImageView f81231m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81231m = (RemoteImageView) this.itemView.findViewById(R.id.cbm);
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81197e);
    }

    /* renamed from: f */
    private void m100945f() {
        if (((EmojiContent) this.f81198f).getType() == 500 || ((EmojiContent) this.f81198f).getType() == 501) {
            ((C13438a) this.f81231m.getHierarchy()).mo32900b((Drawable) null);
        } else {
            ((C13438a) this.f81231m.getHierarchy()).mo32898b((int) R.drawable.bcy);
        }
    }

    /* renamed from: g */
    private void m100946g() {
        int i;
        UrlModel localUrl = ((EmojiContent) this.f81198f).getLocalUrl();
        UrlModel urlModel = (UrlModel) this.f81231m.getTag(67108864);
        if (localUrl != null) {
            if (!localUrl.equals(urlModel)) {
                this.f81231m.setTag(67108864, localUrl);
            } else {
                return;
            }
        } else if (((EmojiContent) this.f81198f).getUrl() != null && !((EmojiContent) this.f81198f).getUrl().equals(urlModel)) {
            this.f81231m.setTag(67108864, ((EmojiContent) this.f81198f).getUrl());
        } else {
            return;
        }
        int i2 = 0;
        if (((EmojiContent) this.f81198f).getHeight() == 0 || ((EmojiContent) this.f81198f).getWidth() == 0) {
            i = 0;
        } else if (((EmojiContent) this.f81198f).getWidth() >= ((EmojiContent) this.f81198f).getHeight()) {
            i2 = f81230n;
            i = (f81230n * ((EmojiContent) this.f81198f).getHeight()) / ((EmojiContent) this.f81198f).getWidth();
        } else {
            int i3 = f81230n;
            i2 = (f81230n * ((EmojiContent) this.f81198f).getWidth()) / ((EmojiContent) this.f81198f).getHeight();
            i = i3;
        }
        LayoutParams layoutParams = this.f81231m.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i;
        this.f81231m.setLayoutParams(layoutParams);
        if (C31932z.m103710e(((EmojiContent) this.f81198f).getImageType()) || C31932z.m103711f(((EmojiContent) this.f81198f).getImageType())) {
            if (localUrl == null) {
                C31892bd.m103610a(this.f81231m, ((EmojiContent) this.f81198f).getUrl(), i2, i);
            } else {
                C31892bd.m103610a(this.f81231m, localUrl, i2, i);
            }
        } else if (localUrl == null) {
            C23323e.m76506a(this.f81231m, ((EmojiContent) this.f81198f).getUrl(), i2, i);
        } else {
            C23323e.m76506a(this.f81231m, localUrl, i2, i);
        }
    }

    public EmojiViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, EmojiContent emojiContent, int i) {
        super.mo81421a(message, message2, emojiContent, i);
        m100945f();
        m100946g();
        this.f81197e.setTag(50331648, Integer.valueOf(10));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
