package com.p280ss.android.ugc.aweme.homepage.p1291ui.view;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a */
public final class C30312a {

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$a */
    static final class C30313a implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f79708a;

        C30313a(Context context) {
            this.f79708a = context;
        }

        public final boolean onLongClick(View view) {
            return C30312a.m99100a(this.f79708a, "HOME");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$b */
    static final class C30314b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f79709a;

        C30314b(Context context) {
            this.f79709a = context;
        }

        public final boolean onLongClick(View view) {
            return C30312a.m99100a(this.f79709a, "DISCOVER");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$c */
    static final class C30315c implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f79710a;

        C30315c(Context context) {
            this.f79710a = context;
        }

        public final boolean onLongClick(View view) {
            return C30312a.m99100a(this.f79710a, "PUBLISH");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$d */
    static final class C30316d implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f79711a;

        C30316d(Context context) {
            this.f79711a = context;
        }

        public final boolean onLongClick(View view) {
            return C30312a.m99100a(this.f79711a, "NOTIFICATION");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$e */
    static final class C30317e implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f79712a;

        C30317e(Context context) {
            this.f79712a = context;
        }

        public final boolean onLongClick(View view) {
            return C30312a.m99100a(this.f79712a, "USER");
        }
    }

    /* renamed from: a */
    public static final boolean m99100a(Context context, String str) {
        Activity a = C23487o.m77130a(context);
        if (a != null) {
            C30246a.m98970a((FragmentActivity) a).mo79744j(str);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final void m99099a(Context context, C30335l lVar, C30335l lVar2, C30335l lVar3, C30335l lVar4, C30335l lVar5) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(lVar, "homeBtn");
        C7573i.m23587b(lVar2, "secondBtn");
        C7573i.m23587b(lVar3, "addBtn");
        C7573i.m23587b(lVar4, "notificationBtn");
        C7573i.m23587b(lVar5, "profileBtn");
        if (C7163a.m22363a()) {
            lVar.setOnLongClickListener(new C30313a(context));
            lVar2.setOnLongClickListener(new C30314b(context));
            lVar3.setOnLongClickListener(new C30315c(context));
            lVar4.setOnLongClickListener(new C30316d(context));
            lVar5.setOnLongClickListener(new C30317e(context));
        }
    }
}
