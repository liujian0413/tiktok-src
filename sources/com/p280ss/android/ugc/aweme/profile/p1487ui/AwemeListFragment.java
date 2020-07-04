package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.os.SystemClock;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.AwemeListFragment */
public abstract class AwemeListFragment extends ProfileListFragment implements C36340al {

    /* renamed from: M */
    public static final C36119a f94433M = new C36119a(null);

    /* renamed from: e */
    private HashMap f94434e;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.AwemeListFragment$a */
    public static final class C36119a {
        private C36119a() {
        }

        public /* synthetic */ C36119a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.AwemeListFragment$b */
    public static final class C36120b {

        /* renamed from: a */
        public static final C36120b f94435a = new C36120b();

        /* renamed from: b */
        private static long f94436b = -1;

        /* renamed from: c */
        private static String f94437c;

        /* renamed from: d */
        private static String f94438d = "";

        private C36120b() {
        }

        /* renamed from: a */
        public static long m116329a() {
            return f94436b;
        }

        /* renamed from: b */
        public static String m116333b() {
            return f94437c;
        }

        /* renamed from: c */
        public static String m116335c() {
            return f94438d;
        }

        /* renamed from: a */
        public static void m116330a(long j) {
            f94436b = 0;
        }

        /* renamed from: b */
        public static void m116334b(String str) {
            C7573i.m23587b(str, "<set-?>");
            f94438d = str;
        }

        /* renamed from: a */
        public static void m116331a(String str) {
            f94437c = null;
        }

        /* renamed from: a */
        public static void m116332a(String str, String str2) {
            f94437c = str;
            if (str2 == null) {
                str2 = "";
            }
            f94438d = str2;
            f94436b = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: B */
    public void mo90812B() {
        if (this.f94434e != null) {
            this.f94434e.clear();
        }
    }

    /* renamed from: a */
    public void mo90814a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo91883a(DmtStatusView dmtStatusView) {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo90812B();
    }
}
