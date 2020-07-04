package com.p280ss.android.p298ml;

import com.p280ss.android.p298ml.process.C6831a;
import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.d */
public interface C6823d {
    /* renamed from: a */
    float mo16663a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2);

    /* renamed from: a */
    String mo16664a();

    /* renamed from: a */
    List<String> mo16665a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2, Map<String, Float> map2);

    /* renamed from: a */
    void mo16666a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable;

    /* renamed from: b */
    boolean mo16667b();

    /* renamed from: c */
    void mo16668c();
}
