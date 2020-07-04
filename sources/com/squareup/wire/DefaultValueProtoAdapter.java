package com.squareup.wire;

import java.io.IOException;

public abstract class DefaultValueProtoAdapter<E> extends ProtoAdapter<E> {
    public abstract E decode(ProtoReader protoReader, E e) throws IOException;

    public DefaultValueProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        super(fieldEncoding, cls);
    }
}
