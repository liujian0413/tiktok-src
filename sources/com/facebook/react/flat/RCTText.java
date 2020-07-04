package com.facebook.react.flat;

import android.support.p022v4.p026d.C0713e;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.facebook.fbui.textlayoutbuilder.C13451a;
import com.facebook.fbui.textlayoutbuilder.C13456c;
import com.facebook.fbui.textlayoutbuilder.p699a.C13452a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.C14645b;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

final class RCTText extends RCTVirtualText implements YogaMeasureFunction {
    private static final C13456c sTextLayoutBuilder = new C13456c().mo32980c(false).mo32981d(true).mo32973a((C13451a) new C13452a());
    private int mAlignment;
    private DrawTextLayout mDrawCommand;
    private boolean mIncludeFontPadding = true;
    private int mNumberOfLines = Integer.MAX_VALUE;
    private float mSpacingAdd;
    private float mSpacingMult = 1.0f;
    private CharSequence mText;

    /* access modifiers changed from: 0000 */
    public final boolean doesDraw() {
        return true;
    }

    public final boolean isVirtual() {
        return false;
    }

    public final boolean isVirtualAnchor() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int getDefaultFontSize() {
        return fontSizeFromSp(14.0f);
    }

    public RCTText() {
        setMeasureFunction(this);
        getSpan().setFontSize(getDefaultFontSize());
    }

