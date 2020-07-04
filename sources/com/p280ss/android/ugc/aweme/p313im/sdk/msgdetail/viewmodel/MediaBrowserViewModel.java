package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11440j;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31070a;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31077d;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.C31544a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.DragViewInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel */
public final class MediaBrowserViewModel extends ListViewModel<C31547a<BaseContent>> implements C31070a {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f82640b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserViewModel.class), "unInitializerError", "getUnInitializerError()Ljava/lang/Exception;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserViewModel.class), "initialData", "getInitialData()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserViewModel.class), "serverCommand", "getServerCommand()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserViewModel.class), "clientList", "getClientList()Ljava/util/List;"))};

    /* renamed from: d */
    public static final C31574a f82641d = new C31574a(null);

    /* renamed from: c */
    public long f82642c = -1;

    /* renamed from: e */
    private boolean f82643e;

    /* renamed from: f */
    private final C7541d f82644f = C31587e.m102677a(C31581h.f82658a);

    /* renamed from: g */
    private final C7541d f82645g = C31587e.m102677a(C31576c.f82653a);

    /* renamed from: h */
    private final List<Integer> f82646h = C7525m.m23466c(Integer.valueOf(30), Integer.valueOf(27), Integer.valueOf(2));

    /* renamed from: i */
    private C11440j f82647i;

    /* renamed from: j */
    private C31544a f82648j;

    /* renamed from: k */
    private IViewInfo f82649k;

    /* renamed from: l */
    private final C7541d f82650l = C31587e.m102677a(C31580g.f82657a);

    /* renamed from: m */
    private final C7541d f82651m = C31587e.m102677a(C31575b.f82652a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$a */
    public static final class C31574a {
        private C31574a() {
        }

        public /* synthetic */ C31574a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MediaBrowserViewModel m102663a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(MediaBrowserViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…serViewModel::class.java)");
            return (MediaBrowserViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$b */
    static final class C31575b extends Lambda implements C7561a<List<C31584b>> {

        /* renamed from: a */
        public static final C31575b f82652a = new C31575b();

        C31575b() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31584b> m102664a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102664a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$c */
    static final class C31576c extends Lambda implements C7561a<List<C31547a<BaseContent>>> {

        /* renamed from: a */
        public static final C31576c f82653a = new C31576c();

        C31576c() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31547a<BaseContent>> m102665a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102665a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$d */
    static final class C31577d extends Lambda implements C7562b<C31584b, C7581n> {

        /* renamed from: a */
        public static final C31577d f82654a = new C31577d();

        C31577d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102666a((C31584b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m102666a(C31584b bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo82287i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$e */
    static final class C31578e extends Lambda implements C7562b<C31584b, C7581n> {

        /* renamed from: a */
        public static final C31578e f82655a = new C31578e();

        C31578e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102667a((C31584b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m102667a(C31584b bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo82286h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$f */
    static final class C31579f<T> implements C0053p<ServerCommand> {

        /* renamed from: a */
        final /* synthetic */ C31585c f82656a;

        C31579f(C31585c cVar) {
            this.f82656a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(ServerCommand serverCommand) {
            if (serverCommand != null) {
                switch (C31586d.f82663a[serverCommand.ordinal()]) {
                    case 1:
                        return;
                    case 2:
                        this.f82656a.mo82253m();
                        break;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$g */
    static final class C31580g extends Lambda implements C7561a<C23084b<ServerCommand>> {

        /* renamed from: a */
        public static final C31580g f82657a = new C31580g();

        C31580g() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<ServerCommand> m102669a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102669a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$h */
    static final class C31581h extends Lambda implements C7561a<Exception> {

        /* renamed from: a */
        public static final C31581h f82658a = new C31581h();

        C31581h() {
            super(0);
        }

        /* renamed from: a */
        private static Exception m102670a() {
            return new Exception("ViewModel unInitialized");
        }

        public final /* synthetic */ Object invoke() {
            return m102670a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$i */
    static final class C31582i extends Lambda implements C7562b<C31584b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31583a f82659a;

        C31582i(C31583a aVar) {
            this.f82659a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102671a((C31584b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102671a(C31584b bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo82279a(this.f82659a);
        }
    }

    /* renamed from: m */
    private final Exception m102638m() {
        return (Exception) this.f82644f.getValue();
    }

    /* renamed from: n */
    private final List<C31547a<BaseContent>> m102639n() {
        return (List) this.f82645g.getValue();
    }

    /* renamed from: p */
    private final C23084b<ServerCommand> m102641p() {
        return (C23084b) this.f82650l.getValue();
    }

    /* renamed from: q */
    private final List<C31584b> m102642q() {
        return (List) this.f82651m.getValue();
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

    /* renamed from: c */
    public final void mo27462c(List<Message> list) {
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
    }

    /* renamed from: f */
    public final void mo27466f(List<Message> list) {
    }

    /* renamed from: g */
    public final void mo27467g(List<PropertyMsg> list) {
    }

    /* renamed from: a */
    public final void mo82312a(C31584b bVar) {
        C7573i.m23587b(bVar, "client");
        if (!m102642q().contains(bVar)) {
            m102642q().add(bVar);
        }
    }

    /* renamed from: c */
    public final void mo82314c() {
        m102635a((C7562b<? super C31584b, C7581n>) C31578e.f82655a);
    }

    /* renamed from: d */
    public final void mo82315d() {
        m102635a((C7562b<? super C31584b, C7581n>) C31577d.f82654a);
    }

    /* renamed from: l */
    public final void mo82316l() {
        m102641p().setValue(ServerCommand.PERFORM_BACK);
    }

    public final void onCleared() {
        super.onCleared();
        C11440j jVar = this.f82647i;
        if (jVar == null) {
            C7573i.m23583a("model");
        }
        jVar.mo27654a();
    }

    /* renamed from: o */
    private final void m102640o() {
        C31544a aVar = this.f82648j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        Message message = aVar.f82577b;
        if (message != null) {
            this.f82642c = message.getIndex();
        }
    }

    /* renamed from: b */
    public final void mo82313b() {
        if (!this.f82643e) {
            mo81556h().mo81564a((Throwable) m102638m());
            return;
        }
        StringBuilder sb = new StringBuilder("loadLatest: ");
        C11440j jVar = this.f82647i;
        if (jVar == null) {
            C7573i.m23583a("model");
        }
        sb.append(jVar.f30964d.size());
        mo81555g().mo81565a(true);
        C11440j jVar2 = this.f82647i;
        if (jVar2 == null) {
            C7573i.m23583a("model");
        }
        jVar2.mo27656b();
    }

    /* renamed from: a */
    public final void mo82308a() {
        if (!this.f82643e) {
            mo81554f().mo81564a((Throwable) m102638m());
            return;
        }
        m102634a(m102639n());
        mo81554f().f81562b = false;
        mo81554f().mo81566b(true);
    }

    /* renamed from: a */
    private final void m102634a(List<C31547a<BaseContent>> list) {
        Object value = mo81552e().getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        List list2 = (List) value;
        list2.clear();
        if (list != null) {
            list2.addAll(C7525m.m23512f((Iterable<? extends T>) list));
        }
    }

    /* renamed from: a */
    private final IViewInfo m102633a(long j) {
        C31544a aVar = this.f82648j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        ArrayList<DragViewInfo> arrayList = aVar.f82579d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                if (dragViewInfo.f82549a == j && dragViewInfo.f82550b != null) {
                    IViewInfo iViewInfo = dragViewInfo.f82550b;
                    if (iViewInfo == null) {
                        C7573i.m23580a();
                    }
                    return iViewInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m102635a(C7562b<? super C31584b, C7581n> bVar) {
        for (C31584b invoke : m102642q()) {
            bVar.invoke(invoke);
        }
    }

    /* renamed from: b */
    private final List<Message> m102636b(List<Message> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C7525m.m23461a();
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (this.f82646h.contains(Integer.valueOf(((Message) next).getMsgType()))) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder("onLoadMore: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", ");
        C11440j jVar = this.f82647i;
        if (jVar == null) {
            C7573i.m23583a("model");
        }
        sb.append(jVar.f30964d.size());
        C11440j jVar2 = this.f82647i;
        if (jVar2 == null) {
            C7573i.m23583a("model");
        }
        m102634a(m102637h(jVar2.mo27658d()));
        C31077d g = mo81555g();
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && list.size() >= 20) {
            z2 = true;
        }
        g.f81562b = z2;
        mo81555g().mo81566b(true);
    }

    /* renamed from: h */
    private final List<C31547a<BaseContent>> m102637h(List<Message> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C7525m.m23461a();
        }
        Iterable<Message> b = m102636b(list);
        Collection arrayList = new ArrayList(C7525m.m23469a(b, 10));
        for (Message message : b) {
            BaseContent parse = MessageViewType.valueOf(message).parse(message);
            C7573i.m23582a((Object) parse, "MessageViewType.valueOf(it).parse(it)");
            arrayList.add(new C31547a(parse, message, m102633a(message.getIndex())));
        }
        Iterable iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            BaseContent baseContent = (BaseContent) ((C31547a) next).f82581a;
            if ((baseContent instanceof StoryVideoContent) || (baseContent instanceof StoryPictureContent) || (baseContent instanceof OnlyPictureContent)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    public final void mo82311a(C31583a aVar) {
        C7573i.m23587b(aVar, "state");
        m102635a((C7562b<? super C31584b, C7581n>) new C31582i<Object,C7581n>(aVar));
    }

    /* renamed from: a */
    public final void mo82309a(C0043i iVar, C31585c cVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(cVar, "server");
        m102641p().observe(iVar, new C31579f(cVar));
    }

    /* renamed from: a */
    public final void mo82310a(C31544a aVar, IViewInfo iViewInfo) {
        C7573i.m23587b(aVar, "param");
        C7573i.m23587b(iViewInfo, "defaultViewInfo");
        List b = m102636b(aVar.f82578c);
        this.f82648j = aVar;
        this.f82649k = iViewInfo;
        this.f82647i = new C11440j(aVar.f82576a, C7525m.m23507c((Collection<Integer>) this.f82646h), 20);
        C11440j jVar = this.f82647i;
        if (jVar == null) {
            C7573i.m23583a("model");
        }
        jVar.mo27655a((C11439h) this);
        C11440j jVar2 = this.f82647i;
        if (jVar2 == null) {
            C7573i.m23583a("model");
        }
        jVar2.f30964d.addAll(b);
        m102640o();
        m102639n().clear();
        m102639n().addAll(m102637h(b));
        mo81552e().setValue(new ArrayList());
        this.f82643e = true;
    }
}
