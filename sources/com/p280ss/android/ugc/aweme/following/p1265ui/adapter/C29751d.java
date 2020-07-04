package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.d */
final /* synthetic */ class C29751d implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f78279a;

    /* renamed from: b */
    private final View f78280b;

    /* renamed from: c */
    private final User f78281c;

    /* renamed from: d */
    private final Resources f78282d;

    C29751d(ViewHolder viewHolder, View view, User user, Resources resources) {
        this.f78279a = viewHolder;
        this.f78280b = view;
        this.f78281c = user;
        this.f78282d = resources;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f78279a.mo75721a(this.f78280b, this.f78281c, this.f78282d, dialogInterface, i);
    }
}
