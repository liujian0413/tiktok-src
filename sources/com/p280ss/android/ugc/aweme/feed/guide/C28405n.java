package com.p280ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.n */
public final class C28405n {

    /* renamed from: a */
    private List<String> f74853a;

    /* renamed from: b */
    private final SharedPreferences f74854b;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.n$a */
    static class C28407a {

        /* renamed from: a */
        public static final C28405n f74855a = new C28405n();
    }

    /* renamed from: a */
    public static C28405n m93353a() {
        return C28407a.f74855a;
    }

    private C28405n() {
        this.f74854b = C7285c.m22838a(C6399b.m19921a(), "sp_show_share_guide_cache", 0);
        try {
            this.f74853a = JSON.parseArray(this.f74854b.getString("cached_video_id", ""), String.class);
        } catch (Exception unused) {
        }
        if (this.f74853a == null) {
            this.f74853a = new ArrayList();
        }
    }

    /* renamed from: a */
    public final boolean mo72141a(String str) {
        return this.f74853a.contains(str);
    }

    /* renamed from: b */
    public final void mo72142b(String str) {
        if (!this.f74853a.contains(str)) {
            if (this.f74853a.size() >= 20) {
                this.f74853a.remove(0);
            }
            this.f74853a.add(str);
            this.f74854b.edit().putString("cached_video_id", JSON.toJSONString(this.f74853a)).apply();
        }
    }

    /* renamed from: a */
    public final void mo72140a(List<Aweme> list) {
        if (!C6307b.m19566a((Collection<T>) list) && list.size() >= 3 && !this.f74854b.getBoolean("sp_cached_first_three_video", false)) {
            for (Aweme aid : list.subList(0, 3)) {
                mo72142b(aid.getAid());
            }
            this.f74854b.edit().putBoolean("sp_cached_first_three_video", true).apply();
        }
    }
}
