package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

@C6505uv
public final class bvk {
    /* renamed from: a */
    public static void m50161a(String[] strArr, int i, int i2, PriorityQueue<bvl> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m50160a(i, m50162b(strArr2, 0, strArr2.length), m50159a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m50162b(strArr2, 0, i3);
        m50160a(i, b, m50159a(strArr2, 0, i3), i2, priorityQueue);
        long a = m50158a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) bvh.m50154a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) bvh.m50154a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m50160a(i, b, m50159a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: a */
    private static void m50160a(int i, long j, String str, int i2, PriorityQueue<bvl> priorityQueue) {
        bvl bvl = new bvl(j, str, i2);
        if ((priorityQueue.size() != i || (((bvl) priorityQueue.peek()).f43706c <= bvl.f43706c && ((bvl) priorityQueue.peek()).f43704a <= bvl.f43704a)) && !priorityQueue.contains(bvl)) {
            priorityQueue.add(bvl);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    private static String m50159a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            acd.m45779c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private static long m50162b(String[] strArr, int i, int i2) {
        long a = (((long) bvh.m50154a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) bvh.m50154a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    /* renamed from: a */
    private static long m50158a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return m50158a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (m50158a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }
}
