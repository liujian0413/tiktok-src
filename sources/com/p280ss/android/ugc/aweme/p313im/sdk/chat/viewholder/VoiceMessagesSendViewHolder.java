package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.p263im.core.model.Message;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31887b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VoiceMessagesSendViewHolder */
public class VoiceMessagesSendViewHolder extends VoiceMessageViewHolder {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
    }

    public VoiceMessagesSendViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, AudioContent audioContent, int i) {
        this.f81201i = message;
        this.f81426p.mo81521a(this.f81201i);
        if (audioContent == null) {
            mo81428a(message, f81192l);
            this.f81424n.setText("");
            this.f81423m.setVisibility(8);
            mo81482b(1);
            this.f81201i.setMsgStatus(5);
            this.f81197e.startAnimation(C31887b.m103595a(AdError.SERVER_ERROR_CODE, 1.0f, 0.3f));
            return;
        }
        super.mo81421a(message, message2, audioContent, i);
        this.f81423m.setVisibility(0);
        this.f81425o.setVisibility(8);
        C31887b.m103598a(this.f81197e);
    }
}
