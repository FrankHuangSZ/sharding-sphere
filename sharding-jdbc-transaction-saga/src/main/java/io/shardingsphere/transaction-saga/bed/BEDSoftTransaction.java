/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.transaction.bed;

import io.shardingsphere.transaction.api.AbstractSoftTransaction;
import io.shardingsphere.transaction.constants.SoftTransactionType;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Best efforts delivery B.A.S.E transaction.
 * 
 * @author zhangliang
 */
public class BEDSoftTransaction extends AbstractSoftTransaction {
    
    /**
     * Begin transaction.
     * 
     * @param connection database connection
     * @throws SQLException SQL exception
     */
    public void begin(final Connection connection) throws SQLException {
        beginInternal(connection, SoftTransactionType.BestEffortsDelivery);
    }
}