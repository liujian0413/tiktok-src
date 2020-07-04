package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.constraint.c */
public final class C0180c extends View {

    /* renamed from: a */
    private int f585a;

    /* renamed from: b */
    private View f586b;

    /* renamed from: c */
    private int f587c;

    public final View getContent() {
        return this.f586b;
    }

    public final int getEmptyVisibility() {
        return this.f587c;
    }

    public final void setEmptyVisibility(int i) {
        this.f587c = i;
    }

    /* renamed from: a */
    public final void mo437a(ConstraintLayout constraintLayout) {
        if (this.f585a == -1 && !isInEditMode()) {
            setVisibility(this.f587c);
        }
        this.f586b = constraintLayout.findViewById(this.f585a);
        if (this.f586b != null) {
            ((LayoutParams) this.f586b.getLayoutParams()).f454aa = true;
            this.f586b.setVisibility(0);
            setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo438b(ConstraintLayout constraintLayout) {
        if (this.f586b != null) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f586b.getLayoutParams();
            layoutParams2.f465al.f712ab = 0;
            layoutParams.f465al.mo545d(layoutParams2.f465al.mo556j());
            layoutParams.f465al.mo548e(layoutParams2.f465al.mo557k());
            layoutParams2.f465al.f712ab = 8;
        }
    }

    public final void setContentId(int i) {
        if (this.f585a != i) {
            if (this.f586b != null) {
                this.f586b.setVisibility(0);
                ((LayoutParams) this.f586b.getLayoutParams()).f454aa = false;
                this.f586b = null;
            }
            this.f585a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(NormalGiftView.ALPHA_255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }
}
