package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.CustomStyleSpan;
import com.facebook.react.views.text.ReactTagSpan;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.TextInlineImageSpan;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.util.ArrayList;
import java.util.Iterator;

public class ReactEditText extends EditText {
    public static final KeyListener sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    private Boolean mBlurOnSubmit = null;
    private boolean mContainsImages;
    private ContentSizeWatcher mContentSizeWatcher;
    private int mDefaultGravityHorizontal = (getGravity() & 8388615);
    private int mDefaultGravityVertical = (getGravity() & 112);
    private boolean mDetectScrollMovement;
    private boolean mDisableFullscreen = false;
    private final InputMethodManager mInputMethodManager = ((InputMethodManager) C13854a.m40916b(getContext().getSystemService("input_method")));
    private boolean mIsJSSettingFocus = false;
    public boolean mIsSettingTextFromJS = false;
    private final InternalKeyListener mKeyListener = new InternalKeyListener();
    private float mLetterSpacingPt;
    public ArrayList<TextWatcher> mListeners = null;
    private int mMostRecentEventCount = 0;
    private int mNativeEventCount = 0;
    private ReactViewBackgroundManager mReactBackgroundManager = new ReactViewBackgroundManager(this);
    private String mReturnKeyType;
    private ScrollWatcher mScrollWatcher = null;
    private SelectionWatcher mSelectionWatcher;
    private int mStagedInputType = getInputType();
    private TextWatcherDelegator mTextWatcherDelegator = null;

    static class InternalKeyListener implements KeyListener {
        private int mInputType;

        public int getInputType() {
            return this.mInputType;
        }

        public void setInputType(int i) {
            this.mInputType = i;
        }

