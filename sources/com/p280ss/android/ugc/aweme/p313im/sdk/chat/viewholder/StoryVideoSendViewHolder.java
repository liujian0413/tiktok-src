package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30976h;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.CircleProgressTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryVideoSendViewHolder */
public final class StoryVideoSendViewHolder extends StoryVideoReceiveViewHolder {

    /* renamed from: n */
    private C30976h f81414n;

    /* renamed from: o */
    private CircleProgressTextView f81415o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) this.itemView.findViewById(R.id.dar);
        View findViewById = this.itemView.findViewById(R.id.bdd);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_upload_progress)");
        this.f81415o = (CircleProgressTextView) findViewById;
        CircleProgressTextView circleProgressTextView = this.f81415o;
        if (circleProgressTextView == null) {
            C7573i.m23583a("uploadProgressView");
        }
        this.f81414n = new C30976h(circleProgressTextView, mo81444f(), this.f81195c);
    }

    /* renamed from: g */
    private final void m101218g() {
        Message message = this.f81201i;
        C7573i.m23582a((Object) message, "currentMessage");
        if (message.getMsgStatus() == 3) {
            this.f81195c.setImageResource(R.drawable.b5o);
            this.f81195c.setTag(50331648, Integer.valueOf(6));
            this.f81195c.setTag(67108864, this.f81201i);
            ImageView imageView = this.f81195c;
            C7573i.m23582a((Object) imageView, "statusIv");
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView2 = this.f81195c;
        C7573i.m23582a((Object) imageView2, "statusIv");
        imageView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public StoryVideoSendViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, StoryVideoContent storyVideoContent, int i) {
        super.mo81421a(message, message2, storyVideoContent, i);
        C30976h hVar = this.f81414n;
        if (hVar == null) {
            C7573i.m23583a("uploadProgressIcon");
        }
        hVar.mo81367a(this.f81201i);
        m101218g();
        this.f81197e.setTag(50331648, Integer.valueOf(28));
    }
}
