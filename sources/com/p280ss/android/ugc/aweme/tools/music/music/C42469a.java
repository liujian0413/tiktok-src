package com.p280ss.android.ugc.aweme.tools.music.music;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.C42430c;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42447f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.a */
public class C42469a {

    /* renamed from: d */
    private static C42469a f110406d;
    @C6593c(mo15949a = "frame_count")

    /* renamed from: a */
    public int f110407a;
    @C6593c(mo15949a = "song_uri")

    /* renamed from: b */
    public String f110408b;
    @C6593c(mo15949a = "song_url_list")

    /* renamed from: c */
    public List<String> f110409c;

    /* renamed from: a */
    public static C42469a m134958a() {
        return f110406d;
    }

    /* renamed from: b */
    public static void m134960b() {
        try {
            String e = C42430c.m134876e();
            if (!TextUtils.isEmpty(e)) {
                f110406d = (C42469a) C42447f.m134903a().mo15974a(e, C42469a.class);
            }
        } catch (Exception unused) {
        }
        AIChooseMusicManager.m134825o();
    }

    /* renamed from: a */
    public static void m134959a(String str) {
        try {
            f110406d = (C42469a) C42447f.m134903a().mo15974a(str, C42469a.class);
            C42430c.m134869a(str);
        } catch (Exception unused) {
        }
        AIChooseMusicManager.m134825o();
    }
}
