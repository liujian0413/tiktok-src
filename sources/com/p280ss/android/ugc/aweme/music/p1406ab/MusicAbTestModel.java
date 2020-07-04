package com.p280ss.android.ugc.aweme.music.p1406ab;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.setting.p336a.C7204b;
import com.p280ss.android.ugc.aweme.setting.p336a.C7205f;
import com.p280ss.android.ugc.aweme.setting.p336a.C7206i;

/* renamed from: com.ss.android.ugc.aweme.music.ab.MusicAbTestModel */
public final class MusicAbTestModel {
    @C6593c(mo15949a = "enable_music_instant_search")
    @C7204b(mo18696a = "打开音乐即搜即得", mo18697b = "关闭音乐即搜即得")
    @C7205f(mo18698a = "Music")
    private boolean isMusicInstantSearchEnabled;
    @C6593c(mo15949a = "remove_15s_cap_music")
    @C7204b(mo18696a = "音乐播放时长取消15s限制", mo18697b = "音乐播放时长保持15s限制")
    private boolean isRemove15sCapMusic = true;
    @C6593c(mo15949a = "local_sound_entrance_style")
    @C7206i(mo18699a = "本地音乐入口", mo18700b = {0, 1, 2}, mo18701c = {"右上角", "Tab + My Sound", "Tab + Your Files"})
    @C7205f(mo18698a = "Music")
    private int localSoundEntranceStyle;
    @C6593c(mo15949a = "copywriting_in_save_or_download")
    @C7206i(mo18699a = "收藏和下载的文案AB测试", mo18700b = {0, 1, 2}, mo18701c = {"对照组", "实验组1", "实验组2"})
    @C7205f(mo18698a = "Feed")
    private int mtCopywritingSaveOrDownload;
    @C6593c(mo15949a = "music_list_style")
    @C7206i(mo18699a = "音乐选择页", mo18700b = {0, 1, 2}, mo18701c = {"旧版本", "新版本、无详情按钮", "新版本、有详情按钮"})
    @C7205f(mo18698a = "Music")
    private int musicListType = 1;
    @C6593c(mo15949a = "enable_add_sound_new_style")
    @C7206i(mo18699a = "音乐选择页2", mo18700b = {0, 1}, mo18701c = {"线上样式", "新样式"})
    @C7205f(mo18698a = "Music")
    private int musicListType2;
    @C6593c(mo15949a = "non_standard_ad_music_list_style")
    @C7206i(mo18699a = "非标广告位-热歌榜", mo18700b = {0, 1, 2}, mo18701c = {"关闭", "仅展示", "启用"})
    private int nonStdMusicList;

    public final int getLocalSoundEntranceStyle() {
        return this.localSoundEntranceStyle;
    }

    public final int getMtCopywritingSaveOrDownload() {
        return this.mtCopywritingSaveOrDownload;
    }

    public final int getMusicListType() {
        return this.musicListType;
    }

    public final int getMusicListType2() {
        return this.musicListType2;
    }

    public final int getNonStdMusicList() {
        return this.nonStdMusicList;
    }

    public final boolean isMusicInstantSearchEnabled() {
        return this.isMusicInstantSearchEnabled;
    }

    public final boolean isRemove15sCapMusic() {
        return this.isRemove15sCapMusic;
    }

    public final void setLocalSoundEntranceStyle(int i) {
        this.localSoundEntranceStyle = i;
    }

    public final void setMtCopywritingSaveOrDownload(int i) {
        this.mtCopywritingSaveOrDownload = i;
    }

    public final void setMusicInstantSearchEnabled(boolean z) {
        this.isMusicInstantSearchEnabled = z;
    }

    public final void setMusicListType(int i) {
        this.musicListType = i;
    }

    public final void setMusicListType2(int i) {
        this.musicListType2 = i;
    }

    public final void setNonStdMusicList(int i) {
        this.nonStdMusicList = i;
    }

    public final void setRemove15sCapMusic(boolean z) {
        this.isRemove15sCapMusic = z;
    }
}
