package com.p280ss.android.ugc.aweme.comment.p1098e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p280ss.android.ugc.aweme.comment.param.C24199a;
import com.p280ss.android.ugc.aweme.comment.param.C24205d;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.e.l */
public final class C24115l extends C25652b<C24113j, C24126u> {

    /* renamed from: a */
    public int f63755a;

    /* renamed from: d */
    private List<Object> f63756d;

    /* renamed from: e */
    private Comment f63757e;

    public C24115l() {
        mo66536a(new C24113j());
    }

    /* renamed from: e */
    public final void mo62532e() {
        if (this.f63756d != null) {
            mo56976a(this.f63756d.toArray());
        }
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        if (this.f67572c != null) {
            ((C24126u) this.f67572c).mo62495c(this.f63757e);
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        this.f63756d = null;
        if (!(this.f67572c == null || this.f67571b == null || ((C24113j) this.f67571b).getData() == null)) {
            Comment comment = ((CommentResponse) ((C24113j) this.f67571b).getData()).comment;
            ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_comment", comment.getAwemeId());
            if (this.f63755a != 1 || C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                if (this.f63755a != 2 || C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                    comment.setCommentType(this.f63755a);
                    if (comment.getReplyComments() == null) {
                        comment.setReplyComments(new ArrayList());
                    }
                } else {
                    Comment comment2 = (Comment) comment.getReplyComments().get(0);
                    comment.setReplyToReplyId(comment2.getCid());
                    if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                        comment.setReplyToUserName(C43122ff.m136753A(comment2.getUser()));
                    } else {
                        comment.setReplyToReplyId("0");
                    }
                    comment.setReplyComments(null);
                    comment.setCommentType(2);
                }
                ((C24126u) this.f67572c).mo62497d(comment);
            } else {
                Comment comment3 = (Comment) comment.getReplyComments().get(0);
                comment3.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment3.setReplyComments(arrayList);
                ((C24126u) this.f67572c).mo62497d(comment3);
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C24126u) this.f67572c).mo62478a(exc, this.f63757e);
        }
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        this.f63756d = new ArrayList();
        for (Object add : objArr) {
            this.f63756d.add(add);
        }
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    public final boolean mo62531a(C24205d dVar) {
        this.f63757e = new Comment();
        this.f63757e.setAwemeId(dVar.f63864a);
        User curUser = C6861a.m21337f().getCurUser();
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(dVar.f63864a);
        if (awemeById != null && TextUtils.equals(awemeById.getAuthorUid(), curUser.getUid())) {
            Context g = C6405d.m19984g();
            if (g == null) {
                g = C6399b.m19921a();
            }
            this.f63757e.setLabelText(g.getString(R.string.mj));
            this.f63757e.setLabelType(1);
        }
        this.f63757e.setUser(curUser);
        String a = C24191m.m79478a();
        this.f63757e.setFakeId(a);
        this.f63757e.setText(dVar.f63865b);
        this.f63757e.setCommentType(this.f63755a);
        this.f63757e.setReplyComments(new ArrayList());
        this.f63757e.setEmoji(dVar.f63869f);
        if (!TextUtils.isEmpty(dVar.f63868e)) {
            this.f63757e.setReplyId(dVar.f63866c);
            this.f63757e.setTextExtra(dVar.f63867d);
            this.f63757e.setReplyToReplyId(dVar.f63868e);
            C24191m.m79481b(this.f63757e, 2);
        } else if (!TextUtils.isEmpty(dVar.f63866c)) {
            this.f63757e.setReplyId(dVar.f63866c);
            this.f63757e.setTextExtra(dVar.f63867d);
            this.f63757e.setReplyToReplyId(dVar.f63866c);
            C24191m.m79481b(this.f63757e, 2);
        } else {
            this.f63757e.setReplyId(dVar.f63866c);
            this.f63757e.setTextExtra(dVar.f63867d);
            this.f63757e.setReplyToReplyId(null);
            C24191m.m79481b(this.f63757e, 1);
        }
        dVar.f63872i = a;
        C24191m.f63849a.mo62640l(this.f63757e);
        C24191m.m79480a(this.f63757e, (C24199a) dVar);
        return super.mo56976a(dVar);
    }
}
