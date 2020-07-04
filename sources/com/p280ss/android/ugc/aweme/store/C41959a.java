package com.p280ss.android.ugc.aweme.store;

import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.store.LocalStore.Type;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;

/* renamed from: com.ss.android.ugc.aweme.store.a */
public final class C41959a {

    /* renamed from: a */
    public static volatile long f109023a;

    /* renamed from: b */
    public static volatile long f109024b;

    /* renamed from: a */
    public static void m133427a(Aweme aweme) throws Exception {
        new StringBuilder("preloadPostList ").append(aweme.getAuthorUid());
        C6903bc.m21493l().mo57922a(true, aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), 0, 0, 20, m133426a(aweme.getAid(), Type.POST));
    }

    /* renamed from: b */
    public static void m133429b(Aweme aweme) throws Exception {
        new StringBuilder("preloadProfile ").append(aweme.getAuthorUid());
        C6903bc.m21493l().mo57921a(aweme, true, m133426a(aweme.getAid(), Type.PROFILE));
    }

    /* renamed from: a */
    private static String m133426a(String str, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(type.name());
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m133428a(Aweme aweme, String str) throws Exception {
        new StringBuilder("preloadComment ").append(aweme.getAuthorUid());
        C24217a.m79549a().fetchPreloadCommentList(aweme.getAid(), 0, 20, 2, "", null, C43161e.m136882a(), C43161e.m136884b(), true, m133426a(aweme.getAid(), Type.COMMENT), str);
    }
}
