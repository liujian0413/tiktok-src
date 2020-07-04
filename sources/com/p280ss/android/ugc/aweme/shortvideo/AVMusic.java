package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVMusic */
public class AVMusic implements Serializable, Cloneable {
    @C6593c(mo15949a = "album")
    public String album;
    @C6593c(mo15949a = "audio_track")
    public UrlModel audioTrack;
    @C6593c(mo15949a = "audition_duration")
    public int auditionDuration;
    @C6593c(mo15949a = "author")
    public String authorName;
    @C6593c(mo15949a = "challenge")
    public AVChallenge challenge;
    @C6593c(mo15949a = "come_from_for_mod")
    private int comeFromForMod;
    @C6593c(mo15949a = "cover_hd")
    public UrlModel coverHd;
    @C6593c(mo15949a = "cover_large")
    public UrlModel coverLarge;
    @C6593c(mo15949a = "cover_medium")
    public UrlModel coverMedium;
    @C6593c(mo15949a = "cover_thumb")
    public UrlModel coverThumb;
    @C6593c(mo15949a = "duration")
    public int duration;
    @C6593c(mo15949a = "extra")
    public String extra;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public long f99664id;
    @C6593c(mo15949a = "is_commerce_music")
    boolean isCommerceMusic;
    @C6593c(mo15949a = "is_mv_theme_music")
    private boolean isMvThemeMusic;
    @C6593c(mo15949a = "is_original_sound")
    boolean isOriginalSound;
    @C6593c(mo15949a = "log_pb")
    private LogPbBean logPb;
    @C6593c(mo15949a = "lyric_type")
    private int lrcType;
    @C6593c(mo15949a = "lyric_url")
    private String lrcUrl;
    @C6593c(mo15949a = "id_str")
    public String mid;
    @C6593c(mo15949a = "title")
    public String musicName;
    @C6593c(mo15949a = "music_priority")
    private int musicPriority;
    @C6593c(mo15949a = "status")
    public int musicStatus;
    @C6593c(mo15949a = "music_type")
    public int musicType;
    @C6593c(mo15949a = "music_wave_data")
    private float[] musicWaveData;
    @C6593c(mo15949a = "offline_desc")
    public String offlineDesc;
    @C6593c(mo15949a = "path")
    public String path;
    @C6593c(mo15949a = "play_url")
    public UrlModel playUrl;
    @C6593c(mo15949a = "prevent_download")
    private boolean preventDownload;
    @C6593c(mo15949a = "preview_start_time")
    private float previewStartTime;
    @C6593c(mo15949a = "redirect")
    private boolean redirect;
    @C6593c(mo15949a = "search_key_words")
    private String searchKeyWords;
    @C6593c(mo15949a = "shoot_duration")
    public int shootDuration;
    @C6593c(mo15949a = "song_id")
    private String songId;
    @C6593c(mo15949a = "source_platform")
    public int source;
    @C6593c(mo15949a = "stick_point_music_alg")
    private StickPointMusicAlg stickPointMusicAlg = new StickPointMusicAlg();
    @C6593c(mo15949a = "strong_beat_url")
    public UrlModel strongBeatUrl;

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
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

    public long getId() {
        return this.f99664id;
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

    public String getMid() {
        return this.mid;
    }

    public String getMusicId() {
        return this.mid;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.musicPriority;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.musicWaveData;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.songId;
    }

    public StickPointMusicAlg getStickPointMusicAlg() {
        return this.stickPointMusicAlg;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
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

    public AVMusic clone() {
        try {
            return (AVMusic) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
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

    public String getPicBig() {
        if (this.coverLarge == null || this.coverLarge.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverLarge.getUrlList().get(0);
    }

    public String getPicMedium() {
        if (this.coverMedium == null || this.coverMedium.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverMedium.getUrlList().get(0);
    }

    public String getPicSmall() {
        if (this.coverThumb == null || this.coverThumb.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverThumb.getUrlList().get(0);
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
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

    public void setMusicId(String str) {
        this.mid = str;
    }

    public void setMusicPriority(int i) {
        this.musicPriority = i;
    }

    public void setMusicWaveData(float[] fArr) {
        this.musicWaveData = fArr;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
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

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setStickPointMusicAlg(StickPointMusicAlg stickPointMusicAlg2) {
        this.stickPointMusicAlg = stickPointMusicAlg2;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }
}
