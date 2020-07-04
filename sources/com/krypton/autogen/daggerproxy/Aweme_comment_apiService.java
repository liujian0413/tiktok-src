package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;

public interface Aweme_comment_apiService {
    C24219a provideCommentDependService();

    CommentService provideCommentService();

    C24182h provideICommentPostingManager();
}
