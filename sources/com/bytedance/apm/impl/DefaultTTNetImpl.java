package com.bytedance.apm.impl;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.services.apm.api.C6477b;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DefaultTTNetImpl implements IHttpService {
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private List<C12461b> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public C6477b doGet(String str, Map<String, String> map) throws Exception {
        C12534t execute = ((RetrofitMonitorService) RetrofitUtils.m37898a("http://mon.snssdk.com", RetrofitMonitorService.class)).fetch(str, map).execute();
        return new C6477b(execute.mo30510a(), toByteArray(((TypedInput) execute.f33302b).mo10444in()));
    }

    public C6477b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        C12534t execute = ((RetrofitMonitorService) RetrofitUtils.m37898a("http://mon.snssdk.com", RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map)).execute();
        return new C6477b(execute.mo30510a(), toByteArray(((TypedInput) execute.f33302b).mo10444in()));
    }
}
