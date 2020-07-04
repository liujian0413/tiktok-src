package com.p280ss.android.ugc.aweme.challenge.recommend.p1085a;

import android.content.Context;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.video.hashtag.C43228b.C43229a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a */
public final class C23698a {
    @C6593c(mo15949a = "mark")

    /* renamed from: a */
    public int f62458a;
    @C6593c(mo15949a = "pos")

    /* renamed from: b */
    public int f62459b;
    @C6593c(mo15949a = "ch_info")

    /* renamed from: c */
    public Challenge f62460c;
    @C6593c(mo15949a = "ad_data")

    /* renamed from: d */
    public C23699a f62461d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a$a */
    public static class C23699a implements C43229a {
        @C6593c(mo15949a = "creative_id")

        /* renamed from: a */
        public long f62462a;
        @C6593c(mo15949a = "type")

        /* renamed from: b */
        public String f62463b;
        @C6593c(mo15949a = "log_extra")

        /* renamed from: c */
        public String f62464c;
        @C6593c(mo15949a = "is_preview")

        /* renamed from: d */
        public boolean f62465d;

        /* renamed from: a */
        public final void mo61661a(Context context, int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            C24958f.m81905a().mo65266a("launch_ad").mo65276b("show").mo65283e("topic").mo65286h(this.f62464c).mo65264a(Long.valueOf(this.f62462a)).mo65265a((Object) hashMap).mo65270a(context);
        }

        /* renamed from: b */
        public final void mo61662b(Context context, int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            C24958f.m81905a().mo65266a("launch_ad").mo65276b("click").mo65283e("topic").mo65286h(this.f62464c).mo65264a(Long.valueOf(this.f62462a)).mo65265a((Object) hashMap).mo65270a(context);
        }
    }
}
