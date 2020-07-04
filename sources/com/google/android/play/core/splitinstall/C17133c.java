package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import com.google.android.play.core.tasks.C17147c;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.c */
public interface C17133c {
    /* renamed from: a */
    C17147c<Void> mo44400a(int i);

    /* renamed from: a */
    C17147c<Integer> mo44401a(C17135e eVar);

    /* renamed from: a */
    C17147c<Void> mo44402a(List<String> list);

    /* renamed from: a */
    Set<String> mo44403a();

    /* renamed from: a */
    void mo44404a(C17137g gVar);

    /* renamed from: a */
    boolean mo44405a(C6563f fVar, Activity activity, int i) throws SendIntentException;

    /* renamed from: b */
    C17147c<C6563f> mo44406b(int i);

    /* renamed from: b */
    Set<String> mo44407b();

    /* renamed from: b */
    void mo44408b(C17137g gVar);
}
