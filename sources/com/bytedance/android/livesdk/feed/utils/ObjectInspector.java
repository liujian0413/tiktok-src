package com.bytedance.android.livesdk.feed.utils;

import com.facebook.appevents.C13192m;
import com.google.gson.p276a.C6593c;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7631j;
import kotlin.text.C7634n;
import kotlin.text.Regex;

public final class ObjectInspector {

    /* renamed from: b */
    public static final C7783a f21009b = new C7783a(null);

    /* renamed from: a */
    public final Object f21010a;

    public static final class DslParser {

        /* renamed from: b */
        public static final C7778a f21011b = new C7778a(null);

        /* renamed from: a */
        public final List<Segment> f21012a;

        public static final class Segment {

            /* renamed from: a */
            public final Type f21013a;

            /* renamed from: b */
            public final String f21014b;

            public enum Type {
                FIELD,
                COMPONENT
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f21014b, (java.lang.Object) r3.f21014b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Segment
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Segment r3 = (com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Segment) r3
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Segment$Type r0 = r2.f21013a
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Segment$Type r1 = r3.f21013a
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.String r0 = r2.f21014b
                    java.lang.String r3 = r3.f21014b
                    boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Segment.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Type type = this.f21013a;
                int i = 0;
                int hashCode = (type != null ? type.hashCode() : 0) * 31;
                String str = this.f21014b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Segment(type=");
                sb.append(this.f21013a);
                sb.append(", name=");
                sb.append(this.f21014b);
                sb.append(")");
                return sb.toString();
            }

            public Segment(Type type, String str) {
                C7573i.m23587b(type, "type");
                C7573i.m23587b(str, "name");
                this.f21013a = type;
                this.f21014b = str;
            }
        }

        public static final class Token {

            /* renamed from: a */
            public final Type f21015a;

            /* renamed from: b */
            public final String f21016b;

            public enum Type {
                SLASH,
                DOT,
                IDENTIFIER
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f21016b, (java.lang.Object) r3.f21016b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Token
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Token r3 = (com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Token) r3
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Token$Type r0 = r2.f21015a
                    com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$Token$Type r1 = r3.f21015a
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.String r0 = r2.f21016b
                    java.lang.String r3 = r3.f21016b
                    boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Token.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Type type = this.f21015a;
                int i = 0;
                int hashCode = (type != null ? type.hashCode() : 0) * 31;
                String str = this.f21016b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Token(type=");
                sb.append(this.f21015a);
                sb.append(", arg=");
                sb.append(this.f21016b);
                sb.append(")");
                return sb.toString();
            }

            public Token(Type type, String str) {
                C7573i.m23587b(type, "type");
                this.f21015a = type;
                this.f21016b = str;
            }

