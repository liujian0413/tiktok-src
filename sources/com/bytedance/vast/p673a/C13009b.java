package com.bytedance.vast.p673a;

import com.bytedance.vast.exception.FetchException;
import com.bytedance.vast.exception.ParseException;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1884io.C47973b;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C48038d;
import kotlin.text.C7634n;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* renamed from: com.bytedance.vast.a.b */
public final class C13009b {

    /* renamed from: com.bytedance.vast.a.b$a */
    static final class C13010a extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        public static final C13010a f34438a = new C13010a();

        C13010a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m37968a((String) obj);
        }

        /* renamed from: a */
        private static String m37968a(String str) {
            C7573i.m23582a((Object) str, "it");
            if (str != null) {
                return C7634n.m23762b(str).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.bytedance.vast.a.b$b */
    static final class C13011b extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C13011b f34439a = new C13011b();

        C13011b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m37969a((String) obj));
        }

        /* renamed from: a */
        private static boolean m37969a(String str) {
            C7573i.m23582a((Object) str, "it");
            if (str.length() > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.vast.a.b$c */
    static final class C13012c extends Lambda implements C7562b<Node, String> {

        /* renamed from: a */
        final /* synthetic */ XPath f34440a;

        C13012c(XPath xPath) {
            this.f34440a = xPath;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke(Node node) {
            C7573i.m23587b(node, "it");
            return this.f34440a.evaluate("./text()", node);
        }
    }

    /* renamed from: com.bytedance.vast.a.b$d */
    static final class C13013d extends Lambda implements C7562b<String, C7604g<? extends Node>> {

        /* renamed from: a */
        final /* synthetic */ XPath f34441a;

        /* renamed from: b */
        final /* synthetic */ Object f34442b;

        C13013d(XPath xPath, Object obj) {
            this.f34441a = xPath;
            this.f34442b = obj;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7604g<Node> invoke(String str) {
            C7573i.m23587b(str, "expr");
            Object evaluate = this.f34441a.evaluate(str, this.f34442b, XPathConstants.NODESET);
            if (!(evaluate instanceof NodeList)) {
                evaluate = null;
            }
            final NodeList nodeList = (NodeList) evaluate;
            if (nodeList == null) {
                return C7605h.m23635a();
            }
            return C7605h.m23659d(C7525m.m23526p(C7551d.m23565b(0, nodeList.getLength())), new C7562b<Integer, Node>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    return m37972a(((Number) obj).intValue());
                }

                /* renamed from: a */
                private Node m37972a(int i) {
                    return nodeList.item(i);
                }
            });
        }
    }

    /* renamed from: b */
    public static final Document m37967b(String str) throws ParseException {
        Closeable byteArrayInputStream;
        C7573i.m23587b(str, "$this$contentToDoc");
        try {
            byte[] bytes = str.getBytes(C48038d.f122880a);
            C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
            C47973b.m148917a(byteArrayInputStream, null);
            return parse;
        } catch (Throwable th) {
            throw new ParseException(th);
        }
    }

    /* renamed from: a */
    public static final Document m37965a(String str) throws FetchException, ParseException {
        C7573i.m23587b(str, "$this$uriToDoc");
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
        } catch (SAXException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            throw new FetchException(str, th);
        }
    }

    /* renamed from: a */
    public static final C7604g<Node> m37961a(XPath xPath, Object obj, C7604g<String> gVar) {
        C7573i.m23587b(xPath, "$this$nodeList");
        C7573i.m23587b(obj, "item");
        C7573i.m23587b(gVar, "exprList");
        return C7605h.m23657c(gVar, new C13013d(xPath, obj));
    }

    /* renamed from: a */
    public static final String m37960a(XPath xPath, Object obj, String str) {
        C7573i.m23587b(xPath, "$this$firstString");
        C7573i.m23587b(obj, "item");
        C7573i.m23587b(str, "expr");
        return (String) C7605h.m23658d(m37963a(m37962a(xPath, obj, str), xPath, true, true));
    }

    /* renamed from: b */
    public static final String m37966b(XPath xPath, Object obj, C7604g<String> gVar) {
        C7573i.m23587b(xPath, "$this$firstString");
        C7573i.m23587b(obj, "item");
        C7573i.m23587b(gVar, "expr");
        return (String) C7605h.m23658d(m37963a(m37961a(xPath, obj, gVar), xPath, true, true));
    }

    /* renamed from: a */
    public static final C7604g<Node> m37962a(XPath xPath, Object obj, String... strArr) {
        C7573i.m23587b(xPath, "$this$nodeList");
        C7573i.m23587b(obj, "item");
        C7573i.m23587b(strArr, "exprList");
        return m37961a(xPath, obj, C7519g.m23455i(strArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C7604g<String> m37963a(C7604g<? extends Node> gVar, XPath xPath, boolean z, boolean z2) {
        C7573i.m23587b(gVar, "$this$mapText");
        C7573i.m23587b(xPath, "xpath");
        C7604g<String> d = C7605h.m23659d(gVar, new C13012c(xPath));
        if (z) {
            d = C7605h.m23659d(d, C13010a.f34438a);
        }
        if (z2) {
            return C7605h.m23653a(d, (C7562b<? super T, Boolean>) C13011b.f34439a);
        }
        return d;
    }
}
