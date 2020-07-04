package com.p280ss.android.ugc.aweme.forward.view;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.adapter.FeedDetailAdapter;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.view.OriginAwemeDetailFragment */
public class OriginAwemeDetailFragment extends BaseAwemeDetailFragment {

    /* renamed from: o */
    public String f78720o;

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo76097u() {
        if (getArguments() != null) {
            Aweme aweme = (Aweme) getArguments().getSerializable("forward_item");
            if (aweme != null && aweme.getForwardItem() != null) {
                this.f78720o = getArguments().getString("share_id");
                this.f78676f.f78467w = this.f78720o;
                this.f78676f.f78466k = aweme;
                this.f78681k = aweme.getForwardItem();
                Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(this.f78681k.getAid());
                if (awemeById != null) {
                    this.f78681k.setStatistics(awemeById.getStatistics());
                    this.f78681k.setUserDigg(awemeById.getUserDigg());
                    this.f78681k.setStatus(awemeById.getStatus());
                    this.f78681k.setRepostFromGroupId(aweme.getAid());
                    this.f78681k.setRepostFromUserId(aweme.getAuthorUid());
                }
                this.f78676f.f78465j = this.f78681k;
                this.f78676f.mo58045a(FeedDetailAdapter.m97717a(this.f78681k, (List<Comment>) new ArrayList<Comment>()));
                C29893a.m97893c(this.f78678h, aweme);
                mo76098v();
                mo76099w();
            }
        }
    }
}
