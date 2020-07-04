package com.p280ss.android.ugc.aweme.typeadapter;

import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer */
public final class BackgroundVideoDeserializer implements C6708j<BackgroundVideo> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) {
        return m135537b(kVar, type, iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d A[Catch:{ Exception -> 0x0008 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo m135537b(com.google.gson.C6709k r13, java.lang.reflect.Type r14, com.google.gson.C6610i r15) {
        /*
            r14 = 0
            if (r13 == 0) goto L_0x000b
            com.google.gson.m r13 = r13.mo16136m()     // Catch:{ Exception -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r13 = move-exception
            goto L_0x00be
        L_0x000b:
            r13 = r14
        L_0x000c:
            if (r13 == 0) goto L_0x001b
            java.lang.String r15 = "videoPath"
            com.google.gson.k r15 = r13.mo16149b(r15)     // Catch:{ Exception -> 0x0008 }
            if (r15 == 0) goto L_0x001b
            java.lang.String r15 = r15.mo15998c()     // Catch:{ Exception -> 0x0008 }
            goto L_0x001c
        L_0x001b:
            r15 = r14
        L_0x001c:
            if (r13 == 0) goto L_0x002b
            java.lang.String r0 = "audioPath"
            com.google.gson.k r0 = r13.mo16149b(r0)     // Catch:{ Exception -> 0x0008 }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.mo15998c()     // Catch:{ Exception -> 0x0008 }
            goto L_0x002c
        L_0x002b:
            r0 = r14
        L_0x002c:
            if (r13 == 0) goto L_0x003b
            java.lang.String r1 = "maxDuration"
            com.google.gson.k r1 = r13.mo16149b(r1)     // Catch:{ Exception -> 0x0008 }
            if (r1 == 0) goto L_0x003b
            long r1 = r1.mo16002f()     // Catch:{ Exception -> 0x0008 }
            goto L_0x003d
        L_0x003b:
            r1 = 0
        L_0x003d:
            r6 = r1
            r1 = r15
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0008 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0008 }
            if (r1 != 0) goto L_0x0050
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0008 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0008 }
            if (r1 == 0) goto L_0x0092
        L_0x0050:
            if (r13 == 0) goto L_0x0092
            java.util.Set r13 = r13.mo16143a()     // Catch:{ Exception -> 0x0008 }
            if (r13 == 0) goto L_0x0092
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ Exception -> 0x0008 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x0008 }
        L_0x005e:
            boolean r1 = r13.hasNext()     // Catch:{ Exception -> 0x0008 }
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x0008 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0008 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0008 }
            java.lang.String r2 = "it.value"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x0008 }
            com.google.gson.k r1 = (com.google.gson.C6709k) r1     // Catch:{ Exception -> 0x0008 }
            java.lang.String r1 = r1.mo15998c()     // Catch:{ Exception -> 0x0008 }
            java.lang.String r2 = "value"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x0008 }
            java.lang.String r2 = "-bgv-v"
            r3 = 1
            boolean r2 = kotlin.text.C7634n.m23723c(r1, r2, r3)     // Catch:{ Exception -> 0x0008 }
            if (r2 == 0) goto L_0x0088
            r15 = r1
        L_0x0088:
            java.lang.String r2 = "-bgv-a"
            boolean r2 = kotlin.text.C7634n.m23723c(r1, r2, r3)     // Catch:{ Exception -> 0x0008 }
            if (r2 == 0) goto L_0x005e
            r0 = r1
            goto L_0x005e
        L_0x0092:
            r4 = r15
            r5 = r0
            r13 = r4
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x0008 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0008 }
            if (r13 != 0) goto L_0x00bd
            r13 = r5
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x0008 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0008 }
            if (r13 != 0) goto L_0x00bd
            com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r13 = new com.ss.android.ugc.aweme.sticker.model.BackgroundVideo     // Catch:{ Exception -> 0x0008 }
            if (r4 != 0) goto L_0x00ad
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0008 }
        L_0x00ad:
            if (r5 != 0) goto L_0x00b2
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0008 }
        L_0x00b2:
            r8 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x0008 }
            return r13
        L_0x00bd:
            return r14
        L_0x00be:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Deserializer bgv failed "
            r15.<init>(r0)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer.m135537b(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):com.ss.android.ugc.aweme.sticker.model.BackgroundVideo");
    }
}
