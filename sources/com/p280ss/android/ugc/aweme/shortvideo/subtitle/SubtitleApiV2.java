package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import bolts.C1592h;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApiV2 */
public interface SubtitleApiV2 {
    @C7730f(mo20420a = "/aweme/v1/videocaption/query/")
    C1592h<C41110d> query(@C7744t(mo20436a = "task_id") String str);

    @C7730f(mo20420a = "/aweme/v1/videocaption/submit/")
    C1592h<C41110d> submit(@C7744t(mo20436a = "tos_key") String str, @C7744t(mo20436a = "max_lines") int i, @C7744t(mo20436a = "words_per_line") int i2);
}
