package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.NewYearWishLayout */
public final class NewYearWishLayout extends FrameLayout {

    /* renamed from: a */
    public static final C36208a f94965a = new C36208a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.NewYearWishLayout$a */
    public static final class C36208a {
        private C36208a() {
        }

        public /* synthetic */ C36208a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static void m117026a(Activity activity, User user) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(user, "user");
    }

    /* renamed from: a */
    public final void mo92188a() {
        setVisibility(8);
    }

    public NewYearWishLayout(Context context) {
        C7573i.m23587b(context, "ctx");
        this(context, null);
    }

    public NewYearWishLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        setVisibility(8);
    }
}
