package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.views.GoLiveTextView */
public class GoLiveTextView extends DmtTextView {

    /* renamed from: b */
    private Path f112262b;

    public GoLiveTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m137588a(canvas);
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private int m137586a(float f) {
        return (int) ((getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
    }

    /* renamed from: a */
    private void m137588a(Canvas canvas) {
        Bitmap a = m137587a(getWidth(), getHeight());
        Drawable drawable = getResources().getDrawable(R.drawable.mj);
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        drawable.draw(canvas2);
        Paint paint = new Paint(1);
        paint.setStyle(Style.FILL);
        paint.setColor(-16711936);
        paint.setFilterBitmap(true);
        if (VERSION.SDK_INT < 19) {
            setLayerType(1, null);
        } else {
            setLayerType(2, paint);
        }
        canvas.drawBitmap(a, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        if (createBitmap != null && !createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        if (a != null && !a.isRecycled()) {
            a.recycle();
        }
    }

    public GoLiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private Bitmap m137587a(int i, int i2) {
        if (this.f112262b == null) {
            this.f112262b = new Path();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f112262b.lineTo(0.0f, (float) getHeight());
        this.f112262b.lineTo((float) (getWidth() - m137586a(10.0f)), (float) getHeight());
        this.f112262b.lineTo((float) getWidth(), (float) (getHeight() / 2));
        this.f112262b.lineTo((float) (getWidth() - m137586a(10.0f)), 0.0f);
        this.f112262b.lineTo(0.0f, 0.0f);
        this.f112262b.close();
        Paint paint = new Paint(1);
        paint.setColor(-16711936);
        canvas.drawPath(this.f112262b, paint);
        if (!C43127fh.m136806a(getContext())) {
            return createBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(createBitmap, 0, 0, getWidth(), getHeight(), matrix, true);
    }

    public GoLiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
