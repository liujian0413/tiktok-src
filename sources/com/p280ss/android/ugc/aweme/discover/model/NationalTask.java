package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.NationalTask */
public final class NationalTask extends BaseResponse {
    @C6593c(mo15949a = "anchor")
    public TaskAnchorInfo anchor;
    @C6593c(mo15949a = "challenge_names")
    public List<String> challengeNames;
    @C6593c(mo15949a = "connect_music")
    public List<? extends Music> connectMusic;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f70741id = "";
    @C6593c(mo15949a = "music_ids")
    public List<String> musicIds;
    @C6593c(mo15949a = "mv_ids")
    public List<String> mvIds;
    @C6593c(mo15949a = "sticker_ids")
    public List<String> stickerIds;

    public final void setId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f70741id = str;
    }
}