        public void clearMetaKeyState(View view, Editable editable, int i) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i);
        }

        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i, keyEvent);
        }

        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i, keyEvent);
        }
    }

    class TextWatcherDelegator implements TextWatcher {
        private TextWatcherDelegator() {
        }

        public void afterTextChanged(Editable editable) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText.this.onContentSizeChange();
        }
    }

    /* access modifiers changed from: 0000 */
    public void clearFocusFromJS() {
        clearFocus();
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    /* access modifiers changed from: 0000 */
    public int getStagedInputType() {
        return this.mStagedInputType;
    }

    public boolean isLayoutRequested() {
        return false;
    }

    private boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    public int incrementAndGetEventCounter() {
        int i = this.mNativeEventCount + 1;
        this.mNativeEventCount = i;
        return i;
    }

    private TextWatcherDelegator getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new TextWatcherDelegator();
        }
        return this.mTextWatcherDelegator;
    }

    private void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private boolean isMultiline() {
        if ((getInputType() & 131072) != 0) {
            return true;
        }
        return false;
    }

    private boolean isSecureText() {
        if ((getInputType() & 144) != 0) {
            return true;
        }
        return false;
    }

    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    public void onContentSizeChange() {
        if (this.mContentSizeWatcher != null) {
            this.mContentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    public void requestFocusFromJS() {
        this.mIsJSSettingFocus = true;
        requestFocus();
        this.mIsJSSettingFocus = false;
    }

    private void setIntrinsicContentSize() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new ReactTextInputLocalData(this));
    }

    /* access modifiers changed from: 0000 */
    public void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            setSelection(selectionStart, selectionEnd);
        }
    }

    public boolean getBlurOnSubmit() {
        if (this.mBlurOnSubmit != null) {
            return this.mBlurOnSubmit.booleanValue();
        }
        if (isMultiline()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateLetterSpacing() {
        if (VERSION.SDK_INT >= 21) {
            setLetterSpacing(PixelUtil.toPixelFromSP(this.mLetterSpacingPt) / getTextSize());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan onAttachedToWindow : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                onAttachedToWindow.onAttachedToWindow();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan onDetachedFromWindow : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                onDetachedFromWindow.onDetachedFromWindow();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan onFinishTemporaryDetach : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                onFinishTemporaryDetach.onFinishTemporaryDetach();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan onStartTemporaryDetach : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                onStartTemporaryDetach.onStartTemporaryDetach();
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateImeOptions() {
        /*
            r9 = this;
            java.lang.String r0 = r9.mReturnKeyType
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 5
            r5 = 2
            r6 = 6
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r9.mReturnKeyType
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L_0x0051;
                case -906336856: goto L_0x0047;
                case 3304: goto L_0x003d;
                case 3089282: goto L_0x0033;
                case 3377907: goto L_0x0029;
                case 3387192: goto L_0x001f;
                case 3526536: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x005b
        L_0x0015:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 5
            goto L_0x005c
        L_0x001f:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 2
            goto L_0x005c
        L_0x0029:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x0033:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 6
            goto L_0x005c
        L_0x003d:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 0
            goto L_0x005c
        L_0x0047:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 4
            goto L_0x005c
        L_0x0051:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005b
            r0 = 3
            goto L_0x005c
        L_0x005b:
            r0 = -1
        L_0x005c:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0066;
                case 2: goto L_0x0064;
                case 3: goto L_0x0062;
                case 4: goto L_0x0060;
                case 5: goto L_0x006b;
                case 6: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x006a
        L_0x0060:
            r1 = 3
            goto L_0x006b
        L_0x0062:
            r1 = 7
            goto L_0x006b
        L_0x0064:
            r1 = 1
            goto L_0x006b
        L_0x0066:
            r1 = 5
            goto L_0x006b
        L_0x0068:
            r1 = 2
            goto L_0x006b
        L_0x006a:
            r1 = 6
        L_0x006b:
            boolean r0 = r9.mDisableFullscreen
            if (r0 == 0) goto L_0x0076
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            return
        L_0x0076:
            r9.setImeOptions(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactEditText.updateImeOptions():void");
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.mBlurOnSubmit = bool;
    }

    public void setContentSizeWatcher(ContentSizeWatcher contentSizeWatcher) {
        this.mContentSizeWatcher = contentSizeWatcher;
    }

    public void setScrollWatcher(ScrollWatcher scrollWatcher) {
        this.mScrollWatcher = scrollWatcher;
    }

    public void setSelectionWatcher(SelectionWatcher selectionWatcher) {
        this.mSelectionWatcher = selectionWatcher;
    }

    /* access modifiers changed from: 0000 */
    public void setStagedInputType(int i) {
        this.mStagedInputType = i;
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public void setBorderStyle(String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public void setDisableFullscreenUI(boolean z) {
        this.mDisableFullscreen = z;
        updateImeOptions();
    }

    public void setLetterSpacingPt(float f) {
        this.mLetterSpacingPt = f;
        updateLetterSpacing();
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        updateLetterSpacing();
    }

    /* access modifiers changed from: 0000 */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners != null) {
            this.mListeners.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.mStagedInputType = i;
        super.setTypeface(typeface);
        this.mKeyListener.setInputType(i);
        setKeyListener(this.mKeyListener);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan drawable2 : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (drawable2.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            onCreateInputConnection = new ReactEditTextInputConnectionWrapper(onCreateInputConnection, reactContext, this);
        }
        if (isMultiline() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan drawable2 : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (drawable2.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public ReactEditText(Context context) {
        super(context);
        setFocusableInTouchMode(false);
    }

    public void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if (!isSecureText() || !TextUtils.equals(getText(), reactTextUpdate.getText())) {
            this.mMostRecentEventCount = reactTextUpdate.getJsEventCounter();
            if (this.mMostRecentEventCount >= this.mNativeEventCount) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
                manageSpans(spannableStringBuilder);
                this.mContainsImages = reactTextUpdate.containsImages();
                this.mIsSettingTextFromJS = true;
                getText().replace(0, length(), spannableStringBuilder);
                this.mIsSettingTextFromJS = false;
                if (VERSION.SDK_INT >= 23 && getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                    setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.mDetectScrollMovement) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.mDetectScrollMovement = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (ForegroundColorSpan.class.isInstance(spans[i]) || BackgroundColorSpan.class.isInstance(spans[i]) || AbsoluteSizeSpan.class.isInstance(spans[i]) || CustomStyleSpan.class.isInstance(spans[i]) || ReactTagSpan.class.isInstance(spans[i])) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    public void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }

    public void setSelection(int i, int i2) {
        if (this.mMostRecentEventCount >= this.mNativeEventCount) {
            super.setSelection(i, i2);
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        updateLetterSpacing();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || isMultiline()) {
            return super.onKeyUp(i, keyEvent);
        }
        hideSoftKeyboard();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.mSelectionWatcher != null && hasFocus()) {
            this.mSelectionWatcher.onSelectionChanged(i, i2);
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.mIsJSSettingFocus) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        showSoftKeyboard();
        return requestFocus;
    }

    public void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z && this.mSelectionWatcher != null) {
            this.mSelectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mScrollWatcher != null) {
            this.mScrollWatcher.onScrollChanged(i, i2, i3, i4);
        }
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onContentSizeChange();
    }
}
