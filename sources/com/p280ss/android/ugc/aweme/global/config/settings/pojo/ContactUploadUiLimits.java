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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContactUploadUiLimits */
public final class ContactUploadUiLimits extends Message<ContactUploadUiLimits, Builder> {
    public static final DefaultValueProtoAdapter<ContactUploadUiLimits> ADAPTER = new ProtoAdapter_ContactUploadUiLimits();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer max_close_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer max_display_times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContactUploadUiLimits$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ContactUploadUiLimits, Builder> {
        public Integer max_close_times;
        public Integer max_display_times;

        public final ContactUploadUiLimits build() {
            return new ContactUploadUiLimits(this.max_close_times, this.max_display_times, super.buildUnknownFields());
        }

        public final Builder max_close_times(Integer num) {
            this.max_close_times = num;
            return this;
        }

        public final Builder max_display_times(Integer num) {
            this.max_display_times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContactUploadUiLimits$ProtoAdapter_ContactUploadUiLimits */
    static final class ProtoAdapter_ContactUploadUiLimits extends DefaultValueProtoAdapter<ContactUploadUiLimits> {
        public final ContactUploadUiLimits redact(ContactUploadUiLimits contactUploadUiLimits) {
            return contactUploadUiLimits;
        }

        public ProtoAdapter_ContactUploadUiLimits() {
            super(FieldEncoding.LENGTH_DELIMITED, ContactUploadUiLimits.class);
        }

        public final ContactUploadUiLimits decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ContactUploadUiLimits) null);
        }

        public final int encodedSize(ContactUploadUiLimits contactUploadUiLimits) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, contactUploadUiLimits.max_close_times) + ProtoAdapter.INT32.encodedSizeWithTag(2, contactUploadUiLimits.max_display_times) + contactUploadUiLimits.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ContactUploadUiLimits contactUploadUiLimits) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, contactUploadUiLimits.max_close_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, contactUploadUiLimits.max_display_times);
            protoWriter.writeBytes(contactUploadUiLimits.unknownFields());
        }

        public final ContactUploadUiLimits decode(ProtoReader protoReader, ContactUploadUiLimits contactUploadUiLimits) throws IOException {
            Builder builder;
            ContactUploadUiLimits contactUploadUiLimits2 = (ContactUploadUiLimits) C10938a.m32097a().mo26425a(ContactUploadUiLimits.class, contactUploadUiLimits);
            if (contactUploadUiLimits2 != null) {
                builder = contactUploadUiLimits2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.max_close_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.max_display_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (contactUploadUiLimits2 != null) {
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

    public final Integer getMaxCloseTimes() throws NullValueException {
        if (this.max_close_times != null) {
            return this.max_close_times;
        }
        throw new NullValueException();
    }

    public final Integer getMaxDisplayTimes() throws NullValueException {
        if (this.max_display_times != null) {
            return this.max_display_times;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.max_close_times = this.max_close_times;
        builder.max_display_times = this.max_display_times;
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
        if (this.max_close_times != null) {
            i = this.max_close_times.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.max_display_times != null) {
            i3 = this.max_display_times.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.max_close_times != null) {
            sb.append(", max_close_times=");
            sb.append(this.max_close_times);
        }
        if (this.max_display_times != null) {
            sb.append(", max_display_times=");
            sb.append(this.max_display_times);
        }
        StringBuilder replace = sb.replace(0, 2, "ContactUploadUiLimits{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactUploadUiLimits)) {
            return false;
        }
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) obj;
        if (!unknownFields().equals(contactUploadUiLimits.unknownFields()) || !Internal.equals(this.max_close_times, contactUploadUiLimits.max_close_times) || !Internal.equals(this.max_display_times, contactUploadUiLimits.max_display_times)) {
            return false;
        }
        return true;
    }

    public ContactUploadUiLimits(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public ContactUploadUiLimits(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.max_close_times = num;
        this.max_display_times = num2;
    }
}
