package com.bytedance.android.livesdk.common;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ViewModuleManager extends Fragment {

    /* renamed from: a */
    private static final String f17231a = ViewModuleManager.class.getCanonicalName();

    /* renamed from: b */
    private Context f17232b;

    /* renamed from: c */
    private View f17233c;

    /* renamed from: d */
    private Bundle f17234d;

    /* renamed from: e */
    private List<C5855a> f17235e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private int f17236f = 0;

    public void onPause() {
        super.onPause();
        this.f17236f = 4;
        Iterator it = this.f17235e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onResume() {
        super.onResume();
        this.f17236f = 3;
        Iterator it = this.f17235e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onStart() {
        super.onStart();
        this.f17236f = 2;
        Iterator it = this.f17235e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onStop() {
        super.onStop();
        this.f17236f = 5;
        Iterator it = this.f17235e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onDestroy() {
        if (this.f17236f != 6) {
            this.f17236f = 6;
            for (C5855a a : this.f17235e) {
                a.mo14350a();
            }
            this.f17235e.clear();
            super.onDestroy();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Iterator it = this.f17235e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17236f = 1;
        for (C5855a a : this.f17235e) {
            a.mo14351a(this.f17232b, this.f17233c, this.f17234d);
        }
    }

    /* renamed from: a */
    private void m18325a(Context context, View view, Bundle bundle) {
        this.f17232b = context;
        this.f17233c = view;
        this.f17234d = bundle;
    }

    /* renamed from: a */
    public static ViewModuleManager m18323a(Fragment fragment, View view, Bundle bundle) {
        return m18324a(fragment.getChildFragmentManager(), fragment.getContext(), view, bundle);
    }

    /* renamed from: a */
    private static ViewModuleManager m18324a(C0608j jVar, Context context, View view, Bundle bundle) {
        ViewModuleManager viewModuleManager = new ViewModuleManager();
        viewModuleManager.m18325a(context, view, bundle);
        jVar.mo2645a().mo2588a((Fragment) viewModuleManager, f17231a).mo2610f();
        return viewModuleManager;
    }
}
