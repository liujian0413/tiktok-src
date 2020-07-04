package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.keyframes.a.b */
public final class C13983b {

    /* renamed from: a */
    public static final C13982a<String> f36971a = new C13982a<String>() {
        /* renamed from: c */
        private static String m41312c(JsonReader jsonReader) throws IOException {
            return jsonReader.nextString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41312c(jsonReader);
        }
    };

    /* renamed from: b */
    public static final C13982a<Float> f36972b = new C13982a<Float>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41314c(jsonReader);
        }

        /* renamed from: c */
        private static Float m41314c(JsonReader jsonReader) throws IOException {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    };

    /* renamed from: c */
    public static final C13982a<List<Float>> f36973c = new C13982a<List<Float>>() {
        /* renamed from: c */
        private static List<Float> m41316c(JsonReader jsonReader) throws IOException {
            return C13983b.f36972b.mo33648a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41316c(jsonReader);
        }
    };

    /* renamed from: d */
    private static final C13982a<List<List<Float>>> f36974d = new C13982a<List<List<Float>>>() {
        /* renamed from: c */
        private static List<List<Float>> m41318c(JsonReader jsonReader) throws IOException {
            return C13983b.f36973c.mo33648a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41318c(jsonReader);
        }
    };

    /* renamed from: a */
    public static float[] m41308a(JsonReader jsonReader) throws IOException {
        return m41309a(f36972b.mo33648a(jsonReader));
    }

    /* renamed from: b */
    public static float[][][] m41310b(JsonReader jsonReader) throws IOException {
        return m41311b(f36974d.mo33648a(jsonReader));
    }

    /* renamed from: a */
    private static float[] m41309a(List<Float> list) {
        float[] fArr = new float[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) list.get(i)).floatValue();
        }
        return fArr;
    }

    /* renamed from: b */
    private static float[][][] m41311b(List<List<List<Float>>> list) {
        float[][][] fArr = new float[list.size()][][];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float[][] fArr2 = new float[((List) list.get(0)).size()][];
            int length = fArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = m41309a((List) ((List) list.get(i)).get(i2));
            }
            fArr[i] = fArr2;
        }
        return fArr;
    }
}
