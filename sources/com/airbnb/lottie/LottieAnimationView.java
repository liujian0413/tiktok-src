package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p029v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View.BaseSavedState;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.C1819g;
import com.airbnb.lottie.p057e.C1755c;
import java.io.StringReader;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a */
    public static final CacheStrategy f6084a = CacheStrategy.Weak;

    /* renamed from: b */
    private static final String f6085b = LottieAnimationView.class.getSimpleName();

    /* renamed from: c */
    private final C1781j<C1757f> f6086c = new C1781j<C1757f>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo7127a(C1757f fVar) {
            LottieAnimationView.this.setComposition(fVar);
        }
    };

    /* renamed from: d */
    private final C1781j<Throwable> f6087d = new C1781j<Throwable>() {
        /* renamed from: a */
        private static void m8087a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo7127a(Object obj) {
            m8087a((Throwable) obj);
        }
    };

    /* renamed from: e */
    private final C1767h f6088e = new C1767h();

    /* renamed from: f */
    private CacheStrategy f6089f;

    /* renamed from: g */
    private String f6090g;

    /* renamed from: h */
    private int f6091h;

    /* renamed from: i */
    private boolean f6092i = false;

    /* renamed from: j */
    private boolean f6093j = false;

    /* renamed from: k */
    private boolean f6094k = false;

    /* renamed from: l */
    private C1784m f6095l;

    /* renamed from: m */
    private C1757f f6096m;

    public enum CacheStrategy {
        None,
        Weak,
        Strong
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m8094a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m8093a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m8093a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m8094a(i);
            }
        };

        /* renamed from: a */
        String f6103a;

        /* renamed from: b */
        int f6104b;

        /* renamed from: c */
        float f6105c;

        /* renamed from: d */
        boolean f6106d;

        /* renamed from: e */
        String f6107e;

        /* renamed from: f */
        int f6108f;

        /* renamed from: g */
        int f6109g;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6103a = parcel.readString();
            this.f6105c = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f6106d = z;
            this.f6107e = parcel.readString();
            this.f6108f = parcel.readInt();
            this.f6109g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6103a);
            parcel.writeFloat(this.f6105c);
            parcel.writeInt(this.f6106d ? 1 : 0);
            parcel.writeString(this.f6107e);
            parcel.writeInt(this.f6108f);
            parcel.writeInt(this.f6109g);
        }
    }

    public C1757f getComposition() {
        return this.f6096m;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f6094k;
    }

    /* renamed from: d */
    public final void mo7083d() {
        this.f6088e.mo7253i();
    }

    /* renamed from: e */
    public final boolean mo7084e() {
        return this.f6088e.mo7260m();
    }

    public int getFrame() {
        return this.f6088e.mo7257j();
    }

    public String getImageAssetsFolder() {
        return this.f6088e.f6359d;
    }

    public float getMaxFrame() {
        return this.f6088e.mo7247g();
    }

    public float getMinFrame() {
        return this.f6088e.mo7246f();
    }

    public C1838o getPerformanceTracker() {
        return this.f6088e.mo7231b();
    }

    public float getProgress() {
        return this.f6088e.mo7264q();
    }

    public int getRepeatCount() {
        return this.f6088e.mo7259l();
    }

    public int getRepeatMode() {
        return this.f6088e.mo7258k();
    }

    public float getScale() {
        return this.f6088e.f6358c;
    }

    public float getSpeed() {
        return this.f6088e.mo7252h();
    }

    /* renamed from: i */
    private void m8070i() {
        this.f6096m = null;
        this.f6088e.mo7236c();
    }

    /* renamed from: b */
    public final void mo7078b() {
        this.f6088e.mo7239d();
        m8071j();
    }

    /* renamed from: c */
    public final void mo7081c() {
        this.f6088e.mo7243e();
        m8071j();
    }

    /* renamed from: f */
    public final void mo7085f() {
        this.f6088e.mo7262o();
        m8071j();
    }

    /* renamed from: g */
    public final void mo7086g() {
        this.f6088e.mo7263p();
        m8071j();
    }

    public long getDuration() {
        if (this.f6096m != null) {
            return (long) this.f6096m.mo7208a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6093j && this.f6092i) {
            mo7078b();
        }
    }

    /* renamed from: h */
    private void m8069h() {
        if (this.f6095l != null) {
            this.f6095l.mo7280b(this.f6086c);
            this.f6095l.mo7282d(this.f6087d);
        }
    }

    /* renamed from: j */
    private void m8071j() {
        boolean z;
        int i = 1;
        if (!this.f6094k || !this.f6088e.mo7260m()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 2;
        }
        setLayerType(i, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo7084e()) {
            mo7085f();
            this.f6092i = true;
        }
        C1752e.m8375a(this);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6103a = this.f6090g;
        savedState.f6104b = this.f6091h;
        savedState.f6105c = this.f6088e.mo7264q();
        savedState.f6106d = this.f6088e.mo7260m();
        savedState.f6107e = this.f6088e.f6359d;
        savedState.f6108f = this.f6088e.mo7258k();
        savedState.f6109g = this.f6088e.mo7259l();
        return savedState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7074a() {
        if (this.f6088e != null) {
            this.f6088e.mo7221a();
        }
    }

    /* renamed from: b */
    public final void mo7079b(AnimatorListener animatorListener) {
        this.f6088e.mo7234b(animatorListener);
    }

    public void setAnimation(JsonReader jsonReader) {
        m8066a(jsonReader, (String) null);
    }

    public void setAnimationFromJson(String str) {
        m8068a(str, (String) null);
    }

    public void setFontAssetDelegate(C1704b bVar) {
        this.f6088e.mo7226a(bVar);
    }

    public void setFrame(int i) {
        this.f6088e.mo7238c(i);
    }

    public void setImageAssetDelegate(C1707c cVar) {
        this.f6088e.mo7227a(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f6088e.f6359d = str;
    }

    public void setImageDrawable(Drawable drawable) {
        m8064a(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.f6088e.mo7233b(i);
    }

    public void setMaxProgress(float f) {
        this.f6088e.mo7232b(f);
    }

    public void setMinFrame(int i) {
        this.f6088e.mo7223a(i);
    }

    public void setMinProgress(float f) {
        this.f6088e.mo7222a(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f6088e.mo7235b(z);
    }

    public void setProgress(float f) {
        this.f6088e.mo7240d(f);
    }

    public void setRepeatCount(int i) {
        this.f6088e.mo7245e(i);
    }

    public void setRepeatMode(int i) {
        this.f6088e.mo7241d(i);
    }

    public void setSpeed(float f) {
        this.f6088e.mo7237c(f);
    }

    public void setTextDelegate(C1841q qVar) {
        this.f6088e.f6361f = qVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        C1752e.m8375a(this);
        m8069h();
        super.setImageBitmap(bitmap);
    }

    public void setImageResource(int i) {
        C1752e.m8375a(this);
        m8069h();
        super.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo7080b(boolean z) {
        if (this.f6094k != z) {
            this.f6094k = z;
            m8071j();
        }
    }

    /* renamed from: c */
    public final void mo7082c(boolean z) {
        int i;
        C1767h hVar = this.f6088e;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        hVar.mo7245e(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == this.f6088e) {
            super.invalidateDrawable(this.f6088e);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimationFromUrl(String str) {
        m8070i();
        m8069h();
        this.f6095l = C1761g.m8398a(getContext(), str).mo7275a(this.f6086c).mo7281c(this.f6087d);
    }

    public void setScale(float f) {
        this.f6088e.mo7244e(f);
        if (getDrawable() == this.f6088e) {
            m8064a((Drawable) null, false);
            m8064a((Drawable) this.f6088e, false);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m8065a((AttributeSet) null);
    }

    public void setAnimation(final int i) {
        this.f6091h = i;
        this.f6090g = null;
        C1757f a = C1819g.m8529a().mo7314a(i);
        if (a != null) {
            setComposition(a);
            return;
        }
        m8070i();
        m8069h();
        this.f6095l = C1761g.m8397a(getContext(), i).mo7275a((C1781j<T>) new C1781j<C1757f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo7127a(C1757f fVar) {
                C1819g.m8529a().mo7316a(i, fVar);
            }
        }).mo7275a(this.f6086c).mo7281c(this.f6087d);
    }

    public void setComposition(C1757f fVar) {
        this.f6088e.setCallback(this);
        this.f6096m = fVar;
        boolean a = this.f6088e.mo7230a(fVar);
        m8071j();
        if (getDrawable() != this.f6088e || a) {
            setImageDrawable(null);
            setImageDrawable(this.f6088e);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6090g = savedState.f6103a;
        if (!TextUtils.isEmpty(this.f6090g)) {
            setAnimation(this.f6090g);
        }
        this.f6091h = savedState.f6104b;
        if (this.f6091h != 0) {
            setAnimation(this.f6091h);
        }
        setProgress(savedState.f6105c);
        if (savedState.f6106d) {
            mo7078b();
        }
        this.f6088e.f6359d = savedState.f6107e;
        setRepeatMode(savedState.f6108f);
        setRepeatCount(savedState.f6109g);
    }

    public void setAnimation(final String str) {
        this.f6090g = str;
        this.f6091h = 0;
        C1757f a = C1819g.m8529a().mo7315a(str);
        if (a != null) {
            setComposition(a);
            return;
        }
        m8070i();
        m8069h();
        this.f6095l = C1761g.m8406c(getContext(), str).mo7275a((C1781j<T>) new C1781j<C1757f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo7127a(C1757f fVar) {
                C1819g.m8529a().mo7317a(str, fVar);
            }
        }).mo7275a(this.f6086c).mo7281c(this.f6087d);
    }

    /* renamed from: a */
    private void m8065a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView);
        this.f6089f = CacheStrategy.values()[obtainStyledAttributes.getInt(1, f6084a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(4);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(12);
                if (string2 != null) {
                    setAnimationFromUrl(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f6092i = true;
            this.f6093j = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f6088e.mo7245e(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        mo7077a(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            C1840p pVar = new C1840p(obtainStyledAttributes.getColor(2, 0));
            m8067a(new C1817e("**"), C1782k.f6423x, new C1755c(pVar));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f6088e.mo7244e(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m8071j();
    }

    /* renamed from: a */
    public final void mo7076a(AnimatorListener animatorListener) {
        this.f6088e.mo7225a(animatorListener);
    }

    /* renamed from: a */
    public final void mo7077a(boolean z) {
        this.f6088e.mo7229a(z);
    }

    /* renamed from: a */
    private void m8064a(Drawable drawable, boolean z) {
        if (z && drawable != this.f6088e) {
            C1752e.m8375a(this);
        }
        m8069h();
        super.setImageDrawable(drawable);
    }

    /* renamed from: a */
    private void m8066a(JsonReader jsonReader, String str) {
        m8070i();
        m8069h();
        this.f6095l = C1761g.m8399a(jsonReader, str).mo7275a(this.f6086c).mo7281c(this.f6087d);
    }

    /* renamed from: a */
    private void m8068a(String str, String str2) {
        m8066a(new JsonReader(new StringReader(str)), (String) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8065a(attributeSet);
    }

    /* renamed from: a */
    public final void mo7075a(int i, int i2) {
        this.f6088e.mo7224a(i, i2);
    }

    /* renamed from: a */
    private <T> void m8067a(C1817e eVar, T t, C1755c<T> cVar) {
        this.f6088e.mo7228a(eVar, t, cVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8065a(attributeSet);
    }
}
