/**
# Copyright 2018 - Transcodium Ltd.
#  All rights reserved. This program and the accompanying materials
#  are made available under the terms of the  Apache License v2.0 which accompanies this distribution.
#
#  The Apache License v2.0 is available at
#  http://www.opensource.org/licenses/apache2.0.php
#
#  You are required to redistribute this code under the same licenses.
#
#  Project TNSMoney
#  @author Razak Zakari <razak@transcodium.com>
#  https://transcodium.com
#  created_at 09/08/2018
 **/

package com.transcodium.tnsmoney.classes

class StatusCodes {

    companion object {
        const val SUCCESS     = 200
        const val FAILED      = 300
        const val NEUTRAL     = 400
        const val EMAIL_LOGIN_DATA_NULL = 500
        const val MISSING_APP_KEY = 600
        const val DATA_DECRYTION_FAILED = 700
        const val DATA_ENCRYPTION_FAILED = 800
        val APP_KEY_DECRYPTION_FAILED = 900
    }
}