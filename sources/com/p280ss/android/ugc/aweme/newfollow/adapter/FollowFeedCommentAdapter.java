package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.C24189o;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.ISearchMixViewHolderExperiment;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.CommentFollowFeedMomentViewHolder;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22385a;
import com.p280ss.android.ugc.aweme.p984ad.services.IAdService;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22468d;
import com.p280ss.android.ugc.aweme.p984ad.view.IAdViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedCommentAdapter */
public class FollowFeedCommentAdapter extends BaseAdapter<Comment> implements C24090a {

    /* renamed from: a */
    public int f88908a;

    /* renamed from: b */
    public String f88909b;

    /* renamed from: c */
    public Aweme f88910c;

    /* renamed from: d */
    public List<User> f88911d;

    /* renamed from: e */
    public C29395a f88912e;

    /* renamed from: f */
    private boolean f88913f;

    /* renamed from: g */
    private C22385a f88914g = new C22385a() {
        /* renamed from: a */
        public final void mo58876a() {
        }

        /* renamed from: a */
        public final void mo58877a(View view, boolean z, String str) {
            FollowFeedCommentAdapter.this.f88912e.mo75057a(view, FollowFeedCommentAdapter.this.f88910c, FollowFeedCommentAdapter.this.f88911d, false, str);
        }
    };

    /* renamed from: a */
    public final void mo62444a(Comment comment) {
    }

    /* renamed from: a */
    public final void mo62446a(CommentReplyButtonStruct commentReplyButtonStruct, int i) {
    }

    /* renamed from: a */
    public final void mo62447a(Emoji emoji) {
    }

    /* renamed from: f */
    public final void mo62451f() {
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (mo62312a() == null) {
            return super.mo58029a(i);
        }
        if (((Comment) mo62312a().get(i)) instanceof CommentStruct) {
            return 10;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo62443a(C24187m mVar, Comment comment) {
        if (this.f88912e != null) {
            this.f88912e.mo75063a(this.f88910c, this.f88911d, comment, "click_comment");
        }
    }

    /* renamed from: b */
    public final void mo62449b(C24187m mVar, Comment comment) {
        if (this.f88912e != null) {
            this.f88912e.mo75059a(this.f88910c, comment);
        }
    }

    /* renamed from: b */
    public final void mo62450b(String str, String str2) {
        if (this.f88912e != null) {
            this.f88912e.mo75066b(this.f88910c, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof IAdViewHolder) {
            C22468d dVar = new C22468d();
            dVar.f59913e = (CommentStruct) mo62312a().get(i);
            dVar.f59914f = new Rect(-1, -1, -1, -1);
            dVar.f59917i = this.f88914g;
            dVar.f59915g = this.f88909b;
            ((IAdViewHolder) vVar).mo58902a(C6399b.m19921a(), dVar);
        } else if (vVar instanceof CommentFollowFeedMomentViewHolder) {
            ((CommentFollowFeedMomentViewHolder) vVar).mo86954a((Comment) mo62312a().get(i));
        } else {
            ((C24189o) vVar).mo62362a((Comment) mo62312a().get(i));
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 10) {
            C22468d dVar = new C22468d();
            dVar.f59915g = this.f88909b;
            dVar.f59916h = 257;
            dVar.f59917i = this.f88914g;
            return ((IAdService) ServiceManager.get().getService(IAdService.class)).getViewHolderForType(viewGroup.getContext(), dVar);
        }
        boolean z = this.f88913f;
        int i2 = R.layout.vm;
        if (z) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (C29369d.m96463a()) {
                i2 = R.layout.wu;
            }
            CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = new CommentFollowFeedMomentViewHolder(from.inflate(i2, viewGroup, false), this);
            commentFollowFeedMomentViewHolder.f89196b = this.f88909b;
            commentFollowFeedMomentViewHolder.f89199e = this.f88910c.getAuthorUid();
            commentFollowFeedMomentViewHolder.f89198d = this.f88910c.getAid();
            return commentFollowFeedMomentViewHolder;
        } else if (this.f88908a == 9 && C6384b.m19835a().mo15287a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", C6384b.m19835a().mo15295d().search_mix_display_type, 0) == 6) {
            CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder2 = new CommentFollowFeedMomentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vm, viewGroup, false), this);
            commentFollowFeedMomentViewHolder2.f89196b = this.f88909b;
            commentFollowFeedMomentViewHolder2.f89197c = this.f88908a;
            commentFollowFeedMomentViewHolder2.f89199e = this.f88910c.getAuthorUid();
            commentFollowFeedMomentViewHolder2.f89198d = this.f88910c.getAid();
            return commentFollowFeedMomentViewHolder2;
        } else {
            C24189o providerCommentViewHolderFollowFeed = C24217a.m79549a().providerCommentViewHolderFollowFeed(viewGroup, this, C21115b.m71197a().getCurUserId());
            providerCommentViewHolderFollowFeed.mo62364a(this.f88909b);
            providerCommentViewHolderFollowFeed.mo62360a(this.f88908a);
            providerCommentViewHolderFollowFeed.mo62368c(this.f88910c.getAuthorUid());
            providerCommentViewHolderFollowFeed.mo62367b(this.f88910c.getAid());
            return (C1293v) providerCommentViewHolderFollowFeed;
        }
    }

    /* renamed from: a */
    public final void mo62445a(Comment comment, int i) {
        if (this.f88912e != null) {
            this.f88912e.mo75060a(this.f88910c, comment, i);
        }
    }

    /* renamed from: a */
    public final void mo62448a(String str, String str2) {
        if (this.f88912e != null) {
            this.f88912e.mo75061a(this.f88910c, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo62442a(View view, boolean z, String str) {
        if (this.f88912e != null) {
            this.f88912e.mo75057a(view, this.f88910c, this.f88911d, z, str);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        super.onBindViewHolder(vVar, i, list);
        if (!(vVar instanceof IAdViewHolder) && !this.f88913f && !list.isEmpty() && (list.get(0) instanceof Integer) && ((Integer) list.get(0)).intValue() == 0) {
            ((C24189o) vVar).mo62646m();
        }
    }

    public FollowFeedCommentAdapter(Aweme aweme, List<User> list, C29395a aVar, boolean z) {
        this.f88910c = aweme;
        this.f88912e = aVar;
        this.f88911d = list;
        this.f88913f = z;
    }
}
