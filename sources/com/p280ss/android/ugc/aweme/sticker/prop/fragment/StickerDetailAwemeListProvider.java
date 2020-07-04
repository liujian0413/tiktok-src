package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23743b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sticker.prop.p1636a.C41856b;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerDetailAwemeListProvider */
public class StickerDetailAwemeListProvider implements DetailAwemeListProvider {
    public boolean sendCustomRequest(C25674b bVar, int i) {
        return false;
    }

    public C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme) {
        bVar.f62612a = "from_sticker";
        bVar.f62613b = "sticker_id";
        bVar.f62614c = "prop_page";
        return bVar;
    }

    public C25674b getPresenter(int i, FragmentActivity fragmentActivity) {
        C25674b bVar = new C25674b();
        bVar.mo66536a(new C41856b());
        return bVar;
    }

    public DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        return new StickerPropDetailAwemeViewHolder(view, str, dVar);
    }
}
