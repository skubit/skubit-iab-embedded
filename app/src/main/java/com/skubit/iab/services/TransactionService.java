/**
 * Copyright 2014 Skubit
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.skubit.iab.services;

import com.skubit.bitid.services.BaseService;
import com.skubit.iab.services.rest.TransactionRestService;

import android.content.Context;

public class TransactionService extends BaseService<TransactionRestService> {

    public TransactionService(String account, Context context) {
        super(account, context);
    }

    @Override
    public Class<TransactionRestService> getClazz() {
        return TransactionRestService.class;
    }

}