package com.p280ss.android.ugc.aweme.commercialize.p1118b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.link.C24778g;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22380e;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.c */
public final class C24554c implements C22380e {
    /* renamed from: b */
    public final boolean mo58864b() {
        return C24220a.m79551a().isNewCommentBackground();
    }

    /* renamed from: a */
    public final boolean mo58859a() {
        return C24217a.m79549a().isSupportReplyComment();
    }

    /* renamed from: a */
    public final boolean mo58862a(String str) {
        return C24758a.m81251b(str);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo58856a(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "comment");
        return C24217a.m79549a().getDisplayTextExtra(commentStruct);
    }

    /* renamed from: b */
    public final String mo58863b(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "commentStruct");
        return C24217a.m79549a().getDisplayText(commentStruct);
    }

    /* renamed from: a */
    public final boolean mo58861a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C24778g.m81310a(aweme);
    }

    /* renamed from: a */
    public final void mo58858a(Context context, Aweme aweme) {
        C24778g.m81308a(context, aweme);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo58857a(CommentStruct commentStruct, C7561a<C7581n> aVar) {
        C7573i.m23587b(commentStruct, "commentStruct");
        C7573i.m23587b(aVar, "onLinkTagClick");
        return C24217a.m79549a().getSearchCommentTextExtra(commentStruct, aVar);
    }

    /* renamed from: a */
    public final List<TextExtraStruct> mo58855a(Context context, Aweme aweme, CommentStruct commentStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(commentStruct, "commentStruct");
        return C24217a.m79549a().getDisplayLinkTextExtra(context, aweme, commentStruct);
    }

    /* renamed from: a */
    public final boolean mo58860a(Context context, Aweme aweme, C24723e eVar, int i, C24613b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(eVar, "adViewController");
        C7573i.m23587b(bVar, "adOpenCallBack");
        return C25371n.m83449a(context, aweme, eVar, i, bVar);
    }
}
