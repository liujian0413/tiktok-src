package com.p280ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.mvvm.C23356a;
import com.p280ss.android.ugc.aweme.base.p1061e.C23329a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23473b;
import com.p280ss.android.ugc.aweme.base.utils.C23483k;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewModel.Status;
import com.p280ss.android.ugc.aweme.story.C41985c;
import com.p280ss.android.ugc.aweme.story.model.Story;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemView */
public class StoryFeedItemView implements C23356a<StoryFeedItemViewModel> {
    private static final int FOLLOWING_BORDER_NEW_COLOR = 2131100897;
    private static final int FOLLOWING_BORDER_READ_COLOR = 2131100949;
    private static final int INVALID_COLORS = 2131099897;
    private static final int LIVE_BORDER_COLOR = 2131100904;
    private static final int VALID_COLORS = 2131099899;
    private C23329a mAvatarDrawable;
    private View mFlBorderContainer;
    private ImageView mImgFollowingPlay;
    private boolean mIsBig;
    protected AvatarWithBorderView mIvAvatar;
    protected DmtTextView mIvLive;
    private View mLayout;
    private Status mStatusInView;
    private TextView mTvName;
    private View mView;
    private StoryFeedItemViewModel mViewModel;

    private void initListeners() {
    }

    public View getAndroidView() {
        return this.mView;
    }

    /* access modifiers changed from: protected */
    public int getItemLayout() {
        return R.layout.b5h;
    }

    public StoryFeedItemViewModel getViewModel() {
        return this.mViewModel;
    }

    public Rect getIvAvatarRect() {
        return C23487o.m77157d(this.mIvAvatar);
    }

    public Context getContext() {
        return getAndroidView().getContext();
    }

    public void refresh() {
        if (this.mViewModel != null) {
            bind(this.mViewModel);
        }
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        this.mAvatarDrawable = new C23329a();
        this.mAvatarDrawable.mo60613b(C23486n.m77122a(1.5d));
        C23329a.m76535a(this.mFlBorderContainer);
    }

    private void initReferences() {
        this.mLayout = this.mView.findViewById(R.id.b57);
        this.mFlBorderContainer = this.mView.findViewById(R.id.alw);
        this.mIvAvatar = (AvatarWithBorderView) this.mView.findViewById(R.id.b64);
        this.mTvName = (TextView) this.mView.findViewById(R.id.dyg);
        this.mIvLive = (DmtTextView) this.mView.findViewById(R.id.b_p);
        this.mImgFollowingPlay = (ImageView) this.mView.findViewById(R.id.az7);
    }

    public StoryFeedItemView(Context context) {
    }

    public void setIsBig(boolean z) {
        this.mIsBig = z;
    }

    private boolean isFollowingVideo(Status status) {
        if (status == Status.FOLLOWING_NEW || status == Status.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    private boolean isRead(Status status) {
        if (status == Status.READ || status == Status.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    public void bind(StoryFeedItemViewModel storyFeedItemViewModel) {
        int i;
        float f;
        int i2;
        int i3;
        String str;
        C23473b.m77069a(this, this.mViewModel, storyFeedItemViewModel);
        this.mViewModel = storyFeedItemViewModel;
        if (this.mViewModel.mo84779f() && C41985c.m133446a().mo103105a(this.mViewModel.mo84780g())) {
            this.mViewModel.mo84774a(Status.FOLLOWING_READ);
        }
        this.mViewModel.f86061d = this.mIsBig;
        storyFeedItemViewModel.mo60672a(this);
        this.mIvAvatar.setBackgroundDrawable(null);
        C23323e.m76504a((RemoteImageView) this.mIvAvatar, storyFeedItemViewModel.f86063f);
        C23487o.m77145a(this.mTvName, storyFeedItemViewModel.f86064g);
        if (!C6399b.m19944t()) {
            this.mLayout.setContentDescription(storyFeedItemViewModel.f86064g);
            this.mIvAvatar.setContentDescription(storyFeedItemViewModel.f86064g);
        }
        C23487o.m77141a((View) this.mIvAvatar, storyFeedItemViewModel.f86065h);
        Status status = storyFeedItemViewModel.f86067j;
        if (status == Status.LIVE) {
            Story story = storyFeedItemViewModel.f86066i.mo84758a().f109095a;
            if (story.getUserInfo().getFollowStatus() == 0) {
                DmtTextView dmtTextView = this.mIvLive;
                if (C23483k.m77110a(story.skyLightDisplayTag)) {
                    str = getContext().getResources().getString(R.string.dc3);
                } else {
                    str = story.skyLightDisplayTag;
                }
                dmtTextView.setText(str);
            } else {
                this.mIvLive.setText(R.string.bzz);
            }
        }
        if (this.mStatusInView != status) {
            Status status2 = this.mStatusInView;
            this.mStatusInView = status;
            ImageView imageView = this.mImgFollowingPlay;
            int i4 = 8;
            if (isFollowingVideo(status)) {
                i = 0;
            } else {
                i = 8;
            }
            C23487o.m77140a((View) imageView, i);
            DmtTextView dmtTextView2 = this.mIvLive;
            if (status == Status.LIVE) {
                i4 = 0;
            }
            C23487o.m77140a((View) dmtTextView2, i4);
            switch (status) {
                case NEW:
                    this.mIvAvatar.setBorderColor(VALID_COLORS);
                    break;
                case FOLLOWING_NEW:
                    this.mIvAvatar.setBorderColor(FOLLOWING_BORDER_NEW_COLOR);
                    break;
                case FOLLOWING_READ:
                    this.mIvAvatar.setBorderColor(FOLLOWING_BORDER_READ_COLOR);
                    break;
                case LIVE:
                    this.mIvAvatar.setBorderColor(LIVE_BORDER_COLOR);
                    break;
                case DOWNLOADING:
                    C23329a aVar = this.mAvatarDrawable;
                    if (isFollowingVideo(status2)) {
                        i3 = FOLLOWING_BORDER_NEW_COLOR;
                    } else {
                        i3 = VALID_COLORS;
                    }
                    aVar.mo60612a(i3);
                    this.mAvatarDrawable.mo60611a();
                    this.mIvAvatar.setBackgroundDrawable(this.mAvatarDrawable);
                    break;
                case READ:
                    this.mIvAvatar.setBorderColor(VALID_COLORS);
                    break;
            }
            boolean isRead = isRead(status2);
            boolean isRead2 = isRead(status);
            if (isRead != isRead2) {
                AvatarWithBorderView avatarWithBorderView = this.mIvAvatar;
                if (isRead2) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                avatarWithBorderView.setAlpha(f);
                ImageView imageView2 = this.mImgFollowingPlay;
                if (isRead2) {
                    i2 = R.drawable.b2g;
                } else {
                    i2 = R.drawable.b2f;
                }
                imageView2.setImageResource(i2);
            }
        }
    }

    public StoryFeedItemView create(Context context, ViewGroup viewGroup) {
        this.mView = LayoutInflater.from(context).inflate(getItemLayout(), viewGroup, false);
        initReferences();
        initListeners();
        initViews();
        this.mView.setTag(R.id.axz, this);
        return this;
    }
}
