package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import android.content.Context;
import android.util.Pair;
import com.C1642a;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.l */
public class C38566l {

    /* renamed from: a */
    public static final String f100205a = "l";

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.c.l$a */
    public static class C38567a {
        /* renamed from: a */
        public static String m123257a(File file) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
                    int i = 0;
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            i += read;
                            int i2 = i - 524288;
                            if (i2 >= 0) {
                                instance.update(bArr, 0, read - i2);
                                break;
                            }
                            instance.update(bArr, 0, read);
                        } catch (IOException e) {
                            C6921a.m21559a((Throwable) e);
                            return null;
                        } finally {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    }
                    return C1642a.m8034a("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            } catch (NoSuchAlgorithmException unused3) {
                return null;
            }
        }
    }

    /* renamed from: b */
    private static JSONArray m123256b() {
        JSONArray jSONArray = new JSONArray();
        if (C19667g.f53272a != null) {
            for (int i = 0; i < C19667g.f53272a.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("height", ((Pair) C19667g.f53272a.get(i)).first);
                    jSONObject.put("width", ((Pair) C19667g.f53272a.get(i)).second);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONObject m123255a() {
        String str;
        if (!C7163a.m22363a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = "is_hardcode";
        try {
            if (C36964i.m118920a()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put(str2, str);
            jSONObject.put("bite_rate", String.valueOf(C36964i.m118929e()));
            jSONObject.put("video_quality", C36964i.m118931g());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m123251a(boolean z, boolean z2, Context context, String str, Integer num, Integer num2, Integer num3) {
        return m123252a(false, true, (Context) null, (String) null, num, num2, num3, null);
    }

    /* renamed from: a */
    private static String m123253a(boolean z, boolean z2, Context context, List<String> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<List<EmbaddedWindowInfo>> list5) {
        return m123254a(z, z2, context, list, list2, list3, list4, null, list5);
    }

    /* renamed from: a */
    public static String m123252a(boolean z, boolean z2, Context context, String str, Integer num, Integer num2, Integer num3, List<EmbaddedWindowInfo> list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num2);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(num3);
        if (list != null) {
            arrayList = new ArrayList();
            arrayList.add(list);
        } else {
            arrayList = null;
        }
        return m123253a(z, z2, context, (List<String>) arrayList2, (List<Integer>) arrayList3, (List<Integer>) arrayList4, (List<Integer>) arrayList5, (List<List<EmbaddedWindowInfo>>) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m123254a(boolean r17, boolean r18, android.content.Context r19, java.util.List<java.lang.String> r20, java.util.List<java.lang.Integer> r21, java.util.List<java.lang.Integer> r22, java.util.List<java.lang.Integer> r23, java.util.List<java.lang.String> r24, java.util.List<java.util.List<com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo>> r25) {
        /*
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r25
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            if (r0 != 0) goto L_0x0028
            if (r1 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            int r7 = r20.size()
            int r8 = r21.size()
            if (r7 != r8) goto L_0x0025
            if (r3 == 0) goto L_0x0025
            if (r4 != 0) goto L_0x0028
        L_0x0025:
            java.lang.String r0 = ""
            return r0
        L_0x0028:
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.lang.String r8 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r7.<init>(r8)
            r8 = 0
        L_0x0030:
            int r9 = r20.size()
            if (r8 >= r9) goto L_0x0191
            java.lang.Object r9 = r1.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = ""
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            if (r9 == 0) goto L_0x0099
            java.io.File r12 = new java.io.File
            r12.<init>(r9)
            if (r0 != 0) goto L_0x0056
            boolean r13 = r12.exists()
            if (r13 == 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r13 = r24
            goto L_0x0085
        L_0x0056:
            android.media.MediaMetadataRetriever r13 = new android.media.MediaMetadataRetriever
            r13.<init>()
            if (r0 != 0) goto L_0x0069
            java.lang.String r14 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0069 }
            r13.setDataSource(r14)     // Catch:{ Exception -> 0x0069 }
            r14 = 23
            r13.extractMetadata(r14)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            if (r0 != 0) goto L_0x0053
            boolean r10 = com.bytedance.common.utility.C6311g.m19574b(r24)
            if (r10 == 0) goto L_0x007a
            r13 = r24
            java.lang.Object r10 = r13.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0085
        L_0x007a:
            r13 = r24
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            java.lang.String r10 = com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l.C38567a.m123257a(r10)
        L_0x0085:
            if (r0 != 0) goto L_0x009b
            java.lang.String r14 = "creationDate"
            long r15 = r12.lastModified()     // Catch:{ Exception -> 0x009b }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = r7.format(r12)     // Catch:{ Exception -> 0x009b }
            r11.put(r14, r12)     // Catch:{ Exception -> 0x009b }
            goto L_0x009b
        L_0x0099:
            r13 = r24
        L_0x009b:
            if (r10 != 0) goto L_0x009f
            java.lang.String r10 = ""
        L_0x009f:
            if (r0 == 0) goto L_0x00bf
            java.lang.String r12 = "creationDate"
            java.util.Date r14 = new java.util.Date     // Catch:{ Exception -> 0x00bb }
            r14.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r14 = r7.format(r14)     // Catch:{ Exception -> 0x00bb }
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            org.json.JSONObject r12 = m123255a()     // Catch:{ Exception -> 0x00bb }
            if (r12 == 0) goto L_0x00bf
            java.lang.String r14 = "record"
            r11.put(r14, r12)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r10 = r18
            goto L_0x018d
        L_0x00bf:
            java.lang.String r12 = "location"
            java.lang.String r14 = ""
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            if (r0 == 0) goto L_0x00d0
            java.lang.String r12 = "make"
            java.lang.String r14 = "Android"
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00d7
        L_0x00d0:
            java.lang.String r12 = "make"
            java.lang.String r14 = ""
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
        L_0x00d7:
            java.lang.String r12 = "videoIndex"
            int r14 = r8 + 1
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = "userSystem"
            java.lang.String r14 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x00bb }
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = "appRecord"
            if (r0 == 0) goto L_0x00ec
            java.lang.String r14 = "1"
            goto L_0x00ee
        L_0x00ec:
            java.lang.String r14 = "0"
        L_0x00ee:
            r11.put(r12, r14)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = "MD5"
            r11.put(r12, r10)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "videoDevice"
            java.lang.String r12 = ""
            r11.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "system"
            java.lang.String r12 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x00bb }
            r11.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "userDevice"
            java.lang.String r12 = android.os.Build.MODEL     // Catch:{ Exception -> 0x00bb }
            r11.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "deviceResolution"
            org.json.JSONArray r12 = m123256b()     // Catch:{ Exception -> 0x00bb }
            r11.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            if (r0 != 0) goto L_0x012a
            if (r9 == 0) goto L_0x0124
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x00bb }
            byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = "UTF-8"
            r10.<init>(r9, r12)     // Catch:{ Exception -> 0x00bb }
            r9 = r10
        L_0x0124:
            java.lang.String r10 = "importPath"
            r11.put(r10, r9)     // Catch:{ Exception -> 0x00bb }
            goto L_0x0131
        L_0x012a:
            java.lang.String r9 = "importPath"
            java.lang.String r10 = ""
            r11.put(r9, r10)     // Catch:{ Exception -> 0x00bb }
        L_0x0131:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
            r9.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "width"
            java.lang.Object r12 = r3.get(r8)     // Catch:{ Exception -> 0x00bb }
            r9.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "height"
            java.lang.Object r12 = r4.get(r8)     // Catch:{ Exception -> 0x00bb }
            r9.put(r10, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "videoResolution"
            r11.put(r10, r9)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r9 = "videoDuration"
            java.lang.Object r10 = r2.get(r8)     // Catch:{ Exception -> 0x00bb }
            r11.put(r9, r10)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r9 = "isRecord"
            r11.put(r9, r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r9 = "isCropped"
            r10 = r18
            r11.put(r9, r10)     // Catch:{ Exception -> 0x018d }
            if (r5 != 0) goto L_0x0166
            r9 = 0
            goto L_0x016c
        L_0x0166:
            java.lang.Object r9 = r5.get(r8)     // Catch:{ Exception -> 0x018d }
            java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x018d }
        L_0x016c:
            if (r9 == 0) goto L_0x018a
            boolean r12 = r9.isEmpty()     // Catch:{ Exception -> 0x018d }
            if (r12 != 0) goto L_0x018a
            java.lang.String r12 = "reaction_info"
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch:{ Exception -> 0x018d }
            com.ss.android.ugc.aweme.port.in.n r15 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()     // Catch:{ Exception -> 0x018d }
            com.google.gson.e r15 = r15.mo70085S()     // Catch:{ Exception -> 0x018d }
            java.lang.String r9 = r15.mo15979b(r9)     // Catch:{ Exception -> 0x018d }
            r14.<init>(r9)     // Catch:{ Exception -> 0x018d }
            r11.put(r12, r14)     // Catch:{ Exception -> 0x018d }
        L_0x018a:
            r6.put(r11)     // Catch:{ Exception -> 0x018d }
        L_0x018d:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x0191:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l.m123254a(boolean, boolean, android.content.Context, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
