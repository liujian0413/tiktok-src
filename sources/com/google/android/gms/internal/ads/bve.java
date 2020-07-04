package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C6505uv
public final class bve {

    /* renamed from: a */
    private final int f43697a;

    /* renamed from: b */
    private final int f43698b;

    /* renamed from: c */
    private final int f43699c;

    /* renamed from: d */
    private final bvd f43700d = new bvi();

    public bve(int i) {
        this.f43698b = i;
        this.f43697a = 6;
        this.f43699c = 0;
    }

    /* renamed from: a */
    public final String mo41386a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return m50151a(sb.toString());
    }

    /* renamed from: a */
    private final String m50151a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        bvg bvg = new bvg();
        PriorityQueue priorityQueue = new PriorityQueue(this.f43698b, new bvf(this));
        for (String a : split) {
            String[] a2 = bvh.m50155a(a, false);
            if (a2.length != 0) {
                bvk.m50161a(a2, this.f43698b, this.f43697a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                bvg.mo41388a(this.f43700d.mo41385a(((bvl) it.next()).f43705b));
            } catch (IOException e) {
                acd.m45778b("Error while writing hash to byteStream", e);
            }
        }
        return bvg.toString();
    }
}
