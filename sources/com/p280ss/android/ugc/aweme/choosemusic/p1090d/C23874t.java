package com.p280ss.android.ugc.aweme.choosemusic.p1090d;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.t */
public final class C23874t extends BaseResponse {
    @C6593c(mo15949a = "banner_list")

    /* renamed from: a */
    public List<Banner> f63005a;
    @C6593c(mo15949a = "mc_list")

    /* renamed from: b */
    public List<MusicCollectionItem> f63006b;
    @C6593c(mo15949a = "music_list")

    /* renamed from: c */
    public List<Music> f63007c;
    @C6593c(mo15949a = "extra_music_list")

    /* renamed from: d */
    public List<Music> f63008d;
    @C6593c(mo15949a = "music_list_type")

    /* renamed from: e */
    public int f63009e;
    @C6593c(mo15949a = "radio_cursor")

    /* renamed from: f */
    public int f63010f;

    /* renamed from: a */
    public final boolean mo61963a() {
        if (this.f63009e == 1) {
            return true;
        }
        return false;
    }
}
