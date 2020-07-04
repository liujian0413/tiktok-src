package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.h.l */
public final class C24163l implements C24190p {

    /* renamed from: a */
    public List<Comment> f63835a;

    /* renamed from: b */
    private List<CommentReplyListItem> f63836b;

    /* renamed from: c */
    private String f63837c = "";

    /* renamed from: a */
    public final List<Comment> mo62592a() {
        return this.f63835a;
    }

    /* renamed from: b */
    public final List<CommentReplyListItem> mo62600b() {
        return this.f63836b;
    }

    /* renamed from: c */
    public final void mo62605c() {
        if (this.f63836b == null) {
            this.f63836b = new ArrayList();
        }
        if (this.f63835a == null) {
            this.f63835a = new ArrayList();
        }
    }

    /* renamed from: d */
    public final void mo62607d() {
        if (this.f63836b != null) {
            this.f63836b.clear();
        }
        if (this.f63835a != null) {
            this.f63835a.clear();
        }
    }

    /* renamed from: a */
    public final void mo62596a(String str) {
        if (str == null) {
            str = "";
        }
        this.f63837c = str;
    }

    /* renamed from: b */
    public final void mo62603b(List<Comment> list) {
        if (this.f63835a != null) {
            this.f63835a.removeAll(list);
        }
    }

