package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAdapter;
import com.p280ss.android.ugc.aweme.comment.api.C24084a;
import com.p280ss.android.ugc.aweme.comment.list.C24176b;
import com.p280ss.android.ugc.aweme.comment.list.C24179e;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24163l;
import com.p280ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42953aw;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.s */
public final class C24336s implements C24176b, C24179e, C6905a, C25675c<Comment> {

    /* renamed from: a */
    public String f64244a;

    /* renamed from: b */
    private DmtStatusView f64245b;

    /* renamed from: c */
    private RecyclerView f64246c;

    /* renamed from: d */
    private Context f64247d;

    /* renamed from: e */
    private C24163l f64248e;

    /* renamed from: f */
    private CommentNestedLayout f64249f;

    /* renamed from: g */
    private int f64250g;

    public final void aE_() {
    }

    public final void bd_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Comment> list, boolean z) {
    }

    /* renamed from: a */
    public final void mo63229a(List<Comment> list) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            int i = 0;
            commentAdapter.mo66516d(false);
            commentAdapter.mo58045a(list);
            this.f64245b.mo25943g();
            RecyclerView recyclerView = this.f64246c;
            if (!m80015b(list)) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Comment> list, boolean z) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            if (C6399b.m19944t()) {
                commentAdapter.mo66516d(true);
            }
            if (z) {
                commentAdapter.ai_();
            } else if (!C6399b.m19944t() || commentAdapter.f63557f) {
                commentAdapter.ah_();
            } else {
                commentAdapter.mo66516d(false);
            }
            commentAdapter.mo58045a(list);
            this.f64246c.setVisibility(0);
            this.f64245b.mo25939d();
        }
    }

    /* renamed from: a */
    public final boolean mo63231a(Exception exc, Comment comment, int i, int i2, boolean z) {
        if (!C24191m.f63849a.mo62632a(comment)) {
            m80014b(comment);
        }
        C24191m.f63849a.mo62633c(comment);
        boolean a = C24084a.m79027a(this.f64246c.getContext(), exc, z ? R.string.b_3 : R.string.a9a, m80017c(comment, i, i2));
        if (a) {
            C24191m.f63849a.mo62637h(comment);
        } else {
            m80013a(comment);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo63230a(boolean z, Comment comment) {
        int i;
        if (!z || comment != null) {
            if (z) {
                Rect c = m80016c(comment);
                if (c != null) {
                    int[] iArr = new int[2];
                    this.f64246c.getLocationOnScreen(iArr);
                    i = c.top - iArr[1];
                    int max = Math.max(0, (this.f64246c.computeVerticalScrollRange() - this.f64246c.computeVerticalScrollOffset()) - this.f64246c.getHeight());
                    if (i > max) {
                        this.f64246c.animate().translationY((float) (max - i)).setDuration(300).start();
                        i = max;
                    }
                } else {
                    i = 0;
                }
                this.f64250g = i;
            } else {
                this.f64246c.animate().translationY(0.0f).setDuration(300).start();
                i = -this.f64250g;
                this.f64250g = 0;
            }
            if (this.f64246c != null) {
                this.f64246c.mo5521a(0, i);
            }
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f64246c.setVisibility(0);
        this.f64245b.mo25942f();
    }

    public final void aD_() {
        ((CommentAdapter) this.f64246c.getAdapter()).ag_();
    }

    public final void ae_() {
        mo63229a((List<Comment>) new ArrayList<Comment>());
    }

    /* renamed from: c */
    private Rect m80016c(Comment comment) {
        if (comment == null) {
            return null;
        }
        C1293v d = m80019d(comment);
        if (d != null) {
            return C43064dn.m136618a(d);
        }
        return null;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        mo63228a(exc, (List<Comment>) new ArrayList<Comment>());
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        ((CommentAdapter) this.f64246c.getAdapter()).mo66507h();
    }

    /* renamed from: d */
    public final void mo62623d(Exception exc) {
        C22814a.m75245a(this.f64247d, exc, R.string.anx);
    }

    /* renamed from: a */
    private static List<Comment> m80012a(CommentAdapter commentAdapter) {
        ArrayList arrayList = new ArrayList();
        List a = commentAdapter.mo62312a();
        if (!C6307b.m19566a((Collection<T>) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m80015b(List<Comment> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return false;
        }
        Comment comment = (Comment) list.get(0);
        if (comment == null || comment.getCommentType() != 220) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo63235d(String str) {
        if (this.f64246c.getAdapter() instanceof CommentAdapter) {
            ((CommentAdapter) this.f64246c.getAdapter()).mo62320b(str);
        }
    }

    /* renamed from: a */
    private void m80013a(Comment comment) {
        int i = C24191m.f63849a.mo62638i(comment);
        C1262a adapter = this.f64246c.getAdapter();
        if (i >= 0 && adapter != null) {
            adapter.notifyItemChanged(i, Integer.valueOf(1));
        }
    }

    /* renamed from: c */
    private static boolean m80018c(List<Comment> list) {
        for (int i = 0; i < list.size(); i++) {
            if (((Comment) list.get(i)).getCommentType() == 221) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo62622b(String str) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            commentAdapter.mo62317a(str);
        }
    }

    /* renamed from: d */
    private C1293v m80019d(Comment comment) {
        List list;
        int i;
        C0902i a = C43064dn.m136619a(this.f64246c);
        if (a.f3154a == null || a.f3155b == null) {
            return null;
        }
        if (comment.getCommentType() == 0) {
            C1262a adapter = this.f64246c.getAdapter();
            if (adapter instanceof CommentAdapter) {
                list = ((CommentAdapter) adapter).mo62312a();
            } else {
                list = null;
            }
        } else {
            list = this.f64248e.mo62592a();
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        int intValue = ((Integer) a.f3154a).intValue();
        while (intValue <= ((Integer) a.f3155b).intValue() && intValue < i && intValue >= 0) {
            Comment comment2 = (Comment) list.get(intValue);
            if (comment2 != null && comment2.getCid() != null && TextUtils.equals(comment2.getCid(), comment.getCid())) {
                return this.f64246c.mo5575f(intValue);
            }
            intValue++;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo63234c(String str) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            commentAdapter.mo62321b(str, this.f64248e.mo62604c(str));
            if (commentAdapter.mo60557c() == 0) {
                commentAdapter.mo66516d(false);
                commentAdapter.notifyItemRemoved(0);
                this.f64245b.mo25943g();
            }
            C42961az.m136380a(new C24029a(4, this.f64244a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x015f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80014b(com.p280ss.android.ugc.aweme.comment.model.Comment r10) {
        /*
            r9 = this;
            android.support.v7.widget.RecyclerView r0 = r9.f64246c
            android.support.v7.widget.RecyclerView$a r0 = r0.getAdapter()
            com.ss.android.ugc.aweme.comment.adapter.CommentAdapter r0 = (com.p280ss.android.ugc.aweme.comment.adapter.CommentAdapter) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.List r1 = r0.mo62312a()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            java.util.List r2 = r2.mo62600b()
            if (r2 != 0) goto L_0x0029
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.mo62605c()
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.f63835a = r1
        L_0x0029:
            com.ss.android.ugc.aweme.comment.h.l r1 = r9.f64248e
            r1.mo62594a(r4, r10)
            r0.mo62316a(r10, r4)
            android.support.v7.widget.RecyclerView r1 = r9.f64246c
            r1.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r9.f64245b
            r1.mo25939d()
        L_0x003b:
            r3 = 0
            goto L_0x0159
        L_0x003e:
            int r2 = r1.size()
            if (r2 != r3) goto L_0x0070
            boolean r2 = m80015b(r1)
            if (r2 == 0) goto L_0x0070
            boolean r2 = m80018c(r1)
            if (r2 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            java.util.List r2 = r2.mo62600b()
            if (r2 != 0) goto L_0x0061
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.mo62605c()
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.f63835a = r1
        L_0x0061:
            com.ss.android.ugc.aweme.comment.h.l r1 = r9.f64248e
            r1.mo62594a(r4, r10)
            r0.mo62316a(r10, r3)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r9.f64245b
            r1.mo25939d()
            goto L_0x0159
        L_0x0070:
            int r2 = r1.size()
            if (r2 != r5) goto L_0x00a3
            boolean r2 = m80015b(r1)
            if (r2 != 0) goto L_0x0082
            boolean r2 = m80018c(r1)
            if (r2 == 0) goto L_0x00a3
        L_0x0082:
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            java.util.List r2 = r2.mo62600b()
            if (r2 != 0) goto L_0x0093
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.mo62605c()
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.f63835a = r1
        L_0x0093:
            com.ss.android.ugc.aweme.comment.h.l r1 = r9.f64248e
            r1.mo62594a(r4, r10)
            r0.mo62316a(r10, r5)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r9.f64245b
            r1.mo25939d()
            r3 = 1
            goto L_0x0159
        L_0x00a3:
            int r2 = r10.getCommentType()
            r6 = -1
            if (r2 != r3) goto L_0x0105
            java.lang.String r1 = r10.getReplyToReplyCommentId()
            java.lang.String r2 = r10.getReplyId()
            java.lang.String r7 = r10.getReplyToReplyCommentId()
            boolean r2 = android.text.TextUtils.equals(r2, r7)
            if (r2 == 0) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = 2
        L_0x00bf:
            int r1 = r0.mo62322c(r1, r2)
            if (r1 < 0) goto L_0x003b
            int r1 = r1 + r5
        L_0x00c6:
            java.util.List r2 = r0.mo62312a()
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x00da
            int r2 = r0.getItemViewType(r1)
            if (r2 == r3) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            int r1 = r1 + 1
            goto L_0x00c6
        L_0x00da:
            r1 = -1
        L_0x00db:
            if (r1 >= 0) goto L_0x00e5
            java.util.List r1 = r0.mo62312a()
            int r1 = r1.size()
        L_0x00e5:
            java.lang.String r2 = r10.getReplyId()
            int r2 = r0.mo62322c(r2, r5)
            com.ss.android.ugc.aweme.comment.h.l r3 = r9.f64248e
            java.lang.String r4 = r10.getReplyId()
            int r2 = r1 - r2
            int r2 = r2 - r5
            r3.mo62598a(r4, r2, r10)
            r0.mo62316a(r10, r1)
            android.support.v7.widget.RecyclerView r2 = r9.f64246c
            int r3 = r1 + 1
            r2.mo5541b(r3)
            r3 = r1
            goto L_0x0159
        L_0x0105:
            android.support.v7.widget.RecyclerView r2 = r9.f64246c
            android.support.v7.widget.RecyclerView$i r2 = r2.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r2 = (android.support.p029v7.widget.LinearLayoutManager) r2
            if (r2 != 0) goto L_0x0111
            r3 = -1
            goto L_0x0115
        L_0x0111:
            int r3 = r2.mo5445j()
        L_0x0115:
            r7 = 0
            if (r3 == r6) goto L_0x0126
            android.view.View r8 = r2.mo5432c(r3)
            if (r8 == 0) goto L_0x0126
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8.getHitRect(r7)
        L_0x0126:
            if (r3 == r6) goto L_0x0130
            if (r7 == 0) goto L_0x0130
            int r3 = r3 + r5
            int r6 = r7.top
            r2.mo5417a(r3, r6)
        L_0x0130:
            android.support.v7.widget.RecyclerView r2 = r9.f64246c
            r2.mo5541b(r4)
            com.ss.android.ugc.aweme.comment.h.l r2 = r9.f64248e
            r2.mo62594a(r4, r10)
            java.lang.Object r2 = r1.get(r4)
            boolean r2 = r2 instanceof com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct
            if (r2 == 0) goto L_0x0143
            r4 = 1
        L_0x0143:
            boolean r2 = m80015b(r1)
            if (r2 == 0) goto L_0x014d
            if (r4 != 0) goto L_0x014d
            int r4 = r4 + 1
        L_0x014d:
            boolean r1 = m80018c(r1)
            if (r1 == 0) goto L_0x0155
            int r4 = r4 + 1
        L_0x0155:
            r3 = r4
            r0.mo62316a(r10, r3)
        L_0x0159:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 != 0) goto L_0x0165
            r0.mo66516d(r5)
            r0.ah_()
        L_0x0165:
            com.ss.android.ugc.aweme.comment.m r0 = com.p280ss.android.ugc.aweme.comment.C24191m.f63849a
            r0.mo62630a(r10, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1103ui.C24336s.m80014b(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* renamed from: a */
    public final void mo62619a(String str) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            commentAdapter.mo62318a(str, this.f64248e.mo62606d(str));
            if (commentAdapter.mo60557c() == 0) {
                commentAdapter.mo66516d(false);
                commentAdapter.notifyItemRemoved(0);
                this.f64245b.mo25943g();
            }
            C42961az.m136380a(new C24029a(4, this.f64244a));
        }
    }

    /* renamed from: a */
    public final String mo63225a(String str, List<Comment> list) {
        int i;
        if (TextUtils.isEmpty(str) || C6307b.m19566a((Collection<T>) list)) {
            return "";
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter == null) {
            i = -1;
        } else {
            i = commentAdapter.mo62322c(str, 11);
        }
        String str2 = "";
        if (i >= 0 && this.f64248e != null) {
            Comment comment = (Comment) commentAdapter.mo62312a().get(i);
            if (comment instanceof CommentReplyButtonStruct) {
                str2 = ((CommentReplyButtonStruct) comment).getCommentId();
            }
            List a = m80012a(commentAdapter);
            this.f64248e.mo62595a(i, list);
            C42953aw.m136346a(commentAdapter, a, commentAdapter.mo62312a());
        }
        return str2;
    }

    /* renamed from: b */
    public final String mo63232b(String str, List<Comment> list) {
        int i;
        if (TextUtils.isEmpty(str) || C6307b.m19566a((Collection<T>) list)) {
            return "";
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter == null) {
            i = -1;
        } else {
            i = commentAdapter.mo62322c(str, 11);
        }
        String str2 = "";
        if (i - list.size() >= 0) {
            Comment comment = (Comment) commentAdapter.mo62312a().get(i);
            if (comment instanceof CommentReplyButtonStruct) {
                str2 = ((CommentReplyButtonStruct) comment).getCommentId();
            }
            List a = m80012a(commentAdapter);
            this.f64248e.mo62603b(list);
            C42953aw.m136346a(commentAdapter, a, commentAdapter.mo62312a());
        }
        return str2;
    }

    /* renamed from: b */
    public final void mo59108b(List<Comment> list, boolean z) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (C6399b.m19944t()) {
            commentAdapter.mo66516d(true);
        }
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (z) {
            commentAdapter.ai_();
        } else if (!C6399b.m19944t() || commentAdapter.f63557f) {
            commentAdapter.ah_();
        } else {
            commentAdapter.mo66516d(false);
        }
        commentAdapter.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo63228a(Exception exc, List<Comment> list) {
        CommentAdapter commentAdapter = (CommentAdapter) this.f64246c.getAdapter();
        if (commentAdapter != null) {
            if (commentAdapter.f67566v) {
                commentAdapter.mo66516d(false);
            }
            commentAdapter.mo58045a(list);
            if (exc instanceof ApiServerException) {
                this.f64245b.mo25943g();
                this.f64246c.setVisibility(8);
                if (((ApiServerException) exc).getErrorCode() == 14) {
                    C22814a.m75244a(this.f64247d, (Throwable) exc);
                }
            } else {
                this.f64245b.mo25944h();
                this.f64246c.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo63233b(Comment comment, int i, int i2) {
        mo63227a(comment, i, i2, false);
    }

    /* renamed from: c */
    private static boolean m80017c(Comment comment, int i, int i2) {
        int i3 = C24191m.f63849a.mo62638i(comment);
        if (i3 != -1 && i >= 0 && i2 >= 0 && i3 >= i && i3 <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo63226a(Comment comment, int i, int i2) {
        boolean z = !C24191m.f63849a.mo62632a(comment);
        if (z) {
            m80014b(comment);
        }
        if (!C24191m.f63849a.mo62635e(comment)) {
            C24191m.f63849a.mo62634d(comment);
        }
        if (!z) {
            m80013a(comment);
        }
    }

    /* renamed from: a */
    public final void mo63227a(Comment comment, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (comment != null) {
            if (!C24191m.f63849a.mo62632a(comment)) {
                m80014b(comment);
            }
            C24191m.f63849a.mo62640l(comment);
            C24191m.f63849a.mo62636g(comment);
            int i5 = C24191m.f63849a.mo62638i(comment);
            C1262a adapter = this.f64246c.getAdapter();
            if (adapter instanceof CommentAdapter) {
                CommentAdapter commentAdapter = (CommentAdapter) adapter;
                List a = commentAdapter.mo62312a();
                if (a != null && i5 >= 0 && i5 <= a.size() - 1) {
                    a.set(i5, comment);
                    commentAdapter.notifyItemChanged(i5);
                }
            }
            List a2 = this.f64248e.mo62592a();
            if (a2 != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= a2.size()) {
                        break;
                    } else if (TextUtils.equals(((Comment) a2.get(i6)).getFakeId(), comment.getFakeId())) {
                        a2.set(i6, comment);
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            List b = this.f64248e.mo62600b();
            if (b != null) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
                    if (TextUtils.equals(commentReplyListItem.mComment.getFakeId(), comment.getFakeId())) {
                        commentReplyListItem.mComment = comment;
                    } else if (TextUtils.equals(commentReplyListItem.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list = commentReplyListItem.mReplyComments;
                        if (list == null) {
                            i4 = 0;
                        } else {
                            i4 = list.size();
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i4) {
                                break;
                            } else if (TextUtils.equals(((Comment) list.get(i7)).getFakeId(), comment.getFakeId())) {
                                list.set(i7, comment);
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
            }
            if (m80017c(comment, i, i2)) {
                Context context = this.f64246c.getContext();
                if (z) {
                    i3 = R.string.b_4;
                } else {
                    i3 = R.string.a9e;
                }
                C10761a.m31383a(context, i3).mo25750a();
            }
            C24191m.f63849a.mo62637h(comment);
            this.f64246c.setVisibility(0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).increaseCommentCount(this.f64244a);
            this.f64245b.mo25939d();
        }
    }

    public C24336s(Context context, DmtStatusView dmtStatusView, RecyclerView recyclerView, C24163l lVar, CommentNestedLayout commentNestedLayout) {
        this.f64247d = context;
        this.f64245b = dmtStatusView;
        this.f64246c = recyclerView;
        this.f64248e = lVar;
        this.f64249f = commentNestedLayout;
    }
}
