package com.zhihu.matisse.internal.p1856ui.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhihu.matisse.internal.entity.Album;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.zhihu.matisse.internal.ui.adapter.a */
public final class C47358a extends CursorAdapter {

    /* renamed from: a */
    private final Drawable f121530a;

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.fp, viewGroup, false);
    }

    public C47358a(Context context, Cursor cursor, boolean z) {
        super(context, null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.am});
        this.f121530a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        Album a = Album.m147787a(cursor);
        ((TextView) view.findViewById(R.id.f2)).setText(a.mo119345a(context));
        ((TextView) view.findViewById(R.id.f1)).setText(String.valueOf(a.f121432d));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.ey);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.in);
        ImageRequest b = ImageRequestBuilder.m40865a(Uri.fromFile(new File(a.f121431c))).mo33468a(new C13596d(dimensionPixelSize, dimensionPixelSize)).mo33476b();
        C13438a aVar = (C13438a) simpleDraweeView.getHierarchy();
        if (aVar == null) {
            aVar = new C13439b(context.getResources()).mo32908a();
        }
        aVar.mo32900b(this.f121530a);
        simpleDraweeView.setHierarchy(aVar);
        simpleDraweeView.setImageRequest(b);
    }
}