            public /* synthetic */ Token(Type type, String str, int i, C7571f fVar) {
                this(type, null);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$a */
        public static final class C7778a {

            /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$a$a */
            static final class C7779a extends Lambda implements C7561a<Character> {

                /* renamed from: a */
                final /* synthetic */ String f21017a;

                /* renamed from: b */
                final /* synthetic */ IntRef f21018b;

                C7779a(String str, IntRef intRef) {
                    this.f21017a = str;
                    this.f21018b = intRef;
                    super(0);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Character invoke() {
                    if (this.f21018b.element + 1 < this.f21017a.length()) {
                        return Character.valueOf(this.f21017a.charAt(this.f21018b.element + 1));
                    }
                    return null;
                }
            }

            /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$a$b */
            static final class C7780b extends Lambda implements C7562b<Character, Character> {

                /* renamed from: a */
                final /* synthetic */ C7561a f21019a;

                C7780b(C7561a aVar) {
                    this.f21019a = aVar;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return m23906a(((Character) obj).charValue());
                }

                /* renamed from: a */
                private Character m23906a(char c) {
                    Character ch = (Character) this.f21019a.invoke();
                    if (ch != null && ch.charValue() == c) {
                        return Character.valueOf(c);
                    }
                    return null;
                }
            }

            /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$a$c */
            static final class C7781c extends Lambda implements C7561a<C7581n> {

                /* renamed from: a */
                final /* synthetic */ IntRef f21020a;

                /* renamed from: b */
                final /* synthetic */ IntRef f21021b;

                /* renamed from: c */
                final /* synthetic */ String f21022c;

                /* renamed from: d */
                final /* synthetic */ List f21023d;

                /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$DslParser$a$c$a */
                static final class C7782a extends Lambda implements C7562b<C7631j, String> {

                    /* renamed from: a */
                    public static final C7782a f21024a = new C7782a();

                    C7782a() {
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        return m23908a((C7631j) obj);
                    }

                    /* renamed from: a */
                    private static String m23908a(C7631j jVar) {
                        C7573i.m23587b(jVar, "it");
                        return String.valueOf(C7634n.m23788i(jVar.mo19511b()));
                    }
                }

                C7781c(IntRef intRef, IntRef intRef2, String str, List list) {
                    this.f21020a = intRef;
                    this.f21021b = intRef2;
                    this.f21022c = str;
                    this.f21023d = list;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    m23907a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m23907a() {
                    if (this.f21020a.element > this.f21021b.element) {
                        String str = this.f21022c;
                        int i = this.f21021b.element;
                        int i2 = this.f21020a.element;
                        if (str != null) {
                            String substring = str.substring(i, i2);
                            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            this.f21023d.add(new Token(Type.IDENTIFIER, new Regex("//|\\.\\.").replace((CharSequence) substring, (C7562b<? super C7631j, ? extends CharSequence>) C7782a.f21024a)));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    this.f21021b.element = this.f21020a.element + 1;
                }
            }

            private C7778a() {
            }

            public /* synthetic */ C7778a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static List<Segment> m23903a(List<Token> list) {
                Segment segment;
                C7573i.m23587b(list, "list");
                List<Segment> arrayList = new ArrayList<>();
                Type type = Type.SLASH;
                for (Token token : list) {
                    switch (C7803h.f21057b[token.f21015a.ordinal()]) {
                        case 1:
                        case 2:
                            type = token.f21015a;
                            break;
                        case 3:
                            Collection collection = arrayList;
                            switch (C7803h.f21056a[type.ordinal()]) {
                                case 1:
                                    Type type2 = Type.COMPONENT;
                                    String str = token.f21016b;
                                    if (str == null) {
                                        C7573i.m23580a();
                                    }
                                    segment = new Segment(type2, str);
                                    break;
                                case 2:
                                    Type type3 = Type.FIELD;
                                    String str2 = token.f21016b;
                                    if (str2 == null) {
                                        C7573i.m23580a();
                                    }
                                    segment = new Segment(type3, str2);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder("unexpected member type ");
                                    sb.append(token.f21015a);
                                    throw new IllegalStateException(sb.toString());
                            }
                            collection.add(segment);
                            break;
                    }
                }
                return arrayList;
            }

            /* renamed from: a */
            public final List<Token> mo20465a(String str) {
                C7573i.m23587b(str, "objPath");
                List<Token> arrayList = new ArrayList<>();
                IntRef intRef = new IntRef();
                intRef.element = 0;
                IntRef intRef2 = new IntRef();
                intRef2.element = 0;
                C7561a cVar = new C7781c(intRef, intRef2, str, arrayList);
                C7562b bVar = new C7780b(new C7779a(str, intRef));
                while (intRef.element < str.length()) {
                    switch (str.charAt(intRef.element)) {
                        case '.':
                            Character ch = (Character) bVar.invoke(Character.valueOf('.'));
                            if (ch == null) {
                                cVar.invoke();
                                arrayList.add(new Token(Type.DOT, null, 2, null));
                                break;
                            } else {
                                ch.charValue();
                                intRef.element++;
                                break;
                            }
                        case '/':
                            Character ch2 = (Character) bVar.invoke(Character.valueOf('/'));
                            if (ch2 == null) {
                                cVar.invoke();
                                arrayList.add(new Token(Type.SLASH, null, 2, null));
                                break;
                            } else {
                                ch2.charValue();
                                intRef.element++;
                                break;
                            }
                    }
                    intRef.element++;
                }
                cVar.invoke();
                return arrayList;
            }
        }

        public DslParser(String str) {
            C7573i.m23587b(str, "path");
            this.f21012a = C7778a.m23903a(f21011b.mo20465a(str));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.utils.ObjectInspector$a */
    public static final class C7783a {
        private C7783a() {
        }

        public /* synthetic */ C7783a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m23909a(Object obj) {
            String str;
            if (obj == null) {
                return "(null value)";
            }
            Class cls = obj.getClass();
            if (!cls.isArray()) {
                return obj.toString();
            }
            int length = Array.getLength(obj);
            StringBuilder sb = new StringBuilder();
            Class componentType = cls.getComponentType();
            if (componentType != null) {
                str = componentType.getSimpleName();
            } else {
                str = null;
            }
            StringBuilder sb2 = new StringBuilder("(array ");
            sb2.append(str);
            sb2.append('[');
            sb2.append(length);
            sb2.append("]: ");
            sb.append(sb2.toString());
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(Array.get(obj, i));
            }
            sb.append(")");
            String sb3 = sb.toString();
            C7573i.m23582a((Object) sb3, "sb.toString()");
            return sb3;
        }
    }

    public ObjectInspector(Object obj) {
        this.f21010a = obj;
    }

    /* renamed from: a */
    public final Object mo20458a(List<Segment> list) {
        C7573i.m23587b(list, "segments");
        Object obj = this.f21010a;
        String str = null;
        try {
            for (Segment segment : list) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder("(object is null: ");
                    sb.append(segment.f21014b);
                    sb.append(')');
                    return sb.toString();
                }
                String str2 = segment.f21014b;
                try {
                    switch (C7804i.f21058a[segment.f21013a.ordinal()]) {
                        case 1:
                            obj = m23901d(obj, segment.f21014b);
                            break;
                        case 2:
                            obj = m23898a(obj, segment.f21014b);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String str3 = str2;
                } catch (NoSuchFieldException unused) {
                    str = str2;
                    StringBuilder sb2 = new StringBuilder("(no such field: ");
                    sb2.append(str);
                    sb2.append(')');
                    return sb2.toString();
                }
            }
            return obj;
        } catch (NoSuchFieldException unused2) {
            StringBuilder sb22 = new StringBuilder("(no such field: ");
            sb22.append(str);
            sb22.append(')');
            return sb22.toString();
        }
    }

    /* renamed from: a */
    private final Object m23898a(Object obj, String str) {
        Object c = m23900c(obj, str);
        if (c == null) {
            c = m23899b(obj, str);
        }
        if (c == null) {
            return m23901d(obj, str);
        }
        return c;
    }

    /* renamed from: c */
    private static Object m23900c(Object obj, String str) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
            C7573i.m23582a((Object) declaredMethod, C13192m.f34940a);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m23901d(Object obj, String str) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        C7573i.m23582a((Object) declaredField, "f");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: b */
    private static Object m23899b(Object obj, String str) {
        Field field;
        Object obj2;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        C7573i.m23582a((Object) declaredFields, "cls.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            C6593c cVar = (C6593c) field.getAnnotation(C6593c.class);
            if (cVar != null) {
                obj2 = cVar.mo15949a();
            } else {
                obj2 = null;
            }
            if (C7573i.m23585a(obj2, (Object) str)) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.setAccessible(true);
        }
        if (field != null) {
            return field.get(obj);
        }
        return null;
    }
}
