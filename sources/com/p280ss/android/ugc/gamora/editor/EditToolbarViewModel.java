package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.editor.C44267cf.C44268a;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel */
public final class EditToolbarViewModel extends BaseJediViewModel<EditToolbarState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113757c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditToolbarViewModel.class), "toolbarItemVisibleMap", "getToolbarItemVisibleMap()Ljava/util/Map;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditToolbarViewModel.class), "toolbarItemEnableMap", "getToolbarItemEnableMap()Ljava/util/Map;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditToolbarViewModel.class), "toolbarItemSelectedMap", "getToolbarItemSelectedMap()Ljava/util/Map;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditToolbarViewModel.class), "toolbarItemGuideMap", "getToolbarItemGuideMap()Ljava/util/Map;"))};

    /* renamed from: d */
    public final C44247c f113758d = new C44247c();

    /* renamed from: e */
    private final C7541d f113759e = C7546e.m23569a(C43945r.f113780a);

    /* renamed from: f */
    private final C7541d f113760f = C7546e.m23569a(C43942o.f113777a);

    /* renamed from: g */
    private final C7541d f113761g = C7546e.m23569a(C43944q.f113779a);

    /* renamed from: h */
    private final C7541d f113762h = C7546e.m23569a(C43943p.f113778a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$a */
    static final class C43928a extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C43928a f113763a = new C43928a();

        C43928a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139144a((EditToolbarState) obj);
        }

        /* renamed from: a */
        private static EditToolbarState m139144a(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            C44412h hVar = r1;
            C44412h hVar2 = new C44412h();
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar, 8191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$b */
    static final class C43929b extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C43929b f113764a = new C43929b();

        C43929b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139145a((EditToolbarState) obj);
        }

        /* renamed from: a */
        private static EditToolbarState m139145a(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            C44412h hVar = r1;
            C44412h hVar2 = new C44412h();
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, hVar, null, null, null, null, null, null, null, null, 16351, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$c */
    static final class C43930c extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f113765a;

        C43930c(Drawable drawable) {
            this.f113765a = drawable;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, this.f113765a, null, 12287, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$d */
    static final class C43931d extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113766a;

        C43931d(boolean z) {
            this.f113766a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, Boolean.valueOf(this.f113766a), null, null, null, null, null, null, null, null, null, null, null, null, 16381, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$e */
    static final class C43932e extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113767a;

        C43932e(boolean z) {
            this.f113767a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, Boolean.valueOf(this.f113767a), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$f */
    static final class C43933f extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f113768a;

        C43933f(List list) {
            this.f113768a = list;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, this.f113768a, null, null, null, null, null, null, null, null, null, 16367, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$g */
    static final class C43934g extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f113769a;

        C43934g(int i) {
            this.f113769a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f113769a), null, null, 14335, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$h */
    static final class C43935h extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f113770a;

        C43935h(int i) {
            this.f113770a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f113770a), null, null, null, 15359, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$i */
    static final class C43936i extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f113771a;

        C43936i(Drawable drawable) {
            this.f113771a = drawable;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, this.f113771a, null, null, null, null, null, 16127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$j */
    static final class C43937j extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f113772a;

        C43937j(String str) {
            this.f113772a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, this.f113772a, null, null, null, null, null, null, 16255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$k */
    static final class C43938k extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113773a;

        C43938k(boolean z) {
            this.f113773a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, Boolean.valueOf(this.f113773a), null, null, null, null, null, null, null, null, null, null, null, 16379, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$l */
    static final class C43939l extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f113774a;

        C43939l(List list) {
            this.f113774a = list;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, this.f113774a, null, null, null, null, null, null, null, null, null, null, 16375, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$m */
    static final class C43940m extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113775a;

        C43940m(boolean z) {
            this.f113775a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, Boolean.valueOf(this.f113775a), null, null, null, null, null, null, null, 16319, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$n */
    static final class C43941n extends Lambda implements C7562b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f113776a;

        C43941n(int i) {
            this.f113776a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C7573i.m23587b(editToolbarState, "$receiver");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f113776a), null, null, null, null, 15871, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$o */
    static final class C43942o extends Lambda implements C7561a<Map<Integer, ? extends C0052o<Boolean>>> {

        /* renamed from: a */
        public static final C43942o f113777a = new C43942o();

        C43942o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m139158a();
        }

        /* renamed from: a */
        private static Map<Integer, C0052o<Boolean>> m139158a() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C44268a.m140050a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0052o());
            }
            return C7507ae.m23399b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$p */
    static final class C43943p extends Lambda implements C7561a<Map<Integer, ? extends C0052o<Boolean>>> {

        /* renamed from: a */
        public static final C43943p f113778a = new C43943p();

        C43943p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m139159a();
        }

        /* renamed from: a */
        private static Map<Integer, C0052o<Boolean>> m139159a() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C44268a.m140050a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0052o());
            }
            return C7507ae.m23399b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$q */
    static final class C43944q extends Lambda implements C7561a<Map<Integer, ? extends C0052o<Boolean>>> {

        /* renamed from: a */
        public static final C43944q f113779a = new C43944q();

        C43944q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m139160a();
        }

        /* renamed from: a */
        private static Map<Integer, C0052o<Boolean>> m139160a() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C44268a.m140050a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0052o());
            }
            return C7507ae.m23399b(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditToolbarViewModel$r */
    static final class C43945r extends Lambda implements C7561a<Map<Integer, ? extends C0052o<Boolean>>> {

        /* renamed from: a */
        public static final C43945r f113780a = new C43945r();

        C43945r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m139161a();
        }

        /* renamed from: a */
        private static Map<Integer, C0052o<Boolean>> m139161a() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : C44268a.m140050a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new C0052o());
            }
            return C7507ae.m23399b(linkedHashMap);
        }
    }

    /* renamed from: i */
    private final Map<Integer, C0052o<Boolean>> m139116i() {
        return (Map) this.f113759e.getValue();
    }

    /* renamed from: j */
    private final Map<Integer, C0052o<Boolean>> m139117j() {
        return (Map) this.f113760f.getValue();
    }

    /* renamed from: k */
    private final Map<Integer, C0052o<Boolean>> m139118k() {
        return (Map) this.f113761g.getValue();
    }

    /* renamed from: l */
    private final Map<Integer, C0052o<Boolean>> m139119l() {
        return (Map) this.f113762h.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139115h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43929b.f113764a);
    }

    /* renamed from: g */
    public final void mo106427g() {
        mo29038c(C43928a.f113763a);
    }

    /* renamed from: h */
    private static EditToolbarState m139115h() {
        EditToolbarState editToolbarState = new EditToolbarState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        return editToolbarState;
    }

    /* renamed from: a */
    public final void mo106406a(int i) {
        mo29038c(new C43941n(i));
    }

    /* renamed from: b */
    public final void mo106412b(int i) {
        mo29038c(new C43935h(i));
    }

    /* renamed from: c */
    public final void mo106417c(int i) {
        mo29038c(new C43934g(i));
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo106420d(int i) {
        return (LiveData) m139117j().get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final LiveData<Boolean> mo106423e(int i) {
        return (LiveData) m139119l().get(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final LiveData<Boolean> mo106425f(int i) {
        return (LiveData) m139118k().get(Integer.valueOf(i));
    }

    /* renamed from: g */
    public final LiveData<Boolean> mo106426g(int i) {
        return (LiveData) m139116i().get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo106408a(Drawable drawable) {
        C7573i.m23587b(drawable, "value");
        mo29038c(new C43936i(drawable));
    }

    /* renamed from: b */
    public final void mo106414b(Drawable drawable) {
        C7573i.m23587b(drawable, "value");
        mo29038c(new C43930c(drawable));
    }

    /* renamed from: c */
    public final void mo106419c(boolean z) {
        mo29038c(new C43938k(z));
    }

    /* renamed from: d */
    public final void mo106422d(boolean z) {
        mo29038c(new C43940m(z));
    }

    /* renamed from: a */
    public final void mo106409a(String str) {
        C7573i.m23587b(str, "value");
        mo29038c(new C43937j(str));
    }

    /* renamed from: b */
    public final void mo106415b(List<C44267cf> list) {
        C7573i.m23587b(list, "value");
        mo29038c(new C43933f(list));
    }

    /* renamed from: a */
    public final void mo106410a(List<C44267cf> list) {
        C7573i.m23587b(list, "value");
        mo29038c(new C43939l(list));
    }

    /* renamed from: b */
    public final void mo106416b(boolean z) {
        mo29038c(new C43931d(z));
    }

    /* renamed from: a */
    public final void mo106411a(boolean z) {
        mo29038c(new C43932e(z));
    }

    /* renamed from: a */
    public final void mo106407a(int i, boolean z) {
        C0052o oVar = (C0052o) m139117j().get(Integer.valueOf(i));
        if (oVar != null) {
            oVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo106413b(int i, boolean z) {
        C0052o oVar = (C0052o) m139119l().get(Integer.valueOf(i));
        if (oVar != null) {
            oVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo106418c(int i, boolean z) {
        C0052o oVar = (C0052o) m139119l().get(Integer.valueOf(i));
        if (oVar != null) {
            oVar.postValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    public final void mo106421d(int i, boolean z) {
        C0052o oVar = (C0052o) m139118k().get(Integer.valueOf(i));
        if (oVar != null) {
            oVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: e */
    public final void mo106424e(int i, boolean z) {
        C0052o oVar = (C0052o) m139116i().get(Integer.valueOf(i));
        if (oVar != null) {
            oVar.setValue(Boolean.valueOf(z));
        }
    }
}
