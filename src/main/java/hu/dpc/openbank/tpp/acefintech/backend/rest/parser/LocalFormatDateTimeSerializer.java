/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */
package hu.dpc.openbank.tpp.acefintech.backend.rest.parser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import hu.dpc.openbank.tpp.acefintech.backend.util.DateUtils;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalFormatDateTimeSerializer extends StdSerializer<LocalDateTime> {

    public LocalFormatDateTimeSerializer() {
        super(LocalDateTime.class);
    }

    @Override
    public void serialize(final LocalDateTime value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeString(DateUtils.formatLocalFormatDateTime(value));
    }
}
