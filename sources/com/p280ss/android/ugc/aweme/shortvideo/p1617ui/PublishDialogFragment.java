package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishDialogFragment */
public class PublishDialogFragment extends com.p280ss.android.ugc.aweme.shortvideo.PublishDialogFragment {

    /* renamed from: d */
    ImageView f107093d;

    /* renamed from: e */
    private Bitmap f107094e;

    /* renamed from: b */
    private void m131360b(Bundle bundle) {
        C1592h.m7853a((Callable<TResult>) new C41240aa<TResult>(this, bundle)).mo6876a((C1591g<TResult, TContinuationResult>) new C41241ab<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo101655a(Bundle bundle) throws Exception {
        if (bundle != null) {
            this.f107094e = (Bitmap) bundle.getParcelable("cover_data");
        }
        if (this.f107094e == null && this.f99682c != null) {
            this.f107094e = this.f99682c.mo96194c();
        }
        return this.f107094e;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f107094e != null && !this.f107094e.isRecycled()) {
            bundle.putParcelable("cover_data", this.f107094e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo101656a(C1592h hVar) throws Exception {
        if (!(hVar.mo6890e() == null || ((Bitmap) hVar.mo6890e()).isRecycled() || this.f107093d == null)) {
            this.f107093d.setImageBitmap((Bitmap) hVar.mo6890e());
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f107093d = (ImageView) view.findViewById(R.id.lo);
        this.f99680a = (CircularProgressView) view.findViewById(R.id.b_w);
        this.f99680a.setIndeterminate(false);
        this.f99681b = (TextView) view.findViewById(R.id.cky);
        m131360b(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qa, viewGroup, false);
    }
}
