package com.p280ss.android.ugc.aweme.music.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import com.p280ss.android.ugc.aweme.hotsearch.model.BillboardWeeklyInfo;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.model.Music */
public class Music implements Serializable {
    @C6593c(mo15949a = "album")
    public String album;
    @C6593c(mo15949a = "audio_track")
    public UrlModel audioTrack;
    @C6593c(mo15949a = "audition_duration")
    public int auditionDuration;
    @C6593c(mo15949a = "author")
    public String authorName;
    @C6593c(mo15949a = "avatar_thumb")
    public UrlModel avatarThumb;
    @C6593c(mo15949a = "billboard_rank")
    public int billboardRank;
    @C6593c(mo15949a = "music_billboard_type")
    public int billboardType;
    @C6593c(mo15949a = "bodydance_challenge")
    public Challenge bodyDanceChallenge;
    @C6593c(mo15949a = "bodydance_url")
    public UrlModel bodyDanceUrl;
    @C6593c(mo15949a = "category_cover_info")
    public CategoryCoverStruct categoryCover;
    @C6593c(mo15949a = "challenge")
    public Challenge challenge;
    @C6593c(mo15949a = "challenge_name")
    public String challengeName;
    @C6593c(mo15949a = "cluster_id")
    public long clusterId;
    @C6593c(mo15949a = "collect_stat")
    public int collectStatus;
    @C6593c(mo15949a = "cover_hd")
    public UrlModel converHd;
    @C6593c(mo15949a = "cover_large")
    public UrlModel coverLarge;
    @C6593c(mo15949a = "cover_medium")
    public UrlModel coverMedium;
    @C6593c(mo15949a = "cover_thumb")
    public UrlModel coverThumb;
    @C6593c(mo15949a = "duration")
    public int duration;
    @C6593c(mo15949a = "effects_data")
    public UrlModel effectsData;
    @C6593c(mo15949a = "end_time")
    public int endTime;
    @C6593c(mo15949a = "extra")
    public String extra;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public long f88174id;
    @C6593c(mo15949a = "author_deleted")
    public boolean isAuthorDeleted;
    @C6593c(mo15949a = "is_commerce_music")
    public boolean isCommercialMusic;
    @C6593c(mo15949a = "is_original")
    public boolean isOriginMusic;
    @C6593c(mo15949a = "is_original_sound")
    public boolean isOriginalSound;
    @C6593c(mo15949a = "vcd_not_auth")
    public boolean isVcdNotAuth;
    @C6593c(mo15949a = "lyric_type")
    public int lrcType;
    @C6593c(mo15949a = "lyric_url")
    public String lrcUrl;
    @C6593c(mo15949a = "lyric_short")
    public String lyricShort;
    @C6593c(mo15949a = "lyric_short_position")
    public List<Position> lyricShortPosition;
    @C6593c(mo15949a = "external_song_info")
    public List<ExternalMusicInfo> mExternalMusicInfos;
    @C6593c(mo15949a = "artists")
    public List<MusicOwnerInfo> mMusicOwnerInfos;
    @C6593c(mo15949a = "owner_ban_show_info")
    public String mOwnerBanShowInfo;
    @C6593c(mo15949a = "id_str")
    public String mid;
    @C6593c(mo15949a = "title")
    public String musicName;
    @C6593c(mo15949a = "status")
    public int musicStatus;
    @C6593c(mo15949a = "tag_list")
    public List<MusicTag> musicTags;
    @C6593c(mo15949a = "mute_share")
    public boolean muteShare;
    @C6593c(mo15949a = "offline_desc")
    public String offlineDesc;
    @C6593c(mo15949a = "owner_handle")
    public String ownerHandle;
    @C6593c(mo15949a = "owner_id")
    public String ownerId;
    @C6593c(mo15949a = "owner_nickname")
    public String ownerNickName;
    public String path;
    @C6593c(mo15949a = "play_url")
    public UrlModel playUrl;
    @C6593c(mo15949a = "position")
    public List<Position> positions;
    @C6593c(mo15949a = "prevent_download")
    public boolean preventDownload;
    @C6593c(mo15949a = "preview_start_time")
    public float previewStartTime;
    @C6593c(mo15949a = "redirect")
    public boolean redirect;
    @C6593c(mo15949a = "related_musics")
    public List<Music> relatedMusics = new ArrayList();
    public String requestId;
    @C6593c(mo15949a = "schema_url")
    public String schema;
    @C6593c(mo15949a = "sec_uid")
    public String secUid;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "shoot_duration")
    public int shootDuration;
    @C6593c(mo15949a = "source_platform")
    public int source;
    @C6593c(mo15949a = "start_time")
    public int startTime;
    @C6593c(mo15949a = "strong_beat_url")
    public UrlModel strongBeatUrl;
    @C6593c(mo15949a = "user_count")
    public int userCount;
    @C6593c(mo15949a = "music_billboard_weekly_info")
    public BillboardWeeklyInfo weeklyBillInfo;

    public String getAlbum() {
        return this.album;
    }

    public UrlModel getAudioTrack() {
        return this.audioTrack;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public int getBillboardType() {
        return this.billboardType;
    }

    public Challenge getBodyDanceChallenge() {
        return this.bodyDanceChallenge;
    }

    public UrlModel getBodyDanceUrl() {
        return this.bodyDanceUrl;
    }

    public CategoryCoverStruct getCategoryCover() {
        return this.categoryCover;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public long getClusterId() {
        return this.clusterId;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public UrlModel getConverHd() {
        return this.converHd;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public int getDuration() {
        return this.duration;
    }

    public UrlModel getEffectsData() {
        return this.effectsData;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public List<ExternalMusicInfo> getExternalMusicInfos() {
        return this.mExternalMusicInfos;
    }

    public String getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.f88174id;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public String getLyricShort() {
        return this.lyricShort;
    }

    public List<Position> getLyricShortPosition() {
        return this.lyricShortPosition;
    }

    public String getMid() {
        return this.mid;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.mMusicOwnerInfos;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getOwnerBanShowInfo() {
        return this.mOwnerBanShowInfo;
    }

    public String getOwnerHandle() {
        return this.ownerHandle;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public List<Music> getRelatedMusics() {
        return this.relatedMusics;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public int getSource() {
        return this.source;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public BillboardWeeklyInfo getWeeklyBillInfo() {
        return this.weeklyBillInfo;
    }

    public boolean isAuthorDeleted() {
        return this.isAuthorDeleted;
    }

    public boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isOriginMusic() {
        return this.isOriginMusic;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRedirect() {
        return this.redirect;
    }

    public boolean isVcdNotAuth() {
        return this.isVcdNotAuth;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public int getPresenterDuration() {
        if (this.shootDuration > 0) {
            return this.shootDuration;
        }
        return this.duration;
    }

    public int getRealAuditionDuration() {
        if (this.auditionDuration > 0) {
            return this.auditionDuration;
        }
        return getPresenterDuration();
    }

    public int hashCode() {
        if (getMid() != null) {
            return getMid().hashCode();
        }
        return 0;
    }

    public MusicModel convertToMusicModel() {
        MusicModel musicModel = new MusicModel();
        musicModel.setMusic(this);
        if (!(getCoverMedium() == null || getCoverMedium().getUrlList() == null || getCoverMedium().getUrlList().size() <= 0)) {
            musicModel.setPicPremium((String) getCoverMedium().getUrlList().get(0));
        }
        if (!(getCoverThumb() == null || getCoverThumb().getUrlList() == null || getCoverThumb().getUrlList().size() <= 0)) {
            musicModel.setPicSmall((String) getCoverThumb().getUrlList().get(0));
        }
        if (!(getCoverLarge() == null || getCoverLarge().getUrlList() == null || getCoverLarge().getUrlList().size() <= 0)) {
            musicModel.setPicBig((String) getCoverLarge().getUrlList().get(0));
        }
        if (getCollectStatus() == 1) {
            musicModel.setCollectionType(CollectionType.COLLECTED);
        } else {
            musicModel.setCollectionType(CollectionType.NOT_COLLECTED);
        }
        MusicType musicType = MusicType.ONLINE;
        if (getSource() == 4) {
            musicType = MusicType.BAIDU;
        }
        musicModel.setSinger(getAuthorName());
        if (musicType != MusicType.ONLINE) {
            String str = "12345";
            if (getExtra() != null) {
                String extra2 = getExtra();
                musicModel.setExtra(extra2);
                try {
                    str = new JSONObject(extra2).getJSONObject("meta").getString("song_id");
                } catch (JSONException unused) {
                }
                if (str == null) {
                    str = "1";
                }
                musicModel.setPath(str);
            } else {
                musicModel.setPath(getPath());
            }
        } else if (!(getPlayUrl() == null || getPlayUrl().getUrlList() == null || getPlayUrl().getUrlList().isEmpty())) {
            musicModel.setPath((String) getPlayUrl().getUrlList().get(0));
        }
        musicModel.setMusicType(musicType);
        musicModel.setName(getMusicName());
        musicModel.setMusicId(getMid());
        musicModel.setDuration(getDuration() * 1000);
        musicModel.setShootDuration(Integer.valueOf(getShootDuration() * 1000));
        musicModel.setAuditionDuration(Integer.valueOf(getAuditionDuration() * 1000));
        musicModel.setOfflineDesc(getOfflineDesc());
        musicModel.setMusicStatus(getMusicStatus());
        musicModel.setUserCount(this.userCount);
        musicModel.setOriginal(isOriginMusic());
        musicModel.setBillboardRank(getBillboardRank());
        musicModel.setId(getId());
        musicModel.setLrcUrl(this.lrcUrl);
        musicModel.setLrcType(this.lrcType);
        musicModel.setPreviewStartTime(this.previewStartTime);
        musicModel.setCommerceMusic(this.isCommercialMusic);
        musicModel.setOriginalSound(this.isOriginalSound);
        musicModel.setLyricShort(this.lyricShort);
        musicModel.setLyricShortPosition(this.lyricShortPosition);
        if (!(getEffectsData() == null || getEffectsData().getUrlList() == null || getEffectsData().getUrlList().isEmpty())) {
            musicModel.setMusicEffects((String) getEffectsData().getUrlList().get(0));
        }
        musicModel.setRedirect(isRedirect());
        musicModel.setStrongBeatUrl(this.strongBeatUrl);
        musicModel.setPreventDownload(isPreventDownload());
        return musicModel;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAuthorDeleted(boolean z) {
        this.isAuthorDeleted = z;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setBillboardType(int i) {
        this.billboardType = i;
    }

    public void setBodyDanceChallenge(Challenge challenge2) {
        this.bodyDanceChallenge = challenge2;
    }

    public void setBodyDanceUrl(UrlModel urlModel) {
        this.bodyDanceUrl = urlModel;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setClusterId(long j) {
        this.clusterId = j;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommercialMusic(boolean z) {
        this.isCommercialMusic = z;
    }

    public void setConverHd(UrlModel urlModel) {
        this.converHd = urlModel;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public Music setEffectsData(UrlModel urlModel) {
        this.effectsData = urlModel;
        return this;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setExternalMusicInfos(List<ExternalMusicInfo> list) {
        this.mExternalMusicInfos = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setId(long j) {
        this.f88174id = j;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setLyricShort(String str) {
        this.lyricShort = str;
    }

    public void setLyricShortPosition(List<Position> list) {
        this.lyricShortPosition = list;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setMusicOwnerInfos(List<MusicOwnerInfo> list) {
        this.mMusicOwnerInfos = list;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginMusic(boolean z) {
        this.isOriginMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setOwnerHandle(String str) {
        this.ownerHandle = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setRedirect(boolean z) {
        this.redirect = z;
    }

    public void setRelatedMusics(List<Music> list) {
        this.relatedMusics = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVcdNotAuth(boolean z) {
        this.isVcdNotAuth = z;
    }

    public void setWeeklyBillInfo(BillboardWeeklyInfo billboardWeeklyInfo) {
        this.weeklyBillInfo = billboardWeeklyInfo;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Music)) {
            return false;
        }
        return TextUtils.equals(((Music) obj).getMid(), getMid());
    }
}
