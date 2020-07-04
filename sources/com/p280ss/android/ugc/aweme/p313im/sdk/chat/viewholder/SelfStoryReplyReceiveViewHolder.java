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
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SelfStoryReplyReceiveViewHolder */
public class SelfStoryReplyReceiveViewHolder extends BaseViewHolder<SelfStoryReplyContent> {

    /* renamed from: m */
    public final DmtTextView f81255m;

    /* renamed from: n */
    public final RemoteImageView f81256n;

    /* renamed from: o */
    public final DmtTextView f81257o;

    /* renamed from: p */
    public final ImageView f81258p;

    /* renamed from: q */
    public final LinearLayout f81259q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SelfStoryReplyReceiveViewHolder$a */
    static final class C31015a<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ SelfStoryReplyReceiveViewHolder f81260a;

        /* renamed from: b */
        final /* synthetic */ Message f81261b;

        C31015a(SelfStoryReplyReceiveViewHolder selfStoryReplyReceiveViewHolder, Message message) {
            this.f81260a = selfStoryReplyReceiveViewHolder;
            this.f81261b = message;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            boolean z;
            SelfStoryReplyReceiveViewHolder selfStoryReplyReceiveViewHolder = this.f81260a;
            if (hVar == null || !hVar.mo6882b() || ((Boolean) hVar.mo6890e()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            selfStoryReplyReceiveViewHolder.mo81451a(z);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81202j.mo82725a(this.f81197e);
    }

    /* renamed from: a */
    public final void mo81451a(boolean z) {
        ((SelfStoryReplyContent) this.f81198f).setStoryState(z);
        if (z) {
            if (((SelfStoryReplyContent) this.f81198f).getStoryContent().getStoryCover() != null) {
                C23323e.m76524b(this.f81256n, ((SelfStoryReplyContent) this.f81198f).getStoryContent().getStoryCover());
            } else {
                this.f81256n.setImageURI("");
            }
            ImageView imageView = this.f81258p;
            C7573i.m23582a((Object) imageView, "mStoryPlayableImage");
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.f81259q;
            C7573i.m23582a((Object) linearLayout, "mStoryUnplayableLayout");
            linearLayout.setVisibility(8);
            return;
        }
        this.f81256n.setImageURI("");
        ImageView imageView2 = this.f81258p;
        C7573i.m23582a((Object) imageView2, "mStoryPlayableImage");
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f81259q;
        C7573i.m23582a((Object) linearLayout2, "mStoryUnplayableLayout");
        linearLayout2.setVisibility(0);
    }

    public SelfStoryReplyReceiveViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
        this.f81255m = (DmtTextView) view.findViewById(R.id.dbn);
        this.f81256n = (RemoteImageView) view.findViewById(R.id.bcq);
        this.f81257o = (DmtTextView) view.findViewById(R.id.e2q);
        this.f81258p = (ImageView) view.findViewById(R.id.bcr);
        this.f81259q = (LinearLayout) view.findViewById(R.id.bcs);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, SelfStoryReplyContent selfStoryReplyContent, int i) {
        BaseContent baseContent = selfStoryReplyContent;
        super.mo81421a(message, message2, baseContent, i);
        if (!(selfStoryReplyContent == null || message == null)) {
            this.f81255m.setText(R.string.bqm);
            if (message.getLocalExt() == null || !message.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = message.getTag(220224);
                if (tag == null || C7573i.m23585a(tag, (Object) "story_state_net_error")) {
                    String storyId = selfStoryReplyContent.getStoryContent().getStoryId();
                    if (storyId != null) {
                        C7077s.m22137a(storyId, message).mo6876a((C1591g<TResult, TContinuationResult>) new C31015a<TResult,TContinuationResult>(this, message), C1592h.f5958b);
                    }
                } else if (C7573i.m23585a(tag, (Object) "story_state_checked")) {
                    mo81451a(true);
                }
            } else {
                mo81451a(false);
            }
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f81257o;
                C7573i.m23582a((Object) dmtTextView, "mStoryReplyText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f81257o;
                C7573i.m23582a((Object) dmtTextView2, "mStoryReplyText");
                dmtTextView2.setVisibility(0);
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                C7103h f = a.mo18009f();
                C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
                if (f.getIMSetting().f83738a == 1) {
                    String storyReplyText = selfStoryReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        C7573i.m23580a();
                    }
                    if (storyReplyText.length() <= 1024) {
                        C30918l.m100657a(this.f81257o, selfStoryReplyContent.getStoryReplyText(), this.f81196d, C31863ai.m103531a(message, baseContent), message.getMsgId());
                    }
                }
                DmtTextView dmtTextView3 = this.f81257o;
                C7573i.m23582a((Object) dmtTextView3, "mStoryReplyText");
                dmtTextView3.setText(selfStoryReplyContent.getStoryReplyText());
            }
        }
        this.f81197e.setTag(50331648, Integer.valueOf(32));
        this.f81197e.setTag(117440512, this.f81256n);
        this.f81197e.setTag(67108864, message);
    }
}
