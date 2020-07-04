package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30918l;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryReplyReceiveViewHolder */
public class StoryReplyReceiveViewHolder extends BaseViewHolder<StoryReplyContent> {

    /* renamed from: m */
    private RemoteImageView f81404m;

    /* renamed from: n */
    private DmtTextView f81405n;

    /* renamed from: o */
    private LinearLayout f81406o;

    /* renamed from: p */
    private ImageView f81407p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryReplyReceiveViewHolder$a */
    static final class C31020a<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ StoryReplyReceiveViewHolder f81408a;

        C31020a(StoryReplyReceiveViewHolder storyReplyReceiveViewHolder) {
            this.f81408a = storyReplyReceiveViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            boolean z;
            StoryReplyReceiveViewHolder storyReplyReceiveViewHolder = this.f81408a;
            if (hVar == null || !hVar.mo6882b() || ((Boolean) hVar.mo6890e()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            storyReplyReceiveViewHolder.mo81478a(z);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        View findViewById = this.itemView.findViewById(R.id.bcq);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_story_cover)");
        this.f81404m = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.e2q);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_story_reply)");
        this.f81405n = (DmtTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bcs);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.iv_story_unplayable)");
        this.f81406o = (LinearLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.bcr);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.iv_story_playable)");
        this.f81407p = (ImageView) findViewById4;
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    /* renamed from: a */
    public final void mo81478a(boolean z) {
        ((StoryReplyContent) this.f81198f).setStoryState(z);
        m101200b(z);
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        if (onClickListener != null) {
            this.f81202j.mo82725a(this.f81197e);
            this.f81197e.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    private final void m101199a(Message message) {
        message.setTag(220224, "story_state_checking");
        C7077s.m22137a(((StoryReplyContent) this.f81198f).getStoryContent().getStoryId(), message).mo6876a((C1591g<TResult, TContinuationResult>) new C31020a<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: b */
    private final void m101200b(boolean z) {
        if (z) {
            if (((StoryReplyContent) this.f81198f).getStoryContent().getStoryCover() != null) {
                RemoteImageView remoteImageView = this.f81404m;
                if (remoteImageView == null) {
                    C7573i.m23583a("mStoryCoverImage");
                }
                C23323e.m76524b(remoteImageView, ((StoryReplyContent) this.f81198f).getStoryContent().getStoryCover());
            } else {
                RemoteImageView remoteImageView2 = this.f81404m;
                if (remoteImageView2 == null) {
                    C7573i.m23583a("mStoryCoverImage");
                }
                remoteImageView2.setImageURI("");
            }
            ImageView imageView = this.f81407p;
            if (imageView == null) {
                C7573i.m23583a("mStoryPlayableImage");
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.f81406o;
            if (linearLayout == null) {
                C7573i.m23583a("mStoryUnplayableLayout");
            }
            linearLayout.setVisibility(8);
            return;
        }
        RemoteImageView remoteImageView3 = this.f81404m;
        if (remoteImageView3 == null) {
            C7573i.m23583a("mStoryCoverImage");
        }
        remoteImageView3.setImageURI("");
        ImageView imageView2 = this.f81407p;
        if (imageView2 == null) {
            C7573i.m23583a("mStoryPlayableImage");
        }
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f81406o;
        if (linearLayout2 == null) {
            C7573i.m23583a("mStoryUnplayableLayout");
        }
        linearLayout2.setVisibility(0);
    }

    public StoryReplyReceiveViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, StoryReplyContent storyReplyContent, int i) {
        BaseContent baseContent = storyReplyContent;
        super.mo81421a(message, message2, baseContent, i);
        if (message != null && storyReplyContent != null) {
            if (message.getLocalExt() == null || !message.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = message.getTag(220224);
                if (tag == null || C7573i.m23585a(tag, (Object) "story_state_net_error")) {
                    m101199a(message);
                } else if (C7573i.m23585a(tag, (Object) "story_state_checked")) {
                    mo81478a(true);
                }
            } else {
                mo81478a(false);
            }
            if (TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f81405n;
                if (dmtTextView == null) {
                    C7573i.m23583a("mStoryReplyText");
                }
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f81405n;
                if (dmtTextView2 == null) {
                    C7573i.m23583a("mStoryReplyText");
                }
                dmtTextView2.setVisibility(0);
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                C7103h f = a.mo18009f();
                C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
                if (f.getIMSetting().f83738a == 1) {
                    String storyReplyText = storyReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        C7573i.m23580a();
                    }
                    if (storyReplyText.length() <= 1024) {
                        DmtTextView dmtTextView3 = this.f81405n;
                        if (dmtTextView3 == null) {
                            C7573i.m23583a("mStoryReplyText");
                        }
                        C30918l.m100657a(dmtTextView3, storyReplyContent.getStoryReplyText(), this.f81196d, C31863ai.m103531a(message, baseContent), message.getMsgId());
                    }
                }
                DmtTextView dmtTextView4 = this.f81405n;
                if (dmtTextView4 == null) {
                    C7573i.m23583a("mStoryReplyText");
                }
                dmtTextView4.setText(storyReplyContent.getStoryReplyText());
            }
            this.f81197e.setTag(50331648, Integer.valueOf(25));
            View view = this.f81197e;
            RemoteImageView remoteImageView = this.f81404m;
            if (remoteImageView == null) {
                C7573i.m23583a("mStoryCoverImage");
            }
            view.setTag(117440512, remoteImageView);
            this.f81197e.setTag(67108864, message);
        }
    }
}
