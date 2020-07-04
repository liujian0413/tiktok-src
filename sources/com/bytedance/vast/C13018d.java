package com.bytedance.vast;

import com.bytedance.vast.exception.FetchException;
import com.bytedance.vast.exception.ParseException;
import com.bytedance.vast.model.AdVerification;
import com.bytedance.vast.model.Creative;
import com.bytedance.vast.model.Icon;
import com.bytedance.vast.model.MediaFile;
import com.bytedance.vast.model.TrackingEvent;
import com.bytedance.vast.model.Vast;
import com.bytedance.vast.model.VideoClick;
import com.bytedance.vast.p673a.C13008a;
import com.bytedance.vast.p673a.C13009b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;
import kotlin.reflect.C7585d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C7634n;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* renamed from: com.bytedance.vast.d */
public final class C13018d {

    /* renamed from: a */
    private final XPath f34445a;

    /* renamed from: b */
    private int f34446b;

    /* renamed from: c */
    private final Vast f34447c;

    /* renamed from: d */
    private final C13016b f34448d;

    /* renamed from: e */
    private final C13017c f34449e;

    /* renamed from: com.bytedance.vast.d$a */
    public static final class C13019a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.vast.d$b */
    public static final class C13020b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.vast.d$c */
    public static final class C13021c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.vast.d$d */
    static final /* synthetic */ class C13022d extends FunctionReference implements C7562b<Node, VideoClick> {
        C13022d(C13018d dVar) {
            super(1, dVar);
        }

        public final String getName() {
            return "parseVideoClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C13018d.class);
        }

        public final String getSignature() {
            return "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VideoClick invoke(Node node) {
            C7573i.m23587b(node, "p1");
            return ((C13018d) this.receiver).mo31550a(node);
        }
    }

