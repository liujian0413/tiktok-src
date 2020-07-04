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
import com.p280ss.android.ugc.aweme.comment.model.ForwardPublishModel;
import com.p280ss.android.ugc.aweme.comment.p1102i.C24171a;
import com.p280ss.android.ugc.aweme.comment.param.C24199a;
import com.p280ss.android.ugc.aweme.comment.param.C24203c;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.e.t */
public final class C24125t extends C25652b<ForwardPublishModel, C24171a> {

    /* renamed from: a */
    public int f63776a;

    /* renamed from: d */
    private Comment f63777d;

    /* renamed from: e */
    private List<Object> f63778e;

    public C24125t() {
        mo66536a(new ForwardPublishModel());
    }

    /* renamed from: e */
    public final void mo62540e() {
        if (this.f63778e != null) {
            mo56976a(this.f63778e.toArray());
        }
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        if (this.f67572c != null) {
            ((C24171a) this.f67572c).mo62499e(this.f63777d);
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        this.f63778e = null;
        if (!(this.f67572c == null || this.f67571b == null || ((ForwardPublishModel) this.f67571b).getData() == null)) {
            Comment comment = ((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData()).getComment();
            if (comment == null) {
                ((C24171a) this.f67572c).mo62473a((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData());
            } else if (this.f63776a == 1 && !C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                Comment comment2 = (Comment) comment.getReplyComments().get(0);
                comment2.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment2.setReplyComments(arrayList);
                ((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData()).setComment(comment2);
                ((C24171a) this.f67572c).mo62473a((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData());
            } else if (this.f63776a != 2 || C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                comment.setCommentType(this.f63776a);
                ((C24171a) this.f67572c).mo62473a((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData());
            } else {
                Comment comment3 = (Comment) comment.getReplyComments().get(0);
                comment.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                    comment.setReplyToUserName(C43122ff.m136753A(comment3.getUser()));
                } else {
                    comment.setReplyToReplyId("0");
                }
                comment.setReplyComments(null);
                comment.setCommentType(2);
                ((C24171a) this.f67572c).mo62473a((ForwardDetail) ((ForwardPublishModel) this.f67571b).getData());
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C24171a) this.f67572c).mo62489b(exc, this.f63777d);
        }
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        this.f63778e = new ArrayList();
        for (Object add : objArr) {
            this.f63778e.add(add);
        }
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    public final boolean mo62539a(C24203c cVar) {
        Context context;
        this.f63777d = new Comment();
        this.f63777d.setText(cVar.f63865b);
        User curUser = C6861a.m21337f().getCurUser();
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(cVar.f63864a);
        if (awemeById != null && TextUtils.equals(awemeById.getAuthorUid(), curUser.getUid())) {
            if (C6405d.m19984g() == null) {
                context = C6399b.m19921a();
            } else {
                context = C6405d.m19984g();
            }
            this.f63777d.setLabelText(context.getString(R.string.mj));
            this.f63777d.setLabelType(1);
        }
        this.f63777d.setUser(curUser);
        String a = C24191m.m79478a();
        this.f63777d.setFakeId(a);
        String str = cVar.f63914k;
        Comment comment = this.f63777d;
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        comment.setForwardId(str);
        String str2 = cVar.f63866c;
        this.f63777d.setReplyId(str2);
        this.f63777d.setTextExtra(cVar.f63867d);
        String str3 = cVar.f63868e;
        Comment comment2 = this.f63777d;
        if (str3 != null) {
            str2 = str3;
        }
        comment2.setReplyToReplyId(str2);
        this.f63777d.setCommentType(this.f63776a);
        this.f63777d.setReplyComments(new ArrayList());
        this.f63777d.setEmoji(cVar.f63869f);
        cVar.f63872i = a;
        C24191m.f63849a.mo62640l(this.f63777d);
        C24191m.m79481b(this.f63777d, 3);
        C24191m.m79480a(this.f63777d, (C24199a) cVar);
        return super.mo56976a(cVar);
    }
}
