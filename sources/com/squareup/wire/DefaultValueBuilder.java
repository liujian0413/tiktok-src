package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;

public class DefaultValueBuilder<M extends Message<M, B>, B extends Builder<M, B>> {
    private final B builder;

    public M build() {
        return this.builder.build();
    }

    public DefaultValueBuilder(B b) {
        this.builder = b;
    }

    public DefaultValueBuilder addDefaultSettingGroup(DefaultValueGroup<M, B> defaultValueGroup) {
        defaultValueGroup.addDefaultValues(this.builder);
        return this;
    }
}
