package com.zhihu.matisse.internal.p1856ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p1855a.C47330d;
import com.zhihu.matisse.internal.p1856ui.widget.DraweeViewTouch;
import com.zhihu.matisse.p1854b.C47325b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1874it.sephiroth.android.library.imagezoom.ImageViewTouch;
import p1874it.sephiroth.android.library.imagezoom.ImageViewTouch.C47875c;
import p1874it.sephiroth.android.library.imagezoom.ImageViewTouchBase.DisplayType;

/* renamed from: com.zhihu.matisse.internal.ui.PreviewItemFragment */
public class PreviewItemFragment extends Fragment {

    /* renamed from: a */
    public C47325b f121511a;

    public void onDetach() {
        super.onDetach();
        this.f121511a = null;
    }

    /* renamed from: a */
    public final void mo119407a() {
        if (getView() != null) {
            ((ImageViewTouch) getView().findViewById(R.id.ayk)).mo119959a();
        }
    }

    /* renamed from: a */
    public static PreviewItemFragment m147877a(Item item) {
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", item);
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C47325b) {
            this.f121511a = (C47325b) context;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.toString());
        sb.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(sb.toString());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final Item item = (Item) getArguments().getParcelable("args_item");
        if (item != null) {
            View findViewById = view.findViewById(R.id.eb5);
            if (item.mo119356d()) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(item.f121436c, "video/*");
                        try {
                            PreviewItemFragment.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            C47359b.m147899a(Toast.makeText(PreviewItemFragment.this.getContext(), R.string.c8c, 0));
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            DraweeViewTouch draweeViewTouch = (DraweeViewTouch) view.findViewById(R.id.ayk);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.aqi);
            Point a = C47330d.m147778a(item.f121436c, (Activity) getActivity());
            ImageRequest b = ImageRequestBuilder.m40865a(item.f121436c).mo33468a(new C13596d(a.x, a.y)).mo33476b();
            if (item.mo119355c()) {
                draweeViewTouch.setVisibility(4);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        if (PreviewItemFragment.this.f121511a != null) {
                            PreviewItemFragment.this.f121511a.mo119343b();
                        }
                    }
                });
                simpleDraweeView.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(simpleDraweeView.getController())).mo32748b(b)).mo32751c(true)).mo32730f());
                return;
            }
            draweeViewTouch.setVisibility(0);
            simpleDraweeView.setVisibility(4);
            draweeViewTouch.setDisplayType(DisplayType.FIT_TO_SCREEN);
            draweeViewTouch.setSingleTapListener(new C47875c() {
                /* renamed from: a */
                public final void mo119410a() {
                    if (PreviewItemFragment.this.f121511a != null) {
                        PreviewItemFragment.this.f121511a.mo119343b();
                    }
                }
            });
            draweeViewTouch.setImageRequest(b);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.q2, viewGroup, false);
    }
}
