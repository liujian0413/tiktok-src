package com.p280ss.android.ugc.aweme.main;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.dc */
public final class C32960dc {

    /* renamed from: a */
    public static final C32960dc f85906a = new C32960dc();

    private C32960dc() {
    }

    /* renamed from: a */
    public static final void m106529a() {
        m106547o(true);
    }

    /* renamed from: b */
    private static Keva m106532b() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "MainTabPreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final int m106528a(int i) {
        return m106532b().getInt("liveSquareGuideShowCount", 0);
    }

    /* renamed from: b */
    public static final boolean m106534b(boolean z) {
        return m106532b().getBoolean("hasSwipedUp", false);
    }

    /* renamed from: c */
    public static final boolean m106535c(boolean z) {
        return m106532b().getBoolean("shouldShowSwipeUpGuide1", true);
    }

    /* renamed from: d */
    public static final void m106536d(boolean z) {
        m106532b().storeBoolean("shouldShowSwipeUpGuide1", false);
    }

    /* renamed from: e */
    public static final boolean m106537e(boolean z) {
        return m106532b().getBoolean("hasFollowGuideShown", false);
    }

    /* renamed from: f */
    public static final void m106538f(boolean z) {
        m106532b().storeBoolean("hasFollowGuideShown", true);
    }

    /* renamed from: g */
    public static final boolean m106539g(boolean z) {
        return m106532b().getBoolean("doubleClickLikeGuideShown", z);
    }

    /* renamed from: h */
    public static final void m106540h(boolean z) {
        m106532b().storeBoolean("doubleClickLikeGuideShown", true);
    }

    /* renamed from: i */
    public static final void m106541i(boolean z) {
        m106532b().storeBoolean("hasVisitedProfilePage", true);
    }

    /* renamed from: j */
    public static final boolean m106542j(boolean z) {
        return m106532b().getBoolean("shouldShowScrollToFeedFollowGuideMT", true);
    }

    /* renamed from: k */
    public static final void m106543k(boolean z) {
        m106532b().storeBoolean("shouldShowScrollToFeedFollowGuideMT", false);
    }

    /* renamed from: l */
    public static final boolean m106544l(boolean z) {
        return m106532b().getBoolean("shouldShowLongClickGuide", true);
    }

    /* renamed from: m */
    public static final void m106545m(boolean z) {
        m106532b().storeBoolean("shouldShowLongClickGuide", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m106546n(boolean z) {
        m106532b().storeBoolean("hasShowedSwipeUpGuideAfterVideoPlay", z);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static void m106547o(boolean z) {
        m106532b().storeBoolean("hasSwipedUp", z);
    }

    /* renamed from: a */
    public static final boolean m106531a(boolean z) {
        return m106532b().getBoolean("hasShowedSwipeUpGuideAfterVideoPlay", false);
    }
}
