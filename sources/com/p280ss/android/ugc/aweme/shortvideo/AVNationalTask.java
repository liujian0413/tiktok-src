package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVNationalTask */
public final class AVNationalTask implements Serializable {
    @C6593c(mo15949a = "anchor")
    private TaskAnchorInfo anchor;
    @C6593c(mo15949a = "challenge_names")
    private List<String> challengeNames;
    @C6593c(mo15949a = "connect_music")
    private List<? extends AVMusic> connectMusic;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private String f99665id = "";
    @C6593c(mo15949a = "mv_ids")
    private List<String> mvIds;
    @C6593c(mo15949a = "sticker_ids")
    private List<String> stickerIds;

    public final TaskAnchorInfo getAnchor() {
        return this.anchor;
    }

    public final List<String> getChallengeNames() {
        return this.challengeNames;
    }

    public final List<AVMusic> getConnectMusic() {
        return this.connectMusic;
    }

    public final String getId() {
        return this.f99665id;
    }

    public final List<String> getMvIds() {
        return this.mvIds;
    }

    public final List<String> getStickerIds() {
        return this.stickerIds;
    }

    public final void setAnchor(TaskAnchorInfo taskAnchorInfo) {
        this.anchor = taskAnchorInfo;
    }

    public final void setChallengeNames(List<String> list) {
        this.challengeNames = list;
    }

    public final void setConnectMusic(List<? extends AVMusic> list) {
        this.connectMusic = list;
    }

    public final void setMvIds(List<String> list) {
        this.mvIds = list;
    }

    public final void setStickerIds(List<String> list) {
        this.stickerIds = list;
    }

    public final void setId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f99665id = str;
    }
}
