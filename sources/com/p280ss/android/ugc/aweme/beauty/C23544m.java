package com.p280ss.android.ugc.aweme.beauty;

import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.m */
public final class C23544m {

    /* renamed from: a */
    public static final C23544m f62137a = new C23544m();

    /* renamed from: b */
    private static ArrayList<UlikeBeautyData> f62138b = new ArrayList<>();

    private C23544m() {
    }

    /* renamed from: a */
    public static void m77320a(ArrayList<UlikeBeautyData> arrayList) {
        f62138b = arrayList;
    }

    /* renamed from: a */
    public static void m77319a(ComposerBeautyExtra composerBeautyExtra) {
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (composerBeautyExtra != null) {
            str = composerBeautyExtra.getResourceType();
        } else {
            str = null;
        }
        if (str != null) {
            float f10 = -1.0f;
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        String gender = composerBeautyExtra.getGender();
                        Float skinDefault = composerBeautyExtra.getSkinDefault();
                        if (skinDefault != null) {
                            f = skinDefault.floatValue();
                        } else {
                            f = -1.0f;
                        }
                        C23533d.m77292a(0, gender, f);
                        String gender2 = composerBeautyExtra.getGender();
                        Float skinMax = composerBeautyExtra.getSkinMax();
                        if (skinMax != null) {
                            f2 = skinMax.floatValue();
                        } else {
                            f2 = -1.0f;
                        }
                        C23533d.m77294b(0, gender2, f2);
                        String gender3 = composerBeautyExtra.getGender();
                        Float sharpDefault = composerBeautyExtra.getSharpDefault();
                        if (sharpDefault != null) {
                            f3 = sharpDefault.floatValue();
                        } else {
                            f3 = -1.0f;
                        }
                        C23533d.m77292a(5, gender3, f3);
                        String gender4 = composerBeautyExtra.getGender();
                        Float sharpMax = composerBeautyExtra.getSharpMax();
                        if (sharpMax != null) {
                            f10 = sharpMax.floatValue();
                        }
                        C23533d.m77294b(5, gender4, f10);
                        return;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        String gender5 = composerBeautyExtra.getGender();
                        Float eyeDefault = composerBeautyExtra.getEyeDefault();
                        if (eyeDefault != null) {
                            f4 = eyeDefault.floatValue();
                        } else {
                            f4 = -1.0f;
                        }
                        C23533d.m77292a(2, gender5, f4);
                        String gender6 = composerBeautyExtra.getGender();
                        Float eyeMax = composerBeautyExtra.getEyeMax();
                        if (eyeMax != null) {
                            f5 = eyeMax.floatValue();
                        } else {
                            f5 = -1.0f;
                        }
                        C23533d.m77294b(2, gender6, f5);
                        String gender7 = composerBeautyExtra.getGender();
                        Float faceDefault = composerBeautyExtra.getFaceDefault();
                        if (faceDefault != null) {
                            f6 = faceDefault.floatValue();
                        } else {
                            f6 = -1.0f;
                        }
                        C23533d.m77292a(1, gender7, f6);
                        String gender8 = composerBeautyExtra.getGender();
                        Float faceMax = composerBeautyExtra.getFaceMax();
                        if (faceMax != null) {
                            f10 = faceMax.floatValue();
                        }
                        C23533d.m77294b(1, gender8, f10);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        String gender9 = composerBeautyExtra.getGender();
                        Float lipstickDefault = composerBeautyExtra.getLipstickDefault();
                        if (lipstickDefault != null) {
                            f7 = lipstickDefault.floatValue();
                        } else {
                            f7 = -1.0f;
                        }
                        C23533d.m77292a(3, gender9, f7);
                        String gender10 = composerBeautyExtra.getGender();
                        Float lipstickMax = composerBeautyExtra.getLipstickMax();
                        if (lipstickMax != null) {
                            f8 = lipstickMax.floatValue();
                        } else {
                            f8 = -1.0f;
                        }
                        C23533d.m77294b(3, gender10, f8);
                        String gender11 = composerBeautyExtra.getGender();
                        Float blushDefault = composerBeautyExtra.getBlushDefault();
                        if (blushDefault != null) {
                            f9 = blushDefault.floatValue();
                        } else {
                            f9 = -1.0f;
                        }
                        C23533d.m77292a(4, gender11, f9);
                        String gender12 = composerBeautyExtra.getGender();
                        Float blushMax = composerBeautyExtra.getBlushMax();
                        if (blushMax != null) {
                            f10 = blushMax.floatValue();
                        }
                        C23533d.m77294b(4, gender12, f10);
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0100 A[EDGE_INSN: B:83:0x0100->B:49:0x0100 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0132 A[EDGE_INSN: B:87:0x0132->B:65:0x0132 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData> m77323b(java.util.ArrayList<com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData> r10) {
        /*
            java.lang.String r0 = "dataList"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.port.in.n r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.property.AVAB r1 = r1.mo70096k()
            com.ss.android.ugc.aweme.property.AVAB$Property r2 = com.p280ss.android.ugc.aweme.property.AVAB.Property.UlikeBeautyAbGroup
            int r1 = r1.mo93306b(r2)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r10 = r10.iterator()
        L_0x0025:
            boolean r3 = r10.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0053
            java.lang.Object r3 = r10.next()
            r5 = r3
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r5 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r5
            if (r5 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r5.getUlikeBeautyExtra()
            if (r5 == 0) goto L_0x003f
            java.lang.String r4 = r5.getResourceType()
        L_0x003f:
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L_0x004d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.put(r4, r5)
        L_0x004d:
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L_0x0025
        L_0x0053:
            java.util.Set r10 = r2.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x005b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x013b
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            r5 = 1
            if (r3 == 0) goto L_0x007d
            java.lang.String r3 = "1"
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r6)
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x005b
        L_0x007d:
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x008e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r7 = r7.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x00a8
            java.lang.String r7 = r7.getGender()
            goto L_0x00a9
        L_0x00a8:
            r7 = r4
        L_0x00a9:
            java.lang.Object r8 = r3.get(r7)
            if (r8 != 0) goto L_0x00b7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.put(r7, r8)
        L_0x00b7:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L_0x008e
        L_0x00bd:
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00c5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00ff
            java.lang.Object r7 = r6.next()
            r9 = r7
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r9 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r9
            if (r9 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r9 = r9.getUlikeBeautyExtra()
            if (r9 == 0) goto L_0x00f6
            int r9 = r9.getAbGroup()
            goto L_0x00f7
        L_0x00f6:
            r9 = 0
        L_0x00f7:
            if (r9 != r1) goto L_0x00fb
            r9 = 1
            goto L_0x00fc
        L_0x00fb:
            r9 = 0
        L_0x00fc:
            if (r9 == 0) goto L_0x00db
            goto L_0x0100
        L_0x00ff:
            r7 = r4
        L_0x0100:
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 != 0) goto L_0x0135
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x010e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0131
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
            if (r7 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r7 = r7.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x0128
            int r7 = r7.getAbGroup()
            goto L_0x0129
        L_0x0128:
            r7 = 0
        L_0x0129:
            if (r7 != 0) goto L_0x012d
            r7 = 1
            goto L_0x012e
        L_0x012d:
            r7 = 0
        L_0x012e:
            if (r7 == 0) goto L_0x010e
            goto L_0x0132
        L_0x0131:
            r6 = r4
        L_0x0132:
            r7 = r6
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r7 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r7
        L_0x0135:
            if (r7 == 0) goto L_0x00c5
            r0.add(r7)
            goto L_0x00c5
        L_0x013b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.beauty.C23544m.m77323b(java.util.ArrayList):java.util.ArrayList");
    }

    /* renamed from: a */
    public static final boolean m77321a(String str, String str2) {
        C7573i.m23587b(str, "gender");
        C7573i.m23587b(str2, "resType");
        if (!C35574k.m114859a().mo70091f().mo93342a(Property.UlikeBeautyDownloadEnable)) {
            return false;
        }
        String b = m77322b(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(File.separator);
        sb.append(FilterModel.CONFIG_FILE);
        return C38527bf.m123172a(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0079 A[EDGE_INSN: B:52:0x0079->B:33:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9 A[EDGE_INSN: B:56:0x00a9->B:47:0x00a9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m77322b(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "gender"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = "resType"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f62138b
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList r0 = com.p280ss.android.ugc.aweme.beauty.C23540j.m77315a()
            if (r0 == 0) goto L_0x001c
            f62138b = r0
        L_0x001c:
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f62138b
            r1 = 0
            if (r0 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> r0 = f62138b
            if (r0 != 0) goto L_0x0029
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0029:
            java.util.ArrayList r0 = m77323b(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0033:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r4 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r4
            if (r4 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5 = r4.getUlikeBeautyExtra()
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = r5.getResourceType()
            goto L_0x004e
        L_0x004d:
            r5 = r1
        L_0x004e:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = r8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x0074
            if (r4 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r4 = r4.getUlikeBeautyExtra()
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = r4.getGender()
            goto L_0x0067
        L_0x0066:
            r4 = r1
        L_0x0067:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r7
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0033
            goto L_0x0079
        L_0x0078:
            r3 = r1
        L_0x0079:
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r3 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r3
            if (r3 != 0) goto L_0x00ac
            java.util.Iterator r7 = r0.iterator()
        L_0x0081:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r2 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r2
            if (r2 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r2 = r2.getUlikeBeautyExtra()
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.getResourceType()
            goto L_0x009c
        L_0x009b:
            r2 = r1
        L_0x009c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0081
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            r3 = r0
            com.ss.android.ugc.aweme.beauty.UlikeBeautyData r3 = (com.p280ss.android.ugc.aweme.beauty.UlikeBeautyData) r3
        L_0x00ac:
            if (r3 == 0) goto L_0x00b3
            java.lang.String r7 = r3.getUnzipPath()
            return r7
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.beauty.C23544m.m77322b(java.lang.String, java.lang.String):java.lang.String");
    }
}
