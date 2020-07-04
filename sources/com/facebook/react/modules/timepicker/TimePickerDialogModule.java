package com.facebook.react.modules.timepicker;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.widget.TimePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "TimePickerAndroid")
public class TimePickerDialogModule extends ReactContextBaseJavaModule {

    class TimePickerDialogListener implements OnTimeSetListener, OnDismissListener {
        private final Promise mPromise;
        private boolean mPromiseResolved;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mPromiseResolved && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }

        public TimePickerDialogListener(Promise promise) {
            this.mPromise = promise;
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.mPromiseResolved && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "timeSetAction");
                writableNativeMap.putInt("hour", i);
                writableNativeMap.putInt("minute", i2);
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }
    }

    public String getName() {
        return "TimePickerAndroid";
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("hour") && !readableMap.isNull("hour")) {
            bundle.putInt("hour", readableMap.getInt("hour"));
        }
        if (readableMap.hasKey("minute") && !readableMap.isNull("minute")) {
            bundle.putInt("minute", readableMap.getInt("minute"));
        }
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundle.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else if (currentActivity instanceof FragmentActivity) {
            C0608j supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) supportFragmentManager.mo2644a("TimePickerAndroid");
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            SupportTimePickerDialogFragment supportTimePickerDialogFragment = new SupportTimePickerDialogFragment();
            if (readableMap != null) {
                supportTimePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
            }
            TimePickerDialogListener timePickerDialogListener = new TimePickerDialogListener(promise);
            supportTimePickerDialogFragment.setOnDismissListener(timePickerDialogListener);
            supportTimePickerDialogFragment.setOnTimeSetListener(timePickerDialogListener);
            supportTimePickerDialogFragment.show(supportFragmentManager, "TimePickerAndroid");
        } else {
            FragmentManager fragmentManager = currentActivity.getFragmentManager();
            android.app.DialogFragment dialogFragment2 = (android.app.DialogFragment) fragmentManager.findFragmentByTag("TimePickerAndroid");
            if (dialogFragment2 != null) {
                dialogFragment2.dismiss();
            }
            TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
            if (readableMap != null) {
                timePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
            }
            TimePickerDialogListener timePickerDialogListener2 = new TimePickerDialogListener(promise);
            timePickerDialogFragment.setOnDismissListener(timePickerDialogListener2);
            timePickerDialogFragment.setOnTimeSetListener(timePickerDialogListener2);
            timePickerDialogFragment.show(fragmentManager, "TimePickerAndroid");
        }
    }
}
