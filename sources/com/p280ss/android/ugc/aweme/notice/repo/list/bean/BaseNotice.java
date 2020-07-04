package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice */
public class BaseNotice {
    public static final int AD_HELPER = 6;
    public static final int ANNOUNCEMENT = 1;

    /* renamed from: AT */
    public static final int f89516AT = 45;
    public static final int AUDITFAILED = 3;
    public static final int CHALLENGE = 34;
    public static final int CHECK_PROFILE = 1002;
    public static final int COMMENT = 31;
    public static final int CREATE_AWEME = 22;
    public static final int CREATOR = 62;
    public static final int DOUEXPRESS = 5;
    public static final int DOUYIN_ROBOT_NOTICE = 12;
    public static final int DUET = 21;
    public static final int FOLLOW = 33;
    public static final int FOLLOW_REQUEST = 13;
    public static final int FOLLOW_REQUEST_APPROVE = 23;
    public static final int FRIEND = 24;
    public static final int GAME_HELPER = 60;
    public static final int HASHTAG = 101;
    public static final int HEAD_TITLE = 999;
    public static final int LIKE = 41;
    public static final int LINK_PROFIT = 14;
    public static final int LIVE = 1001;
    public static final int LUBAN = 30;
    public static final int NEIGUANG = 7;
    public static final int RECOMMEND_LIVE = 50;
    public static final int SHOP = 4;
    public static final int STAR_ATLAS = 8;
    public static final int STORY_NOTICE_COMMENT = 26;
    public static final int STORY_NOTICE_UPDATE = 27;
    public static final int STORY_NOTICE_VIEW = 25;
    public static final int SYSTEM_ASSISTANT_NOTICE = 11;
    public static final int TCM = 61;
    public static final int TUTORIAL_VIDEO = 1000;
    public static final int USERTEXT = 2;
    public static final int VOTE = 9;
    public static final int WALLET = 10;
    @C6593c(mo15949a = "ad")
    C34351a adHelperNotice;
    @C6593c(mo15949a = "announcement")
    AnnouncementNotice announcement;
    @C6593c(mo15949a = "at")
    AtMe atMe;
    @C6593c(mo15949a = "audit")
    AuditFailedNotice auditNotice;
    @C6593c(mo15949a = "inner_avatar_thumb")
    UrlModel avatarUrl;
    @C6593c(mo15949a = "challenge")
    ChallengeNotice challengeNotice;
    public transient int clientOrder = -1;
    @C6593c(mo15949a = "comment")
    CommentNotice commentNotice;
    @C6593c(mo15949a = "create_time")
    long createTime;
    @C6593c(mo15949a = "digg")
    DiggNotice diggNotice;
    @C6593c(mo15949a = "duet")
    DuetNotice duetNotice;
    @C6593c(mo15949a = "follow")
    FollowNotice followNotice;
    @C6593c(mo15949a = "friend")
    FriendNotice friendNotice;
    @C6593c(mo15949a = "game_notice")
    C34354c gameNotice;
    @C6593c(mo15949a = "group_avatar_thumb")
    UrlModel groupAvatarUrl;
    @C6593c(mo15949a = "group_name")
    String groupName;
    public boolean isAlreadyRead = true;
    private transient long lastReadTime;
    @C6593c(mo15949a = "ad_link")
    C34356e linkProfitNotice;
    @C6593c(mo15949a = "live_assistant")
    public C34357f liveAssistantNotice;
    public LogPbBean logPbBean;
    @C6593c(mo15949a = "lowest_position")
    int lowestPosition;
    @C6593c(mo15949a = "luban_notice")
    C34358g lubanNotice;
    @C6593c(mo15949a = "nid")
    String nid;
    @C6593c(mo15949a = "poi_notice")
    public PoiNotice poiNotice;
    @C6593c(mo15949a = "shop")
    C34363k shopNotice;
    private int showingPosition;
    @C6593c(mo15949a = "amazing_notice")
    C34364l springRedPacketNotice;
    @C6593c(mo15949a = "star_atlas_notice")
    C34365m starAtlasNotice;
    @C6593c(mo15949a = "story_notice")
    StoryNotice storyNotice;
    @C6593c(mo15949a = "tcm_notice")
    C34366n tcmNotice;
    @C6593c(mo15949a = "text")
    UserTextNotice textNotice;
    public transient int timeLineType = -1;
    @C6593c(mo15949a = "type")
    int type;
    private int unReadCount;
    @C6593c(mo15949a = "urge")
    UrgeNotice urgeNotice;
    @C6593c(mo15949a = "user_id")
    String userId;
    @C6593c(mo15949a = "vote_notice")
    C34367o voteNotice;
    @C6593c(mo15949a = "wallet_notice")
    public WalletNotice walletNotice;

