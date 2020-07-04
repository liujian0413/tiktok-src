package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MenuAdapter */
public final class MenuAdapter extends C1262a<MenuHolder> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82160a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MenuAdapter.class), "albumItems", "getAlbumItems()Ljava/util/List;"))};

    /* renamed from: b */
    private final C7541d f82161b = C7546e.m23569a(C31368a.f82163a);

    /* renamed from: c */
    private final C7562b<C31403a, C7581n> f82162c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MenuAdapter$a */
    static final class C31368a extends Lambda implements C7561a<List<C31403a>> {

        /* renamed from: a */
        public static final C31368a f82163a = new C31368a();

        C31368a() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31403a> m102103a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102103a();
        }
    }

    /* renamed from: a */
    private final List<C31403a> m102100a() {
        return (List) this.f82161b.getValue();
    }

    public final int getItemCount() {
        return m102100a().size();
    }

    public MenuAdapter(C7562b<? super C31403a, C7581n> bVar) {
        C7573i.m23587b(bVar, "openAlbum");
        this.f82162c = bVar;
    }

    /* renamed from: a */
    public final void mo81932a(List<C31403a> list) {
        C7573i.m23587b(list, "items");
        m102100a().clear();
        m102100a().addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MenuHolder menuHolder, int i) {
        C7573i.m23587b(menuHolder, "holder");
        menuHolder.mo80308a((C31403a) m102100a().get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MenuHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.su, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_pop_menu, parent, false)");
        return new MenuHolder(inflate, this.f82162c);
    }
}
