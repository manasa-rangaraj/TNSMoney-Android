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
#  created_at 21/08/2018
 **/

package com.transcodium.tnsmoney

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import com.transcodium.tnsmoney.classes.Anim

open class RootActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        Anim(this).slideWindow(
                Gravity.START,
                Gravity.END
        )

        super.onCreate(savedInstanceState, persistentState)
    }
}