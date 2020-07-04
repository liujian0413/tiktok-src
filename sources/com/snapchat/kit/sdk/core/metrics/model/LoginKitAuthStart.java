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

public final class LoginKitAuthStart extends Message<LoginKitAuthStart, Builder> {
    public static final ProtoAdapter<LoginKitAuthStart> ADAPTER = new ProtoAdapter_LoginKitAuthStart();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase#ADAPTER", tag = 1)
    public final LoginKitEventBase log_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<LoginKitAuthStart, Builder> {
        public LoginKitEventBase log_kit_event_base;

        public final LoginKitAuthStart build() {
            return new LoginKitAuthStart(this.log_kit_event_base, super.buildUnknownFields());
        }

        public final Builder log_kit_event_base(LoginKitEventBase loginKitEventBase) {
            this.log_kit_event_base = loginKitEventBase;
            return this;
        }
    }

    static final class ProtoAdapter_LoginKitAuthStart extends ProtoAdapter<LoginKitAuthStart> {
        public ProtoAdapter_LoginKitAuthStart() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitAuthStart.class);
        }

        public final int encodedSize(LoginKitAuthStart loginKitAuthStart) {
            return LoginKitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitAuthStart.log_kit_event_base) + loginKitAuthStart.unknownFields().size();
        }

        public final LoginKitAuthStart redact(LoginKitAuthStart loginKitAuthStart) {
            Builder newBuilder = loginKitAuthStart.newBuilder();
            if (newBuilder.log_kit_event_base != null) {
                newBuilder.log_kit_event_base = (LoginKitEventBase) LoginKitEventBase.ADAPTER.redact(newBuilder.log_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LoginKitAuthStart decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.log_kit_event_base((LoginKitEventBase) LoginKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LoginKitAuthStart loginKitAuthStart) throws IOException {
            LoginKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitAuthStart.log_kit_event_base);
            protoWriter.writeBytes(loginKitAuthStart.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.log_kit_event_base != null) {
            i = this.log_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.log_kit_event_base = this.log_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.log_kit_event_base != null) {
            sb.append(", log_kit_event_base=");
            sb.append(this.log_kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "LoginKitAuthStart{");
        replace.append('}');
        return replace.toString();
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase) {
        this(loginKitEventBase, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthStart)) {
            return false;
        }
        LoginKitAuthStart loginKitAuthStart = (LoginKitAuthStart) obj;
        if (!unknownFields().equals(loginKitAuthStart.unknownFields()) || !Internal.equals(this.log_kit_event_base, loginKitAuthStart.log_kit_event_base)) {
            return false;
        }
        return true;
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.log_kit_event_base = loginKitEventBase;
    }
}
