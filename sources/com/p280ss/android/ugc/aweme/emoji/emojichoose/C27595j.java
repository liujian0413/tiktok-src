package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.j */
final /* synthetic */ class C27595j implements OnItemClickListener {

    /* renamed from: a */
    private final List f72727a;

    /* renamed from: b */
    private final C27601o f72728b;

    /* renamed from: c */
    private final C27598m f72729c;

    /* renamed from: d */
    private final int f72730d;

    C27595j(List list, C27601o oVar, C27598m mVar, int i) {
        this.f72727a = list;
        this.f72728b = oVar;
        this.f72729c = mVar;
        this.f72730d = i;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C27592i.m90429a(this.f72727a, this.f72728b, this.f72729c, this.f72730d, adapterView, view, i, j);
    }
}
