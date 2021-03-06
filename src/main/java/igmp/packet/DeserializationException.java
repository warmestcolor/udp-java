/*
 * Copyright 2015-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package igmp.packet;

/**
 * Signals that an error occurred during deserialization of a packet.
 */
public class DeserializationException extends Exception {

    /**
     * Creates a new deserialization exception with the given message.
     *
     * @param message exception message
     */
    public DeserializationException(String message) {
        super(message);
    }
}
