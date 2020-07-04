package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30735c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31862ah;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryVideoReceiveViewHolder */
public class StoryVideoReceiveViewHolder extends BaseViewHolder<StoryVideoContent> {

    /* renamed from: m */
    protected ImageView f81411m;

    /* renamed from: n */
    private RemoteImageView f81412n;

    /* renamed from: o */
    private TextView f81413o;

    /* renamed from: c */
    public final View mo81434c() {
        RemoteImageView remoteImageView = this.f81412n;
        if (remoteImageView == null) {
            C7573i.m23583a("mStoryCoverImage");
        }
        return remoteImageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final ImageView mo81444f() {
        ImageView imageView = this.f81411m;
        if (imageView == null) {
            C7573i.m23583a("mStoryPlayableImage");
        }
        return imageView;
    }

    /* renamed from: g */
    private final void m101211g() {
        RemoteImageView remoteImageView = this.f81412n;
        if (remoteImageView == null) {
            C7573i.m23583a("mStoryCoverImage");
        }
        Integer[] a = C31862ah.m103524a(remoteImageView, (float) ((StoryVideoContent) this.f81198f).getWidth(), (float) ((StoryVideoContent) this.f81198f).getHeight());
        RemoteImageView remoteImageView2 = this.f81412n;
        if (remoteImageView2 == null) {
            C7573i.m23583a("mStoryCoverImage");
        }
        LayoutParams layoutParams = remoteImageView2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = a[0].intValue();
            layoutParams2.height = a[1].intValue();
            RemoteImageView remoteImageView3 = this.f81412n;
            if (remoteImageView3 == null) {
                C7573i.m23583a("mStoryCoverImage");
            }
            remoteImageView3.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        View findViewById = this.itemView.findViewById(R.id.bcr);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_story_playable)");
        this.f81411m = (ImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bcq);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_story_cover)");
        this.f81412n = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.c5n);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notice_tv)");
        this.f81413o = (TextView) findViewById3;
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        if (onClickListener != null) {
            this.f81202j.mo82725a(this.f81197e);
            this.f81197e.setOnClickListener(onClickListener);
        }
    }

    public StoryVideoReceiveViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, StoryVideoContent storyVideoContent, int i) {
        super.mo81421a(message, message2, storyVideoContent, i);
        m101211g();
        if (message != null && storyVideoContent != null) {
            if (message.getAttachments() != null && message.getAttachments().size() >= 3) {
                List<Attachment> attachments = message.getAttachments();
                C7573i.m23582a((Object) attachments, "msg.attachments");
                for (Attachment attachment : attachments) {
                    if (attachment != null) {
                        if (TextUtils.isEmpty(storyVideoContent.getLocalVideo()) && attachment.getIndex() == 1) {
                            storyVideoContent.setLocalVideo(attachment.getLocalPath());
                        } else if (TextUtils.isEmpty(storyVideoContent.getLocalPoster()) && attachment.getIndex() == 2) {
                            storyVideoContent.setLocalPoster(attachment.getLocalPath());
                        }
                    }
                    if (!TextUtils.isEmpty(storyVideoContent.getLocalVideo())) {
                        TextUtils.isEmpty(storyVideoContent.getLocalPoster());
                    }
                }
            }
            UrlModel a = C30735c.m100130a(storyVideoContent.getDisplayPoster(), storyVideoContent.getLocalPoster());
            RemoteImageView remoteImageView = this.f81412n;
            if (remoteImageView == null) {
                C7573i.m23583a("mStoryCoverImage");
            }
            C23323e.m76524b(remoteImageView, a);
            this.f81197e.setTag(50331648, Integer.valueOf(29));
            View view = this.f81197e;
            RemoteImageView remoteImageView2 = this.f81412n;
            if (remoteImageView2 == null) {
                C7573i.m23583a("mStoryCoverImage");
            }
            view.setTag(67108864, remoteImageView2);
        }
    }
}
