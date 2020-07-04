package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22386b;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22466b;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22468d;
import com.p280ss.android.ugc.aweme.p984ad.view.IAdViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentAdViewHolder */
public final class NewSpecialCommentAdViewHolder extends IAdViewHolder {

    /* renamed from: a */
    private NewSpecialCommentView f59769a;

    public NewSpecialCommentAdViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f59769a = (NewSpecialCommentView) view;
    }

    /* renamed from: a */
    public final void mo58902a(Context context, C22466b bVar) {
        NewSpecialCommentView newSpecialCommentView = this.f59769a;
        if (newSpecialCommentView != null) {
            newSpecialCommentView.setDataCenter(((C22468d) bVar).f59912d);
        }
        NewSpecialCommentView newSpecialCommentView2 = this.f59769a;
        if (newSpecialCommentView2 != null) {
            C22468d dVar = (C22468d) bVar;
            LinkData linkData = dVar.f59909a;
            C7573i.m23582a((Object) linkData, "params?.linkData");
            Aweme aweme = dVar.f59910b;
            C7573i.m23582a((Object) aweme, "params?.aweme");
            newSpecialCommentView2.mo58909a(linkData, aweme);
        }
        NewSpecialCommentView newSpecialCommentView3 = this.f59769a;
        if (newSpecialCommentView3 != null) {
            C22386b bVar2 = ((C22468d) bVar).f59911c;
            C7573i.m23582a((Object) bVar2, "params?.onDislikeCommentAdListener");
            newSpecialCommentView3.setOnDislikeCommentAdListener(bVar2);
        }
    }
}
