package com.facebook.react.bridge.queue;

import android.os.Build.VERSION;
import com.facebook.infer.p728a.C13854a;

public class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mLayoutThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mLayoutSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) C13854a.m40916b(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) C13854a.m40916b(this.mJSQueueSpec), (MessageQueueThreadSpec) C13854a.m40916b(this.mLayoutSpec));
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mJSQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            C13854a.m40915a(z, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setLayouthreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mLayoutSpec == null) {
                z = true;
            } else {
                z = false;
            }
            C13854a.m40915a(z, "Setting layout thread multiple times!");
            this.mLayoutSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mNativeModulesQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            C13854a.m40915a(z, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getLayoutThreadSpec() {
        return this.mLayoutThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec messageQueueThreadSpec;
        if (VERSION.SDK_INT < 21) {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", 2000000);
        } else {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).setLayouthreadSpec(MessageQueueThreadSpec.newLayoutThreadSpec("layout", 2000000)).build();
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2, MessageQueueThreadSpec messageQueueThreadSpec3) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
        this.mLayoutThreadSpec = messageQueueThreadSpec3;
    }
}
