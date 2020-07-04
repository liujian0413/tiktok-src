package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewFragment */
public class PhotoPreviewFragment extends AmeBaseFragment {

    /* renamed from: e */
    private PhotoParam f80861e;

    /* renamed from: f */
    private RemoteImageView f80862f;

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("photo_param", this.f80861e);
    }

    /* renamed from: a */
    private void m100573a(Bundle bundle) {
        if (bundle != null) {
            this.f80861e = (PhotoParam) bundle.getSerializable("photo_param");
        } else {
            this.f80861e = (PhotoParam) getArguments().getSerializable("photo_param");
        }
    }

    /* renamed from: a */
    private void m100574a(View view) {
        this.f80862f = (RemoteImageView) view.findViewById(R.id.cb9);
        RemoteImageView remoteImageView = this.f80862f;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f80861e.getPath());
        C23323e.m76514a(remoteImageView, sb.toString());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m100573a(bundle);
        m100574a(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.s9, viewGroup, false);
    }
}
