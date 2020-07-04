package com.p280ss.android.ugc.aweme.image;

import com.bytedance.lighten.core.p610a.C12092a;
import com.bytedance.lighten.core.p610a.C12093b;
import com.bytedance.lighten.core.p610a.C12094c;
import com.bytedance.lighten.core.p610a.C12094c.C12095a;
import com.p280ss.android.ugc.aweme.base.C23355m;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.image.g */
public final class C32038g extends C12095a {

    /* renamed from: com.ss.android.ugc.aweme.image.g$a */
    public static final class C32039a implements C12094c<C12093b, C12092a> {

        /* renamed from: b */
        public static final C32039a f83808b = new C32039a();

        /* renamed from: c */
        public static final C32040a f83809c = new C32040a(null);

        /* renamed from: a */
        public final String f83810a = "ImageUrlModelConverter";

        /* renamed from: d */
        private final boolean f83811d = C7163a.m22363a();

        /* renamed from: e */
        private Pattern f83812e;

        /* renamed from: f */
        private String f83813f;

        /* renamed from: g */
        private boolean f83814g;

        /* renamed from: h */
        private boolean f83815h = true;

        /* renamed from: com.ss.android.ugc.aweme.image.g$a$a */
        public static final class C32040a {
            private C32040a() {
            }

            /* renamed from: a */
            public static C32039a m104046a() {
                return C32039a.f83808b;
            }

            public /* synthetic */ C32040a(C7571f fVar) {
                this();
            }
        }

