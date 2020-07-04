package android.support.design.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.chip.ChipDrawable.C0257a;
import android.support.design.p015a.C0241h;
import android.support.design.p019e.C0273b;
import android.support.design.p020f.C0276a;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0945c.C0946a;
import android.support.p022v4.widget.ExploreByTouchHelper;
import android.support.p029v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements C0257a {

    /* renamed from: a */
    public static final Rect f959a = new Rect();

    /* renamed from: c */
    private static final int[] f960c = {16842913};

    /* renamed from: b */
    public ChipDrawable f961b;

    /* renamed from: d */
    private RippleDrawable f962d;

    /* renamed from: e */
    private OnClickListener f963e;

    /* renamed from: f */
    private OnCheckedChangeListener f964f;

    /* renamed from: g */
    private boolean f965g;

    /* renamed from: h */
    private int f966h;

    /* renamed from: i */
    private boolean f967i;

    /* renamed from: j */
    private boolean f968j;

    /* renamed from: k */
    private boolean f969k;

    /* renamed from: l */
    private final C0256a f970l;

    /* renamed from: m */
    private final Rect f971m;

    /* renamed from: n */
    private final RectF f972n;

    /* renamed from: o */
    private final C0701a f973o;

    /* renamed from: android.support.design.chip.Chip$a */
    class C0256a extends ExploreByTouchHelper {

        /* renamed from: a */
        final /* synthetic */ Chip f974a;

        /* renamed from: a */
        public final void mo923a(C0945c cVar) {
            boolean z;
            if (this.f974a.f961b == null || !this.f974a.f961b.f1024p) {
                z = false;
            } else {
                z = true;
            }
            cVar.mo3650a(z);
            cVar.mo3656b((CharSequence) Chip.class.getName());
            CharSequence text = this.f974a.getText();
            if (VERSION.SDK_INT >= 23) {
                cVar.mo3664c(text);
            } else {
                cVar.mo3669d(text);
            }
        }

        /* renamed from: a */
        public final void mo924a(List<Integer> list) {
            if (this.f974a.mo788c()) {
                list.add(Integer.valueOf(0));
            }
        }

        /* renamed from: a */
        public final int mo921a(float f, float f2) {
            if (!this.f974a.mo788c() || !this.f974a.getCloseIconTouchBounds().contains(f, f2)) {
                return -1;
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo922a(int i, C0945c cVar) {
            if (this.f974a.mo788c()) {
                CharSequence closeIconContentDescription = this.f974a.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo3669d(closeIconContentDescription);
                } else {
                    CharSequence text = this.f974a.getText();
                    Context context = this.f974a.getContext();
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = "";
                    }
                    objArr[0] = text;
                    cVar.mo3669d((CharSequence) context.getString(R.string.cal, objArr).trim());
                }
                cVar.mo3653b(this.f974a.getCloseIconTouchBoundsInt());
                cVar.mo3646a(C0946a.f3311e);
                cVar.mo3685j(this.f974a.isEnabled());
                return;
            }
            cVar.mo3669d((CharSequence) "");
            cVar.mo3653b(Chip.f959a);
        }

        /* renamed from: a */
        public final boolean mo925a(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return this.f974a.mo787b();
            }
            return false;
        }
    }

    public Drawable getChipDrawable() {
        return this.f961b;
    }

    public CharSequence getChipText() {
        return getText();
    }

    /* renamed from: e */
    private void m922e() {
        if (this.f966h == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    private C0273b getTextAppearance() {
        if (this.f961b != null) {
            return this.f961b.f1016h;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo786a() {
        m921d();
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* renamed from: c */
    public final boolean mo788c() {
        if (this.f961b == null || this.f961b.mo952d() == null) {
            return false;
        }
        return true;
    }

    public Drawable getCheckedIcon() {
        if (this.f961b != null) {
            return this.f961b.f1026r;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        if (this.f961b != null) {
            return this.f961b.f1001a;
        }
        return null;
    }

    public float getChipCornerRadius() {
        if (this.f961b != null) {
            return this.f961b.f1011c;
        }
        return 0.0f;
    }

    public float getChipEndPadding() {
        if (this.f961b != null) {
            return this.f961b.f977B;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        if (this.f961b != null) {
            return this.f961b.mo946c();
        }
        return null;
    }

    public float getChipIconSize() {
        if (this.f961b != null) {
            return this.f961b.f1019k;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        if (this.f961b != null) {
            return this.f961b.f1018j;
        }
        return null;
    }

    public float getChipMinHeight() {
        if (this.f961b != null) {
            return this.f961b.f1010b;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        if (this.f961b != null) {
            return this.f961b.f1029u;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        if (this.f961b != null) {
            return this.f961b.f1012d;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        if (this.f961b != null) {
            return this.f961b.f1013e;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        if (this.f961b != null) {
            return this.f961b.mo952d();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        if (this.f961b != null) {
            return this.f961b.f1023o;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        if (this.f961b != null) {
            return this.f961b.f976A;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        if (this.f961b != null) {
            return this.f961b.f1022n;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        if (this.f961b != null) {
            return this.f961b.f1034z;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        if (this.f961b != null) {
            return this.f961b.f1021m;
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        if (this.f961b != null) {
            return this.f961b.f981F;
        }
        return null;
    }

    public C0241h getHideMotionSpec() {
        if (this.f961b != null) {
            return this.f961b.f1028t;
        }
        return null;
    }

    public float getIconEndPadding() {
        if (this.f961b != null) {
            return this.f961b.f1031w;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        if (this.f961b != null) {
            return this.f961b.f1030v;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        if (this.f961b != null) {
            return this.f961b.f1014f;
        }
        return null;
    }

    public C0241h getShowMotionSpec() {
        if (this.f961b != null) {
            return this.f961b.f1027s;
        }
        return null;
    }

    public CharSequence getText() {
        if (this.f961b != null) {
            return this.f961b.f1015g;
        }
        return "";
    }

    public float getTextEndPadding() {
        if (this.f961b != null) {
            return this.f961b.f1033y;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        if (this.f961b != null) {
            return this.f961b.f1032x;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final boolean mo787b() {
        boolean z;
        playSoundEffect(0);
        if (this.f963e != null) {
            this.f963e.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.f970l.mo3914a(0, 1);
        return z;
    }

    public RectF getCloseIconTouchBounds() {
        this.f972n.setEmpty();
        if (mo788c()) {
            this.f961b.mo932a(this.f972n);
        }
        return this.f972n;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f971m.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f971m;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        if (this.f961b == null || !this.f961b.mo945b()) {
            z = false;
        } else {
            z = this.f961b.mo938a(m923f());
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    private int[] m923f() {
        int i;
        int i2 = 0;
        if (isEnabled()) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f969k) {
            i++;
        }
        if (this.f968j) {
            i++;
        }
        if (this.f967i) {
            i++;
        }
        if (isChecked()) {
            i++;
        }
        int[] iArr = new int[i];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.f969k) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.f968j) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.f967i) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    /* renamed from: d */
    private void m921d() {
        if (!TextUtils.isEmpty(getText()) && this.f961b != null) {
            float f = this.f961b.f1029u + this.f961b.f977B + this.f961b.f1032x + this.f961b.f1033y;
            if ((this.f961b.f1017i && this.f961b.mo946c() != null) || (this.f961b.f1026r != null && this.f961b.f1025q && isChecked())) {
                f += this.f961b.f1030v + this.f961b.f1031w + this.f961b.f1019k;
            }
            if (this.f961b.f1020l && this.f961b.mo952d() != null) {
                f += this.f961b.f1034z + this.f961b.f976A + this.f961b.f1022n;
            }
            if (((float) C0991u.m4232l(this)) != f) {
                C0991u.m4202b(this, C0991u.m4229k(this), getPaddingTop(), (int) f, getPaddingBottom());
            }
        }
    }

    /* renamed from: b */
    private void m919b(ChipDrawable chipDrawable) {
        chipDrawable.mo934a((C0257a) this);
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f964f = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f963e = onClickListener;
    }

    /* renamed from: a */
    private static void m915a(ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.mo934a((C0257a) null);
        }
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    private void setCloseIconFocused(boolean z) {
        if (this.f969k != z) {
            this.f969k = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f968j != z) {
            this.f968j = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f967i != z) {
            this.f967i = z;
            refreshDrawableState();
        }
    }

    public void getFocusedRect(Rect rect) {
        if (this.f966h == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public void setCheckable(boolean z) {
        if (this.f961b != null) {
            this.f961b.mo956d(z);
        }
    }

    public void setCheckableResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo991p(i);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.f961b != null) {
            this.f961b.mo950c(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo993r(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        if (this.f961b != null) {
            this.f961b.mo992q(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.f961b != null) {
            this.f961b.mo931a(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo930a(i);
        }
    }

    public void setChipCornerRadius(float f) {
        if (this.f961b != null) {
            this.f961b.mo939b(f);
        }
    }

    public void setChipCornerRadiusResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo948c(i);
        }
    }

    public void setChipEndPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo984m(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo927B(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        if (this.f961b != null) {
            this.f961b.mo933a(drawable);
        }
    }

    public void setChipIconResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo975i(i);
        }
    }

    public void setChipIconSize(float f) {
        if (this.f961b != null) {
            this.f961b.mo953d(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo981k(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        if (this.f961b != null) {
            this.f961b.mo955d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo979j(i);
        }
    }

    public void setChipIconVisible(int i) {
        if (this.f961b != null) {
            this.f961b.mo973h(i);
        }
    }

    public void setChipMinHeight(float f) {
        if (this.f961b != null) {
            this.f961b.mo929a(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo940b(i);
        }
    }

    public void setChipStartPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo962f(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1002u(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.f961b != null) {
            this.f961b.mo941b(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo954d(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        if (this.f961b != null) {
            this.f961b.mo947c(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo959e(i);
        }
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        if (this.f961b != null) {
            this.f961b.mo942b(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.f961b != null) {
            this.f961b.mo943b(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo982l(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo926A(i);
        }
    }

    public void setCloseIconResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo985m(i);
        }
    }

    public void setCloseIconSize(float f) {
        if (this.f961b != null) {
            this.f961b.mo958e(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo987o(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo980k(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1008z(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.f961b != null) {
            this.f961b.mo960e(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo986n(i);
        }
    }

    public void setCloseIconVisible(int i) {
        if (this.f961b != null) {
            this.f961b.mo983l(i);
        }
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0241h hVar) {
        if (this.f961b != null) {
            this.f961b.f1028t = hVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1001t(i);
        }
    }

    public void setIconEndPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo972h(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1005w(i);
        }
    }

    public void setIconStartPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo964g(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1004v(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        if (this.f961b != null) {
            this.f961b.f983H = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f961b != null) {
            this.f961b.mo949c(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo963f(i);
        }
    }

    public void setShowMotionSpec(C0241h hVar) {
        if (this.f961b != null) {
            this.f961b.f1027s = hVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo994s(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setTextEndPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo978j(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1007y(i);
        }
    }

    public void setTextStartPadding(float f) {
        if (this.f961b != null) {
            this.f961b.mo974i(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo1006x(i);
        }
    }

    /* renamed from: a */
    private void m916a(C0273b bVar) {
        TextPaint paint = getPaint();
        paint.drawableState = this.f961b.getState();
        bVar.mo1050a(getContext(), paint, this.f973o);
    }

    /* renamed from: c */
    private float m920c(ChipDrawable chipDrawable) {
        float chipStartPadding = getChipStartPadding() + chipDrawable.mo928a() + getTextStartPadding();
        if (C0991u.m4220h(this) == 0) {
            return chipStartPadding;
        }
        return -chipStartPadding;
    }

    private void setFocusedVirtualView(int i) {
        if (this.f966h != i) {
            if (this.f966h == 0) {
                setCloseIconFocused(false);
            }
            this.f966h = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (m917a(motionEvent) || this.f970l.mo3916a(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f970l.mo3915a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f960c);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.f961b || drawable == this.f962d) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.f961b || drawable == this.f962d) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setChecked(boolean z) {
        if (this.f961b == null) {
            this.f965g = z;
            return;
        }
        if (this.f961b.f1024p) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (!(isChecked == z || this.f964f == null)) {
                this.f964f.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIconVisible(boolean z) {
        if (this.f961b != null) {
            this.f961b.mo961e(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        if (this.f961b != null) {
            this.f961b.mo944b(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        if (this.f961b != null) {
            this.f961b.mo951c(z);
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f961b != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                if (this.f961b != null) {
                    this.f961b.f981F = truncateAt;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setTextAppearanceResource(int i) {
        if (this.f961b != null) {
            this.f961b.mo965g(i);
        }
        setTextAppearance(getContext(), i);
    }

    /* renamed from: a */
    private boolean m918a(boolean z) {
        m922e();
        if (z) {
            if (this.f966h == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.f966h == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (TextUtils.isEmpty(getText()) || this.f961b == null || this.f961b.f982G) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate(m920c(this.f961b), 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        if (this.f961b != chipDrawable) {
            m915a(this.f961b);
            this.f961b = chipDrawable;
            m919b(this.f961b);
            if (C0276a.f1078a) {
                this.f962d = new RippleDrawable(C0276a.m1088a(this.f961b.f1014f), this.f961b, null);
                this.f961b.mo937a(false);
                C0991u.m4185a((View) this, (Drawable) this.f962d);
                return;
            }
            this.f961b.mo937a(true);
            C0991u.m4185a((View) this, (Drawable) this.f961b);
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        if (this.f961b != null) {
            this.f961b.mo965g(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo1052b(getContext(), getPaint(), this.f973o);
            m916a(getTextAppearance());
        }
    }

    /* renamed from: a */
    private boolean m917a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = ExploreByTouchHelper.class.getDeclaredField("e");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f970l)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = ExploreByTouchHelper.class.getDeclaredMethod("a", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f970l, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        setCloseIconPressed(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (super.onTouchEvent(r5) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            android.graphics.RectF r1 = r4.getCloseIconTouchBounds()
            float r2 = r5.getX()
            float r3 = r5.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0024;
                case 2: goto L_0x001a;
                case 3: goto L_0x002d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0039
        L_0x001a:
            boolean r0 = r4.f967i
            if (r0 == 0) goto L_0x0039
            if (r1 != 0) goto L_0x0037
            r4.setCloseIconPressed(r2)
            goto L_0x0037
        L_0x0024:
            boolean r0 = r4.f967i
            if (r0 == 0) goto L_0x002d
            r4.mo787b()
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r4.setCloseIconPressed(r2)
            goto L_0x003a
        L_0x0032:
            if (r1 == 0) goto L_0x0039
            r4.setCloseIconPressed(r3)
        L_0x0037:
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 != 0) goto L_0x0044
            boolean r5 = super.onTouchEvent(r5)
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            return r2
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTextAppearance(C0273b bVar) {
        if (this.f961b != null) {
            this.f961b.mo935a(bVar);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo1052b(getContext(), getPaint(), this.f973o);
            m916a(bVar);
        }
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f961b != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence a = C0705a.m2998a().mo2850a(charSequence);
            if (this.f961b.f982G) {
                a = null;
            }
            super.setText(a, bufferType);
            if (this.f961b != null) {
                this.f961b.mo936a(charSequence);
            }
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f961b != null) {
            this.f961b.mo965g(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo1052b(context, getPaint(), this.f973o);
            m916a(getTextAppearance());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x003f
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006b
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006b
            boolean r0 = android.support.design.internal.C0297c.m1178a(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.m918a(r0)
            goto L_0x006b
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006b
            boolean r0 = android.support.design.internal.C0297c.m1178a(r6)
            boolean r2 = r6.m918a(r0)
            goto L_0x006b
        L_0x0031:
            int r0 = r6.f966h
            switch(r0) {
                case -1: goto L_0x003b;
                case 0: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x006b
        L_0x0037:
            r6.mo787b()
            return r3
        L_0x003b:
            r6.performClick()
            return r3
        L_0x003f:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0047
            r0 = 2
            goto L_0x0050
        L_0x0047:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x006b
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0057:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0065
            if (r4 == r6) goto L_0x0065
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0057
        L_0x0065:
            if (r4 == 0) goto L_0x006b
            r4.requestFocus()
            return r3
        L_0x006b:
            if (r2 == 0) goto L_0x0071
            r6.invalidate()
            return r3
        L_0x0071:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        this.f970l.mo3913a(z, i, rect);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }
}
