package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoUpdateTipsContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoUpdateTipsViewHolder */
public class VideoUpdateTipsViewHolder extends BaseViewHolder<VideoUpdateTipsContent> {

    /* renamed from: m */
    private RemoteImageView f81419m;

    /* renamed from: n */
    private TextView f81420n;

    /* renamed from: o */
    private TextView f81421o;

    /* renamed from: p */
    private View f81422p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81419m = (RemoteImageView) this.itemView.findViewById(R.id.a4l);
        this.f81420n = (TextView) this.itemView.findViewById(R.id.dkn);
        this.f81421o = (TextView) this.itemView.findViewById(R.id.a2e);
        this.f81197e = this.itemView.findViewById(R.id.a1o);
        this.f81422p = this.itemView.findViewById(R.id.a4p);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        this.f81197e.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo81426a(OnLongClickListener onLongClickListener) {
        this.f81197e.setOnLongClickListener(onLongClickListener);
    }

    public VideoUpdateTipsViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81421a(Message message, Message message2, VideoUpdateTipsContent videoUpdateTipsContent, int i) {
        super.mo81421a(message, message2, videoUpdateTipsContent, i);
        if (videoUpdateTipsContent != null) {
            C23323e.m76524b(this.f81419m, videoUpdateTipsContent.getCover());
            this.f81420n.setText(videoUpdateTipsContent.getTitle());
            this.f81421o.setText(videoUpdateTipsContent.getContent());
            if (videoUpdateTipsContent.isPhoto()) {
                this.f81422p.setVisibility(0);
            } else {
                this.f81422p.setVisibility(8);
            }
        }
        this.f81197e.setTag(50331648, Integer.valueOf(11));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
