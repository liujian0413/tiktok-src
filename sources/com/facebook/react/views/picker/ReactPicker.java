package com.facebook.react.views.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public class ReactPicker extends Spinner {
    private int mMode;
    public OnSelectListener mOnSelectListener;
    private Integer mPrimaryColor;
    private Integer mStagedSelection;
    public boolean mSuppressNextEvent;
    private final Runnable measureAndLayout = new Runnable() {
        public void run() {
            ReactPicker.this.measure(MeasureSpec.makeMeasureSpec(ReactPicker.this.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(ReactPicker.this.getHeight(), 1073741824));
            ReactPicker.this.layout(ReactPicker.this.getLeft(), ReactPicker.this.getTop(), ReactPicker.this.getRight(), ReactPicker.this.getBottom());
        }
    };

    public interface OnSelectListener {
        void onItemSelected(int i);
    }

    public int getMode() {
        return this.mMode;
    }

    public OnSelectListener getOnSelectListener() {
        return this.mOnSelectListener;
    }

    public Integer getPrimaryColor() {
        return this.mPrimaryColor;
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public void updateStagedSelection() {
        if (this.mStagedSelection != null) {
            setSelectionWithSuppressEvent(this.mStagedSelection.intValue());
            this.mStagedSelection = null;
        }
    }

    public void setPrimaryColor(Integer num) {
        this.mPrimaryColor = num;
    }

    public void setStagedSelection(int i) {
        this.mStagedSelection = Integer.valueOf(i);
    }

    public ReactPicker(Context context) {
        super(context);
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            this.mSuppressNextEvent = true;
            setSelection(i);
        }
    }

    public void setOnSelectListener(OnSelectListener onSelectListener) {
        if (getOnItemSelectedListener() == null) {
            this.mSuppressNextEvent = true;
            setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onNothingSelected(AdapterView<?> adapterView) {
                    if (!ReactPicker.this.mSuppressNextEvent && ReactPicker.this.mOnSelectListener != null) {
                        ReactPicker.this.mOnSelectListener.onItemSelected(-1);
                    }
                    ReactPicker.this.mSuppressNextEvent = false;
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (!ReactPicker.this.mSuppressNextEvent && ReactPicker.this.mOnSelectListener != null) {
                        ReactPicker.this.mOnSelectListener.onItemSelected(i);
                    }
                    ReactPicker.this.mSuppressNextEvent = false;
                }
            });
        }
        this.mOnSelectListener = onSelectListener;
    }

    public ReactPicker(Context context, int i) {
        super(context, i);
        this.mMode = i;
    }

    public ReactPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReactPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReactPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMode = i2;
    }
}