    public C34351a getAdHelperNotice() {
        return this.adHelperNotice;
    }

    public AnnouncementNotice getAnnouncement() {
        return this.announcement;
    }

    public AtMe getAtMe() {
        return this.atMe;
    }

    public AuditFailedNotice getAuditNotice() {
        return this.auditNotice;
    }

    public ChallengeNotice getChallengeNotice() {
        return this.challengeNotice;
    }

    public CommentNotice getCommentNotice() {
        return this.commentNotice;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public DiggNotice getDiggNotice() {
        return this.diggNotice;
    }

    public DuetNotice getDuetNotice() {
        return this.duetNotice;
    }

    public FollowNotice getFollowNotice() {
        return this.followNotice;
    }

    public FriendNotice getFriendNotice() {
        return this.friendNotice;
    }

    public C34354c getGameNotice() {
        return this.gameNotice;
    }

    public UrlModel getGroupAvatarUrl() {
        return this.groupAvatarUrl;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public C34356e getLinkProfit() {
        return this.linkProfitNotice;
    }

    public C34357f getLiveAssistantNotice() {
        return this.liveAssistantNotice;
    }

    public int getLowestPosition() {
        return this.lowestPosition;
    }

    public C34358g getLubanNotice() {
        return this.lubanNotice;
    }

    public String getNid() {
        return this.nid;
    }

    public PoiNotice getPoiNotice() {
        return this.poiNotice;
    }

    public C34363k getShopNotice() {
        return this.shopNotice;
    }

    public int getShowingPosition() {
        return this.showingPosition;
    }

    public C34364l getSpringRedPacketNotice() {
        return this.springRedPacketNotice;
    }

    public C34365m getStarAtlasNotice() {
        return this.starAtlasNotice;
    }

    public StoryNotice getStoryNotice() {
        return this.storyNotice;
    }

    public C34366n getTcmNotice() {
        return this.tcmNotice;
    }

    public UserTextNotice getTextNotice() {
        return this.textNotice;
    }

    public int getType() {
        return this.type;
    }

    public int getUnReadCount() {
        return this.unReadCount;
    }

    public UrgeNotice getUrgeNotice() {
        return this.urgeNotice;
    }

    public String getUserId() {
        return this.userId;
    }

    public C34367o getVoteNotice() {
        return this.voteNotice;
    }

    public WalletNotice getWalletNotice() {
        return this.walletNotice;
    }

    public UrlModel getAvatarUrl() {
        if (this.avatarUrl != null) {
            return this.avatarUrl;
        }
        return this.groupAvatarUrl;
    }

    public int hashCode() {
        return C23480h.m77086a(this.nid);
    }

    public boolean needForceInsert() {
        if ((this.type == 1 || this.type == 2 || this.type == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }

    public String getLabelText() {
        if (this.diggNotice != null) {
            return this.diggNotice.getLabelText();
        }
        if (this.atMe != null) {
            return this.atMe.getLabelText();
        }
        if (this.commentNotice != null) {
            return this.commentNotice.getLabelText();
        }
        return "";
    }

    public long getTaskId() {
        if (this.type == 1 && getAnnouncement() != null) {
            return getAnnouncement().getTaskId();
        }
        if (this.type != 2 || getTextNotice() == null) {
            return 0;
        }
        return getTextNotice().getTaskId();
    }

    public BaseNotice clone() {
        FollowNotice followNotice2;
        BaseNotice baseNotice = new BaseNotice();
        baseNotice.nid = this.nid;
        baseNotice.type = this.type;
        baseNotice.createTime = this.createTime;
        baseNotice.groupAvatarUrl = this.groupAvatarUrl;
        baseNotice.avatarUrl = this.avatarUrl;
        baseNotice.groupName = this.groupName;
        baseNotice.diggNotice = this.diggNotice;
        baseNotice.commentNotice = this.commentNotice;
        baseNotice.announcement = this.announcement;
        if (this.followNotice == null) {
            followNotice2 = null;
        } else {
            followNotice2 = this.followNotice.clone();
        }
        baseNotice.followNotice = followNotice2;
        baseNotice.atMe = this.atMe;
        baseNotice.textNotice = this.textNotice;
        baseNotice.auditNotice = this.auditNotice;
        baseNotice.challengeNotice = this.challengeNotice;
        baseNotice.userId = this.userId;
        baseNotice.shopNotice = this.shopNotice;
        baseNotice.adHelperNotice = this.adHelperNotice;
        baseNotice.friendNotice = this.friendNotice;
        baseNotice.storyNotice = this.storyNotice;
        baseNotice.lubanNotice = this.lubanNotice;
        baseNotice.starAtlasNotice = this.starAtlasNotice;
        baseNotice.voteNotice = this.voteNotice;
        baseNotice.poiNotice = this.poiNotice;
        baseNotice.lowestPosition = this.lowestPosition;
        baseNotice.linkProfitNotice = this.linkProfitNotice;
        baseNotice.lastReadTime = this.lastReadTime;
        baseNotice.timeLineType = this.timeLineType;
        baseNotice.clientOrder = this.clientOrder;
        baseNotice.isAlreadyRead = this.isAlreadyRead;
        baseNotice.liveAssistantNotice = this.liveAssistantNotice;
        baseNotice.walletNotice = this.walletNotice;
        baseNotice.logPbBean = this.logPbBean;
        baseNotice.showingPosition = this.showingPosition;
        baseNotice.unReadCount = this.unReadCount;
        baseNotice.duetNotice = this.duetNotice;
        baseNotice.springRedPacketNotice = this.springRedPacketNotice;
        baseNotice.gameNotice = this.gameNotice;
        return baseNotice;
    }

    public void setAdHelperNotice(C34351a aVar) {
        this.adHelperNotice = aVar;
    }

    public void setAnnouncement(AnnouncementNotice announcementNotice) {
        this.announcement = announcementNotice;
    }

    public void setAtMe(AtMe atMe2) {
        this.atMe = atMe2;
    }

    public void setAuditNotice(AuditFailedNotice auditFailedNotice) {
        this.auditNotice = auditFailedNotice;
    }

    public void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public void setChallengeNotice(ChallengeNotice challengeNotice2) {
        this.challengeNotice = challengeNotice2;
    }

    public void setCommentNotice(CommentNotice commentNotice2) {
        this.commentNotice = commentNotice2;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDiggNotice(DiggNotice diggNotice2) {
        this.diggNotice = diggNotice2;
    }

    public void setDuetNotice(DuetNotice duetNotice2) {
        this.duetNotice = duetNotice2;
    }

    public void setFollowNotice(FollowNotice followNotice2) {
        this.followNotice = followNotice2;
    }

    public void setFriendNotice(FriendNotice friendNotice2) {
        this.friendNotice = friendNotice2;
    }

    public void setGameNotice(C34354c cVar) {
        this.gameNotice = cVar;
    }

    public void setGroupAvatarUrl(UrlModel urlModel) {
        this.groupAvatarUrl = urlModel;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setLinkProfit(C34356e eVar) {
        this.linkProfitNotice = eVar;
    }

    public void setLiveAssistantNotice(C34357f fVar) {
        this.liveAssistantNotice = fVar;
    }

    public void setLowestPosition(int i) {
        this.lowestPosition = i;
    }

    public void setLubanNotice(C34358g gVar) {
        this.lubanNotice = gVar;
    }

    public void setNid(String str) {
        this.nid = str;
    }

    public void setPoiNotice(PoiNotice poiNotice2) {
        this.poiNotice = poiNotice2;
    }

    public void setShopNotice(C34363k kVar) {
        this.shopNotice = kVar;
    }

    public void setShowingPosition(int i) {
        this.showingPosition = i;
    }

    public void setSpringRedPacketNotice(C34364l lVar) {
        this.springRedPacketNotice = lVar;
    }

    public void setStarAtlasNotice(C34365m mVar) {
        this.starAtlasNotice = mVar;
    }

    public void setStoryNotice(StoryNotice storyNotice2) {
        this.storyNotice = storyNotice2;
    }

    public void setTcmNotice(C34366n nVar) {
        this.tcmNotice = nVar;
    }

    public void setTextNotice(UserTextNotice userTextNotice) {
        this.textNotice = userTextNotice;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public void setUrgeNotice(UrgeNotice urgeNotice2) {
        this.urgeNotice = urgeNotice2;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVoteNotice(C34367o oVar) {
        this.voteNotice = oVar;
    }

    public void setWalletNotice(WalletNotice walletNotice2) {
        this.walletNotice = walletNotice2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.isAlreadyRead != baseNotice.isAlreadyRead) {
            return false;
        }
        if (this.followNotice == null || baseNotice.followNotice == null) {
            return C23480h.m77087a(this.nid, baseNotice.nid);
        }
        if (!C23480h.m77087a(this.nid, baseNotice.nid) || !C23480h.m77087a(this.followNotice.user, baseNotice.followNotice.user)) {
            return false;
        }
        return true;
    }
}
