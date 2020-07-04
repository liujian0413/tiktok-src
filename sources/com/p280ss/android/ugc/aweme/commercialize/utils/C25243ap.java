package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ap */
public final class C25243ap {

    /* renamed from: a */
    private static Aweme f66582a;

    /* renamed from: b */
    private static Rect f66583b;

    /* renamed from: a */
    public static Aweme m82980a() {
        return f66582a;
    }

    /* renamed from: b */
    public static boolean m82984b() {
        try {
            if (!C30199h.m98861a().getShopping().getDisableCard().booleanValue()) {
                return true;
            }
            return false;
        } catch (NullValueException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m82982a(Aweme aweme) {
        User author = aweme.getAuthor();
        if (author == null || !C6861a.m21337f().isMe(author.getUid())) {
            return false;
        }
        CommercePermissionStruct commercePermission = C21115b.m71197a().getCurUser().getCommercePermission();
        if (commercePermission != null && commercePermission.topItem == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m82981a(Activity activity, View view) {
        Rect rect;
        if (activity == null || view == null) {
            return false;
        }
        if (f66583b == null) {
            rect = new Rect();
        } else {
            rect = f66583b;
        }
        f66583b = rect;
        activity.getWindow().getDecorView().getHitRect(f66583b);
        return view.getLocalVisibleRect(f66583b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (com.p280ss.android.ugc.aweme.setting.C7213d.m22500a().mo18709B() == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (com.p280ss.android.ugc.aweme.setting.C7213d.m22500a().mo18709B() != 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (com.p280ss.android.ugc.aweme.setting.C7213d.m22500a().mo18709B() == 2) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82983a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4, int r5) {
        /*
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r1 = 0
            if (r0 != 0) goto L_0x0067
            if (r4 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r4.getStatus()
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60042L()
            java.lang.Object r0 = r0.mo59877d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0024
            goto L_0x0067
        L_0x0024:
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93606a(r4)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r4.getStatus()
            boolean r2 = r2.isWithGoods()
            r3 = 1
            if (r2 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r4 = r4.getPromotion()
            if (r4 == 0) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x0066
            switch(r5) {
                case 0: goto L_0x005a;
                case 1: goto L_0x004e;
                default: goto L_0x0041;
            }
        L_0x0041:
            if (r0 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            int r4 = r4.mo18709B()
            if (r4 == 0) goto L_0x0066
            goto L_0x0058
        L_0x004e:
            com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            int r4 = r4.mo18709B()
            if (r4 == 0) goto L_0x0066
        L_0x0058:
            r1 = 1
            goto L_0x0066
        L_0x005a:
            com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            int r4 = r4.mo18709B()
            r5 = 2
            if (r4 != r5) goto L_0x0066
            goto L_0x0058
        L_0x0066:
            return r1
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap.m82983a(com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }
}
