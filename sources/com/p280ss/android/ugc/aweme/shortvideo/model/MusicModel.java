package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicModel */
public class MusicModel implements C33757h, Serializable {
    private static final long serialVersionUID = -8201137807648519242L;
    private String album;
    private String allRate;
    private int auditionDuration;
    private int billboardRank;
    private int challengeUserCount;
    private CollectionType collectionType;
    private int comeFromForMod;
    public int dataType;
    private int duration;
    private String extra;

    /* renamed from: id */
    private long f104084id;
    private boolean isChallengeMusic;
    boolean isCommerceMusic;
    private boolean isMvThemeMusic;
    private boolean isOriginal;
    boolean isOriginalSound;
    private String localMusicDuration;
    private LogPbBean logPb;
    private int lrcType;
    private String lrcUrl;
    private String lyricShort;
    private List<Position> lyricShortPosition;
    private Music music;
    private String musicEffectsUrl;
    private String musicId;
    private int musicStatus;
    MusicType musicType;
    private MusicWaveBean musicWaveBean;
    private String name;
    private String offlineDesc;
    private String path;
    private String picBig;
    private String picHuge;
    private String picPremium;
    private String picSmall;
    private boolean preventDownload;
    private float previewStartTime;
    private boolean redirect;
    private String searchKeyWords;
    private int shootDuration;
    private boolean showDetail;
    private String singer;
    private String songId;
    private int sourcePlatform;
    private UrlModel strongBeatUrl;
    private int userCount;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType */
    public enum CollectionType {
        NOT_COLLECTED,
        COLLECTED
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType */
    public enum MusicType {
        LOCAL,
        ONLINE,
        BAIDU
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAllRate() {
        return this.allRate;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public int getChallengeUserCount() {
        return this.challengeUserCount;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.f104084id;
    }

    public String getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
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

    public Music getMusic() {
        return this.music;
    }

    public String getMusicEffects() {
        return this.musicEffectsUrl;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public MusicType getMusicType() {
        return this.musicType;
    }

    public MusicWaveBean getMusicWaveBean() {
        return this.musicWaveBean;
    }

    public String getName() {
        return this.name;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public String getPicBig() {
        return this.picBig;
    }

    public String getPicHuge() {
        return this.picHuge;
    }

    public String getPicPremium() {
        return this.picPremium;
    }

    public String getPicSmall() {
        return this.picSmall;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSinger() {
        return this.singer;
    }

    public String getSongId() {
        return this.songId;
    }

    public int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public boolean isChallengeMusic() {
        return this.isChallengeMusic;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isOriginal() {
        return this.isOriginal;
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

    public Integer getAuditionDuration() {
        return Integer.valueOf(this.auditionDuration);
    }

    public Integer getShootDuration() {
        return Integer.valueOf(this.shootDuration);
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

    public CollectionType getCollectionType() {
        if (this.music == null) {
            return this.collectionType;
        }
        if (this.music.getCollectStatus() != 1) {
            return CollectionType.NOT_COLLECTED;
        }
        return CollectionType.COLLECTED;
    }

    public Music convertToMusic() {
        int i;
        Music music2 = new Music();
        music2.setMid(this.musicId);
        music2.setId(this.f104084id);
        if (this.collectionType == CollectionType.COLLECTED) {
            i = 1;
        } else {
            i = 0;
        }
        music2.setCollectStatus(i);
        music2.setAlbum(this.album);
        music2.setAuthorName(this.singer);
        if (getMusic() != null) {
            music2.setChallenge(getMusic().getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.picBig);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(this.picBig));
        music2.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.picPremium);
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(this.picPremium));
        music2.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.picSmall);
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(this.picSmall));
        music2.setCoverThumb(urlModel3);
        music2.setDuration(this.duration);
        music2.setShootDuration(Integer.valueOf(this.shootDuration));
        music2.setAuditionDuration(Integer.valueOf(this.auditionDuration));
        music2.setMusicName(this.name);
        music2.setBillboardRank(this.billboardRank);
        music2.setCommercialMusic(this.isCommerceMusic);
        music2.setOriginalSound(this.isOriginalSound);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(this.path);
        if (this.musicType == MusicType.ONLINE) {
            UrlModel urlModel4 = new UrlModel();
            urlModel4.setUrlList(arrayList4);
            urlModel4.setUri(Uri.decode(this.path));
            music2.setPlayUrl(urlModel4);
        }
        music2.setOfflineDesc(this.offlineDesc);
        music2.setMusicStatus(this.musicStatus);
        if (this.musicType == MusicType.BAIDU) {
            music2.setSource(4);
            if (getExtra() != null) {
                music2.setExtra(this.extra);
            } else {
                music2.setPath(this.path);
            }
        }
        music2.setRedirect(isRedirect());
        music2.setStrongBeatUrl(this.strongBeatUrl);
        music2.setLrcType(this.lrcType);
        music2.setPreviewStartTime(this.previewStartTime);
        music2.setLrcUrl(this.lrcUrl);
        music2.setPreventDownload(isPreventDownload());
        music2.setLyricShort(this.lyricShort);
        music2.setLyricShortPosition(this.lyricShortPosition);
        return music2;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAllRate(String str) {
        this.allRate = str;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setChallengeMusic(boolean z) {
        this.isChallengeMusic = z;
    }

    public void setChallengeUserCount(int i) {
        this.challengeUserCount = i;
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setId(long j) {
        this.f104084id = j;
    }

    public void setLocalMusicDuration(String str) {
        this.localMusicDuration = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
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

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public MusicModel setMusicEffects(String str) {
        this.musicEffectsUrl = str;
        return this;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicType(MusicType musicType2) {
        this.musicType = musicType2;
    }

    public void setMusicWaveBean(MusicWaveBean musicWaveBean2) {
        this.musicWaveBean = musicWaveBean2;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPicBig(String str) {
        this.picBig = str;
    }

    public void setPicHuge(String str) {
        this.picHuge = str;
    }

    public void setPicPremium(String str) {
        this.picPremium = str;
    }

    public void setPicSmall(String str) {
        this.picSmall = str;
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

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSourcePlatform(int i) {
        this.sourcePlatform = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setCollectionType(CollectionType collectionType2) {
        int i;
        this.collectionType = collectionType2;
        if (this.music != null) {
            Music music2 = this.music;
            if (collectionType2 == CollectionType.NOT_COLLECTED) {
                i = 0;
            } else {
                i = 1;
            }
            music2.setCollectStatus(i);
        }
    }
}
