package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.graph.C7289f;

public class _Aweme_comment_apiModule {
    public C24219a provideCommentDependService() {
        return ((Aweme_comment_apiService) C7289f.m22851a(Aweme_comment_apiService.class)).provideCommentDependService();
    }

    public CommentService provideCommentService() {
        return ((Aweme_comment_apiService) C7289f.m22851a(Aweme_comment_apiService.class)).provideCommentService();
    }

    public C24182h provideICommentPostingManager() {
        return ((Aweme_comment_apiService) C7289f.m22851a(Aweme_comment_apiService.class)).provideICommentPostingManager();
    }
}
