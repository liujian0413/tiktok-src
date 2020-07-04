package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreativeKitShareComplete extends Message<CreativeKitShareComplete, Builder> {
    public static final ProtoAdapter<CreativeKitShareComplete> ADAPTER = new ProtoAdapter_CreativeKitShareComplete();
    public static final Boolean DEFAULT_IS_SUCCESS = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase#ADAPTER", tag = 1)
    public final CreativeKitEventBase creative_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_success;

    public static final class Builder extends com.squareup.wire.Message.Builder<CreativeKitShareComplete, Builder> {
        public CreativeKitEventBase creative_kit_event_base;
        public Boolean is_success;

        public final CreativeKitShareComplete build() {
            return new CreativeKitShareComplete(this.creative_kit_event_base, this.is_success, super.buildUnknownFields());
        }

        public final Builder creative_kit_event_base(CreativeKitEventBase creativeKitEventBase) {
            this.creative_kit_event_base = creativeKitEventBase;
            return this;
        }

        public final Builder is_success(Boolean bool) {
            this.is_success = bool;
            return this;
        }
    }

    static final class ProtoAdapter_CreativeKitShareComplete extends ProtoAdapter<CreativeKitShareComplete> {
        public ProtoAdapter_CreativeKitShareComplete() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitShareComplete.class);
        }

        public final int encodedSize(CreativeKitShareComplete creativeKitShareComplete) {
            return CreativeKitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitShareComplete.creative_kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, creativeKitShareComplete.is_success) + creativeKitShareComplete.unknownFields().size();
        }

        public final CreativeKitShareComplete redact(CreativeKitShareComplete creativeKitShareComplete) {
            Builder newBuilder = creativeKitShareComplete.newBuilder();
            if (newBuilder.creative_kit_event_base != null) {
                newBuilder.creative_kit_event_base = (CreativeKitEventBase) CreativeKitEventBase.ADAPTER.redact(newBuilder.creative_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CreativeKitShareComplete decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.creative_kit_event_base((CreativeKitEventBase) CreativeKitEventBase.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.is_success((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreativeKitShareComplete creativeKitShareComplete) throws IOException {
            CreativeKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitShareComplete.creative_kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, creativeKitShareComplete.is_success);
            protoWriter.writeBytes(creativeKitShareComplete.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_event_base = this.creative_kit_event_base;
        builder.is_success = this.is_success;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.creative_kit_event_base != null) {
            i = this.creative_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.is_success != null) {
            i3 = this.is_success.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_event_base != null) {
            sb.append(", creative_kit_event_base=");
            sb.append(this.creative_kit_event_base);
        }
        if (this.is_success != null) {
            sb.append(", is_success=");
            sb.append(this.is_success);
        }
        StringBuilder replace = sb.replace(0, 2, "CreativeKitShareComplete{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitShareComplete)) {
            return false;
        }
        CreativeKitShareComplete creativeKitShareComplete = (CreativeKitShareComplete) obj;
        if (!unknownFields().equals(creativeKitShareComplete.unknownFields()) || !Internal.equals(this.creative_kit_event_base, creativeKitShareComplete.creative_kit_event_base) || !Internal.equals(this.is_success, creativeKitShareComplete.is_success)) {
            return false;
        }
        return true;
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool) {
        this(creativeKitEventBase, bool, ByteString.EMPTY);
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.creative_kit_event_base = creativeKitEventBase;
        this.is_success = bool;
    }
}
