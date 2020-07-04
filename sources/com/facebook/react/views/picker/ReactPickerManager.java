package com.facebook.react.views.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.picker.ReactPicker.OnSelectListener;
import com.facebook.react.views.picker.events.PickerItemSelectEvent;

public abstract class ReactPickerManager extends SimpleViewManager<ReactPicker> {

    static class PickerEventEmitter implements OnSelectListener {
        private final EventDispatcher mEventDispatcher;
        private final ReactPicker mReactPicker;

        public void onItemSelected(int i) {
            this.mEventDispatcher.dispatchEvent(new PickerItemSelectEvent(this.mReactPicker.getId(), i));
        }

        public PickerEventEmitter(ReactPicker reactPicker, EventDispatcher eventDispatcher) {
            this.mReactPicker = reactPicker;
            this.mEventDispatcher = eventDispatcher;
        }
    }

    static class ReactPickerAdapter extends ArrayAdapter<ReadableMap> {
        private final LayoutInflater mInflater;
        private Integer mPrimaryTextColor;

        public void setPrimaryTextColor(Integer num) {
            this.mPrimaryTextColor = num;
            notifyDataSetChanged();
        }

        public ReactPickerAdapter(Context context, ReadableMap[] readableMapArr) {
            super(context, 0, readableMapArr);
            this.mInflater = (LayoutInflater) C13854a.m40916b(context.getSystemService("layout_inflater"));
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, true);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, false);
        }

        private View getView(int i, View view, ViewGroup viewGroup, boolean z) {
            int i2;
            ReadableMap readableMap = (ReadableMap) getItem(i);
            if (view == null) {
                if (z) {
                    i2 = 17367049;
                } else {
                    i2 = 17367048;
                }
                view = this.mInflater.inflate(i2, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(readableMap.getString("label"));
            if (!z && this.mPrimaryTextColor != null) {
                textView.setTextColor(this.mPrimaryTextColor.intValue());
            } else if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                textView.setTextColor(readableMap.getInt("color"));
            }
            return view;
        }
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ReactPicker reactPicker) {
        super.onAfterUpdateTransaction(reactPicker);
        reactPicker.updateStagedSelection();
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactPicker reactPicker, boolean z) {
        reactPicker.setEnabled(z);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(ReactPicker reactPicker, String str) {
        reactPicker.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(ReactPicker reactPicker, int i) {
        reactPicker.setStagedSelection(i);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ReactPicker reactPicker, Integer num) {
        reactPicker.setPrimaryColor(num);
        ReactPickerAdapter reactPickerAdapter = (ReactPickerAdapter) reactPicker.getAdapter();
        if (reactPickerAdapter != null) {
            reactPickerAdapter.setPrimaryTextColor(num);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactPicker reactPicker) {
        reactPicker.setOnSelectListener(new PickerEventEmitter(reactPicker, ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @ReactProp(name = "items")
    public void setItems(ReactPicker reactPicker, ReadableArray readableArray) {
        if (readableArray != null) {
            ReadableMap[] readableMapArr = new ReadableMap[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                readableMapArr[i] = readableArray.getMap(i);
            }
            ReactPickerAdapter reactPickerAdapter = new ReactPickerAdapter(reactPicker.getContext(), readableMapArr);
            reactPickerAdapter.setPrimaryTextColor(reactPicker.getPrimaryColor());
            reactPicker.setAdapter(reactPickerAdapter);
            return;
        }
        reactPicker.setAdapter(null);
    }
}
