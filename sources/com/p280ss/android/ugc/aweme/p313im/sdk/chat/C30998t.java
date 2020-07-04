package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.view.View;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30734b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommandShareSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommandShareViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommentSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommentViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommonRedEnvelopeHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.CommonRedEnvelopeSendHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.EPlatformReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.EPlatformSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.EmojiSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.EmojiViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GreetMessageViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GroupAnnouncementSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GroupAnnouncementViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GroupInviteSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GroupInviteViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.GroupNoticeViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.LoadMoreViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.OnlyPictureSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.OnlyPictureViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SayHelloViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SelfStoryReplyReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SelfStoryReplySendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeReceiveAutoPlayViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeReceiveNotPlayViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeSendAutoPlayViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeSendNotPlayViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareAwemeSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareChallengeSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareChallengeSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareChallengeSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareChallengeViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCompilationSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCompilationSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCompilationSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCompilationViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCouponSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareCouponSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareGoodSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareGoodViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareGoodWindowSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareGoodWindowViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareLiveReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareLiveSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMiniAppSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMiniAppViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMusicMultiReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMusicMultiSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMusicSimpleReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareMusicSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SharePoiSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SharePoiSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SharePoiSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SharePoiViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareRankingSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareRankingSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareStickerSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareStickerSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareStickerSimpleViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareStickerViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareUserMultiReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareUserMultiSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareUserSimpleReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareUserSimpleSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareWebReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.ShareWebSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryPictureSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryPictureViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryReplyReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryReplySendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryVideoReceiveViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.StoryVideoSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.SystemViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.TextSendViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.TextViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VideoRedEnvelopeHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VideoRedEnvelopeNewYearHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VideoRedEnvelopeNewYearSendHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VideoRedEnvelopeSendHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VideoUpdateTipsViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VoiceMessageViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VoiceMessagesSendViewHolder;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.t */
public final class C30998t {
    /* renamed from: a */
    public static BaseViewHolder m100858a(int i, View view) {
        switch (i) {
            case 0:
                return new SystemViewHolder(view, i);
            case 1:
                return new TextViewHolder(view, i);
            case 2:
                return new TextSendViewHolder(view, i);
            case 3:
                if (C30734b.m100127a() == 2 || C30734b.m100127a() == 4 || C30734b.m100127a() == 1) {
                    return new ShareAwemeReceiveAutoPlayViewHolder(view, i);
                }
                if (C30734b.m100127a() == 3) {
                    return new ShareAwemeReceiveNotPlayViewHolder(view, i);
                }
                return new ShareAwemeReceiveViewHolder(view, i);
            case 4:
                if (C30734b.m100127a() == 0) {
                    return new ShareAwemeSendViewHolder(view, i);
                }
                if (C30734b.m100127a() == 4) {
                    return new ShareAwemeSendAutoPlayViewHolder(view, i);
                }
                return new ShareAwemeSendNotPlayViewHolder(view, i);
            case 5:
                return new ShareAwemeReceiveViewHolder(view, i);
            case 6:
                return new ShareAwemeSendViewHolder(view, i);
            case 7:
                return new TextViewHolder(view, i);
            case 8:
                return new TextSendViewHolder(view, i);
            case 9:
                return new LoadMoreViewHolder(view, i);
            case 10:
                return new OnlyPictureViewHolder(view, i);
            case 11:
                return new OnlyPictureSendViewHolder(view, i);
            case 12:
                return new EmojiViewHolder(view, i);
            case 13:
                return new EmojiSendViewHolder(view, i);
            case 14:
                return new VideoUpdateTipsViewHolder(view, i);
            case 15:
                return new CommandShareViewHolder(view, i);
            case 16:
                return new CommandShareSendViewHolder(view, i);
            case 17:
                return new CommentViewHolder(view, i);
            case 18:
                return new CommentSendViewHolder(view, i);
            case 19:
                return new SayHelloViewHolder(view, i);
            case 20:
                return new VoiceMessageViewHolder(view, i);
            case 21:
                return new VoiceMessagesSendViewHolder(view, i);
            case 22:
                return new ShareRankingSimpleViewHolder(view, i);
            case 23:
                return new ShareRankingSimpleSendViewHolder(view, i);
            case 24:
                return new SharePoiViewHolder(view, i);
            case 25:
                return new SharePoiSendViewHolder(view, i);
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                return new SharePoiSimpleViewHolder(view, i);
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return new SharePoiSimpleSendViewHolder(view, i);
            case 28:
                return new ShareMusicMultiReceiveViewHolder(view, i);
            case 29:
                return new ShareMusicMultiSendViewHolder(view, i);
            case 30:
                return new ShareMusicSimpleReceiveViewHolder(view, i);
            case 31:
                return new ShareMusicSimpleSendViewHolder(view, i);
            case 32:
                return new ShareChallengeViewHolder(view, i);
            case 33:
                return new ShareChallengeSendViewHolder(view, i);
            case BaseNotice.CHALLENGE /*34*/:
                return new ShareChallengeSimpleViewHolder(view, i);
            case 35:
                return new ShareChallengeSimpleSendViewHolder(view, i);
            case 36:
                return new ShareRankingSimpleViewHolder(view, i);
            case 37:
                return new ShareRankingSimpleSendViewHolder(view, i);
            case 38:
                return new ShareMiniAppViewHolder(view, i);
            case 39:
                return new ShareMiniAppSendViewHolder(view, i);
            case 40:
                return new ShareUserMultiReceiveViewHolder(view, i);
            case BaseNotice.LIKE /*41*/:
                return new ShareUserMultiSendViewHolder(view, i);
            case 42:
                return new ShareUserSimpleReceiveViewHolder(view, i);
            case 43:
                return new ShareUserSimpleSendViewHolder(view, i);
            case 44:
                return new ShareWebReceiveViewHolder(view, i);
            case BaseNotice.f89516AT /*45*/:
                return new ShareWebSendViewHolder(view, i);
            case 46:
                return new ShareLiveReceiveViewHolder(view, i);
            case 47:
                return new ShareLiveSendViewHolder(view, i);
            case 48:
                return new StoryReplyReceiveViewHolder(view, i);
            case 49:
                return new StoryReplySendViewHolder(view, i);
            case 50:
                return new StoryVideoReceiveViewHolder(view, i);
            case 51:
                return new StoryVideoSendViewHolder(view, i);
            case 52:
                return new StoryPictureViewHolder(view, i);
            case 53:
                return new StoryPictureSendViewHolder(view, i);
            case 54:
                return new CommonRedEnvelopeHolder(view, i);
            case 55:
                return new CommonRedEnvelopeSendHolder(view, i);
            case 56:
                return new VideoRedEnvelopeHolder(view, i);
            case 57:
                return new VideoRedEnvelopeSendHolder(view, i);
            case 58:
                return new VideoRedEnvelopeNewYearHolder(view, i);
            case 59:
                return new VideoRedEnvelopeNewYearSendHolder(view, i);
            case 60:
                return new TextViewHolder(view, i);
            case BaseNotice.TCM /*61*/:
                return new TextSendViewHolder(view, i);
            case BaseNotice.CREATOR /*62*/:
                return new EmojiViewHolder(view, i);
            case 63:
                return new EmojiSendViewHolder(view, i);
            case 64:
                return new SelfStoryReplyReceiveViewHolder(view, i);
            case 65:
                return new SelfStoryReplySendViewHolder(view, i);
            case 68:
                return new ShareCouponSimpleViewHolder(view, i);
            case 69:
                return new ShareCouponSimpleSendViewHolder(view, i);
            case 70:
                return new ShareGoodViewHolder(view, i);
            case 71:
                return new ShareGoodSendViewHolder(view, i);
            case 72:
                return new ShareGoodWindowViewHolder(view, i);
            case 73:
                return new ShareGoodWindowSendViewHolder(view, i);
            case 74:
                return new EPlatformReceiveViewHolder(view, i);
            case 75:
                return new EPlatformSendViewHolder(view, i);
            case 76:
                return new GreetMessageViewHolder(view, i);
            case 77:
                return new GroupInviteViewHolder(view, i);
            case 78:
                return new GroupInviteSendViewHolder(view, i);
            case 79:
                return new GroupNoticeViewHolder(view, i);
            case 80:
                return new ShareCompilationViewHolder(view, i);
            case 81:
                return new ShareCompilationSendViewHolder(view, i);
            case 82:
                return new ShareCompilationSimpleViewHolder(view, i);
            case 83:
                return new ShareCompilationSimpleSendViewHolder(view, i);
            case 84:
                return new ShareStickerViewHolder(view, i);
            case 85:
                return new ShareStickerSendViewHolder(view, i);
            case 86:
                return new ShareStickerSimpleViewHolder(view, i);
            case 87:
                return new ShareStickerSimpleSendViewHolder(view, i);
            case 88:
                return new GroupAnnouncementViewHolder(view, i);
            case 89:
                return new GroupAnnouncementSendViewHolder(view, i);
            default:
                return new TextViewHolder(view, i);
        }
    }
}
