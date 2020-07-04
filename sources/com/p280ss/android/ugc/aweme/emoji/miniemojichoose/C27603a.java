package com.p280ss.android.ugc.aweme.emoji.miniemojichoose;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.base.C27519c;
import com.p280ss.android.ugc.aweme.emoji.base.C27520d;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27598m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.miniemojichoose.a */
public final class C27603a extends C27519c<C27524h, C27520d> implements C27523g {

    /* renamed from: d */
    private RecyclerView f72756d;

    /* renamed from: g */
    private MiniEmojiAdapter f72757g;

    /* renamed from: h */
    private C27604b f72758h;

    /* renamed from: a */
    public final void mo70742a(int i) {
    }

    /* renamed from: c */
    public final void mo70737c() {
    }

    /* renamed from: d */
    public final int mo70738d() {
        return R.layout.m4;
    }

    /* renamed from: e */
    public final void mo70739e() {
    }

    /* renamed from: f */
    public final C27598m mo70743f() {
        return null;
    }

    /* renamed from: a */
    public final View mo70735a() {
        return super.mo70735a();
    }

    /* renamed from: b */
    public final void mo70736b() {
        View a = mo70735a();
        this.f72756d = (RecyclerView) a.findViewById(R.id.ae4);
        this.f72756d.setLayoutManager(new GridLayoutManager(a.getContext(), 8));
    }

    public C27603a(C27524h hVar, ViewGroup viewGroup, List<String> list) {
        super(hVar, null, viewGroup);
        this.f72758h = new C27604b(viewGroup.getContext());
        this.f72757g = new MiniEmojiAdapter(hVar);
        this.f72756d.setAdapter(this.f72757g);
        this.f72757g.mo70896a(this.f72758h.mo70899a(list));
    }
}
