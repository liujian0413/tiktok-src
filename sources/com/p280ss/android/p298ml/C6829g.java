package com.p280ss.android.p298ml;

import com.p280ss.android.p298ml.process.C6831a;
import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import com.p280ss.android.p298ml.process.C6836f;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.C7720a;
import org.tensorflow.lite.C7721b;
import org.tensorflow.lite.C7721b.C7722a;
import org.tensorflow.lite.gpu.GpuDelegate;

/* renamed from: com.ss.android.ml.g */
public final class C6829g implements C6823d {

    /* renamed from: a */
    private C7721b f19449a;

    /* renamed from: b */
    private GpuDelegate f19450b;

    /* renamed from: c */
    private MappedByteBuffer f19451c;

    /* renamed from: d */
    private float[][] f19452d;

    /* renamed from: e */
    private ByteBuffer f19453e;

    /* renamed from: f */
    private String f19454f;

    /* renamed from: a */
    public final String mo16664a() {
        return this.f19454f;
    }

    /* renamed from: b */
    public final boolean mo16667b() {
        if (this.f19449a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo16668c() {
        if (this.f19449a != null) {
            this.f19449a.close();
            this.f19449a = null;
        }
        if (this.f19450b != null) {
            this.f19450b.close();
            this.f19450b = null;
        }
        this.f19451c = null;
    }

    public C6829g(String str) {
        this.f19454f = str;
    }

    /* renamed from: a */
    private void m21247a(ByteBuffer byteBuffer, float[][] fArr) {
        System.nanoTime();
        this.f19449a.mo20407a((Object) byteBuffer, (Object) fArr);
    }

    /* renamed from: a */
    private void m21245a(C6831a aVar, Map<String, Float> map) {
        if (map != null && aVar.getLabels() != null && !aVar.getLabels().isEmpty()) {
            List<String> labels = aVar.getLabels();
            int size = labels.size();
            if (size == 2) {
                map.put(labels.get(0), Float.valueOf(1.0f - this.f19452d[0][0]));
                map.put(labels.get(1), Float.valueOf(this.f19452d[0][0]));
            } else if (size == this.f19452d[0].length) {
                int i = 0;
                for (String put : labels) {
                    int i2 = i + 1;
                    map.put(put, Float.valueOf(this.f19452d[0][i]));
                    i = i2;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m21248a(List<? extends C6833c> list, HashMap<String, Object> hashMap) {
        if (list != null && !list.isEmpty()) {
            System.nanoTime();
            for (C6833c cVar : list) {
                System.nanoTime();
                C6834d dVar = new C6834d(hashMap, cVar);
                String operator = cVar.getOperator();
                C6835e a = C6836f.m21266a().mo16696a(operator);
                if (a != null) {
                    try {
                        a.mo16695a(dVar);
                    } catch (Throwable th) {
                        C6830h.m21259a(th);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(operator);
                    sb.append(" don't support now");
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16666a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable {
        int i;
        FileChannel channel = fileInputStream.getChannel();
        this.f19451c = channel.map(MapMode.READ_ONLY, channel.position(), channel.size());
        C7722a aVar = new C7722a();
        if (mLConfigModel.numThreads > 0 && mLConfigModel.numThreads <= 20) {
            aVar.mo20410a(mLConfigModel.numThreads);
        }
        if (mLConfigModel.enableGPU) {
            this.f19450b = new GpuDelegate();
            aVar.mo20411a((C7720a) this.f19450b);
        }
        if (mLConfigModel.enableNNApi) {
            aVar.mo20412a(true);
        }
        this.f19449a = new C7721b(this.f19451c, aVar);
        if (mLConfigModel.afOPModel == null || mLConfigModel.afOPModel.labels == null) {
            i = 1;
        } else {
            i = mLConfigModel.afOPModel.labels.size();
        }
        if (i == 2) {
            i = 1;
        }
        this.f19452d = (float[][]) Array.newInstance(float.class, new int[]{1, i});
        this.f19453e = ByteBuffer.allocateDirect(mLConfigModel.inputFeatureList.size() * 4);
        this.f19453e.order(ByteOrder.nativeOrder());
    }

    /* renamed from: a */
    private static void m21246a(C6831a aVar, float[] fArr, List<String> list) {
        if (aVar != null) {
            System.nanoTime();
            C6834d dVar = new C6834d(fArr, list, aVar);
            String operator = aVar.getOperator();
            C6835e a = C6836f.m21266a().mo16696a(operator);
            if (a != null) {
                try {
                    a.mo16695a(dVar);
                } catch (Throwable th) {
                    C6830h.m21259a(th);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(operator);
                sb.append(" don't support now");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final float mo16663a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2) {
        float f;
        this.f19453e.clear();
        this.f19452d[0][0] = 0.0f;
        HashMap hashMap = new HashMap(map);
        m21248a(list, hashMap);
        for (String str : list2) {
            Number number = (Number) hashMap.get(str);
            ByteBuffer byteBuffer = this.f19453e;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            byteBuffer.putFloat(f);
        }
        m21247a(this.f19453e, this.f19452d);
        m21246a(aVar, this.f19452d[0], null);
        return this.f19452d[0][0];
    }

    /* renamed from: a */
    public final List<String> mo16665a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2, Map<String, Float> map2) {
        float f;
        this.f19453e.clear();
        this.f19452d[0][0] = 0.0f;
        HashMap hashMap = new HashMap(map);
        m21248a(list, hashMap);
        for (String str : list2) {
            Number number = (Number) hashMap.get(str);
            ByteBuffer byteBuffer = this.f19453e;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            byteBuffer.putFloat(f);
        }
        m21247a(this.f19453e, this.f19452d);
        ArrayList arrayList = new ArrayList();
        m21246a(aVar, this.f19452d[0], arrayList);
        m21245a(aVar, map2);
        return arrayList;
    }
}
