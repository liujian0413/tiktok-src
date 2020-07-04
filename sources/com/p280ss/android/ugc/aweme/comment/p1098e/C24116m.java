package com.p280ss.android.ugc.aweme.comment.p1098e;

import bolts.C1591g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.net.C34089j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.e.m */
public final class C24116m extends C24109g {
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CommentItemList) this.mData).items;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62520a(List<Comment> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            ((CommentItemList) this.mData).replyStyle = 2;
            if (this.mListQueryType == 4) {
                ((CommentItemList) this.mData).items = new ArrayList();
            }
            for (Comment comment : list) {
                comment.setCommentType(2);
                ((CommentItemList) this.mData).items.add(comment);
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m79206a(String.valueOf(objArr[1]), objArr[3].longValue(), 3, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, objArr[6].intValue(), (String) objArr[7]);
    }

    public final void refreshList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m79206a(String.valueOf(objArr[1]), objArr[3].longValue(), 3, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, objArr[6].intValue(), (String) objArr[7]);
    }

    /* renamed from: a */
    private void m79206a(String str, long j, int i, String str2, String str3, String str4, int i2, String str5) {
        this.f63743c = "reply";
        CommentApi.m79008a(str, j, 3, str2, str3, str4, i2, str5).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
