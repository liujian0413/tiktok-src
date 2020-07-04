package com.p280ss.android.ugc.aweme.comment.p1098e;

import android.text.TextUtils;
import bolts.C1591g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.emoji.p1201a.C27500a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.g */
public class C24109g extends C24101a<Comment, CommentItemList> {

    /* renamed from: b */
    public String f63742b;

    /* renamed from: c */
    protected String f63743c;

    /* renamed from: d */
    public String f63744d;

    /* renamed from: e */
    public C24190p f63745e;

    /* renamed from: f */
    public int f63746f;

    /* renamed from: b */
    public final int mo62522b() {
        if (this.mData == null) {
            return 0;
        }
        return ((CommentItemList) this.mData).total;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((CommentItemList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo62521a() {
        if (TextUtils.equals(this.f63743c, "v1") || TextUtils.equals(this.f63743c, "v2")) {
            return true;
        }
        return false;
    }

    public List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        if (((CommentItemList) this.mData).replyStyle != 2 || this.f63745e == null) {
            return ((CommentItemList) this.mData).items;
        }
        return this.f63745e.mo62592a();
    }

    /* renamed from: a */
    private void m79181a(CommentItemList commentItemList) {
        if (commentItemList.newInsertIds != null) {
            this.f63744d = commentItemList.newInsertIds;
        }
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo62510a(CommentItemList commentItemList) {
        int i;
        if (this.f63742b != null) {
            this.f63732a.mo62552b(this.f63742b);
        }
        this.f63732a.mo62549a(this.f63743c);
        if (commentItemList != null) {
            this.f63732a.mo62554c(commentItemList.total);
            C24132c cVar = this.f63732a;
            if (commentItemList.items == null) {
                i = 0;
            } else {
                i = commentItemList.items.size();
            }
            cVar.mo62551b(i);
            this.f63732a.mo62547a(commentItemList.cursor);
        }
        this.f63732a.mo62553c();
    }

    public void refreshList(Object... objArr) {
        m79182a((String) objArr[1], 0, 20, objArr[2].intValue(), (String) objArr[3], (String) objArr[4], (Long) objArr[5], objArr[6].intValue(), (String) objArr[7]);
    }

    public void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CommentItemList) this.mData).cursor;
        }
        m79182a(str, j, 20, objArr[2].intValue(), (String) objArr[3], (String) objArr[4], (Long) objArr[5], objArr[6].intValue(), (String) objArr[7]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(CommentItemList commentItemList) {
        boolean z;
        this.f63732a.mo62550b();
        if (commentItemList != null) {
            m79181a(commentItemList);
            this.f63732a.mo62548a((BaseResponse) commentItemList);
        }
        mo62510a(commentItemList);
        if (mo62521a() && this.f63746f != 0) {
            if (commentItemList == null) {
                C24132c.m79289b(this.f63743c, this.f63742b, this.f63746f);
            } else if (C6307b.m19566a((Collection<T>) commentItemList.items)) {
                C24132c.m79287a(this.f63743c, this.f63742b, this.f63746f);
            }
        }
        boolean z2 = false;
        if (commentItemList == null || (C6307b.m19566a((Collection<T>) commentItemList.items) && this.mListQueryType == 4)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                List<Comment> list = commentItemList.items;
                this.mData = commentItemList;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo62520a(list);
            } else if (i == 4) {
                mo62520a(commentItemList.items);
                ((CommentItemList) this.mData).total = commentItemList.total;
                ((CommentItemList) this.mData).cursor = commentItemList.cursor;
                CommentItemList commentItemList2 = (CommentItemList) this.mData;
                if (commentItemList.hasMore && ((CommentItemList) this.mData).hasMore) {
                    z2 = true;
                }
                commentItemList2.hasMore = z2;
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                List<Comment> list2 = commentItemList.items;
                this.mData = commentItemList;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo62520a(list2);
            }
            ((CommentItemList) this.mData).hasMore = false;
        }
        C27500a.f72532a.mo70702a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62520a(List<Comment> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (((CommentItemList) this.mData).replyStyle != 2 || this.f63745e == null) {
                for (Comment comment : list) {
                    if (C24148e.m79342a() && !C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                        Comment comment2 = (Comment) comment.getReplyComments().get(0);
                        ArrayList arrayList = new ArrayList();
                        comment.setReplyComments(null);
                        arrayList.add(comment);
                        comment2.setReplyComments(arrayList);
                        comment = comment2;
                    }
                    comment.setNeedHint(TextUtils.equals(this.f63744d, comment.getCid()));
                    if (!((CommentItemList) this.mData).items.contains(comment)) {
                        comment.setCommentType(0);
                        ((CommentItemList) this.mData).items.add(comment);
                    }
                }
                return;
            }
            this.f63745e.mo62605c();
            this.f63745e.mo62596a(this.f63744d);
            if (this.mListQueryType == 1) {
                this.f63745e.mo62607d();
            }
            this.f63745e.mo62597a(list);
        }
    }

    /* renamed from: a */
    private void m79182a(String str, long j, int i, int i2, String str2, String str3, Long l, int i3, String str4) {
        this.f63742b = str;
        this.f63744d = str3;
        if (C24148e.m79342a()) {
            this.f63743c = "v2";
            CommentApi.m79007a(this.f63742b, j, 20, str3, C43161e.m136882a(), C43161e.m136884b(), l, i3, str4).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str5 = str3;
        final long j2 = j;
        final int i4 = i2;
        final String str6 = str2;
        C241101 r0 = new Callable(20) {
            public final Object call() throws Exception {
                List list;
                C24109g.this.f63732a.mo62546a(20);
                C24109g.this.f63743c = "v1";
                if (!TextUtils.isEmpty(str5)) {
                    list = Arrays.asList(str5.split(","));
                } else {
                    list = null;
                }
                return CommentApi.m79012a(C24109g.this.f63742b, j2, 20, i4, str6, new C6600e().mo15979b((Object) list), C43161e.m136882a(), C43161e.m136884b());
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
