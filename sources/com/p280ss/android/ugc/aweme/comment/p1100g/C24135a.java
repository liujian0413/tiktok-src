package com.p280ss.android.ugc.aweme.comment.p1100g;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24032d;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.comment.g.a */
public class C24135a {

    /* renamed from: a */
    private static C24135a f63793a;

    /* renamed from: b */
    private Set<String> f63794b = new HashSet();

    /* renamed from: c */
    private HashMap<String, Comment> f63795c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, Comment> f63796d = new HashMap<>();

    private C24135a() {
    }

    /* renamed from: a */
    public static C24135a m79312a() {
        if (f63793a == null) {
            synchronized (C24135a.class) {
                if (f63793a == null) {
                    f63793a = new C24135a();
                }
            }
        }
        return f63793a;
    }

    /* renamed from: b */
    public final void mo62563b() {
        this.f63795c.clear();
        this.f63796d.clear();
    }

    /* renamed from: a */
    public static C23084b<C24032d> m79311a(String str) {
        return C23352a.m76612a().mo60651a(str, C24032d.class);
    }

    /* renamed from: b */
    public final Comment mo62562b(String str) {
        return (Comment) this.f63795c.get(str);
    }

    /* renamed from: a */
    public final void mo62559a(Comment comment) {
        m79313a(comment, (Comment) this.f63796d.get(comment.getCid()), false);
        m79312a();
        m79311a(comment.getCid()).setValue(new C24032d(comment, true, null));
    }

    /* renamed from: b */
    public final boolean mo62564b(Comment comment) {
        return this.f63794b.contains(comment.getCid());
    }

    /* renamed from: c */
    public final void mo62565c(Comment comment) {
        if (comment != null) {
            Comment clone = comment.clone();
            this.f63795c.put(comment.getCid(), clone);
            if (comment.getCommentType() == 0 && !C6307b.m19566a((Collection<T>) clone.getReplyComments())) {
                Comment comment2 = (Comment) clone.getReplyComments().get(0);
                this.f63795c.put(comment2.getCid(), comment2);
            }
        }
    }

    /* renamed from: a */
    public final void mo62561a(Comment comment, boolean z) {
        if (z) {
            this.f63794b.add(comment.getCid());
        } else {
            this.f63794b.remove(comment.getCid());
        }
    }

    /* renamed from: a */
    private void m79313a(Comment comment, Comment comment2, boolean z) {
        while (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !C6307b.m19566a((Collection<T>) comment.getReplyComments()) && !C6307b.m19566a((Collection<T>) comment2.getReplyComments())) {
                comment = (Comment) comment.getReplyComments().get(0);
                comment2 = (Comment) comment2.getReplyComments().get(0);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo62560a(Comment comment, C24136b bVar, CommentTranslationStatusView commentTranslationStatusView) {
        Comment b = mo62562b(comment.getCid());
        if (b != null) {
            m79313a(comment, b, true);
            m79312a();
            m79311a(comment.getCid()).setValue(new C24032d(comment, true, null));
            return;
        }
        mo62561a(comment, true);
        this.f63796d.put(comment.getCid(), comment.clone());
        commentTranslationStatusView.setLoading(true);
        C6726a.m20842a(new C24138c(comment, bVar));
    }
}
