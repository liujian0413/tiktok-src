package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31821b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent */
public final class SelfStoryReplyContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "story")
    private StoryContent storyContent = new StoryContent();
    @C6593c(mo15949a = "text")
    private String storyReplyText;
    @C6593c(mo15949a = "story_state")
    private boolean storyState = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final SelfStoryReplyContent fromSharePackage(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            SelfStoryReplyContent selfStoryReplyContent = new SelfStoryReplyContent();
            selfStoryReplyContent.setStoryReplyText(sharePackage.f20186l.getString("share_text"));
            selfStoryReplyContent.getStoryContent().setStoryId(sharePackage.f20186l.getString("item_id_string"));
            Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
            if (serializable instanceof UrlModel) {
                selfStoryReplyContent.getStoryContent().setStoryCover((UrlModel) serializable);
            }
            selfStoryReplyContent.getStoryContent().setVideoHeight(sharePackage.f20186l.getInt("aweme_height"));
            selfStoryReplyContent.getStoryContent().setVideoWidth(sharePackage.f20186l.getInt("aweme_width"));
            return selfStoryReplyContent;
        }
    }

    public static final SelfStoryReplyContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
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
        super.tryInit();
        this.msgHint = this.storyReplyText;
    }

    public final SharePackage generateSharePackage() {
        PureDataSharePackage a = C31821b.m103274a("story_self_reply");
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