    public final Alignment getAlignment() {
        boolean z;
        if (getLayoutDirection() == YogaDirection.RTL) {
            z = true;
        } else {
            z = false;
        }
        int i = this.mAlignment;
        char c = 4;
        if (i == 3) {
            if (!z) {
                c = 3;
            }
            return Alignment.values()[c];
        } else if (i == 5) {
            if (z) {
                c = 3;
            }
            return Alignment.values()[c];
        } else if (i != 17) {
            return Alignment.ALIGN_NORMAL;
        } else {
            return Alignment.ALIGN_CENTER;
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyChanged(boolean z) {
        dirty();
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public final void setNumberOfLines(int i) {
        this.mNumberOfLines = i;
        notifyChanged(true);
    }

    @ReactProp(defaultDouble = Double.NaN, name = "lineHeight")
    public final void setLineHeight(double d) {
        if (Double.isNaN(d)) {
            this.mSpacingMult = 1.0f;
            this.mSpacingAdd = 0.0f;
        } else {
            this.mSpacingMult = 0.0f;
            this.mSpacingAdd = PixelUtil.toPixelFromSP((float) d);
        }
        notifyChanged(true);
    }

    @ReactProp(name = "textAlign")
    public final void setTextAlign(String str) {
        if (str == null || "auto".equals(str)) {
            this.mAlignment = 0;
        } else if ("left".equals(str)) {
            this.mAlignment = 3;
        } else if ("right".equals(str)) {
            this.mAlignment = 5;
        } else if ("center".equals(str)) {
            this.mAlignment = 17;
        } else {
            StringBuilder sb = new StringBuilder("Invalid textAlign: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        notifyChanged(false);
    }

    public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        boolean z;
        SpannableStringBuilder text = getText();
        if (TextUtils.isEmpty(text)) {
            this.mText = null;
            return C14645b.m42352a(0, 0);
        }
        this.mText = text;
        int ceil = (int) Math.ceil((double) f);
        TruncateAt truncateAt = TruncateAt.END;
        boolean z2 = this.mIncludeFontPadding;
        int i = this.mNumberOfLines;
        if (this.mNumberOfLines == 1) {
            z = true;
        } else {
            z = false;
        }
        Layout createTextLayout = createTextLayout(ceil, yogaMeasureMode, truncateAt, z2, i, z, text, getFontSize(), this.mSpacingAdd, this.mSpacingMult, getFontStyle(), getAlignment());
        if (this.mDrawCommand == null || this.mDrawCommand.isFrozen()) {
            this.mDrawCommand = new DrawTextLayout(createTextLayout);
        } else {
            this.mDrawCommand.setLayout(createTextLayout);
        }
        return C14645b.m42351a(this.mDrawCommand.getLayoutWidth(), this.mDrawCommand.getLayoutHeight());
    }

    /* access modifiers changed from: 0000 */
    public final void updateNodeRegion(float f, float f2, float f3, float f4, boolean z) {
        NodeRegion nodeRegion = getNodeRegion();
        if (this.mDrawCommand == null) {
            if (!nodeRegion.matches(f, f2, f3, f4, z)) {
                TextNodeRegion textNodeRegion = new TextNodeRegion(f, f2, f3, f4, getReactTag(), z, null);
                setNodeRegion(textNodeRegion);
            }
            return;
        }
        Layout layout = null;
        if (nodeRegion instanceof TextNodeRegion) {
            layout = ((TextNodeRegion) nodeRegion).getLayout();
        }
        Layout layout2 = layout;
        Layout layout3 = this.mDrawCommand.getLayout();
        if (!nodeRegion.matches(f, f2, f3, f4, z) || layout2 != layout3) {
            TextNodeRegion textNodeRegion2 = new TextNodeRegion(f, f2, f3, f4, getReactTag(), z, layout3);
            setNodeRegion(textNodeRegion2);
        }
    }

    /* access modifiers changed from: protected */
    public final void collectState(StateBuilder stateBuilder, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        boolean z;
        boolean z2;
        super.collectState(stateBuilder, f, f2, f3, f4, f5, f6, f7, f8);
        if (this.mText == null) {
            if (f4 - f2 > 0.0f && f3 - f > 0.0f) {
                SpannableStringBuilder text = getText();
                if (!TextUtils.isEmpty(text)) {
                    this.mText = text;
                }
            }
            if (this.mText == null) {
                return;
            }
        }
        if (this.mDrawCommand == null) {
            int ceil = (int) Math.ceil((double) (f3 - f));
            YogaMeasureMode yogaMeasureMode = YogaMeasureMode.EXACTLY;
            TruncateAt truncateAt = TruncateAt.END;
            boolean z3 = this.mIncludeFontPadding;
            int i = this.mNumberOfLines;
            if (this.mNumberOfLines == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            CharSequence charSequence = this.mText;
            int fontSize = getFontSize();
            float f9 = this.mSpacingAdd;
            this.mDrawCommand = new DrawTextLayout(createTextLayout(ceil, yogaMeasureMode, truncateAt, z3, i, z2, charSequence, fontSize, f9, this.mSpacingMult, getFontStyle(), getAlignment()));
            z = true;
        } else {
            z = false;
        }
        float padding = f + getPadding(0);
        float padding2 = f2 + getPadding(1);
        this.mDrawCommand = (DrawTextLayout) this.mDrawCommand.updateBoundsAndFreeze(padding, padding2, padding + this.mDrawCommand.getLayoutWidth(), padding2 + this.mDrawCommand.getLayoutHeight(), f5, f6, f7, f8);
        stateBuilder.addDrawCommand(this.mDrawCommand);
        if (z) {
            NodeRegion nodeRegion = getNodeRegion();
            if (nodeRegion instanceof TextNodeRegion) {
                ((TextNodeRegion) nodeRegion).setLayout(this.mDrawCommand.getLayout());
            }
        }
        performCollectAttachDetachListeners(stateBuilder);
    }

    private static Layout createTextLayout(int i, YogaMeasureMode yogaMeasureMode, TruncateAt truncateAt, boolean z, int i2, boolean z2, CharSequence charSequence, int i3, float f, float f2, int i4, Alignment alignment) {
        int i5;
        switch (yogaMeasureMode) {
            case UNDEFINED:
                i5 = 0;
                break;
            case EXACTLY:
                i5 = 1;
                break;
            case AT_MOST:
                i5 = 2;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unexpected size mode: ");
                sb.append(yogaMeasureMode);
                throw new IllegalStateException(sb.toString());
        }
        sTextLayoutBuilder.mo32972a(truncateAt).mo32979c(i2).mo32978b(z2).mo32974a(charSequence).mo32968a(i3).mo32969a(i, i5);
        sTextLayoutBuilder.mo32977b(i4);
        sTextLayoutBuilder.mo32970a(C0713e.f2705c);
        sTextLayoutBuilder.mo32975a(z);
        sTextLayoutBuilder.mo32967a(f);
        sTextLayoutBuilder.mo32976b(f2);
        sTextLayoutBuilder.mo32971a(alignment);
        Layout a = sTextLayoutBuilder.mo32966a();
        sTextLayoutBuilder.mo32974a((CharSequence) null);
        return a;
    }
}
