package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EmojiSendViewHolder */
public class EmojiSendViewHolder extends EmojiViewHolder {

    /* renamed from: m */
    private C31050o f81229m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) this.itemView.findViewById(R.id.dar);
        this.f81229m = new C31050o(this.f81195c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81195c);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
    }

    public EmojiSendViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, EmojiContent emojiContent, int i) {
        super.mo81421a(message, message2, emojiContent, i);
        this.f81229m.mo81521a(this.f81201i);
    }
}
