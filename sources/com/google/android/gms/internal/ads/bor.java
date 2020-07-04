package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class bor {

    /* renamed from: a */
    public final int f43048a;

    /* renamed from: b */
    public final byte[] f43049b;

    /* renamed from: c */
    public final Map<String, String> f43050c;

    /* renamed from: d */
    public final List<bky> f43051d;

    /* renamed from: e */
    public final boolean f43052e;

    /* renamed from: f */
    private final long f43053f;

    public bor(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new bky((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    public bor(int i, byte[] bArr, boolean z, long j, List<bky> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (bky bky : list) {
                treeMap.put(bky.f42430a, bky.f42431b);
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }

    public bor(byte[] bArr, Map<String, String> map) {
        this((int) C34943c.f91127w, bArr, map, false, 0);
    }

    private bor(int i, byte[] bArr, Map<String, String> map, List<bky> list, boolean z, long j) {
        this.f43048a = i;
        this.f43049b = bArr;
        this.f43050c = map;
        if (list == null) {
            this.f43051d = null;
        } else {
            this.f43051d = Collections.unmodifiableList(list);
        }
        this.f43052e = z;
        this.f43053f = j;
    }
}
