package com.p280ss.android.ugc.aweme.comment.p1098e;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.list.C24184j;
import com.p280ss.android.ugc.aweme.comment.list.C24185k;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24163l;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.e.n */
public final class C24117n extends C25674b<C24116m> implements C24184j, C25675c<Comment> {

    /* renamed from: a */
    public String f63758a;

    /* renamed from: d */
    private C24185k f63759d;

    /* renamed from: e */
    private C24183i f63760e;

    /* renamed from: f */
    private CommentReplyButtonStruct f63761f;

    /* renamed from: g */
    private C24163l f63762g;

    /* renamed from: h */
    private String f63763h;

    /* renamed from: i */
    private String f63764i;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List list, boolean z) {
    }

    /* renamed from: g */
    private static boolean m79215g() {
        return C6399b.m19944t();
    }

    /* renamed from: e */
    private String m79213e() {
        if (this.f63761f != null) {
            return this.f63761f.getCid();
        }
        return "";
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (this.f63760e != null) {
            this.f63760e.mo62333a(3);
        }
    }

    public final void aD_() {
        if (this.f63760e != null) {
            this.f63760e.mo62333a(3);
        }
    }

    /* renamed from: f */
    private boolean m79214f() {
        if (this.f63760e != null && this.f63760e.mo62332a() == 3) {
            return true;
        }
        return false;
    }

    public final void ae_() {
        if (!(this.f63761f == null || ((C24116m) this.f67571b).getData() == null)) {
            this.f63761f.setCursor(((CommentItemList) ((C24116m) this.f67571b).getData()).cursor);
            this.f63761f.setHasMore(((C24116m) this.f67571b).isHasMore());
        }
        if (this.f63760e != null) {
            if (((C24116m) this.f67571b).isHasMore()) {
                this.f63760e.mo62333a(1);
                return;
            }
            this.f63760e.mo62333a(2);
        }
    }

    /* renamed from: a */
    public final void mo62534a(C24185k kVar) {
        this.f63759d = kVar;
    }

    public C24117n(String str) {
        this(str, "");
    }

    /* renamed from: a */
    public final void mo62535a(C24190p pVar) {
        ((C24116m) this.f67571b).f63745e = pVar;
    }

    /* renamed from: a */
    public final void mo62533a(C24163l lVar) {
        this.f63762g = lVar;
        ((C24116m) mo66539h()).f63745e = lVar;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        C22814a.m75244a((Context) C6405d.m19984g(), (Throwable) exc);
        if (this.f63760e != null) {
            this.f63760e.mo62333a(0);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        C22814a.m75244a((Context) C6405d.m19984g(), (Throwable) exc);
        if (this.f63760e != null) {
            this.f63760e.mo62333a(1);
        }
    }

    /* renamed from: b */
    private void m79211b(CommentReplyButtonStruct commentReplyButtonStruct) {
        String str = this.f63758a;
        if (this.f63762g != null && !this.f63762g.mo62599a(this.f63758a, commentReplyButtonStruct.getCommentId())) {
            str = "";
        }
        CommentReplyButtonStruct commentReplyButtonStruct2 = commentReplyButtonStruct;
        m79208a(4, commentReplyButtonStruct2, commentReplyButtonStruct.getCursor(), str, C22915b.m75418a(this.f63763h), C28290d.m93044e());
    }

    /* renamed from: a */
    private void m79209a(CommentReplyButtonStruct commentReplyButtonStruct) {
        String str;
        long j;
        String str2 = this.f63758a;
        long cursor = commentReplyButtonStruct.getCursor();
        if (cursor <= 0 || this.f63762g == null || this.f63762g.mo62599a(this.f63758a, commentReplyButtonStruct.getCommentId())) {
            str = str2;
            j = cursor;
        } else {
            str = "";
            j = 0;
        }
        m79208a(1, commentReplyButtonStruct, j, str, C22915b.m75418a(this.f63763h), C28290d.m93044e());
    }

    /* renamed from: a */
    private void m79210a(List<Comment> list) {
        List list2;
        if (this.f63762g != null) {
            list2 = this.f63762g.mo62601b(this.f63761f.getCid());
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Comment comment = (Comment) it.next();
                if (comment != null && list2.contains(comment)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m79212b(int i) {
        List list;
        if (this.f63762g != null) {
            list = this.f63762g.mo62601b(this.f63761f.getCid());
        } else {
            list = null;
        }
        if (m79215g()) {
            if (list == null || this.f63761f.getExpandSize() >= list.size()) {
                return true;
            }
            int min = Math.min(this.f63761f.getExpandSize() + 3, list.size());
            if (this.f63759d != null) {
                this.f63759d.mo62642a(m79213e(), list.subList(this.f63761f.getExpandSize(), min));
            }
            this.f63761f.setExpandSize(min);
            if (this.f63760e != null) {
                if (this.f63761f.getExpandSize() >= ((C24116m) this.f67571b).mo62522b()) {
                    this.f63760e.mo62333a(2);
                } else {
                    this.f63760e.mo62333a(1);
                }
            }
            return false;
        } else if (list == null || this.f63761f.isHasMore() || this.f63761f.getExpandSize() >= list.size()) {
            return true;
        } else {
            int min2 = Math.min(this.f63761f.getExpandSize() + 3, list.size());
            if (this.f63759d != null) {
                this.f63759d.mo62642a(m79213e(), list.subList(this.f63761f.getExpandSize(), min2));
            }
            this.f63761f.setExpandSize(min2);
            if (this.f63760e != null) {
                if (this.f63761f.getExpandSize() >= list.size()) {
                    this.f63760e.mo62333a(2);
                } else {
                    this.f63760e.mo62333a(1);
                }
            }
            return false;
        }
    }

    public C24117n(String str, String str2) {
        mo66536a(new C24116m());
        mo66537a(this);
        this.f63763h = str2;
        this.f63764i = str;
    }

    /* renamed from: b */
    public final void mo59108b(List<Comment> list, boolean z) {
        boolean isHasMore = ((C24116m) this.f67571b).isHasMore();
        if (this.f63761f != null) {
            m79210a(list);
            this.f63761f.setReplyCommentTotal(((C24116m) this.f67571b).mo62522b());
            this.f63761f.setCursor(((CommentItemList) ((C24116m) mo66539h()).getData()).cursor);
            this.f63761f.addExpandSize(list.size());
            if (!isHasMore || ((C24116m) this.f67571b).mo62522b() <= this.f63761f.getExpandSize()) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f63761f.setHasMore(isHasMore);
        }
        if (this.f63759d != null) {
            this.f63759d.mo62642a(m79213e(), list);
        }
        if (this.f63760e != null) {
            if (isHasMore) {
                this.f63760e.mo62333a(1);
                return;
            }
            this.f63760e.mo62333a(2);
        }
    }

    /* renamed from: a */
    public final void mo62536a(CommentReplyButtonStruct commentReplyButtonStruct, C24183i iVar) {
        if (commentReplyButtonStruct != null && iVar != null && !m79214f()) {
            this.f63761f = commentReplyButtonStruct;
            this.f63760e = iVar;
            if (commentReplyButtonStruct.getButtonStatus() == 0) {
                if (m79212b(3)) {
                    m79209a(commentReplyButtonStruct);
                }
            } else if (commentReplyButtonStruct.getButtonStatus() == 1) {
                if (m79212b(3)) {
                    m79211b(commentReplyButtonStruct);
                }
            } else if (commentReplyButtonStruct.getButtonStatus() == 2) {
                if (!(this.f63759d == null || this.f63761f == null || this.f63762g == null)) {
                    List b = this.f63762g.mo62601b(this.f63761f.getCid());
                    if (b != null && this.f63761f.getTopSize() >= 0 && this.f63761f.getTopSize() <= b.size()) {
                        if (!m79215g()) {
                            this.f63759d.mo62643b(m79213e(), b.subList(this.f63761f.getTopSize(), b.size()));
                            this.f63761f.setExpandSize(this.f63761f.getTopSize());
                        } else if (this.f63761f.getExpandSize() <= b.size()) {
                            this.f63759d.mo62643b(m79213e(), b.subList(this.f63761f.getTopSize(), this.f63761f.getExpandSize()));
                            this.f63761f.setExpandSize(this.f63761f.getTopSize());
                        }
                    }
                }
                if (this.f63760e != null) {
                    this.f63760e.mo62333a(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Comment> list, boolean z) {
        boolean isHasMore = ((C24116m) this.f67571b).isHasMore();
        if (this.f63761f != null) {
            m79210a(list);
            this.f63761f.setReplyCommentTotal(((C24116m) this.f67571b).mo62522b());
            this.f63761f.setCursor(((CommentItemList) ((C24116m) mo66539h()).getData()).cursor);
            this.f63761f.addExpandSize(list.size());
            if (!isHasMore || ((C24116m) this.f67571b).mo62522b() <= this.f63761f.getExpandSize()) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f63761f.setHasMore(isHasMore);
        }
        if (this.f63759d != null) {
            this.f63759d.mo62642a(m79213e(), list);
        }
        if (this.f63760e != null) {
            if (isHasMore) {
                this.f63760e.mo62333a(1);
                return;
            }
            this.f63760e.mo62333a(2);
        }
    }

    /* renamed from: a */
    private void m79208a(int i, CommentReplyButtonStruct commentReplyButtonStruct, long j, String str, int i2, String str2) {
        mo56976a(Integer.valueOf(i), commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(j), this.f63764i, str, Integer.valueOf(i2), str2);
    }
}
