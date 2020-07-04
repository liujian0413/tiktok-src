package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter */
public abstract class AnimatedAdapter extends RecyclerHeaderViewAdapter<Aweme> {
    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar.mItemViewType == 0) {
            ((C25650d) vVar).mo66492a(true);
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar.mItemViewType == 0) {
            C25650d dVar = (C25650d) vVar;
            dVar.mo66492a(false);
            dVar.bz_();
        }
    }

    /* renamed from: a */
    public final int mo66489a(String str) {
        if (this.f67539l == null || this.f67539l.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f67539l.size();
        int i = 0;
        while (i < size) {
            Aweme aweme = (Aweme) this.f67539l.get(i);
            if (aweme == null || !C6319n.m19594a(str, aweme.getAid())) {
                i++;
            } else if (this.f62015c != null) {
                return i + 1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo66490a(FollowStatus followStatus) {
        if (this.f67539l != null && !this.f67539l.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.userId)) {
            for (Aweme aweme : this.f67539l) {
                if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null && followStatus.userId.equals(author.getUid())) {
                        author.setFollowStatus(followStatus.followStatus);
                    }
                }
            }
        }
    }
}
