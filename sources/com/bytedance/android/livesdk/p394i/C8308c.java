package com.bytedance.android.livesdk.p394i;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.i.c */
public final class C8308c {

    /* renamed from: a */
    private ConcurrentHashMap<Integer, C8306a> f22811a;

    /* renamed from: b */
    private ConcurrentHashMap<Integer, Integer> f22812b;

    /* renamed from: c */
    private ConcurrentHashMap<Integer, Integer> f22813c;

    /* renamed from: d */
    private int[][] f22814d;

    /* renamed from: e */
    private Handler f22815e;

    /* renamed from: f */
    private C8306a f22816f;

    /* renamed from: g */
    private Thread f22817g;

    /* renamed from: com.bytedance.android.livesdk.i.c$1 */
    class C83091 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8306a f22818a;

        /* renamed from: b */
        final /* synthetic */ Thread f22819b;

        public final void run() {
            this.f22818a.start();
            this.f22819b.notify();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.i.c$a */
    protected static class C8310a {

        /* renamed from: a */
        public static C8308c f22820a = new C8308c(null);
    }

    /* renamed from: a */
    public static C8308c m25372a() {
        return C8310a.f22820a;
    }

    private C8308c() {
        this.f22811a = new ConcurrentHashMap<>();
        this.f22812b = new ConcurrentHashMap<>();
        this.f22813c = new ConcurrentHashMap<>();
        this.f22815e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo21474b() {
        if (this.f22816f == null) {
            this.f22816f = m25376e();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m25374c();
        } else if (this.f22817g == null) {
            m25375d();
        }
    }

    /* renamed from: c */
    private void m25374c() {
        if (this.f22816f != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (C8306a aVar = this.f22816f; aVar != null; aVar = aVar.mNextTask) {
                boolean z = true;
                Iterator it = aVar.preTasks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) it.next();
                    if (num.intValue() != aVar.getTaskId() && !((C8306a) this.f22811a.get(num)).isFinished()) {
                        z = false;
                        break;
                    }
                }
                if (z && aVar.isIDLE()) {
                    aVar.start();
                }
            }
        }
    }

    /* renamed from: d */
    private void m25375d() {
        if (this.f22816f != null && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f22817g = Thread.currentThread();
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            String str = "";
            String str2 = "";
            for (C8306a aVar = this.f22816f; aVar != null; aVar = aVar.mNextTask) {
                long currentTimeMillis2 = System.currentTimeMillis();
                aVar.start();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                arrayList.add(aVar.getClass().getCanonicalName());
                hashMap.put(aVar.getClass().getCanonicalName(), Long.valueOf(currentTimeMillis3));
            }
            C8307b.m25371a(System.currentTimeMillis() - currentTimeMillis, arrayList, false, hashMap, str, str2);
            this.f22817g = null;
        }
    }

    /* renamed from: e */
    private C8306a m25376e() {
        this.f22814d = (int[][]) Array.newInstance(int.class, new int[]{this.f22812b.size(), this.f22812b.size()});
        int[] iArr = new int[this.f22812b.size()];
        for (Entry entry : this.f22812b.entrySet()) {
            List<Integer> preTasks = ((C8306a) this.f22811a.get(entry.getKey())).getPreTasks();
            if (preTasks != null) {
                for (Integer num : preTasks) {
                    if (num != entry.getKey()) {
                        this.f22814d[((Integer) this.f22812b.get(num)).intValue()][((Integer) this.f22812b.get(entry.getKey())).intValue()] = 1;
                    }
                }
            }
        }
        Stack stack = new Stack();
        int size = this.f22812b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = 0;
        }
        while (i < size) {
            if (iArr[i] != 0 || m25373a(i, iArr, stack)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(((C8306a) this.f22811a.get(Integer.valueOf(i))).getClass().getCanonicalName());
                sb.append("在环上，重新review task依赖");
                throw new RuntimeException(sb.toString());
            }
        }
        int i3 = -1;
        C8306a aVar = null;
        while (!stack.empty()) {
            int intValue = ((Integer) this.f22813c.get(stack.pop())).intValue();
            if (this.f22811a.containsKey(Integer.valueOf(i3))) {
                ((C8306a) this.f22811a.get(Integer.valueOf(i3))).mNextTask = (C8306a) this.f22811a.get(Integer.valueOf(intValue));
            } else {
                aVar = (C8306a) this.f22811a.get(Integer.valueOf(intValue));
            }
            i3 = intValue;
        }
        return aVar;
    }

    /* synthetic */ C8308c(C83091 r1) {
        this();
    }

    /* renamed from: a */
    public final void mo21473a(int i, C8306a aVar) {
        if (!this.f22811a.containsKey(Integer.valueOf(i))) {
            this.f22811a.put(Integer.valueOf(i), aVar);
            int size = this.f22812b.size();
            this.f22812b.put(Integer.valueOf(i), Integer.valueOf(size));
            this.f22813c.put(Integer.valueOf(size), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private boolean m25373a(int i, int[] iArr, Stack stack) {
        iArr[i] = -1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (this.f22814d[i][i2] == 1) {
                if (iArr[i2] < 0) {
                    return false;
                }
                if (iArr[i2] != 1 && !m25373a(i2, iArr, stack)) {
                    return false;
                }
            }
        }
        iArr[i] = 1;
        stack.push(Integer.valueOf(i));
        return true;
    }
}
