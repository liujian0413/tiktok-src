package com.facebook.react.flat;

import com.facebook.react.views.textinput.ReactTextInputManager;

public class RCTTextInputManager extends ReactTextInputManager {
    public Class<RCTTextInput> getShadowNodeClass() {
        return RCTTextInput.class;
    }

    public RCTTextInput createShadowNodeInstance() {
        return new RCTTextInput();
    }
}
