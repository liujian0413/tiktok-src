package com.facebook.react.uimanager;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.RadioButton;

class AccessibilityHelper {
    private static final AccessibilityDelegate BUTTON_DELEGATE = new AccessibilityDelegate() {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(Button.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    };
    private static final AccessibilityDelegate RADIOBUTTON_CHECKED_DELEGATE = new AccessibilityDelegate() {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(true);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    };
    private static final AccessibilityDelegate RADIOBUTTON_UNCHECKED_DELEGATE = new AccessibilityDelegate() {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(false);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(false);
        }
    };

    AccessibilityHelper() {
    }

    public static void sendAccessibilityEvent(View view, int i) {
        view.sendAccessibilityEvent(i);
    }

    public static void updateAccessibilityComponentType(View view, String str) {
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251 && str.equals("radiobutton_checked")) {
                    c = 1;
                }
            } else if (str.equals("radiobutton_unchecked")) {
                c = 2;
            }
        } else if (str.equals("button")) {
            c = 0;
        }
        switch (c) {
            case 0:
                view.setAccessibilityDelegate(BUTTON_DELEGATE);
                return;
            case 1:
                view.setAccessibilityDelegate(RADIOBUTTON_CHECKED_DELEGATE);
                return;
            case 2:
                view.setAccessibilityDelegate(RADIOBUTTON_UNCHECKED_DELEGATE);
                return;
            default:
                view.setAccessibilityDelegate(null);
                return;
        }
    }
}
