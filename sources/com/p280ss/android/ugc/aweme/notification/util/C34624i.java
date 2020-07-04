package com.p280ss.android.ugc.aweme.notification.util;

import android.text.TextPaint;
import android.view.View;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34584a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.util.i */
public final class C34624i extends C22367e {

    /* renamed from: a */
    public static final C34625a f90378a = new C34625a(null);

    /* renamed from: b */
    private final User f90379b;

    /* renamed from: c */
    private final int f90380c;

    /* renamed from: e */
    private final C34584a f90381e;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.i$a */
    public static final class C34625a {
        private C34625a() {
        }

        public /* synthetic */ C34625a(C7571f fVar) {
            this();
        }
    }

    public final void onClick(View view) {
        C7573i.m23587b(view, "widget");
        this.f90381e.mo87871a(view, this.f90379b, this.f90380c);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C7573i.m23587b(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public C34624i(User user, int i, int i2, int i3, C34584a aVar) {
        C7573i.m23587b(aVar, "callBack");
        super(i2, i3);
        this.f90379b = user;
        this.f90380c = i;
        this.f90381e = aVar;
    }
}