    /* renamed from: b */
    public final List<Comment> mo62601b(String str) {
        try {
            if (C6307b.m19566a((Collection<T>) this.f63836b)) {
                return null;
            }
            return ((CommentReplyListItem) this.f63836b.get(Integer.parseInt(str))).mReplyComments;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    private CommentReplyListItem m79371h(String str) {
        if (this.f63836b == null) {
            return null;
        }
        for (CommentReplyListItem commentReplyListItem : this.f63836b) {
            if (commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return commentReplyListItem;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo62591a(Comment comment) {
        if (this.f63835a == null || comment == null) {
            return -1;
        }
        int size = this.f63835a.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(comment.getCid(), ((Comment) this.f63835a.get(i)).getCid())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo62608e(String str) {
        if (this.f63836b == null) {
            return -1;
        }
        for (int i = 0; i < this.f63836b.size(); i++) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) this.f63836b.get(i);
            if (commentReplyListItem != null && commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public final int mo62609f(String str) {
        if (C6307b.m19566a((Collection<T>) this.f63835a)) {
            return 1;
        }
        for (Comment comment : this.f63835a) {
            if (TextUtils.equals(comment.getCid(), str)) {
                return 1 + comment.getReplyCommentTotal();
            }
        }
        return 1;
    }

    /* renamed from: g */
    public final int mo62610g(String str) {
        if (!C6307b.m19566a((Collection<T>) this.f63835a)) {
            for (Comment comment : this.f63835a) {
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    return comment.getReplyCommentTotal() + 1;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo62604c(String str) {
        int size;
        int i = 0;
        if (!C6307b.m19566a((Collection<T>) this.f63835a)) {
            for (int i2 = 0; i2 < this.f63835a.size(); i2++) {
                Comment comment = (Comment) this.f63835a.get(i2);
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem h = m79371h(comment.getReplyId());
                        if (h != null) {
                            int indexOf = h.mReplyComments.indexOf(comment);
                            if (h.mButtonStruct != null) {
                                if (indexOf < h.mButtonStruct.getTopSize()) {
                                    h.mButtonStruct.setTopSize(h.mButtonStruct.getTopSize() - 1);
                                }
                                h.mButtonStruct.setExpandSize(h.mButtonStruct.getExpandSize() - 1);
                                h.mButtonStruct.setReplyCommentTotal(h.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= h.mButtonStruct.getTopSize()) {
                                    h.mButtonStruct.setStatus(4);
                                }
                            }
                            h.mComment.setReplyCommentTotal(h.mComment.getReplyCommentTotal() - 1);
                            h.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem h2 = m79371h(comment.getCid());
                        if (h2 != null) {
                            if (h2.mButtonStruct != null) {
                                size = h2.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = h2.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f63836b.remove(h2);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo62606d(String str) {
        int size;
        int i = 0;
        if (!C6307b.m19566a((Collection<T>) this.f63835a)) {
            for (int i2 = 0; i2 < this.f63835a.size(); i2++) {
                Comment comment = (Comment) this.f63835a.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem h = m79371h(comment.getReplyId());
                        if (h != null) {
                            int indexOf = h.mReplyComments.indexOf(comment);
                            if (h.mButtonStruct != null) {
                                if (indexOf < h.mButtonStruct.getTopSize()) {
                                    h.mButtonStruct.setTopSize(h.mButtonStruct.getTopSize() - 1);
                                }
                                h.mButtonStruct.setExpandSize(h.mButtonStruct.getExpandSize() - 1);
                                h.mButtonStruct.setReplyCommentTotal(h.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= h.mButtonStruct.getTopSize()) {
                                    h.mButtonStruct.setStatus(4);
                                }
                            }
                            h.mComment.setReplyCommentTotal(h.mComment.getReplyCommentTotal() - 1);
                            h.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem h2 = m79371h(comment.getCid());
                        if (h2 != null) {
                            if (h2.mButtonStruct != null) {
                                size = h2.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = h2.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f63836b.remove(h2);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo62597a(List<Comment> list) {
        int i;
        if (list != null && this.f63836b != null && this.f63835a != null) {
            for (Comment comment : list) {
                CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                comment.setCommentType(1);
                comment.setNeedHint(TextUtils.equals(this.f63837c, comment.getCid()));
                commentReplyListItem.mComment = comment;
                if (!this.f63836b.contains(commentReplyListItem)) {
                    this.f63836b.add(commentReplyListItem);
                    this.f63835a.add(comment);
                    List replyComments = comment.getReplyComments();
                    if (replyComments == null) {
                        i = 0;
                    } else {
                        i = replyComments.size();
                    }
                    if (i > 0) {
                        for (Comment comment2 : comment.getReplyComments()) {
                            comment2.setCommentType(2);
                            comment2.setNeedHint(TextUtils.equals(this.f63837c, comment2.getCid()));
                            if (!commentReplyListItem.mReplyComments.contains(comment2)) {
                                commentReplyListItem.mReplyComments.add(comment2);
                                this.f63835a.add(comment2);
                            }
                        }
                    }
                    if (comment.getReplyCommentTotal() - i > 0) {
                        CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(comment, this.f63836b.size() - 1, C24220a.m79551a().commentReplyGroupedByConversation());
                        commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                        this.f63835a.add(commentReplyButtonStruct);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62593a(int i, int i2) {
        if (this.f63835a != null) {
            this.f63835a.subList(Math.max(0, i), Math.min(this.f63835a.size(), i2)).clear();
        }
    }

    /* renamed from: b */
    public final void mo62602b(int i, Comment comment) {
        if (this.f63835a != null && comment != null && i >= 0) {
            List<Comment> list = this.f63835a;
            list.add(Math.min(i, list.size()), comment);
        }
    }

    /* renamed from: a */
    public final void mo62594a(int i, Comment comment) {
        if (this.f63836b != null && comment != null) {
            CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
            commentReplyListItem.mComment = comment;
            commentReplyListItem.mReplyComments = comment.getReplyComments();
            this.f63836b.add(Math.min(0, this.f63836b.size()), commentReplyListItem);
        }
    }

    /* renamed from: a */
    public final void mo62595a(int i, List<Comment> list) {
        if (i >= 0 && list != null && !C6307b.m19566a((Collection<T>) this.f63835a)) {
            Comment comment = (Comment) this.f63835a.get(i);
            if (comment instanceof CommentReplyButtonStruct) {
                this.f63835a.addAll(i, list);
                try {
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) this.f63836b.get(Integer.valueOf(comment.getCid()).intValue());
                    if (!commentReplyListItem.mReplyComments.containsAll(list)) {
                        commentReplyListItem.mReplyComments.addAll(list);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62599a(String str, String str2) {
        if (this.f63836b == null) {
            return false;
        }
        for (CommentReplyListItem commentReplyListItem : this.f63836b) {
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                List<Comment> list = commentReplyListItem.mReplyComments;
                if (list == null) {
                    return false;
                }
                for (Comment cid : list) {
                    if (TextUtils.equals(cid.getCid(), str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo62598a(String str, int i, Comment comment) {
        CommentReplyListItem h = m79371h(str);
        if (h == null || i < 0) {
            return false;
        }
        if (h.mButtonStruct != null) {
            h.mButtonStruct.addExpandSize(1);
            h.mButtonStruct.setReplyCommentTotal(h.mButtonStruct.getReplyCommentTotal() + 1);
        }
        if (h.mReplyComments == null) {
            h.mReplyComments = new ArrayList();
        }
        List<Comment> list = h.mReplyComments;
        list.add(Math.min(i, list.size()), comment);
        h.mComment.setReplyCommentTotal(h.mComment.getReplyCommentTotal() + 1);
        if (h.mButtonStruct != null) {
            return true;
        }
        return false;
    }
}
