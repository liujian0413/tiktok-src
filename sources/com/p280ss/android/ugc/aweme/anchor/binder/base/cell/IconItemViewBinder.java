package com.p280ss.android.ugc.aweme.anchor.binder.base.cell;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22527b;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder.BaseItemViewHolder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteRoundImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.cell.IconItemViewBinder */
public final class IconItemViewBinder extends BaseItemViewBinder<C22526a, IconHolder> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.cell.IconItemViewBinder$IconHolder */
    public final class IconHolder extends BaseItemViewHolder {

        /* renamed from: b */
        public final RemoteRoundImageView f60026b;

        /* renamed from: c */
        final /* synthetic */ IconItemViewBinder f60027c;

        public IconHolder(IconItemViewBinder iconItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60027c = iconItemViewBinder;
            super(iconItemViewBinder, view);
            this.f60026b = (RemoteRoundImageView) view.findViewById(R.id.axi);
        }
    }

    public IconItemViewBinder(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74500a((IconHolder) vVar, (C22526a) obj);
    }

    /* renamed from: a */
    private static void m74500a(IconHolder iconHolder, C22526a aVar) {
        String str;
        C7573i.m23587b(iconHolder, "holder");
        C7573i.m23587b(aVar, "cell");
        RemoteImageView remoteImageView = iconHolder.f60026b;
        C22527b bVar = aVar.f60001b;
        if (bVar != null) {
            str = bVar.f60006a;
        } else {
            str = null;
        }
        C23323e.m76514a(remoteImageView, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public IconHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.sx, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…tion_icon, parent, false)");
        return new IconHolder(this, inflate);
    }
}
