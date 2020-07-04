package com.ixigua.downloader;

import com.ixigua.downloader.pojo.Task;

/* renamed from: com.ixigua.downloader.m */
abstract class C18488m implements Comparable<C18488m> {
    C18488m() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Task mo47948a();

    /* renamed from: a */
    public int compareTo(C18488m mVar) {
        return m60909a(mo47948a(), mVar.mo47948a());
    }

    /* renamed from: a */
    private static int m60909a(Task task, Task task2) {
        if (task == null || task2 == null) {
            return 0;
        }
        return task2.priority - task.priority;
    }
}
