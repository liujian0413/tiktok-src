package com.p280ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewBig */
public class StoryFeedItemViewBig extends StoryFeedItemView {
    /* access modifiers changed from: protected */
    public int getItemLayout() {
        return R.layout.b5i;
    }

    public StoryFeedItemViewBig(Context context) {
        super(context);
    }

    public void bind(StoryFeedItemViewModel storyFeedItemViewModel) {
        setIsBig(true);
        super.bind(storyFeedItemViewModel);
        if (this.mIvAvatar != null) {
            this.mIvAvatar.setAlpha(1.0f);
        }
    }
}
