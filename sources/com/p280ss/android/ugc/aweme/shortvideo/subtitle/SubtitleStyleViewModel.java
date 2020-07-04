package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleStyleViewModel */
public final class SubtitleStyleViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106948a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SubtitleStyleViewModel.class), "typefaceName", "getTypefaceName()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SubtitleStyleViewModel.class), "bgMode", "getBgMode()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SubtitleStyleViewModel.class), "bgColor", "getBgColor()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SubtitleStyleViewModel.class), "align", "getAlign()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private final C7541d f106949b = C7546e.m23569a(C41104d.f106956a);

    /* renamed from: c */
    private final C7541d f106950c = C7546e.m23569a(C41103c.f106955a);

    /* renamed from: d */
    private final C7541d f106951d = C7546e.m23569a(C41102b.f106954a);

    /* renamed from: e */
    private final C7541d f106952e = C7546e.m23569a(C41101a.f106953a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleStyleViewModel$a */
    static final class C41101a extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41101a f106953a = new C41101a();

        C41101a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m131277a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m131277a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleStyleViewModel$b */
    static final class C41102b extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41102b f106954a = new C41102b();

        C41102b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m131278a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m131278a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleStyleViewModel$c */
    static final class C41103c extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C41103c f106955a = new C41103c();

        C41103c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Integer> m131279a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m131279a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleStyleViewModel$d */
    static final class C41104d extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C41104d f106956a = new C41104d();

        C41104d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m131280a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m131280a();
        }
    }

    /* renamed from: a */
    public final C0052o<String> mo101539a() {
        return (C0052o) this.f106949b.getValue();
    }

    /* renamed from: b */
    public final C0052o<Integer> mo101541b() {
        return (C0052o) this.f106950c.getValue();
    }

    /* renamed from: c */
    public final C0052o<Integer> mo101542c() {
        return (C0052o) this.f106951d.getValue();
    }

    /* renamed from: d */
    public final C0052o<Integer> mo101543d() {
        return (C0052o) this.f106952e.getValue();
    }

    /* renamed from: a */
    public final void mo101540a(String str, int i, int i2, int i3) {
        C7573i.m23587b(str, "fontType");
        mo101539a().setValue(str);
        mo101541b().setValue(Integer.valueOf(i));
        mo101542c().setValue(Integer.valueOf(i2));
        mo101543d().setValue(Integer.valueOf(i3));
    }
}
