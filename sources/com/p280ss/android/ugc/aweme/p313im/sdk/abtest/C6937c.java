package com.p280ss.android.ugc.aweme.p313im.sdk.abtest;

import com.bytedance.ies.abmock.C6384b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c */
public final class C6937c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f19627a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6937c.class), "imReductionExp", "getImReductionExp()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6937c.class), "showCreateGroupEntrance", "getShowCreateGroupEntrance()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6937c.class), "sharePanelHeadShowExp", "getSharePanelHeadShowExp()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6937c.class), "sharePanelHeadOrderExp", "getSharePanelHeadOrderExp()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6937c.class), "imShareSoftAndEmojiType", "getImShareSoftAndEmojiType()I"))};

    /* renamed from: b */
    public static final C6937c f19628b = new C6937c();

    /* renamed from: c */
    private static final C7541d f19629c = C7546e.m23569a(C6938a.f19634a);

    /* renamed from: d */
    private static final C7541d f19630d = C7546e.m23569a(C6942e.f19638a);

    /* renamed from: e */
    private static final C7541d f19631e = C7546e.m23569a(C6941d.f19637a);

    /* renamed from: f */
    private static final C7541d f19632f = C7546e.m23569a(C6940c.f19636a);

    /* renamed from: g */
    private static final C7541d f19633g = C7546e.m23569a(C6939b.f19635a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c$a */
    static final class C6938a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C6938a f19634a = new C6938a();

        C6938a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m21579a());
        }

        /* renamed from: a */
        private static int m21579a() {
            return C6384b.m19835a().mo15287a(ImReductionExperiment.class, true, "im_reduction_strategy", C6384b.m19835a().mo15295d().im_reduction_strategy, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c$b */
    static final class C6939b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C6939b f19635a = new C6939b();

        C6939b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m21580a());
        }

        /* renamed from: a */
        private static int m21580a() {
            return C6384b.m19835a().mo15287a(ImShareSoftAndMiniEmojiExperiment.class, true, "im_share_auto_display_keyboard_and_emoji", C6384b.m19835a().mo15295d().im_share_auto_display_keyboard_and_emoji, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c$c */
    static final class C6940c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C6940c f19636a = new C6940c();

        C6940c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m21581a());
        }

        /* renamed from: a */
        private static int m21581a() {
            return C6384b.m19835a().mo15287a(ImSharePanelHeadOrderExperiment.class, true, "im_share_header_order_strategy", C6384b.m19835a().mo15295d().im_share_header_order_strategy, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c$d */
    static final class C6941d extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C6941d f19637a = new C6941d();

        C6941d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m21582a());
        }

        /* renamed from: a */
        private static int m21582a() {
            return C6384b.m19835a().mo15287a(ImSharePanelHeadShowExperiment.class, true, "im_share_header_show_strategy", C6384b.m19835a().mo15295d().im_share_header_show_strategy, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.c$e */
    static final class C6942e extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C6942e f19638a = new C6942e();

        C6942e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m21583a());
        }

        /* renamed from: a */
        private static boolean m21583a() {
            if (C6384b.m19835a().mo15287a(ImCreateGroupEntranceExperiment.class, true, "create_group_chat_guide_exploration", C6384b.m19835a().mo15295d().create_group_chat_guide_exploration, 0) == 1) {
                return true;
            }
            return false;
        }
    }

    private C6937c() {
    }

    /* renamed from: a */
    public final int mo17966a() {
        return ((Number) f19629c.getValue()).intValue();
    }

    /* renamed from: b */
    public final boolean mo17967b() {
        return ((Boolean) f19630d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int mo17968c() {
        return ((Number) f19631e.getValue()).intValue();
    }

    /* renamed from: d */
    public final int mo17969d() {
        return ((Number) f19632f.getValue()).intValue();
    }

    /* renamed from: e */
    public final int mo17970e() {
        return ((Number) f19633g.getValue()).intValue();
    }
}
