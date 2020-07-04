package com.p280ss.android.ugc.aweme.shortvideo.sticker.composer;

import android.arch.lifecycle.C0052o;
import android.support.p029v7.app.AppCompatActivity;
import android.view.ViewGroup;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.p280ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.vesdk.C45252ac;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C48017e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.p358a.C7568d;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a */
public final class C40521a implements C41020a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f105312a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40521a.class), "effectSdkVersion", "getEffectSdkVersion()Ljava/lang/String;"))};

    /* renamed from: b */
    public final List<ComposerNode> f105313b = new ArrayList();

    /* renamed from: c */
    public final List<ComposerNode> f105314c = new C40526d(this);

    /* renamed from: d */
    public final C0052o<List<ComposerNode>> f105315d;

    /* renamed from: e */
    public final C7541d<C40528b> f105316e;

    /* renamed from: f */
    public final AppCompatActivity f105317f;

    /* renamed from: g */
    public final ViewGroup f105318g;

    /* renamed from: h */
    public final C20749b f105319h;

    /* renamed from: i */
    public final EffectStickerManager f105320i;

    /* renamed from: j */
    private FaceStickerBean f105321j;

    /* renamed from: k */
    private final C7541d f105322k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a$a */
    static final class C40522a extends Lambda implements C7561a<ComposerStickerViewImpl> {

        /* renamed from: a */
        final /* synthetic */ C40521a f105323a;

        C40522a(C40521a aVar) {
            this.f105323a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ComposerStickerViewImpl invoke() {
            ComposerStickerViewImpl composerStickerViewImpl = new ComposerStickerViewImpl(this.f105323a.f105317f, this.f105323a.f105318g, this.f105323a.f105320i, this.f105323a.f105315d, new C7563m<AVDmtImageTextView, ComposerNode, C7581n>(this.f105323a) {
                public final String getName() {
                    return "doOnClick";
                }

                public final C7585d getOwner() {
                    return C7575l.m23595a(C40521a.class);
                }

                public final String getSignature() {
                    return "doOnClick(Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;Lcom/ss/android/ugc/effectmanager/effect/model/ComposerNode;)V";
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m129567a((AVDmtImageTextView) obj, (ComposerNode) obj2);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m129567a(AVDmtImageTextView aVDmtImageTextView, ComposerNode composerNode) {
                    C7573i.m23587b(aVDmtImageTextView, "p1");
                    C7573i.m23587b(composerNode, "p2");
                    ((C40521a) this.receiver).mo100573a(aVDmtImageTextView, composerNode);
                }
            });
            return composerStickerViewImpl;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a$b */
    public static final class C40524b implements C43760j {

        /* renamed from: a */
        final /* synthetic */ C40521a f105324a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f105325b;

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
        }

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            this.f105324a.f105314c.add(this.f105325b);
            C20749b bVar = this.f105324a.f105319h;
            Iterable<ComposerNode> iterable = this.f105324a.f105314c;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (ComposerNode composerNode : iterable) {
                Effect effect2 = composerNode.effect;
                C7573i.m23582a((Object) effect2, "it.effect");
                String unzipPath = effect2.getUnzipPath();
                if (unzipPath == null) {
                    C7573i.m23580a();
                }
                Effect effect3 = composerNode.effect;
                C7573i.m23582a((Object) effect3, "it.effect");
                String extra = effect3.getExtra();
                if (extra == null) {
                    extra = "";
                }
                arrayList.add(new ComposerInfo(unzipPath, extra));
            }
            bVar.mo56105d((List) arrayList, 20000);
            C20761c d = this.f105324a.f105319h.mo56102d();
            if (effect == null) {
                C7573i.m23580a();
            }
            String unzipPath2 = effect.getUnzipPath();
            if (unzipPath2 == null) {
                C7573i.m23580a();
            }
            String str = this.f105325b.tag_name;
            C7573i.m23582a((Object) str, "node.tag_name");
            d.mo56140a(unzipPath2, str, C40521a.m129555a(this.f105325b.default_value)).mo56144a();
            ((C40528b) this.f105324a.f105316e.getValue()).mo100566a(this.f105325b, this.f105324a.mo100572a(this.f105325b));
        }

        C40524b(C40521a aVar, ComposerNode composerNode) {
            this.f105324a = aVar;
            this.f105325b = composerNode;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a$c */
    static final class C40525c extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C40525c f105326a = new C40525c();

        C40525c() {
            super(0);
        }

        /* renamed from: a */
        private static String m129571a() {
            return C45252ac.m142769b();
        }

        public final /* synthetic */ Object invoke() {
            return m129571a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a$d */
    public static final class C40526d implements List<ComposerNode>, C7568d {

        /* renamed from: a */
        final /* synthetic */ C40521a f105327a;

        /* renamed from: b */
        private final /* synthetic */ List f105328b;

        /* renamed from: a */
        private int m129572a() {
            return this.f105328b.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ComposerNode get(int i) {
            Object obj = this.f105328b.get(i);
            C7573i.m23582a(obj, "get(...)");
            return (ComposerNode) obj;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void add(int i, ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            this.f105328b.add(i, composerNode);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public ComposerNode remove(int i) {
            Object remove = this.f105328b.remove(i);
            C7573i.m23582a(remove, "removeAt(...)");
            return (ComposerNode) remove;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public ComposerNode set(int i, ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            Object obj = this.f105328b.set(i, composerNode);
            C7573i.m23582a(obj, "set(...)");
            return (ComposerNode) obj;
        }

        /* renamed from: c */
        private boolean m129579c(ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            return this.f105328b.contains(composerNode);
        }

        /* renamed from: d */
        private int m129580d(ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            return this.f105328b.indexOf(composerNode);
        }

        /* renamed from: e */
        private int m129581e(ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            return this.f105328b.lastIndexOf(composerNode);
        }

        public final boolean addAll(int i, Collection<? extends ComposerNode> collection) {
            C7573i.m23587b(collection, "elements");
            return this.f105328b.addAll(i, collection);
        }

        public final boolean addAll(Collection<? extends ComposerNode> collection) {
            C7573i.m23587b(collection, "elements");
            return this.f105328b.addAll(collection);
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C7573i.m23587b(collection, "elements");
            return this.f105328b.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.f105328b.isEmpty();
        }

        public final Iterator<ComposerNode> iterator() {
            return this.f105328b.iterator();
        }

        public final ListIterator<ComposerNode> listIterator() {
            return this.f105328b.listIterator();
        }

        public final ListIterator<ComposerNode> listIterator(int i) {
            return this.f105328b.listIterator(i);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C7573i.m23587b(collection, "elements");
            return this.f105328b.removeAll(collection);
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C7573i.m23587b(collection, "elements");
            return this.f105328b.retainAll(collection);
        }

        public final List<ComposerNode> subList(int i, int i2) {
            return this.f105328b.subList(i, i2);
        }

        public final Object[] toArray() {
            return C48017e.m148957a(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C48017e.m148958a(this, tArr);
        }

        public final int size() {
            return m129572a();
        }

        public final void clear() {
            this.f105327a.f105313b.clear();
            this.f105327a.f105315d.setValue(this);
        }

        C40526d(C40521a aVar) {
            this.f105327a = aVar;
            this.f105328b = aVar.f105313b;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            return m129579c((ComposerNode) obj);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            return m129580d((ComposerNode) obj);
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            return m129581e((ComposerNode) obj);
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            return m129578b((ComposerNode) obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean add(ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            boolean add = this.f105327a.f105313b.add(composerNode);
            this.f105327a.f105315d.setValue(this);
            return add;
        }

        /* renamed from: b */
        private boolean m129578b(ComposerNode composerNode) {
            C7573i.m23587b(composerNode, "element");
            boolean remove = this.f105327a.f105313b.remove(composerNode);
            this.f105327a.f105315d.setValue(this);
            return remove;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.a$e */
    static final class C40527e extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40521a f105329a;

        /* renamed from: b */
        final /* synthetic */ ComposerNode f105330b;

        C40527e(C40521a aVar, ComposerNode composerNode) {
            this.f105329a = aVar;
            this.f105330b = composerNode;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m129582a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129582a(int i) {
            C20761c d = this.f105329a.f105319h.mo56102d();
            Effect effect = this.f105330b.effect;
            C7573i.m23582a((Object) effect, "composerNode.effect");
            String unzipPath = effect.getUnzipPath();
            C7573i.m23582a((Object) unzipPath, "composerNode.effect.unzipPath");
            String str = this.f105330b.tag_name;
            C7573i.m23582a((Object) str, "composerNode.tag_name");
            d.mo56140a(unzipPath, str, C40521a.m129556a(i)).mo56144a();
        }
    }

    /* renamed from: a */
    public static float m129555a(float f) {
        return f / 100.0f;
    }

    /* renamed from: a */
    public static float m129556a(int i) {
        return ((float) i) / 100.0f;
    }

    /* renamed from: a */
    private final String m129557a() {
        return (String) this.f105322k.getValue();
    }

    /* renamed from: a */
    public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: b */
    public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: c */
    public final void mo100339c(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
    }

    /* renamed from: b */
    private final void m129558b() {
        if (this.f105316e.isInitialized()) {
            ((C40528b) this.f105316e.getValue()).mo100568c();
        }
        this.f105314c.clear();
    }

    /* renamed from: a */
    public final C7562b<Integer, C7581n> mo100572a(ComposerNode composerNode) {
        return new C40527e<>(this, composerNode);
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        if (this.f105316e.isInitialized()) {
            ((C40528b) this.f105316e.getValue()).mo100567b();
        }
        m129558b();
    }

    /* renamed from: a */
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        String name = faceStickerBean.getName();
        C7573i.m23582a((Object) name, "faceSticker.name");
        if (!C7634n.m23776c((CharSequence) name, (CharSequence) "composer", false)) {
            String name2 = faceStickerBean.getName();
            C7573i.m23582a((Object) name2, "faceSticker.name");
            if (!C7634n.m23776c((CharSequence) name2, (CharSequence) "Composer", false)) {
                if (this.f105316e.isInitialized()) {
                    ((C40528b) this.f105316e.getValue()).mo100567b();
                }
                m129558b();
                this.f105321j = null;
                return;
            }
        }
        ((C40528b) this.f105316e.getValue()).mo100564a();
        ((C40528b) this.f105316e.getValue()).mo100565a(ComposerHelper.parseComposerMaterial(faceStickerBean.getLocalPath(), m129557a(), new File(faceStickerBean.getLocalPath()).getParent()));
        this.f105321j = faceStickerBean;
    }

    /* renamed from: a */
    public final void mo100573a(AVDmtImageTextView aVDmtImageTextView, ComposerNode composerNode) {
        if (this.f105314c.contains(composerNode)) {
            this.f105314c.remove(composerNode);
            C20749b bVar = this.f105319h;
            Iterable<ComposerNode> iterable = this.f105314c;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (ComposerNode composerNode2 : iterable) {
                Effect effect = composerNode2.effect;
                C7573i.m23582a((Object) effect, "it.effect");
                String unzipPath = effect.getUnzipPath();
                if (unzipPath == null) {
                    C7573i.m23580a();
                }
                Effect effect2 = composerNode2.effect;
                C7573i.m23582a((Object) effect2, "it.effect");
                String extra = effect2.getExtra();
                if (extra == null) {
                    extra = "";
                }
                arrayList.add(new ComposerInfo(unzipPath, extra));
            }
            bVar.mo56105d((List) arrayList, 20000);
        } else if (C7634n.m23717a(composerNode.UI_name, "clear", true)) {
            m129558b();
            this.f105319h.mo56040a();
        } else {
            this.f105320i.f104787e.mo70620a(composerNode.effect, (C43760j) new C40524b(this, composerNode));
        }
    }

    public C40521a(AppCompatActivity appCompatActivity, ViewGroup viewGroup, C20749b bVar, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewGroup, "rootView");
        C7573i.m23587b(bVar, "effectController");
        C7573i.m23587b(effectStickerManager, "effectStickerManager");
        this.f105317f = appCompatActivity;
        this.f105318g = viewGroup;
        this.f105319h = bVar;
        this.f105320i = effectStickerManager;
        C0052o<List<ComposerNode>> oVar = new C0052o<>();
        oVar.setValue(this.f105314c);
        this.f105315d = oVar;
        this.f105316e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C40522a(this));
        this.f105322k = C7546e.m23569a(C40525c.f105326a);
    }
}
