package com.p280ss.android.ugc.aweme.shortvideo.upload;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.t */
public final class C41494t {

    /* renamed from: a */
    private static final C41494t f107914a = new C41494t();

    /* renamed from: b */
    private ConcurrentLinkedQueue<String> f107915b = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static C41494t m132184a() {
        return f107914a;
    }

    /* renamed from: b */
    public final ArrayList<String> mo102150b() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f107915b;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(":report");
        concurrentLinkedQueue.offer(sb.toString());
        ArrayList<String> arrayList = new ArrayList<>(this.f107915b);
        this.f107915b.clear();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo102149a(String str) {
        if (this.f107915b.size() >= 30) {
            this.f107915b.poll();
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f107915b;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(":");
        sb.append(str);
        concurrentLinkedQueue.offer(sb.toString());
    }
}
