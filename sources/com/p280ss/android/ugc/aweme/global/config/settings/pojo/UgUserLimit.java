package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit */
public final class UgUserLimit extends Message<UgUserLimit, Builder> {
    public static final DefaultValueProtoAdapter<UgUserLimit> ADAPTER = new ProtoAdapter_UgUserLimit();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer active_days;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean show_for_active;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgUserLimit, Builder> {
        public Integer active_days;
        public Boolean show_for_active;

        public final UgUserLimit build() {
            return new UgUserLimit(this.active_days, this.show_for_active, super.buildUnknownFields());
        }

        public final Builder active_days(Integer num) {
            this.active_days = num;
            return this;
        }

        public final Builder show_for_active(Boolean bool) {
            this.show_for_active = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit$ProtoAdapter_UgUserLimit */
    static final class ProtoAdapter_UgUserLimit extends DefaultValueProtoAdapter<UgUserLimit> {
        public final UgUserLimit redact(UgUserLimit ugUserLimit) {
            return ugUserLimit;
        }

        public ProtoAdapter_UgUserLimit() {
            super(FieldEncoding.LENGTH_DELIMITED, UgUserLimit.class);
        }

        public final UgUserLimit decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgUserLimit) null);
        }

        public final int encodedSize(UgUserLimit ugUserLimit) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, ugUserLimit.active_days) + ProtoAdapter.BOOL.encodedSizeWithTag(2, ugUserLimit.show_for_active) + ugUserLimit.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgUserLimit ugUserLimit) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, ugUserLimit.active_days);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, ugUserLimit.show_for_active);
            protoWriter.writeBytes(ugUserLimit.unknownFields());
        }

        public final UgUserLimit decode(ProtoReader protoReader, UgUserLimit ugUserLimit) throws IOException {
            Builder builder;
            UgUserLimit ugUserLimit2 = (UgUserLimit) C10938a.m32097a().mo26425a(UgUserLimit.class, ugUserLimit);
            if (ugUserLimit2 != null) {
                builder = ugUserLimit2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.active_days((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.show_for_active((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugUserLimit2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getActiveDays() throws NullValueException {
        if (this.active_days != null) {
            return this.active_days;
        }
        throw new NullValueException();
    }

    public final Boolean getShowForActive() throws NullValueException {
        if (this.show_for_active != null) {
            return this.show_for_active;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.active_days = this.active_days;
        builder.show_for_active = this.show_for_active;
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
        if (this.active_days != null) {
            i = this.active_days.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.show_for_active != null) {
            i3 = this.show_for_active.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.active_days != null) {
            sb.append(", active_days=");
            sb.append(this.active_days);
        }
        if (this.show_for_active != null) {
            sb.append(", show_for_active=");
            sb.append(this.show_for_active);
        }
        StringBuilder replace = sb.replace(0, 2, "UgUserLimit{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgUserLimit)) {
            return false;
        }
        UgUserLimit ugUserLimit = (UgUserLimit) obj;
        if (!unknownFields().equals(ugUserLimit.unknownFields()) || !Internal.equals(this.active_days, ugUserLimit.active_days) || !Internal.equals(this.show_for_active, ugUserLimit.show_for_active)) {
            return false;
        }
        return true;
    }

    public UgUserLimit(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public UgUserLimit(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.active_days = num;
        this.show_for_active = bool;
    }
}
