package com.bytedance.android.live.core.rxutils.rxlifecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p346io.reactivex.p354j.C47844a;

public class BindingFragment extends Fragment {

    /* renamed from: a */
    public final C47844a<LifecycleEvent> f10050a = C47844a.m148742a();

    public void onDestroy() {
        super.onDestroy();
        this.f10050a.onNext(LifecycleEvent.DESTROY);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f10050a.onNext(LifecycleEvent.DESTROY_VIEW);
    }

    public void onDetach() {
        super.onDetach();
        this.f10050a.onNext(LifecycleEvent.DETACH);
    }

    public void onPause() {
        super.onPause();
        this.f10050a.onNext(LifecycleEvent.PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.f10050a.onNext(LifecycleEvent.RESUME);
    }

    public void onStart() {
        super.onStart();
        this.f10050a.onNext(LifecycleEvent.START);
    }

    public void onStop() {
        super.onStop();
        this.f10050a.onNext(LifecycleEvent.STOP);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10050a.onNext(LifecycleEvent.ATTACH);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10050a.onNext(LifecycleEvent.CREATE);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f10050a.onNext(LifecycleEvent.ATTACH);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10050a.onNext(LifecycleEvent.CREATE_VIEW);
        return null;
    }
}
