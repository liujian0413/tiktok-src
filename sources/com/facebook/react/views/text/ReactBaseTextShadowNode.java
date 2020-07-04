package com.facebook.react.views.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaDirection;
import java.util.ArrayList;
import java.util.List;

public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    protected boolean mAllowFontScaling = true;
    protected int mBackgroundColor;
    protected int mColor;
    protected boolean mContainsImages;
    protected String mFontFamily;
    protected int mFontSize = -1;
    protected float mFontSizeInput = -1.0f;
    protected int mFontStyle;
    protected int mFontWeight;
    protected float mHeightOfTallestInlineImage;
    protected boolean mIncludeFontPadding;
    protected boolean mIsBackgroundColorSet;
    protected boolean mIsColorSet;
    protected boolean mIsLineThroughTextDecorationSet;
    protected boolean mIsUnderlineTextDecorationSet;
    protected float mLetterSpacing = Float.NaN;
    protected float mLetterSpacingInput = Float.NaN;
    protected float mLineHeight = Float.NaN;
    protected float mLineHeightInput = -1.0f;
    protected int mNumberOfLines = -1;
    protected int mTextAlign;
    protected int mTextBreakStrategy;
    protected int mTextShadowColor;
    protected float mTextShadowOffsetDx;
    protected float mTextShadowOffsetDy;
    protected float mTextShadowRadius;

    static class SetSpanOperation {
        protected int end;
        protected int start;
        protected Object what;

        public void execute(SpannableStringBuilder spannableStringBuilder, int i) {
            int i2;
            if (this.start == 0) {
                i2 = 18;
            } else {
                i2 = 34;
            }
            spannableStringBuilder.setSpan(this.what, this.start, this.end, ((i << 16) & 16711680) | (i2 & -16711681));
        }

        SetSpanOperation(int i, int i2, Object obj) {
            this.start = i;
            this.end = i2;
            this.what = obj;
        }
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    public float getEffectiveLineHeight() {
        boolean z;
        if (Float.isNaN(this.mLineHeight) || Float.isNaN(this.mHeightOfTallestInlineImage) || this.mHeightOfTallestInlineImage <= this.mLineHeight) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.mHeightOfTallestInlineImage;
        }
        return this.mLineHeight;
    }

    public ReactBaseTextShadowNode() {
        int i;
        if (VERSION.SDK_INT < 23) {
            i = 0;
        } else {
            i = 1;
        }
        this.mTextBreakStrategy = i;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 1.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
            markUpdated();
        }
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.mAllowFontScaling) {
            this.mAllowFontScaling = z;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
            setLetterSpacing(this.mLetterSpacingInput);
            markUpdated();
        }
    }

    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        boolean z;
        if (!isVirtualAnchor()) {
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            this.mIsBackgroundColorSet = z;
            if (this.mIsBackgroundColorSet) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = "color")
    public void setColor(Integer num) {
        boolean z;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsColorSet = z;
        if (this.mIsColorSet) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else if ("normal".equals(str)) {
            i = 0;
        } else {
            i = -1;
        }
        if (i != this.mFontStyle) {
            this.mFontStyle = i;
            markUpdated();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        float f2;
        this.mLetterSpacingInput = f;
        if (this.mAllowFontScaling) {
            f2 = PixelUtil.toPixelFromSP(this.mLetterSpacingInput);
        } else {
            f2 = PixelUtil.toPixelFromDIP(this.mLetterSpacingInput);
        }
        this.mLetterSpacing = f2;
        markUpdated();
    }

    @ReactProp(defaultFloat = -1.0f, name = "lineHeight")
    public void setLineHeight(float f) {
        float f2;
        this.mLineHeightInput = f;
        if (f == -1.0f) {
            f2 = Float.NaN;
        } else if (this.mAllowFontScaling) {
            f2 = PixelUtil.toPixelFromSP(f);
        } else {
            f2 = PixelUtil.toPixelFromDIP(f);
        }
        this.mLineHeight = f2;
        markUpdated();
    }

    private static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    @ReactProp(defaultFloat = -1.0f, name = "fontSize")
    public void setFontSize(float f) {
        this.mFontSizeInput = f;
        if (f != -1.0f) {
            if (this.mAllowFontScaling) {
                f = (float) Math.ceil((double) PixelUtil.toPixelFromSP(f));
            } else {
                f = (float) Math.ceil((double) PixelUtil.toPixelFromDIP(f));
            }
        }
        this.mFontSize = (int) f;
        markUpdated();
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(String str) {
        int i;
        int i2 = -1;
        if (str != null) {
            i = parseNumericFontWeight(str);
        } else {
            i = -1;
        }
        if (i >= 500 || "bold".equals(str)) {
            i2 = 1;
        } else if ("normal".equals(str) || (i != -1 && i < 500)) {
            i2 = 0;
        }
        if (i2 != this.mFontWeight) {
            this.mFontWeight = i2;
            markUpdated();
        }
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(String str) {
        if (str == null || "auto".equals(str)) {
            this.mTextAlign = 0;
        } else if ("left".equals(str)) {
            this.mTextAlign = 3;
        } else if ("right".equals(str)) {
            this.mTextAlign = 5;
        } else if ("center".equals(str)) {
            this.mTextAlign = 1;
        } else if ("justify".equals(str)) {
            this.mTextAlign = 3;
        } else {
            StringBuilder sb = new StringBuilder("Invalid textAlign: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        markUpdated();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (VERSION.SDK_INT >= 23) {
            if (str == null || "highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
            } else if ("simple".equals(str)) {
                this.mTextBreakStrategy = 0;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
            } else {
                StringBuilder sb = new StringBuilder("Invalid textBreakStrategy: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            markUpdated();
        }
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    public ReactBaseTextShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode) {
        int i;
        super(reactBaseTextShadowNode);
        if (VERSION.SDK_INT < 23) {
            i = 0;
        } else {
            i = 1;
        }
        this.mTextBreakStrategy = i;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 1.0f;
        this.mTextShadowColor = 1426063360;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mContainsImages = false;
        this.mHeightOfTallestInlineImage = Float.NaN;
        this.mLineHeight = reactBaseTextShadowNode.mLineHeight;
        this.mIsColorSet = reactBaseTextShadowNode.mIsColorSet;
        this.mAllowFontScaling = reactBaseTextShadowNode.mAllowFontScaling;
        this.mColor = reactBaseTextShadowNode.mColor;
        this.mIsBackgroundColorSet = reactBaseTextShadowNode.mIsBackgroundColorSet;
        this.mBackgroundColor = reactBaseTextShadowNode.mBackgroundColor;
        this.mNumberOfLines = reactBaseTextShadowNode.mNumberOfLines;
        this.mFontSize = reactBaseTextShadowNode.mFontSize;
        this.mFontSizeInput = reactBaseTextShadowNode.mFontSizeInput;
        this.mLineHeightInput = reactBaseTextShadowNode.mLineHeightInput;
        this.mTextAlign = reactBaseTextShadowNode.mTextAlign;
        this.mTextBreakStrategy = reactBaseTextShadowNode.mTextBreakStrategy;
        this.mTextShadowOffsetDx = reactBaseTextShadowNode.mTextShadowOffsetDx;
        this.mTextShadowOffsetDy = reactBaseTextShadowNode.mTextShadowOffsetDy;
        this.mTextShadowRadius = reactBaseTextShadowNode.mTextShadowRadius;
        this.mTextShadowColor = reactBaseTextShadowNode.mTextShadowColor;
        this.mIsUnderlineTextDecorationSet = reactBaseTextShadowNode.mIsUnderlineTextDecorationSet;
        this.mIsLineThroughTextDecorationSet = reactBaseTextShadowNode.mIsLineThroughTextDecorationSet;
        this.mIncludeFontPadding = reactBaseTextShadowNode.mIncludeFontPadding;
        this.mFontStyle = reactBaseTextShadowNode.mFontStyle;
        this.mFontWeight = reactBaseTextShadowNode.mFontWeight;
        this.mFontFamily = reactBaseTextShadowNode.mFontFamily;
        this.mContainsImages = reactBaseTextShadowNode.mContainsImages;
        this.mHeightOfTallestInlineImage = reactBaseTextShadowNode.mHeightOfTallestInlineImage;
    }

    protected static Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, String str) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<SetSpanOperation> arrayList = new ArrayList<>();
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList);
        if (str != null) {
            spannableStringBuilder.append(str);
        }
        int i2 = 0;
        if (reactBaseTextShadowNode.mFontSize == -1) {
            if (reactBaseTextShadowNode.mAllowFontScaling) {
                i = (int) Math.ceil((double) PixelUtil.toPixelFromSP(14.0f));
            } else {
                i = (int) Math.ceil((double) PixelUtil.toPixelFromDIP(14.0f));
            }
            arrayList.add(new SetSpanOperation(0, spannableStringBuilder.length(), new AbsoluteSizeSpan(i)));
        }
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mHeightOfTallestInlineImage = Float.NaN;
        for (SetSpanOperation setSpanOperation : arrayList) {
            if (setSpanOperation.what instanceof TextInlineImageSpan) {
                int height = ((TextInlineImageSpan) setSpanOperation.what).getHeight();
                reactBaseTextShadowNode.mContainsImages = true;
                if (Float.isNaN(reactBaseTextShadowNode.mHeightOfTallestInlineImage) || ((float) height) > reactBaseTextShadowNode.mHeightOfTallestInlineImage) {
                    reactBaseTextShadowNode.mHeightOfTallestInlineImage = (float) height;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i2);
            i2++;
        }
        return spannableStringBuilder;
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list) {
        int length = spannableStringBuilder.length();
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i);
            if (childAt instanceof ReactRawTextShadowNode) {
                ReactRawTextShadowNode reactRawTextShadowNode = (ReactRawTextShadowNode) childAt;
                if (reactRawTextShadowNode.getText() != null) {
                    spannableStringBuilder.append(reactRawTextShadowNode.getText());
                }
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list);
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
            } else {
                StringBuilder sb = new StringBuilder("Unexpected view type nested under text node: ");
                sb.append(childAt.getClass());
                throw new IllegalViewOperationException(sb.toString());
            }
            childAt.markUpdateSeen();
        }
        int length2 = spannableStringBuilder.length();
        if (length2 >= length) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(length, length2, new ForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(length, length2, new BackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            if (VERSION.SDK_INT >= 21 && reactBaseTextShadowNode.mLetterSpacing != Float.NaN) {
                list.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(reactBaseTextShadowNode.mLetterSpacing)));
            }
            if (reactBaseTextShadowNode.mFontSize != -1) {
                list.add(new SetSpanOperation(length, length2, new AbsoluteSizeSpan(reactBaseTextShadowNode.mFontSize)));
            }
            if (!(reactBaseTextShadowNode.mFontStyle == -1 && reactBaseTextShadowNode.mFontWeight == -1 && reactBaseTextShadowNode.mFontFamily == null)) {
                list.add(new SetSpanOperation(length, length2, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(length, length2, new UnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(length, length2, new StrikethroughSpan()));
            }
            if (!(reactBaseTextShadowNode.mTextShadowOffsetDx == 0.0f && reactBaseTextShadowNode.mTextShadowOffsetDy == 0.0f)) {
                list.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            if (!Float.isNaN(reactBaseTextShadowNode.getEffectiveLineHeight())) {
                list.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(reactBaseTextShadowNode.getEffectiveLineHeight())));
            }
            list.add(new SetSpanOperation(length, length2, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }
}
