package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.CommonLifeCycleObserver.C30609a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c.C30818a;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31070a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel */
public final class ReadStateViewModel extends C0063u implements CommonLifeCycleObserver, C30818a, C30915j, C31070a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f80454a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ReadStateViewModel.class), "markDelegate", "getMarkDelegate()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateMarkDelegate;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ReadStateViewModel.class), "syncDelegate", "getSyncDelegate()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateSyncDelegate;"))};

    /* renamed from: c */
    public static final boolean f80455c;

    /* renamed from: d */
    public static final C30723a f80456d = new C30723a(null);

    /* renamed from: b */
    public final C30739d f80457b = new C30739d();

    /* renamed from: e */
    private final C7541d f80458e = C7546e.m23569a(new C30724b(this));

    /* renamed from: f */
    private final C7541d f80459f = C7546e.m23569a(new C30725c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$a */
    public static final class C30723a {
        private C30723a() {
        }

        /* renamed from: a */
        public static boolean m100093a() {
            return ReadStateViewModel.f80455c;
        }

        public /* synthetic */ C30723a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ReadStateViewModel m100092a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(ReadStateViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
            return (ReadStateViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$b */
    static final class C30724b extends Lambda implements C7561a<ReadStateMarkDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f80460a;

        C30724b(ReadStateViewModel readStateViewModel) {
            this.f80460a = readStateViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ReadStateMarkDelegate invoke() {
            return new ReadStateMarkDelegate(this.f80460a.f80457b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateViewModel$c */
    static final class C30725c extends Lambda implements C7561a<ReadStateSyncDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f80461a;

        C30725c(ReadStateViewModel readStateViewModel) {
            this.f80461a = readStateViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ReadStateSyncDelegate invoke() {
            return new ReadStateSyncDelegate(this.f80461a.f80457b);
        }
    }

    /* renamed from: d */
    public static final boolean m100070d() {
        return f80455c;
    }

    /* renamed from: e */
    private final ReadStateMarkDelegate m100071e() {
        return (ReadStateMarkDelegate) this.f80458e.getValue();
    }

    /* renamed from: f */
    private final ReadStateSyncDelegate m100072f() {
        return (ReadStateSyncDelegate) this.f80459f.getValue();
    }

    /* renamed from: a */
    public final void mo27445a(int i, Message message) {
    }

    /* renamed from: a */
    public final void mo27446a(int i, PropertyMsg propertyMsg) {
    }

    /* renamed from: a */
    public final void mo27447a(Message message) {
    }

    /* renamed from: a */
    public final void mo27454a(boolean z) {
    }

    /* renamed from: b */
    public final void mo27455b(int i, Message message) {
    }

    /* renamed from: b */
    public final void mo27456b(Message message) {
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
    }

    /* renamed from: f */
    public final void mo27466f(List<Message> list) {
    }

    /* renamed from: g */
    public final void mo27467g(List<PropertyMsg> list) {
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        C30609a.onCreate(this);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        C30609a.onPause(this);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        C30609a.onResume(this);
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onStart() {
        C30609a.onStart(this);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        C30609a.onStop(this);
    }

    /* renamed from: a */
    public final void mo80470a() {
        m100071e().mo80371b();
    }

    /* renamed from: c */
    public final void mo80477c() {
        m100071e().mo80372c();
    }

    /* renamed from: b */
    public final C31052w mo80476b() {
        return (C31052w) this.f80457b.mo80515c().getValue();
    }

    public final void onDestroy() {
        C11407f.m33601a().mo27460b(this.f80457b.mo80516d().f30971b, (C11439h) this);
    }

    static {
        boolean z = false;
        Object a = C6993a.m21773a(IIMService.class);
        C7573i.m23582a(a, "IMServiceManager.getServ…e(IIMService::class.java)");
        C7093b abInterface = ((IIMService) a).getAbInterface();
        if (abInterface != null && 1 == abInterface.mo18362j()) {
            z = true;
        }
        f80455c = z;
    }

    /* renamed from: a */
    public final void mo80471a(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        iVar.getLifecycle().mo55a(this);
        iVar.getLifecycle().mo55a(m100071e());
        iVar.getLifecycle().mo55a(m100072f());
    }

    /* renamed from: c */
    public final void mo27462c(List<Message> list) {
        Integer num;
        StringBuilder sb = new StringBuilder("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        m100071e().mo80373d();
        m100072f().mo80373d();
    }

    /* renamed from: a */
    public final void mo80474a(C30916k kVar) {
        C7573i.m23587b(kVar, "observer");
        this.f80457b.mo80515c().removeObserver(kVar);
    }

    /* renamed from: a */
    public final void mo80475a(List<Message> list) {
        Object obj;
        boolean z;
        StringBuilder sb = new StringBuilder("onDataChanged: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        if (list != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = null;
            }
            if (list != null) {
                this.f80457b.mo80514b().clear();
                this.f80457b.mo80514b().addAll(collection);
                m100071e().mo80370a();
                m100072f().mo80370a();
            }
        }
    }

    /* renamed from: a */
    public final void mo80473a(SessionInfo sessionInfo, C11443k kVar) {
        C7573i.m23587b(sessionInfo, "sessionInfo");
        C7573i.m23587b(kVar, "messageModel");
        this.f80457b.mo80514b().clear();
        this.f80457b.mo80515c().setValue(null);
        this.f80457b.mo80512a(sessionInfo);
        this.f80457b.mo80511a(kVar);
        C11407f.m33601a().mo27452a(kVar.f30971b, (C11439h) this);
    }

    /* renamed from: a */
    public final void mo80472a(C0043i iVar, C30916k kVar, boolean z) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(kVar, "observer");
        this.f80457b.mo80515c().mo60162a(iVar, kVar, true);
    }
}
