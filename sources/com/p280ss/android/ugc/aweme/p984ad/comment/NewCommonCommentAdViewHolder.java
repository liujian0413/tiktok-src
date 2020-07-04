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

/* renamed from: com.ss.android.ugc.aweme.ad.comment.NewCommonCommentAdViewHolder */
public final class NewCommonCommentAdViewHolder extends IAdViewHolder {

    /* renamed from: a */
    private C22410a f59768a;

    public NewCommonCommentAdViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f59768a = (C22410a) view;
    }

    /* renamed from: a */
    public final void mo58902a(Context context, C22466b bVar) {
        C22410a aVar = this.f59768a;
        if (aVar != null) {
            aVar.setDataCenter(((C22468d) bVar).f59912d);
        }
        C22410a aVar2 = this.f59768a;
        if (aVar2 != null) {
            C22468d dVar = (C22468d) bVar;
            LinkData linkData = dVar.f59909a;
            C7573i.m23582a((Object) linkData, "params?.linkData");
            Aweme aweme = dVar.f59910b;
            C7573i.m23582a((Object) aweme, "params?.aweme");
            aVar2.mo58983a(linkData, aweme);
        }
        C22410a aVar3 = this.f59768a;
        if (aVar3 != null) {
            C22386b bVar2 = ((C22468d) bVar).f59911c;
            C7573i.m23582a((Object) bVar2, "params?.onDislikeCommentAdListener");
            aVar3.setOnDislikeCommentAdListener(bVar2);
        }
    }
}
