package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.C1642a;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodWindowContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodWindowViewHolder */
public class ShareGoodWindowViewHolder extends ShareSimpleBaseViewHolder {
    public ShareGoodWindowViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        if (baseContent instanceof ShareGoodWindowContent) {
            ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) baseContent;
            this.f81372o.setText(C1642a.m8035a(Locale.getDefault(), this.f81372o.getContext().getString(R.string.bjz), new Object[]{shareGoodWindowContent.getName()}));
            this.f81373p.setVisibility(8);
            this.f81374q.setText(R.string.bjy);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.mo32884a(true);
            ((C13438a) this.f81371n.getHierarchy()).mo32897a(roundingParams);
            ((C13438a) this.f81371n.getHierarchy()).mo32898b((int) R.drawable.b7l);
            C23323e.m76524b(this.f81371n, shareGoodWindowContent.getAvatar());
            this.f81197e.setTag(50331648, Integer.valueOf(35));
            this.f81197e.setTag(67108864, shareGoodWindowContent);
        }
    }
}