    /* renamed from: com.bytedance.vast.d$e */
    public static final class C13023e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.vast.d$f */
    public static final class C13024f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.vast.d$g */
    public static final class C13025g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((Creative) t).byWrapper ? 1 : 0), Integer.valueOf(((Creative) t2).byWrapper ? 1 : 0));
        }
    }

    public C13018d(Vast vast) {
        this(vast, null, null, 6, null);
    }

    public C13018d(Vast vast, C13016b bVar) {
        this(vast, bVar, null, 4, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31551a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            com.bytedance.vast.c r0 = r8.f34449e
            if (r0 == 0) goto L_0x0007
            r0.mo31548a(r9, r10)
        L_0x0007:
            int r0 = r8.f34446b
            r1 = 1
            int r0 = r0 + r1
            r8.f34446b = r0
            r0 = 0
            com.bytedance.vast.b r2 = r8.f34448d     // Catch:{ FetchException -> 0x0028, ParseException -> 0x001f }
            if (r2 != 0) goto L_0x0016
            com.bytedance.vast.a r2 = com.bytedance.vast.C13007a.f34437a     // Catch:{ FetchException -> 0x0028, ParseException -> 0x001f }
            com.bytedance.vast.b r2 = (com.bytedance.vast.C13016b) r2     // Catch:{ FetchException -> 0x0028, ParseException -> 0x001f }
        L_0x0016:
            org.w3c.dom.Document r9 = r2.mo31542a(r9)     // Catch:{ FetchException -> 0x0028, ParseException -> 0x001f }
            r3 = r9
            goto L_0x0031
        L_0x001c:
            r9 = move-exception
            goto L_0x008d
        L_0x001f:
            r9 = move-exception
            com.bytedance.vast.c r2 = r8.f34449e     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0030
            r2.mo31546a(r9)     // Catch:{ all -> 0x001c }
            goto L_0x0030
        L_0x0028:
            r9 = move-exception
            com.bytedance.vast.c r2 = r8.f34449e     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0030
            r2.mo31545a(r9)     // Catch:{ all -> 0x001c }
        L_0x0030:
            r3 = r0
        L_0x0031:
            if (r3 != 0) goto L_0x005c
            com.bytedance.vast.c r9 = r8.f34449e
            if (r9 == 0) goto L_0x003a
            r9.mo31544a(r10)
        L_0x003a:
            int r9 = r8.f34446b
            int r9 = r9 + -1
            r8.f34446b = r9
            int r9 = r8.f34446b
            if (r9 != 0) goto L_0x005a
            com.bytedance.vast.model.Vast r9 = r8.f34447c
            java.util.List<com.bytedance.vast.model.Creative> r9 = r9.creativeList
            if (r9 == 0) goto L_0x005a
            int r10 = r9.size()
            if (r10 <= r1) goto L_0x005a
            com.bytedance.vast.d$e r10 = new com.bytedance.vast.d$e
            r10.<init>()
            java.util.Comparator r10 = (java.util.Comparator) r10
            kotlin.collections.C7525m.m23474a(r9, r10)
        L_0x005a:
            r9 = 0
            return r9
        L_0x005c:
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r4 = r10
            boolean r9 = r2.m37986a(r3, r4, 0)     // Catch:{ all -> 0x001c }
            com.bytedance.vast.c r0 = r8.f34449e
            if (r0 == 0) goto L_0x006c
            r0.mo31544a(r10)
        L_0x006c:
            int r10 = r8.f34446b
            int r10 = r10 + -1
            r8.f34446b = r10
            int r10 = r8.f34446b
            if (r10 != 0) goto L_0x008c
            com.bytedance.vast.model.Vast r10 = r8.f34447c
            java.util.List<com.bytedance.vast.model.Creative> r10 = r10.creativeList
            if (r10 == 0) goto L_0x008c
            int r0 = r10.size()
            if (r0 <= r1) goto L_0x008c
            com.bytedance.vast.d$f r0 = new com.bytedance.vast.d$f
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            kotlin.collections.C7525m.m23474a(r10, r0)
        L_0x008c:
            return r9
        L_0x008d:
            com.bytedance.vast.c r0 = r8.f34449e
            if (r0 == 0) goto L_0x0094
            r0.mo31544a(r10)
        L_0x0094:
            int r10 = r8.f34446b
            int r10 = r10 + -1
            r8.f34446b = r10
            int r10 = r8.f34446b
            if (r10 != 0) goto L_0x00b4
            com.bytedance.vast.model.Vast r10 = r8.f34447c
            java.util.List<com.bytedance.vast.model.Creative> r10 = r10.creativeList
            if (r10 == 0) goto L_0x00b4
            int r0 = r10.size()
            if (r0 <= r1) goto L_0x00b4
            com.bytedance.vast.d$g r0 = new com.bytedance.vast.d$g
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            kotlin.collections.C7525m.m23474a(r10, r0)
        L_0x00b4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.vast.C13018d.mo31551a(java.lang.String, int):boolean");
    }

    /* renamed from: c */
    private final void m37990c(Node node) {
        m37984a(node, true);
    }

    /* renamed from: d */
    private final void m37992d(Node node) {
        m37999h(node);
        m38000i(node);
        m38001j(node);
        m38002k(node);
    }

    /* renamed from: b */
    private final void m37988b(Node node) {
        C13017c cVar = this.f34449e;
        if (cVar != null) {
            cVar.mo31543a();
        }
        m37996f(node);
        m37994e(node);
        m37998g(node);
        m37984a(node, false);
    }

    /* renamed from: a */
    private final void m37982a(Document document) {
        boolean z;
        CharSequence charSequence = this.f34447c.version;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f34447c.version = this.f34445a.evaluate("/VAST/@version", document);
        }
    }

    /* renamed from: g */
    private final void m37998g(Node node) {
        boolean z;
        String evaluate = this.f34445a.evaluate("./Description/text()", node);
        C7573i.m23582a((Object) evaluate, "xpath.evaluate(\"./Description/text()\", inLineNode)");
        if (evaluate != null) {
            String obj = C7634n.m23762b(evaluate).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f34447c.description = obj;
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: h */
    private final void m37999h(Node node) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        C7604g a = C13009b.m37962a(xPath, (Object) node, "./Error");
        XPath xPath2 = this.f34445a;
        C7573i.m23582a((Object) xPath2, "xpath");
        Iterator a2 = C13009b.m37963a(a, xPath2, true, true).mo19416a();
        while (a2.hasNext()) {
            String str = (String) a2.next();
            this.f34447c.errorSet = C13008a.m37958a(this.f34447c.errorSet, str);
        }
    }

    /* renamed from: i */
    private final void m38000i(Node node) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        C7604g a = C13009b.m37962a(xPath, (Object) node, "./Impression");
        XPath xPath2 = this.f34445a;
        C7573i.m23582a((Object) xPath2, "xpath");
        Iterator a2 = C13009b.m37963a(a, xPath2, true, true).mo19416a();
        while (a2.hasNext()) {
            String str = (String) a2.next();
            this.f34447c.impressionSet = C13008a.m37958a(this.f34447c.impressionSet, str);
        }
    }

    /* renamed from: e */
    private final void m37994e(Node node) {
        boolean z;
        CharSequence charSequence = this.f34447c.adTitle;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Vast vast = this.f34447c;
            XPath xPath = this.f34445a;
            C7573i.m23582a((Object) xPath, "xpath");
            C7604g a = C13009b.m37962a(xPath, (Object) node, "./AdTitle");
            XPath xPath2 = this.f34445a;
            C7573i.m23582a((Object) xPath2, "xpath");
            vast.adTitle = (String) C7605h.m23658d(C13009b.m37963a(a, xPath2, true, true));
        }
    }

    /* renamed from: f */
    private final void m37996f(Node node) {
        boolean z;
        CharSequence charSequence = this.f34447c.adSystem;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Vast vast = this.f34447c;
            XPath xPath = this.f34445a;
            C7573i.m23582a((Object) xPath, "xpath");
            C7604g a = C13009b.m37962a(xPath, (Object) node, "./AdSystem");
            XPath xPath2 = this.f34445a;
            C7573i.m23582a((Object) xPath2, "xpath");
            vast.adSystem = (String) C7605h.m23658d(C13009b.m37963a(a, xPath2, true, true));
        }
    }

    /* renamed from: j */
    private final void m38001j(Node node) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            AdVerification adVerification = new AdVerification();
            String evaluate = this.f34445a.evaluate("./@vendor", node2);
            C7573i.m23582a((Object) evaluate, "xpath.evaluate(\"./@vendor\", verificationNode)");
            if (evaluate != null) {
                adVerification.vender = C7634n.m23762b(evaluate).toString();
                String evaluate2 = this.f34445a.evaluate("./JavaScriptResource/text()", node2);
                C7573i.m23582a((Object) evaluate2, "xpath.evaluate(\"./JavaSc…ext()\", verificationNode)");
                if (evaluate2 != null) {
                    adVerification.javascriptResource = C7634n.m23762b(evaluate2).toString();
                    String evaluate3 = this.f34445a.evaluate("./verificationParameters/text()", node2);
                    C7573i.m23582a((Object) evaluate3, "xpath.evaluate(\"./verifi…ext()\", verificationNode)");
                    if (evaluate3 != null) {
                        adVerification.verificationParameters = C7634n.m23762b(evaluate3).toString();
                        this.f34447c.adVerificationList = C13008a.m37957a(this.f34447c.adVerificationList, adVerification);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: k */
    private final void m38002k(Node node) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./ViewableImpression").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            XPath xPath2 = this.f34445a;
            C7573i.m23582a((Object) xPath2, "xpath");
            C7604g a2 = C13009b.m37962a(xPath2, (Object) node2, "./Viewable");
            XPath xPath3 = this.f34445a;
            C7573i.m23582a((Object) xPath3, "xpath");
            Iterator a3 = C13009b.m37963a(a2, xPath3, true, true).mo19416a();
            while (a3.hasNext()) {
                String str = (String) a3.next();
                this.f34447c.viewableSet = C13008a.m37958a(this.f34447c.viewableSet, str);
            }
            XPath xPath4 = this.f34445a;
            C7573i.m23582a((Object) xPath4, "xpath");
            C7604g a4 = C13009b.m37962a(xPath4, (Object) node2, "./NotViewable");
            XPath xPath5 = this.f34445a;
            C7573i.m23582a((Object) xPath5, "xpath");
            Iterator a5 = C13009b.m37963a(a4, xPath5, true, true).mo19416a();
            while (a5.hasNext()) {
                String str2 = (String) a5.next();
                this.f34447c.notViewableSet = C13008a.m37958a(this.f34447c.notViewableSet, str2);
            }
            XPath xPath6 = this.f34445a;
            C7573i.m23582a((Object) xPath6, "xpath");
            C7604g a6 = C13009b.m37962a(xPath6, (Object) node2, "./ViewUndetermined");
            XPath xPath7 = this.f34445a;
            C7573i.m23582a((Object) xPath7, "xpath");
            Iterator a7 = C13009b.m37963a(a6, xPath7, true, true).mo19416a();
            while (a7.hasNext()) {
                String str3 = (String) a7.next();
                this.f34447c.viewUndeterminedSet = C13008a.m37958a(this.f34447c.viewUndeterminedSet, str3);
            }
        }
    }

    /* renamed from: a */
    public final VideoClick mo31550a(Node node) {
        VideoClick videoClick = new VideoClick();
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        videoClick.clickThrough = C13009b.m37966b(xPath, node, C7605h.m23642a((T[]) new String[]{"./ClickThrough", "./IconClickThrough"}));
        XPath xPath2 = this.f34445a;
        C7573i.m23582a((Object) xPath2, "xpath");
        C7604g a = C13009b.m37961a(xPath2, (Object) node, C7605h.m23642a((T[]) new String[]{"./ClickTracking", "./IconClickTracking"}));
        XPath xPath3 = this.f34445a;
        C7573i.m23582a((Object) xPath3, "xpath");
        Iterator a2 = C13009b.m37963a(a, xPath3, true, true).mo19416a();
        while (a2.hasNext()) {
            videoClick.clickTracking = C13008a.m37958a(videoClick.clickTracking, (String) a2.next());
        }
        return videoClick;
    }

    /* renamed from: b */
    private final void m37989b(Node node, Creative creative) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        creative.duration = C13009b.m37960a(xPath, (Object) node, "./Linear/Duration");
    }

    /* renamed from: d */
    private final void m37993d(Node node, Creative creative) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C7605h.m23659d(C13009b.m37962a(xPath, (Object) node, "./Linear/VideoClicks"), new C13022d(this)).mo19416a();
        while (a.hasNext()) {
            creative.clickList = C13008a.m37957a(creative.clickList, (VideoClick) a.next());
        }
    }

    /* renamed from: a */
    private final void m37983a(Node node, Creative creative) {
        String evaluate = this.f34445a.evaluate("./@id", node);
        C7573i.m23582a((Object) evaluate, "xpath.evaluate(\"./@id\", creativeNode)");
        if (evaluate != null) {
            creative.f34450id = C7634n.m23762b(evaluate).toString();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final void m37984a(Node node, boolean z) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./Creatives/Creative").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            Creative creative = new Creative();
            creative.byWrapper = z;
            m37983a(node2, creative);
            m37989b(node2, creative);
            m37991c(node2, creative);
            m37993d(node2, creative);
            m37995e(node2, creative);
            m37997f(node2, creative);
            if (z) {
                this.f34447c.creativeList = C13008a.m37959b(this.f34447c.creativeList, creative);
            } else {
                this.f34447c.creativeList = C13008a.m37957a(this.f34447c.creativeList, creative);
            }
        }
    }

    /* renamed from: c */
    private final void m37991c(Node node, Creative creative) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./Linear/TrackingEvents/Tracking").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            TrackingEvent trackingEvent = new TrackingEvent();
            String evaluate = this.f34445a.evaluate("./@event", node2);
            C7573i.m23582a((Object) evaluate, "xpath.evaluate(\"./@event\", it)");
            if (evaluate != null) {
                trackingEvent.name = C7634n.m23762b(evaluate).toString();
                String evaluate2 = this.f34445a.evaluate("./@offset", node2);
                C7573i.m23582a((Object) evaluate2, "xpath.evaluate(\"./@offset\", it)");
                if (evaluate2 != null) {
                    trackingEvent.offset = C7634n.m23762b(evaluate2).toString();
                    String evaluate3 = this.f34445a.evaluate("./text()", node2);
                    C7573i.m23582a((Object) evaluate3, "xpath.evaluate(\"./text()\", it)");
                    if (evaluate3 != null) {
                        trackingEvent.url = C7634n.m23762b(evaluate3).toString();
                        creative.trackingEventList = C13008a.m37957a(creative.trackingEventList, trackingEvent);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo31552b(String str, int i) {
        C13017c cVar = this.f34449e;
        if (cVar != null) {
            cVar.mo31549b(str, i);
        }
        this.f34446b++;
        Document document = null;
        if (str != null) {
            try {
                document = C13009b.m37967b(str);
            } catch (ParseException e) {
                C13017c cVar2 = this.f34449e;
                if (cVar2 != null) {
                    cVar2.mo31546a(e);
                }
            } catch (Throwable th) {
                C13017c cVar3 = this.f34449e;
                if (cVar3 != null) {
                    cVar3.mo31544a(i);
                }
                this.f34446b--;
                if (this.f34446b == 0) {
                    List<Creative> list = this.f34447c.creativeList;
                    if (list != null && list.size() > 1) {
                        C7525m.m23474a(list, new C13021c());
                    }
                }
                throw th;
            }
        }
        Document document2 = document;
        if (document2 == null) {
            C13017c cVar4 = this.f34449e;
            if (cVar4 != null) {
                cVar4.mo31544a(i);
            }
            this.f34446b--;
            if (this.f34446b == 0) {
                List<Creative> list2 = this.f34447c.creativeList;
                if (list2 != null && list2.size() > 1) {
                    C7525m.m23474a(list2, new C13019a());
                }
            }
            return false;
        }
        boolean a = m37986a(document2, i, 0);
        C13017c cVar5 = this.f34449e;
        if (cVar5 != null) {
            cVar5.mo31544a(i);
        }
        this.f34446b--;
        if (this.f34446b == 0) {
            List<Creative> list3 = this.f34447c.creativeList;
            if (list3 != null && list3.size() > 1) {
                C7525m.m23474a(list3, new C13020b());
            }
        }
        return a;
    }

    /* renamed from: e */
    private final void m37995e(Node node, Creative creative) {
        boolean z;
        boolean z2;
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./Linear/MediaFiles/MediaFile").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            MediaFile mediaFile = new MediaFile();
            String evaluate = this.f34445a.evaluate("./@delivery", node2);
            C7573i.m23582a((Object) evaluate, "xpath.evaluate(\"./@delivery\", mediaFileNode)");
            if (evaluate != null) {
                mediaFile.delivery = C7634n.m23762b(evaluate).toString();
                String evaluate2 = this.f34445a.evaluate("./@type", node2);
                C7573i.m23582a((Object) evaluate2, "xpath.evaluate(\"./@type\", mediaFileNode)");
                if (evaluate2 != null) {
                    mediaFile.type = C7634n.m23762b(evaluate2).toString();
                    String evaluate3 = this.f34445a.evaluate("./text()", node2);
                    C7573i.m23582a((Object) evaluate3, "xpath.evaluate(\"./text()\", mediaFileNode)");
                    if (evaluate3 != null) {
                        mediaFile.url = C7634n.m23762b(evaluate3).toString();
                        XPath xPath2 = this.f34445a;
                        C7573i.m23582a((Object) xPath2, "xpath");
                        String evaluate4 = xPath2.evaluate("./@bitrate", node2);
                        C7573i.m23582a((Object) evaluate4, "evaluate(expr, item)");
                        if (evaluate4 != null) {
                            Integer d = C7634n.m23706d(C7634n.m23762b(evaluate4).toString());
                            if (d != null) {
                                mediaFile.bitRate = d.intValue();
                            }
                            XPath xPath3 = this.f34445a;
                            C7573i.m23582a((Object) xPath3, "xpath");
                            String evaluate5 = xPath3.evaluate("./@width", node2);
                            C7573i.m23582a((Object) evaluate5, "evaluate(expr, item)");
                            if (evaluate5 != null) {
                                Integer d2 = C7634n.m23706d(C7634n.m23762b(evaluate5).toString());
                                if (d2 != null) {
                                    mediaFile.width = d2.intValue();
                                }
                                XPath xPath4 = this.f34445a;
                                C7573i.m23582a((Object) xPath4, "xpath");
                                String evaluate6 = xPath4.evaluate("./@height", node2);
                                C7573i.m23582a((Object) evaluate6, "evaluate(expr, item)");
                                if (evaluate6 != null) {
                                    Integer d3 = C7634n.m23706d(C7634n.m23762b(evaluate6).toString());
                                    if (d3 != null) {
                                        mediaFile.height = d3.intValue();
                                    }
                                    XPath xPath5 = this.f34445a;
                                    C7573i.m23582a((Object) xPath5, "xpath");
                                    String evaluate7 = xPath5.evaluate("./@scalable", node2);
                                    C7573i.m23582a((Object) evaluate7, "evaluate(expr, item)");
                                    if (evaluate7 != null) {
                                        String obj = C7634n.m23762b(evaluate7).toString();
                                        if (obj.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            mediaFile.scalable = Boolean.valueOf(C7634n.m23717a("true", obj, true));
                                        }
                                        XPath xPath6 = this.f34445a;
                                        C7573i.m23582a((Object) xPath6, "xpath");
                                        String evaluate8 = xPath6.evaluate("./@maintainAspectRatio", node2);
                                        C7573i.m23582a((Object) evaluate8, "evaluate(expr, item)");
                                        if (evaluate8 != null) {
                                            String obj2 = C7634n.m23762b(evaluate8).toString();
                                            if (obj2.length() > 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                mediaFile.maintainAspectRatio = Boolean.valueOf(C7634n.m23717a("true", obj2, true));
                                            }
                                            creative.mediaFileList = C13008a.m37957a(creative.mediaFileList, mediaFile);
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: f */
    private final void m37997f(Node node, Creative creative) {
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) node, "./Linear/Icons/Icon").mo19416a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            Icon icon = new Icon();
            XPath xPath2 = this.f34445a;
            C7573i.m23582a((Object) xPath2, "xpath");
            String evaluate = xPath2.evaluate("./@width", node2);
            C7573i.m23582a((Object) evaluate, "evaluate(expr, item)");
            if (evaluate != null) {
                Integer d = C7634n.m23706d(C7634n.m23762b(evaluate).toString());
                if (d != null) {
                    icon.width = d.intValue();
                }
                XPath xPath3 = this.f34445a;
                C7573i.m23582a((Object) xPath3, "xpath");
                String evaluate2 = xPath3.evaluate("./@height", node2);
                C7573i.m23582a((Object) evaluate2, "evaluate(expr, item)");
                if (evaluate2 != null) {
                    Integer d2 = C7634n.m23706d(C7634n.m23762b(evaluate2).toString());
                    if (d2 != null) {
                        icon.width = d2.intValue();
                    }
                    icon.program = this.f34445a.evaluate("./@program", node2);
                    XPath xPath4 = this.f34445a;
                    C7573i.m23582a((Object) xPath4, "xpath");
                    C7604g a2 = C13009b.m37962a(xPath4, (Object) node2, "./StaticResource");
                    XPath xPath5 = this.f34445a;
                    C7573i.m23582a((Object) xPath5, "xpath");
                    icon.staticResource = C7605h.m23663g(C13009b.m37963a(a2, xPath5, true, true));
                    XPath xPath6 = this.f34445a;
                    C7573i.m23582a((Object) xPath6, "xpath");
                    C7604g a3 = C13009b.m37962a(xPath6, (Object) node2, "./HTMLResource");
                    XPath xPath7 = this.f34445a;
                    C7573i.m23582a((Object) xPath7, "xpath");
                    icon.htmlResource = (String) C7605h.m23658d(C13009b.m37963a(a3, xPath7, true, true));
                    XPath xPath8 = this.f34445a;
                    C7573i.m23582a((Object) xPath8, "xpath");
                    C7604g a4 = C13009b.m37962a(xPath8, (Object) node2, "./IFrameResource");
                    XPath xPath9 = this.f34445a;
                    C7573i.m23582a((Object) xPath9, "xpath");
                    icon.iFrameResource = (String) C7605h.m23658d(C13009b.m37963a(a4, xPath9, true, true));
                    XPath xPath10 = this.f34445a;
                    C7573i.m23582a((Object) xPath10, "xpath");
                    C7604g a5 = C13009b.m37962a(xPath10, (Object) node2, "./IconViewTracking");
                    XPath xPath11 = this.f34445a;
                    C7573i.m23582a((Object) xPath11, "xpath");
                    icon.viewTracking = C7605h.m23663g(C13009b.m37963a(a5, xPath11, true, true));
                    XPath xPath12 = this.f34445a;
                    C7573i.m23582a((Object) xPath12, "xpath");
                    Iterator a6 = C13009b.m37962a(xPath12, (Object) node2, "./IconClicks").mo19416a();
                    while (a6.hasNext()) {
                        icon.clickList = C13008a.m37957a(icon.clickList, mo31550a((Node) a6.next()));
                    }
                    creative.iconList = C13008a.m37957a(creative.iconList, icon);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public C13018d(Vast vast, C13016b bVar, C13017c cVar) {
        C7573i.m23587b(vast, "vast");
        this.f34447c = vast;
        this.f34448d = bVar;
        this.f34449e = cVar;
        this.f34445a = XPathFactory.newInstance().newXPath();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m37986a(Document document, int i, int i2) {
        int i3 = i - 1;
        m37982a(document);
        XPath xPath = this.f34445a;
        C7573i.m23582a((Object) xPath, "xpath");
        Iterator a = C13009b.m37962a(xPath, (Object) document, "/VAST/Ad/InLine").mo19416a();
        while (a.hasNext()) {
            Node node = (Node) a.next();
            m37988b(node);
            m37992d(node);
        }
        XPath xPath2 = this.f34445a;
        C7573i.m23582a((Object) xPath2, "xpath");
        Iterator a2 = C13009b.m37962a(xPath2, (Object) document, "/VAST/Ad/Wrapper").mo19416a();
        while (a2.hasNext()) {
            Node node2 = (Node) a2.next();
            m37990c(node2);
            m37992d(node2);
            if (!m37987a(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m37987a(Node node, int i, int i2) {
        if (i < 0) {
            C13017c cVar = this.f34449e;
            if (cVar != null) {
                XPath xPath = this.f34445a;
                C7573i.m23582a((Object) xPath, "xpath");
                C7604g a = C13009b.m37962a(xPath, (Object) node, "./VASTAdTagURI");
                XPath xPath2 = this.f34445a;
                C7573i.m23582a((Object) xPath2, "xpath");
                Iterator a2 = C13009b.m37963a(a, xPath2, true, true).mo19416a();
                while (a2.hasNext()) {
                    cVar.mo31547a((String) a2.next());
                }
            }
            return false;
        }
        XPath xPath3 = this.f34445a;
        C7573i.m23582a((Object) xPath3, "xpath");
        C7604g a3 = C13009b.m37962a(xPath3, (Object) node, "./VASTAdTagURI");
        XPath xPath4 = this.f34445a;
        C7573i.m23582a((Object) xPath4, "xpath");
        Iterator a4 = C13009b.m37963a(a3, xPath4, true, true).mo19416a();
        boolean z = false;
        while (a4.hasNext()) {
            String str = (String) a4.next();
            C13017c cVar2 = this.f34449e;
            if (cVar2 != null) {
                cVar2.mo31548a(str, i);
            }
            Document document = null;
            try {
                C13016b bVar = this.f34448d;
                if (bVar == null) {
                    bVar = C13007a.f34437a;
                }
                document = bVar.mo31542a(str);
            } catch (FetchException e) {
                C13017c cVar3 = this.f34449e;
                if (cVar3 != null) {
                    cVar3.mo31545a(e);
                }
            } catch (ParseException e2) {
                C13017c cVar4 = this.f34449e;
                if (cVar4 != null) {
                    cVar4.mo31546a(e2);
                }
            } catch (Throwable th) {
                C13017c cVar5 = this.f34449e;
                if (cVar5 != null) {
                    cVar5.mo31544a(i);
                }
                throw th;
            }
            if (document == null) {
                C13017c cVar6 = this.f34449e;
                if (cVar6 != null) {
                    cVar6.mo31544a(i);
                }
                return false;
            } else if (!m37986a(document, i, i2 + 1)) {
                C13017c cVar7 = this.f34449e;
                if (cVar7 != null) {
                    cVar7.mo31544a(i);
                }
                return false;
            } else {
                C13017c cVar8 = this.f34449e;
                if (cVar8 != null) {
                    cVar8.mo31544a(i);
                }
                z = true;
            }
        }
        if (!z) {
            C13017c cVar9 = this.f34449e;
            if (cVar9 != null) {
                cVar9.mo31546a(new ParseException("VASTAdTagURI missing"));
            }
        }
        return z;
    }

    private /* synthetic */ C13018d(Vast vast, C13016b bVar, C13017c cVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        this(vast, bVar, null);
    }
}
