package com.p280ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0728b;
import android.support.p022v4.graphics.drawable.C0730d;
import android.view.View;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnPublishCallback;
import com.p280ss.android.ugc.aweme.shortvideo.C40023l;
import com.p280ss.android.ugc.aweme.shortvideo.PublishDialogFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.port.internal.PublishFragmentLifecycleCallbacks */
public class PublishFragmentLifecycleCallbacks extends C0609a {

    /* renamed from: a */
    private final FragmentActivity f93289a;

    /* renamed from: b */
    private final ServiceConnectionImpl f93290b;

    /* renamed from: c */
    private final OnPublishCallback f93291c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo90415a() throws Exception {
        return this.f93290b.f93292a.mo96194c();
    }

    public void onFragmentDetached(C0608j jVar, Fragment fragment) {
        super.onFragmentDetached(jVar, fragment);
        if (fragment instanceof PublishDialogFragment) {
            this.f93289a.getSupportFragmentManager().mo2648a((C0609a) this);
            if (this.f93290b.f93292a != null) {
                this.f93290b.f93292a.mo96193b((C40023l) fragment);
            }
            if (this.f93291c != null) {
                this.f93291c.onStopPublish();
            }
            try {
                this.f93289a.unbindService(this.f93290b);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public PublishFragmentLifecycleCallbacks(FragmentActivity fragmentActivity, ServiceConnectionImpl serviceConnectionImpl, OnPublishCallback onPublishCallback) {
        this.f93289a = fragmentActivity;
        this.f93290b = serviceConnectionImpl;
        this.f93291c = onPublishCallback;
    }

    public void onFragmentAttached(C0608j jVar, Fragment fragment, Context context) {
        super.onFragmentAttached(jVar, fragment, context);
        if ((fragment instanceof PublishDialogFragment) && this.f93290b.f93292a != null) {
            this.f93290b.f93292a.mo96191a((C40023l) fragment);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m115028a(Fragment fragment, View view, C1592h hVar) throws Exception {
        if (hVar.mo6882b() && fragment.isAdded()) {
            C0728b a = C0730d.m3126a(fragment.getResources(), (Bitmap) hVar.mo6890e());
            a.mo2890a(C9738o.m28708b(fragment.getContext(), 2.0f));
            view.setBackground(new LayerDrawable(new Drawable[]{a, C0683b.m2903a(fragment.getContext(), (int) R.drawable.hk)}));
        }
        return null;
    }

    public void onFragmentViewCreated(C0608j jVar, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(jVar, fragment, view, bundle);
        if (!C6399b.m19944t() && (fragment instanceof PublishDialogFragment) && this.f93290b.f93292a != null) {
            C1592h.m7853a((Callable<TResult>) new C35617g<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C35618h<TResult,TContinuationResult>(fragment, view), C1592h.f5958b);
        }
    }
}
