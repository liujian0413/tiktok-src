package com.p280ss.android.ugc.aweme.main.story;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.main.story.live.C33104d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.model.Story;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.main.story.a */
public final class C33067a {

    /* renamed from: a */
    public StoryResponse f86038a;

    /* renamed from: b */
    public C33104d f86039b;

    /* renamed from: a */
    public final boolean mo84756a() {
        if (m106778c() || mo84757b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo84757b() {
        if (this.f86039b == null || C6307b.m19566a((Collection<T>) this.f86039b.f86120a) || !C41983b.m133444a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m106778c() {
        boolean z;
        if (this.f86038a == null || C6307b.m19566a((Collection<T>) this.f86038a.getStoryFeed())) {
            return false;
        }
        Iterator it = this.f86038a.getStoryFeed().iterator();
        while (true) {
            z = true;
            if (it.hasNext()) {
                if (((Story) it.next()).isLive()) {
                    if (C41983b.m133444a()) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }
}
