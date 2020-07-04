package com.p280ss.android.ugc.aweme.share.viewmodel;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a */
public final class C38267a {

    /* renamed from: c */
    public static final C38273b f99463c = new C38273b();

    /* renamed from: d */
    public static final C38268a f99464d = new C38268a(null);

    /* renamed from: a */
    public final FeedPanelStateViewModel f99465a;

    /* renamed from: b */
    public final Context f99466b;

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$a */
    public static final class C38268a {
        private C38268a() {
        }

        /* renamed from: a */
        private static C38273b m122257a() {
            return C38267a.f99463c;
        }

        public /* synthetic */ C38268a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C38267a mo95910a(Context context) {
            FeedPanelStateViewModel feedPanelStateViewModel;
            C7573i.m23587b(context, "context");
            if (context instanceof FragmentActivity) {
                feedPanelStateViewModel = (FeedPanelStateViewModel) C0069x.m160a((FragmentActivity) context, (C0067b) m122257a()).mo147a(FeedPanelStateViewModel.class);
            } else {
                feedPanelStateViewModel = null;
            }
            return new C38267a(feedPanelStateViewModel, context, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$b */
    public interface C38269b {
        /* renamed from: a */
        void mo73468a();

        /* renamed from: b */
        void mo73469b();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$c */
    public static final class C38270c implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38269b f99467a;

        C38270c(C38269b bVar) {
            this.f99467a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f99467a.mo73468a();
                } else {
                    this.f99467a.mo73469b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$d */
    public static final class C38271d implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38269b f99468a;

        C38271d(C38269b bVar) {
            this.f99468a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f99468a.mo73468a();
                } else {
                    this.f99468a.mo73469b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$e */
    public static final class C38272e implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38269b f99469a;

        C38272e(C38269b bVar) {
            this.f99469a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f99469a.mo73468a();
                } else {
                    this.f99469a.mo73469b();
                }
            }
        }
    }

    /* renamed from: a */
    public static final C38267a m122239a(Context context) {
        return f99464d.mo95910a(context);
    }

    /* renamed from: d */
    public final boolean mo95903d() {
        if (!(this.f99465a == null || this.f99465a.f99457g.getValue() == null)) {
            Object value = this.f99465a.f99457g.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo95905e() {
        if (!(this.f99465a == null || this.f99465a.f99452b.getValue() == null)) {
            Object value = this.f99465a.f99452b.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo95908g() {
        if (!(this.f99465a == null || this.f99465a.f99453c.getValue() == null)) {
            Object value = this.f99465a.f99453c.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo95909h() {
        if (!(this.f99465a == null || this.f99465a.f99451a.getValue() == null)) {
            Object value = this.f99465a.f99451a.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95895a() {
        if (!(this.f99465a == null || this.f99465a.f99458h.getValue() == null)) {
            Object value = this.f99465a.f99458h.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo95898b() {
        if (!(this.f99465a == null || this.f99465a.f99459i.getValue() == null)) {
            Object value = this.f99465a.f99459i.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo95901c() {
        if (!(this.f99465a == null || this.f99465a.f99460j.getValue() == null)) {
            Object value = this.f99465a.f99460j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo95907f() {
        if (!(this.f99465a == null || this.f99465a.f99454d.getValue() == null)) {
            Object value = this.f99465a.f99454d.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Boolean) value).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95894a(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99457g;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            this.f99465a.f99457g.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo95897b(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99461k;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            this.f99465a.f99461k.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo95900c(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99453c;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            this.f99465a.f99453c.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    public final void mo95902d(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99454d;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            this.f99465a.f99454d.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: e */
    public final void mo95904e(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99452b;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            this.f99465a.f99452b.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo95893a(C38269b bVar) {
        C7573i.m23587b(bVar, "listener");
        if (this.f99465a != null && (this.f99466b instanceof C0043i)) {
            this.f99465a.f99456f.observe((C0043i) this.f99466b, new C38272e(bVar));
        }
    }

    /* renamed from: b */
    public final void mo95896b(C38269b bVar) {
        C7573i.m23587b(bVar, "listener");
        if (this.f99465a != null && (this.f99466b instanceof C0043i)) {
            this.f99465a.f99462l.observe((C0043i) this.f99466b, new C38270c(bVar));
        }
    }

    /* renamed from: c */
    public final void mo95899c(C38269b bVar) {
        C7573i.m23587b(bVar, "listener");
        if (this.f99465a != null && (this.f99466b instanceof C0043i)) {
            this.f99465a.f99451a.observe((C0043i) this.f99466b, new C38271d(bVar));
        }
    }

    /* renamed from: f */
    public final void mo95906f(boolean z) {
        C0052o<Boolean> oVar;
        FeedPanelStateViewModel feedPanelStateViewModel = this.f99465a;
        if (feedPanelStateViewModel != null) {
            oVar = feedPanelStateViewModel.f99451a;
        } else {
            oVar = null;
        }
        if (oVar != null && (!C7573i.m23585a((Object) (Boolean) this.f99465a.f99451a.getValue(), (Object) Boolean.valueOf(z)))) {
            this.f99465a.f99451a.setValue(Boolean.valueOf(z));
        }
    }

    private C38267a(FeedPanelStateViewModel feedPanelStateViewModel, Context context) {
        this.f99465a = feedPanelStateViewModel;
        this.f99466b = context;
    }

    public /* synthetic */ C38267a(FeedPanelStateViewModel feedPanelStateViewModel, Context context, C7571f fVar) {
        this(feedPanelStateViewModel, context);
    }
}
