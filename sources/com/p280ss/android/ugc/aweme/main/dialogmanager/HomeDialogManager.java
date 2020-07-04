package com.p280ss.android.ugc.aweme.main.dialogmanager;

import android.arch.lifecycle.C0042h;
import com.p280ss.android.ugc.aweme.activity.p983f2.C22371a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager */
public final class HomeDialogManager implements C0042h {

    /* renamed from: b */
    public static boolean f85945b;

    /* renamed from: c */
    public static final C32984a f85946c = new C32984a(null);

    /* renamed from: a */
    public final ArrayList<Object> f85947a = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager$a */
    public static final class C32984a {
        private C32984a() {
        }

        /* renamed from: a */
        public static boolean m106625a() {
            return HomeDialogManager.f85945b;
        }

        public /* synthetic */ C32984a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m106624a(boolean z) {
            HomeDialogManager.f85945b = false;
            C42961az.m136380a(new C22371a(false));
        }
    }
}
