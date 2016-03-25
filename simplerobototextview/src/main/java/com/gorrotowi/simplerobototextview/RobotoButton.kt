package com.gorrotowi.simplerobototextview

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoButton : Button {
    constructor(context: Context) : super(context) {
        RobotoFontManager(context).initStyle(this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        if (!isInEditMode) {
            RobotoFontManager(context).initStyle(this, attrs)
        }
    }
}