        public C32039a() {
            m104043a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[Catch:{ Throwable -> 0x0073 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0066 A[Catch:{ Throwable -> 0x0073 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0067 A[Catch:{ Throwable -> 0x0073 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.regex.Pattern m104043a() {
            /*
                r7 = this;
                java.util.regex.Pattern r0 = r7.f83812e
                if (r0 == 0) goto L_0x0007
                java.util.regex.Pattern r0 = r7.f83812e
                return r0
            L_0x0007:
                r0 = 0
                com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Throwable -> 0x0073 }
                java.lang.Class<com.ss.android.ugc.aweme.image.experiment.ImageCropConfigExperiment> r2 = com.p280ss.android.ugc.aweme.image.experiment.ImageCropConfigExperiment.class
                r3 = 1
                java.lang.String r4 = "image_crop_config_v3"
                com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Throwable -> 0x0073 }
                com.bytedance.ies.abmock.ABModel r5 = r5.mo15295d()     // Catch:{ Throwable -> 0x0073 }
                com.ss.android.ugc.aweme.image.experiment.a r5 = r5.image_crop_config_v3     // Catch:{ Throwable -> 0x0073 }
                java.lang.Class<com.ss.android.ugc.aweme.image.experiment.a> r6 = com.p280ss.android.ugc.aweme.image.experiment.C7107a.class
                java.lang.Object r1 = r1.mo15290a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0073 }
                com.ss.android.ugc.aweme.image.experiment.a r1 = (com.p280ss.android.ugc.aweme.image.experiment.C7107a) r1     // Catch:{ Throwable -> 0x0073 }
                if (r1 == 0) goto L_0x0028
                int r2 = r1.f19971c     // Catch:{ Throwable -> 0x0073 }
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                r3 = 0
                if (r1 == 0) goto L_0x002f
                java.lang.String r4 = r1.f19969a     // Catch:{ Throwable -> 0x0073 }
                goto L_0x0030
            L_0x002f:
                r4 = r3
            L_0x0030:
                if (r1 == 0) goto L_0x0035
                java.lang.String r1 = r1.f19970b     // Catch:{ Throwable -> 0x0073 }
                goto L_0x0036
            L_0x0035:
                r1 = r3
            L_0x0036:
                r7.f83813f = r1     // Catch:{ Throwable -> 0x0073 }
                r1 = 1
                if (r2 == 0) goto L_0x003d
                r5 = 1
                goto L_0x003e
            L_0x003d:
                r5 = 0
            L_0x003e:
                r7.f83815h = r5     // Catch:{ Throwable -> 0x0073 }
                r5 = 2
                if (r2 != r5) goto L_0x0070
                r2 = r4
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Throwable -> 0x0073 }
                if (r2 == 0) goto L_0x0051
                int r2 = r2.length()     // Catch:{ Throwable -> 0x0073 }
                if (r2 != 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r2 = 0
                goto L_0x0052
            L_0x0051:
                r2 = 1
            L_0x0052:
                if (r2 != 0) goto L_0x0070
                java.lang.String r2 = r7.f83813f     // Catch:{ Throwable -> 0x0073 }
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Throwable -> 0x0073 }
                if (r2 == 0) goto L_0x0063
                int r2 = r2.length()     // Catch:{ Throwable -> 0x0073 }
                if (r2 != 0) goto L_0x0061
                goto L_0x0063
            L_0x0061:
                r2 = 0
                goto L_0x0064
            L_0x0063:
                r2 = 1
            L_0x0064:
                if (r2 == 0) goto L_0x0067
                goto L_0x0070
            L_0x0067:
                r7.f83814g = r1     // Catch:{ Throwable -> 0x0073 }
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r4)     // Catch:{ Throwable -> 0x0073 }
                r7.f83812e = r1     // Catch:{ Throwable -> 0x0073 }
                goto L_0x0075
            L_0x0070:
                r7.f83814g = r0     // Catch:{ Throwable -> 0x0073 }
                return r3
            L_0x0073:
                r7.f83815h = r0
            L_0x0075:
                java.util.regex.Pattern r0 = r7.f83812e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32038g.C32039a.m104043a():java.util.regex.Pattern");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C12092a mo29785a(C12093b bVar) {
            C7573i.m23587b(bVar, "value");
            C12092a aVar = bVar.f32194a;
            if (aVar instanceof C23355m) {
                aVar = m104042a((C23355m) aVar, bVar.f32195b, bVar.f32196c);
            }
            C7573i.m23582a((Object) aVar, "urlModel");
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.bytedance.lighten.core.p610a.C12092a m104042a(com.p280ss.android.ugc.aweme.base.C23355m r16, int r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r1 = r16
                java.lang.String r2 = "imageUrlModel"
                kotlin.jvm.internal.C7573i.m23587b(r1, r2)
                boolean r2 = r0.f83815h
                if (r2 != 0) goto L_0x000f
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x000f:
                r2 = 3
                r3 = 0
                r4 = 1
                r5 = 2
                r6 = 0
                if (r17 <= 0) goto L_0x01f0
                if (r18 > 0) goto L_0x001a
                goto L_0x01f0
            L_0x001a:
                boolean r8 = r0.f83814g
                if (r8 != 0) goto L_0x004f
                m104044a(r1, r6, r6, r6)
                boolean r7 = r0.f83811d
                if (r7 == 0) goto L_0x004c
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f83810a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = r1.f61443b
                r4.append(r7)
                java.lang.String r7 = " not open, return "
                r4.append(r7)
                java.util.List<java.lang.String> r7 = r1.f32193a
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x004c:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x004f:
                java.lang.String r8 = r1.f61443b
                r9 = r8
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                if (r9 == 0) goto L_0x005f
                int r9 = r9.length()
                if (r9 != 0) goto L_0x005d
                goto L_0x005f
            L_0x005d:
                r9 = 0
                goto L_0x0060
            L_0x005f:
                r9 = 1
            L_0x0060:
                if (r9 == 0) goto L_0x0088
                boolean r7 = r0.f83811d
                if (r7 == 0) goto L_0x0085
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f83810a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r7 = "no uri error, return "
                r4.<init>(r7)
                java.util.List<java.lang.String> r7 = r1.f32193a
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x0085:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x0088:
                java.lang.String r9 = "large/"
                boolean r9 = kotlin.text.C7634n.m23721b(r8, r9, false)
                if (r9 == 0) goto L_0x009b
                java.lang.String r9 = "large/"
                java.lang.String r10 = ""
                r11 = 0
                r12 = 4
                r13 = 0
                java.lang.String r8 = kotlin.text.C7634n.m23719b(r8, r9, r10, false)
            L_0x009b:
                java.util.List<java.lang.String> r9 = r1.f32193a
                r10 = r9
                java.util.Collection r10 = (java.util.Collection) r10
                if (r10 == 0) goto L_0x00ab
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x00a9
                goto L_0x00ab
            L_0x00a9:
                r10 = 0
                goto L_0x00ac
            L_0x00ab:
                r10 = 1
            L_0x00ac:
                if (r10 == 0) goto L_0x00d4
                boolean r7 = r0.f83811d
                if (r7 == 0) goto L_0x00d1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f83810a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r7 = "empty image list error, return "
                r4.<init>(r7)
                java.util.List<java.lang.String> r7 = r1.f32193a
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x00d1:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x00d4:
                java.util.regex.Pattern r10 = r15.m104043a()
                if (r10 == 0) goto L_0x00e8
                r11 = r8
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.util.regex.Matcher r10 = r10.matcher(r11)
                if (r10 == 0) goto L_0x00e8
                boolean r10 = r10.matches()
                goto L_0x00e9
            L_0x00e8:
                r10 = 0
            L_0x00e9:
                if (r10 != 0) goto L_0x011a
                m104044a(r1, r4, r4, r6)
                boolean r7 = r0.f83811d
                if (r7 == 0) goto L_0x0117
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r7 = r0.f83810a
                r2[r6] = r7
                java.lang.String r7 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n"
                r2[r4] = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r8)
                java.lang.String r7 = " not match error, return "
                r4.append(r7)
                java.util.List<java.lang.String> r7 = r1.f32193a
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r2[r5] = r4
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x0117:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x011a:
                java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
                r10.<init>()
                r11 = r9
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x0126:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x01b6
                java.lang.Object r12 = r11.next()
                java.lang.String r12 = (java.lang.String) r12
                android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x01a9 }
                java.util.Locale r13 = java.util.Locale.US     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r14 = "Locale.US"
                kotlin.jvm.internal.C7573i.m23582a(r13, r14)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r14 = r0.f83813f     // Catch:{ Exception -> 0x01a9 }
                if (r14 != 0) goto L_0x0144
                kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x01a9 }
            L_0x0144:
                r3 = 5
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r3 = "imageUri"
                kotlin.jvm.internal.C7573i.m23582a(r12, r3)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r3 = r12.getScheme()     // Catch:{ Exception -> 0x01a9 }
                r2[r6] = r3     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r3 = r12.getHost()     // Catch:{ Exception -> 0x01a9 }
                r2[r4] = r3     // Catch:{ Exception -> 0x01a9 }
                r2[r5] = r8     // Catch:{ Exception -> 0x01a9 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01a9 }
                r12 = 3
                r2[r12] = r3     // Catch:{ Exception -> 0x01a9 }
                r3 = 4
                java.lang.Integer r12 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x01a9 }
                r2[r3] = r12     // Catch:{ Exception -> 0x01a9 }
                r3 = 5
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r2 = com.C1642a.m8035a(r13, r14, r2)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r3 = "java.lang.String.format(locale, format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x01a9 }
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r12 = "?"
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x01a9 }
                r13 = 0
                boolean r3 = kotlin.text.C7634n.m23776c(r3, r12, false)     // Catch:{ Exception -> 0x01a9 }
                if (r3 == 0) goto L_0x0196
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a9 }
                r3.<init>()     // Catch:{ Exception -> 0x01a9 }
                r3.append(r2)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r2 = "&ilog=shrink"
                r3.append(r2)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01a9 }
                goto L_0x01a7
            L_0x0196:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a9 }
                r3.<init>()     // Catch:{ Exception -> 0x01a9 }
                r3.append(r2)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r2 = "?ilog=shrink"
                r3.append(r2)     // Catch:{ Exception -> 0x01a9 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01a9 }
            L_0x01a7:
                r3 = r2
                goto L_0x01aa
            L_0x01a9:
                r3 = 0
            L_0x01aa:
                if (r3 == 0) goto L_0x01b2
                r2 = r10
                java.util.Collection r2 = (java.util.Collection) r2
                r2.add(r3)
            L_0x01b2:
                r2 = 3
                r3 = 0
                goto L_0x0126
            L_0x01b6:
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r2 = r10.isEmpty()
                r2 = r2 ^ r4
                if (r2 == 0) goto L_0x01c2
                r9.addAll(r6, r10)
            L_0x01c2:
                boolean r2 = r0.f83811d
                if (r2 == 0) goto L_0x01ed
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r0.f83810a
                r2[r6] = r3
                java.lang.String r3 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:67)\n"
                r2[r4] = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r8)
                java.lang.String r4 = " match, return "
                r3.append(r4)
                java.util.List<java.lang.String> r4 = r1.f32193a
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2[r5] = r3
                r3 = 0
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x01ed:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            L_0x01f0:
                boolean r2 = r0.f83811d
                if (r2 == 0) goto L_0x021d
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r0.f83810a
                r2[r6] = r3
                java.lang.String r3 = "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n"
                r2[r4] = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r1.f61443b
                r3.append(r4)
                java.lang.String r4 = " no size error, return "
                r3.append(r4)
                java.util.List<java.lang.String> r4 = r1.f32193a
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2[r5] = r3
                r3 = 0
                com.p280ss.android.ugc.aweme.utils.C43088ec.m136690a(r2, false)
            L_0x021d:
                com.bytedance.lighten.core.a.a r1 = (com.bytedance.lighten.core.p610a.C12092a) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32038g.C32039a.m104042a(com.ss.android.ugc.aweme.base.m, int, int):com.bytedance.lighten.core.a.a");
        }

        /* renamed from: a */
        private static void m104044a(C23355m mVar, boolean z, boolean z2, boolean z3) {
            String str;
            String str2;
            C7573i.m23587b(mVar, "imageUrlModel");
            if (!z || !z2) {
                str = "ilog=not_shrink";
            } else {
                str = "ilog=not_shrink_test";
            }
            List<String> list = mVar.f32193a;
            List<String> list2 = null;
            if (list != null) {
                Iterable<String> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (String str3 : iterable) {
                    C7573i.m23582a((Object) str3, "imageUrl");
                    if (C7634n.m23776c((CharSequence) str3, (CharSequence) "?", false)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append('&');
                        sb.append(str);
                        str2 = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append('?');
                        sb2.append(str);
                        str2 = sb2.toString();
                    }
                    arrayList.add(str2);
                }
                list2 = (List) arrayList;
            }
            mVar.f32193a = list2;
        }
    }

    /* renamed from: a */
    public final C12094c<C12093b, C12092a> mo29786a() {
        return C32040a.m104046a();
    }
}
