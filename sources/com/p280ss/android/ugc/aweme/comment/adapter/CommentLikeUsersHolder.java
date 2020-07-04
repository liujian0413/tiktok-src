package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.p280ss.android.ugc.aweme.comment.api.ICommentLikeUsersHolder;
import com.p280ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentListLikeListView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentLikeUsersHolder */
public final class CommentLikeUsersHolder extends ICommentLikeUsersHolder {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f63580a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentLikeUsersHolder.class), "mLikeUsersView", "getMLikeUsersView()Lcom/ss/android/ugc/aweme/comment/ui/CommentListLikeListView;"))};

    /* renamed from: b */
    private final C7541d f63581b;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentLikeUsersHolder$a */
    static final class C24040a extends Lambda implements C7561a<CommentListLikeListView> {

        /* renamed from: a */
        final /* synthetic */ View f63582a;

        C24040a(View view) {
            this.f63582a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CommentListLikeListView invoke() {
            return (CommentListLikeListView) this.f63582a.findViewById(R.id.ecu);
        }
    }

    /* renamed from: a */
    private final CommentListLikeListView m78905a() {
        return (CommentListLikeListView) this.f63581b.getValue();
    }

    public CommentLikeUsersHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f63581b = C7546e.m23569a(new C24040a(view));
    }

    /* renamed from: a */
    public final void mo62331a(CommentLikeUsersStruct commentLikeUsersStruct) {
        C7573i.m23587b(commentLikeUsersStruct, "likeUsersStruct");
        m78905a().setEventType(commentLikeUsersStruct.getEventType());
        m78905a().setLikeUsersDialogHeight(commentLikeUsersStruct.getDialogHeight());
        m78905a().mo63102a(commentLikeUsersStruct.getLikeUsers(), commentLikeUsersStruct.getLikeUsersCount(), commentLikeUsersStruct.getAweme());
    }
}
