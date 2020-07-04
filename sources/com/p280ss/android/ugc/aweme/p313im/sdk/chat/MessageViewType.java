package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.text.TextUtils;
import android.view.View;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommandShareContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommentContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EPlatformCardContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupAnnouncementContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupInviteContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCouponContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodWindowContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMiniAppContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareStickerContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareWebContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StickerEmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoUpdateTipsContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30734b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType */
public enum MessageViewType {
    ITEM_SYSTEM_RECEIVE(0) {
        public final int getItemLayoutId() {
            return R.layout.z4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SystemContent.class;
        }
    },
    ITEM_TEXT_RECEIVE(1) {
        public final int getItemLayoutId() {
            return R.layout.z5;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_TEXT_SEND(2) {
        public final int getItemLayoutId() {
            return R.layout.z6;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_SHARE_AWEME_RECEIVE(3) {
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }

        public final int getItemLayoutId() {
            return C30734b.m100128b();
        }
    },
    ITEM_SHARE_AWEME_SEND(4) {
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }

        public final int getItemLayoutId() {
            return C30734b.m100129c();
        }
    },
    ITEM_SHARE_PICTURE_RECEIVE(5) {
        public final int getItemLayoutId() {
            return R.layout.yt;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_SHARE_PICTURE_SEND(6) {
        public final int getItemLayoutId() {
            return R.layout.yu;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_RECEIVE(10) {
        public final int getItemLayoutId() {
            return R.layout.yf;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_SEND(11) {
        public final int getItemLayoutId() {
            return R.layout.yg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_BIG_EMOJI_RECEIVE(12) {
        public final int getItemLayoutId() {
            return R.layout.y0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_BIG_EMOJI_SEND(13) {
        public final int getItemLayoutId() {
            return R.layout.y1;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_COMMAND_SHARE_RECEIVE(15) {
        public final int getItemLayoutId() {
            return R.layout.y2;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(Message message) {
            CommandShareContent commandShareContent = (CommandShareContent) MessageViewType.super.parse(message);
            commandShareContent.setSendMsg(false);
            return commandShareContent;
        }
    },
    ITEM_COMMAND_SHARE_SEND(16) {
        public final int getItemLayoutId() {
            return R.layout.y3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(Message message) {
            CommandShareContent commandShareContent = (CommandShareContent) MessageViewType.super.parse(message);
            commandShareContent.setSendMsg(true);
            return commandShareContent;
        }
    },
    ITEM_COMMENT_RECEIVE(17) {
        public final int getItemLayoutId() {
            return R.layout.y4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_COMMENT_SEND(18) {
        public final int getItemLayoutId() {
            return R.layout.y5;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_RECEIVE(24) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_SEND(25) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_RECEIVE(26) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_SEND(27) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_COUPON_RECEIVE(68) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_SHARE_COUPON_SEND(69) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_LOAD_MORE(9) {
        public final int getItemLayoutId() {
            return R.layout.x7;
        }

        public final String getMsgHint(BaseContent baseContent) {
            return "";
        }
    },
    ITEM_DEFAULT_RECEIVE(7) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getDefaultText(false);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            textContent.setText(MessageViewType.getDefaultText(false));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_DEFAULT_SEND(8) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getDefaultText(true);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            textContent.setText(MessageViewType.getDefaultText(true));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_VIDEO_UPDATE_TIPS(14) {
        public final int getItemLayoutId() {
            return R.layout.z7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoUpdateTipsContent.class;
        }
    },
    ITEM_SAY_HELLO(19) {
        public final int getItemLayoutId() {
            return R.layout.yh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(Message message) {
            SayHelloContent sayHelloContent = (SayHelloContent) MessageViewType.super.parse(message);
            sayHelloContent.setMsgHint(C1642a.m8034a(C6399b.m19921a().getResources().getString(R.string.box), new Object[]{sayHelloContent.getNickname()}));
            return sayHelloContent;
        }
    },
    ITEM_VOICE_RECEIVE(20) {
        public final int getItemLayoutId() {
            return R.layout.z8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }
    },
    ITEM_VOICE_SEND(21) {
        public final int getItemLayoutId() {
            return R.layout.z9;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }

        public final BaseContent parse(Message message) {
            if (message.getContent().equals("FakeVoiceMessage")) {
                return null;
            }
            return MessageViewType.super.parse(message);
        }
    },
    ITEM_SHARE_RANK_LIST_SEND(23) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_RANK_LIST_RECEIVE(22) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_SEND(29) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_RECEIVE(28) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_SEND(31) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_RECEIVE(30) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_SEND(33) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_RECEIVE(32) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_SEND(35) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE(34) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_SEND(39) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_RECEIVE(38) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_SHARE_USER_MULTI_SEND(41) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_MULTI_RECEIVE(40) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_SEND(43) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_RECEIVE(42) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_WEB_SEND(45) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_WEB_RECEIVE(44) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_LIVE_SEND(47) {
        public final int getItemLayoutId() {
            return R.layout.yu;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_SHARE_LIVE_RECEIVE(46) {
        public final int getItemLayoutId() {
            return R.layout.yt;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_STORY_REPLY_SEND(49) {
        public final int getItemLayoutId() {
            return R.layout.z0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_REPLY_RECEIVE(48) {
        public final int getItemLayoutId() {
            return R.layout.yz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_VIDEO_SEND(51) {
        public final int getItemLayoutId() {
            return R.layout.z3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_VIDEO_RECEIVE(50) {
        public final int getItemLayoutId() {
            return R.layout.z2;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_PICTURE_RECEIVE(52) {
        public final int getItemLayoutId() {
            return R.layout.yf;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_STORY_PICTURE_SEND(53) {
        public final int getItemLayoutId() {
            return R.layout.yg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_RECEIVE(54) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_SEND(55) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_RECEIVE(56) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_SEND(57) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE(58) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND(59) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_XPLAN_DEFAULT_SEND(61) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getXplanDefaultText(true);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            textContent.setText(MessageViewType.getXplanDefaultText(true));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_XPLAN_DEFAULT_RECEIVE(60) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getXplanDefaultText(false);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            textContent.setText(MessageViewType.getXplanDefaultText(false));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_RECALL_SEND(67) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getRecallText(true);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            if (C31863ai.m103540g(message)) {
                textContent.setText(C6399b.m19921a().getResources().getString(R.string.bms));
            } else {
                textContent.setText(MessageViewType.getRecallText(true));
            }
            return textContent;
        }
    },
    ITEM_RECALL_RECEIVE(66) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return MessageViewType.getRecallText(false);
        }

        public final BaseContent parse(Message message) {
            TextContent textContent = new TextContent();
            if (C31863ai.m103540g(message)) {
                textContent.setText(C6399b.m19921a().getResources().getString(R.string.bms));
            } else {
                textContent.setText(MessageViewType.getRecallText(false));
            }
            return textContent;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_RECEIVE(62) {
        public final int getItemLayoutId() {
            return R.layout.y0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_SEND(63) {
        public final int getItemLayoutId() {
            return R.layout.y1;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_RECEIVE(64) {
        public final int getItemLayoutId() {
            return R.layout.yz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_SEND(65) {
        public final int getItemLayoutId() {
            return R.layout.z0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SHARE_GOOD_RECEIVE(70) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_SEND(71) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_RECEIVE(72) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_SEND(73) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_RECEIVE(74) {
        public final int getItemLayoutId() {
            return R.layout.y8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_SEND(75) {
        public final int getItemLayoutId() {
            return R.layout.y9;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_GROUP_GREET_TIPS(76) {
        public final int getItemLayoutId() {
            return R.layout.y_;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(Message message) {
            SayHelloContent sayHelloContent = (SayHelloContent) MessageViewType.super.parse(message);
            StringBuilder sb = new StringBuilder("[");
            sb.append(C6399b.m19921a().getString(R.string.bj0));
            sb.append("]");
            sayHelloContent.setMsgHint(sb.toString());
            return sayHelloContent;
        }
    },
    ITEM_GROUP_INVITE_SEND(78) {
        public final int getItemLayoutId() {
            return R.layout.yd;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_INVITE_RECEIVE(77) {
        public final int getItemLayoutId() {
            return R.layout.yc;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_NOTICE(79) {
        public final int getItemLayoutId() {
            return R.layout.ye;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupNoticeContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_MULTI_RECEIVE(80) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_MULTI_SEND(81) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_SIMPLE_RECEIVE(82) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_SIMPLE_SEND(83) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_STICKER_MULTI_RECEIVE(84) {
        public final int getItemLayoutId() {
            return R.layout.ym;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_MULTI_SEND(85) {
        public final int getItemLayoutId() {
            return R.layout.yn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_SIMPLE_RECEIVE(86) {
        public final int getItemLayoutId() {
            return R.layout.yq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_SIMPLE_SEND(87) {
        public final int getItemLayoutId() {
            return R.layout.yr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_GROUP_ANNOUNCEMENT_RECEIVE(88) {
        public final int getItemLayoutId() {
            return R.layout.ya;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupAnnouncementContent.class;
        }
    },
    ITEM_GROUP_ANNOUNCEMENT_SEND(89) {
        public final int getItemLayoutId() {
            return R.layout.yb;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupAnnouncementContent.class;
        }
    };
    
    private static final Class<? extends BaseContent> DEFAULT_CONTENT_CLAZZ = null;
    private static final int DEFAULT_RECEIVE_LAYOUT_ID = 0;
    private static final int DEFAULT_SEND_LAYOUT_ID = 0;
    private int itemType;

    public int getItemLayoutId() {
        return DEFAULT_RECEIVE_LAYOUT_ID;
    }

    public int getItemViewType() {
        return this.itemType;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return DEFAULT_CONTENT_CLAZZ;
    }

    static {
        DEFAULT_CONTENT_CLAZZ = TextContent.class;
        DEFAULT_RECEIVE_LAYOUT_ID = R.layout.z5;
        DEFAULT_SEND_LAYOUT_ID = R.layout.z6;
    }

    public static boolean isMineMsg(Message message) {
        return message.isSelf();
    }

    public static BaseContent content(Message message) {
        return valueOf(message).parse(message);
    }

    public String getMsgHint(BaseContent baseContent) {
        if (baseContent == null) {
            return "";
        }
        return baseContent.getMsgHint();
    }

    public BaseViewHolder getViewHolder(View view) {
        return C30998t.m100858a(getItemViewType(), view);
    }

    public static String getRecallText(boolean z) {
        if (z) {
            return C6399b.m19921a().getString(R.string.bog);
        }
        return C6399b.m19921a().getString(R.string.bof);
    }

    public static String getXplanDefaultText(boolean z) {
        if (C7063bg.m22048a()) {
            return C6399b.m19921a().getString(R.string.bso);
        }
        return C6399b.m19921a().getString(R.string.bs3);
    }

    public static String getDefaultText(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = C6399b.m19921a().getString(R.string.bni);
        } else {
            str = C6399b.m19921a().getString(R.string.bnh);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(C6399b.m19921a().getString(R.string.biw));
        return sb.toString();
    }

    public BaseContent parse(Message message) {
        BaseContent baseContent;
        String content = message.getContent();
        try {
            baseContent = (BaseContent) C31913m.m103667a(content, getMessageContentClazz());
        } catch (Exception unused) {
            baseContent = null;
        }
        if (baseContent == null) {
            try {
                StringBuilder sb = new StringBuilder("MessageViewType parse: itemType:");
                sb.append(this.itemType);
                sb.append(" messageStr:");
                sb.append(message.toString());
                C6921a.m21555a(sb.toString());
                StringBuilder sb2 = new StringBuilder("MessageViewType parse: itemType:");
                sb2.append(this.itemType);
                sb2.append(" contentStr:");
                sb2.append(content);
                C6921a.m21555a(sb2.toString());
                return (BaseContent) getMessageContentClazz().newInstance();
            } catch (IllegalAccessException | InstantiationException unused2) {
            }
        }
        return baseContent;
    }

    public static MessageViewType valueOf(int i) {
        switch (i) {
            case 0:
                return ITEM_SYSTEM_RECEIVE;
            case 1:
                return ITEM_TEXT_RECEIVE;
            case 2:
                return ITEM_TEXT_SEND;
            case 3:
                return ITEM_SHARE_AWEME_RECEIVE;
            case 4:
                return ITEM_SHARE_AWEME_SEND;
            case 5:
                return ITEM_SHARE_PICTURE_RECEIVE;
            case 6:
                return ITEM_SHARE_PICTURE_SEND;
            case 7:
                return ITEM_DEFAULT_RECEIVE;
            case 8:
                return ITEM_DEFAULT_SEND;
            case 9:
                return ITEM_LOAD_MORE;
            case 10:
                return ITEM_ONLY_PICTURE_RECEIVE;
            case 11:
                return ITEM_ONLY_PICTURE_SEND;
            case 12:
                return ITEM_BIG_EMOJI_RECEIVE;
            case 13:
                return ITEM_BIG_EMOJI_SEND;
            case 14:
                return ITEM_VIDEO_UPDATE_TIPS;
            case 15:
                return ITEM_COMMAND_SHARE_RECEIVE;
            case 16:
                return ITEM_COMMAND_SHARE_SEND;
            case 17:
                return ITEM_COMMENT_RECEIVE;
            case 18:
                return ITEM_COMMENT_SEND;
            case 19:
                return ITEM_SAY_HELLO;
            case 20:
                return ITEM_VOICE_RECEIVE;
            case 21:
                return ITEM_VOICE_SEND;
            case 22:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 23:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 24:
                return ITEM_SHARE_POI_MULTI_RECEIVE;
            case 25:
                return ITEM_SHARE_POI_MULTI_SEND;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                return ITEM_SHARE_POI_SIMPLE_RECEIVE;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return ITEM_SHARE_POI_SIMPLE_SEND;
            case 28:
                return ITEM_SHARE_MUSIC_MULTI_RECEIVE;
            case 29:
                return ITEM_SHARE_MUSIC_MULTI_SEND;
            case 30:
                return ITEM_SHARE_MUSIC_SIMPLE_RECEIVE;
            case 31:
                return ITEM_SHARE_MUSIC_SIMPLE_SEND;
            case 32:
                return ITEM_SHARE_CHALLENGE_MULTI_RECEIVE;
            case 33:
                return ITEM_SHARE_CHALLENGE_MULTI_SEND;
            case BaseNotice.CHALLENGE /*34*/:
                return ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE;
            case 35:
                return ITEM_SHARE_CHALLENGE_SIMPLE_SEND;
            case 36:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 37:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 38:
                return ITEM_SHARE_MINI_APP_RECEIVE;
            case 39:
                return ITEM_SHARE_MINI_APP_SEND;
            case 40:
                return ITEM_SHARE_USER_MULTI_RECEIVE;
            case BaseNotice.LIKE /*41*/:
                return ITEM_SHARE_USER_MULTI_SEND;
            case 42:
                return ITEM_SHARE_USER_SIMPLE_RECEIVE;
            case 43:
                return ITEM_SHARE_USER_SIMPLE_SEND;
            case 44:
                return ITEM_SHARE_WEB_RECEIVE;
            case BaseNotice.f89516AT /*45*/:
                return ITEM_SHARE_WEB_SEND;
            case 46:
                return ITEM_SHARE_LIVE_RECEIVE;
            case 47:
                return ITEM_SHARE_LIVE_SEND;
            case 48:
                return ITEM_STORY_REPLY_RECEIVE;
            case 49:
                return ITEM_STORY_REPLY_SEND;
            case 50:
                return ITEM_STORY_VIDEO_RECEIVE;
            case 51:
                return ITEM_STORY_VIDEO_SEND;
            case 52:
                return ITEM_STORY_PICTURE_RECEIVE;
            case 53:
                return ITEM_STORY_PICTURE_SEND;
            case 54:
                return ITEM_COMMON_RED_ENVELOPE_RECEIVE;
            case 55:
                return ITEM_COMMON_RED_ENVELOPE_SEND;
            case 56:
                return ITEM_VIDEO_RED_ENVELOPE_RECEIVE;
            case 57:
                return ITEM_VIDEO_RED_ENVELOPE_SEND;
            case 58:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE;
            case 59:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND;
            case 60:
                return ITEM_XPLAN_DEFAULT_RECEIVE;
            case BaseNotice.TCM /*61*/:
                return ITEM_XPLAN_DEFAULT_SEND;
            case BaseNotice.CREATOR /*62*/:
                return ITEM_XPLAN_STICKER_EMOJI_RECEIVE;
            case 63:
                return ITEM_XPLAN_STICKER_EMOJI_SEND;
            case 64:
                return ITEM_SELF_STORY_REPLY_RECEIVE;
            case 65:
                return ITEM_SELF_STORY_REPLY_SEND;
            case 66:
                return ITEM_RECALL_RECEIVE;
            case 67:
                return ITEM_RECALL_SEND;
            case 68:
                return ITEM_SHARE_COUPON_RECEIVE;
            case 69:
                return ITEM_SHARE_COUPON_SEND;
            case 70:
                return ITEM_SHARE_GOOD_RECEIVE;
            case 71:
                return ITEM_SHARE_GOOD_SEND;
            case 72:
                return ITEM_SHARE_GOOD_WINDOW_RECEIVE;
            case 73:
                return ITEM_SHARE_GOOD_WINDOW_SEND;
            case 74:
                return ITEM_E_PLATFORM_CARD_RECEIVE;
            case 75:
                return ITEM_E_PLATFORM_CARD_SEND;
            case 76:
                return ITEM_GROUP_GREET_TIPS;
            case 77:
                return ITEM_GROUP_INVITE_RECEIVE;
            case 78:
                return ITEM_GROUP_INVITE_SEND;
            case 79:
                return ITEM_GROUP_NOTICE;
            case 80:
                return ITEM_SHARE_COMPILATION_MULTI_RECEIVE;
            case 81:
                return ITEM_SHARE_COMPILATION_MULTI_SEND;
            case 82:
                return ITEM_SHARE_COMPILATION_SIMPLE_RECEIVE;
            case 83:
                return ITEM_SHARE_COMPILATION_SIMPLE_SEND;
            case 84:
                return ITEM_SHARE_STICKER_MULTI_RECEIVE;
            case 85:
                return ITEM_SHARE_STICKER_MULTI_SEND;
            case 86:
                return ITEM_SHARE_STICKER_SIMPLE_RECEIVE;
            case 87:
                return ITEM_SHARE_STICKER_SIMPLE_SEND;
            case 88:
                return ITEM_GROUP_ANNOUNCEMENT_RECEIVE;
            case 89:
                return ITEM_GROUP_ANNOUNCEMENT_SEND;
            default:
                return ITEM_DEFAULT_RECEIVE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0211, code lost:
        if (isMineMsg(r6) != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0239, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0480, code lost:
        if (isMineMsg(r6) != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (isMineMsg(r6) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r3 = 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        if (isMineMsg(r6) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType valueOf(com.bytedance.p263im.core.model.Message r6) {
        /*
            boolean r0 = r6.isRecalled()
            if (r0 == 0) goto L_0x0016
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x000f
            r6 = 67
            goto L_0x0011
        L_0x000f:
            r6 = 66
        L_0x0011:
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r6 = valueOf(r6)
            return r6
        L_0x0016:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 7
            r2 = 8
            if (r0 == 0) goto L_0x0030
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x002b
            r1 = 8
        L_0x002b:
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r6 = valueOf(r1)
            return r6
        L_0x0030:
            int r0 = r6.getMsgType()
            switch(r0) {
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                default: goto L_0x0037;
            }
        L_0x0037:
            r3 = 1
            r4 = 2
            r5 = 3
            switch(r0) {
                case 7: goto L_0x047c;
                case 8: goto L_0x0471;
                case 9: goto L_0x046c;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r0) {
                case 12: goto L_0x0460;
                case 13: goto L_0x0450;
                case 14: goto L_0x044b;
                case 15: goto L_0x0446;
                case 16: goto L_0x0436;
                case 17: goto L_0x0424;
                case 18: goto L_0x0412;
                case 19: goto L_0x03b9;
                case 20: goto L_0x035e;
                case 21: goto L_0x034c;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02df;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0272;
                case 26: goto L_0x0260;
                case 27: goto L_0x024e;
                case 28: goto L_0x023c;
                default: goto L_0x0040;
            }
        L_0x0040:
            switch(r0) {
                case 35: goto L_0x0231;
                case 36: goto L_0x0228;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r0) {
                case 51: goto L_0x0216;
                case 52: goto L_0x020d;
                case 53: goto L_0x01fb;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r0) {
                case 61: goto L_0x01e9;
                case 62: goto L_0x01d7;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r0) {
                case 70: goto L_0x01c5;
                case 71: goto L_0x016a;
                case 72: goto L_0x010f;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case 1001: goto L_0x0109;
                case 1002: goto L_0x0103;
                default: goto L_0x004f;
            }
        L_0x004f:
            r3 = 60
            r4 = 61
            switch(r0) {
                case 5: goto L_0x00f1;
                case 30: goto L_0x00df;
                case 32: goto L_0x00a1;
                case 38: goto L_0x0097;
                case 58: goto L_0x0085;
                case 1004: goto L_0x0073;
                default: goto L_0x0056;
            }
        L_0x0056:
            boolean r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai.m103538e(r6)
            if (r0 == 0) goto L_0x0066
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0496
        L_0x0062:
            r3 = 61
            goto L_0x0496
        L_0x0066:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0070
            r3 = 8
            goto L_0x0496
        L_0x0070:
            r3 = 7
            goto L_0x0496
        L_0x0073:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x007f
            r6 = 89
            r3 = 89
            goto L_0x0496
        L_0x007f:
            r6 = 88
            r3 = 88
            goto L_0x0496
        L_0x0085:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0091
            r6 = 78
            r3 = 78
            goto L_0x0496
        L_0x0091:
            r6 = 77
            r3 = 77
            goto L_0x0496
        L_0x0097:
            r0 = 59
            r1 = 58
            int r1 = getRedEnvelopeItemType(r6, r0, r1)
            goto L_0x0239
        L_0x00a1:
            boolean r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai.m103538e(r6)
            r1 = 48
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r0 = valueOf(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r0 = r0.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent) r0
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryContent r0 = r0.getStoryContent()
            int r0 = r0.getSyncAweme()
            if (r0 != 0) goto L_0x00c6
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0496
            goto L_0x0062
        L_0x00c6:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00d2
            r6 = 49
        L_0x00ce:
            r3 = 49
            goto L_0x0496
        L_0x00d2:
            r3 = 48
            goto L_0x0496
        L_0x00d6:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00d2
            r6 = 49
            goto L_0x00ce
        L_0x00df:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00eb
            r6 = 51
            r3 = 51
            goto L_0x0496
        L_0x00eb:
            r6 = 50
            r3 = 50
            goto L_0x0496
        L_0x00f1:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00fd
            r6 = 13
            r3 = 13
            goto L_0x0496
        L_0x00fd:
            r6 = 12
            r3 = 12
            goto L_0x0496
        L_0x0103:
            r1 = 76
            r3 = 76
            goto L_0x0496
        L_0x0109:
            r1 = 79
            r3 = 79
            goto L_0x0496
        L_0x010f:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x012b
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0125
            r6 = 87
        L_0x0121:
            r3 = 87
            goto L_0x0496
        L_0x0125:
            r6 = 86
        L_0x0127:
            r3 = 86
            goto L_0x0496
        L_0x012b:
            r0 = 84
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareStickerContent) r1
            if (r1 == 0) goto L_0x015e
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x015e
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x014e
            goto L_0x015e
        L_0x014e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x015a
            r6 = 85
            r3 = 85
            goto L_0x0496
        L_0x015a:
            r3 = 84
            goto L_0x0496
        L_0x015e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0167
            r6 = 87
            goto L_0x0121
        L_0x0167:
            r6 = 86
            goto L_0x0127
        L_0x016a:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0186
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0180
            r6 = 83
        L_0x017c:
            r3 = 83
            goto L_0x0496
        L_0x0180:
            r6 = 82
        L_0x0182:
            r3 = 82
            goto L_0x0496
        L_0x0186:
            r0 = 80
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCompilationContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent) r1
            if (r1 == 0) goto L_0x01b9
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x01b9
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x01a9
            goto L_0x01b9
        L_0x01a9:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01b5
            r6 = 81
            r3 = 81
            goto L_0x0496
        L_0x01b5:
            r3 = 80
            goto L_0x0496
        L_0x01b9:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01c2
            r6 = 83
            goto L_0x017c
        L_0x01c2:
            r6 = 82
            goto L_0x0182
        L_0x01c5:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01d1
            r6 = 75
            r3 = 75
            goto L_0x0496
        L_0x01d1:
            r6 = 74
            r3 = 74
            goto L_0x0496
        L_0x01d7:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01e3
            r6 = 73
            r3 = 73
            goto L_0x0496
        L_0x01e3:
            r6 = 72
            r3 = 72
            goto L_0x0496
        L_0x01e9:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01f5
            r6 = 71
            r3 = 71
            goto L_0x0496
        L_0x01f5:
            r6 = 70
            r3 = 70
            goto L_0x0496
        L_0x01fb:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0207
            r6 = 65
            r3 = 65
            goto L_0x0496
        L_0x0207:
            r6 = 64
            r3 = 64
            goto L_0x0496
        L_0x020d:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0496
        L_0x0213:
            r3 = 2
            goto L_0x0496
        L_0x0216:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0222
            r6 = 63
            r3 = 63
            goto L_0x0496
        L_0x0222:
            r6 = 62
            r3 = 62
            goto L_0x0496
        L_0x0228:
            r0 = 57
            r1 = 56
            int r1 = getRedEnvelopeItemType(r6, r0, r1)
            goto L_0x0239
        L_0x0231:
            r0 = 55
            r1 = 54
            int r1 = getRedEnvelopeItemType(r6, r0, r1)
        L_0x0239:
            r3 = r1
            goto L_0x0496
        L_0x023c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0248
            r6 = 69
            r3 = 69
            goto L_0x0496
        L_0x0248:
            r6 = 68
            r3 = 68
            goto L_0x0496
        L_0x024e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x025a
            r6 = 53
            r3 = 53
            goto L_0x0496
        L_0x025a:
            r6 = 52
            r3 = 52
            goto L_0x0496
        L_0x0260:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x026c
            r6 = 45
            r3 = 45
            goto L_0x0496
        L_0x026c:
            r6 = 44
            r3 = 44
            goto L_0x0496
        L_0x0272:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x028e
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0288
            r6 = 43
        L_0x0284:
            r3 = 43
            goto L_0x0496
        L_0x0288:
            r6 = 42
        L_0x028a:
            r3 = 42
            goto L_0x0496
        L_0x028e:
            r0 = 40
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent) r1
            if (r1 == 0) goto L_0x02c1
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x02c1
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x02b1
            goto L_0x02c1
        L_0x02b1:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02bd
            r6 = 41
            r3 = 41
            goto L_0x0496
        L_0x02bd:
            r3 = 40
            goto L_0x0496
        L_0x02c1:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02ca
            r6 = 43
            goto L_0x0284
        L_0x02ca:
            r6 = 42
            goto L_0x028a
        L_0x02cd:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02d9
            r6 = 39
            r3 = 39
            goto L_0x0496
        L_0x02d9:
            r6 = 38
            r3 = 38
            goto L_0x0496
        L_0x02df:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02eb
            r6 = 37
            r3 = 37
            goto L_0x0496
        L_0x02eb:
            r6 = 36
            r3 = 36
            goto L_0x0496
        L_0x02f1:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x030d
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0307
            r6 = 31
        L_0x0303:
            r3 = 31
            goto L_0x0496
        L_0x0307:
            r6 = 30
        L_0x0309:
            r3 = 30
            goto L_0x0496
        L_0x030d:
            r0 = 28
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent) r1
            if (r1 == 0) goto L_0x0340
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x0340
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x0330
            goto L_0x0340
        L_0x0330:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x033c
            r6 = 29
            r3 = 29
            goto L_0x0496
        L_0x033c:
            r3 = 28
            goto L_0x0496
        L_0x0340:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0349
            r6 = 31
            goto L_0x0303
        L_0x0349:
            r6 = 30
            goto L_0x0309
        L_0x034c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0358
            r6 = 47
            r3 = 47
            goto L_0x0496
        L_0x0358:
            r6 = 46
            r3 = 46
            goto L_0x0496
        L_0x035e:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x037a
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0374
            r6 = 27
        L_0x0370:
            r3 = 27
            goto L_0x0496
        L_0x0374:
            r6 = 26
        L_0x0376:
            r3 = 26
            goto L_0x0496
        L_0x037a:
            r0 = 24
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent) r1
            if (r1 == 0) goto L_0x03ad
            java.util.List r2 = r1.getCoverUrl()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x03ad
            java.util.List r1 = r1.getCoverUrl()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x039d
            goto L_0x03ad
        L_0x039d:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03a9
            r6 = 25
            r3 = 25
            goto L_0x0496
        L_0x03a9:
            r3 = 24
            goto L_0x0496
        L_0x03ad:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03b6
            r6 = 27
            goto L_0x0370
        L_0x03b6:
            r6 = 26
            goto L_0x0376
        L_0x03b9:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 35
            if (r0 == 0) goto L_0x03d5
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03cf
        L_0x03cb:
            r3 = 35
            goto L_0x0496
        L_0x03cf:
            r6 = 34
        L_0x03d1:
            r3 = 34
            goto L_0x0496
        L_0x03d5:
            r0 = 32
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r2 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = r2.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent) r2
            if (r2 == 0) goto L_0x0408
            java.util.List r3 = r2.getCoverUrl()
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)
            if (r3 != 0) goto L_0x0408
            java.util.List r2 = r2.getCoverUrl()
            int r2 = r2.size()
            if (r2 >= r5) goto L_0x03f8
            goto L_0x0408
        L_0x03f8:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0404
            r6 = 33
            r3 = 33
            goto L_0x0496
        L_0x0404:
            r3 = 32
            goto L_0x0496
        L_0x0408:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x040f
            goto L_0x03cb
        L_0x040f:
            r6 = 34
            goto L_0x03d1
        L_0x0412:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x041e
            r6 = 23
            r3 = 23
            goto L_0x0496
        L_0x041e:
            r6 = 22
            r3 = 22
            goto L_0x0496
        L_0x0424:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0430
            r6 = 21
            r3 = 21
            goto L_0x0496
        L_0x0430:
            r6 = 20
            r3 = 20
            goto L_0x0496
        L_0x0436:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0441
            r6 = 18
            r3 = 18
            goto L_0x0496
        L_0x0441:
            r6 = 17
            r3 = 17
            goto L_0x0496
        L_0x0446:
            r1 = 19
            r3 = 19
            goto L_0x0496
        L_0x044b:
            r1 = 14
            r3 = 14
            goto L_0x0496
        L_0x0450:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x045b
            r6 = 16
            r3 = 16
            goto L_0x0496
        L_0x045b:
            r6 = 15
            r3 = 15
            goto L_0x0496
        L_0x0460:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0469
            r6 = 6
            r3 = 6
            goto L_0x0496
        L_0x0469:
            r6 = 5
            r3 = 5
            goto L_0x0496
        L_0x046c:
            r1 = 9
            r3 = 9
            goto L_0x0496
        L_0x0471:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x047a
            r5 = 4
            r3 = 4
            goto L_0x0496
        L_0x047a:
            r3 = 3
            goto L_0x0496
        L_0x047c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0496
            goto L_0x0213
        L_0x0484:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x048f
            r6 = 11
            r3 = 11
            goto L_0x0496
        L_0x048f:
            r6 = 10
            r3 = 10
            goto L_0x0496
        L_0x0494:
            r1 = 0
            r3 = 0
        L_0x0496:
            com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType r6 = valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType.valueOf(com.bytedance.im.core.model.Message):com.ss.android.ugc.aweme.im.sdk.chat.MessageViewType");
    }

    private MessageViewType(int i) {
        this.itemType = 1;
        this.itemType = i;
    }

    private static int getRedEnvelopeItemType(Message message, int i, int i2) {
        if (isMineMsg(message)) {
            if (C7063bg.m22048a()) {
                return i;
            }
            return 61;
        } else if (C7063bg.m22048a()) {
            return i2;
        } else {
            return 60;
        }
    }

    public static BaseContent content(int i, String str, boolean z, long j) {
        if (TextUtils.isEmpty(str)) {
            C6921a.m21555a("Content of stranger message is empty");
            return new TextContent();
        }
        Message message = new Message();
        message.getExt().put("s:is_recalled", String.valueOf(z));
        message.setContent(str);
        message.setMsgType(i);
        message.setSender(j);
        return content(message);
    }
}
