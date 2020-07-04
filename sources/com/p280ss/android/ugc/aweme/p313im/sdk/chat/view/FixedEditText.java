package com.p280ss.android.ugc.aweme.p313im.sdk.chat.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.FixedEditText */
public class FixedEditText extends MentionEditText {

    /* renamed from: c */
    private OnKeyListener f81165c;

    public static String getManufacturer() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    public FixedEditText(Context context) {
        super(context);
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f81165c = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public ActionMode startActionMode(Callback callback) {
        return super.startActionMode(callback);
    }

    public boolean onTextContextMenuItem(int i) {
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (onTextContextMenuItem && getText().length() <= 1024) {
            C27608b.m90502a((TextView) this);
        }
        return onTextContextMenuItem;
    }

    public FixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.f81165c != null) {
            return this.f81165c.onKey(this, i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public ActionMode startActionMode(Callback callback, int i) {
        return super.startActionMode(callback, i);
    }

    public FixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
