package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31821b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent */
public final class StoryReplyContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "story")
    private StoryContent storyContent = new StoryContent();
    @C6593c(mo15949a = "text")
    private String storyReplyText;
    @C6593c(mo15949a = "story_state")
    private boolean storyState = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final StoryReplyContent fromSharePackage(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            StoryReplyContent storyReplyContent = new StoryReplyContent();
            storyReplyContent.setStoryReplyText(sharePackage.f20186l.getString("share_text"));
            storyReplyContent.getStoryContent().setStoryId(sharePackage.f20186l.getString("item_id_string"));
            Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
            if (serializable instanceof UrlModel) {
                storyReplyContent.getStoryContent().setStoryCover((UrlModel) serializable);
            }
            storyReplyContent.getStoryContent().setVideoHeight(sharePackage.f20186l.getInt("aweme_height"));
            storyReplyContent.getStoryContent().setVideoWidth(sharePackage.f20186l.getInt("aweme_width"));
            return storyReplyContent;
        }

        public final String wrapMessageHint(Message message, String str) {
            C7573i.m23587b(message, "message");
            C7573i.m23587b(str, "msgHint");
            Context a = C6399b.m19921a();
            if (message.isSelf()) {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getString(R.string.bql));
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.getString(R.string.bqk));
            sb2.append(str);
            return sb2.toString();
        }
    }

    public static final StoryReplyContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final String wrapMessageHint(Message message, String str) {
        return Companion.wrapMessageHint(message, str);
    }

    public final StoryContent getStoryContent() {
        return this.storyContent;
    }

    public final String getStoryReplyText() {
        return this.storyReplyText;
    }

    public final boolean getStoryState() {
        return this.storyState;
    }

    public final void tryInit() {
        this.msgHint = this.storyReplyText;
    }

    public final SharePackage generateSharePackage() {
        PureDataSharePackage a = C31821b.m103274a("story_reply");
        Bundle bundle = a.f20186l;
        bundle.putString("share_text", this.storyReplyText);
        bundle.putString("item_id_string", this.storyContent.getStoryId());
        bundle.putSerializable("video_cover", this.storyContent.getStoryCover());
        bundle.putInt("aweme_width", this.storyContent.getVideoWidth());
        bundle.putInt("aweme_height", this.storyContent.getVideoHeight());
        return a;
    }

    public final void setStoryReplyText(String str) {
        this.storyReplyText = str;
    }

    public final void setStoryState(boolean z) {
        this.storyState = z;
    }

    public final void setStoryContent(StoryContent storyContent2) {
        C7573i.m23587b(storyContent2, "<set-?>");
        this.storyContent = storyContent2;
    }
}
